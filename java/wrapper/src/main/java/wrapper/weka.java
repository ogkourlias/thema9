package wrapper;

import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Random;

public class weka {

    static String train = "resources/train.arff";

    static void runWeka(String newFile) throws Exception {
        Instances trainData = readArff(train);
        Instances newData = readArff(newFile);
        InputStream rForest_handle = new FileInputStream("resources/rForest.model");
        RandomForest rf = (RandomForest) (new ObjectInputStream(rForest_handle)).readObject();

    }

    private static Instances readArff(String handle) throws Exception {
        DataSource source = new DataSource(handle);
        Instances data = source.getDataSet();
        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);
        return data;
    }

}