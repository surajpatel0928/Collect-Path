import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by surajpatel on 3/9/15.
 */
public class CollectData {

    public static void main(String[] args) throws IOException {

        File file = new File("Data2.op");
        Scanner scan = new Scanner(file);
        String temp = scan.nextLine();



        String temp1 = scan.nextLine();


        String ID = temp1.substring(0, 6);
        ID = ID.trim();

        String WSBN = temp1.substring(7, 12);
        WSBN = WSBN.trim();

        String Year = temp1.substring(14, 18);
        Year = Year.trim();


        String Avg = temp1.substring(69, 73);
        Avg = Avg.trim();

        String Fog = temp1.substring(133, 138);




int count =0;
  int i =0;

        double Max1 = 0;
        double Min1 = 999.99;
        double Max3 = 0;
        double Min5 = 999.99;

        while (scan.hasNextLine()) {

            String MaxAVG = temp1.substring(25, 30);
            MaxAVG = MaxAVG.trim();

            double Max = Double.parseDouble(MaxAVG);
            //Max1 = 0;
            if (Max1 < Max&& 999.9!=Max) {
                Max1 = Max;
            }


            String MinAVG = temp1.substring(25, 30);
            MinAVG = MinAVG.trim();

            double Min = Double.parseDouble(MinAVG);
            //Min1 = Min;
            if (Min < Min1&& 999.9!=Min) {
                Min1 = Min;
            }


            String MAXMAX = temp1.substring(103, 108);
            MAXMAX = MAXMAX.trim();

            double Max2 = Double.parseDouble(MAXMAX);

            //Max3 = 0;
            if (Max3 <Max2 && 999.9!=Max2) {
                Max3 = Max2;
            }


            String MINMIN = temp1.substring(111, 116);
            MAXMAX = MINMIN.trim();

            double Min4 = Double.parseDouble(MINMIN);
            //Min5 = 0;
            if (Min4 < Min5&& 999.9!=Min4) {
                Min5 = Min4;
            }

            char fogIndicator = temp1.charAt(133);



            if (fogIndicator =='1')

                count++;




i++;


            temp1 = scan.nextLine();


        }

        System.out.println("Station Id: " + ID);
        System.out.println("WBAN ID: " + WSBN);
        System.out.println("Year: " + Year);

        System.out.println("Max Average Temp :" + Max1);
        System.out.println("Min Average Temp :" + Min1);

        System.out.println("MAX MAX Temp :" + Max3);
        System.out.println("Min Min Temp  :" + Min5);

        System.out.println("AVG Visibility :" + Avg);
        System.out.println("Number of fog days :" + count);
System.out.println("number of data " + i);

        scan.close();
    }
}
