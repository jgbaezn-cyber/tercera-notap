function encontrarMaximo(a, b, c) {
    if (a >= b && a >= c) {
        return a;
    } else if (b >= a && b >= c) {
        return b;
    } else {
        return c;
    }
}

console.log("=== ¿CUÁL ES EL NÚMERO MÁS GRANDE? ===");

const num1 = parseInt(prompt("Ingresa el primer número: "));
const num2 = parseInt(prompt("Ingresa el segundo número: "));
const num3 = parseInt(prompt("Ingresa el tercer número: "));

const maximo = encontrarMaximo(num1, num2, num3);
console.log("-----------------------"); 
console.log("Resultado");
console.log("El número mayor es: " + maximo);