<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    <style>
        div.search {padding: 30px 0;}

        form {
            position: relative;
            width: 300px;
            margin: 0 auto;
        }

        input, button {
            border: none;
            outline: none;
        }

        input {
            width: 100%;
            height: 42px;
            padding-left: 13px;
        }

        button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
        }

        .bar5 input, .bar5 button {
            background: transparent;
        }
        .bar5 input {
            border: 2px solid #F9F0DA;
        }
        .bar5 button {
            top: 0;
            right: 0;
        }
        .bar5 button:before {
            content: "\f002";
            font-family: FontAwesome;
            font-size: 16px;
            color: #F9F0DA;
        }
        .bar5 input:focus {
            border-color: #311c24
        }

    </style>
</head>
<body>
<div id="container">


    <div class="search bar5">
        <form>
            <input type="text" placeholder="请输入您要搜索的内容...">
            <button type="submit"></button>
        </form>
    </div>

</div>
</body>
</html>
