import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaTriangulo extends JFrame implements ActionListener {

	private JLabel lblBase = new JLabel("Ingresa la base");
	private JLabel lblAltura = new JLabel("Ingresa la altura");

	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();

	private JButton btnArea = new JButton("Area");

	private JLabel lblResult = new JLabel("El area del triangulo es: ");

	private Container cont = getContentPane();

	private Area p = new Area();

	/**
	 * Contructor para crear una ventana
	 */
	public VistaTriangulo() {
		super("Triangulo");
		setSize(260, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Metodo que carga los controles a la ventana
	 */
	private void cargarControles() {
		cont.setLayout(null);

		lblBase.setBounds(10, 10, 210, 30);
		cont.add(lblBase);

		txtBase.setBounds(10, 40, 210, 30);
		cont.add(txtBase);

		lblAltura.setBounds(10, 70, 210, 30);
		cont.add(lblAltura);

		txtAltura.setBounds(10, 100, 210, 30);
		cont.add(txtAltura);

		btnArea.setBounds(70, 140, 100, 30);
		btnArea.addActionListener(this);
		cont.add(btnArea);

		lblResult.setBounds(10, 170, 210, 70);
		cont.add(lblResult);

	}

	/**
	 * Se muestran los resultados del area al precionar el boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		lblResult.setText(String.format("El perimetro del triangulo es: %f",
				p.areaTriangulo(Integer.parseInt(txtBase.getText()), Integer.parseInt(txtAltura.getText()))));
	}
}
