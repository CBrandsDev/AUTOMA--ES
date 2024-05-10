import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Code {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    private String date;
    private boolean verify;

    public String insertDate() {
        verify = false; 
        while (verify == false) {

            date = sc.nextLine();
            String dateWithYear = date + "/2024";

            try {
                sdf.setLenient(false);
                Date parsedDate = sdf.parse(dateWithYear);
                
                String formattedDate = sdf.format(parsedDate);
                String[] parts = formattedDate.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                String[] userInputParts = date.split("/");
                int userInputDay = Integer.parseInt(userInputParts[0]);
                int userInputMonth = Integer.parseInt(userInputParts[1]);
                
                if (day != userInputDay || month != userInputMonth) {
                    throw new ParseException("Data inválida", 0);
                }
                
                System.out.println(date);
                verify = true;

            } catch (ParseException e) {
                System.out.println("Date format invalid (dd/MM)");
            }
        }
        return date;
    }

    public String fertilePeriod() {
        return "";
    }

}