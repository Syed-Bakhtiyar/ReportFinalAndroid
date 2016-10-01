package com.example.syedinkisarahmed.reportcard2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] resource = {R.drawable.a,R.drawable.b,R.drawable.c};
        String[] name ={"Bakhtiyar","Syed Muhammad Bakhtiyar","Muhammad Bakhtiyar"};
        String[] subj ={"Science","Computer Science","Math"};
        int marks[]= {200,450,390};
        int[] roll={420, 124, 9211};

        //variable Declare for iteration
        int i=0;
        while(i<resource.length
            /*this is loop condition*/ ){
            //Creating Object of Class Report
            Report report = new Report(name[i],subj[i],resource[i],marks[i],roll[i]);
            if(i==0) {
                //creating a Image view Object
                ImageView img = (ImageView) findViewById(R.id.img);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll);
                stdMarks.setText(report.getRoll());

            }else
            if(i==2){
                ImageView img = (ImageView) findViewById(R.id.img1);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name1);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject1);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks1);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc1);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll1);
                stdMarks.setText(report.getRoll());


            }
            else if(i==2){
                ImageView img = (ImageView) findViewById(R.id.img2);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name2);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject2);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks2);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc2);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll2);
                stdMarks.setText(report.getRoll());


            }




            i++; // one increment in  i variable
        }



    }
}
