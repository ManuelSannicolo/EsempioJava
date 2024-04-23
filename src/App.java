import java.util.Scanner;

public class App {
    private static Scanner input= new Scanner (System.in);
    public static void ricercaMatrice(double valore, double [] [] matrice){
        int i=0, j=0;
        boolean trovato= false;
        while(i<matrice.length && trovato==false){
            j=0;
            while (j<matrice[0].length && trovato==false){
                if (matrice[i][j]==valore){
                    trovato=true;
                }else{
                    j++;
                }
            } 
            i++;
        }
        if (trovato){
            System.out.println("trovato nella posiione riga "+ (i) + ", colonna " + (j+1));
        }else{
            System.out.println("elemento non trovato");
        }
    }
    public static void main(String[] args) throws Exception {
        double matrice[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,11},{13,14,15,16}};
        ricercaMatrice(3.0,matrice);
        
    }
}
