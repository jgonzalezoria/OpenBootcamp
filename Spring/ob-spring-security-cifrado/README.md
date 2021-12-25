
### Cifrado

Es el proceso de codificar la información de su represantación original (texto plano)
a texto cifrado, de manera que solamente pueda ser descrifrado utilizando una clave.

Historia del cifrado:

1. Almacenar contraseña en texto plano
2. Almacenar contraseñas cifradas en una función hash
3. Almacenar contraseñas cifradas en una función hash + salt
4. Almacenar contraseñas cifradas en una función adaptativa + factor de trabajo

La seguridad se gana haciendo que la validación de la contraseña sea costosa computacionalmente.

## Algoritmos en Spring Security

* BCrypt
* PBDKF2
* scrypt
* argon2
