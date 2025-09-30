/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20250929;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //intanciamos la variable (referencia o puntero)
        BusquedaBinaria buscar = new BusquedaBinaria ();
        
        //se establece un arreglo unidemensional 
        int []  arreglo = {17,19, 21,23, 25,29,31};
        
         int [][] matriz ={
            {1,3,5},
            {7,9,11},
            {13,15,17},
            };
         
        
        //se establece el valor a buscar
        int a_buscar = 11;
        
        /* se implemneta un metodo correspondiente a la busqueda de valores
           en arreglos unidemensionales y mediante la herencia se realiza la
           ejecucion del metodo buscarEnteroArray(), enviando los parametros necesarios
        */
        int posicion = buscar.BuscarEnteroArray(arreglo, a_buscar);
        if(posicion != -1){
            System.out.println("El valor: "+ a_buscar+ " esta en la posicion: "+ posicion);
        }else{
            //se deduce que le lemento no se encontro
            System.out.println("No se encontro el valor de " +a_buscar);
        }
           //implementacion del metodo busqueda en un matriz
           buscar.buscarEnteroMatriz(matriz, a_buscar);     
   
    }
    
}
