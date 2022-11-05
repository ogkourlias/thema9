package wrapper;

import weka.classifiers.meta.CostSensitiveClassifier;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ArffLoader;

import java.io.*;

public class weka {

    static void runWeka(String newFile) throws Exception {
        Instances trainData = readArff("wrapper/build/resources/main/train.arff");
        Instances newData = readArff(newFile);
        CostSensitiveClassifier rf = new CostSensitiveClassifier();
        rf = (CostSensitiveClassifier) SerializationHelper.read("wrapper/src/main/resources/rforest.model");

    }

    private static Instances readArff(String handle) throws Exception {
        BufferedReader reader =
                new BufferedReader(new FileReader(handle));
        ArffLoader.ArffReader arff = new ArffLoader.ArffReader(reader);
        Instances data = arff.getData();
        data.setClassIndex(data.numAttributes() - 1);
        return data;
    }
}