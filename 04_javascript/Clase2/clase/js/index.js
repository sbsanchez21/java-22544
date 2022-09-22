console.log("Ingreso al jsaaa");

// var ok = confirm("Usted es mayor de edad")

// variables
// var usuario = prompt("Ingrese su nombre de usuario")
// console.log("usuario:"+usuario)

// es mejor usar let
// var nombre;
let nombre = "Juan";
console.log("nombre:"+nombre)

// variable numérica, cadenas
// asignación de valores
// let pi = 3.14
let edad = 34
let apellido = "Suarez"
let hoyLlueve = true

// modificación de valores
edad = 35
apellido = "Rodriguez"

// operar con var
let a = 4
let b = 5
console.log("suma:" + (a+b) )

// concatenar var string
let nom= "Juan"
let ape= "Suarez"

let nomApe = nom + " " + ape
console.log(nomApe)

console.log("Bienvenido" + nom + " " + ape + "a nuestra página")
console.log(`Bienvenido ${nom} ${ape} a nuestra página`) //alt + 96

// operadores aritméticos
let c=5
let d=6
let j="5"
let result = c + j
console.log(`suma: ${c+d}`)
console.log(`suma: ${result}`)
console.log(`resta: ${c-d}`)
console.log(`resta: ${c*d}`)
console.log(`resta: ${c/d}`)

// operadores comparación
console.log(`igualdad: ${c==d}`)
console.log(`igualdad: ${c==j}`)
console.log(` no igualdad: ${c!=j}`)
console.log(`mayor: ${c>=j}`)

console.log(c<=j)
console.log(c<=j)
console.log(c<=j)
console.log(c==j)
console.log(c===j)

edad = 36
if (edad >= 18) {
    console.log("es mayor de edad")

} else {
    console.log("NO es mayor de edad")
}


// operadores lógicos
let usu 
// usu = prompt("Ingrese su nombre de usuario")
let pass 
// pass = prompt("Ingrese su password")

//and &&
if (usu=="san@gmail.com" && pass=="1234") {
    console.log("usu y pass correctos")
} else {
    console.log("usu y pass INcorrectos")
    
}

//or ||
let estaLloviendo  = false
let hayPronosticoLluvia = false
if (estaLloviendo || hayPronosticoLluvia) {
    console.log("llevar paragüas")
} else {
    console.log("No llevar p")
}


// estructuras de control
// condicional
if (edad >= 18) {
    // ingresarpágina

}

if (estaLloviendo) {
    console.log("llevar paragüas")
} else {
    console.log("No llevar paragüas")
}

edad = 65
if (edad <=18) {
    console.log("niño o joven")
} else if(edad > 18 && edad <=60) {
    console.log("adulto")
} else {
    console.log("anciano")
}

// var, let, const
if (true) {
    var x = 3
    let y = 5
}

console.log(x)
// console.log(y)

const mayorEdad = 18
// mayorEdad= 19
const pi = 3.14

// switch
let nroMes = 2
switch (nroMes) {
    case 1:
        console.log("Enero")
        break;

    case 2:
        console.log("Febrero")
        break;

    case 3:
        console.log("Marzo")
        break;
            
    default:
        console.log("No existe el mes")
        break;
}

// iterador
for (let i = 0; i < 4; i++) {
    console.log(`iteración ${i}`) //0 1 2 3 
}

// miesntras
let n = 0
while (n < 4) {
    console.log(n)
    n++
}


while (usu!="san@gmail.com" || pass!="1234") {
    usu = prompt("Ingrese su nombre de usuario")
    pass = prompt("Ingrese su password")
    
    //and &&
    if (usu=="san@gmail.com" && pass=="1234") {
        console.log("usu y pass correctos")
    } else {
        console.log("usu y pass INcorrectos")
        
    }
}