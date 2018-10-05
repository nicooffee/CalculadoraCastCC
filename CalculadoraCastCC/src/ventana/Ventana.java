package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import calculo.Calculo;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener{
	Panel panel=new Panel();
	public Ventana() {
		this.setTitle("Calculadora Cast Cart Cannon");
		this.setBounds(0,0,175,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		add(panel);
		panel.calcular.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(panel.calcular)) {
			panel.totalVCampo.setText(Double.toString(Calculo.calcularVCT(3.00, Double.parseDouble(panel.inteCampo.getText()), Double.parseDouble(panel.dexCampo.getText()), Double.parseDouble(panel.vctRCampo.getText()))));
			panel.totalFCampo.setText(Double.toString(Calculo.calcularFCT(0.5, Double.parseDouble(panel.fctCampo.getText()), Double.parseDouble(panel.fctRCampo.getText()))));
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
	
}
