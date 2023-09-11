a = -2
b = 4;
c = 1
d = 8
f = 9

def operacionesAritmeticas(float a, float b):

    print("Resultado entre " + a + " y " + b + " de las siguientes operaciones:")
    print("Mod: " + a % b)
    print("Suma: " + (a + b) )
    print("Resta: " + (a - b) )
    print("Div: " + a / b)
    print("Mul: " + a * b)
    print("Pow: " + a ** b)

def operacionesAritmeticasBits(int a, int b):
    print("Resultado entre " + a + " y " + b + " de las siguientes operaciones:")
    print("Left Shift: " + (a << b))
    print("Rigth Shift: " + (a >> b) )
    print("AND: " + (a & b) )
    print("OR: " + (a | b))
    print("XOR: " + (a ^ b))

operacionesAritmeticas(a, b)
print()
operacionesAritmeticasBits(c, d)

if f > 0:
    print("el numero es positivo")
elif f < 0:
    print("el numero es menor que cero")
else:
    printf("es cero")

while f:
    print(f)
    f = f - 1

m = math.sqrt(c)
print("Raiz cuadrada de " + c + " = " +  math.sqrt(m))