public class square_root {

    public static void main(String[] args) {
        System.out.println(mySqrt(214748367));
    }
   
        static int mySqrt(int x) {
             if(x == 0)
             return 0;
             int new_x = (int) Math.sqrt(x);
             int i = 1;
            for(;i <= new_x; i++){
                if(i * i == x)
                return i;
            }
            return i - 1;
        }
}
