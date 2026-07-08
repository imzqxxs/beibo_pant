public class Test {
    public static int[] and(int[]array,int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    //寻找数组中只出现了一次的数字
    public static int findSum(int[]array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            count=0;
            for (int j = 0; j < array.length; j++) {
                if(array[j]==array[i]){
                    count++;
                }
            }
            if(count==1){
                return array[i];
            }
        }
          return -1;
    }
    public static void Bubble(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    //二分查找，返回下标,升序数组
    public static int midFind(int[]array,int n){
        int right= array.length-1;
        int left=0;
        int mid=0;
        while(left<=right){
           mid=(right+left)/2;
            if(array[mid]==n){
                return mid;
            } else if(array[mid]<n) {
                left=mid+1;
            }else if(array[mid]>n){
                right=mid-1;
            }
        }
        return -1;

    }
    //先输出奇数，在输出偶数
    public static void regardArray(int[]array){
        int[] newArray=new int[array.length];
        int num=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                newArray[num]=array[i];
                num++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if(array[j]%2==0){
                newArray[num]=array[j];
                num++;
            }
        }
        print_array(newArray);
    }
    public static void transform(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]*2);
        }
    }
    public static void print_array(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
//        transform(arr);
//        print_array(arr);
//        regardArray(arr);
//        int f= midFind(arr,8);
//        int g= midFind(arr,3);
//        int h= midFind(arr,1);
//
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);

        int[]arr2={2,3,5,7,3,1,2};
//        Bubble(arr2);
//        print_array(arr2);

//        int[]arr3={1,1,2,3,4,2,3};
//        int l=findSum(arr3);
//        System.out.println(l);
//
        int[]arr4={2,7,11,15};
        int[]arr5=and(arr4,9);
        print_array(arr5);
    }
}
