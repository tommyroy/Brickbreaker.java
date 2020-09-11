 package breacker;

 import javax.swing.JFrame;

 public class Main {

 	 public static void main(String[] args) {
	     JFrame obj = new JFrame();
	     gameplay GamePlay = new gameplay();
	     obj.setBounds(10, 10, 700, 600);
	     obj.setTitle("Breakout ball");
	     obj.setResizable(true);
	     obj.setVisible(true);
	     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     obj.add(GamePlay);
     }

 }
