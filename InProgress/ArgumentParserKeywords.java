import edu.jsu.mcis.*;


public class ArgumentParserKeywords {
   private ArgumentParser ap;
   private CountOfMessages cm= new CountOfMessages();
    
    
    public void StartVolumeCalculatorWithArguments(String[] args){
    	ap=new ArgumentParser();
    	ap.addArg("length");
		ap.addArg("width");
		ap.addArg("height");
		//cm.setCount(0);
		ap.parse(args);
		
			
			
    }
    
    
    public void StartVolumeCalculatorWithUserArguments(String[] args){
    	ap=new ArgumentParser();
    	ap.addArg("length");
		ap.addArg("width");
		ap.addArg("height");
		//cm.setCount(0);
		ap.parse(args);
		
			
			
    }
    
    public void StartProgramWithArguments(String[] args){
    	ap=new ArgumentParser();
    	ap.parse(args);
    	//cm.setCount(ap.helpMessage);
    }
    
    public void StartAbsurdProgramWithArguments(String[] args){
    		ap=new ArgumentParser();
    		ap.addArg("pet");
			ap.addArg("number");
			ap.addArg("rainy");
			ap.addArg("bathrooms");
			ap.parse(args);
		
	} 
	
   public void StartProgramWithDataTypeArguments(String[] args){
    	ap=new ArgumentParser();
    	ap.addArg("length",ap.data.FLOAT);
		ap.addArg("width", ap.data.FLOAT);
		ap.addArg("height",ap.data.FLOAT);
		ap.parse(args);
		
			
			
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
    		if(ap.helpMessage==1){
    			return ap.getHelpMessage();
    		}
    		if(ap.tooManyArguments==1 && !(ap.matchArguments==1)){
    			return ap.getTooMany();
    		}
    		 if(ap.InvalidDataType==1){
    			
    			return ap.getInvalidDataType();
    		
    		}
    		/*
    	
    		else {
    			int sum=0;
    			sum=Integer.parseInt(ap.getArg("length")) * Integer.parseInt(ap.getArg("width")) * Integer.parseInt(ap.getArg("height"));
   				return Integer.toString(sum);
   			}
   			*/
    
    	}
  
  
    
}