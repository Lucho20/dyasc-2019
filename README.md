# dyasc-2019

Para resolver el Fibo3 se tuvieron en cuenta las siguientes decisiones de diseño:
1. Se implementó el padrón de diseño Strategy para desarrollar los distintos tipos de procesamientos de la secuencia de Fibonacci que se visualizan en pantalla o dentro de un archivo.
2. Se mantuvo la clase Program como clase principal en donde se inicializa la ejecución.
3. Se crearon métodos separados que se encargan de cada tipo de formato cargado en los parametros de entrada (-m, -f y -o)