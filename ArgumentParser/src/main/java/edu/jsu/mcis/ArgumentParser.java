/*This is the first file
By: Christopher Burdette
    Nathan Chaney
    Kurtis Graben
    Khoi Phan
    Hui Wang
*/
package edu.jsu.mcis;

import java.util.*;

public class ArgumentParser {

	private HashMap<String,String> positionalArguments;
	
	public ArgumentParser(){
	
		positionalArguments= new HashMap<String,String>();
	
	
	}
	
	public void addPositionalArguments(String x){
		positionalArguments.put(x, null);
		//(Key, Value);
		//(length, null);
		//(width,null);
		//(height,null);
	}
	
	
	
	public void parse(String[] args){
	
		if(args.length==1){
			positionalArguments.put("length",args[0]);
		}
		else if(args.length==2){
			positionalArguments.put("width",args[1]);
			
			}
		else if(args.length==3){
		
			positionalArguments.put("height",args[2]);
				
		}
		
	/*
		for(String Key: positionalArguments.keySet()){
		
			if(Key.equals("length")){
				
				positionalArguments.put("length",args[0]);
			
			}
			
			else if(Key.equals("width")){
				
				positionalArguments.put("width",args[1]);
			
			}
			
			else if(Key.equals("height")){
				
				positionalArguments.put("height",args[2]);
			
			
			}
			
   			 
   			 
   			 
   		}
   		*/
   		
   	}
   		
   		
   	
   	public int getSize(){
   		return positionalArguments.size();
   	
   	}
   	
   	
   	public String getMessage(String[] args){
   		for(int i=0; i < args.length; i ++){
   			if(args.length==1){
   				
   				return "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: width height";
   			
   			}
   			
   			else if(args.length==2){
   			
   				return "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height";
   			
   			}
   			
   			else if(args.length==3){
   			
   				return "just enough variables";
   			}
   			
   			else if( args.length>3){
   				for(int k=3; k < args.length; k++){
   					return "usage: java VolumeCalculator length width height. VolumeCalculator.java: error: unrecognized arguments:" + args[k];
   					}
   					
   				}   			
   			
   		}
   		
   		
   		return "no values entered";
   		
   		/*
   		if(args.length>3){
		
		return tooManyArgs();
			
			}
		else 
			return notThatManyArgs();
			
		*/
			
	}
	
	/*
	
	
	public String tooManyArgs(){
	
		return "usage: java VolumeCalculator length width height. VolumeCalculator.java: error: unrecognized arguments:";
		
	
	
	}
	
	
	public String notThatManyArgs(){
	
			return "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height";
	
	
	}
   	
   	
   	
   	public boolean determineSizeOfHashMap(){
   		if(getSize()==3){
   			
   			return true;
   		}
   		
   		else
   			return false;
   	
   	
   	}
   	*/
   	
   	
   	
   	public static void main(String[] args){
   		
   		ArgumentParser Ap= new ArgumentParser();
   		Ap.addPositionalArguments("length");
		Ap.addPositionalArguments("width");
		Ap.addPositionalArguments("height");
		Ap.parse(args);
		
		System.out.println(Ap.getMessage(args));
   	
   	
   	
   	
   	}
	

}






