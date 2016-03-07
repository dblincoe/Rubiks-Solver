package rubiks;

public class Main {
    public static void main(String[] args){
    	Rotate r = new Rotate();
    	int count=0;
    	boolean check = true;
    	while(check){
    		//<ENTER INSTRUCTION>
    		count++;
    		check = r.checkCube();
    		if(count%50000==0){
    			System.out.println(count);
				r.colorCount();
    		}
    		if(count==10000000){
    			check = false;
    			System.out.println("Forced exit after 10,000,000 cycles.");
    		}
    	}
    	System.out.print("The cube took "+ count + " cycles to return to normal shape.");
    }
}


