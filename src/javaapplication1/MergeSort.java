
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author César Augusto da Silva Cardoso
 */
public class MergeSort {
    
    static int vetor[] = {12,11,13,5,6,7,9,50};
    static final int TAMANHO = 8; 
    
    
    public static void main(String[] args) {
        System.out.println("Array de entrada");
        printArray(vetor,8);
        
        mergeSort(vetor,0,(TAMANHO-1));
        
        System.out.println("Array ordenado");
        printArray(vetor,TAMANHO);
    }    

public static void merge(int vetor[], int inicio,int meio, int fim){
    int aux[] = new int[fim - inicio+1];
    int i = inicio, j= meio+1, k=0;
    
    while (i <= meio && j <= fim) {
        if(vetor[i] <= vetor[j]){
            aux[k]= vetor[i];
            k++;
            i++;
        }else{
            aux[k]= vetor[j];
            k++;
            j++;
        }
    }
    
    while (i <= meio) {
        aux[k]= vetor[i];
        k++;
        i++;
        
    }
    while(j <= fim){
        aux[k] = vetor[j];
        k++;
        j++;
    }
    i= inicio;
    while(i <= fim){
        vetor[i] = aux[i- inicio];
        i++;
    }
}
    
public static void mergeSort(int vetor[], int inicio, int fim){
    if(inicio < fim){
        int meio = (inicio+fim) / 2;
        mergeSort(vetor,inicio,meio);
        mergeSort(vetor,meio+1,fim);
        merge(vetor,inicio,meio,fim);
    }
}   

public static void printArray(int aux[], int tamanho){
    for(int i=0; i< tamanho;i++){
        System.out.print(aux[i]+ " ");
    }
    System.out.println(" ");
}
    
}