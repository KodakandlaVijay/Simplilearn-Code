import java.util.Scanner;

class A{
	
	A(){
		
		
		System.out.println("Enter Number");
		Scanner a = new Scanner(System.in);
		int ip = a.nextInt();
		switch(ip){
			
		case 1:
			System.out.println("Value enter is 1");
			break;
			
		case 2:
			System.out.println("Value enter is 2");
			break;
		default:
			System.out.println("No Value");
			break;
		}
	}
}

class B{
	
	B(){
		for(int i=0; i<10; i++){
		
		if(i==6){
		
		System.out.println("i value is "+i);
		
		}
		
		}
	}
	
}

class C{
	
	C(){
	
	System.out.println("====while loop====");
	int j = 0;
	while(j<=5){
		System.out.println(j);
		
		if(j==2){
		break;
			}
		j++;
		}
	
	}
}
class D{
	
	D(){
	
	System.out.println("====do while loop====");
	int j = 0;
	do{
		
		j++;
		if(j==2){
			
		continue;
			}
		System.out.println(j);
		
		}while(j<=5);
	
	}
}
class loopandconditions{
		
		public static void main(String[] args){
				
			//	A a = new A();
			//	B b = new B();
			//	C c = new C();
				D d = new D();
				
		}
}