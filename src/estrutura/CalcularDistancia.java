package estrutura;

public class CalcularDistancia {
	
	public double getDistancia(double firstLatitude, double firstLongitude, double secondLatitude, double secondLongitude) {
		double firstLatToRad = Math.toRadians(firstLatitude);
		double secondLatToRad = Math.toRadians(secondLatitude);
		
		double deltaLongitudeInRad = Math.toRadians(secondLongitude - firstLongitude);
		
		return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad)
				* Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad)
				* Math.sin(secondLatToRad))
				* 6.371;
	}
}
