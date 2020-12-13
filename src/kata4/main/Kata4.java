
package kata4.main;

import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import java.util.List;


public class Kata4 {

    
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        
        MailListReader mailListReader = new MailListReader();
        List<Mail> mailList = mailListReader.read(fileName);
        
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
    }
    
}
