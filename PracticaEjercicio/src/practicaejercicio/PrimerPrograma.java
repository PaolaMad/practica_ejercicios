package PracticaEjercicio;

public class PrimerPrograma{
    public static void main(String[] args) {
    
        int random;
        random = (int)(Math.random()*10); 
        
        for (int i = 0; i < 10; i++) {
            
            if (random != i) {
                System.out.println(random);
            }
        }
    }
}
