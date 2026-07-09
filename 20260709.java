import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static String myToString(int[]array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            str=str+array[i];
            if(i==array.length) {
                str = str + ",";
            }
            str+="]";
        }
        return str;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        String ret= Arrays.toString(arr);
        System.out.println(ret);

        int[]arr1={2,4,6,1,3,99,57,4};
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        Arrays.fill(arr1,-1);
//        System.out.println(Arrays.toString(arr1));

        int[][]array=new int[2][];
        array[0]=new int[3];
        array[1]=new int[5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }

        }
        for(int[]tmpArr:array){
            for(int x:tmpArr){
                System.out.print(x+" ");
            }
        }
        System.out.println(Arrays.deepToString(array));
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
    }
}
