public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" +args[0].charAt(0) +args[0].charAt(1));
        int minutes = Integer.parseInt(""+args[0].charAt(3) +args[0].charAt(4));
        int minutestoadd=Integer.parseInt(args[1]);
        int totalminutes;
        int totalhours;
        int newhours;
        int newminutes;
        totalminutes = (hours * 60) + minutes + minutestoadd;
        totalhours = totalminutes / 60;
        newhours = totalhours % 24;
        newminutes = totalminutes - (totalhours*60);
        String finalhour = Integer.toString(newhours);
        String finalminute = Integer.toString(newminutes);
        if (newhours < 10 || newhours == 0) {
            finalhour = '0' + Integer.toString(newhours);
        }
       
        if (newminutes < 10 || newminutes == 0) {
            finalminute = '0' + Integer.toString(newminutes);
        }
   
        System.out.println(finalhour +":" +finalminute);
    }
}
