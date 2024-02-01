package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Telefono;

public interface TelefonoService {

public List<Telefono> telefonos(int idEmpleado);
public void eliminarTelefonos (int idEmpleado);
public void persistirTelefono (int idEmpleado, Telefono telefono);

}
