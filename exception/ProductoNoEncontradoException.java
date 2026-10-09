package exception;

/*Excepcion personalizada. Se activa cuando se busca un producto por su id y no existe en el sistema 

Hereda de RuntimeException (exceptciones no chequeadas):
No obliga a quien usa el método a devolver la llamada
en try/catch, pero si permite capturarla cuando nos interesa.

*/

public class ProductoNoEncontradoException extends RuntimeException{
    public ProductoNoEncontradoException(String mensaje){
        super(mensaje);

    }

    
}