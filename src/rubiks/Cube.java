package rubiks;
import java.util.Arrays;
public class Cube {
	//private String[][] front = new String[3][3];
	//private String[][] back = new String[3][3];
	//private String[][] left = new String[3][3];
	//private String[][] right = new String[3][3];
	//private String[][] top = new String[3][3];
	//private String[][] bottom = new String[3][3];
	protected String[][][] cube = new String[6][3][3];
    private final String[] colors = {"red","orange","green","blue","white","yellow"};

    public Cube() {
        int count =0;
        for(int i=0;i<6;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    this.cube[i][j][k] = this.colors[i];
                    count++;
    		    }
    	    }
        }    		
    }

    public String[][][] getCopy(){
        String[][][] rCube = new String[6][3][3];
        for(int i=0;i<6;i++){
            for(int k=0;k<3;k++){
                rCube[i][k] = Arrays.copyOf(this.cube[i][k],3);
            }
        }
        return rCube;
    }

    public boolean checkCube(){
        int c=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(cube[i][1][1].equals(cube[i][j][k])){
                        c++;
                    }
                }
            }
            if(c==9){
                c=0;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean colorCount(){
        int red=0;
        int blue=0;
        int yellow=0;
        int green=0;
        int white=0;
        int orange=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                   if(cube[i][j][k].equals("red")){
                        red++;
                   } else if(cube[i][j][k].equals("blue")){
                        blue++;
                   } else if(cube[i][j][k].equals("white")){
                        white++;
                   } else if(cube[i][j][k].equals("orange")){
                        orange++;
                   } else if(cube[i][j][k].equals("green")){
                        green++;
                   } else if(cube[i][j][k].equals("yellow")){
                        yellow++;
                   }
                }
            }
        }
        System.out.println("There were red "+red+", blue "+blue+", yellow "+yellow+", green "+green+", white "+white+", orange "+orange);
        if((red!=8)||(yellow!=8)||(orange!=8)||(white!=8)||(green!=8)||(blue!=8)){
            return false;
        } else{
            return true;
        }
    }

    public void print(){
        for(int i=0;i<6;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.print(" "+this.cube[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("***************************************");
    }
}
