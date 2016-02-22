/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Area {

	/**
	 * 
	 * @param lado
	 * @return Calcula el area de un cuadrado recibiendo como parametro el valor
	 *         del lado
	 */
	public int areaCuadrado(int lado) {
		return lado * lado;
	}

	/**
	 * 
	 * @param base
	 * @param altura
	 * @return Calcula el area de un rectangulo recibiendo como parametro la
	 *         base y la altura
	 */
	public float areaRectangulo(float base, float altura) {
		return base * altura;
	}

	/**
	 * 
	 * @param base
	 * @param altura
	 * @return Calcula el area de un trinagulo recibiendo como
	 *         parametro el valor la base y la altura
	 */
	public float areaTriangulo(float base, float altura) {
		return (base * altura) / 2;
	}

	/**
	 * 
	 * @param diametro
	 * @return Calcula el area de un circulo recibiendo el valor del radio
	 */
	public double areaCirculo(float radio) {
		return 3.1416 * (radio * radio);
	}

}
