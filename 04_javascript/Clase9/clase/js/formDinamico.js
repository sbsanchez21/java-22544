let cont=1
function addHijo() {
    let row=document.createElement("div")
    row.setAttribute("class","row")

    let div1=document.createElement("div")
    div1.setAttribute("class","col-md")

    cont++
    let inputNombre=document.createElement("input")
    inputNombre.setAttribute("type","text")
    inputNombre.setAttribute("id",`nombreHijo${cont}`)
    inputNombre.setAttribute("class","form-control mb-3")
    inputNombre.setAttribute("placeholder",`Nombre Hijo ${cont}`)
    // inputNombre.setAttribute("onfocus",resaltar)

    div1.appendChild(inputNombre)

    let div2=document.createElement("div")
    div2.setAttribute("class","col-md")

    let inputApe=document.createElement("input")
    inputApe.setAttribute("type","text")
    inputApe.setAttribute("id",`apellidoHijo${cont}`)
    inputApe.setAttribute("class","form-control mb-3")
    inputApe.setAttribute("placeholder",`Apellido Hijo ${cont}` )
    inputApe.addEventListener("mouseover",cambiarFondo)

    div2.appendChild(inputApe)

    row.appendChild(div1)
    row.appendChild(div2)

    let hijos=document.querySelector("#hijos")
    hijos.appendChild(row)
}

function cambiarFondo() {
    document.body.className="bg-info"
}