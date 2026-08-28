# Markdown Cheat Sheet (Example File)

This is a **generic Markdown template** showcasing essential formatting features.

---
# Informe de Actividades - Programación en Java

## 1. Información del Estudiante
* **Nombre completo:** Danny Nicolas Gutierrez Mejia
* **Programa académico:** Tecnología en Desarrollo de Software
* **Fecha de entrega:** 27 de agosto de 2026

---

## 2. Objetivo de la Actividad
El propósito de esta actividad es afianzar los conceptos fundamentales de la programación estructurada en Java mediante:

* **Diferencia entre preincremento y posincremento:** Comprender la prioridad de evaluación al incrementar el valor de una variable antes (`++variable`) o después (`variable++`) de ser utilizada dentro de una expresión o instrucción.
* **Uso de estructuras condicionales:** Implementar la toma de decisiones utilizando instrucciones `if`, `else if` y `else` para gestionar diferentes flujos de control lógicos según las variables ingresadas por el usuario.

---

## 3. Evidencias

### Capturas de Pantalla de Ejecución
*(Para insertar una imagen en Markdown coloca la ruta o enlace en la sintaxis `![Descripción](ruta-de-la-imagen.png)`)*

* **Programa 1: Sistema de Aprobación de Crédito**
  ![Ejecución Crédito](ruta_o_link_imagen_1.png)
* **Programa 2: Clasificación de Pasajeros de Aerolínea**
  ![Ejecución Aerolínea](ruta_o_link_imagen_2.png)
* **Programa 3: Comparativa de Preincremento y Posincremento**
  ![Ejecución Incrementos](ruta_o_link_imagen_3.png)

### Explicación de Resultados
* **Sistema de Crédito:** El programa evalúa tres condiciones (`ingresos`, `puntajeDeCredito` y `añosLaborados`). Según el cumplimiento de todas o algunas de las condiciones, determina correctamente el estado del crédito (*Aprobado*, *Condicionado* o *No aprobado*).
* **Sistema de Aerolínea:** A través de comparaciones de rangos de vuelos y validación del texto de la membresía mediante `.equalsIgnoreCase()`, el programa clasifica con éxito al usuario en la categoría correspondiente (*Oro*, *Plata* o *Básica*) y evalúa el acceso VIP si se cumplen los requisitos.
* **Preincremento y Posincremento:** La consola refleja que el preincremento modifica e imprime el valor acumulado al instante, mientras que el posincremento evalúa el valor original dentro de la instrucción en curso y realiza el aumento para la instrucción posterior.

---

## 4. Conclusiones

### 1. ¿Cuál es la principal diferencia entre `++variable` y `variable++`?
La diferencia radica en el momento de la ejecución del incremento:
* `++variable` (**Preincremento**): Incrementa el valor de la variable en 1 **antes** de que la variable sea leída o utilizada en la expresión.
* `variable++` (**Posincremento**): Entrega el valor **actual** de la variable para ser utilizado en la expresión y, inmediatamente después de evaluar esa línea, efectúa el incremento en 1.

### 2. ¿Qué estructura `if` considera más adecuada para situaciones complejas y por qué?
La estructura condicional en escalera (`if - else if - else`) o el uso de condicionales anidados con operadores lógicos (`&&`, `||`). Es la más adecuada porque permite evaluar múltiples condiciones mutuamente excluyentes en un orden jerárquico claro, asegurando que solo se ejecute un bloque de código y evitando validaciones innecesarias cuando una condición previa ya se cumplió.

### 3. ¿Qué dificultades encontró durante el desarrollo?
* **Manejo del ámbito de las variables (*scope*):** Comprender la declaración previa de variables fuera de las llaves `{}` para poder utilizarlas más adelante en las impresiones finales de consola.
* **Comparación adecuada de cadenas de texto:** Recordar el uso del método `.equalsIgnoreCase()` o `.equals()` en lugar del operador relacional `=`, el cual asigna valores en lugar de compararlos.
* **Ajuste de límites en rangos numéricos:** Definir correctamente los límites superior e inferior de un rango (por ejemplo, `>= 20 && <= 50`) en las estructuras `else if` para evitar que casos borde cayen de forma indebida en el bloque `else`.

### 4. ¿Qué aprendizajes obtuvo durante la actividad?
* Estructuración limpia del flujo de un programa procesando la entrada de datos, aplicando la lógica de negocio y dejando la salida de resultados (`System.out.println`) al final.
* Aplicación de buenas prácticas en Java para el manejo de variables y tipos de datos primitivos versus tipos por referencia como `String`.
* Creación y documentación estructurada de repositorios de software utilizando archivos en formato Markdown (`README.md`).
    }
}
