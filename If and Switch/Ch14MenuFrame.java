import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ch4JMenuFrame extends JFrame implements ActionListener {

   private static final int FRAME_WIDTH   = 300;
   private static final int FRAME_HEIGHT  = 250;
   private static final int FRAME_X_ORIGIN= 150;
   private static final int FRAME_Y_ORIGIN= 250;

   private JLabel response;
   private JMenu  fileMenu;
   private JMenu  editMenu;

//------------------------------
//       Main Method
//------------------------------

   public static void main(String[] args) {
      Ch14JMenuFrame frame = new Ch14JMenuFrame();
      frame.setVisible(true);
   }
   
   public void Ch14JMenuFrame(){
      Container contentPane;

      //set the frame properties
      setTitle   ("Ch14JMenuFrame");
      setSize    (FRAME_WIDTH, FRAME_HEIGHT);
      setResizable(false);
      setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

      contentPane = getContentPage();
      contentPane.setLayout(new FlowLayout());
      
      //create two menu and their menu items
      createFileMenu();
      createEditMenu();
      }

   private void createEditMenu() {
      JMenuItem   item;

      editMenu = new JMenu("Edit");
      
      item = new JMenuItem("Cut");
      item.addActionListener( this );
      editMenu.add( item );

      item = newJMenuItem("Copy");
      item = item.addActionListener ( this );
      editMenu.add( item );

      item = new JMenuItem("Paste");
      item.addActionListener( this );
      editMenu.add( item );
      }
}

      