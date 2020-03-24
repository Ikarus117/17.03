import javax.swing.JOptionPane;

public class RaizQuadradaEQuadrado {
   
   public static void main (String [] args){
   
      int base = Integer.parseInt (JOptionPane.showInputDialog ("Digite um Numero"));
      
      double result = Math.pow(base, 2);
      double result2 = Math.sqrt(base);
      
      if (result2 >= 0.0){
         System.out.println (result2);
      
      } else {
         System.out.println (result); 
      }
   }
}