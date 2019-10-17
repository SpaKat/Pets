package constaint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Constants {

	private double decayHunger; 
	private double decayHappiness; 
	public Constants() throws IOException {
		File file = new File("Constants.txt");
		if(file.createNewFile()) {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Decay Hunger = .0001\n");
			bw.write("Decay Happiness = .0001\n");
			bw.close();
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line;
		while ( !((line = br.readLine())==null) ) {
			parse(line);
		}

		br.close();
	}
	private void parse(String line) {
		String[] command = line.split("=");
		switch(command[0].trim()) {
		case "Decay Hunger":
			try {
				decayHunger = Double.parseDouble(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Decay Hunger failed");
			}
			break;
		case "Decay Happiness":
			try {
				decayHappiness = Double.parseDouble(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Decay Happiness failed");
			}
			break;
		default:
			System.out.println("Failed Command: " + command[0]);
			break;
		}
	}
	public double getDecayHunger() {
		return decayHunger;
	}
	public double getDecayHappiness() {
		return decayHappiness;
	}
	public static void main(String[] args)   {
		try {
			Constants c = new Constants();
			System.out.println(c.getDecayHunger());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public double getDecayThrist() {
		// TODO Auto-generated method stub
		return 0;
	}
}