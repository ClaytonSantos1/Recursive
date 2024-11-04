public class Archerman {
    public static void main(String[] args) {
        Archerman a = new Archerman();
        System.out.println(a.A(2, 3));
    }

    public int A(int m,int n){
        if(m == 0)return n + 1;
        if(n == 0)return A(m - 1, 1);
        return A(m - 1, A(m, n - 1));
        }   
}
