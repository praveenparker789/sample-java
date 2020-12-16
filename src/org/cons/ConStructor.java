package org.cons;

public class ConStructor {

 public ConStructor() {
     this("JAVA");
    System.out.println("Default Constructor"); 
}

   public ConStructor(int id) {
	this(3456.5678f);
	System.out.println(id);
	
}
	public ConStructor(String name) {
		this(12);
		System.out.println(name);
	}
	
	public ConStructor(float sal) {
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		ConStructor v=new ConStructor();
	}
	
	

}
