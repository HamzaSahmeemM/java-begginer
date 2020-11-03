package datas; 
public class GeeksForGeeks 
{ 
 
 public static void printTriagle(int n) 
 { 
     // outer loop to handle number of rows 
     //  n in this case 
     for (int i=0; i<n; i++) 
     { 
         for (int j=n-i; j>1; j--) 
         { 
             System.out.print(" "); 
         } 
         for (int j=0; j<=i; j++ ) 
         { 
             System.out.print("* "); 
         } 
         System.out.println(); 
     } 
 } 
   
 // Driver Function 
 public static void main(String args[]) 
 { 
     int n = 5; 
     printTriagle(n); 
 } 
} 
