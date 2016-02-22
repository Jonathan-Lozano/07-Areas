import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaCirculo extends JFrame implements ActionListener {

	private JLabel lblRadio = new JLabel("Ingresa el radio");
	private JTextField txtRadio= new JTextField();
	private JButton btnArea = new JButton("Area");
	private JLabel lblResult = new JLabel("El area es: ");
	private Container cont = getContentPane();
	private Area p = new Area();

	/**
	 * Se crea un constructor para crear y dar caracteristicas a una ventana
	 */
	public VistaCirculo() {
		super("Circulo");
		setSize(240, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Carga y agrega los controles a la ventana creada
	 */
	private void cargarControles() {
		cont.setLayout(null);

		lblRadio.setBounds(10, 10, 210, 30);
		cont.add(lblRadio);

		txtRadio.setBounds(10, 40, 210, 30);
		cont.add(txtRadio);

		btnArea.setBounds(70, 80, 100, 30);
		btnArea.addActionListener(this);
		cont.add(btnArea);

		lblResult.setBounds(10, 120, 210, 30);
		cont.add(lblResult);
	}

	/**
	 * Muestra el resultado en una etiqueta del area al precionar el boton
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		lblResult.setText(String.format("<html>El area del circulo es:<br>%f<html>",
				p.areaCirculo(Integer.parseInt(txtRadio.getText()))));
	}

}
