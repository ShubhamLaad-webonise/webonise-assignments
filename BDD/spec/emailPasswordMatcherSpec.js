describe("A Spec for Email", function () {
    beforeEach(function () {
        jasmine.addMatchers({
           checkEmail: function () {
                return {
                    compare: function (actual) {
		        return {
                            pass: isValidEmail(actual)
                        };
                    }
                };
            }
        });

    });

 
//Valid emails
 
	it(("Valid email"),function()
	{
	expect("email@domain.com").checkEmail();
	});
	it(("Dash in address field is valid"),function()
	{
	expect("email@domain.com").checkEmail();
	});

	it(("Invalid email with empty"),function()
	{
	expect("").not.checkEmail();
	});
	it(("Invalid email with space"),function()
	{
	expect("  ").not.checkEmail();
	});
	it(("Invalid email with only domain"),function()
	{
	expect("domain").not.checkEmail();
	});


});

describe("A Spec for Password", function () {
    beforeEach(function () {
        jasmine.addMatchers({
            checkPassword: function () {
                return {
                    compare: function (actual) {
		        return {
                            pass: isValidPassword(actual)
                        };
                    }
                };
            }
        });

    });

	it(("Valid Password with at least one number, a special character and a character"),function()
	{
	expect("11111wwww@@@").checkPassword();
	expect("wwwww11111@@@").checkPassword();
	expect("@@@WWW445").checkPassword();
	});
	it(("with one number, alphabet and a special character"),function()
	{
	expect("1@e").checkPassword();
	});
//Invalid Password
	it(("Invalid password with empty"),function()
	{
	expect("").not.checkPassword();
	});
	it(("Invalid password with space"),function()
	{
	expect("   ").not.checkPassword();
	});
	it(("Invalid password with only char or only special char or only number"),function()
	{
	expect("ssss").not.checkPassword();
	expect("11111").not.checkPassword();
	expect("@@@@@@").not.checkPassword();
	});


});


