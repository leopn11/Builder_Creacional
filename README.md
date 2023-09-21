# Builder_Creacional

Aplicación creada con el patron Creacional Builder.

Es un patron de diseño de tipo creacional. Nos permite construir objetos complejos progrecivamente. Este patron permite producir diferentes tipos y representaciones de un objeto aplicando el mismo codigo construccion;
Nos es expecialmente util cuando tenemos un objeto que se relaciona con diferentes objetos empleando un solo codigo de construccion que genera todos los objetos.

Primero que todo es crear nuestro proyecto

El proyecto estara basado en un objeto Estudiante que necesita que le pasen los siguientes datos: Acudiente, Direccion, y Colegio siendo todos 
estos tambien objetos. El reto sera que el patron builder nos ayude a constuir paso a paso cada uno de estos objetos empleando una sola parte del codigo.

En nuestro proyecto creamos la interfas IBuilder<T> con el generico T que nos permite implementarla en todas las
clases y con el metodo build().

![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/4ce28f95-bbb4-40f6-9ae3-696c387ed637)

Se crea el paquete domain que lleva nuestros diferentes objetos con sus atributos, constructores y metodos getter y setter.
  1. Los objetos son : Acudiente , Direccion y Colegio

Despues de tener estas clases ya creada pasamos a nuestra clase principal donde vamos a tener como atributos estos diferentes objetos y tambien sus constructores, getters y setters. siendo 
Acudiente un lista y asi tener 1 o mas Acudientes para Estudiante. 

![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/d5827981-a1d2-457c-a290-076f5f52e1d4)

Seguidamente se crea una clase estatica llamada EstudianteBuilder que implementa nuestra interfaz IBuilder, esta tendra los mismos atributos que nuestra clase 
Estudiante y apartir de ella podremos implementar este patron cabe resaltar que esta clase estatica se genera despues de los constructores de nuestra clase estudiante y un nuevo
constructor vacio en nuestra clase estatica. 

![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/1117d9f1-2fc5-4bf6-9a49-f5d9e0e320f4)

Cada atributo en esta clase estatica lo pasamos como un metodo setter para poder acceder a el, constuir nuestros objetos y que se puedan implementar paso a paso como metodos.

![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/d80864dd-6ac4-43b6-9906-c0bccff59dad)

Podemos ver como implementamos nuestros objetos para mostrarlos, tenemos dos formas: Enviamos el objeto ya construido o enviamos sus atributos como parametos pasamos el objeto y retornamos 
el objeto actual. Tambien como tenemos una lista pasamos el metodo add para poder crear varias instancias de este objeto. Y tambien podemos observar 
como aplicamos polimorfismo ya que hay dos metodos que se llaman igual pero que se implementan de forma diferente. Como lo muestra la imagen

![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/c7e3b0e2-db3d-49b4-96d7-827e597b9587)

Despues de estos pasos podemos construir nuestro objeto Estudiante de una manera mas sencilla pasando los demas objetos en una sola parte del codigo

Muestra lo que el objeto recibe:
![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/bad55eaa-bb13-45b7-8b24-d1b3ab116518)

Muestra el el nuevo objeto creado:
![image](https://github.com/leopn11/Builder_Creacional/assets/109111125/f22c9d44-d396-4759-bc05-dc18074f1d9b)


