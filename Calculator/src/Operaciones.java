 /**
 * @author AlanEduardo
 */
public class Operaciones {
	
    public double sumas(double a,double b){
        return a+b;
    }
    
    public double restas(double a,double b){
        return a-b;
    }
    
    public double mul(double a,double b){
        return a*b;
    }
    
    public double div(double a,double b){
        if(b==0){return -1;}
        return a/b;
    }
    
    
}

