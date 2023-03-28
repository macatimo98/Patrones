package create.Insertar;

public class WrapperInsertar implements insertarTexto, InsertarBody, InsertarImagen {

    public String insertarBody(String s){
        return s;
    }

    public String insertarTexto(String s){
        return s;
    }

    public String insertarImagen(String route){
        return route;
    }

    
}
