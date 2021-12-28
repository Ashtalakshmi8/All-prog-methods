class Factorial{
         static void printFactorial (){
         int fact=1;
           for(int num=1;num<=5;num=num+1){
			   
              fact=fact*num;
           }
           System.out.println(fact);
		   }
		   
		   
		static void printFactorialseries (){
         int fact=1;
           for(int index=1;index<=10;index=index++){
			   
              fact=fact*index;
           
           System.out.println(fact);
		   }
		}
		
		
 
		 static void printFibonics (){		 
		 int a=0,n=10,c=1;
           
              
               
                for(int i=1;i<=n;++i){
           
             
               System .out.println(a + " \t");
               int n=a+b; 
			   a=b;
                b=c;
		   }
		 }
		 
		 	public static void main(String[]args){
		       printFibonics ();		   
		   
		 }
		 
	

}