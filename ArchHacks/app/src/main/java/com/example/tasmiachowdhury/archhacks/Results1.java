package com.example.tasmiachowdhury.archhacks;

import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Results1 extends AppCompatActivity {

    TextView statement;
    String Status = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results1);
        statement = (TextView) findViewById(R.id.statement);
        BmiCheck();
        bodytemperature();
        pulse();
        blood_pressure();

    }

    public void BmiCheck() {
//String bmi = String.format("Your BMI is", bmicalc);


        Intent intent = getIntent();
        String height_message = intent.getStringExtra("HEIGHT");
        String weight_message = intent.getStringExtra("WEIGHT");

        int height = Integer.parseInt(height_message);

        int weight = Integer.parseInt(weight_message);
        String Statement = "";
        int bmi = weight / (height ^ 2);


        if ((bmi < 25) && (bmi >= 18.5))

        {
            Statement = "Congratulations. Your BMI is Normal.\n\n";
            Status = "Normal";
        } else if ((bmi >= 25) && (bmi < 29.9)) {
            Statement = "You are Overweight, Eat more vegetables and lean meats. make sure you try cardio exercises everyday for at least 30 mins.\n\n";
            Status = "Overweight";
        } else if (bmi > 30) {
            Statement = "ATTENTION!! You are Obese. Please consult a nutritionist for your treatment.\n\n";
            Status = "Obese";
        } else {
            Statement = "ATTENTION!! You are Underweight. Please consider the advice of a nutritionist to increase your BMI to a normal level. For now, please consider the following plan: \n" +
                    "-  Choose nutrient-rich food. \n" +
                    "-  Try smoothies and shakes. \n" +
                    "-  Watch when you drink.\n\n";
            Status = "  Underweight";

        }
        statement.setText(Statement);
    }

    // private void, protected int
    public void bodytemperature() {
        Intent intent = getIntent();
        String bodytemp_message = intent.getStringExtra("BODY TEMP");
        int bodytemp = Integer.parseInt(bodytemp_message);
        String body_temperature = ""; //initialization
        TextView Statement1 = (TextView) findViewById(R.id.Statement1);

        if ((bodytemp == 37)) // = assignment operator, == comparison
        {
            body_temperature = "Perfect! Your Body temperature is normal\n\n";
        } else if (bodytemp > 37) {
            body_temperature = "Your body temperature is way too high! You may suffer from\n" +
                    "-  Fever\n" +
                    "-  Diabetes\n" +
                    "-  Hypothyroidism\n\n";

        } else if (bodytemp < 37) {
            body_temperature =
                    "Your body temperature is way too low! You may suffer from" +
                            "-  Hypothyroidism\n" +
                            "-  Infection\n" + "-  Kidney failure\n" + "-  Liver failure\n" + "-  Hypothyroidism\n\n";


        } else {
        }

        Statement1.setText(body_temperature);
    }

    /*public void pulse_rate(){
        Intent intent = getIntent();
        String PULSE_message = intent.getStringExtra("PULSE");
        int PULSE = Integer.parseInt(PULSE_message);
        String statement2 = ""; //initialization
        TextView Statement2 = (TextView)findViewById(R.id.Statement2);

        /*String array[] = new String[3];
        String array1[] = {"Dizziness", "Shortness of Breath", "LightHeadedness"};

        for (int i = 0; i<3; i++){
            print (array1[i]);
        }


        /*if (PULSE >100){
            statement2 ="Your pulse rate is above average!You are most likely to have tachycardia\n"+
                    "If you have the following sypmtoms you should be aware and consult and physician\n"+
                    "-Dizziness\n"+
                    "-Shortness of breath\n"+
                    "-Lightheadedness\n";

        }
        else if (PULSE < 60){
            statement2 =
                    "Your pulse rate is below average!You are most likely to have bradycardia\n"+
                            "bradycardia maybe caused by\n"+
                            "-coronary artery disease\n" +
                            "-\n" + "-infections such as endocarditis and myocarditis\n"+
                            "electrolyte imbalance \n";


        }

        else{

        statement2 = "Perfect! You have a healthy pulse.";
}
        statement2.setText(Statement2);
    }
}
*/
    public void pulse() {
        Intent intent = getIntent();
        String pulse_message = intent.getStringExtra("PULSE");
        int pulse0 = Integer.parseInt(pulse_message);
        String Statement2 = ""; //initialization
        TextView statement2 = (TextView) findViewById(R.id.statement2);

        if (pulse0 > 100) {
            Statement2 = "Your pulse rate is above average!You are most likely to have Tachycardia\n\n" +
                    "If you have the following sypmtoms you should be aware and consult and physician\n" +
                    "-  Dizziness\n" +
                    "-  Shortness of breath\n" +
                    "-  Lightheadedness\n\n";
        } else if (pulse0 < 60) {
            Statement2 =
                    "Your pulse rate is below average!You are most likely to have Bradycardia\n" +
                            "Bradycardia maybe caused by\n" +
                            "-  Coronary artery disease\n" +
                            "-  Infections such as Endocarditis and Myocarditis\n" +
                            "-  Electrolyte imbalance\n\n";


        } else {

            Statement2 = "  Perfect! You have a healthy pulse.\n\n";
        }

        statement2.setText(Statement2);
    }

    /*public void blood_pressure() {
        Intent intent = getIntent();
        String pulse_message = intent.getStringExtra("PULSE");
        int pulse0 = Integer.parseInt(pulse_message);
        String Statement2 = ""; //initialization
        TextView statement2 = (TextView) findViewById(R.id.statement2);

        if (pulse0 > 100) {
            Statement2 = "Your pulse rate is above average!You are most likely to have tachycardia\n" +
                    "If you have the following sypmtoms you should be aware and consult and physician\n" +
                    "-Dizziness\n" +
                    "-Shortness of breath\n" +
                    "-Lightheadedness.";
        } else if (pulse0 < 60) {
            Statement2 =
                    "Your pulse rate is below average!You are most likely to have bradycardia\n" +
                            "bradycardia maybe caused by\n" +
                            "-coronary artery disease\n" +
                            "-infections such as endocarditis and myocarditis\n" +
                            "electrolyte imbalance.";


        } else {

            Statement2 = "Perfect! You have a healthy pulse.";
        }

        statement2.setText(Statement2);
    }*/

    public void blood_pressure() {
        Intent intent = getIntent();
        String bp_message = intent.getStringExtra("BLOOD PRESSURE");
        String bpd_message = intent.getStringExtra("BLOOD PRESSURE DIASTOLE");
        int bp = Integer.parseInt(bp_message);
        int bpd = Integer.parseInt(bpd_message);
        String Statement3 = ""; //initialization
        TextView statement3
                = (TextView) findViewById(R.id.statement3);


        if ((((bp > 140) && (bpd > 80)) && (Status == "Overweight")) || (((bp > 140) && (bpd > 80)) && (Status == "Obese"))) {
            Statement3 = "Your blood pressure is too high. Please follow a proper and balanced diet \n" +
                    "You have high risk of contracting diabetes.\n\n";
        } else if ((((bp > 140) && (bpd > 80)) && (Status == "Normal")) || (((bp > 140) && (bpd > 80)) && (Status == "Underweight"))) {
            Statement3 =
                    "Your blood pressure is too high. You may have hypertension. Please make sure you rest properly. \n" +
                            "  Control your salt intake. \n" +
                            "  Do proper excercise. \n" +
                            "  Drink less alcohol. \n" +
                            "  Drink more water.\n\n";


        } else if (((((bp < 120) && (bpd < 80)) && (Status == "Overweight")) || (((bp < 120) && (bpd < 80)) && (Status == "Obese")))) {

            Statement3 = "Your blood pressure is too low. You may have hypotension.\n"+
                    "-  Eat a diet higher in salt.\n" +
                    "-  Drink lots of nonalcoholic fluids.\n" +
                    "-  Limit alcoholic beverages\n\n";
        }
        else if (((((bp < 120) && (bpd < 80)) && (Status == "Normal")) || (((bp < 120) && (bpd < 80)) && (Status == "Underweight")))){
            Statement3 = "Your blood pressure is too low. Please eat a proper meal. \n" +
                    "Do not overwork yourself, take rest.\n\n";
        }
        else {
            Statement3 = "Congratulations! Your blood pressure is normal.\n\n";
        }
        statement3.setText(Statement3);
    }
}