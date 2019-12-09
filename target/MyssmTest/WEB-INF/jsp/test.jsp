<%--
  Created by IntelliJ IDEA.
  User: Zi
  Date: 2019/12/6 0006
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
        <div class="x_content">
            <p class="text-muted font-13 m-b-30"></p>
            <div id="datatable-responsive_wrapper"
                 class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                <div class="row">
                    <div class="col-sm-12">
                        <a href="${pageContext.request.contextPath}/dev/flatform/app/appinfoadd" class="btn btn-success btn-sm">新增APP基础信息</a>
                        <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
                               cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
                            <thead>
                            <tr role="row">
                                <th class="sorting_asc" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="First name: activate to sort column descending"
                                    aria-sort="ascending">软件名称</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    APK名称</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    软件大小(单位:M)</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    所属平台</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    所属分类(一级分类、二级分类、三级分类)</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    状态</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    下载次数</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    aria-label="Last name: activate to sort column ascending">
                                    最新版本号</th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="datatable-responsive" rowspan="1" colspan="1"
                                    style="width: 124px;"
                                    aria-label="Last name: activate to sort column ascending">
                                    操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="appInfo" items="${appInfoList }" varStatus="status">
                                <tr role="row" class="odd">
                                    <td tabindex="0" class="sorting_1">${appInfo.softwarename}</td>
                                    <td>${appInfo.apkname }</td>
                                    <td>${appInfo.softwaresize }</td>
                                    <td>${appInfo.flatformid }</td>
                                    <td>${appInfo.categorylevel1 } -> ${appInfo.categorylevel2 } -> ${appInfo.categorylevel3 }</td>
                                    <td><span id="appInfoStatus${appInfo.id}">${appInfo.status }</span></td>
                                    <td>${appInfo.downloads }</td>
                                    <td>${appInfo.versionid }</td>
                                    <td>


                                        <div class="btn-group">
                                            <button type="button" class="btn btn-danger">点击操作</button>
                                            <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                                <span class="caret"></span>
                                                <span class="sr-only">Toggle Dropdown</span>
                                            </button>
                                            <ul class="dropdown-menu" role="menu">
                                                <li>
                                                    <c:choose>
                                                        <c:when test="${appInfo.status == 2 || appInfo.status == 5}">
                                                            <a class="saleSwichOpen" saleSwitch="open" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="恭喜您，您的审核已经通过，您可以点击上架发布您的APP">上架</a>
                                                        </c:when>
                                                        <c:when test="${appInfo.status == 4}">
                                                            <a class="saleSwichClose" saleSwitch="close" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="您可以点击下架来停止发布您的APP，市场将不提供APP的下载">下架</a>
                                                        </c:when>
                                                    </c:choose>
                                                </li>
                                                <li><a class="addVersion" appinfoid="${appInfo.id }" data-toggle="tooltip" data-placement="top" title="" data-original-title="新增APP版本信息">新增版本</a>
                                                </li>
                                                <li><a class="modifyVersion"
                                                       appinfoid="${appInfo.id }" versionid="${appInfo.versionid }" status="${appInfo.status }"
                                                       statusname="${appInfo.status }"
                                                       data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP最新版本信息">修改版本</a>
                                                </li>
                                                <li><a  class="modifyAppInfo"
                                                        appinfoid="${appInfo.id }" status="${appInfo.status }" statusname="${appInfo.status }"
                                                        data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP基础信息">修改</a></li>
                                                <li><a  class="viewApp" appinfoid=${appInfo.id }  data-toggle="tooltip" data-placement="top" title="" data-original-title="查看APP基础信息以及全部版本信息">查看</a></li>
                                                <li><a  class="deleteApp" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwarename } data-toggle="tooltip" data-placement="top" title="" data-original-title="删除APP基础信息以及全部版本信息">删除</a></li>
                                            </ul>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
