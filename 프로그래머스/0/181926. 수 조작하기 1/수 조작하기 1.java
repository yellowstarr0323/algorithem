class Solution {
    public int solution(int n, String control) {
        char[] alpha=control.toCharArray();
        for(int i=0;i<alpha.length;i++){
          if(alpha[i]=='w'){
            n++;
          }
          if(alpha[i]=='s'){
            n--;
          }
          if(alpha[i]=='a'){
            n-=10;
          }
          if(alpha[i]=='d'){
            n+=10;
          }
        }
        System.out.println(n);
        return n;
    }
}