## 📚 Índice de Ejercicios

- [🧪 Ejercicio 1: Invertir un String](#-ejercicio-1-invertir-un-string)
- [🧪 Ejercicio 2: Encontrar el número máximo en un array](#-ejercicio-2-encontrar-el-número-máximo-en-un-array)
- [🧪 Ejercicio 3: Verificar si un String es un palíndromo](#-ejercicio-3-verificar-si-un-string-es-un-palíndromo)
- [🧪 Ejercicio 4: Contar vocales en un String](#-ejercicio-4-contar-vocales-en-un-string)
- [🧪 Ejercicio 5: Sumar múltiplos de 3 en un array](#-ejercicio-5-sumar-múltiplos-de-3-en-un-array)
- [🧪 Ejercicio 6: Buscar un nombre en una lista ignorando mayúsculas](#-ejercicio-6-buscar-un-nombre-en-una-lista-ignorando-mayúsculas)
- [🧪 Ejercicio 7: Clase Persona con saludo y verificación de mayoría de edad](#-ejercicio-7-clase-persona-con-saludo-y-verificación-de-mayoría-de-edad)
- [🧪 Ejercicio 8: Clase Producto con cálculo de total y descuento](#-ejercicio-8-clase-producto-con-cálculo-de-total-y-descuento)
- [🧪 Ejercicio 9: Clase Libro con descripción, páginas y evaluación de longitud](#-ejercicio-9-clase-libro-con-descripción-páginas-y-evaluación-de-longitud)
- [🧪 Ejercicio 10: Clase Empleado con herencia de Persona](#-ejercicio-10-clase-empleado-con-herencia-de-persona)
- [🧪 Ejercicio 11: Clases Animal, Perro y Gato con herencia y @Override](#-ejercicio-11-clases-animal-perro-y-gato-con-herencia-y-override)
- [🧪 Ejercicio 12: Clase Vehiculo con subclase Auto y método sobrescrito](#-ejercicio-12-clase-vehiculo-con-subclase-auto-y-método-sobrescrito)


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

## 🧪 Ejercicio 5: Sumar múltiplos de 3 en un array

### Enunciado

Dado un array de números enteros, sumar todos los que sean múltiplos de 3.

**Ejemplo:**

- Input: `{1, 3, 5, 6, 9, 11}`
- Output: `18`

### 📖 Explicación línea por línea

- `int[] numeros = {1, 3, 5, 6, 9, 11};`  
  Se define el array de números enteros.

- `int suma = 0;`  
  Se declara una variable acumuladora.

- `for (int i = 0; i < numeros.length; i++):`  
  Recorre el array de principio a fin.

- `if (numeros[i] % 3 == 0):`  
  Verifica si el número actual es múltiplo de 3.

- `suma += numeros[i];`  
  Si lo es, lo suma a la variable `suma`.

- `System.out.print(suma);`  
  Imprime el resultado final de la suma.

## 🧪 Ejercicio 6: Buscar un nombre en una lista ignorando mayúsculas

### Enunciado

Dada una lista de nombres, permitir al usuario ingresar uno por consola y verificar si está presente en la lista, sin importar las mayúsculas o minúsculas.

**Ejemplo:**

- Lista: `["Lucas", "Noe", "Pollito", "Ana"]`
- Entrada: `"ana"`
- Output: `true`

### 📖 Explicación línea por línea

- `List<String> nombres = new ArrayList<>();`  
  Se crea una lista de nombres.

- `nombres.addAll(List.of(...));`  
  Se agregan los elementos a la lista.

- `Scanner scanner = new Scanner(System.in);`  
  Se crea un objeto para leer desde consola.

- `String nombreBuscado = scanner.nextLine().toLowerCase();`  
  Se lee lo ingresado y se convierte a minúscula.

- `for (String nombre : nombres):`  
  Recorre cada elemento de la lista.

- `if (nombre.toLowerCase().equals(nombreBuscado)):`  
  Compara ambos en minúscula para que no importe el formato.

- `encontrado = true; break;`  
  Si lo encuentra, marca como `true` y corta el bucle.

- `System.out.print(encontrado);`  
  Muestra si se encontró o no.

## 🧪 Ejercicio 7: Clase Persona con saludo y verificación de mayoría de edad

### Enunciado

Crear una clase `Persona` con nombre y edad. La persona puede saludar e indicar si es mayor de edad.

### 📖 Explicación línea por línea

- `class Persona`  
  Define una clase con atributos `nombre` y `edad`.

- `public Persona(String nombre, int edad)`  
  Constructor que inicializa los datos al crear el objeto.

- `void saludo()`  
  Método que imprime un saludo personalizado con nombre y edad.

- `boolean esMayorDeEdad()`  
  Devuelve `true` si la edad es mayor o igual a 18.

- En el `main`, se crea una persona y se ejecutan ambos métodos.

## 🧪 Ejercicio 8: Clase Producto con cálculo de total y descuento

### Enunciado

Crear una clase `Producto` que contenga nombre, precio y cantidad. Implementar métodos para calcular el total sin descuento y aplicar un descuento porcentual.

### 📖 Explicación línea por línea

- `class Producto`  
  Clase con atributos `nombre`, `precio` y `cantidad`.

- `public Producto(String nombre, double precio, int cantidad)`  
  Constructor que carga los datos iniciales del producto.

- `public double calcularTotal()`  
  Devuelve el precio total multiplicando `precio * cantidad`.

- `public double aplicarDescuento(double porcentaje)`  
  Calcula un porcentaje de descuento y lo resta al total.

- En el `main`, se crea un producto y se imprimen sus detalles, el total sin descuento y el total con descuento.

## 🧪 Ejercicio 9: Clase Libro con descripción, páginas y evaluación de longitud

### Enunciado

Crear una clase `Libro` que contenga título, autor y cantidad de páginas. Implementar métodos para mostrar la descripción, indicar si el libro es largo y calcular cuántas páginas faltan leer.

### 📖 Explicación línea por línea

- `class Libro`  
  Clase con atributos `titulo`, `autor` y `paginas`.

- `public Libro(String titulo, String autor, int paginas)`  
  Constructor para cargar los datos del libro.

- `void mostrarDescripcion()`  
  Muestra un texto con una breve sinopsis fija del libro.

- `boolean esLargo()`  
  Devuelve `true` si el libro tiene 300 páginas o más.

- `int paginasRestante()`  
  Calcula cuántas páginas quedan por leer, restando las leídas (fijas en 100).

- En el `main`, se crea un objeto `Libro`, se muestran sus datos, la sinopsis, las páginas restantes y si es largo o no.

## 🧪 Ejercicio 10: Clase Empleado con herencia de Persona

### Enunciado

Crear una clase `Empleado` que herede de `Persona`, agregando sueldo base y bono. Implementar métodos para mostrar los datos, calcular el sueldo total y verificar si tiene bono.

### 📖 Explicación línea por línea

- `class Persona`  
  Clase base con atributos `nombre` y `edad`.

- `class Empleado extends Persona`  
  Clase que hereda de `Persona` y agrega nuevos atributos.

- `super(nombre, edad)`  
  Llama al constructor de la clase base (`Persona`) desde el constructor de `Empleado`.

- `void mostrarDatos()`  
  Imprime los datos del empleado incluyendo sueldo base y bono.

- `double calcularSueldoTotal()`  
  Devuelve la suma del sueldo base más el bono.

- `boolean tieneBono()`  
  Retorna `true` si el bono es mayor a cero.

- En el `main`, se crea un `Empleado`, se invocan métodos heredados y propios, y se imprime toda la información.

## 🧪 Ejercicio 11: Clases Animal, Perro y Gato con herencia y @Override

### Enunciado

Crear una clase base `Animal` con atributos `nombre` y `edad`, y un método `hacerSonido()`. Luego, crear las subclases `Perro` y `Gato`, sobrescribiendo el método para emitir un sonido diferente. Mostrar la información y los sonidos usando `@Override`.

### 📖 Explicación línea por línea

- `class Animal`  
  Clase base con atributos y método `hacerSonido()` genérico.

- `class Perro extends Animal`  
  Hereda de `Animal` y sobrescribe el método `hacerSonido()` con `¡Guau guau!`.

- `class Gato extends Animal`  
  También hereda y sobrescribe el método con `Miau miau...`.

- `@Override`  
  Indica que se está reemplazando un método heredado.

- En el `main`, se crean instancias de `Perro` y `Gato`, se imprime su información y se llama a los métodos sobrescritos.

## 🧪 Ejercicio 12: Clase Vehiculo con subclase Auto y método sobrescrito

### Enunciado

Crear una clase base `Vehiculo` con atributos `marca`, `modelo` y `anio`, y un método `mostrarDetalles()`. Luego, crear una subclase `Auto` con el atributo adicional `puertas`, sobrescribiendo el método para mostrar también esa información.

### 📖 Explicación línea por línea

- `class Vehiculo`  
  Clase base con atributos y un método que imprime la información del vehículo.

- `class Auto extends Vehiculo`  
  Subclase que hereda los atributos de `Vehiculo` y agrega uno nuevo: `puertas`.

- `super(...)`  
  Llama al constructor de la clase base para reutilizar el código.

- `@Override`  
  Permite redefinir el método `mostrarDetalles()` para incluir las puertas.

- En el `main`, se crea un objeto `Auto` y se muestra toda su información.
