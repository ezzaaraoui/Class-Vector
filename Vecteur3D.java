public class Vecteur3D extends Vecteur2D{
    private int z;

    public Vecteur3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Vecteur3D( int z) {
        super();
        this.z = z;
    }
    public Vecteur3D(Vecteur2D v1, int z) {
        super(v1);
        this.z = z;
    }
    
    public int getZ(){
        return z ;
    }  

    public void setZ(int z){
        this.z = z ;
    }  

    public String ToString(){
        return "abscisse : " + getX() + "\nordonne : " + getY()  + "z : " + z;
    }

    public boolean Equals(Vecteur3D v3){
        if(this.getX() == v3.getX() && this.getY() == v3.getY() && this.z == v3.getZ()){
            return true ;
        }else{
            return false ;
        }
    }

    public double Norme(){
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2)) ;
    }
}


