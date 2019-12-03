<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Vue 测试实例 - 菜鸟教程(runoob.com)</title>
    <script src="https://cdn.staticfile.org/vue/2.4.2/vue.min.js"></script>
    <script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
</head>
<body>
<div id="box">
    <input type="button" @click="get()" value="点我异步获取数据(Get)">
</div>
<div id="app">
    <div v-html="msg"></div>
</div>
<script type = "text/javascript">
    window.onload = function(){
        var vm = new Vue({
            el:'#box',
            data:{
                msg:'',
            },
            methods:{
                get:function(){
                    //发送get请求
                    this.$http.get('/User/test').then(
                        response => {
                        this.msg = response
                },response => {
                        console.log('请求失败处理');
                    });
                }
            }
        });
        var cr = new Vue({
            el:'#app',
            data:{
                message: '<h1>菜鸟教程</h1>'
            }
        })
    }
</script>
