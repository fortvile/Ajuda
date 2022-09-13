import java.util.Random;

public class TP01Q03Alteracao {

    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }

     
    
    public static String trocar (String s){
        Random gerador = new Random();
        gerador.setSeed(4);
        //System.out.println((char)('a' + (Math.abs(gerador.nextInt())%26)));
        char c = ((char)('a' + (Math.abs(gerador.nextInt())%26)));
        MyIO.println("esse eh o c " + c);
        char cT = ((char)('a' + (Math.abs(gerador.nextInt())%26)));
        MyIO.println("esse eh o cT " + cT);
        String novaString = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                novaString = novaString + cT;
            }
            else{
                novaString = novaString + s.charAt(i);
            }

        }
        return novaString;
    }
    public static void main (String[] args){
        String s = "";
        String substituida = "";
        do{
            s = MyIO.readLine();
            substituida = trocar(s);
            //MyIO.print(trocar(s));
            System.out.println(substituida);
        }while(isFim(s) == false);
    }
}
