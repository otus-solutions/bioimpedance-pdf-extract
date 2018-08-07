package br.com.i9access.pdfextract;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author i9desenv
 */
public class BCPDFParser {

    /**
     * Return a BodyCompositionDO from a PDF File
     *
     * @param file
     * @return
     * @throws Exception
     */
    public BodyCompositionDO parsePDF(File file) throws Exception {
        return parsePDF(new FileInputStream(file));
    }

    /**
     * Return a BodyCompositionDO from an InputStream containing a PDF file
     *
     * @param pdfInputStream
     * @return
     * @throws Exception
     */
    public BodyCompositionDO parsePDF(InputStream pdfInputStream) throws Exception {
        PDDocument doc = PDDocument.load(pdfInputStream);
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setWordSeparator("@");
        stripper.getGraphicsState();
        String text = stripper.getText(doc);
        doc.close();

        String[] partes = text.split("[@\n]");
        BodyCompositionDO elements = new BodyCompositionDO();

        for (int i = 0; i < partes.length; i++) {
            partes[i] = partes[i].replaceAll("\r", "");
        }

        //set
        elements.setName(partes[0]);
        if (partes[1] != null) {
            partes[1] = partes[1].trim();
            String[] ageGender = partes[1].split(" ");
            elements.setAge(ageGender[0]);
            elements.setGender(ageGender[1]);
        }
        elements.setHeight(partes[2]);
        elements.setDateTime(partes[3]);
        elements.setAnalyzer(partes[4]);
        elements.setWeight(partes[5]);
        elements.setBodyMassIndex(partes[6]);
        elements.setBodyFat(partes[7]);
        elements.setBodyFatMass(partes[8]);
        elements.setBodyFatRange(partes[9]);
        elements.setFatFreeMass(partes[10]);
        elements.setVisceralFatRating(partes[11]);
        elements.setBodyWater(partes[12]);
        elements.setBodyWaterMass(partes[13]);
        elements.setMuscleMass(partes[14]);
        elements.setBoneMass(partes[15]);
        elements.setBasalMetabolicRate(partes[16]);
        elements.setMetabolicAge(partes[17]);
        elements.setDailyCalorieIntake(partes[18]);
        elements.setPhysiqueRating(partes[19]);
        elements.setLeftLegFat(partes[20]);
        elements.setRightLegFat(partes[21]);
        elements.setLeftArmFat(partes[22]);
        elements.setRightArmFat(partes[23]);
        elements.setTrunkFat(partes[24]);
        elements.setLeftLegMuscleMass(partes[25]);
        elements.setRightLegMuscleMass(partes[26]);
        elements.setLefArmMuscleMass(partes[27]);
        elements.setRightArmMuscleMass(partes[28]);
        elements.setTrunkMuscleMass(partes[29]);

        return elements;
    }

}