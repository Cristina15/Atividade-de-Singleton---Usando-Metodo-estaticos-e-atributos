package exemplosingletom;

/**
 *
 * @author vitoria.csilva15
 */
public class MathTools {
    
    //garante que a aclasse não permita implementação
    private MathTools(){
        
    }
    
    // exemplo de atributo estatico disponivel em toda a solução
    public static double PI= 3.1;
    
    // exemplo de metodos estatico disponivel em toda a solução
    public static double getAreaCircunferencia(double r){
        return PI*r*r;
    }
    
    
    //atributos em estático se torna itálico,
    //Dois exemplos abaixo de metodo estatico
    public static double getAreaRetangulo(double a, double b){
        
        return a*b;
        
    }
    
    public static double getPerimetroRetangulo(double a, double b){
        return 2*(a+b);
    }
}
