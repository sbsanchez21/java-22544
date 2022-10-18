//documente hay un arbol con toda la estructa del html
console.log(document)
console.log(document.URL)
console.log(document.body)

console.log(document.getElementsByTagName("button"))
console.log(document.getElementsByClassName)


let p=document.getElementById("hola")
p.onmousemove=resaltarP
p.onmouseleave=opacarP

function resaltarP() {
    p.className="text-center bg-warning"
}

function opacarP() {
    p.className="text-center bg-dark"
}

/**
 * Incrementa el tamaño de la fuente de todo el body
 */
function incFontSize() {
    //modifica el css
    // document.body.style.fontSize="1.5rem"

    //modifica la clase bootstrap
    document.body.className="fs-3"
}

function resaltarFondo() {
    document.body.className="fs-3 bg-warning"
    // document.body.children

    let btnResaltar=document.getElementById("btnResaltar")
    btnResaltar.innerHTML="Opacar Fondo"
    btnResaltar.className="btn btn-info"
    // btnResaltar.onclick=function () {
    //     document.body.className="fs-3 bg-light"
    // }
    btnResaltar.onclick=opacarFondo

}

function opacarFondo() {
    let btnResaltar=document.getElementById("btnResaltar")
    btnResaltar.innerHTML="Resaltar Fondo"
    btnResaltar.className="btn btn-danger"
    btnResaltar.onclick=resaltarFondo
    document.body.className="fs-3 bg-light"
}

function resaltar() {
    document.body.children
    let texto=document.getElementById("texto")
    // console.log(texto)
    texto.className="m-2 p-2 bg-danger"
}

function opacar() {
    let texto=document.getElementById("texto")
    texto.className="m-2 p-2 bg-info"
}

function changeBtnColor() {
    //buscar todos los botones con la etiqueta button
    // let botones=document.getElementsByTagName("button")
    // for (let i = 0; i < botones.length; i++) {
    //     // if (botones[i].id=="btnNoChange") {
            
    //     // } else {
            
    //     // }
       
    //     botones[i].className="btn btn-success"
        
    // }

    botones=document.getElementsByClassName("btn")
    for (let i = 0; i < botones.length; i++) {
        botones[i].className="btn btn-success"
    }    
}

function showMessage() {
    let msjBien=document.getElementById("msjBienvenida")
    msjBien.innerHTML="Bienvenidos a Nuestra Página"
    msjBien.className="text-center bg-warning fs-4 p-2"

    let btnShowMessage=document.getElementById("btnShowMessage")
    btnShowMessage.innerHTML="Ocultar Mensaje Bienvenida"
    btnShowMessage.onclick=hideMessage
    btnShowMessage.className="btn btn-warning text-centet m-4"
}

function hideMessage() {
    let msjBien=document.getElementById("msjBienvenida")
    msjBien.innerHTML=""
    msjBien.className=""

    let btnShowMessage=document.getElementById("btnShowMessage")
    btnShowMessage.innerHTML="Mostrar Mensaje Bienvenida"
    btnShowMessage.onclick=showMessage
    btnShowMessage.className="btn btn-info text-centet m-4"
}