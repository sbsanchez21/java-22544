//simulación datos obtenidos de la base de datos
let lenguajes=["java","javascript","ajax","c","c++", "php","python","prolog","haskell"]


function mostrarSugerencias() {
    console.log("ingresó")
    let lenguajesFiltrados=lenguajes.filter(contieneTexto)
    document.getElementById("msj").innerHTML=lenguajesFiltrados
}

function contieneTexto(lenguaje, indice, lenguajes) {
    //q="j"
    let q=document.getElementById("q").value
    /**
     * lenguaje="java", posTexto=0, return true
     * lenguaje="javascript", posTexto=0, return true
     * lenguaje="ajax", posTexto=1, return false
     * lenguaje="c", posTexto=-1, return false
     */
    let posTexto=lenguaje.indexOf(q) //indexOf sino encuentra la cadena devuelve -1

    return posTexto==0
}
