public class otroejerc {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = a.clone();
        System.out.println(b[0]);
        b[0] = 100;
        System.out.println(a[0]);
    }
    
}
