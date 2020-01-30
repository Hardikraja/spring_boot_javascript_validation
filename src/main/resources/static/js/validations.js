
// function which allows only character in firstname
function onlyAllowAlphabets(event) {
    if((event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123))
    {
        return true;
    }
    else
    {
        return false;
    }
}

//allow numbers only in textbox
function onlyAllowNumber(event) {
    if((event.charCode > 47 && event.charCode < 59)){
        return true;
    }
    else
    {
        return false;
    }
}


//validation of email address
function validateEmail(emailField){
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (reg.test(emailField.value) === false)
    {

        document.getElementById("errorEmail").innerHTML = "Invalid email address";
    }
    else
    {
        document.getElementById("errorEmail").innerHTML = "";
    }
}

//validate mobile number
function validateMobileNumber(numberField){
    if(numberField.value.length !== 10){

        document.getElementById("errorMobile").innerHTML = "Invalid Mobile Number";
    }
    else
    {
        document.getElementById("errorMobile").innerHTML = "";
    }
}

function testPassword(passwordField) {
        var res;
        var str =
            passwordField.value;
        if (str.match(/[a-z]/g) && str.match(
            /[A-Z]/g) && str.match(
            /[0-9]/g) && str.match(
            /[^a-zA-Z\d]/g) && str.length >= 8){

            res = "";
        }

        else
            res = "Password is not valid";
        document.getElementById("errorPassword").innerHTML= res;
}

//check for password
function checkPassword(str) {
    if (str.match(/[a-z]/g) && str.match(
        /[A-Z]/g) && str.match(
        /[0-9]/g) && str.match(
        /[^a-zA-Z\d]/g) && str.length >= 8){

        return true;
    }
    else
    {
        return false;
    }
}



function validateForm() {

    if(document.getElementById("student_mobile").value.length === 10 && /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/.test(document.getElementById("student_email").value) && checkPassword(document.getElementById("student_password").value)){
        return true;
    }
    else
    {
        alert("Form is not valid");
        return false;
    }
}