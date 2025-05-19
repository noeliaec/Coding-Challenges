## 📚 Índice de Ejercicios

- [🧪 Ejercicio 1: Manejo de String – Invertir un texto](#-ejercicio-1-manejo-de-string--invertir-un-texto)
- [🧪 Ejercicio 2: Array – Encontrar el número máximo](#-ejercicio-2-array--encontrar-el-número-máximo)
- [🧪 Ejercicio 3: String – Verificar si es palíndromo](#-ejercicio-3-string--verificar-si-es-palíndromo)
- [🧪 Ejercicio 4: String – Contar vocales](#-ejercicio-4-string--contar-vocales)
- [🧪 Ejercicio 5: Array – Sumar múltiplos de 3](#-ejercicio-5-array--sumar-múltiplos-de-3)
- [🧪 Ejercicio 6: Lista – Buscar nombre ignorando mayúsculas](#-ejercicio-6-lista--buscar-nombre-ignorando-mayúsculas)
- [🧪 Ejercicio 7: POO – Clase Persona con saludo y mayoría de edad](#-ejercicio-7-poo--clase-persona-con-saludo-y-mayoría-de-edad)
- [🧪 Ejercicio 8: POO – Clase Producto con total y descuento](#-ejercicio-8-poo--clase-producto-con-total-y-descuento)
- [🧪 Ejercicio 9: POO – Clase Libro con descripción y evaluación](#-ejercicio-9-poo--clase-libro-con-descripción-y-evaluación)
- [🧪 Ejercicio 10: POO – Herencia en clase Empleado](#-ejercicio-10-poo--herencia-en-clase-empleado)
- [🧪 Ejercicio 11: Herencia – Clases Animal, Perro y Gato con @Override](#-ejercicio-11-herencia--clases-animal-perro-y-gato-con-override)
- [🧪 Ejercicio 12: Herencia – Clase Vehículo y subclase Auto](#-ejercicio-12-herencia--clase-vehículo-y-subclase-auto)
- [🧪 Ejercicio 13: ArrayList – Autos con múltiples filtros](#-ejercicio-13-arraylist--autos-con-múltiples-filtros)
- [🧪 Ejercicio 14: Composición – Relación entre Auto y Motor](#-ejercicio-14-composición--relación-entre-auto-y-motor)
- [🧪 Ejercicio 15: HashMap – Productos y operaciones clave-valor](#-ejercicio-15-hashmap--productos-y-operaciones-clave-valor)
- [🧪 Ejercicio 16: Set – Lista sin duplicados](#-ejercicio-16-set--lista-sin-duplicados)
- [🧪 Ejercicio 17: Herencia y Composición – Sistema de autos con filtros](#-ejercicio-17-herencia-y-composición--sistema-de-autos-con-filtros)
- [🧪 Ejercicio 18: Composición – Catálogo de celulares con estructuras](#-ejercicio-18-composición--catálogo-de-celulares-con-estructuras)
- [🧪 Ejercicio 19: Estructura Stack – Simulación de vidas en un videojuego](#-ejercicio-19-estructura-stack--simulación-de-vidas-en-un-videojuego)

# 🚀 Live Coding Challenges

Práctica de ejercicios de programación en Java para entrevistas y mejora de habilidades de lógica.

---

## 🧪 Ejercicio 1: Manejo de String – Invertir un texto
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio1_Manejo_String.java)

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


## 🧪 Ejercicio 2: Estructura Array – Encontrar el número máximo
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio2_Estructura_Array.java)

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

## 🧪 Ejercicio 3: Manejo de String – Verificar si es palíndromo
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio3_Manejo_String_Palindromo.java)

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

## 🧪 Ejercicio 4: Manejo de String – Contar vocales
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio4_Manejo_String_Vocales.java)

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

## 🧪 Ejercicio 5: Estructura Array – Sumar múltiplos de 3
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio5_Estructura_Array_Suma.java)

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

## 🧪 Ejercicio 6: Estructura Lista – Buscar nombre ignorando mayúsculas
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio6_Estructura_Lista_Busqueda.java)

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

## 🧪 Ejercicio 7: POO – Clase Persona con saludo y mayoría de edad
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio7_POO_Clase_Persona.java)

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

## 🧪 Ejercicio 8: POO – Clase Producto con total y descuento
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio8_POO_Clase_Producto.java)

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

## 🧪 Ejercicio 9: POO – Clase Libro con descripción y evaluación
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio9_POO_Clase_Libro.java)

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

## 🧪 Ejercicio 10: POO – Herencia en clase Empleado
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio10_POO_Herencia_Empleado.java)

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

## 🧪 Ejercicio 11: Herencia – Clases Animal, Perro y Gato con @Override
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio11_Herencia_Animal_Override.java)

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

## 🧪 Ejercicio 12: Herencia – Clase Vehículo y subclase Auto
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio12_Herencia_Vehiculo_Auto.java)

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

## 🧪 Ejercicio 13: Colección ArrayList – Autos con múltiples filtros
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio13_Coleccion_ArrayList_Filtros.java)

### Enunciado

Crear una lista (`ArrayList`) de objetos `Auto` y aplicar filtros utilizando métodos booleanos para determinar si el auto es nuevo, si es Fiat y si tiene 4 puertas. Solo se muestran los autos que cumplen con **todas las condiciones**.

### 📖 Detalles clave

- Se usó `ArrayList<Auto>` para almacenar múltiples autos.
- Cada objeto `Auto` tiene atributos como `marca`, `modelo`, `anio`, y `puertas`.
- Se aplican condiciones con `&&` dentro de un `for` para filtrar autos.

## 🧪 Ejercicio 14: Composición – Relación entre Auto y Motor
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio14_Composicion_Auto_Motor.java)

### Enunciado

Crear una clase `Motor` con tipo y cilindrada, y una clase `Auto` que contiene un objeto `Motor` como atributo. Mostrar toda la información del auto incluyendo sus datos de motor.

### 📖 Detalles clave

- Se implementó **composición**: `Auto` tiene un `Motor` como atributo.
- Cada `Motor` contiene `tipo` (ej: "Nafta") y `cilindrada` (ej: 1.6).
- En el método `mostrarDetalles()` del auto se imprime también la información del motor usando `motor.mostrarMotor()`.

## 🧪 Ejercicio 15: HashMap – Productos y operaciones clave-valor
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio15_Estructura_HashMap.java)
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio15_Estructura_HashMap_Productos.java)

### Enunciado

Crear un `HashMap<String, Double>` que represente productos y sus precios. Utilizar operaciones como agregar (`put`), obtener (`get`), verificar existencia (`containsKey`), eliminar (`remove`) y recorrer el mapa.

### 📖 Detalles clave

- Se usó `HashMap` para representar relaciones tipo `producto → precio`.
- Se recorrió el mapa con un `for` sobre `keySet()` para mostrar clave y valor.
- Se trabajó con claves únicas (`String`) y valores numéricos (`Double`).

## 🧪 Ejercicio 16: Set – Lista sin duplicados
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio16_Estructura_Set_SinDuplicados.java)

### Enunciado

Utilizar un `Set<String>` para guardar una lista de valores únicos (por ejemplo, nombres de frutas). Verificar cómo el set automáticamente elimina duplicados.

### 📖 Detalles clave

- Se utilizó `HashSet` como implementación de `Set`.
- Al intentar agregar valores repetidos, el `Set` los ignora.
- Se recorrió el set con un `for` para mostrar todos los valores únicos.

## 🧪 Ejercicio 17: POO con Herencia y Composición – Sistema de autos
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio17_POO_Composicion_Herencia_Autos.java)

### Enunciado

Crear un sistema que modele autos utilizando herencia (`Auto` hereda de `Vehiculo`) y composición (`Auto` contiene un objeto `Motor`). Los autos se almacenan en un `ArrayList`, se filtran según criterios lógicos y se complementan con estructuras `HashMap` para precios y `Set` para marcas únicas.

### 📖 Detalles clave

- `Vehiculo`: clase base con `marca`, `modelo`, `anio`
- `Auto`: subclase con `puertas` y `motor` como atributo
- `Motor`: clase con `tipo` y `cilindrada`, más un método `esNafta()`
- Se filtran autos que:
  - Sean Fiat
  - Sean del año 2020 en adelante
  - Tengan motor naftero
- Se usa `HashMap<String, Double>` para registrar precios por modelo
- Se usa `Set<String>` para obtener marcas únicas de la lista

## 🧪 Ejercicio 18: Composición – Catálogo de celulares con estructuras
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio18_Composicion_Celulares_Estructuras.java)

