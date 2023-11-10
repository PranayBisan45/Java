public class arr {
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,16}; 

       for(int i=0;i<arr.length;i++) {
        
        for(int j=0;j<arr.length;j++) {
            int a=arr[j];
            int b=a*a;
        if(arr[i]==b) {
            System.out.println(arr[j]+ " "+arr[i]);
        }
       
        }
       }
    }
}
