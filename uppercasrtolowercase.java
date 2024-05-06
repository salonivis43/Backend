public class uppercasrtolowercase {
    public static void main(String[] args) {
        String st ="Welcome to scaler";
        UpperCasetoLowerCase(st);
     
    }

    private static void UpperCasetoLowerCase(String st) {
        char[] s= st.toCharArray();

        for(int i=0;i<s.length;i++){
            char ch=s[i];

            if(ch>='A'&& ch<='Z'){
                char ansch=(char)(ch-'A'+'a');
                {
                    s[i]=ansch;
                }
            }
             for(char c:s){
                System.out.println(c);
             }
        }
    }
}
