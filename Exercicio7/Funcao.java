public class Funcao {
    public static void main(String[] args) {
        System.out.println(Funcao.f(2));
        System.out.println(Funcao.f(4));
        System.out.println(Funcao.f(9));
    }

    public static int f(int x){
        int res;
        if(x < 4) res = 3 * x;
        else res = 2 * f(x - 4) + 5;
        return res;
    }
}
