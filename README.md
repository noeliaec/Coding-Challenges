# 🚀 Live Coding Challenges

Práctica de ejercicios de programación en Java para entrevistas y mejora de habilidades de lógica.

---

## 🧪 Ejercicio 1: Invertir un String

### Enunciado

Escribir una función que reciba un `String` y devuelva el `String` invertido.

**Ejemplo:**

- Input: `"Playwright"`
- Output: `"thgirwyaPl"`

### 📖 Explicación línea por línea

- `String original = "Playwright";`  
  Se declara una variable `original` con el texto que queremos invertir.

- `String invertido = InvertirTexto(original);`  
  Se llama a la función `InvertirTexto` pasando el string original.

- `System.out.print(invertido);`  
  Se imprime el texto invertido por consola.

- `public static String InvertirTexto(String texto):`  
  Se define el método que invierte un texto recibido.

- `String resultado = "";`  
  Variable vacía que irá acumulando los caracteres en orden inverso.

- `for (int i = texto.length() - 1; i >= 0; i--):`  
  Bucle que empieza desde el último carácter hasta el primero.

- `resultado += texto.charAt(i);`  
  Se concatena el carácter actual al resultado.

- `return resultado;`  
  Se devuelve el string invertido.


## 🧪 Ejercicio 2: Encontrar el número máximo en un array

### Enunciado

Escribir una función que reciba un array de números enteros y devuelva el número más grande.

**Ejemplo:**

- Input: `[2, 34, 56, 12, 5]`
- Output: `56`

### 📖 Explicación línea por línea

- `int[] numeros = {2, 34, 56, 12, 5};`  
  Se declara un array de números enteros.

- `int maximo = encontrarMaximo(numeros);`  
  Se llama al método `encontrarMaximo` pasando el array `numeros`.

- `System.out.println("El número máximo es: " + maximo);`  
  Se imprime el número máximo encontrado.

- `public static int encontrarMaximo(int[] arreglo):`  
  Se define el método que encuentra el número más grande en el array.

- `int max = arreglo[0];`  
  Se inicializa la variable `max` con el primer elemento del array.

- `for (int i = 1; i < arreglo.length; i++):`  
  Bucle que recorre el array empezando desde el segundo elemento.

- `if (arreglo[i] > max):`  
  Se compara el valor actual del array con el valor de `max`.

- `max = arreglo[i];`  
  Si el valor actual es mayor, se actualiza `max`.

- `return max;`  
  Se devuelve el número más grande encontrado.

Crear un programa que verifique si un String es un palíndromo.

Ejemplos:

"racecar" ➔ true

"hello" ➔ false

Parte	Qué hace
izquierda = 0	Arranca en el primer carácter.
derecha = texto.length()-1	Arranca en el último carácter.
while (izquierda < derecha)	Sigue comparando mientras no se crucen.
if (texto.charAt(izquierda) != texto.charAt(derecha))	Si no coinciden, no es palíndromo.
izquierda++ y derecha--	Se acercan hacia el centro.
return true	Si nunca falló, es palíndromo.



