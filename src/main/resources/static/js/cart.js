//原-------------------------------------
$(document).ready(function () {
	// 全选        
	$(".allselect").click(function () {
		$(".gwc_tb2 input[name=newslist]").each(function () {
			$(this).attr("checked", true);
		});
		GetCount();
	});

	//反选
	$("#invert").click(function () {
		$(".gwc_tb2 input[name=newslist]").each(function () {
			if ($(this).attr("checked")) {
				$(this).attr("checked", false);

			} else {
				$(this).attr("checked", true);

			} 
		});
		GetCount();
	});
	//取消
	$("#cancel").click(function () {
		$(".gwc_tb2 input[name=newslist]").each(function () {
			$(this).attr("checked", false);

		});
		GetCount();
	});

	// 所有复选(:checkbox)框点击事件
	// $(".gwc_tb2 input[name=newslist]").click(function () {
	// 	if ($(this).attr("checked")) {
    //
	// 	} else {
    //
	// 	}
	// });
    $(".gwc_tb2 input[name=newslist]").click(function () {
        var length=$("#cart").find("table").length ;
        var totalprice=0;
        var count=0;
        for(var i=1;i<length-1;i++){
            if($("#newslist"+i).prop('checked')){
                count=count+1;
                var number=$("#text_box"+i).val();
                var price=$("#total"+i).html().trim();
                var onetotalprice=number*price;
                totalprice=totalprice+onetotalprice;
            }
        }
        console.log("当前总数量:"+count);
        console.log("当前总价钱:"+totalprice);

        var label=document.getElementById("zong1");
        label.innerText=totalprice;
        var label2=document.getElementById("zongshu");
        console.log(label2);
        label2.innerText=count;

    });

	// 输出
	$(".gwc_tb2 input[name=newslist]").click(function () {

		GetCount();
	});
});
//******************
function GetCount() {
	var conts = 0;
	var aa = 0;
	$(".gwc_tb2 input[name=newslist]").each(function () {
		if ($(this).attr("checked")) {
			for (var i = 0; i < $(this).length; i++) {
				conts += parseInt($(this).val());
				aa += 1;
			}
		}
	});
	$("#shuliang").text(aa);
	// $("#zong1").html((conts).toFixed(2));
	$("#jz1").css("display", "none");
	$("#jz2").css("display", "block");
}
//ADD:对删除链接进行处理2014-9-20DeathGhost
    $(document).ready(function(){
		$("#delcart1").click(function(){
			$("#table1").remove();
			});
		$("#delcart2").click(function(){
			$("#table2").remove();
			});
        $("#delcart3").click(function(){
            $("#table3").remove();
        });
        $("#delcart4").click(function(){
            $("#table4").remove();
        });
		});
// <!---商品加减算总数---->
	$(function () {
		var t = $("#text_box2");
		$("#add2").click(function () {
			t.val(parseInt(t.val()) + 1)
			// setTotal(); GetCount();
            setTotal2();
		})
		$("#min2").click(function () {
			t.val(parseInt(t.val(1)) - 1)
			t.val(1)//初始值防止为负数ADD deathghost
            setTotal2();
			// setTotal(); GetCount();
		})
		// function setTotal() {
		// 	$("#total2").html((parseInt(t.val()) * 23).toFixed(2));
		// 	$("#newslist-2").val(parseInt(t.val()) * 23);
		// }
		// setTotal();
	})
	$(function () {
		var t = $("#text_box1");
		$("#add1").click(function () {
			t.val(parseInt(t.val()) + 1)
            setTotal2();
			// setTotal(); GetCount();
		})
		$("#min1").click(function () {
			t.val(parseInt(t.val()) - 1)
			t.val(1)//初始值防止为负数ADD deathghost
            setTotal2();
			// setTotal(); GetCount();
		})
		// function setTotal() {
        //
		// 	$("#total1").html((parseInt(t.val()) * 59).toFixed(2));
		// 	$("#newslist-1").val(parseInt(t.val()) * 59);
		// }
		// setTotal();
	})
