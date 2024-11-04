public class SomaInt {
    public static void main(String[] args) {
        SomaInt s = new SomaInt();
        System.out.println(s.SomaInteiros(5));
    }

    /*public int SomaInteiros(int n){
        if(n >= 1) return (SomaInteiros(n - 1) + n);
        return 0;
    }
    */
    
    public int SomaInteiros(int n) throws IllegalArgumentException{ 
        if(n < 1) throw new IllegalArgumentException(); 
        return SomaInteiros_r(n); 
    } 
     
    private int SomaInteiros_r(int n){ 
        if(n == 1) return 1; 
        return n + SomaInteiros_r(n-1); 
    }
}
