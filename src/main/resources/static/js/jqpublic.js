//SLIDE AD
(function(d,D,v){d.fn.responsiveSlides=function(h){var b=d.extend({auto:!0,speed:1E3,timeout:7E3,pager:!1,nav:!1,random:!1,pause:!1,pauseControls:!1,prevText:"",nextText:"",maxwidth:"",controls:"",namespace:"rslides",before:function(){},after:function(){}},h);return this.each(function(){v++;var e=d(this),n,p,i,k,l,m=0,f=e.children(),w=f.size(),q=parseFloat(b.speed),x=parseFloat(b.timeout),r=parseFloat(b.maxwidth),c=b.namespace,g=c+v,y=c+"_nav "+g+"_nav",s=c+"_here",j=g+"_on",z=g+"_s",
o=d("<ul class='"+c+"_tabs "+g+"_tabs' />"),A={"float":"left",position:"relative"},E={"float":"none",position:"absolute"},t=function(a){b.before();f.stop().fadeOut(q,function(){d(this).removeClass(j).css(E)}).eq(a).fadeIn(q,function(){d(this).addClass(j).css(A);b.after();m=a})};b.random&&(f.sort(function(){return Math.round(Math.random())-0.5}),e.empty().append(f));f.each(function(a){this.id=z+a});e.addClass(c+" "+g);h&&h.maxwidth&&e.css("max-width",r);f.hide().eq(0).addClass(j).css(A).show();if(1<
f.size()){if(x<q+100)return;if(b.pager){var u=[];f.each(function(a){a=a+1;u=u+("<li><a href='#' class='"+z+a+"'>"+a+"</a></li>")});o.append(u);l=o.find("a");h.controls?d(b.controls).append(o):e.after(o);n=function(a){l.closest("li").removeClass(s).eq(a).addClass(s)}}b.auto&&(p=function(){k=setInterval(function(){var a=m+1<w?m+1:0;b.pager&&n(a);t(a)},x)},p());i=function(){if(b.auto){clearInterval(k);p()}};b.pause&&e.hover(function(){clearInterval(k)},function(){i()});b.pager&&(l.bind("click",function(a){a.preventDefault();
b.pauseControls||i();a=l.index(this);if(!(m===a||d("."+j+":animated").length)){n(a);t(a)}}).eq(0).closest("li").addClass(s),b.pauseControls&&l.hover(function(){clearInterval(k)},function(){i()}));if(b.nav){c="<a href='javascript:' class='"+y+" prev'>"+b.prevText+"</a><a href='javascript:' class='"+y+" next'>"+b.nextText+"</a>";h.controls?d(b.controls).append(c):e.after(c);var c=d("."+g+"_nav"),B=d("."+g+"_nav.prev");c.bind("click",function(a){a.preventDefault();if(!d("."+j+":animated").length){var c=f.index(d("."+j)),
a=c-1,c=c+1<w?m+1:0;t(d(this)[0]===B[0]?a:c);b.pager&&n(d(this)[0]===B[0]?a:c);b.pauseControls||i()}});b.pauseControls&&c.hover(function(){clearInterval(k)},function(){i()})}}if("undefined"===typeof document.body.style.maxWidth&&h.maxwidth){var C=function(){e.css("width","100%");e.width()>r&&e.css("width",r)};C();d(D).bind("resize",function(){C()})}})}})(jQuery,this,0);
$(function() {
    $(".f426x240").responsiveSlides({
        auto: true,
        pager: true,
        nav: true,
        speed: 700
    });
    $(".f160x160").responsiveSlides({
        auto: true,
        pager: true,
        speed: 700
    });
});
/*search nav tab*/
$(function () {
  var initDiv = function () {
  $(".Search_nav a").css("background", "");
  $(".Search_nav a").css("color","");
  
  $(".Search_nav a").mouseover(function () {
  $(this).css("background", "");
   })
   .mouseout(function () {
    $(this).css("background", "");
	$(this).css("color","");
     })
      };
     initDiv();
      $(".Search_nav a")
       .click(function () {
        initDiv();
          $(this).css("background", "#00661c");
		  $(this).css("color","#fff");
          $(this).unbind("mouseout");
          $(this).unbind("mouseover");
          });
    })
