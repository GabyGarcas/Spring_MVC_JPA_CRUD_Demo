package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Departamento;

public interface DepartamentoService {

public List<Departamento> dameDepartamentos();
public Departamento dameUnDepartamento(int idDepartamento);


public void persistirDpto(Departamento departamento);

}
