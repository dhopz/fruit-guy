package fruitguy.Katas.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class DriversLicence {
    public static String driver(String[] data) {
        StringBuilder str = new StringBuilder();
        Date date2 = null;
        try {
            date2 = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(data[3].split("-")[1]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);
        int month = cal.get(Calendar.MONTH) + 1;
        if (Objects.equals(data[4], "F")) {
            month += 50;
        }
        String sMonth = "";
        if (month < 10) {
            sMonth = "0" + month;
        } else {
            sMonth = String.valueOf(month);
        }
        System.out.println("month " + sMonth);

        str.append((data[2].toUpperCase() + "999").substring(0, 5));
        str.append(data[3].split("-")[2].charAt(2));
        str.append(sMonth);
        str.append(data[3].split("-")[0]);
        str.append(data[3].split("-")[2].charAt(3));
        str.append(data[0].charAt(0));

        if (Objects.equals(data[1], "")) {
            str.append("9");
        } else {
            str.append(data[1].charAt(0));
        }

        str.append("9AA");


        return str.toString();
        //GIBBS862131J99AA
    }


    }
