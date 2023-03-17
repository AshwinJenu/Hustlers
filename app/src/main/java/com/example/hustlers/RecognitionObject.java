package com.example.hustlers;

public class RecognitionObject {
    private String name;
    private SimilarityClassifier.Recognition recognition;

    public RecognitionObject(String name, SimilarityClassifier.Recognition recognition) {
        this.name = name;
        this.recognition = recognition;
    }

    public String getName() {
        return name;
    }

    public SimilarityClassifier.Recognition getRecognition() {
        return recognition;
    }

    // You can also override toString() and other methods as needed.
}
