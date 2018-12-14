import java.util.Arrays;

public class GaussJordan {

 Matrix mat; 
 public GaussJordan(double A[][],double b[]) {
  
  int row=A.length;
  int col=A[0].length;
  
  mat = new Matrix(row,col+1);
  for(int r=0;r<row;r++) {
   for(int c=0;c<col;c++) 
        mat.setElement(r, c, A[r][c]);    
  }
  
  for(int r=0;r<row;r++) {   
   mat.setElement(r, col, b[r]);
  }     
 }
 
 public void maxdiagonal() {    
  for(int r=0;r<mat.getNrow();r++)  
    {
       double mx=0; int mr=r;   
       for (int c=r;c<mat.getNrow();c++){ 
       if (  Math.abs(mat.getElement(c, r)) > mx ) {
           mx = Math.abs(mat.getElement(c, r));
           mr = c;
        }      
      }       
     if ( mr!=r ) {
       RowOperation.swap(mat, r, mr);      
     }
  }  
 }
 
 public void divbydiag() {  
  for(int r=0;r<mat.getNrow();r++)  
    {
      double idia = mat.getElement(r, r);    
      for (int c=mat.getNrow();c<mat.getNcol();c++){
         mat.setElement(r, c, mat.getElement(r, c) / idia); 
     }    
       mat.setElement(r, r, mat.getElement(r, r)/idia); 
   }
 }
 
 
 public void diagonalize() 
    {      
       for(int r=0;r<mat.getNrow();r++)
          {             
           for(int r2=0;r2<mat.getNrow();r2++) {
           if ( r!=r2 ) { 
           double ratio= mat.getElement(r2, r) / mat.getElement(r, r);
           RowOperation.add(mat, r2, r, -ratio);   
           }         
         }
       }     
   }
          
 public double[] solution() {        
  this.maxdiagonal();  
  this.diagonalize();  
  this.divbydiag();
      
  double sol[]=new double[mat.getNrow()];    
  for(int r=0;r<mat.getNrow();r++)    
        sol[r]= mat.getElement(r,mat.getNcol()-1);     
  return sol;    
 }
 
 public String toString() {
   return mat.toString();
 }
 
 public static void main(String[] args) {
    
  //double A[][]= { {2,4,6},{4,5,6},{3,1,-2}};
  //double b[]= {18,24,4};
  
  double A[][]= { {2,-1,1},{0,2,-1},{-1,1,0}};
  double b[]= {3,1,1};
  
  double C [][]= { {3.0, 0.0, -1.0}, {0.0, 2.0, -2.0}, {8.0, 0.0, 0.0}};
  double d[]= {0.0, 4.0, 8.0 };
  

	 
  GaussJordan gj = new GaussJordan(C,d);  
  double sol[] =gj.solution();
  System.out.println( "solution vector X" );
  System.out.println(Arrays.toString(sol));      
 }
}