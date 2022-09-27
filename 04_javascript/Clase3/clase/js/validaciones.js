
function validarEmail() {
    console.log("ingreso al validar email")
    let email=document.getElementById("email").value
    console.log(email)

    //DOM Document Object Model
    if (email.length==0) {
        document.getElementById("mensaje").innerHTML="Debe ingresar algún caractér"
    } else if (email.indexOf("@")==-1) { //busca en email un @, sino lo encuentra devuelve -1
        document.getElementById("mensaje").innerHTML="El email debe contener un @"
    } else if (email.indexOf("codoACodo.gob.ar")==-1) { //busca en email un @, sino lo encuentra devuelve -1
        document.getElementById("mensaje").innerHTML="El email debe ser del dominio codoACodo.gob.ar"
    } else {
        document.getElementById("mensaje").innerHTML="El email es correcto"
        document.getElementById("mensaje").className="bg-info m-2"
    }
}

function fortalezaPass() {
    console.log("ingreso fortaleza")
}