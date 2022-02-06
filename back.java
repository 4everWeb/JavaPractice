import java.util.Scanner;

public class sual {
    
    public static final int START = 1;
    public static final int END = 3;
    
    public static int len;
    public static int[] arr;
    public static boolean is_end = false;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        len = sc.nextInt();
        
        arr = new int[len];
        
        backtracking("");
    }
    
    public static void backtracking(String str) {
        if(is_end) return;          //목표값을 찾으면 더이상 깊어지지않는 dfs 트리거
        System.out.println("is_end=="+is_end);
        
        if(str.length() == len) {
            System.out.println("str==================="+str);
            is_end = true;
            
            return;
        }
        
        for(int i= START; i <= END; i++) {
        	 System.out.println("i=="+i);
        	 System.out.println("str+i=="+str+i);
            if(isAble(str+i)) {
            	 System.out.println("backtracking==");
                backtracking(str+i);
            }
        }
    }
    public static boolean isAble(String str) {
    	 System.out.println("isAble=="); 
        int len = str.length(); 
        System.out.println("len=="+len);
        // 1212 가 들어올 경우
        // 한글자씩 비교 했을 경우에는 유효하지만
        // 두글자씩 비교 했을 경우에는 12 12 가 같으므로 유효하지 않다. 
        for(int i = 1; i <= len/2; i++) {
        	 System.out.println("for i=="+i);
            String front_str = str.substring(str.length()-i-i, str.length()-i);
            String behind_str = str.substring(str.length()-i, str.length());
            System.out.println("str.length()-i-i=="+(str.length()-i-i));
            System.out.println("str.length()-i=="+(str.length()-i));
            System.out.println("str.length()-i)=="+(str.length()-i));
            System.out.println("str.length()=="+str.length());
            System.out.println("front_str=="+front_str);
            System.out.println("behind_str=="+behind_str);
            
            if(front_str.equals(behind_str)) return false;
        }
        
        return true;
    }
}