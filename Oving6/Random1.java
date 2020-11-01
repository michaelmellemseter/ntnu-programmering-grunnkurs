//Program som gir deg 1000 tilfeldige tall og forteller hvor mange det er av hvilke
class Random1{
	public static void main(String[]args){
		java.util.Random random = new java.util.Random();

		int[] antall = new int[10];

		for(int i = 1; i < 1000; i++){
			int tall = random.nextInt(10);
			antall[tall]++;
		}

		for(int i = 0; i < 10; i++){
			System.out.println("Det er " + antall[i] + " " + i + "ere");
		}
	}
}