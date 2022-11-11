package wrapper;

// Weka API.
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ArffLoader;
import weka.core.converters.ArffSaver;

// Java Imports.
import java.io.*;

public class weka {
    /**
     * Weka API handler.
     */
    static void runWeka(String newFile, String outFile) throws Exception {
        Instances newData = readArff(newFile);
        CostSensitiveClassifier rf = new CostSensitiveClassifier();
        // load in the proper model for classification
        rf = (CostSensitiveClassifier) SerializationHelper.read("wrapper/src/main/resources/rforest.model");
        classifyNewInstance(rf, newData, outFile);
    }

    private static Instances readArff(String handle) throws Exception {
        // initiate buffered reader for .arff handling
        BufferedReader reader =
                new BufferedReader(new FileReader(handle));
        ArffLoader.ArffReader arff = new ArffLoader.ArffReader(reader);
        Instances data = arff.getData();
        // set classifier to last attribute (stroke)
        data.setClassIndex(data.numAttributes() - 1);
        return data;
    }

    private static void classifyNewInstance(CostSensitiveClassifier rf, Instances newData, String outFile) throws Exception {
        // create copy
        Instances labeled = new Instances(newData);
        // label instances
        for (int i = 0; i < newData.numInstances(); i++) {
            double clsLabel = rf.classifyInstance(newData.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        // initiating file saver
        ArffSaver saver = new ArffSaver();
        // preparing file saver with new predicted instances
        saver.setInstances(labeled);
        saver.setFile(new File(outFile));
        // write output instances to new .arff file
        saver.writeBatch();
    }
}