### Enunciado

Crear un sistema que modele celulares usando clases con herencia y composición. Cada `Celular` hereda de `Dispositivo` y contiene un objeto `Bateria`. Se deben aplicar filtros por marca, batería, año, y mostrar los resultados. Además, almacenar los precios con un `HashMap` y listar las marcas únicas usando un `Set`.

### 📖 Detalles clave

- `Dispositivo`: clase base con atributos comunes (`marca`, `modelo`, `anio`)
- `Celular`: hereda de `Dispositivo`, agrega `pantalla` y una `Bateria`
- `Bateria`: clase con `capacidad` y `tipo`, e incluye métodos para evaluar potencia
- Se utilizaron `ArrayList` para almacenar múltiples celulares
- Se aplicaron filtros para:
  - Solo celulares Samsung
  - Baterías mayores o iguales a 5000 mAh
  - Celulares del 2022 en adelante
  - Mostrar el “mejor” celular según criterios compuestos
- Se usó `HashMap<String, Double>` para precios por modelo
- Se usó `Set<String>` para obtener marcas únicas sin duplicados

## 🧪 Ejercicio 19: Estructura Stack – Simulación de vidas en un videojuego
[📄 Ver código](https://github.com/noeliaec/Coding-Challenges/blob/main/src/main/java/org/challenges/Ejercicio19_Estructura_Stack_Vidas.java)

### Enunciado

Simular un sistema de vidas en un videojuego. El jugador comienza con 3 vidas (`❤️`) apiladas en un `Stack`. Por cada golpe recibido (`🪓`), se pierde una vida (`pop()`). El juego muestra visualmente las vidas restantes y finaliza con un mensaje de "Game Over" si no queda ninguna.

### 📖 Detalles clave

- Se utiliza `Stack<String>` para representar las vidas
- Se cargan 3 corazones usando `push()`
- Por cada golpe (`🪓` en un array), se realiza un `pop()` si la pila no está vacía
- Se imprime visualmente cuántas vidas quedan
- Si el jugador se queda sin vidas, se muestra un mensaje de "💀 GAME OVER 💀"
