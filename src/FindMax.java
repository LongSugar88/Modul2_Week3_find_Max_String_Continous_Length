public class FindMax {
    static String find(String mystring){
        StringBuilder result = new StringBuilder();
        StringBuilder draft = new StringBuilder();
        result.append(mystring.charAt(0));
        draft.append(mystring.charAt(0));

        for(int i=0; i< mystring.length()-1; i++){
            if(mystring.charAt(i+1) > mystring.charAt(i)){
                draft.append(mystring.charAt(i + 1));
            } else {
                if(result.length() < draft.length()){
                    result = draft;
                }
                draft = new StringBuilder();
                draft.append(mystring.charAt(i + 1));
            }
        }
        if(result.length() < draft.length()){
            result = draft;
        }
        System.out.println(result);
        return result.toString();
    }

}
