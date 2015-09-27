package edu.jsu.mcis;

public class UserArgumentParsed{
	
	String argument="";
	int h;
	boolean z;
	float c;
	
	
	public void setArg(String s){
		argument=s;
		//int h=Integer.parseInt(argument);
	}
	
	
	
	public int getInt(){
		int h=Integer.parseInt(argument);
		return h;
	
	}
	
	public float getFloat(){
		
		float c=Float.parseFloat(argument);
		
		return c;
	
	}
	
	public String getString(){
		return argument;
	
	}
	
	public boolean getBoolean(){
		boolean z=Boolean.parseBoolean(argument);
		return z;
	
	}







}