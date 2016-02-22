
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaCuadrado extends JFrame implements ActionListener {

	private JTextField txtLado = new JTextField();
	private JButton btnArea = new JButton("Area");
	private JLabel lblLado = new JLabel("Ingresa el valor del lado");
	private JLabel lblResult = new JLabel("El area es: ");
	private Container cont = getContentPane();
	private Area p = new Area();

	/**
	 * Se crea un constructor para crear una ventana
	 */
	public VistaCuadrado() {
		super("Cuadrado");
		setSize(260, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		agregarControles();

	}

	/**
	 * Se agregan los controles a la ventana creada
	 */
	private void agregarControles() {
		cont.setLayout(null);

		lblLado.setBounds(10, 10, 230, 20);
		cont.add(lblLado);

		txtLado.setBounds(10, 35, 230, 22);
		cont.add(txtLado);

		btnArea.setBounds(60, 80, 100, 22);
		btnArea.addActionListener(this);
		;
		cont.add(btnArea);

		lblResult.setBounds(10, 120, 230, 30);
		cont.add(lblResult);
	}

	/**
	 * Se muestra el resultado del area del cuadrado al precionar el boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		lblResult.setText(String.format("El area es:  %d", p.areaCuadrado(Integer.parseInt(txtLado.getText()))));
	}
}
