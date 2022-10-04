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
    console.log(`función restar: ${a}-${b}=${a-b}`)
}
restar(5,7)
restar(33,22)
restar(53,4)

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


// funciones que devuelven un valor
function multiplicar(a,b) {
    return a*b
}

let result=multiplicar(3,4)
result+=10
console.log(`resultado multiplicación + 10 ${result}`)

// ejemplo de uso de función que devuelve un valor
function calcularSueldo(categoria) {
    let sueldo=70000

    switch (categoria) {
        case "A":
            porcentaje=10
            break;
        case "B":
            porcentaje=25
            break;
        case "C":
            porcentaje=35
            break;
                
        default:
            break;
    }
    //suma a la var sueldo el %
    sueldo+=sueldo*porcentaje/100

    return sueldo
}

let sueldo1=calcularSueldo("A")
let sueldo2=calcularSueldo("B")
let sueldo3=calcularSueldo("C")
let sueldo4=calcularSueldo("A")

console.log(`Sueldo de empleado 1 ${sueldo1}`)
console.log(`Sueldo de empleado 2 ${sueldo2}`)
console.log(`Sueldo de empleado 3 ${sueldo3}`)
console.log(`Sueldo de empleado 4 ${sueldo4+1000}`)

// funcion flecha
function dividir(a,b) {
    return a/b
}

dividir(32,3)

let dividirFlecha=(a,b)=>a/b
dividirFlecha(5,4)
dividirFlecha(51,24)

let sumaFlecha=(a,b)=>a+b

let calcularSueldoFlecha=(categoria)=>{
    let sueldo=70000

    switch (categoria) {
        case "A":
            porcentaje=10
            break;
        case "B":
            porcentaje=25
            break;
        case "C":
            porcentaje=35
            break;
                
        default:
            break;
    }
    //suma a la var sueldo el %
    sueldo+=sueldo*porcentaje/100

    return sueldo
}

//Función anónima
let raiz=function(a) {
    return Math.sqrt(a);
};
console.log(raiz(16))

//flecha
let raizFlecha=(a)=>Math.sqrt(a)
console.log(raizFlecha(16))

//kcomun
function raizComun(a) {
    return Math.sqrt(a)
}

/** Array
 * variable especial puede contener más de un valor a la vez
*/

let sueldo10=70000
let sueldo11=78000
let sueldo12=123213
let sueldo13=123213
let sueldo14=123213
// sueldo10=aumentarSueldo(sueldo10)
console.log(sueldo10)
sueldo11+=sueldo11*10/100

let sueldos=[70000,75000,60000,89000,445000,56550]
sueldos[0] //consulto el sueldo en la posición 0 70000
sueldos[4]
sueldos[5]=57000 //modifico el valor de la posición 5
sueldos[4]=45000

for (let i = 0; i < sueldos.length; i++) {
    console.log(sueldos[i])
    sueldos[i]+=sueldos[i]*10/100  //modificos sueldos[i] y lo aumento un 10%
    console.log(`sueldo con aumento ${sueldos[i]}`)
}

let aumentarSueldo=(sueldo)=>sueldo+=sueldo*10/100

let arrayTipos=[111,"dfsdf",true,222]
console.log(arrayTipos)

// array propiedades y métodos
sueldos.length //long del array 6
console.log(sueldos)
sueldos.sort() //ordena el array y lo modifica
console.log(sueldos)
sueldos.pop()
console.log(sueldos)
sueldos.push(100000)
console.log(sueldos)
console.log(sueldos.indexOf(82500)) //devuelve la posición donde encuentra el valor
console.log(sueldos.indexOf(66000)) //devuelve la posición donde encuentra el valor
console.log(sueldos.indexOf(2000)) //devuelve la posición donde encuentra el valor

// matrices
let butacas=[
    ["A1", "A2", "A3"], //fila A
    ["B1", "B2", "B3", "B4"], //fila b
    ["C1", "C2", "C3"] //fila c
]
butacas[0][2] //B3

for (let i = 0; i < butacas.length; i++) {
    console.log(butacas[i])
    for (let j = 0; j < butacas[i].length; j++) {
        console.log(butacas[i][j])
    }
}

//for of, for each java php
for(suel of sueldos) {
    console.log(suel)
}

for (fila of butacas) {
    for (colum of fila) {
        console.log(colum)
    }
}