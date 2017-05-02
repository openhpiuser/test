package testpackage;

import java.util.Arrays;

public class Story {

	public static void main(String[] args){
		
		if(args.length > 0){
			int i = 0;
			for (String s : Arrays.asList(args)){
				System.out.println("Argument " + i + ": "+ s);
				i++;
			}
		}
		
		System.out.println("Swing, AWT, WindowBuilder, Processing");
		
		
		Animal par = new Parrot();
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test4");
		
		System.out.println("WohnzimmerPC_01");  
		System.out.println("Notebook_01");
		System.out.println("WohnzimmerPC_02"); 
	}
}
