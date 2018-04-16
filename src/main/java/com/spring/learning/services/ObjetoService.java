package com.spring.learning.services;

import com.spring.learning.models.Objeto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjetoService {

    public void crear(Objeto objeto){}

    public void modificar(Objeto objeto){}

    public void borrar(int id){}

    public Objeto buscar(int id){ return null;}

    public List<Objeto> listar(){
        List<Objeto> result = new ArrayList<>();
        for (int i = 1; i < 10 ; i++){
            Objeto objeto = new Objeto();
            objeto.setId(i);
            objeto.setNombre("Nombre"+i);
            result.add(objeto);
        }
        return result;
    }

}
