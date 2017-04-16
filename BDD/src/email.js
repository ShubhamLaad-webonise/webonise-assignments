function isValid(emailAddress){
//email should have @ . 
var regExp=/^[A-Za-z0-9-_]+[@][A-Za-z0-9]+[.][A-Za-z]+$/;
return (regExp.test(emailAddress));

}
