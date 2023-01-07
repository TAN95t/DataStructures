package Strings.KMPAlgorithm;

public class KMPAlgorithm {
    
    static int ans = 0;

    public static boolean KMPSearch(String pattern, String string){
        ans = -1;
        int lp = pattern.length();
        int ls = string.length();
        int table[] = new int[lp];
        int j=0; 

        prefixtable(pattern, lp, table);

        int i=0; 
        while(i < ls){
            if(pattern.charAt(j) == string.charAt(i)){
                j++;
                i++;
            }
            if(j == lp){
                ans = i-j;
                return true;
            }
            else if(i < ls && pattern.charAt(j) != string.charAt(i)){
                if(j != 0){
                    j = table[j-1];
                }
                else{
                    i = i+1;
                }
            }
        }


        return false;
    }

    // function to create the lps table
    public static void prefixtable(String pattern, int m, int table[]){
        int j=0;
        int i=1;
        table[0] = 0;

        while(i < m){
            if(pattern.charAt(i) == pattern.charAt(j)){
                j++;
                table[i] = j;
                i++;

            }
            else{
                if(j != 0){
                    j = table[j-1];
                }
                else{ // if (len==0)
                    table[i] = j;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ans);        
    }
}
