package rubiks;
public class Rotate extends Cube {
    public Rotate(){
        super();
    }
	public void R(){
		String[][][] tmp1 = getCopy();
		for(int i=0;i<3;i++){
			this.cube[0][i][2] = tmp1[5][i][2];		//Bottom to Front
			this.cube[4][i][2] = tmp1[0][i][2];		//Front to Top
			this.cube[1][2-i][0] = tmp1[4][i][2];		//Top to Back
			this.cube[5][i][2] = tmp1[1][2-i][0];		//Back to Bottom
		}
		this.rotateFace('r',3);
    }

//    {"red","orange","green","blue","white","yellow"}

    public void RPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[0][i][2] = tmp1[4][i][2];     //Top to Front
            this.cube[5][i][2] = tmp1[0][i][2];       //Front to Bottom
            this.cube[1][i][0] = tmp1[5][2-i][2];       //Bottom to Back
            this.cube[4][2-i][2] = tmp1[1][i][0];     //Back to Top
        }
        this.rotateFace('l',3);
    }

    public void L(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[0][i][0] = tmp1[4][i][0];     //Top to Front
            this.cube[5][i][0] = tmp1[0][i][0];       //Front to Bottom
            this.cube[1][i][2] = tmp1[5][2-i][0];       //Bottom to Back
            this.cube[4][2-i][0] = tmp1[1][i][2];     //Back to Top
        }
        this.rotateFace('r',2);
    }

    public void LPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[0][i][0] = tmp1[5][i][0];     //Bottom to Front
            this.cube[4][i][0] = tmp1[0][i][0];     //Front to Top
            this.cube[1][2-i][2] = tmp1[4][i][0];       //Top to Back
            this.cube[5][i][0] = tmp1[1][2-i][2];       //Back to Bottom
        }
        this.rotateFace('l',2);
    }


//    {"red","orange","green","blue","white","yellow"}

    public void U(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[2][0][i] = tmp1[0][0][i];     //Front to Left
            this.cube[1][0][i] = tmp1[2][0][i];     //Left to Back
            this.cube[3][0][i] = tmp1[1][0][i];       //Back to Right
            this.cube[0][0][i] = tmp1[3][0][i];       //Right to Front
        }
        this.rotateFace('r',4);
    }


    public void UPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[3][0][i] = tmp1[0][0][i];     //Front to Right
            this.cube[1][0][i] = tmp1[3][0][i];     //Right to Back
            this.cube[2][0][i] = tmp1[1][0][i];       //Back to Left
            this.cube[0][0][i] = tmp1[2][0][i];       //Left to Front
        }
        this.rotateFace('l',4);
    }

    public void D(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[3][2][i] = tmp1[0][2][i];     //Front to Right
            this.cube[1][2][i] = tmp1[3][2][i];     //Right to Back
            this.cube[2][2][i] = tmp1[1][2][i];       //Back to Left
            this.cube[0][2][i] = tmp1[2][2][i];       //Left to Front
        }
        this.rotateFace('r',5);
    }

    public void DPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[2][2][i] = tmp1[0][2][i];     //Front to Left
            this.cube[1][2][i] = tmp1[2][2][i];     //Left to Back
            this.cube[3][2][i] = tmp1[1][2][i];       //Back to Right
            this.cube[0][2][i] = tmp1[3][2][i];       //Right to Front
        }
        this.rotateFace('l',5);
    }

//    {"red","orange","green","blue","white","yellow"}

    public void F(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[3][i][0] = tmp1[4][2][i];     //Top to Right
            this.cube[5][0][2-i] = tmp1[3][i][0];     //Right to Bottom
            this.cube[2][i][2] = tmp1[5][0][i];       //Bottom to Left
            this.cube[4][2][2-i] = tmp1[2][i][2];       //Left to Top
        }
        this.rotateFace('r',0);
    }


    public void FPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[2][2-i][2] = tmp1[4][2][i];     //Top to Left
            this.cube[5][0][i] = tmp1[2][i][2];     //Left to Bottom
            this.cube[3][2-i][0] = tmp1[5][0][i];       //Bottom to Right
            this.cube[4][2][i] = tmp1[3][i][0];       //Right to Top
        }
        this.rotateFace('l',0);
    }

    public void B(){
        String[][][] tmp1 = getCopy();
        ;
        for(int i=0;i<3;i++){
            this.cube[2][2-i][0] = tmp1[4][0][i];     //Top to Left
            this.cube[5][2][i] = tmp1[2][i][0];     //Left to Bottom
            this.cube[3][2-i][2] = tmp1[5][2][i];       //Bottom to Right
            this.cube[4][0][i] = tmp1[3][i][2];       //Right to Top
        }
        this.rotateFace('r',1);
    }

    public void BPrime(){
        String[][][] tmp1 = getCopy();
        for(int i=0;i<3;i++){
            this.cube[3][i][2] = tmp1[4][0][i];     //Top to Right
            this.cube[5][2][2-i] = tmp1[3][i][2];     //Right to Bottom
            this.cube[2][i][0] = tmp1[5][2][i];       //Bottom to Left
            this.cube[4][0][2-i] = tmp1[2][i][0];       //Left to Top
        }
        this.rotateFace('l',1);
    }

    public void rotateFace(char dir, int  face){
    	
    	String[][][] tmp1 = getCopy();
    	if(dir == 'r'){
    		this.cube[face][0][2] = tmp1[face][0][0];
    		this.cube[face][1][2] = tmp1[face][0][1];
    		this.cube[face][2][2] = tmp1[face][0][2];
    		this.cube[face][2][1] = tmp1[face][1][2];
    		this.cube[face][2][0] = tmp1[face][2][2];
    		this.cube[face][1][0] = tmp1[face][2][1];
    		this.cube[face][0][0] = tmp1[face][2][0];
    		this.cube[face][0][1] = tmp1[face][1][0];
    	} else if(dir == 'l'){
    		this.cube[face][2][0] = tmp1[face][0][0];
    		this.cube[face][2][1] = tmp1[face][1][0];
    		this.cube[face][2][2] = tmp1[face][2][0];
    		this.cube[face][1][2] = tmp1[face][2][1];
    		this.cube[face][0][2] = tmp1[face][2][2];
    		this.cube[face][0][1] = tmp1[face][1][2];
    		this.cube[face][0][0] = tmp1[face][0][2];
    		this.cube[face][1][0] = tmp1[face][0][1];
    	}
    }
}
