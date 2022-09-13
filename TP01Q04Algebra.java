//EXEMPLO DE ENTRADA: 2 0 0 and(not(A) , not(B))    
//EXEMPLO DE SAIDA: 1

 //3 1 1 1 and(or(A , B) , not(and(B , C)))

public class TP01Q04Algebra {

    public static boolean isFim(String s){
        return (s.length() == 1 && s.charAt(0) == 48);
     }

     public static boolean isTrue(String s){
        String newString = "";
        int i = 0;
        char A = ' ', B = ' ', C = ' ';
        if(s.charAt(i) == 51){
            //inteiro 3 = 51 em ASC
            A = s.charAt(2);
            B = s.charAt(4);
            C = s.charAt(6);
            i = 8;
        }
        else if(s.charAt(i) == 50){
            //inteiro 2 = 50 em ASC
            A = s.charAt(2);
            B = s.charAt(4);
            i = 6;
        }

        for(i = i; i < s.length(); i++){
            if(s.charAt(i) == 65){newString += A;}
            //65 = A em ASC
			else if(s.charAt(i) == 66) {newString += B;}
            //66 = B em ASC
			else if(s.charAt(i) == 67) {newString += C;}
            //67 = C em ASC
			else newString += s.charAt(i);
        }  

        String newString2 = " ";

        for(int j = 0; j < newString.length(); j++){
            if(s.charAt(i) == 97){
                // char 97 = a
                newString2 += '&';
            }
            else if(s.charAt(i) == 110){
                // char 110 = o;
                newString2 += 'n';
            }
            else if(s.charAt(i) == 111){
                //char 111 = n.
                newString2 += 'o';
            }
            else{
                newString2 += s.charAt(i);
            }
        }

        String  split = "", result = " ";
        boolean isTrue = false; 
        int k = 0;
        while(!isTrue){
            split = "";
            if(s.charAt(i) == 38 || s.charAt(i) == 124 || s.charAt(i) == 33) {
                
            }
        }

        /*
        SEPARAR A STRING EM PARTES AO ENCONTRAR UM PARENTESE
        String[] parts = s.newString("(");
        for(String part : parts){
        System.out.println(part);
        }*/
        return isTrue;
    }
     

     public static void main(String[] args){
        String s = "";
        do{
            s = MyIO.readLine(s);
            MyIO.println(isTrue(s));
        }while (isFim(s) == false);
     }

}
