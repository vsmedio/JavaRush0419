import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution0419{
    public static void main(String[] args)throws Exception  {

    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int [] arr = new int[4];
    int max;

    for(int i = 0; i < arr.length; i++){
        arr[i]=Integer.parseInt(reader.readLine());
    }
    max=arr[0];
    for (int i=1; i<arr.length; i++){
        if (arr[i]>max) {
            max=arr[i];
        }
    }
    System.out.println(max);
}
}