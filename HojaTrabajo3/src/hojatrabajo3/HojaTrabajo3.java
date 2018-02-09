/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

/**
 *
 * @author David Soto y Jose Cifuntes
 */
import java.io.*;

public class HojaTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        try{
            
            //File archivo = new File("C:\\Users\\uriel\\Desktop\\UVG\\Algoritmos y Estruct. Datos\\Hojas de Trabajo\\HT3\\numeros.txt");
            File archivo = new File("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT3\\HojaTrabajo3\\HojaTrabajo3\\src\\hojatrabajo3\\numeros.txt");
            FileWriter escribir = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter(escribir);
            bw.write("");
            
            int numero=500;
            for(int i = 0; i < numero; i++){
                int aleatorio = (int)(Math.random()*numero);
                escribir.write(String.valueOf(aleatorio));
                escribir.write("\r\n");
                System.out.print(aleatorio+"-");
            }
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir"); 
        }
        
        
        
    }
    
}
