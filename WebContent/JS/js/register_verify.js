function onLoadClearForm(){
	var email_in = document.getElementById('email_input');
	var pass1_in = document.getElementById('password_input1');
	var pass2_in = document.getElementById('password_input2');
	var uname_in = document.getElementById('uname_input');
	var phoneno_in = document.getElementById('phoneno_input');
	email_in.value="";
	pass1_in.value="";
	pass2_in.value="";
	uname_in.value="";
	phoneno_in.value="";
}


function email_verify(email){
	re=/\w+@\w+\.\w+/;
	return re.test(email);

	// if(re.test(email)){ document.write("EMAIL IS VALID") }
	// else{ document.write("EMAIL IS INVALID") }
}

function password_verify(pass){
	re=/(?=.*\d+)(?=.*[A-Z]+)(?=.*[!@#$%^&*()?\/]+).{8,}/;
	return re.test(pass);
}


function phoneno_verify(phoneno){
	re=/(\+91)?\d{10}(?!\w)/;
	var valid = re.test(phoneno);
	valid = valid & re.test(phoneno.split("").reverse().join(""));
	return valid;
}



function showRegisterForm(){
    registerForm = document.getElementById('registerForm')
    registerForm.style.display = "block";
    visible="register";
	// loginForm = document.getElementById('loginForm')
 //    loginForm.style.display = "none";
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



function pass1_check(){
	valid = true;
	var pass1_in = document.getElementById('password_input1');
	var pass1_out = document.getElementById('pass1_output');
	if (password_verify(pass1_in.value)){
		pass1_out.innerHTML = "VALID PASSWORD"
	}
	else{
		valid = false;
		pass1_out.innerHTML = "INVALID PASSWORD"
	}
	return valid;
}




function pass2_check(){
	valid = true;
	var pass1_in = document.getElementById('password_input1');
	var pass2_in = document.getElementById('password_input2');
	var pass2_out = document.getElementById('pass2_output');
	if((pass1_in.value == pass2_in.value) && pass1_in.value!=""){
		pass2_out.innerHTML = "PASSWORDS MATCH"
	}
	else{
		valid = false;
		pass2_out.innerHTML = "PASSWORDS DO NOT MATCH"
	}
	return valid;
}



function phoneno_check(){
	valid = true;
	var phoneno_in = document.getElementById('phoneno_input');
	var phoneno_out = document.getElementById('phoneno_output');
	if(phoneno_verify(phoneno_in.value)){
		phoneno_out.innerHTML = "VALID PHONE NUMBER"
	}
	else{
		valid = false;
		phoneno_out.innerHTML = "INVALID PHONE NUMBER"	
	}
	return valid;
}



function check_errors(){
	console.log("Submitted form.");
	var error_text="Form could not be submitted: ";
	// console.log("part1")
	var valid=true;
	var uname_in= document.getElementById('uname_input');
	var email_in = document.getElementById('email_input');
	// var email_out = document.getElementById('email_output');
	var pass1_in = document.getElementById('password_input1');
	// var pass1_out = document.getElementById('pass1_output');
	var pass2_in = document.getElementById('password_input2');
	// var pass2_out = document.getElementById('pass2_output');
	var uname_in = document.getElementById('uname_input');
	// var uname_out = document.getElementById('uname_output');
	var phoneno_in = document.getElementById('phoneno_input');
	// var phoneno_out = document.getElementById('phoneno_output');
	// console.log("part2")

	console.log("uname_out.value: "+uname_in.value)
	console.log("email_in.value: "+email_in.value)
	console.log("pass1_in.value: "+pass1_in.value)
	console.log("pass2_in.value: "+pass2_in.value)
	console.log("phoneno_in.value: "+phoneno_in.value)


	if(uname_in.value == "" || uname_in.value==undefined ){
		error_text+= "\n\tEmpty username, please fill.";
		valid=false;
	}
	
	if(uname_in.value == "" || uname_in.value==undefined){
		error_text+= "\n\tEmpty username, please fill.";
		valid=false;
	}


	if(email_in.value == "" || email_in.value==undefined ){
		error_text+= "\n\tEmpty email, please fill.";
		valid=false;
	}
	else if(email_check() == false){
		error_text+= "\n\tInvalid email, please correct.";
		valid=false;
	}
	
	
	if(pass1_in.value == "" || pass1_in.value==undefined ){
		error_text+= "\n\tEmpty password, please fill.";
		valid=false;
	}
	else if(pass1_check() == false){
		error_text+= "\n\tInvalid password, please correct.";
		valid=false;
	}

	
	if(pass2_in.value == "" || pass2_in.value==undefined){
		error_text+= "\n\tEmpty re-password, please fill.";
		valid=false;
	}
	else if(pass2_check() == false){
		error_text+= "\n\tInvalid re-password, please correct.";
		valid=false;
	}

	if(phoneno_in.value == "" || phoneno_in.value==undefined){
		error_text+= "\n\tEmpty phone number, please fill.";
		valid=false;
	}
	else if(phoneno_check() == false){
		error_text+= "\n\tInvalid phone number, please correct.";
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
