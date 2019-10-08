# dyasc-2019

Para resolver el Fibo3 se tuvieron en cuenta las siguientes decisiones de diseño:
. Se implemento el padrón de diseño Strategy asociado a todos los  formatos finales del mensaje que se visualiza en pantalla o dentro del archivo.
. Se mantuvo la clase Program como clase principal en donde se inicializa la ejecución.
. Se crearon métodos separados que se encargan de cada tipo de formato cargado en los parametros de entrada (-m, -f y -o)