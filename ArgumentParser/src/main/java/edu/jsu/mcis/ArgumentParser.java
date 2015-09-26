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

	private LinkedHashMap<String,String> positionalArguments;

	
	public ArgumentParser(){
	
		positionalArguments= new LinkedHashMap<String,String>();
		String[] args;
		 
	
	}
	
	public void addPositionalArguments(String x){
	
		
		positionalArguments.put(x,"");
		//(Key, Value);
		//(length, null);
		//(width,null);
		//(height,null);
	}
	

	
	
	public void parse(String[] args){
		int i=0;
		if(args.length>=3){
			for(String s: positionalArguments.keySet()){
				System.out.println(s + "/n"); 
					Object o=positionalArguments.get(s);
				
			
					if(o.equals("")){
					
						positionalArguments.put(s,new String(args[i]));
						i++;
					}	
				}
			}
      
   		
   	}
  
   	
   	public String getArg(String s){
   		return positionalArguments.get(s);
   	}
   		
   		
   	
   	public int getSize(){
   		return positionalArguments.size();
   	
   	}
   	
   	
   
   	
   	public String getMessage(String[] args){
   	
   			if(args.length==1){
   				
   				return "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: width height";
   			
   			}
   			
   			
   			
   			if(args.length==2){
   			
   				return "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height";
   			
   			}
   			
   			if(args.length==3){
   			
   				return "just enough variables";
   			}
   			
   			 if( args.length>3){
   				 for(int m=3; m < args.length; m++){
   				 	return "usage: java VolumeCalculator length width height. VolumeCalculator.java: error: unrecognized arguments:" + args[m];
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
   	
   	public String getHelpMessage(String[] args){
   		for (String help: args){
   			if (help.equals("-h")){
   				return "usage: java VolumeCalculator length width heigh. Calculate the volume of a box. positional arguments: length the length of the box. width the width of the box. height the height of the box";
   			}
   		}
   		
   		return " ";
   	
   	}
   	
   	public static void main(String[] args){
   		
   		ArgumentParser Ap= new ArgumentParser();
   		Ap.addPositionalArguments("length");
		Ap.addPositionalArguments("width");
		Ap.addPositionalArguments("height");
		Ap.parse(args);
		
		System.out.println(Ap.getMessage(args));
		//System.out.println(Ap.getHelpMessage(args));
		System.out.println(Ap.getArg("width"));
		System.out.println(Ap.getArg("length"));
		System.out.println(Ap.getArg("height"));
		/*
		ArgumentParser cp=new ArgumentParser();
		cp.addPositionalArguments("pet");
		cp.addPositionalArguments("number");
		cp.addPositionalArguments("rainy");
		cp.addPositionalArguments("bathrooms");
		cp.parse(args);
		
		System.out.println(cp.getArg("pet"));
		System.out.println(cp.getArg("number"));
		System.out.println(cp.getArg("rainy"));
		*/
   	
   	
   	
   	
   	
   	}
	

}






