package br.com.i9access.pdfextract;

import java.io.FileInputStream;
import java.io.InputStream; 

/**
 *
 * @author i9desenv
 */
class PdfParseExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("/home/diogoferreira/Downloads/BIA_ 230185_05112015.pdf");
        BCPDFParser parser = new BCPDFParser();
        BodyCompositionDO object = parser.parsePDF(inputStream);
        System.out.println(object.toString());
    }
}
