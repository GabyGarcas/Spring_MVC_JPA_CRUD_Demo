package com.example.Spring_MVC_JPA_CRUD_Demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring_MVC_JPA_CRUD_Demo.dao.CorreoDao;
import com.example.Spring_MVC_JPA_CRUD_Demo.dao.EmpleadoDao;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Correo;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CorreoServiceImpl implements CorreoService {

private final CorreoDao correoDao;
private final EmpleadoDao empleadoDao;

@Override
    public List<Correo> dameCorreos(int idEmpleado) {
       return correoDao.findByEmpleado(empleadoDao.findById(idEmpleado).get());
    }

    
    @Override
    public void eliminarCorreos(int idEmpleado) {
    correoDao.deleteByEmpleado(empleadoDao.findById(idEmpleado).get());
    }

    @Override
    public void persistirCorreos(int idEmpleado, Correo correo) {
    correo.setEmpleado(empleadoDao.findById(idEmpleado).get());
    correoDao.save(correo);
    }



}
