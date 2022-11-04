# Thema 9: Predicting whether a stroke is likely.
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

### File Structure
```bash
├───.idea
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
│   ├───code
│   └───data
│       └───experimenter
└───old
└───figures
```