# Tarea ejercicio-semanal-final

- Crear una aplicación springboot/rest
- EXPONER un endpoint que utilice RestTemplate para CONSUMIR algún endpoint de mercadolibre.
  ej: https://developers.mercadolibre.com.ar/es_ar/categorias-y-publicaciones

- EXPONER un endpoint que utilice Feign para CONSUMIR algún endpoint a elección.
  Ayuda: https://javatodev.com/how-to-use-feign-client-in-spring-boot/

## RestTemplate endpoint category MELI


```
method GET --> http://localhost:8080/category-meli/MLA5725
```

## Feing from instantwebtools Airlines
```
method GET --> http://localhost:8080/airlines
method GET --> http://localhost:8080/airlines?airlineId=2
```