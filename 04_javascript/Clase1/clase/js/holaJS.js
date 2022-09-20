//código js
//ejemplo de lógica en el front-end
// var ok = confirm("Usted es mayor de edad?");

// //ejemplo de lógica en el front-end
// if (ok) {
//     //ejemplo de html dinámico
//     document.write("<div style='background-color: lightblue;''>Bienvenidos a la página</div> ");
// } else {
//     //ejemplo de html dinámico
//     document.write("<div style='background-color: red;'>Usted es menor de edad, No puede ingresar </div>");            
// }

var edad = prompt("Ingrese su edad?");
console.log("edad= " + edad);

if (edad >= 18) {
    console.warn("ingreso al true");
    document.write("<div style='background-color: lightblue;'>Bienvenidos a la página</div> ");
    
} else {
    console.error("ingreso al else");
    document.write("<div style='background-color: red;'>Usted es menor de edad, No puede ingresar </div>");            
}