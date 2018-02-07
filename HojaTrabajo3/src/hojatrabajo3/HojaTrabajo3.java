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
        int[] arreglo = new int[19999];
        try{
            File archivo = new File("C:\\Users\\uriel\\Desktop\\UVG\\Algoritmos y Estruct. Datos\\Hojas de Trabajo\\HT3\\numeros.txt");
            FileWriter escribir = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter(escribir);
            bw.write("");
            
            for(int i = 0; i < 19999; i++){
                int aleatorio = (int)(Math.random()*1000);
                escribir.write(String.valueOf(aleatorio)+"\n");
            }
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir"); 
        }
        String conten; //Variable que va a recibir el contenido de cada linea del texto
        try{
        //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("C:\\Users\\uriel\\Desktop\\UVG\\Algoritmos y Estruct. Datos\\Hojas de Trabajo\\HT3\\numeros.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            int contador = 0;
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((conten =contenido.readLine())!=null)
            {
                
                int numerico = Integer.parseInt(conten);
                arreglo[contador] = numerico;
                contador = contador + 1;   
            }
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
        //COPIAS DEL ARREGLO DESORDENADO PARA PODER PROBAR CON CADA SORT
        int [] copia = new int[19999];
        copia = arreglo;
        int [] copia1 = new int[19999];
        copia1 = arreglo;
        int [] copia2 = new int[19999];
        copia2 = arreglo;
        int [] copia3 = new int[19999];
        copia3 = arreglo;
        int [] copia4 = new int[19999];
        copia4 = arreglo;
        //Aplcar los metodos
        MergeSort.mergesort(copia);
        GnomeSort.gnomeSort(arreglo);
    }
    
}
