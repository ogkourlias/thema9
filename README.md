# Thema 9: How accurate can a machine learning model be trained in predicting whether someone may expereince a stroke?
 This repository contains all the files, documents and programs which
 were used in answering the following research question: With what accuracy
 can a machine model be trained to predict for the stroke risk of a person?

There are two parts to this repository: 
1. The examination, training and testing of the model and data.
2. The java program which uses this model to classify further data entries.

The first part consists of mostly .Rmd files, in which the research
and model related tasks were done and judged. The model resulting from this
part of the project was then used to serve in a java program, which 
aims to take new data input from the user and make predictions based on it.

### Model Training in R.
The files which were used in the model training are located in the ml directory.
The code directory contains the .rmd files used in creating the documents.
These documents being: journal.pdf and paper.pdf. The journal contains
multiple parts, all dedicated to the eventual training of the machine learning
model. The paper.pdf document serves to evaluate the finished product and
bring up possible contingencies in future research. The files in the data
directory consists of the experiment data used to train the model, but also
output from R code and Weka usage.

### Java
The java program meant to be used with the data from
the machine learning section.  The Wrapper program does the following:
1. It takes commandline input for both input (-f) and output (-o) file paths. (.arff)
2. It loads the contents of the input .arff file.
3. The saved model from the machine learning section gets applied to classify instances.
4. Output of this process is then written to a new .arff file, as specified with the output path.

## Installation and Dependencies
For the program to be built properly, the following software needs to be present
on your machine:
1. Java 17.0.5
2. Gradle 7.4

To test the project, a fatJar was created using the shadowJar plugin, which can be found here:
com.github.johnrengelman.shadow (7.1.2)
## Usage
This program was tested using a generated fatJar file. To recreate this, first build the fatJar using the shadowJar
plugin in gradle. After doing so, the generated jar file may be run like below.
```bash
java.exe -jar wrapper-1.0-SNAPSHOT-all.jar -f {input file path} -o {output path}

- Example -
java.exe -jar build\libs\wrapper-1.0-SNAPSHOT-all.jar -f dummy.arff -o new.arff
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

### File Structure
```bash
├───java
│   └───wrapper
│       ├───.gradle
│       │   ├───6.9.3
│       │   │   └───vcsMetadata-1
│       │   ├───7.4
│       │   │   ├───checksums
│       │   │   ├───dependencies-accessors
│       │   │   ├───executionHistory
│       │   │   ├───fileChanges
│       │   │   ├───fileHashes
│       │   │   └───vcsMetadata
│       │   ├───buildOutputCleanup
│       │   └───vcs-1
│       ├───.idea
│       │   ├───libraries
│       │   └───modules
│       ├───build
│       │   └───generated
│       │       └───sources
│       │           ├───annotationProcessor
│       │           │   └───java
│       │           │       └───main
│       │           └───headers
│       │               └───java
│       │                   └───main
│       ├───gradle
│       │   └───wrapper
│       └───src
│           ├───main
│           │   ├───java
│           │   │   └───wrapper
│           │   └───resources
│           └───test
│               ├───java
│               └───resources
├───ml
│   ├───rmd
│   └───data
│       └───experimenter
```