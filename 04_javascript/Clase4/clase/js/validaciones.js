
function validarUsu() {
    console.log("ingreso al validar usu")
    let usu=document.getElementById("usu").value
    console.log(usu)

    //DOM Document Object Model
    console.log(usu.length)
    if (usu.length==0) {
        document.getElementById("msjUsu").innerHTML="El usuario no puede estar vacío"
    } else if (usu.indexOf("@")==-1) { //busca en usu un @, sino lo encuentra devuelve -1
        document.getElementById("msjUsu").innerHTML="El usu debe contener un @"
    } else if (usu.indexOf("codoACodo.edu.ar")==-1) { //busca en usu un @, sino lo encuentra devuelve -1
        document.getElementById("msjUsu").innerHTML="El usu debe ser del dominio codoACodo.gob.ar"
    } else {
        document.getElementById("msjUsu").innerHTML="El usu es correcto"
        document.getElementById("msjUsu").className="bg-info rounded my-2 px-2 text-center"
    }
}


function updFortaleza() {
    console.log("ingreso updfort")
    let pass=document.getElementById("pass").value
    console.log(pass)

    if (pass.length<=4) {
        document.getElementById("msjPass").innerHTML="Fortaleza Baja"
        document.getElementById("msjPass").className="bg-danger rounded my-2 px-2 text-center"
    } else if(pass.length>4 && pass.length<=8) {
        document.getElementById("msjPass").innerHTML="Fortaleza Media"
        document.getElementById("msjPass").className="bg-warning rounded my-2 px-2 text-center"
    } else {
        document.getElementById("msjPass").innerHTML="Fortaleza Alta"
        document.getElementById("msjPass").className="bg-info rounded my-2 px-2 text-center"

    }
}