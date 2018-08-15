package exemplosingletom;

/**
 *
 * @author vitoria.csilva15
 */
public class ExemploSingletom {

    public static void main(String[] args) {
       
        //sempre que declarar esse metodo estatico posso utilizar 
        //em qualquer lugar
        double a = MathTools.getAreaRetangulo(3, 4);
        
        a = MathTools.getPerimetroRetangulo(3, 4);
        
        //Atributos estaticos
        MathTools.PI = 3.1415;
        double c = MathTools.getAreaCircunferencia(11);
    }
    
}
