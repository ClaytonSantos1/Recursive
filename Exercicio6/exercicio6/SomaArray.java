public class SomaArray {
    public static void main(String[] args) {
        SomaArray s = new SomaArray();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        
        System.out.println(s.SomaElementos(array));
    }

    public int SomaElementos(int[] v) throws IllegalArgumentException{
        if(v == null) throw new IllegalArgumentException();
        return SomaElementos(v, 0);
    }

    private int SomaElementos(int[] v, int i){
        if(i >= v.length) return 0;
        return v[i] + SomaElementos(v, i+1);
    }
}
