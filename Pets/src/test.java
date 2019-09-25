
public class test {
	
	
	public static void main(String[] args) {
		Pet p = new Pet(100, 100);
		while(!p.died()) {
			p.update();
		}
	}

}
