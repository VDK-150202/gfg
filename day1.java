package gfg_problems.Arrays;
public class Main3 {
    public static String func(String inputStr, int n){
        char ch;
        String str= inputStr.replaceAll("\\s","");
        String st="";
        for(int i=0; i< str.length(); i++){
        ch= str.charAt(i);
        StringBuilder s1= new StringBuilder();
        if(ch>='a' && ch<= 'z' || ch >='A' && ch<='Z' || ch>='0' && ch<='9'){
            s1.append(ch);
          st= st+ s1.toString();
        }
        }
        return st;
        
    }
    public static void main(String[] args) {
        String inputStr= "vai bhav kor02 @ gmail . com ";
        int n= inputStr.length();
       String k= func(inputStr, n);
        System.out.println(k);
    }
    
}
