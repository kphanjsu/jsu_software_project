/*This is the first file
By: Christopher Burdette
    Nathan Chaney
    Kurtis Graben
    Khoi Phan
    Hui Wang
*/
package edu.jsu.mcis;

import java.util.*;
import java.io.*;



public class ArgumentParser{

	private LinkedHashMap<String,String> Arguments;
	private LinkedHashMap<String,Object> DataTypeArguments;
	private LinkedHashMap<String,Object> ObjectArguments;
    UserArgument u= new UserArgument();
    UserArgumentParsed up= new UserArgumentParsed();
    CountOfMessages cm= new CountOfMessages();
    public enum DATATYPE{INT,FLOAT,BOOLEAN,STRING};
    public DATATYPE data;
	public int methodcalled;
	public int NoMessage;
	public int helpMessage;
	public String unrecognizedMessage;
	public int tooManyArguments;
	public int InvalidDataType;
	public int matchArguments;
	
	public ArgumentParser(){
	
		Arguments= new LinkedHashMap<String,String>();
		DataTypeArguments=new LinkedHashMap<String,Object>();
		ObjectArguments=new LinkedHashMap<String,Object>();
		methodcalled=0;
		NoMessage=0;
		helpMessage=0;
		tooManyArguments=0;
		InvalidDataType=0;
		matchArguments=0;
		unrecognizedMessage="";
		data=DATATYPE.STRING;
	
	}
	
	public void addArg(String x){
	
		
		Arguments.put(x,"");
		//(Key, Value);
		//(length, null);
		//(width,null);
		//(height,null);
	}
	
	
	public void addArg(String x, DATATYPE d){
	
		
		DataTypeArguments.put(x,d);
		//(Key, Value);
		//(7, int);
		//(something,string);
		//(true,boolean);
	}
	
	
	public void checkUserInputSize(String[] args){
	
		 if(args.length==1 && !args[0].equals("-h") && !args[0].equals("--h")){
				throw new MissingArgumentException("usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: width height");
			
			
			}
			
		else if(args.length==2){
				throw new MissingArgumentException("usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height");
			
			
			}
		else if(args.length>Arguments.size() || args.length>DataTypeArguments.size()){
				for(int m=3; m < args.length; m++){
					u.setArgument(args[m]);	
				}
				System.out.println(getTooMany());
			 }
	
	
	
	
	
	}
	
	
	public void matchArguments(String[] args){
		matchArguments++;
		int i=0;
			
		if(args.length==Arguments.size()){
			getMessage();
				
			for(String s: Arguments.keySet()){
				System.out.println(s + "/n"); 
				Object o=Arguments.get(s);
				
			
				if(o.equals("")){
					
					Arguments.put(s,new String(args[i]));
						i++;
				}	
			}
		}
	
	
	
	
	
	
	}
	
	
	
	public void matchDataTypeArguments(String[] args){
			
			int j=0;
			
			 if(args.length==DataTypeArguments.size()){
				getMessage();
				
					for(String s: DataTypeArguments.keySet()){
						System.out.println(s + "/n"); 
						Object o=DataTypeArguments.get(s);
				
			
						if(o==data.INT){
							up.setArg(args[j]);
							DataTypeArguments.put(s,up.getInt());
							j++;
						}
						
						if(o==data.FLOAT){
							up.setArg(args[j]);
							float n;
							try{
								 n=up.getFloat();
								}
							catch(NumberFormatException ex){
								
								getInvalidDataType();
								throw new IncorrectDataTypeException("usage: java VolumeCalculator length width height\nVolumeCalcultor.java: error: argument width: invalid float value: " + args[j]);
							}
							DataTypeArguments.put(s,n);
							j++;
						}
						
						if(o==data.STRING){
							up.setArg(args[j]);
							DataTypeArguments.put(s,up.getString());
							j++;
						}
						
						if(o==data.BOOLEAN){
							up.setArg(args[j]);
							DataTypeArguments.put(s,up.getBoolean());
							j++;
						}
						
						
						
						
						
						
					}
				}
	
	
	}

	public void parse(String[] args){
		tooManyArguments=0;
		if(args.length==1 && args[0].equals("-h") || args[0].equals("--h")){
			helpMessage++;
			System.out.println(getHelpMessage());
		}
		else{
			checkUserInputSize(args);
			matchArguments(args);
			matchDataTypeArguments(args);
		}
				
	}
			
			
   	public String getArg(String s){
   		return Arguments.get(s);
   	}
   	
   			
   	public Object getArgs(String s){
   		 return DataTypeArguments.get(s);
   		
   	}
   	
   	public String getInvalidDataType(){
   		InvalidDataType++;
   		throw new IncorrectDataTypeException("usage: java VolumeCalculator length width height\nVolumeCalcultor.java: error: argument width: invalid float value: " + u.getArgument());
   	}
   		
   	public String getTooMany(){
   		tooManyArguments++;
   	    unrecognizedMessage="usage: java VolumeCalculator length width height" + "\n" + "VolumeCalcultor.java: error: unrecognized arguments: " + u.getArgument();
   		return unrecognizedMessage;
   	}
	
	
	public String getMessage(){
		methodcalled++;
		return "just enough variables";
	
	}
	
	
	
   	
   	public String getHelpMessage(){
   		//helpMessage++;
   		return "usage: java VolumeCalculator length width height" + "\n" + "Calcuate the volume of a box." + "\n" + "positional arguments:" + "\n" +   "length the length of the box (float)"  + "\n" +   "width the width of the box(float)" + "\n" + "height the height of the box(float)";
   		
   	}
   	

   	
   	
   	
   	/*
   	public static void main(String[] args){
   		/*
   		  UserArgumentParsed up= new UserArgumentParsed();
   		  up.setArg("7");
   		  float number=up.getFloat();
   		  //int sum= number + 3;
   		  System.out.println(number);
   		  
   		  
   		
   		
   		
   		ArgumentParser Ap= new ArgumentParser();
   		Ap.addArg("length");
		Ap.addArg("width");
		Ap.addArg("height");
		Ap.parse(args);
			
		
		
		
		//System.out.println(Ap.getMessage(args));
		//System.out.println(Ap.getHelpMessage(args));
		System.out.println(Ap.getArg("width"));
		System.out.println(Ap.getArg("length"));
		System.out.println(Ap.getArg("height"));
		
		ArgumentParser dp= new ArgumentParser();
		Ap.addArg("length",dp.data.INT);
		Ap.addArg("width",dp.data.FLOAT);
		Ap.addArg("height",dp.data.STRING);
		Ap.parse(args);
		System.out.println(Ap.getArgs("width"));
		System.out.println(Ap.getArgs("length"));
		System.out.println(Ap.getArgs("height"));
		//int output=Ap.getArgs("width") + Ap.getArgs("length") + Ap.getArgs("height");
		//System.out.println(output);
		
		
   		
   	
   	
   	
   	}
   	*/
   	
   	
   	
   	
	

}






