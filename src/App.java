public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 10; i++) {
					String output = "";
					for (int j = i; j > 0; j--) {
						output += i;
					}
					System.out.println(output);
				}
    }
}
