# LCD Display
Solución desarrollada desde cero.

## Observaciones
- En el enunciado se especifica que deberíamos usar el caracter '-', pero se utlizó '_' dado que este fue el que utilizaron en los ejemplos y hace que el resultado se vea mejor.
- Según el enunciado, se recibe el tamaño que se desea que tengan los dígitos, y cada dígito debe medir tamaño+2 de ancho y 2\*tamaño + 3 de alto. Sin embargo, en los ejemplos esto no se cumple. En el primer caso, el tamaño es 2, pero los números miden 4\*5 en lugar de 4\*7. En el segundo ejemplo, el tamaño dado es 3, por lo cual los números deberían medir 5\*9, pero miden 7\*7. En el código se encuentran ambas opciones (en el constructor de la clase Display), pero la que corresponde a las dimensiones como las del ejemplo está comentada.
- No se incluyeron espacios entre las barras horizontales ('_') aunque los ejemplos sí los tuvieran, dado que con las dimensiones especificadas, el resultado era mejor sin los espacios. No obstante, también se encuentra una linea comentada en el método `buildRow` de la clase Display, con la cual se puede incluir un espacio entre cada guión.
- En caso que se cambie el código por alguna de las modificaciones que están comentadas, mencionadas anteriormente, __los tests fallarán__.

## Descripción de la solución
La solución desarrollada cuenta con tres clases
### Display
Es la clase donde se ejecuta toda la lógica. Para instanciar un objeto de esta clase es necesario proporcionarle el número que se va a imprimir y el tamaño que tendrán estos números.
 
El método `buildRow` es la operación más básica de esta clase. Construye una cadena con el ancho correspondiente a un dígito a partir de tres parámetros booleanos que recibe. Estos parámetros indican si comienza por | o no, si el centro va lleno o vacío, y si termina por | o no. Si por ejemplo, cada dígito debería ocupar 4 columnas y se llama `buildRow(true, true, false)` se obtendrá '|__ '. 

`buildRow` es llamado por los métodos correspondientes a cada número, `zeroRow`, `oneRow`, etc., que indican cómo se construye cada fila de un cierto número.

Finalmente, `buildOutput` es el encargado de utilizar todo lo anterior para obtener el resultado deseado. Este método recorre los dígitos a imprimir una vez por cada fila que tendrá el resultado. En cada uno de estos recorridos, pide a los métodos del número correspondiente que generen la n-ésima fila de ese número (siendo n la fila actual que se está construyendo), y va concatenando las cadenas que cada número retorna para obtener las filas completas del resultado.
### Reader
Esta clase únicamente lee el input del usuario, valida cada linea introducida y retorna una colección de Displays.
### Main
Recibe la colección de Displays del Reader e imprime todos los resultados en consola, o en caso que haya un error en los valores introducidos por el usuario, le informa imprimiendo un mensaje en consola.