$(function () {
    var t = $("#text_box3");
    $("#add3").click(function () {
        t.val(parseInt(t.val()) + 1)
        setTotal2();
    })
    $("#min3").click(function () {
        t.val(parseInt(t.val()) - 1)
        t.val(1)
        setTotal2();
    })
})
$(function () {
    var t = $("#text_box4");
    $("#add4").click(function () {
        t.val(parseInt(t.val()) + 1)
        setTotal2();
    })
    $("#min4").click(function () {
        t.val(parseInt(t.val()) - 1)
        t.val(1)
        setTotal2();
    })
})
// <!---总数---->
	$(function () {
		$(".quanxun").click(function () {
			setTotal();
			//alert($(lens[0]).text());
		});
		function setTotal() {
			var len = $(".tot");
			var num = 0;
			for (var i = 0; i < len.length; i++) {
				num = parseInt(num) + parseInt($(len[i]).text());

			}
			//alert(len.length);
			// $("#zong1").text(parseInt(num).toFixed(2));
			$("#shuliang").text(len.length);
		}
		//setTotal();
	})
function setTotal2(){
    var length=$("#cart").find("table").length ;
    var totalprice=0;
    for(var i=1;i<length-1;i++){
        if($("#newslist"+i).prop('checked')){
            var number=$("#text_box"+i).val();
            var price=$("#total"+i).html().trim();
            var onetotalprice=number*price;
            totalprice=totalprice+onetotalprice;
        }
    }
    console.log("当前总价钱:"+totalprice);zong1
    var label=document.getElementById("zong1");
    label.innerText=totalprice;
    // var value=$("#zong1").html();
    // value=totalprice;
}

//计算总价钱
// $(function () {
//     var length=$("#cart").find("table").length ;
//     var totalprice=0;
//     for(var i=1;i<length-1;i++){
//         var number=$("#text_box"+i).val();
//         var price=$("#total"+i).html().trim();
//         var onetotalprice=number*price;
//         totalprice=totalprice+onetotalprice;
//     }
//     console.log("当前总价钱:"+totalprice);
// })
//add to cart shoppage
// var data = {"total":0,"rows":[]};
// 		var totalCost = 0;
//
// 		$(function(){
// 			$('#cartcontent').datagrid({
// 				singleSelect:true
// 			});
// 			$('.item').draggable({
// 				revert:true,
// 				proxy:'clone',
// 				onStartDrag:function(){
// 					$(this).draggable('options').cursor = 'not-allowed';
// 					$(this).draggable('proxy').css('z-index',2);
// 				},
// 				onStopDrag:function(){
// 					$(this).draggable('options').cursor='move';
// 				}
// 			});
// 			$('.cart').droppable({
// 				onDragEnter:function(e,source){
// 					$(source).draggable('options').cursor='auto';
// 				},
// 				onDragLeave:function(e,source){
// 					$(source).draggable('options').cursor='not-allowed';
// 				},
// 				onDrop:function(e,source){
// 					var name = $(source).find('p:eq(0)').html();
// 					var price = $(source).find('p:eq(1)').html();
// 					addProduct(name, parseFloat(price.split('￥')[1]));
// 				}
// 			});
// 		});
//
// 		function addProduct(name,price){
// 			function add(){
// 				for(var i=0; i<data.total; i++){
// 					var row = data.rows[i];
// 					if (row.name == name){
// 						row.quantity += 1;
// 						return;
// 					}
// 				}
// 				data.total += 1;
// 				data.rows.push({
// 					name:name,
// 					quantity:1,
// 					price:price
// 				});
// 			}
// 			add();
// 			totalCost += price;
// 			$('#cartcontent').datagrid('loadData', data);
// 			$('div.cart .total').html('共计金额: ￥'+totalCost);
// 		}