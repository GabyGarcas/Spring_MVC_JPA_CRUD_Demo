package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring_MVC_JPA_CRUD_Demo.dao.DepartamentoDao;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Departamento;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartamentoServiceImpl implements DepartamentoService {

//Inyeccion de dependencia por constructor (DI)
//Es la forma mas usada de inyectar una dependencia, autowire es muy usada tmb
/*
 * Antiguamente, para inyectar una dependencia por constructor
 * Primero: Declarabas la variable del tipo del objeto
 * Segundo: Creabas el constructor y le pasabas el objeto.
 * 
 * Ahora: con LOMBOK lo anterior no es necesario, pero se facilita
 * solamente declarando la variable del objeto y especificando el 
 * modificador final y utilizando la anotación de Lombok @RequiredArgsConstructor 
 */

 //Anteriormente: 
//private DepartamentoDao departamentoDao;

//public DepartamentoServiceImpl(DepartamentoDao departamentoDao){
//this.departamentoDao = departamentoDao;
//}
/////////////////////////////////////////////////////////////////////////////7

//Actualmente: La inyeccion de dependencia por constructor se realiza de la forma
// siguiente, y con la siguiente anotación

private final DepartamentoDao departamentoDao;


    @Override
    public List<Departamento> dameDepartamentos() {
        return departamentoDao.findAll();
        
    }

    @Override
    public Departamento dameUnDepartamento(int idDepartamento) {
        return departamentoDao.findById(idDepartamento).get();
    }

    @Override
    public void persistirDpto(Departamento departamento) {
        departamentoDao.save(departamento);
    }

}
