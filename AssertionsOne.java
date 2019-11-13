class AssertionsOne {
     String state;
     AssertionsOne(String state) {
         this.state += state;//this.state=this.state+state;
     }
     public static void main(String args[]){
         AssertionsOne ao = new AssertionsOne("YES");
         if (!ao.state.equals("YES")) {
             System.out.println("Ut-oh!! unexpected result in state: "+ao.state);
		 }
			 
     }
}