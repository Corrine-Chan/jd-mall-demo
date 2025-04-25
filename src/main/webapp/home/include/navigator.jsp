<%@ page contentType="text/html;charset=UTF-8" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/home/home_nav.css"/>
<script>
    $(function () {
        $(".quick_li").find("li").hover(
            function () {
                $(this).find(".sn_menu").addClass("sn_menu_hover");
                $(this).find(".quick_menu,.quick_qrcode,.quick_DirectPromoDiv,.quick_sitmap_div").css("display", "block");
            }, function () {
                $(this).find(".sn_menu").removeClass("sn_menu_hover");
                $(this).find(".quick_menu,.quick_qrcode,.quick_DirectPromoDiv,.quick_sitmap_div").css("display", "none");
            }
        );
    });
</script>
<div id="nav">
    <div class="nav_main">
        <p id="container_login">
            <c:choose>
                <c:when test="${requestScope.user.user_name==null}">
                    <em>嘿，欢迎来京东！</em>
                    <a href="${pageContext.request.contextPath}/login">请登录</a>
                    <a href="${pageContext.request.contextPath}/register">免费注册</a>
                </c:when>
                <c:otherwise>
                    <em>Hi，</em>
                    <a href="${pageContext.request.contextPath}/userDetails" class="userName"
                       target="_blank">${requestScope.user.user_name}</a>
                    <a href="${pageContext.request.contextPath}/login/logout">退出</a>
                </c:otherwise>
            </c:choose>
        </p>
        <ul class="quick_li">
            <li class="quick_li_MyTaobao">
                <div class="sn_menu">
                    <a href="${pageContext.request.contextPath}/userDetails">我的商店<b></b></a>
                    <div class="quick_menu">
                        <a href="${pageContext.request.contextPath}/order/0/10">已买到的宝贝</a>
                        <a href="#">已卖出的宝贝</a>
                    </div>
                </div>
            </li>
            <li class="quick_li_cart">
                <img src="${pageContext.request.contextPath}/res/images/home/WebsiteImage/buyCar.png">
                <a href="${pageContext.request.contextPath}/cart">购物车</a>
            </li>
            <li class="quick_li_menuItem">
                <div class="sn_menu">
                    <a href="#">收藏夹<b></b></a>
                    <div class="quick_menu">
                        <a href="#">收藏的宝贝</a>
                        <a href="#">收藏的店铺</a>
                    </div>
                </div>
            </li>
            <li class="quick_li_separator"></li>
            <li class="quick_li_mobile">
                <img src="${pageContext.request.contextPath}/res/images/home/WebsiteImage/mobile.png">
                <a href="#" title="京东无线">手机端</a>
                <div class="quick_qrcode">
                    <img src="${pageContext.request.contextPath}/res/images/home/WebsiteImage/qrcode.png">
                    <b></b>
                </div>
            </li>
            <li class="quick_home"><a href="${pageContext.request.contextPath}">首页</a></li>
            <li class="quick_DirectPromo">
                <div class="sn_menu">
                    <a href="#">商家支持<b></b></a>
                    <div class="quick_DirectPromoDiv">
                        <ul>
                            <li>
                                <h3>商家：</h3>
                                <a href="">商家中心</a>
                                <a href="">京东规则</a>
                                <a href="">商家入驻</a>
                                <a href="">运营服务</a>
                                <a href="">商家品控</a>
                                <a href="">商家工具</a>
                                <a href="">京东智库</a>
                            </li>
                            <li>
                                <h3>帮助：</h3>
                                <a href="">帮助中心</a>
                                <a href="">问商友</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </li>
            <li class="quick_sitemap">
                <div class="sn_menu">
                    <a>网站导航<b></b></a>
                    <div class="quick_sitmap_div">
                        <div class="site-hot">
                            <h2>特色主题</h2>
                            <ul>
                                <li><a href="">京东金融</a></li>
                                <li><a href="">全球售</a></li>
                                <li><a href="">台湾售</a></li>
                                <li><a href="">装机大师</a></li>
                                <li><a href="">港澳售</a></li>
                                <li><a href="">秒杀</a></li>
                                <li><a href="">出海招商</a></li>
                                <li><a href="">京东国际</a></li>
                                <li><a href="">拍拍二手</a></li>
                            </ul>
                        </div>
                        <div class="site-market">
                            <h2>行业频道</h2>
                            <ul>
                                <li><a href="">手机数码</a></li>
                                <li><a href="">服饰美妆</a></li>
                                <li><a href="">家用电器</a></li>
                                <li><a href="">整车</a></li>
                                <li><a href="">办公好物</a></li>
                                <li><a href="">京东生鲜</a></li>
                                <li><a href="">图书</a></li>
                                <li><a href="">手机</a></li>
                                <li><a href="">电脑馆</a></li>
                                <li><a href="">母婴</a></li>
                                <li><a href="">食品</a></li>
                                <li><a href="">农资频道</a></li>
                                <li><a href="">劳动防护</a></li>
                            </ul>
                        </div>
                        <div class="site-brand">
                            <h2>生活服务</h2>
                            <ul>
                                <li><a href="">京东小家</a></li>
                                <li><a href="">白条</a></li>
                                <li><a href="">京东金融App</a></li>
                                <li><a href="">京东小金库</a></li>
                                <li><a href="">充值中心</a></li>
                            </ul>
                        </div>
                        <div class="site-help">
                            <h2>更多精选</h2>
                            <ul>
                                <li><a href="">合作招商</a></li>
                                <li><a href="">京东通信</a></li>
                                <li><a href="">京东E卡</a></li>
                                <li><a href="">企业采购</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>