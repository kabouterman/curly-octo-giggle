import javax.swing.JApplet;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JApplet {
	private JTextField Field1;

	/**
	 * Create the applet.
	 */
	public Test() {
		getContentPane().setLayout(null);
		
		Field1 = new JTextField();
		Field1.setHorizontalAlignment(SwingConstants.CENTER);
		Field1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Field1.setBackground(Color.RED);
				Field1.setText("HOHOHOHOHOHO!");
				Field1.setEditable(false);
			}
			public void mouseExited(MouseEvent arg0) {
				Field1.setBackground(Color.GREEN);
				Field1.setText("MERRYY CHRISTMASS!!");
				Field1.setEditable(false);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				int Colour = (int)(Math.random() * 10 + 1);
				System.out.println(Colour);
				switch (Colour) {
				case 1: Field1.setBackground(Color.BLUE); break;
				case 2: Field1.setBackground(Color.ORANGE); break;
				case 3: Field1.setBackground(Color.BLACK); break;
				case 4: Field1.setBackground(Color.MAGENTA); break;
				case 5: Field1.setBackground(Color.CYAN); break;
				default: Field1.setBackground(Color.WHITE); break;
				}
				Field1.setText("");
				Field1.setEditable(true);
			}
		});
		Field1.setBounds(197, 130, 223, 98);
		getContentPane().add(Field1);
		Field1.setColumns(10);

	}
}
