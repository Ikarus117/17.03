import javax.swing.JOptionPane;

public class MenorIgualSubtrai{

   public static void main (String [] args){
   
   double pPrimeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o Priemiro Numero"));
   double sSegundo = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
   double resultado = pPrimeiro + sSegundo;
   
   if (resultado <= 20){
      System.out.println (resultado - 5);
      }
   }
}