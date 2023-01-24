function checkInp() {

    let name = document.getElementById("name");
    let email = document.getElementById("email");
    let pass = document.getElementById("pass");
    let status = true;

    if (name.value == "" || name.value.length < 3) {
        let nameerr = document.getElementById("nameerr");
        nameerr.innerHTML = "pls fill your name";
            name.classList.add("inperr")
        status = false;
    }
    else{
        nameerr.innerHTML = "";
        name.classList.remove("inperr")
    }
    if (email.value == "") {
        let emailerr = document.getElementById("emailerr");
        emailerr.innerHTML = "pls fill your email";
        status = false;
        if (!email.classList.contains("inperr"))
            email.classList.toggle("inperr")
    }else{
        emailerr.innerHTML = "";
        emailerr.classList.remove("inperr")
    }
    if (pass.value == "") {
        let passerr = document.getElementById("passerr");
        passerr.innerHTML = "pls fill your password";
        status = false;
        if (!pass.classList.contains("inperr"))
            pass.classList.toggle("inperr")
    }else{
        passerr.innerHTML = "";
        passerr.classList.remove("inperr")
    }


    return status;

}