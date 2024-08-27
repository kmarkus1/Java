
public class JavaUppgift5 {

    
    public static void main(String args[]) {
        int betyg = 89;
        if(betyg >= 90 && betyg <= 100){
            System.out.println("5 Utmärkt");
        }else if(betyg >= 80 && betyg <= 89){
            System.out.println("4 Bra");
        }else if(betyg >= 70 && betyg <= 79){
            System.out.println("3 Goda");
        }else if(betyg >= 60 && betyg <= 69){
            System.out.println("2 Nöjaktig");
        }else if(betyg >= 25 && betyg <= 59){
            System.out.println("1 Godkänd");
        }else if(betyg >= 0 && betyg <= 25){
            System.out.println("0 Underkänd");
        }
                
    }
}
