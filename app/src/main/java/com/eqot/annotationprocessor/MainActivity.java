package com.eqot.annotationprocessor;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eqot.annotationprocessor.processor.CustomAnnotation;
import com.eqot.annotationprocessor.processor.generated.GeneratedClass;

@CustomAnnotation
public class MainActivity extends AppCompatActivity {

    @CustomAnnotation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAnnotationMessage();
    }

    private void showAnnotationMessage() {
        GeneratedClass generatedClass = new GeneratedClass();
        String message = generatedClass.getMessage();

        new AlertDialog.Builder(this)
                .setPositiveButton("Ok", null)
                .setTitle("Annotation Processor Message")
                .setMessage(message)
                .show();
    }
}
