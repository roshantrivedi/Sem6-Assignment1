import java.util.*;

class mainClass
{ 
    static void sum(int mat[][], int r, int c) 
    { 
        int i,j; 
        int sum1=0; 
        int sum2=0; 
          
      
        for (i=0;i<r;i++) 
            for (j=0;j<c;j++)  
            { 
                if (i<=j)  
                { 
                   sum1 += mat[i][j]; 
                } 
            } 
      
        System.out.println("Upper sum is " +sum1); 
          
        for (i=0;i<r;i++)
            for (j=0;j<c;j++)  
            { 
                if (j<=i)  
                { 
                   sum2 += mat[i][j]; 
                } 
            } 
        System.out.print("Lower sum is " + sum2); 
}
    public static void main (String[] args) 
    { 
        int r =3; 
        int c =3; 
      
        int mat[][]={{ 6, 5, 7} ,
                        { 1, 2, 3},
						{ 0, 4, 8}}; 
                          
        sum(mat,r,c); 
    } 
} 