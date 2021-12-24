
## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```
java.runtime.version=17.0.1
```

1. Crear una cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador (ejecutar únicamente la primera vez que se instala git)
   1. `git config --global user.name "jgonzalezoria"`
   2. `git config --global user.email jgonzalezoria@gmail.com`
3. Subir el proyecto a Github desde Intellij IDEA desde la opción: VCS > Share project on GitHub
4. Desde Heroku, crear app y elegir método GitHub y buscar el repositorio subido
5. Habilitar deploy automático y ejecutar el deploy


## Proveedores Cloud

* Heroku -- Java, Spring, PostgreSQL
* Netlify -- Frontend (React, Angular ....)
* Vercel -- Frontend (React, Angular ....)