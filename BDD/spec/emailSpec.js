//Valid Email address
describe("Valid Email address",function(){
it(("Valid email"),function()
{
	expect(true).toBe(isValid("email@domain.com"));
});
it(("Digits in email "),function()
{
	expect(true).toBe(isValid("111111@domain.com"));
});
it(("Digits in domain  "),function()
{
	expect(true).toBe(isValid("email@122.com"));
});
it(("Digits in domain and email"),function()
{
	expect(true).toBe(isValid("111111@122.com"));
});
it(("email and domain with single charactor"),function()
{
	expect(true).toBe(isValid("e@d.com"));
});
it(("Dash in address field is valid"),function()
{
	expect(true).toBe(isValid("firstname-lastname@domain.com"));
});


});

//Invalid Email address
describe("Invalid Email address",function(){
it(("to check email empty"),function()
{
	expect(false).toBe(isValid(""));
});

it(("to check email with only have space"),function()
{
	expect(false).toBe(isValid("   "));
});

it(("to check email with space"),function()
{
	expect(false).toBe(isValid("s.gmail  .com"));
});

it(("Missing @ sign and domain"),function()
{
	expect(false).toBe(isValid("shubham"));
});

it(("Missing username"),function()
{
	expect(false).toBe(isValid("@domain.com"));
});

it(("Missing @"),function()
{
	expect(false).toBe(isValid("email.domain.com"));
});

it(("Two @ sign"),function()
{
	expect(false).toBe(isValid("email@domain@domain.com"));
});

it(("Leading dot in address is not allowed"),function()
{
	expect(false).toBe(isValid(".email@domain.com"));
});
it(("Trailing dot in address is not allowed"),function()
{
	expect(false).toBe(isValid("email.@domain.com"));
});
it(("Multiple dots"),function()
{
	expect(false).toBe(isValid("email..@domain.com"));
});
it(("Missing top level domain (.com/.net/.org/etc)"),function()
{
	expect(false).toBe(isValid("email@domain"));
});
it(("Multiple dot in the domain portion is invalid"),function()
{
	expect(false).toBe(isValid("email@domain..com"));
});


});

