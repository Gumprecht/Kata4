
package kata4.main;

import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import java.util.List;


public class Kata4 {
   List<Mail> mailList;
   Histogram<String> mailHistogram;

    public static void main(String[] args) {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }
    
    public void execute() {
        input();
        process();
        output();
    }
    
    public void input() {
        String fileName = new String("email.txt");
        MailListReader mailListReader = new MailListReader();
        mailList = mailListReader.read(fileName);
    }
    
    public void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
    }
    
        
        
        
        
        
        
        
    
}
