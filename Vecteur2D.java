class Vecteur2D {
    private int x ;
    private int y ;
    static int numbre = 0;

    public Vecteur2D(){
        this.x = 0;
        this.y = 0;
        numbre++;
    }

    public Vecteur2D(int x , int y){
        this.x = x;
        this.y = y;
        numbre++;
    }

    public Vecteur2D(Vecteur2D v1){
        this.x = v1.x;
        this.y = v1.y;
        numbre++;
    }

    public int getX(){
        return x ;
    }  

    public void setX(int x){
        this.x = x ;
    }  

    public int getY(){
        return y ;
    }  

    public void setY(int y){
        this.y = y ;
    }  

    public String ToString(){
        return "abscisse : " + x + "\nordonne : " + y;
    }

    public boolean Equals(Vecteur2D v1){
        if(this.x == v1.getX() && this.y == v1.getY()){
            return true ;
        }else{
            return false ;
        }
    }

    public double Norme(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)) ;
    }

}



    