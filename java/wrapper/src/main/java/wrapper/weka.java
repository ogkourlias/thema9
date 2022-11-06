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

    static void runWeka(String newFile, String outFile) throws Exception {
        Instances newData = readArff(newFile);
        CostSensitiveClassifier rf = new CostSensitiveClassifier();
        rf = (CostSensitiveClassifier) SerializationHelper.read("wrapper/src/main/resources/rforest.model");
        classifyNewInstance(rf, newData, outFile);
    }

    private static Instances readArff(String handle) throws Exception {
        BufferedReader reader =
                new BufferedReader(new FileReader(handle));
        ArffLoader.ArffReader arff = new ArffLoader.ArffReader(reader);
        Instances data = arff.getData();
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
        ArffSaver saver = new ArffSaver();
        saver.setInstances(labeled);
        saver.setFile(new File(outFile));
        saver.writeBatch();
    }
}