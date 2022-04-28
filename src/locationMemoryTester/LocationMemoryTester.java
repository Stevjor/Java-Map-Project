package locationMemoryTester;

public class LocationMemoryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
		SimpleLocation kumamoto = new SimpleLocation(32.0, 130.0);
		ucsd = kumamoto;
		kumamoto = ucsd;
		System.out.println("UCSD: latitude " + ucsd.latitude + ", longitude " + ucsd.longitude);
		System.out.println("Kumamoto: latitude " + kumamoto.latitude + ", longitude " + kumamoto.longitude);
		
	}

}
