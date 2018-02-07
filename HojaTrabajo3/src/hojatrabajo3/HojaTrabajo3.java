/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

/**
 *
 * @author David
 */
import java.io.*;

public class HojaTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        try{
            File archivo = new File("C:\\Users\\uriel\\Desktop\\UVG\\Algoritmos y Estruct. Datos\\Hojas de Trabajo\\HT3\\numeros.txt");
            FileWriter escribir = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter(escribir);
            bw.write("");
            
            for(int i = 0; i < 2999; i++){
                int aleatorio = (int)(Math.random()*1000);
                escribir.write(String.valueOf(aleatorio)+"\n");
            }
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir"); 
        }
        String conten;
        try{
        //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("C:\\Users\\uriel\\Desktop\\UVG\\Algoritmos y Estruct. Datos\\Hojas de Trabajo\\HT3\\numeros.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
    
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((conten =contenido.readLine())!=null)
            {
                System.out.println(conten);
            }
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
    }
    
}
