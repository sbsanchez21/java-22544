console.log("ingreso js")

// funciones
let a=4
let b=5
console.log(`a+b=${a+b}`)

// función no se ejecuta sino la llamo
function sumar() {
    console.log(`función sumar: a+b=${a+b}`)
}
// llamé a la función
sumar()
sumar()
a=6
sumar()

// función con parámetros
function restar(a, b) {
    console.log(`a=${a}`)
    console.log(`b=${b}`)
    console.log(`función restar: a-b=${a-b}`)
}
restar(5,7)
restar(33,22)

function raizCuadrada(x) {
    if (x<0) {
        document.getElementById("msjRaiz").innerHTML=`Raíz cuadrada valores negativos no Existe `    
        document.getElementById("msjRaiz").className="bg-danger my-2 px-1 text-center"
    } else {
        let result=Math.sqrt(x)
        console.log(`Raíz cuadrada de ${x}=${result} `)
        document.getElementById("msjRaiz").innerHTML=`Raíz cuadrada de ${x}=${result} `
            
    }

}

raizCuadrada(16)
raizCuadrada(18)