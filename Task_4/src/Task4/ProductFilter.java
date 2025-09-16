package Task4;

import java.io.*;
import java.nio.file.*;

public class ProductFilter {
	public static void main(String[] args) {
		String inputFile = "products.csv";
		String outputFile = "expensive_products.csv";
		
		System.out.println("Working directory: " + System.getProperty("user.dir"));
		
		if(!Files.exists(Paths.get(inputFile))) {
			System.out.println("Input file not found: " + inputFile);
			return;
		}
		
		try(
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));	
		) {
			String line;
			boolean isHeader = true;
			
			while ((line = br.readLine()) != null) {
				if(isHeader) {
					bw.write(line);
					bw.newLine();
					isHeader = false;
					continue;
				}
				
				String[] parts = line.split(",");
				if (parts.length != 2) continue;
				
				String name = parts[0].trim();
				double price;
				
				try {
					price = Double.parseDouble(parts[1].trim());
				} catch (NumberFormatException e) {
					System.out.println("Invalid price for product: "+name);
					continue;
				}
				
				if (price>1000) {
					bw.write(name + "," + price);
					bw.newLine();
				}
			}
			System.out.println("Expensive prodcuts saved in: " + outputFile);
			
		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
		}
		
	}

}
