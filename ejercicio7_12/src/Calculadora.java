public class Calculadora {
    private double a;
    private double b;
    private double c;

    public Calculadora(double a, double b, double c){
        setA(a);
        this.b = b;
        this.c = c;
    }

    public void setA(double a){
        if (a == 0){
            System.out.println("'a' no puede ser 0");
            this.a = 1;
        }else {
            this.a = a;
        }
    }
    public void setB(double b){this.b = b;}
    public void setC(double c){this.c = c;}

    public double getDiscriminante(){
        return Math.pow(b, 2) - (4 * a * c);
    }

    public boolean isDiscrimantePositivo(){
        return getDiscriminante() > 0;
    }
    public double[] solucion(){
         double[] soluciones;
         double disc = getDiscriminante();

         if(disc < 0){
             System.out.println("La ecuacion no tiene soluciones reales");
             soluciones = new double[0];
         }else {
             double x1 = (-b + Math.sqrt(disc)) / (2 * a);
             double x2 = (-b - Math.sqrt(disc)) / (2 * a);
             soluciones = new double[]{x1, x2};
         }
         return soluciones;
    }
}
