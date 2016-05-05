/*Program na odstránenie záznamov mimo žiadaného dátumu
 */
package webminingfiltraciadatumu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marek
 */
public class WebMiningFiltraciaDatumu {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader vstupnySubor = new FileReader(new File("ukfcleaned.log"));
        BufferedReader citackaVstupu = new BufferedReader(vstupnySubor);
        String citanyRiadok;
        System.out.println("Vstupny subor otvoreny");
        
        FileWriter vystupnySubor = new FileWriter(new File("vystupnyLog.log"));
        BufferedWriter zapisovac = new BufferedWriter(vystupnySubor);
        System.out.println("vystupny subor vytvoreny");
        
        System.out.println("zacinam citat subor");
        while ((citanyRiadok = citackaVstupu.readLine()) != null) {
            if (citanyRiadok.contains("13/Feb/2012")){
                System.out.println("Citam pre 13 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("14/Feb/2012")){
                System.out.println("Citam pre 14 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("15/Feb/2012")){
                System.out.println("Citam pre 15 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("16/Feb/2012")){
                System.out.println("Citam pre 16 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("17/Feb/2012")){
                System.out.println("Citam pre 17 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("18/Feb/2012")){
                System.out.println("Citam pre 18 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
            else if (citanyRiadok.contains("19/Feb/2012")){
                System.out.println("Citam pre 19 feb");
                zapisovac.write(citanyRiadok);
                zapisovac.write("\n");
            }
        }
        System.out.println("filtracia ukoncena");
    }
    
}
