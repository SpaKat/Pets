package constaint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Constants {
	public static String FILELOCATION = "src/main/resources/"; 
	private static HashMap<String,Double> CONSTANTS;
	private double decayHunger; 
	private double decayHappiness;
	private double decayThirst;
	private double decaySleep;
	private int width;
	private int height;
	private int maxPetsPerUser;
	public Constants() throws IOException {
		File file = new File(FILELOCATION + "Constants.txt");
		if(file.createNewFile()) {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Decay Hunger = .0001\n");
			bw.write("Decay Happiness = .0001\n");
			bw.write("Decay Thirst = .0001\n");
			bw.write("Decay Sleep = .0001\n");
			bw.write("Width = 1280\n");
			bw.write("Height = 720\n");
			bw.write("MaxPetsPerUser = 10\n");
			bw.close();
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line;
		while ( !((line = br.readLine())==null) ) {
			//parse(line);
			String[] command = line.split("=");
			CONSTANTS.put(command[0].trim(),Double.parseDouble(command[1].trim()));
			
		}

		br.close();
	}
	/*
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
		case "Decay Thirst":
			try {
				decayThirst = Double.parseDouble(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Decay Thirst failed");
			}
			break;
		case "Decay Sleep":
			try {
				decaySleep = Double.parseDouble(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Decay Sleep failed");
			}
			break;
		case "Width":
			try {
				width = Integer.parseInt(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Width failed");
			}
			break;
		case "Height":
			try {
				height = Integer.parseInt(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Height failed");
			}
			break;
		case "MaxPetsPerUser":
			try {
				maxPetsPerUser = Integer.parseInt(command[1].trim());
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("MaxPetsPerUser failed");
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
	public double getDecayThirst() {
		return decayThirst;
	}
	public double getDecaySleep() {
		return decaySleep;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getMaxPetsPerUser() {
		return maxPetsPerUser;
	}
	*/
	public static HashMap<String, Double> getCONSTANTS() {
		return CONSTANTS;
	}
	
}
