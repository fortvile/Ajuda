public class TP01Q01Palindromo {


    /*MÉTODO QUE VERIFICA SE É FIM*/
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }
    
    /*public static boolean isPalindrome(String s){
        int tamanho = s.length();
        boolean palindrome = true;
        int i = 0;

        do{
        //for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) !=  s.charAt(tamanho) ){
                palindrome = false;
            }
            MyIO.println("esse eh o " + i);
            MyIO.println("esse eh o " + tamanho);
            tamanho--;
            i++;
        //}
    } while(i != tamanho && i < s.length());
        return palindrome;
    }*/

    /*MÉTODO QUE VERIFICA SE É PALINDROMO*/ 

    public static boolean isPalindrome (String entrada){
        int meio = 0;
        meio = entrada.length()/2;
        int i = 0;
        int fim = 0;
        fim = entrada.length() - 1;
        boolean palindrome = true;
        while ( i < meio){
            if(entrada.charAt(i) != entrada.charAt(fim))
            palindrome = false;
            
            else{
            palindrome = true;
            }
            i++;
            fim--;    
        }
        return palindrome;
    }

    public static void main (String[] args){
        String entrada = "";

        do{
            entrada = MyIO.readLine();
            boolean palindrome = false;
            palindrome = isPalindrome(entrada);
            if( palindrome == true){
                MyIO.println("SIM");
            }
            else{
                MyIO.println("NAO");
            }
        } while (isFim(entrada) == false);

    }
}
