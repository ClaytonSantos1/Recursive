public class Principal {
    public static void main(String[] args) {
        Principal p = new Principal();
        System.out.println(p.Metodo(4));
        System.out.println(p.Metodo(-3));
        System.out.println(p.Metodo(6));

    }

    public int Metodo(int x){
        if(x <= 1)
            return 1;
        else{
            return x * 2 + Metodo(x - 1);
        }
    }
}
