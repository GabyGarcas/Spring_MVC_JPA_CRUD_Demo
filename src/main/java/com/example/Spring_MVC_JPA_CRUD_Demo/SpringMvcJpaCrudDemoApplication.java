package com.example.Spring_MVC_JPA_CRUD_Demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Correo;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Departamento;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Empleado;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Genero;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Telefono;
import com.example.Spring_MVC_JPA_CRUD_Demo.services.CorreoService;
import com.example.Spring_MVC_JPA_CRUD_Demo.services.DepartamentoService;
import com.example.Spring_MVC_JPA_CRUD_Demo.services.EmpleadoService;
import com.example.Spring_MVC_JPA_CRUD_Demo.services.TelefonoService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
//Muy importante el @RequiredArgsConstructor para poder usar los servicios de cada tabla



public class SpringMvcJpaCrudDemoApplication implements CommandLineRunner{


//Procedemos a ingresar los servicios de cada entidad

private final EmpleadoService empleadoService;
private final DepartamentoService departamentoService;
private final CorreoService correoService;
private final TelefonoService telefonoService;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcJpaCrudDemoApplication.class, args);
	}
// imagenes y todas las cosas que quieras que se vean hay que ponerlas en una carpeta static

	@Override
	public void run(String... args) throws Exception {
		
//Primero creamos Departamento (porque es el padre de las demas tablas), para eso usamos el patron builder
// no se usa el patron record porque serian inmutables, por ello hay que usar el patron builder de lombok

Departamento dpt1 = Departamento.builder().nombre("RRHH").build();

Departamento dpt2 = Departamento.builder().nombre("INFORMATICA").build();

Departamento dpt3 = Departamento.builder().nombre("CONTABILIDAD").build();

Departamento dpt4 = Departamento.builder().nombre("FINANZAS").build();

departamentoService.persistirDpto(dpt1);
departamentoService.persistirDpto(dpt2);
departamentoService.persistirDpto(dpt3);
departamentoService.persistirDpto(dpt4);


//Ahora crearemos empleados

//Creamos el empleado1

Empleado empleado1 = Empleado.builder()
.nombre("Almudena")
.primerApellido("Lopez")
.segundoApellido("Ramirez")
.genero(Genero.MUJER)
.departamento(departamentoService.dameUnDepartamento(1))
.fechaDeAlta(LocalDate.of(2010,Month.JUNE, 20))
.salario(2500)
.build();



Empleado empleado2 = Empleado.builder()
.nombre("Ramon")
.primerApellido("Castillo")
.segundoApellido("Alvarado")
.genero(Genero.HOMBRE)
.departamento(departamentoService.dameUnDepartamento(3))
.fechaDeAlta(LocalDate.of(2000,Month.APRIL, 30))
.salario(2000)
.build();

// empleadoService.persistirEmpleado(empleado1);
// empleadoService.persistirEmpleado(empleado2);

//Es importante agregar telefonos y correos antes de crear el empleado.
//Detalle: como hacer para crear telefonos y correos sin idEmpleado?
//Procedemos:


//Telefonos 

//Telefonos de empleado1

List<Telefono> telefonosEmpleado1 = new ArrayList<>();

Telefono telefonoEmpleado1 = Telefono.builder()
.nombre("697804446")
.build();


Telefono telefono2Empleado1 = Telefono.builder()
.nombre("414461987")
.build();

telefonosEmpleado1.add(telefonoEmpleado1);
telefonosEmpleado1.add(telefono2Empleado1);

//telefonoService.persistirTelefono(0, telefonoEmpleado1);
//telefonoService.persistirTelefono(0, telefono2Empleado1);



//Telefonos de empleado2

List<Telefono> telefonosEmpleado2 = new ArrayList<>();

Telefono telefonoEmpleado2 = Telefono.builder()
.nombre("697804476")
.build();


Telefono telefono2Empleado2 = Telefono.builder()
.nombre("414461967")
.build();

telefonosEmpleado2.add(telefonoEmpleado2);
telefonosEmpleado2.add(telefono2Empleado2);

// telefonoService.persistirTelefono(0, telefonoEmpleado2);
// telefonoService.persistirTelefono(0, telefono2Empleado2);

//__________________________________________________________________________________________________
//Creamos los correos 
//Correo del empleado1

List<Correo> correosEmpleado1 = new ArrayList<>();

Correo correoEmpleado1 = Correo.builder()
.correo("almudena@capgemini.com")
.build();


Correo correo2Empleado1 = Correo.builder()
.correo("almuLopez@capgemini.com")
.build();

correosEmpleado1.add(correoEmpleado1);
correosEmpleado1.add(correo2Empleado1);

// correoService.persistirCorreos(0, correoEmpleado1);
// correoService.persistirCorreos(0, correo2Empleado1);


//Correo del empleado2

List<Correo> correosEmpleado2 = new ArrayList<>();

Correo correoEmpleado2 = Correo.builder()
.correo("ramon@capgemini.com")
.build();


Correo correo2Empleado2 = Correo.builder()
.correo("rCastillo@capgemini.com")
.build();

correosEmpleado2.add(correoEmpleado2);
correosEmpleado2.add(correo2Empleado2);

// correoService.persistirCorreos(0, correoEmpleado2);
// correoService.persistirCorreos(0, correo2Empleado2);

	}
}
