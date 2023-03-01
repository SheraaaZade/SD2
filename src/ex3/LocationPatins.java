package ex3;

import java.time.LocalTime;
import java.util.HashMap;

import static java.time.temporal.ChronoUnit.MILLIS;

public class LocationPatins {
    HashMap<Integer, Integer> lesPaires;

    public LocationPatins(int[] casiers) {
        lesPaires = new HashMap<Integer, Integer>();
        int val;
        for (int i = 0; i < casiers.length; i++) {
            if (!lesPaires.containsKey(casiers[i]))
                lesPaires.put(casiers[i], 0);
            else {
                val = lesPaires.get(casiers[i]);
                val++;
                lesPaires.put(casiers[i], val);
            }
        }
    }

    // date1 < date2
    private static double prix(LocalTime date1, LocalTime date2) {
        // 1 euro par milliseconde (c'est assez cher en effet)
        return MILLIS.between(date1, date2);
    }

    public int attribuerCasierAvecPatins(int pointure) {
        if (pointure < 33 || pointure > 48)
            throw new IllegalArgumentException();
        LocalTime l = LocalTime.now();
        int val = lesPaires.get(pointure);
        val++;
        lesPaires.put(pointure, val);
        return 0;
        //a compl�ter

    }

    public double libererCasier(int numeroCasier) {
        //a completer
        return 0;
    }

}
