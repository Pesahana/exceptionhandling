package customexception;

import java.util.Scanner;

class Main {
void validWeight (int weight) throws
WeightLimitExceeded{
	if(weight>15)
		throw new WeightLimitExceeded(weight);
	else
		System.out.println("You are ready to FLY");
	
}
public static void main(String args[]) {
	Main ob=new Main();
	Scanner in=new Scanner(System.in);
	for(int i=0; i<2; i++) {
		try {
			ob.validWeight(in.nextInt());
			
		}
		catch(WeightLimitExceeded e) {
			System.out.println(e);
		}
	}
  }
}
