import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    

    private final JLabel label1;
    private final JLabel label2;

    private final JButton btnCalcular;
    private final JLabel LbnNotificacao;
    
    


 
    public Calculator()
    {
       super("Calculadora de soma");
       setLayout(new GridLayout(3,2,5,5));//(3,2,5,5)

      

      
      label1 = new JLabel("digite o numero 1: ",SwingConstants.RIGHT);
      add(label1);
       textField1 = new JTextField();
       add(textField1); 

       label2 = new JLabel("label2");
       add(label2);
       textField2 = new JTextField("Enter your text here now");
       add(textField2); 

       btnCalcular = new JButton("Calcular")
       add(btnCalcular);
       lblNotificacao = new Jlabel ("Resultado");
       add(lblNotificacao);
 
       
       TextFieldHandler handler = new TextFieldHandler();
      btnCalcular.addAddActionListener(handler)

    }
       
 
   
       @Override
       public void actionPerformed(ActionEvent event)
       {

            if(textField1.getText().trim().length() == 0) {
            // notificar usuario que o campo 1 está vazio
            lblNotificacao.setText(text:"O campo 1 está vazio!")
            textField1.requestFocus();
          }else{
            if(textField2.getText().trim().length() ==0) {
           // notificar usuário que o campo 2 está vazio 
            } else {
           // aqui será feita a soma 
           try{
           int soma = Integer.valueof(textField1.getText()) + Integer.valueof (textField2.getText());
           lblNotificacao.setText(String.format(format:"Resultado:%s",soma));
            } catch (Exception e) {
                lblNotificacao.setText(text:"<html><body>Ops!Ops!Parece que foi digitado alguma coisa errada,favor revisar a digitação,pois podem ser digitados apenas némeros inteiros.</body></html>");
          
              }

            }

          }

        }
          public static void main(String[] args)
          {
     
       Calculator calculator = new Calculator(); 
       calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       calculator.setSize(350, 100); 
       calculator.setVisible(true); 
    } 
 } // end class TextFieldFrame