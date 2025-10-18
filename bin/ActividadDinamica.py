def encontrar_maximo(a, b, c):
    if a >= b and a >= c:
        return a
    elif b >= a and b >= c:
        return b
    else:
        return c

print("=== ¿CUÁL ES EL NÚMERO MÁS GRANDE? ===")

num1 = int(input("Ingresa el primer número: "))
num2 = int(input("Ingresa el segundo número: "))
num3 = int(input("Ingresa el tercer número: "))

maximo = encontrar_maximo(num1, num2, num3)
print("-----------------------") 
print("Resultado")
print(f"El número mayor es: {maximo}")
