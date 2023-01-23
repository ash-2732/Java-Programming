import java.util.*;

public class Main {
    
    public static void main( String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for( int cs = 1; cs <= test; cs++ ){
            
            int n = sc.nextInt();
            int a[] = new int[n];
            for( int i = 0; i < n; i++ ) a[i] = sc.nextInt();
            Arrays.sort(a);

            for( int value : a ) System.out.print(value + " ");
            System.out.println();
        }
    }
}
