public class TP01Q05Is {

    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
     }

    public static boolean isVogal(String s){
        boolean result = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 97 && s.charAt(i) != 101 && s.charAt(i) != 105 && s.charAt(i) != 111 && s.charAt(i) != 117 
            && s.charAt(i) != 65 && s.charAt(i) != 69 && s.charAt(i) != 73 && s.charAt(i) != 79 && s.charAt(i) != 85)
                result = false;
            
            //MyIO.println(result);
        }
        return result;
    }

    public static boolean isConsoante(String s){
        boolean isConsoante = false;
        if(isVogal(s) == true){
            isConsoante = false;
        }
        return isConsoante;
    }

    public static boolean isInt(String s){
        boolean isInt = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 48 || s.charAt(i) > 57){
                isInt = false;
            }
        }
        return isInt;
    }
	public static boolean isFloat(String s){
		int count = 0, countChars = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 44 || s.charAt(i) == 46) count++;
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57) countChars++;
		}
//		if(count != 1 || countChars != s.length()) return false;
		if((count == 0 || count == 1) && countChars == s.length() - count) return true;
		return false;
	} // ending method
    
    public static void main (String[] args){
        String s = "";

    do{
        s = MyIO.readLine();
        //SO TEM VOGAL?
        if(isVogal(s) == true){
            MyIO.print("SIM ");
        }
        else{
            MyIO.print("NAO ");
        }
        //SO TEM CONSOANTE?
        if(isConsoante(s) == true){
            MyIO.print("SIM ");
        }
        else{
            MyIO.print("NAO ");
        }

        if(isInt(s) == true){
            MyIO.print("SIM ");
        }
        else{
            MyIO.print("NAO ");
        }
        if(isFloat(s) == true){
            MyIO.print("SIM ");
        }
        else{
            MyIO.print("NAO ");
        }

        MyIO.println("");

    }while(isFim(s) == false);

    }
    
}
