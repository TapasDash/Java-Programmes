class Student1{  
 int rollno;  
 String name;  
 String city;  
  
 Student1(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   Student1 s1=new Student1(101,"Raj","lucknow");  
   Student1 s2=new Student1(102,"Vijay","ghaziabad");  
     
   System.out.println(this);//compiler writes here s1.toString()  
   System.out.println(this);//compiler writes here s2.toString()  
 }  
}  