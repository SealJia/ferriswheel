<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/static/taglibs/taglibs.jsp" %>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/index.do'/>"><fmt:message key="global.text.index"/></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"><fmt:message key="module.menu.system"/></a></li>
                <li><a href="<c:url value='/system/user.do?method=showList'/>"><fmt:message key="module.menu.user"/></a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><fmt:message key="module.menu.demo"/>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<c:url value='/anon/demo/bootstrap.do'/>"><fmt:message
                                key="module.menu.bootstrap"/></a></li>
                        <li><a href="<c:url value='/demo/jqgriddemo.do?method=showList4Base'/>"><fmt:message
                                key="module.menu.jqgrid"/></a></li>
                    </ul>
                </li>
            </ul>


            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><fmt:message
                            key="global.text.login.hello"/>,<shiro:principal
                            property="name"/> <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#"><fmt:message key="module.system.settings"/></a></li>
                        <li><a href="#"><fmt:message key="module.system.changepasswd"/></a></li>
                        <li class="divider"></li>
                        <li><a href="<c:url value='/logout.do'/>"><fmt:message
                                key="global.text.logout"/></a></li>
                    </ul>
                </li>
                <!-- lang selector starts -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <fmt:message key='global.text.lang'/> <span
                            class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" id="lang" role="menu">
                        <li><a data-value="zh_CN" href="#">
                            <fmt:message key="global.text.lang.zh_CN"/></a></li>
                        <li><a data-value="en" href="#">
                            <fmt:message key="global.text.lang.en"/></a></li>
                    </ul>
                </li>
                <!-- lang selector ends -->
                <!-- theme selector starts -->
                <li class="dropdown">
                    <a class="btn dropdown-toggle" data-toggle="dropdown" href="#"> <fmt:message
                            key='global.text.theme'/> <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" id="themes">
                        <li><a data-value="classic" href="#">
                            <fmt:message key='module.theme.classic'/></a></li>
                        <li><a data-value="united" href="#">
                            <fmt:message key='module.theme.simple'/></a></li>
                    </ul>
                </li>
                <!-- theme selector ends -->
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
