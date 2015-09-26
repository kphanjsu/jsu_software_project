import edu.jsu.mcis.*;

public class VolumeCalculator{


	public static void main(String[] args){
   		
   		ArgumentParser Ap= new ArgumentParser();
   		Ap.addPositionalArguments("length");
		Ap.addPositionalArguments("width");
		Ap.addPositionalArguments("height");
		Ap.parse(args);
		
		System.out.println(Ap.getMessage(args));
		System.out.println(Ap.getArg("width"));
		System.out.println(Ap.getArg("length"));
		System.out.println(Ap.getArg("height"));
   	
   	
   	
   	
   	
   	
   	}
   	
}