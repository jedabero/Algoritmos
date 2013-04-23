
package edu.cuc.math;

/**
 *
 * @author Jedabero
 */
public class Polinomio2 {
    // Declarión de variables
    private int a;  //Coefiente A, se cumple siempre que A!=0
    private int b;  
    private int c;  
    
    //Constructor
    public Polinomio2(int coefA, int coefB, int coefC) throws Exception {
        if(coefA==0){
            throw new Exception("El coeficiente A no puede ser cero (0).");
        }else{
            a = coefA;
            b = coefB;
            c = coefC;
        }
        
        root1 = "";
        root2 = "";
    }
    
    //Roots
    public String root1;
    public String root2;
    
    //Declaración de métodos
    
    public int determinante(){
        int d = (b*b) - (4*a*c);
        return d;
    }
    
    public double resolver() throws Exception {
        int radical = determinante();
        if(radical<0){
            throw new Exception("El discriminante es menor que 0: "+radical);
        }else{
            double raizCuad = Math.sqrt(radical);
            double numerador = -b + raizCuad;
            double denominador = 2*a;
            return (numerador/denominador);
        }
    }
    
    public Polinomio2 sumar(Polinomio2 poli1, Polinomio2 poli2){
        int coefA = poli1.a+poli2.a;
        int coefB = poli1.b+poli2.b;
        int coefC = poli1.c+poli2.c;
        try{
            return new Polinomio2(coefA, coefB, coefC);
        }catch(Exception e){
            return null;
        }
    }
    
    public Polinomio2 sumar(Polinomio2 poli){
        int coefA = this.a+poli.a;
        int coefB = this.b+poli.b;
        int coefC = this.c+poli.c;
        try{
            return new Polinomio2(coefA, coefB, coefC);
        }catch(Exception e){
            return null;
        }
    }
    
    public Polinomio2 restar(Polinomio2 poli){
        int coefA = this.a-poli.a;
        int coefB = this.b-poli.b;
        int coefC = this.c-poli.c;
        try{
            return new Polinomio2(coefA, coefB, coefC);
        }catch(Exception e){
            return null;
        }
    }
    
    public int evaluar(Polinomio2 poli, int dato){
        return (poli.a*dato*dato)+(poli.b*dato)+poli.c;
    }
    
    public boolean comparar(Polinomio2 poli1, Polinomio2 poli2){
        return((poli1.a==poli2.a)&&(poli1.b==poli2.b)&&(poli1.c==poli2.c));
    }
    
    public boolean tieneRaicesReales(){
        return (determinante() >= 0);
        
    }
    
    public boolean opuestos(Polinomio2 poli1, Polinomio2 poli2){
        return((poli1.a*-1==poli2.a)&&(poli1.b*-1==poli2.b)&&(poli1.c*-1==poli2.c));
    }
    
    public boolean esParX2(){
        return(a%2==0);
    }
    
    public int coefCIguales(Polinomio2 poli1, Polinomio2 poli2){
        if(poli1.c>poli2.c){
            return 1;
        }else if(poli1.c==poli2.c){
            return 0;
        }else{//Solo entra aqui cuando poli1.c<poli2.c
            return -1;
        }
    }
    
    public int coefIguales(Polinomio2 poli2, char coef){
        switch(coef){
            case 'a':
                if(this.a>poli2.a){
                    return 1;
                }else if(this.a==poli2.a){
                    return 0;
                }else{
                    return -1;
                }
            case 'b':
                if(this.b>poli2.b){
                    return 1;
                }else if(this.b==poli2.b){
                    return 0;
                }else{
                    return -1;
                }
            case 'c':
                if(this.c>poli2.c){
                    return 1;
                }else if(this.c==poli2.c){
                    return 0;
                }else{
                    return -1;
                }
            default:
                return 10;
        }
    }
    
    public int coefPositivos(){
        int cont = 0;
        if(a>0){
            cont++;
        }
        if(b>0){
            cont++;
        }
        if(c>0){
            cont++;
        }
        return cont;
    }
    
    public int coefImpares(){
        int cont = 0;
        if(a%2!=0){
            cont++;
        }
        if(b%2!=0){
            cont++;
        }
        if(c%2!=0){
            cont++;
        }
        return cont;
    }
    
    public boolean divideTodoCoef(int n){
        if(a%n!=0){
            if(b%n!=0){
                if(c%n!=0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String s = "";
        s += (a!=1)? ((a!=-1)? a : "-" ): "";
        s += "X^2";
        s += (b<0)?(" - "+((b==-1)?"":(-b))) : (" + "+((b==1)?"":(b)));
        s += "X";
        s += (c<0)?" - "+(-c):" + "+c;
        return s += " = 0";
    }
    
    public void calcRoots(){
        double disc = Math.pow(b, 2) - 4*a*c;
        if(disc<0){
            root1 += -b/(2.0*a)+" + "+Math.sqrt(-disc)/(2.0*a)+"*i";
            root2 += -b/(2.0*a)+" - "+Math.sqrt(-disc)/(2.0*a)+"*i";
        }else{
            root1 += (-b + Math.sqrt(disc))/(2.0*a);
            root2 += (-b - Math.sqrt(disc))/(2.0*a);
        }
    }
    
    public static void main(String args[]){
        //1. Declaración de variables
        Polinomio2 poli1;
        Polinomio2 poli2;
        try{
            poli1 = new Polinomio2(1, 11, -1);
            poli2 = new Polinomio2(1, 11, -1);
            System.out.println("Polinomio 1: "+poli1+"\nPolinomio 2: "+poli2);
            System.out.println();
            poli1.calcRoots();
            System.out.println("\nRaiz1:\t"+poli1.root1+"\nRaiz2:\t"+poli1.root2);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
