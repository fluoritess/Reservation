var redirect = (function ()  {
    window.sessionStorage.clear();
    window.location.href="index.html";
})
function add0(m){return m<10?'0'+m:m }
function format(timestamp)
{
    //timestamp是整数，否则要parseInt转换,不会出现少个0的情况
    var time = new Date(timestamp);
    var year = time.getFullYear();
    var month = time.getMonth()+1;
    var date = time.getDate();
    var hours = time.getHours();
    var minutes = time.getMinutes();
    var seconds = time.getSeconds();
    return year+'-'+add0(month)+'-'+add0(date)+' '+add0(hours)+':'+add0(minutes)+':'+add0(seconds);
}
$(function(){
    var user=sessionStorage.getItem("name");
    var userId;
    console.log(user);
    if(user==null){
        $(".LeftNav").append(" <a href=\"login/register.html\">注册</a>/<a href=\"login/login.html\">登录</a><a href=\"#\">QQ客服</a><a href=\"#\">微信客服</a><a href=\"#\">手机客户端</a>");
        $(".RightNav").append(" <a href=\"user_center.html\">用户中心</a> <a href=\"user_orderlist.html\" target=\"_blank\" title=\"我的订单\">我的订单</a> <a href=\"cart.html\">购物车（0）</a> <a href=\"user_favorites.html\" target=\"_blank\" title=\"我的收藏\">我的收藏</a> <a href=\"#\">商家入驻</a>");
        $(".seekarea").append(" <a href=\"#\">碑林区</a>\n" +
            "     <a href=\"#\">新城区</a>\n" +
            "     <a href=\"#\">未央区</a>\n" +
            "     <a href=\"#\">雁塔区</a>\n" +
            "     <a href=\"#\">莲湖区</a>\n" +
            "     <a href=\"#\">高新区</a>\n" +
            "     <a href=\"#\">灞桥区</a>\n" +
            "     <a href=\"#\">高陵区</a>\n" +
            "     <a href=\"#\">阎良区</a>\n" +
            "     <a href=\"#\">临潼区</a>\n" +
            "     <a href=\"#\">长安区</a>\n" +
            "     <a href=\"#\">周至县</a>\n" +
            "     <a href=\"#\">蓝田县 </a>");
    }
    else{
        $(".LeftNav").append(" <a href=\"javascript:redirect();\">退出登录</a><a href=\"#\">QQ客服</a><a href=\"#\">微信客服</a><a href=\"#\">手机客户端</a>");
        var json = {
            name: user
        };
        json = JSON.stringify(json);
        var cityname=null;
        $.ajax({
            type: "POST",
            url: "/GetUserCityInfo",
            contentType: "application/json; charset=utf-8",
            data: json,
            async: false,
            dataType: "json",
            success: function (info) {
                var city=info.user.city;
                cityname=city;
                var distict=info.user.distict;
                $("#distict").append(city+ "[ <a href=\"#\">"+distict+"</a> ]");
            },
            error: function (message) {
                $("#request-process-patent").html("获取数据失败！");
            }
        });
        $.ajax({
            type: "POST",
            url: "/findCartByuser",
            contentType: "application/json; charset=utf-8",
            data: json,
            async: false,
            dataType: "json",
            success: function (info) {
                var length=info.cart.length;
                $(".RightNav").append("<a href=\"user_center.html\">用户中心</a> <a href=\"user_orderlist.html\" target=\"_blank\" title=\"我的订单\">我的订单</a> <a href=\"cart.html\">购物车（"+length+"）</a> <a href=\"user_favorites.html\" target=\"_blank\" title=\"我的收藏\">我的收藏</a> <a href=\"#\">商家入驻</a>");
            }
        });
        $.ajax({
            type: "POST",
            url: "/GetUserInfo",
            contentType: "application/json; charset=utf-8",
            data: json,
            async: false,
            dataType: "json",
            success: function (info) {
                userId=info.user.userId;
            },
            error: function (message) {
                $("#request-process-patent").html("获取数据失败！");
            }
        });
        $("#tuichu").click(function () {
            window.sessionStorage.clear();
            window.location.href="index.html";

        });
    }
});