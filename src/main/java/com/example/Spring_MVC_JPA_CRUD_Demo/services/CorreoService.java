package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Correo;


public interface CorreoService {
public List<Correo> dameCorreos(int idEmpleado);
public void eliminarCorreos (int idEmpleado);
public void persistirCorreos (int idEmpleado, Correo correo);

}
