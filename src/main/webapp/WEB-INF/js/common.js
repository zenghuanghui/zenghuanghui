$( function(){
    var path = $("#cur_path").val();
    login = function () {
        var param = $("#login_form").serialize();
        $.ajax({
            type:"POST",
            url:path + "/user/loginUser",
            data:param,
            dataType:"json",
            success:function (data) {
                if(data.result == "success"){
                    window.location.href = path + "/user/index";
                }else{
                    $('.login-form .alert-danger span').html(" Wrong account or password. ");
                    $('.alert-danger', $('.login-form')).show();
                }
            }
        });
    }

    logout = function () {
        window.location.href = path + "/user/logoutUser";
    }
});