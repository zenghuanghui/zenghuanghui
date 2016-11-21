<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>INSPINIA | Login 2</title>

    <link href="<%= path%>/inspinia/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%= path%>/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="<%= path%>/inspinia/css/animate.css" rel="stylesheet">
    <link href="<%= path%>/inspinia/css/style.css" rel="stylesheet">
    <script src="<%= path%>/inspinia/js/jquery-2.1.1.js"></script>
    <script src="<%= path%>/js/common.js"></script>

</head>

<body class="gray-bg">
<input type="hidden" id="cur_path" value="<%= path%>"/>
<div class="loginColumns animated fadeInDown">
    <div class="row">

        <div class="col-md-6">
            <h2 class="font-bold">Welcome to IN+</h2>

            <p>
                Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
            </p>

            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.
            </p>

            <p>
                When an unknown printer took a galley of type and scrambled it to make a type specimen book.
            </p>

            <p>
                <small>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</small>
            </p>

        </div>
        <div class="col-md-6">
            <div class="ibox-content">
                <form class="m-t" role="form" method="post" id="login_form">
                    <div class="form-group">
                        <input type="text" class="form-control" name="name" placeholder="Username" required="">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" placeholder="Password" required="">
                    </div>
                    <button type="button" class="btn btn-primary block full-width m-b" onclick="login()">Login</button>

                    <a href="login_two_columns.html#">
                        <small>Forgot password?</small>
                    </a>

                    <p class="text-muted text-center">
                        <small>Do not have an account?</small>
                    </p>
                    <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
                </form>
                <p class="m-t">
                    <small>Inspinia we app framework base on Bootstrap 3 &copy; 2014</small>
                </p>
            </div>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-md-6">
            Copyright Example Company
        </div>
        <div class="col-md-6 text-right">
            <small>© 2014-2015</small>
        </div>
    </div>
</div>

</body>

</html>
