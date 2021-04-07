import java.util.Arrays;
import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int k = in.nextInt();
                int[] a = new int[n];
                for(int i = 0; i < n; i++){
                    a[i] = in.nextInt();
                }
                Arrays.sort(a);
                int[] b = new int[k];
                for(int i = 0; i < k; i++){
                    b[i] = in.nextInt();
                }
                for(int i = 0; i < k; i++){
                    int retVal = Arrays.binarySearch(a, b[i]);
                    if(retVal < 0)System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }
