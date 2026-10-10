package service;

import java.util.ArrayList;
import java.util.List;

import exception.ProductoNoEncontradoException;
import model.Producto;
import util.Validador;

 

public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    //Contador para asignar id's unicos
    private static int contadorId = 1;

    //Agregar nuevo producto
    public Producto guardar (Producto p) {
        Validador.validarNombre(p.getNombre());
        Validador.validarPrecio(p.getPrecio());
        Validador.validarStock(p.getStock());
        Validador.validarCategoria(p.getCategoria());

        p.setId(contadorId);
        contadorId++;

        // guardo el producto
        productos.add(p);

        return p;

    }

    //Lista de productos
    public List<Producto> listarTodos(){
        return productos;
    }

    //Busqueda de productos por id
    public Producto obtenerPorId(int id) {
        for(Producto p : productos){
            if(p.getId() == id){
                return p;
            }
        }

        throw new ProductoNoEncontradoException("No se encontro un producto con el id " + id);
    }

    //Actualizar datos de un producto existente
    public Producto actualizar(int id,Producto datos){
        
        Producto p = obtenerPorId(id);

        
        Validador.validarNombre(datos.getNombre());
        Validador.validarPrecio(datos.getPrecio());
        Validador.validarStock(datos.getStock());
        Validador.validarCategoria(datos.getCategoria());

    
        p.setNombre(datos.getNombre());
        p.setPrecio(datos.getPrecio());
        p.setStock(datos.getStock());
        p.setCategoria(datos.getCategoria());

        return p;

    }

    //Eliminar producto
    public void eliminar(int id){
        Producto p = obtenerPorId(id);
        productos.remove(p);
    }

    
}