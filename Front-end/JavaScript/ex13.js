let email=document.getElementById("email");
let password=document.getElementById("password");
let emailerror=document.getElementById("emailerror");
let passworderror=document.getElementById("passworderror");
function emailValidate(){
    let emailValue=email.value;
    let pattern=/^[^@\s]+@[^@\s]+\.[^@\s]+$/;
    if (email.value ===""){
        emailerror.innerHTML="Please enter  email";
        return false;
        }
        else if (!pattern.test(emailValue)){
            emailerror.innerHTML="Invalid email";
            return false;
        }
        else{
            emailerror.innerHTML="";
        }
    }

function passwordValidate(){
    let passwordValue=password.value;
     if(vqlue===""){
        passworderror.innerHTML="Please enter password";
        return false;
        }
        else {
            passworderror.innerHTML="";
            return true;
        }
     }
     email.addEventListener("blur",emailValidate);
     password.addEventListener("blue",passwordValidate);
     form.addEventListener("submit", function(e) {
  e.preventDefault();
  const validEmail = validateEmail();
  const validPassword = validatePassword();

  if (validEmail && validPassword) {
    alert("Login successful!");
  }
});

