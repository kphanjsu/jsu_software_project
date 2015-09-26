import edu.jsu.mcis.*;


public class ArgumentParserKeywords {
   private ArgumentParser ap;
    
    
    public void StartVolumeCalculatorWithArguments(String[] args){
    	ap=new ArgumentParser();
    		ap.addPositionalArguments("length");
			ap.addPositionalArguments("width");
			ap.addPositionalArguments("height");
			ap.parse(args);
			getLength();
			getWidth();
			getHeight();
			
    }
    
    
    
    public void StartAbsurdProgramWithArguments(String[] args){
    		ap=new ArgumentParser();
    		ap.addPositionalArguments("pet");
			ap.addPositionalArguments("number");
			ap.addPositionalArguments("rainy");
			ap.addPositionalArguments("bathrooms");
			ap.parse(args);
			/*
			getPet();
			getNumber();
			getRainy();
			getBathrooms();
			*/
    	
			
    
    
    
    } 
    
    
    	public String getPet(){
    		return ap.getArg("pet");
    	
    	
    	}
    	
    	
    	
    	public String getNumber(){
    		return ap.getArg("number");
    	
    	
    	}
    	
    	
    	public String getRainy(){
    		return ap.getArg("rainy");
    	
    	}
    	
    	public String getBathrooms(){
    		return ap.getArg("bathrooms");
    	
    	}
    
    
    
    	
    	public String getLength(){
    
    		return ap.getArg("length");
    
    	}
    
		public String getWidth(){
    		return ap.getArg("width");
    	}
    
   	 	public String getHeight(){
    		return ap.getArg("height");
    	}
    
    	public String getProgramOutput(){
    		int sum=0;
    		
    		
   			sum=Integer.parseInt(ap.getArg("length")) * Integer.parseInt(ap.getArg("width")) * Integer.parseInt(ap.getArg("height"));
   			
   			return Integer.toString(sum);
    
    	}
  
    /*
    public String greetEveryone() {
        return helloWorld.showIt();
    }
    
    public String reverseGreetEveryone() {
        return helloWorld.reverseIt();
    }
    */
    
}