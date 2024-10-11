// Fig. 12.25: MultipleSelectionFrame.java
// JList that allows multiple selections.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> copyJList; 
   private final JList<String>copyJList2; // a cópia 3 do JList


   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); // 
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); 

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
        ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new ActionListener(colorJList)); 
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               copyJList2.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); 

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(15); 
      copyJList.setFixedCellWidth(200); 
      copyJList.setFixedCellHeight(300); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); 
   } 
} 

copyJButton2 = new JButton("Copy >>>"); 
copyJButton2.addActionListener(
        add(new ActionListener()
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               copyJList2.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); 

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5);
      copyJList.setFixedCellWidth(100); 
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); 
   } 
} 