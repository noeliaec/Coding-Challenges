## 📚 Índice de Ejercicios

- [🧪 Ejercicio 1: Invertir un String](#-ejercicio-1-invertir-un-string)
- [🧪 Ejercicio 2: Encontrar el número máximo en un array](#-ejercicio-2-encontrar-el-número-máximo-en-un-array)
- [🧪 Ejercicio 3: Verificar si un String es un palíndromo](#-ejercicio-3-verificar-si-un-string-es-un-palíndromo)
- [🧪 Ejercicio 4: Contar vocales en un String](#-ejercicio-4-contar-vocales-en-un-string)



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

## 🧪 Ejercicio 3: Verificar si un String es un palíndromo

### Enunciado

Crear un programa que verifique si un `String` es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).

**Ejemplos:**

- `"racecar"` ➔ `true`
- `"hello"` ➔ `false`

### 📖 Explicación línea por línea

- `String palabra = "racecar";`  
  Se define la palabra que se quiere verificar.

- `boolean resultado = esPalindromo(palabra);`  
  Se llama al método `esPalindromo` con la palabra como parámetro.

- `System.out.print(resultado);`  
  Imprime `true` o `false` según si la palabra es un palíndromo.

- `public static boolean esPalindromo(String texto):`  
  Se define el método que evalúa si una palabra es palíndromo.

- `int izquierda = 0;`  
  Puntero al primer carácter del string.

- `int derecha = texto.length() - 1;`  
  Puntero al último carácter del string.

- `while (izquierda < derecha):`  
  Recorre el string desde ambos extremos hacia el centro.

- `if (texto.charAt(izquierda) != texto.charAt(derecha)):`  
  Si los caracteres no coinciden, retorna `false`.

- `izquierda++ y derecha--:`  
  Avanza el puntero izquierdo y retrocede el derecho.

- `return true;`  
  Si todos los pares coinciden, es un palíndromo.

## 🧪 Ejercicio 4: Contar vocales en un String

### Enunciado

Escribir un programa que cuente cuántas vocales (`a, e, i, o, u`) contiene una palabra o frase. No debe importar si las letras están en mayúsculas o minúsculas.

**Ejemplo:**

- Input: `"Playwright es genial"`
- Output: `6`

### 📖 Explicación línea por línea

- `String texto = "Playwright es genial";`  
  Se define el texto que se va a analizar.

- `int cantidad = contarVocales(texto);`  
  Se llama a la función `contarVocales` para obtener la cantidad de vocales.

- `System.out.println("Cantidad de vocales: " + cantidad);`  
  Se imprime el resultado por consola.

- `public static int contarVocales(String texto):`  
  Se define un método para contar las vocales.

- `texto = texto.toLowerCase();`  
  Convierte todo el texto a minúsculas para unificar las comparaciones.

- `for (int i = 0; i < texto.length(); i++):`  
  Recorre el texto letra por letra.

- `char c = texto.charAt(i);`  
  Toma el carácter actual.

- `if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'):`  
  Verifica si el carácter es una vocal.

- `contador++;`  
  Si es una vocal, incrementa el contador.

- `return contador;`  
  Devuelve el total de vocales encontradas.
