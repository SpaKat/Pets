import pet.Pet;
import world.Consumable;

public class test {


	public static void main(String[] args) {
		Pet 	p 		= new Pet(100, 100, 100, 100);
		Consumable 	a 	= new Consumable(2);
		Consumable 	b 	= new Consumable(2,4);
		Consumable 	c 	= new Consumable(2,4,6);
		Consumable 	d 	= new Consumable(2,4,6,8);
		Consumable 	e 	= new Consumable(2,4,6,8,10);
		Consumable  f	= new Consumable(2,4,6,8,10,true);
		int 	i 		= 0;
		System.out.println("Hung | Thir | Happ | Sleep");
		while(!p.died()) {
			i++;
			p.update();
			
			switch(i){
			case 500:p.consume(a);
			break;
			case 1000:p.consume(b);
			break;
			case 1500:p.consume(c);
			break;
			case 2000:p.consume(d);
			break;
			case 2500:p.consume(e);
			break;
			case 3000:p.consume(f);
			break;
			}
			System.out.println(p);

			
			try {
				Thread.sleep(10,0);
			} catch (InterruptedException j) {
				// TODO Auto-generated catch block
				j.printStackTrace();
			}
		}

	}

}
