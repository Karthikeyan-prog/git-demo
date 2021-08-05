package com.karthi.spring.git_demo;

public class App 
{
	public void addData(String data) {
		System.out.println("Data: "+data);
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Groww is Printed");
		}
	}
	public void addedMethod(){
	System.out.println("New Method"); 
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
