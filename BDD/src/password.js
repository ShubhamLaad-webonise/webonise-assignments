function isValid(password){
//email should have @ . 
var regExp=/^(?=.*[0-9])(?=.*[-_!@#$%^&*])(?=.*[A-Za-z])[a-zA-Z0-9-_!@#$%^&*]*$/;
return (regExp.test(password));

}
