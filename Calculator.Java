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

    String[] numeros = {"1","2","3","4","5","6","7","8","9","0"};

    if(!textField1.getText().substring(c)

    
     public Calculator()
    {
       super(title:"Calculadora de soma");
       setLayout(new GridLayout(rows:3,cols:2,hgap:5,vgap:5));//(3,2,5,5)

      

      
      label1 = new JLabel(SwingConstants.RIGHT);
      add(label1);
       textField1 = new JTextField
       add(textField1); 

       label2 = new JLabel(text:"label12");
       add(label2);
       textField2 = new JTextField("Enter your text here now");
       add(textField2); 

       btnCalcular = new JButton(text:"Calcular")
       add(btnCalcular);
       lblNotificacao = new JLabel (text:"Resultado");
       add(lblNotificacao);
 
       
       TextFieldHandler handler = new TextFieldHandler();
      btnCalcular.addAddActionListener(handler)
      
      private class TextFieldHandler
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
           lblNotificacao.setText(text:"O campo 2 está vazio!");
           textField2.requestFocus();
            } else {
           // aqui será feita a soma 
           try {
            textField1.setText(somenteNumeros(textField1.getText()));
            textField2.setText(somenteNumeros(textField2.getText()));
            int soma =Integer.valueOf(textField1.getText()) + Integer.valueof(textField2.getText());
            lblNotificacao.setText(String.format(format:"Resultado:%s",soma));
          } catch (Exception e) {
            lblNotificacao.setText(text:"<html><body>Ops!Ops!Parece que foi digitado alguma coisa errada,favor revisar a digitação,pois podem ser digitados apenas némeros inteiros.</body></html>");

           public String somenteNumero(String strTexto) {
            boolean achouNumero ; 
            ArrayList<String>caracteresEncontrados = new ArrayList<String>();
            String[]caracteresEncontrados;       
           for(int c =0; c < textField1.getText().length(); c++) {
            achouNumero = false;
            for(int n = 0;n < numeros.length; n++) {
              if ( caracterTemp .equals(numeros[n])) {
                System.out.println("achou o numero "+caracterTemp+ "na posicao:"+c);
                achouNumero = true;
                break;
              }

            }
            if (achouNumero) {
                  continue;
            }else {
                caracteresEncontrados.add(caracterTemp);
            }

        }

        for(int c = 0; c <caracteresEncontrados.size();c++) {0
              String strTextField1 = textField1.getText();
              strTextField1.replace(textField1.getText().substring(c,c),replacement:"");
              textField1.setText(strTextField1);
            }

          }

          if(textField1.getText().trim().length() == 0) {
            //notificar usuário que o campo 1 está vazio
            lblNotificacao.setText(text:"O campo 1 está vazio!");
            texto
            
            
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