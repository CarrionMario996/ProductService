# ProductService
Dependencia:
Tener levantado los siguientes servicios:
 - spring-gateway
 - service-auth
 
 
1. Ejecutar comando para clonar repositorio desde consola git 
git clone https://github.com/CarrionMario996/ProductService.git

2. Levantar programa desde su IDE de su preferencia
 
 2.1 Si posee el IDE Intellij seguir siguientes pasos:
 
  2.1.1 Seleccionar opcion file
  
  2.1.2 Seleccionar opcion Open y buscar la ruta donde se clono el proyecto
  
  2.1.3 Una vez encontrado seleccionar el pom.xml y esperar que el IDE termine de descargar las dependencias.

3. Buscar la clase main(ProductServiceApplication) y ejecutarla

Para ejecutar los servicios seguir los siguientes pasos:

4. Crear usuario localhost:9091/api/v1.0.0/auth/create

5. Hacer login para obtener token localhost:9091/api/v1.0.0/auth/login

6. Servicios desarrollados
  6.1 localhost:9090/api/v1.0.0/product/all
    6.1.1 En caso ocupar postman ingresar token en authorization y el tipo de token es Bearer Token
  6.2 localhost:9090/api/v1.0.0/product/{id}
    6.2.2 En caso ocupar postman ingresar token en authorization y el tipo de token es Bearer Token

Comparto link de colleccion de postman: 
