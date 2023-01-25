package customexception;

public class WeightLimitExceeded extends Exception{
	WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }

}
