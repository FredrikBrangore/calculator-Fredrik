package calculator_Fredrik.calculator_Fredrik;

import javax.swing.JOptionPane;

/**
 * 
 * @author fredd
 *
 */
public class MainKalk {
	/**
	 * 
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

			Object[] options = { "+", "-", "*", "/", "sin", "tan", "cos", "^2", "^3", "sqrt" };
			int f = JOptionPane.showOptionDialog(null, "Välj Räknesätt", "Här ska Räknas", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, options[9]);

			if (f < 11) {
				try {

					if (f == -1) {
						System.exit(0);
					} else if (f == 1) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Plus " + minaTal2 + " är: " + (minaTal1 - minaTal2));
					} else if (f == 1) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Minus " + minaTal2 + " är: " + (minaTal1 * minaTal2));
					} else if (f == 2) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						JOptionPane.showMessageDialog(null,
								minaTal1 + " Gånger med " + minaTal2 + " är: " + (minaTal1 / minaTal2));
					} else if (f == 3) {
						s1 = JOptionPane.showInputDialog("Mata in Tal 1");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						s2 = JOptionPane.showInputDialog("Mata in Tal 2");
						rs2 = s2.replace(',', '.');
						minaTal2 = Double.parseDouble(rs2);
						if (minaTal2 == 0.0) {
							JOptionPane.showMessageDialog(null, "Du får inte Mata in 0 i Andra Talet", "ERROR ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else
							JOptionPane.showMessageDialog(null,
									minaTal1 + " Delat med " + minaTal2 + " är: " + (minaTal1 / minaTal2));
					} else if (f == 4) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);
					} else if (f == 5) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);
					} else if (f == 6) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);
					} else if (f == 7) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);
					} else if (f == 8) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);

					} else if (f == 9) {
						s1 = JOptionPane.showInputDialog("Mata in ditt Tal");
						rs1 = s1.replace(',', '.');
						minaTal1 = Double.parseDouble(rs1);
						JOptionPane.showMessageDialog(null,
								"Din Circle area är " + (minaTal1 * minaTal1) * Math.PI / 2);
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Du måste skriva bara siffror du får använda ett , eller . som komma tecken "
									+ "och du måste skriva siffror eller klicka på krysset för att komma ut ur programmet");
				}
			}
		}
		System.exit(0);
	}

}