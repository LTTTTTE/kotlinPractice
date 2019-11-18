package test;


public class Test {
    public static void main(String[] args) {
        String arg = "()(((()())(())()))(())";
        System.out.println(solution(arg));
    }
    public static int solution(String string) {
        int answer = 0;
        int bar = 0;
        String str = string.replaceAll("\\(\\)", "L");
        System.out.println(str);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                bar++;
            }
            if(str.charAt(i) == 'L' && bar != 0){
                answer += (bar + 1);
            }
            if(str.charAt(i) == ')'){
                bar--;
            }
        }
        return answer;
    }
}
