// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers= args[0];
            int spell = Integer.parseInt(args[1]);
            String letter = "AEFHILMNORSX"; 
            cheers = cheers.toUpperCase();
            int i=0;
            while ( i < cheers.length()) {
                char c = cheers.charAt(i);
                if(letter.indexOf(c) != -1) {
                System.out.println("Give me  an "+c +": " +c +"!");
                }
                else {
                System.out.println("Give me a "+c +": " +c +"!");
                }
                i++;
            }
            System.out.println("What does that spell?");
            
            for (int k =0; k<spell; k++) {
                System.out.println(cheers+"!!!");
            }


             
        }
}
