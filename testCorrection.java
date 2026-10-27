package pp.testcorrectionpart2;
import java.util.Arrays;

public class TestCorrectionPart2 {

    public static void main(String[] args) {
        String s = "37hfd61hs65fds";
        String[] names1 = {"zoey","fdfs","fwe"};
        String[] names2 = {"fwff","fdfs","fwe"};
        System.out.println("Hello World!");
        System.out.println(returnNumberOfDigits(s));
//        System.out.println(Arrays.toString(returnAllNegativeIntegers(s)));
        System.out.println(Arrays.toString(commonNames(names1, names2)));
    }
public static int returnNumberOfDigits (String s){
    int c = 0;
    for (int i=0; i < s.length(); i++){
       if(Character.isDigit(s.charAt(i))){
           c++;
       } 
        
    }
 
  return c;
}


//public static String[] returnAllNegativeIntegers (String s){
//    int c = 0;
//    char d = '-';
//    for (int i = 0; i < s.length(); i++){
//        if(s.charAt(i) != d){
//           i++;
//        }else if(s.charAt(i) == d && Character.isDigit(s.charAt(i+1))){
//            i++;
//            while (Character.isDigit(s.charAt(i))){
//            i++;    
//            }
//        }
//        c++;
//    }    
//        
//    
//    String a[] = new String[c];
//    int k = 0;
//    if( ){
//        a[k] = s[i];
//    }
//return a;
//}



//public static String[] commonNames (String[] names1, String[] names2){
//    int c = 0;
//    int j = 0;
//    int k = 0;
//    while (k < names2.length && j < names1.length){
//        if (names1[j].compareTo(names2[k]) = 0){
//            c++;
//            j++;
//            k++;
//        }else {
//        
//            j++;
//        }    
//    }
//    j = 0;
//    k = 0;
//
//    
//
//     if (c==0){
//        return null;
//   
//     }else{ 
//        String[] rnames = new String [c];
//        if (names1[j].compareTo(names2[k]) == 0){
//            rnames[c] = names1[j];
//            j++;
//            k++;
//        }else{
//            j++;
//        }
//     }
//        return rnames;
//     }




public static String[] commonNames (String[] names1, String[] names2){
    String[] repeatNames = new String [names1];
    int j = 0;
    for(int i = 0; i < names1.length; i++){
        for(int k = 0; k < names2.length;k++){
            while(i < names1.length || k < names2.length){
            if (i >= names1.length){
                i = 0;  
                if(names1[i].compareTo(names2[k]) == 0){
                repeatNames[j] = names1[i];
                j++;
            }else{
                i++;
            }
            }
            else if (k >= names2.length){
                k = 0;
                if(names1[i].compareTo(names2[k]) == 0){
                repeatNames[j] = names1[i];
                j++;
            }else{
                k++;
            }
            }
        if(j == 0){
            return null;   
        }   
}
        }
    }
        return repeatNames;
}
}