// class tree  fslist_navtree
$(document).ready(function(){
	$("#select1").on('click','dd',function(){
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectA").remove();
		} else {
			var copyThisA = $(this).clone();
			if ($("#selectA").length > 0) {
				$("#selectA a").html($(this).text());
			} else {
				$(".select-result dl").append(copyThisA.attr("id", "selectA"));
			}
		}
		//更新餐馆list
        var cate=$("#select1 .selected").text();
		var address=$("#select2 .selected").text();
		console.log(cate+address);
        if(address=='全部'&&cate=='全部'){
            console.log('执行2');
            $.ajax({
                type: "POST",
                url: "/findHotRestaurant",
                contentType: "application/json; charset=utf-8",
                data: null,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
        else if(address=='全部'){
            console.log('执行1');
            var json = {
                cate: cate
            };
            json = JSON.stringify(json);
            $.ajax({
                type: "POST",
                url: "/findRestaurantByCate",
                contentType: "application/json; charset=utf-8",
                data: json,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
        else{
            var json = {
                address: address,
                cate:cate
            };
            json = JSON.stringify(json);
            $.ajax({
                type: "POST",
                url: "/findRestaurantByAddressAndCate",
                contentType: "application/json; charset=utf-8",
                data: json,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
	});
	$("#select2").on('click','dd',function () {
	    console.log($(this).text());
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectB").remove();
		} else {
			var copyThisB = $(this).clone();
			if ($("#selectB").length > 0) {
				$("#selectB a").html($(this).text());
			} else {
				$(".select-result dl").append(copyThisB.attr("id", "selectB"));
			}
		}
        var cate=$("#select1 .selected").text();
        var address=$("#select2 .selected").text();
        console.log(address);
        if(address=='全部'&&cate=='全部'){
            console.log('执行2');
            $.ajax({
                type: "POST",
                url: "/findAllRestaurant",
                contentType: "application/json; charset=utf-8",
                data: null,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
        else if(cate=='全部'){
            var json = {
                address: address
            };
            json = JSON.stringify(json);
            $.ajax({
                type: "POST",
                url: "/findRestaurantByAddress",
                contentType: "application/json; charset=utf-8",
                data: json,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
        else{
            var json = {
                address: address,
                cate:cate
            };
            json = JSON.stringify(json);
            $.ajax({
                type: "POST",
                url: "/findRestaurantByAddressAndCate",
                contentType: "application/json; charset=utf-8",
                data: json,
                async: false,
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    $("#relist1").empty();
                    for(var i=0;i<info.restaurant.length&&i<4;i++){
                        var name=info.restaurant[i].restaurantName;
                        var restaurantCategory=info.restaurant[i].restaurantCategory;
                        var restaurantAddress=info.restaurant[i].restaurantAddress;
                        var score=info.restaurant[i].score;
                        var image=info.restaurant[i].restaurantImage;
                        var id=info.restaurant[i].restaurantId;
                        if(3<=score<4){
                            console.log(score);
                        }
                        else if(4<=score<5){

                        }
                        $("#relist1").append("<li>\n" +
                            "   <a href=\"shop.html\" target=\"_blank\" title=\"调用产品名/店铺名\"><img src=\""+image+"\"></a>\n" +
                            "   <hgroup>\n" +
                            "   <h3>"+name+"</h3>\n" +
                            "   <h4></h4>\n" +
                            "   </hgroup>\n" +
                            "   <p>菜系："+restaurantCategory+"</p>\n" +
                            "   <p>地址："+restaurantAddress+"</p>\n" +
                            "   <p>人均：20~50元</p>\n" +
                            "   <p>\n" +
                            "    <span class=\"Score-l\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-on.png\">\n" +
                            "    <img src=\"images/star-off.png\">\n" +
                            "    <span class=\"Score-v\">"+score+"</span>\n" +
                            "    </span>\n" +
                            "    <span class=\"DSBUTTON\"><a href=\"shop.html?"+id+"\" target=\"_blank\" class=\"Fontfff\">点外卖</a></span>\n" +
                            "   </p>\n" +
                            "  </li>");
                    }
                },
                error: function (message) {
                    $("#request-process-patent").html("获取数据失败！");
                }
            });
        }
	});

	$("#select3").on('click','dd',function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectC").remove();
		} else {
			var copyThisC = $(this).clone();
			if ($("#selectC").length > 0) {
				$("#selectC a").html($(this).text());
			} else {
				$(".select-result dl").append(copyThisC.attr("id", "selectC"));
			}
		}
	});
	$("#select4").on('click','dd',function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectD").remove();
		} else {
			var copyThisC = $(this).clone();
			if ($("#selectD").length > 0) {
				$("#selectD a").html($(this).text());
			} else {
				$(".select-result dl").append(copyThisC.attr("id", "selectD"));
			}
		}
	});
	$("#selectA").on("click", function () {
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectB").on("click", function () {
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectC").on("click", function () {
		$(this).remove();
		$("#select3 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	$("#selectD").on("click", function () {
		$(this).remove();
		$("#select4 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(".select dd").on("click", function () {
		if ($(".select-result dd").length > 1) {
			$(".select-no").hide();
		} else {
			$(".select-no").show();
		}
	});
	
});
/*shop page ico change*/
function show(obj)
{
    var img = document.getElementById("showimg");
    if(img.src!=obj.src)
    {
     img.src=obj.src;
    }
    img.style.display="";
    img.style.position="relative";
    img.style.top = obj.offsetTop;
    img.style.left = obj.offsetLeft+obj.width;
}

//取消最后一个<li>的边框
$(function(){
$("#Lbn li:last").css("border","none");
})
