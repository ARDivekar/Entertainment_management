function validateForm() {
    
    
    if(document.myForm.username.value == "") 
    { 
    	alert("Error: Username cannot be blank!"); 
    	document.myForm.username.focus(); 
    	return false; 
    } 
    
    var re = /^\w+$/; 
    if(!re.test(document.myForm.username.value)) 
    { 
    	alert("Error: Username must contain only letters, numbers and underscores!"); 
    	document.myForm.username.focus(); 
    	return false; 
    }

    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }

if(document.myForm.pwd1.value == "" || document.myForm.pwd2.value == "") 
    { 
    	alert("Error: Password cannot be blank!"); 
    	document.myForm.pwd.focus(); 
    	return false; 
    } 

if(document.myForm.pwd1.value != "" && document.myForm.pwd1.value == document.myForm.pwd2.value) 
{ 
	if(document.myForm.pwd1.value.length < 6) 
	{ 
		alert("Error: Password must contain at least six characters!"); 
		document.myForm.pwd1.focus(); 
		return false; 
	} 
	if(document.myForm.pwd1.value == document.myForm.username.value) 
	{ 
		alert("Error: Password must be different from Username!"); 
		document.myForm.pwd1.focus(); 
		return false; 
	} 
	
	re = /[0-9]/; 
	if(!re.test(document.myForm.pwd1.value)) 
	{ 
		alert("Error: password must contain at least one number (0-9)!"); 
		document.myForm.pwd1.focus(); 
		return false; 
	} 

	re = /[a-z]/; 
	if(!re.test(document.myForm.pwd1.value)) 
	{ 
		alert("Error: password must contain at least one lowercase letter (a-z)!"); 
		document.myForm.pwd1.focus(); 
		return false; 
	} 

	re = /[A-Z]/; 
	if(!re.test(document.myForm.pwd1.value)) 
	{ 
		alert("Error: password must contain at least one uppercase letter (A-Z)!"); 
		document.myForm.pwd1.focus(); 
		return false; 
	} 
} 
else 
{ 
	alert("Error: Please check that you've entered and confirmed your password!"); 
	document.myForm.pwd1.focus(); 
	return false; 
} 
}

function BE(X) {
    X.style.background = "WHITE";
}
function FE(X) {
    X.style.background = "lightgrey" ;
}

