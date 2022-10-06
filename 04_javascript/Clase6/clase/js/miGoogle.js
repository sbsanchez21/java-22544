//simula lenguaes obtenidos desde la base de datos en un servidor
let lenguajes=["java","javascript","jquery","php","python","haskell","c","c++","ruby on rail"]

function mostrarSugerencias() {
    //filtra los lenguajes con consciden con buscarLenguajes
    let lenguajesFiltrados=lenguajes.filter(buscarLenguaje)

    //mostrarlo en el html el array filtrado
    document.getElementById("msj").innerHTML=lenguajesFiltrados
}



function buscarLenguaje(lenguaje) {
    //obteiene el valor que ingreso el usuario en el input
    let q=document.getElementById("q").value

    //devuelve true si encontro la cadena ingresada en el usuario en el lenguaje i
    let encontro=lenguaje.indexOf(q)!=-1

    return encontro
}

function mostrarSugerenciasAbreviado() {
    document.getElementById("msj").innerHTML=lenguajes.filter(buscarLenguaje)
}

function buscarLenguajeAbreviado(lenguaje) {
    return lenguaje.indexOf(document.getElementById("q").value)!=-1
}