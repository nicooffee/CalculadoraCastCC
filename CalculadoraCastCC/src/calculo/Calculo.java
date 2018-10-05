package calculo;

public class Calculo {
	public static double calcularVCT(double BaseVCT ,double inte, double dex, double Sum_VCTReduc) {
		double VCT;
		VCT=BaseVCT*(1-Math.sqrt((dex*2+inte)/530.00))*(1-(Sum_VCTReduc/100.00));
		return VCT;
	}
	public static double calcularFCT(double BaseFCT,double Sum_FCT,double Max_FCTReduc ) {
		double FCT;
		FCT=(BaseFCT-Sum_FCT)*(1-(Max_FCTReduc/100.00));
		return FCT;
	}
}
