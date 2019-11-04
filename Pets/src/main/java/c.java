import java.io.File;

public class c {

	public static void main(String[] args) {
	
		File f = new File(".");
	
		if (f.isDirectory()) {
			for (int i = 0; i < f.listFiles().length; i++) {
				System.out.println(f.listFiles()[i]);
			}
		}
	}

}
