
package cafe;

import javax.swing.JOptionPane;


public class Cafe extends Drink  {
    
    public Cafe(String sabor, double valor) {
        super(sabor, valor);
    }
    
    public void selecionar  (int numero){
        
         switch (numero){
             case 1: JOptionPane.showMessageDialog(
                         null, "Café puro");
                                   this.setValor(1.30);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());
             break;
             
             
             case 2: JOptionPane.showMessageDialog(
                     
                         null, "Café latte");
                                    this.setValor(4.30);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());                

             break;
             
             
             case 3: JOptionPane.showMessageDialog(
                         null, "Capuccino");
                                  this.setValor(7.50);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());              

             break; 
             
             
             case 4: JOptionPane.showMessageDialog(
                         null, "Café com chocolate");
                                  this.setValor(10.80);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());             

             break;
             
             
             case 5: JOptionPane.showMessageDialog(
                         null, "Café com Java");
                                  this.setValor(21.90);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());              

             break;
             
             
             case 6: JOptionPane.showMessageDialog(
                         null, "Nenhuma das opções");
                                  this.setValor(200.00);
                     JOptionPane.showMessageDialog(
                         null, "Valor: " + this.getValor());              

             break;
             
         }
    }
}