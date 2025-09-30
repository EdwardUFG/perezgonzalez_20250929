/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perezgonzalez_20250929;

/**
 *
 * @PG
 */
//esta clase se convetira en un onjeto de memoria 
public class BusquedaBinaria {
    
    
    //metodo para realizar una busqueda binaria de un arreglo
    public int BuscarEnteroArray(int [] arreglo, int valorBuscado){
         //se declaran las variables de inicio a fin
        int inicio =0;
        int fin = arreglo.length;
         /*serealiza la ejecucion de busqueda
           mientras el arreglo teng al menos 
           un elemento
         */
        while(inicio <= fin){
            
            //se obtiene la poscion del centro del arreglo
             int medio = (inicio + fin)/2;
        
             
        //se evalua sio el elemento en la posicion media es igual al valor buscado     
         if(arreglo[medio]== valorBuscado){    
             return medio;
        } else if (arreglo [medio] < valorBuscado){
            //se evealua si el elemento en la posicion media es menor que el valor buscado
                inicio = medio +1;
        }else{
            //se deduce que es lemento es mayot, por lo tanto, el fin cambia
            fin= medio -1;
        }
                
       }//se devuelve -1 cuando hay elementos encontrados
       return -1; 
    }
    
    
    //metodo para buscar en una matriz
    public void buscarEnteroMatriz(int [][] matriz, int objetivo){
        
        //se declaran las filas y las columnas para conocer la dimesion de la matriz
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        //se establece el inicio y el fin de la matriz
        int inicio =0;
        int fin = (filas * columnas)-1;
        
       //bandera que indica si el valor fue encontrado o no en la matriz
        boolean encontrado = false;
        
        //se realiza una repeticion mientras la matriz posea al menos un elemento 
        while (inicio <= fin){
            
    //se dduce el punto medio de la matriz
            int medio = (inicio + fin)/2; 
            
            int f = medio/columnas;//cual fila es? (cuantas filas existen)
            int c= medio % columnas;//cual es la columna? (posicion exacta de la columna
           
            //se evalua si el valor buscado se encunetra en la posicion media 
            if(matriz [f][c]== objetivo){
             System.out.println("En la matriz, el elemento encontrado esta en la posicion [" + f+ "] ["+c+ "]");
           
             //se establece la bandera como verdadera debido a que se encontro el valor
             encontrado= true;
             break;
        }else if (matriz [f][c] < objetivo){
            inicio = medio +1;
        }else{
           //            
            fin = medio - 1;
        }//fin del while
            
    }//se evalua la bandera por si a caso no encontro ningun valor
    if(encontrado == false){
        //se imprime a la consola
        System.out.println("El elemento buscadi no ha sido encontrado en la matriz");
    }//fin del metodo
  }
}