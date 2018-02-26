package Package_new;

public class Loops {

	int marks=00;

	public void Obtaioned_marks(){
	if(marks>80){
		System.out.println("Congratulations you got 1st  Class");
	}
	else if((marks>60) && (marks<80)){
		System.out.println("Congratulations you got 2nd  Class");
		
	}
	else if((marks>40)&& (marks<60)){
		System.out.println("Congratulations you got 3rd  Class");
	}
	
	else{
		System.out.println("You are Failled....");
	}
}
	
	
}