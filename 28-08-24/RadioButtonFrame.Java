// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame 
{
   private JTextField textField; 
   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 

   private Color blueColor;
   private Color redColor;
   private Color yellowColor;
   private Color blackColor;



   private JRadioButton blueJRadioButton; 
   private JRadioButton redJRadioButton; 
   private JRadioButton yellowJRadioButton; 
   private JRadioButton blackJRadioButton; 
   private ButtonGroup colorRadioGroup; 

   // RadioButtonFrame constructor adds JRadioButtons to JFrame
   public RadioButtonFrame()
   {
      super("RadioButton Test");
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);
      add(textField); // add textField to JFrame

      / create logical relationship between JRadioButtons
      radioGroup= new ButtonGroup(); // create ButtonGroup
      radioGroup.add(plainJRadioButton); // add plain to group
      radioGroup.add(boldJRadioButton); // add bold to group
      radioGroup.add(italicJRadioButton); // add italic to group
      radioGroup.add(boldItalicJRadioButton); // add bold and italic

      // create radio buttons
      blueJRadioButton = new JRadioButton("Plain", true);
      redJRadioButtonJRadioButto = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      yellowJRadioButton = new JRadioButton("Bold/Italic", false);
      blackJRadioButton=new new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton); // add plain button to JFrame
      add(boldJRadioButton); // add bold button to JFrame
      add(italicJRadioButton); // add italic button to JFrame
      add(boldItalicJRadioButton); // add bold and italic button


      colorRadioGroup = newButtonGroup();
      colorRadioGroup.add(blueJRadioButton);
      colorRadioGroup.add(redJRadioButton);
      colorRadioGroup.add(italic)(RadioButton);
      colorRadioGroup.add(blackJRadioButton);


      // create font objects
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);

      blueColor = new Color(0,0,255)
      redColor = new Color(255,0,0)
      yellowColor = new Color(255,255,0)
      blackColor= new Color(0,0,0)

      // register events for JRadioButtons
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
         (plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
         (italicFont));
      boldItalicJRadioButton.addItemListener(
        addItemListem(
         new RadioButtonHandler(boldItalicFont));
         (boldItalicFont));

         blueJRadioButton.addItemListem(
         new ColorRadioButtonHandler(blueColor));
         redJRadioButton.addItemListem(
        new ColorRadioButtonHandler(redColor));
        yellowColorJRadioButton.addItemListener;
        new ColorRadioButtonHandler(ywlloColor);
        blackJRadioButton.addItemListener(
        new JRadioButton(blackColor);

   } 

   // private inner class to handle radio button events
   private class ColorRadioButtonHandler implements ItemListener 
   {
      private Color color; 
      color = c;

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      // handle radio button events
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
} // end class RadioButtonFrame 

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
