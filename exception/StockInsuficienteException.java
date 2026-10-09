package exception;

//Exception para cuando se intenta ingresar un stock inválido (ej: valor negativo)

public class StockInsuficienteException extends RuntimeException{
    public StockInsuficienteException(String mensaje){
        super(mensaje);
    }
}