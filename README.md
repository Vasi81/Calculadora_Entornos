# Calculadora_Entornos
Actividad 2. Control de versiones

**Antes de nada , unificamos el nombre del paquete para nuestras clases.
com.entornos.calculadora

Github:
-creamos el repositorio en github
-Concedemos permisos para realizar push al resto del equipo(es necesario incluir el usuario git de cada miembro del grupo)

Desde la carpeta del proyecto de la calculadora que ya teniamos de antes (desde la consola de comandos):
-Inicializamos git
  git init.
-Creamos la conexion
  git remote add origin https://github.com/Vasi81/Calculadora_Entornos.git

-Nos traemos todos los cambios de la rama main del repositorio remoto.
  git pull orgin main
 
-Guardamos los cambios
  git add .
  git commit -m "comentamos la tarea"
  
-Creamos nuestra rama de desarrollo , en caso es JIG_ED.
  git checkout -b JIG_ED
  
-Nos traemos todo lo que tenemos en main.
  git merge main

-Añadimos a la rama local de desarrollo (JIG_ED) todos los fichero del proyecto,que vamos modificando.
  git add .
  git commit -m “incluimos los cambios que se vayan aplicando”


-Cambiamos a la rama main/master de nuestro local.
  git checkout main/master
  
 -Merge de la rama de desarrollo a main/master
 git merge JIG_ED 
 
 -subimos los cambios al repositorio remoto:
 git pusho origin main (main porque el repositorio remoto tiene la rama main).
  
