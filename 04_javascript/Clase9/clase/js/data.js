console.log(document.getElementById("mensaje1"))
console.log(document.getElementsByClassName("text-center"))

//queryselecto permite buscar elementos en html con un selector css
console.log(document.querySelector("#mensaje1"))
console.log(document.querySelector(".text-center")) //devuelve el primero que encuentra
console.log(document.querySelector(".text-center.bg-danger")) //devuelve el primero que encuentra
console.log(document.querySelector(".text-center.bg-danger.p-4")) //devuelve el primero que encuentra
console.log(document.querySelectorAll(".text-center")) //devuevle todos los que encuentra
console.log(document.querySelectorAll(".text-center.bg-danger")) //devuelve el primero que encuentra

/**
 * Node nos permite crear elementos, agregar hijos y eliminarlos
 */
let contador=0
function addInput() {
    let input=document.createElement("input")
    input.setAttribute("type","text")
    contador++
    input.setAttribute("id",`nombre${contador}`)
    input.setAttribute("class","form-control ")
    input.setAttribute("placeholder",`Datos hijo ${contador}`)

    let btn=document.createElement("button")
    btn.setAttribute("id",`btn${contador}`)
    btn.setAttribute("class","btn btn-primary mb-3")
    btn.setAttribute("onclick",`delInput('nombre${contador}','btn${contador}')`)
    let texto=document.createTextNode("Eliminar")
    btn.appendChild(texto)

    let datos=document.querySelector("#datos")
    datos.appendChild(input)
    datos.appendChild(btn)
}

function delInput(idInput, idBtn) {
    let datos=document.querySelector("#datos")
    let input=document.getElementById(idInput)
    let btn=document.getElementById(idBtn)
    datos.removeChild(input)
    datos.removeChild(btn)
}