<%@ page contentType="text/html;charset=UTF-8" %>
<nav id="nav_main" class="text_info">
<%--    <svg class="home_logo" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1010" width="32" height="32">--%>
<%--        <path d="M867.271111 967.111111H157.013333c-65.422222 0-109.909333-66.332444-99.84-145.009778l86.641778-676.977777A103.537778 103.537778 0 0 1 244.622222 56.888889h535.495111a103.537778 103.537778 0 0 1 100.579556 88.519111L967.111111 822.101333c10.069333 78.677333-34.474667 145.009778-99.84 145.009778zM739.555556 170.666667a56.888889 56.888889 0 0 0-39.253334 97.792A198.428444 198.428444 0 0 1 512 440.888889a198.428444 198.428444 0 0 1-188.302222-172.430222 56.888889 56.888889 0 1 0-63.032889 10.296889A264.874667 264.874667 0 0 0 512 512a264.874667 264.874667 0 0 0 251.335111-233.244444A56.888889 56.888889 0 0 0 739.555556 170.666667z" p-id="1011" fill="#ff7874">--%>
<%--        </path>--%>
<%--    </svg>--%>
    <svg t="1735622117816" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1549" width="32" height="32">
        <path d="M118.672065 1024l62.186235-845.732794h662.2834l62.186235 845.732794H118.672065z m54.931174-433.27119h87.786235C276.279968 717.395951 384.025911 815.676113 514.755887 815.676113a254.015223 254.015223 0 0 0 140.802073-42.337425 256.437377 256.437377 0 0 1-50.57192 5.019466c-117.569296 0-216.54698-79.494737-246.114461-187.629344h90.480972L311.477377 452.923077zM297.45749 201.068826a32.647773 32.647773 0 1 0 32.647773 32.647773 32.647773 32.647773 0 0 0-32.647773-32.647773z m428.048583 0a32.647773 32.647773 0 1 0 32.647773 32.647773 32.647773 32.647773 0 0 0-32.647773-32.647773z m44.34915 370.008097C754.979239 444.432583 647.305846 346.17004 516.663968 346.17004a253.75715 253.75715 0 0 0-140.707757 42.329134A256.185522 256.185522 0 0 1 426.493927 383.481781c117.48949 0 216.401879 79.476081 245.946559 187.595142h-90.41464L719.805668 708.856745 857.58549 571.076923H769.855223z m-77.50996-392.907142a195.436826 195.436826 0 0 0-360.690526 0h-61.564373C302.314235 74.934413 398.664551 0 512.518219 0s210.203984 74.934413 242.430963 178.169781h-62.60081z" fill="#e2231a" p-id="1550">
        </path></svg>
    <span id="txt_home_title" class="nav_text">京东数据管理后台</span>
    <i id="i_nickname_slide"></i>
    <span id="txt_home_nickname"><c:choose><c:when test="${requestScope.admin.admin_nickname != ''}">${requestScope.admin.admin_nickname}</c:when><c:otherwise>${requestScope.admin.admin_name}</c:otherwise></c:choose></span>
    <img id="img_home_profile_picture"
         src="${pageContext.request.contextPath}/res/images/item/adminProfilePicture/${requestScope.admin.admin_profile_picture_src}"
         onerror="this.src='${pageContext.request.contextPath}/res/images/admin/homePage/default_profile_picture-32x32.png'"
         alt="头像" title="头像" width="32px" height="32px">
    <input id="admin_id" type="hidden" value="${requestScope.admin.admin_id}"/>
    <ul id="nav_tools">
        <li id="nav_tools_admin_manage">账号管理</li>
        <li id="nav_tools_admin_logout">注销</li>
    </ul>
</nav>