class CountWordsInString{
    public static void main(String[] args) {
        String str = "Java is java and i am python";
        // String[] strSplit = str.split("\s");
        int count=1;

        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }

        // for(String s:strSplit){
        //     // System.out.println(s);
        //     count++;
        //     // for(int i=0;i<s.length();i++){
        //     //     count++;
        //     // }
        // }

        System.out.println(count);
        
    }
}