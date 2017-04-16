//Valid Password
describe("Valid password address",function(){
it(("with one alphabet, number and a special character"),function()
{
	expect(true).toBe(isValid("e1-")); //toBe
});
it(("with one number, alphabet and a special character"),function()
{
	expect(isValid("1s@")).toBeTruthy(); //toBeTruthy
});
it(("with one number, a special character and a character"),function()
{
	expect(isValid("1@a")).not.toBeFalsy(); //toBeFalsy
});
it(("with at least one number, a special character and a character"),function()
{	var passwords=["1111@@@@@aaaaaaa","@@@@@aaaaaaa1111","@@@@@33333AAAA"];
       for(var password of passwords)
	expect(true).toBe(isValid(password));
	
});

});

//Invalid Password

describe("Invalid password address with",function(){
it(("empty"),function()
{
	expect(false).toBe(isValid(""));
});
it(("space"),function()
{
	expect(false).toBe(isValid("    "));
});
it(("only character"),function()
{
	expect(false).toBe(isValid("character"));
});

it(("special characters"),function()
{
	expect(false).toBe(isValid("@@@@@-----___"));
});
it(("empty"),function()
{
	expect(false).toBe(isValid(""));
});
it(("numbers"),function()
{
	expect(false).toBe(isValid("222222222"));
});
it(("only have two things"),function()
{
	expect(false).toBe(isValid("11111zzzzz"));
	expect(false).toBe(isValid("zzzz@@@@"));
	expect(false).toBe(isValid("@@@zzzz"));
});
it(("null"),function()
{
 expect(null).toBeNull();
});

});
