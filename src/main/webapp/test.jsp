<%--
  Created by IntelliJ IDEA.
  User: Zi
  Date: 2019/12/2 0002
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script src="https://cdn.staticfile.org/angular.js/1.6.3/angular.min.js"></script>
</head>
<body>

<div ng-app="myApp" ng-controller="siteCtrl">

    <ul>
        <li ng-repeat="x in names">
            {{ x.name + ', ' + x.id }}
        </li>
    </ul>

</div>

<script>
    var app = angular.module('myApp', []);

    app.controller('siteCtrl', function($scope, $http) {
        $http({
            method: 'GET',
            url: '/Goods/selectAll'
        }).then(function successCallback(response) {
            $scope.names = response.data;
        }, function errorCallback(response) {

        });

    });
</script>

</body>
</html>