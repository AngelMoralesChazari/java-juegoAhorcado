import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        String palabraSecreta = "programacion";
        int intentosMax = 5;
        int intentos = 0;
        boolean palabraAdivinada = false;
        
        char letrasAdivinadas[] = new char[palabraSecreta.length()];

        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < intentosMax){

            System.out.println("Palabra a Adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra");
            char letra = Character.toLowerCase(leer.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 
                }
            }
            
            if(!letraCorrecta){
                intentos++;
                System.out.println("!Incorrecto, te quedan : " + (intentosMax - intentos) + " intentos." );
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Adivinaste la palabra secreta " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
             System.out.println("Te has quedado sin intentos, la palabra era: " +palabraSecreta);
        }

        leer.close();
    }
}
