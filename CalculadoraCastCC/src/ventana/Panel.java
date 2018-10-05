package ventana;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	public JLabel inte;
	public JLabel dex;
	public JLabel vctR;
	public JLabel fct;
	public JLabel fctR;
	public JLabel totalV;
	public JLabel totalF;
	public JTextField inteCampo;
	public JTextField dexCampo;
	public JTextField vctRCampo;
	public JTextField fctCampo;
	public JTextField fctRCampo;
	public JTextField totalVCampo;
	public JTextField totalFCampo;
	public JButton calcular;
	public Panel() {
		setSize(175,400);
		setLayout(null);
		inte=new JLabel("INT: ");
		dex=new JLabel("DEX: ");
		vctR=new JLabel("VCT%: ");
		fct=new JLabel("FCT: ");
		fctR=new JLabel("FCT%: ");
		totalV=new JLabel("Total V: ");
		totalF=new JLabel("Total F: ");
		inteCampo=new JTextField();
		dexCampo=new JTextField();
		vctRCampo=new JTextField();
		fctCampo=new JTextField();
		fctRCampo=new JTextField();
		totalVCampo=new JTextField();
		totalFCampo=new JTextField();
		calcular=new JButton("Calc.");
		add(inte);
		add(dex);
		add(vctR);
		add(fct);
		add(fctR);
		add(totalV);
		add(totalF);
		add(inteCampo);
		add(dexCampo);
		add(vctRCampo);
		add(fctCampo);
		add(fctRCampo);
		add(totalVCampo);
		add(totalFCampo);
		add(calcular);
		inte.setBounds(25, 25, 50, 25);
		dex.setBounds(25, 75, 50, 25);
		vctR.setBounds(25, 125, 50, 25);
		fct.setBounds(25, 175, 50, 25);
		fctR.setBounds(25, 225, 50, 25);
		totalV.setBounds(25, 315, 50, 25);
		totalF.setBounds(25, 340, 50, 25);
		inteCampo.setBounds(100, 25, 50, 25);
		dexCampo.setBounds(100, 75, 50, 25);
		vctRCampo.setBounds(100, 125, 50, 25);
		fctCampo.setBounds(100, 175, 50, 25);
		fctRCampo.setBounds(100, 225, 50, 25);
		totalVCampo.setBounds(100, 315, 50, 25);
		totalFCampo.setBounds(100, 340, 50, 25);
		calcular.setBounds(50, 275, 75, 25);
	}
}
