public class Principal {
    public static void main(String[] args) {
        Principal p = new Principal();
        System.out.println(p.Metodo(5, 3));
        System.out.println(p.Metodo(15, 3));
        System.out.println(p.Metodo(28, -45));
    }

    public int Metodo(int a, int b){
        if(b <= 1)
            return a;
        else
            return Metodo(b, a/b);
    }
}
