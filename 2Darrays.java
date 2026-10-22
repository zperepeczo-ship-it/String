/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package intraastra.darrays;
 
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author C.Student16
 */
public class App {

    public static void main(String[] args) {
        int [][]b = new int [3][2]; //3 is rows, 2 is columns
        int [][]a = { {3,-8,-9,4},
                      {4,2,3,3},
                      {4,5,6,-2}
                    }; //i is rows and k columns
//        fillArray(b);
//        System.out.println(Arrays.toString(sumOfEachColumn(a)));
//        System.out.println(maxValueIndex(a));
//        System.out.println(Arrays.toString(maxValueInEachRow(a)));
        System.out.println(countHowManyColumnsAreAscending(a));
        }
                
    
public static void fillArray (int[][] x) {
   for (int i=0; i < x.length; i++)
       for (int k = 0; k < x[i].length; k++)  //x[i] is the first column
           x[i][k] = Integer.parseInt(JOptionPane.showInputDialog("Input a number:"));
       }


public static String toString (int[][] a){
    String d = "";
    for (int i=0; i < a.length; i++){
       for (int k = 0; k < a[i].length; k++){
         d = d + " " + a[i][k];
         
    }
       d = d + "\n";
        }
    
return d;     
}

public static int sumOfAllElements (int[][]a){
    int sum = 0;
    for (int i=0; i < a.length; i++){
       for (int k = 0; k < a[i].length; k++){
            sum = sum + a[i][k];
        }
    }
return sum;
}

public static int[] sumOfEachRow (int[][]a){
    int[]b = new int[a.length];

    int sum = 0;
    
    for (int i = 0;i<a.length; i++){ 
        for (int k = 0; k < a[i].length; k++){
            sum = sum + a[i][k];  
        }    
        b[i] = sum;
        sum = 0;
       
    }
return b;   
}


public static int[] sumOfEachColumn (int[][]a){
    int[]b = new int[a[0].length];
    int sum = 0; 
    int j = 0;
    for (int k = 0; k < a[0].length; k++){ 
        for (int i = 0;i<a.length; i++){ 
            sum = sum + a[i][k];
        }    
            b[j] = sum;
            sum = 0;
            j++;
    }
return b;
}


public static int maxValue(int[][]a){
int []b = new int[a.length]; 
int max = a[0][0];
    for (int k = 1; k < a[0].length; k++){
    for (int i = 0;i<a.length; i++){ 
        if (a[i][k] > max){
            max = a[i][k];
        }
            
}
}
return max;
}


public static int[] maxValueInEachRow(int[][]a){   //TO NIE DZIALA TRZEBA NAPRAWIC!!!!
int []b = new int[a.length]; 
int max = a[0][0];

    for (int k = 1; k < a[0].length; k++){
    for (int i = 0;i<a.length; i++){ 
        if (a[i][k] > max){
            max = a[i][k];
        }
        b[i] = max;
        max = a[i+1][0];
       
}
}
return b;
}



public static int countHowManyColumnsAreAscending (int[][]a){
int c  = 0;
int i = 0;
    for(int k = 0; k < a[0].length; k++){
        i = 0;
        while(i<a.length-1 && a[i][k] < a[i+1][k]){
            i++;
        }
        if (i == a.length-1){
    c++;
        }    
        
}
return c;           
}
}
