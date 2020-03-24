import javax.swing.JOptionPane;

public class ValoresInteirosAdicao{
   
   public static void main (String [] args) {
   
      double first = Double.parseDouble (JOptionPane.showInputDialog("Digite o Primiro Numero"));
      
      double second = Double.parseDouble (JOptionPane.showInputDialog("Digite o Segundo Numero"));
      double resultado = first + second;
      
      if (resultado > 10){
         System.out.println ("Resultado: " + resultado);
         
      } 
         
   }
}