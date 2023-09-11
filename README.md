# Pasos a seguir

Si se realiza algún cambio en la gramática, para obtener los archivos generados por el ANTLR4 se usa:

```java
java org.antlr.v4.Tool -visitor -no-listener Python.g4  
```

Una vez generados los archivos del ANTLR, para compilar las clases java generadas más las definidas se usa:

```java
javac -cp '.;antlr-denter-1.2-SNAPSHOT.jar;antlr-4.7.2-complete.jar' *.java
```

aqui se añade al classpath de esos archivos la biblioteca de antlr y la biblioteca antlr-denter, 
esta última biblioteca es para la identificación de los tokens IDENT y DEDENT en la gramática, 
está añadida como un plugin que funciona en el parser generado, en el archivo Python.g4 , 
al inicio está el cádigo necesario para usar esta biblioteca, que lo necesario es importar dicha biblioteca,
instanciar la clase DenterHelper a la  cual se le dice que sobrescriba el método del nextToken.

para correr el intérprete es necesario pasarle como parámetro al main la dirección del programa que queremos interpretar:

```java
java -cp '.;antlr-denter-1.2-SNAPSHOT.jar;antlr-4.7.2-complete.jar' Main <<direccion_programa>>
```

Ej:
```java
java -cp '.;antlr-denter-1.2-SNAPSHOT.jar;antlr-4.7.2-complete.jar' Main .\clasesDePrueba\1.py
```


Si se quiere ver el arbol sintáctico generado, se hace :

```java
java -cp '.;antlr-4.7.2-complete.jar;antlr-denter-1.2-SNAPSHOT.jar'  org.antlr.v4.gui.TestRig Python program -gui <<direccion_programa>>
```

Ej:
```java
 java -cp '.;antlr-4.7.2-complete.jar;antlr-denter-1.2-SNAPSHOT.jar'  org.antlr.v4.gui.TestRig Python program -gui .\clasesDePrueba\1.py
 ```