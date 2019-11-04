import pet.Pet;
import world.Consumable;

public class test {


	public static void main(String[] args) {
		Pet 	p 		= new Pet("PET", 1000, 1000, 1000, 1000);
		Consumable 	a 	= new Consumable("Apple", 500);
		Consumable 	b 	= new Consumable("Banana", 500,200);
		Consumable 	c 	= new Consumable("Carrot", 500,200,500);
		Consumable 	d 	= new Consumable("Dragon Fruit", 500,200,500,200);
		Consumable 	e 	= new Consumable("Eggplant", 500,200,500,200,100);
		Consumable  f	= new Consumable("Fruit", 500,200,500,200,100,true);
		int 	i 		= 0;
		while(!p.died()) {
			i++;
			p.update();
			
			switch(i){
			case 500:p.consume(a); p.hungerLU(1500);
			break;
			case 1000:p.consume(b); p.thirstLU(1500);
			break;
			case 1500:p.consume(c); p.happinessLU(1500);
			break;
			case 2000:p.consume(d); p.sleepLU(1500);
			break;
			case 2500:p.consume(e); p.hungerLU(1500);
			break;
			case 3000:p.consume(f); p.thirstLU(1500);
			break;
			}
			//System.out.println(p);

			
			try {
				Thread.sleep(10,0);
			} catch (InterruptedException j) {
				// TODO Auto-generated catch block
				j.printStackTrace();
			}
		}

	}

}
