/**
 * @author Jose Cifuentes
 * @author David Soto
 * @version 09.02.2018
 */
package hojatrabajo3;


import java.io.*;

public class HojaTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        try{
            
            File archivo = new File("./numeros.txt");
            //File archivo = new File("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT3\\HojaTrabajo3\\HojaTrabajo3\\src\\hojatrabajo3\\numeros.txt");
            FileWriter escribir = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter(escribir);
            bw.write("");
            
            int numero=10;
            for(int i = 0; i < numero; i++){
                int aleatorio = (int)(Math.random()*3000);
                escribir.write(String.valueOf(i));
                escribir.write("\r\n");
                System.out.print(i+"-");
            }
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir"); 
        }
        
        
        
    }
    
}
