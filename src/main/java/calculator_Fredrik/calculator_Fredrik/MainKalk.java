package calculator_Fredrik.calculator_Fredrik;

import javax.swing.JOptionPane;

/**
 * 
 * @author fredd
 *
 */
public class MainKalk {
	/**
	 * The try catch makes it so you can write letters and just get an error message
	 * which tells you what you did wrong and gives a tip on what you can use 
	 * The JOptionPane sends out a -1 when you hit the X so i need an if for it else it
	 * will get stuck and you cant leave the Loop.
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorAdvancedOperationsInterface KalkA = new CalculatorAdvanced();
		CalculatorBasicOperationsInterface KalkB = new CalculatorBasic();
		int p = 0;
		String s1 = "";
		String s2 = "";
		String rs1 = "";
		String rs2 = "";
		double minaTal1 = 0;
		double minaTal2 = 0;
		while (p <= 0) {

			Object[] options = { "+", "-", "*", "/", "√", "*PI", "^2", "sin", "cos", "tan" };
			int f = JOptionPane.showOptionDialog(null, "Välj Räknesätt eller Klicka på X i detta fönster för Avsluta",
					"Här ska Räknas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
					options[9]);

			while (f < 11) {
				try {
					if (f == -1) {
						System.exit(0);
					} else if (f == 0) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Plus " + minaTal2 + " är: " + (KalkB.plus(minaTal1, minaTal2)));
						f = 10;
					} else if (f == 1) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Minus " + minaTal2 + " är: " + (KalkB.minus(minaTal1, minaTal2)));
						f = 10;
					} else if (f == 2) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Gånger " + minaTal2 + " är: " + (KalkB.gånger(minaTal1, minaTal2)));
						f = 10;
					} else if (f == 3) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						/**
						 * A if else to make it so you cant put 0 as your second number when dividing
						 */
						if (minaTal2 == 0.0) {
							JOptionPane.showMessageDialog(null, "Du får inte Mata in 0 i Andra Talet", "ERROR ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else
							JOptionPane.showMessageDialog(null,
									minaTal1 + " Delat med " + minaTal2 + " är: " + (KalkB.delat(minaTal1, minaTal2)));
						f = 10;
					} else if (f == 4) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						/**
						 * A if else to make it so you cant put less then 0 when trying to check the
						 * SquareRoot.
						 */
						if (minaTal1 < 0.0) {
							JOptionPane.showMessageDialog(null, "Du kan bara använda tal som är större än 0",
									"ERROR ERROR", JOptionPane.ERROR_MESSAGE);
						} else
							JOptionPane.showMessageDialog(null,
									"Roten Ur " + minaTal1 + " är: " + KalkA.rotenUr(minaTal1));
						f = 10;
					} else if (f == 5) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Ditt Tal " + minaTal1 + " gånger PI är: " + KalkA.gångerPI(minaTal1));
						f = 10;
					} else if (f == 6) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null, "^2 på " + minaTal1 + " är: " + KalkA.potens2(minaTal1));
						f = 10;
					} else if (f == 7) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null, "Sin på " + minaTal1 + " är: " + KalkA.sin(minaTal1));
						f = 10;
					} else if (f == 8) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null, "Cos på " + minaTal1 + " är: " + KalkA.cos(minaTal1));
						f = 10;

					} else if (f == 9) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null, "Tan på " + minaTal1 + " är: " + KalkA.tan(minaTal1));
						f = 10;
					}
					/**
					 * I ask here if you want to continue using the calculator or turn it off
					 */
					else {
						Object[] klart = { "JA", "NEJ" };
						int w = JOptionPane.showOptionDialog(null, "Vill du räkna mer?",
								"Mer eller inte?", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, klart,
								klart[1]);
						if (w == 0) {
							f = 15;
						}
						else System.exit(0);
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Du måste skriva bara siffror du får använda ett , eller . som komma tecken");
				}
			}
		}
	}

}