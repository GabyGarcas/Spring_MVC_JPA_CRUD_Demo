package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Empleado;

public interface EmpleadoService {
public List<Empleado> dameTodosEmpleados();
public Empleado dameUnEmpleado(int idEmpleado);
public void eliminarEmpleado (int idEmpleado);
public void persistirEmpleado (Empleado empleado);
public void actualizarEmpleado(Empleado empleado);
}
