// $('#txtEmail').on('blur', function () {
//     var input = $('#txtEmail').val();
//     var filter = /^([a-xA-Z0-9\_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
//     if (!filter.test(input)) {
//         $('#infEmail').css({ "color": "#d41c1c" });
//         $('#txtEmail').css({ "border-color": "#d41c1c" });
//     }
//     else {
//         $('#infEmail').css({ "color": "#A2A2A2" });
//         $('#txtEmail').css({ "border-color": "initial" });
//     }
// });

// $('#txtPassword').on('blur', function () {
//     var input = $('#txtPassword').val();
//     if (input.length == 0) {
//         $('#infPassword').css({ "color": "#d41c1c" });
//         $('#txtPassword').css({ "border-color": "#d41c1c" });
//     }
//     else {
//         $('#infPassword').css({ "color": "#A2A2A2" });
//         $('#txtPassword').css({ "border-color": "initial" });
//     }
// });

function checkEmail(){
    var email = document.getElementById("txtEmail").value;
    var filter = /^([a-xA-Z0-9\_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(email)){
        document.getElementById("infEmail").style.color = "#d41c1c";
        document.getElementById("txtEmail").style.borderColor = "#d41c1c";
        // document.getElementById("txtEmail").focus();
        return false;
    }
    else{
        document.getElementById("infEmail").style.color = "#A2A2A2";
        document.getElementById("txtEmail").style.borderColor = "initial";
        return true;
    }
}

function checkPassword(){
    var password = document.getElementById("txtPassword").value;
    if (password.length == 0) {
        document.getElementById("infPassword").style.color = "#d41c1c";
        document.getElementById("txtPassword").style.borderColor = "#d41c1c";
        // document.getElementById("txtPassword").focus();
        return false;
    }
    else{
        document.getElementById("infPassword").style.color = "#A2A2A2";
        document.getElementById("txtPassword").style.borderColor = "initial";
        return true;
    }
}

function formValidate(){
    var check = 0;
    if (!checkEmail()) {
    	document.getElementById("infEmail").style.color = "#d41c1c";
        document.getElementById("txtEmail").style.borderColor = "#d41c1c";
        document.getElementById("txtEmail").focus();
        check--;
    }
    else{
        document.getElementById("infEmail").style.color = "#A2A2A2";
        document.getElementById("txtEmail").style.borderColor = "initial";
        check++;
    }

    if (!checkPassword()) {
    	document.getElementById("infPassword").style.color = "#d41c1c";
        document.getElementById("txtPassword").style.borderColor = "#d41c1c";
        document.getElementById("txtPassword").focus();
        check--;
    }
    else{
        document.getElementById("infPassword").style.color = "#A2A2A2";
        document.getElementById("txtPassword").style.borderColor = "initial";
        check++;
    }

    if (check == 2) return true;
    else return false;
}
