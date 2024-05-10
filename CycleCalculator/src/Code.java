import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Code {
    Prints print = new Prints();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    private Date date;
    private int menstruatedDays;
    private boolean verify;

    public void start() {
        print.clean();
        date = insertDate();
        print.clean();
        int menstrualDay = menstrualDays();
        int plusSeven =  menstrualDay + 7;
        int plusEleven =  menstrualDay + 11;
        int plusTwentySix =  menstrualDay + 26;

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, plusSeven);
        Date datePlusSeven = calendar.getTime();

        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, plusEleven);
        Date datePlusEleven = calendar.getTime();

        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, plusTwentySix);
        Date datePlusTwentySix = calendar.getTime();
        
        print.clean();
        print.fertile();
        System.out.println("    " + sdf.format(datePlusSeven) + " a " + sdf.format(datePlusEleven));
        System.out.println("");
        print.redRiver();
        System.out.println("        " + sdf.format(datePlusTwentySix));
    }

    public Date insertDate() {
        print.main();
        verify = false; 

        while (verify == false) {

            String userDate = sc.nextLine();
            String dateWithYear = userDate + "/2024";

            try {
                sdf.setLenient(false);
                Date parsedDate = sdf.parse(dateWithYear);
                
                String formattedDate = sdf.format(parsedDate);
                String[] parts = formattedDate.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                String[] userInputParts = userDate.split("/");
                int userInputDay = Integer.parseInt(userInputParts[0]);
                int userInputMonth = Integer.parseInt(userInputParts[1]);
                
                if (day != userInputDay || month != userInputMonth) {
                    throw new ParseException("Invalid Date", 0);
                }
                
                date = parsedDate;
                verify = true;

            } catch (ParseException e) {
                System.out.println("Date format invalid (dd/MM)");
            }
        }
        return date;
    }

    public int menstrualDays() {
        print.menstrualDays();
        menstruatedDays = sc.nextInt();
        return menstruatedDays;
    } 

    


}