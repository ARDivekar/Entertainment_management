function onLoadClearForm(){
	var email_in = document.getElementById('email_input');
	var pass_in = document.getElementById('password_input');
	email_in.value="";
	pass_in.value="";
}


function email_verify(email){
	re=/\w+@\w+\.\w+/;
	return re.test(email);
}

function password_verify(pass){
	re=/(?=.*\d+)(?=.*[A-Z]+)(?=.*[!@#$%^&*()?\/]+).{8,}/;
	return re.test(pass);
}



function email_check(){
	valid = true;
	var email_in = document.getElementById('email_input');
	var email_out = document.getElementById('email_output');

	// console.log(email_in.value)
	if (email_verify(email_in.value)){
		// console.log("VALID")
		email_out.innerHTML = "VALID EMAIL";
	}
	else {
		// console.log("INVALID")
		valid=false;
		email_out.innerHTML = "INVALID EMAIL";
	}
	return valid;
}



function pass_check(){
	valid = true;
	var pass_in = document.getElementById('password_input');
	var pass_out = document.getElementById('pass_output');
	if (password_verify(pass_in.value)){
		pass_out.innerHTML = "VALID PASSWORD"
	}
	else{
		valid = false;
		pass_out.innerHTML = "INVALID PASSWORD"
	}
	return valid;
}


function showLoginForm(){
	loginForm = document.getElementById('loginForm')
	loginForm.style.display = "block";
	visible="login"	
 //    registerForm = document.getElementById('registerForm')
	// registerForm.style.display = "none";
}





function check_errors(){
	console.log("Submitted form.");
	var error_text="Form could not be submitted: ";
	// console.log("part1")
	var valid=true;
	var email_in = document.getElementById('email_input');
	var pass_in = document.getElementById('password_input');
	// console.log("part2")

	console.log("email_in.value: "+email_in.value)
	console.log("pass_in.value: "+pass_in.value)


	if(email_in.value == "" || email_in.value==undefined ){
		error_text+= "\n\tEmpty email, please fill.";
		valid=false;
	}
	else if(email_check() == false){
		error_text+= "\n\tInvalid email, please correct.";
		valid=false;
	}
	
	
	if(pass_in.value == "" || pass_in.value==undefined ){
		error_text+= "\n\tEmpty password, please fill.";
		valid=false;
	}
	else if(pass_check() == false){
		error_text+= "\n\tInvalid password, please correct.";
		valid=false;
	}

	
	// console.log("part3")
	console.log("\nerror_text: "+error_text)
	if(!valid){
		alert(error_text);
	}
	// console.log("part4")
	if(valid){
		// alert("Form submission successful.")
		window.location.href="./user_profile.htm";
		alert(window.location.href)
	}
	return valid;

}
