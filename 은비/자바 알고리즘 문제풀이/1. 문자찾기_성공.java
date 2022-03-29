package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 문자찾기 {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char s : str.toCharArray()) {
            if(s == c)  answer++;
        }

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c) {
//                answer++;
//            }
//        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = (char)br.read();

        문자찾기 obj = new 문자찾기();
        System.out.println(obj.solution(str, c));
    }
}
