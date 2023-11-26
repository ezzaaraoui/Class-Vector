public class Main {
    public static void main(String[] args) {
        Vecteur2D v1 = new Vecteur2D(10, 15);
        Vecteur2D v2 = new Vecteur2D(10, 15);
        System.out.println(v1.ToString());
        System.out.println(v1.Equals(v2));
        System.out.println(v1.Norme());
        System.out.println(Vecteur2D.numbre);


        Vecteur3D v3 = new Vecteur3D(10, 15,12);
        Vecteur3D v4 = new Vecteur3D(10, 15,12);
        System.out.println(v4.ToString());
        System.out.println(v4.Equals(v3));
        System.out.println(v4.Norme());
        System.out.println(Vecteur2D.numbre);


    }
}
