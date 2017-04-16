function isValidEmail(emailAddress){
//email should have @ . 
var regExp=/^[A-Za-z0-9-_]+[@][A-Za-z0-9]+[.][A-Za-z]+$/;
return (regExp.test(emailAddress));

}

function isValidPassword(password){
//email should have @ . 
var regExp=/^(?=.*[0-9])(?=.*[-_!@#$%^&*])(?=.*[A-Za-z])[a-zA-Z0-9-_!@#$%^&*]*$/;
return (regExp.test(password));

}


