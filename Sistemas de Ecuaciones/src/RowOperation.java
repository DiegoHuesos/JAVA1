public class RowOperation  {   
   public static void swap(Matrix mat,int r1,int r2) {
         
    for (int n=0;n<mat.getNcol();n++) {
      double tmp=  mat.getElement(r1, n);
       mat.setElement(r1, n,  mat.getElement(r2, n));
       mat.setElement(r2, n,  tmp);
    }     
 }
 
   public static void multiply(Matrix mat,int r1,double val) {  
    for (int n=0;n<mat.getNcol();n++) {   
        mat.setElement(r1, n,  val*mat.getElement(r1, n));   
     }
 }
   
   public static void add(Matrix mat,int r1,int r2) {  
        for (int n=0;n<mat.getNcol();n++)
           {     
             mat.setElement(r2, n,  mat.getElement(r1, n) 
                                       + mat.getElement(r2, n));     
         }
  }
  
   public static void subtract(Matrix mat,int r1,int r2) {  
      for (int n=0;n<mat.getNcol();n++)
          {     
             mat.setElement(r2, n,  mat.getElement(r1, n) 
                                       - mat.getElement(r2, n));     
         }
    }
   
   public static void add(Matrix mat,int r2,int r1,double val) {  
    for (int n=0;n<mat.getNcol();n++) {
        double tmp=  val*mat.getElement(r1, n);
        mat.setElement(r2, n,  mat.getElement(r2, n)+tmp);     
     }
 }
  
   public static void subtract(Matrix mat,int r2,int r1,double val) {  
    for (int n=0;n<mat.getNcol();n++) {
        double tmp=  val*mat.getElement(r1, n);
        mat.setElement(r2, n,  mat.getElement(r2, n)- tmp);     
     }
 }
 
 
 public static void main(String[] args) {
  
     double vals[][]={{3,1,2},{2,-1,1},{1,3,-1}};     
     Matrix A =new Matrix(vals);
     
     System.out.println("Elementary Row Operation");
     System.out.println("Matrix A");
     System.out.println(A.toString());
               
     System.out.println("Swapping  two rows ");
     System.out.println("R0 <-> R1 ");
     RowOperation.swap(A, 0, 1);
     System.out.println(A.toString());

     System.out.println("Multiply a value with a rows ");
     System.out.println("R2 <- 2*R2 ");          
     RowOperation.multiply(A, 2, 2.0);
     System.out.println(A.toString());
     
     System.out.println("Adding  two rows ");
     System.out.println("R1 <- R0 + R1 ");     
     RowOperation.add(A, 0, 1);
     System.out.println(A.toString());
     
     System.out.println("add rows R1 and 2 times R0   ");
     System.out.println("R1 <- R1 + 2R0 ");          
     RowOperation.add(A, 0,1, 2.0);
     System.out.println(A.toString());
               
 }
}