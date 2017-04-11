package com.example.android.quizapp;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quizapp.R.layout.toast;


public class MainActivity extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {

        counter = 0;

        //check answer 1 (editable text)
        CharSequence a1 = ((TextView) findViewById(R.id.q1)).getText();
        if (a1.toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if ((a1.toString().toLowerCase()).equals("bouvier") ||
                (a1.toString().toLowerCase()).equals("marge bouvier") ||
                (a1.toString().toLowerCase()).equals("marjorie bouvier") ||
                (a1.toString().toLowerCase()).equals("marjorie jacqueline bouvier")) {
            counter++;
        }

        //check answer 2 (radio buttons)
        int radio2CheckedButtonId = ((RadioGroup) findViewById(R.id.radio2)).getCheckedRadioButtonId();
        if (radio2CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio2CheckedButtonId == R.id.q2a2) {
            counter++;
        }

        //check answer 3 (checkboxes)
        if (!(((CheckBox) findViewById(R.id.checkbox1)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox2)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox3)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox4)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox5)).isChecked())) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if ((((CheckBox) findViewById(R.id.checkbox1)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox2)).isChecked()) &&
                (((CheckBox) findViewById(R.id.checkbox3)).isChecked()) &&
                (((CheckBox) findViewById(R.id.checkbox4)).isChecked()) &&
                !(((CheckBox) findViewById(R.id.checkbox5)).isChecked())) {
            counter++;
        }

        //check answer 4 (radio buttons)
        int radio4CheckedButtonId = ((RadioGroup) findViewById(R.id.radio4)).getCheckedRadioButtonId();
        if (radio4CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio4CheckedButtonId == R.id.q4a1) {
            counter++;
        }

        //check answer 5 (editable text)
        CharSequence a5 = ((TextView) findViewById(R.id.q5)).getText();
        if (a5.toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if ((a5.toString().toLowerCase()).equals("milhouse") ||
                (a5.toString().toLowerCase()).equals("milhouse van houten")) {
            counter++;
        }

        //check answer 6 (radio buttons)
        int radio6CheckedButtonId = ((RadioGroup) findViewById(R.id.radio6)).getCheckedRadioButtonId();
        if (radio6CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio6CheckedButtonId == R.id.q6a1) {
            counter++;
        }

        //check answer 7 (radio buttons)
        int radio7CheckedButtonId = ((RadioGroup) findViewById(R.id.radio7)).getCheckedRadioButtonId();
        if (radio7CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio7CheckedButtonId == R.id.q7a3) {
            counter++;
        }

        //check answer 8 (radio buttons)
        int radio8CheckedButtonId = ((RadioGroup) findViewById(R.id.radio8)).getCheckedRadioButtonId();
        if (radio8CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio8CheckedButtonId == R.id.q8a2) {
            counter++;
        }

        //check answer 9 (radio buttons)
        int radio9CheckedButtonId = ((RadioGroup) findViewById(R.id.radio9)).getCheckedRadioButtonId();
        if (radio9CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio9CheckedButtonId == R.id.q9a2) {
            counter++;
        }

        //check answer 10 (radio buttons)
        int radio10CheckedButtonId = ((RadioGroup) findViewById(R.id.radio10)).getCheckedRadioButtonId();
        if (radio10CheckedButtonId == -1) {
            Toast toast = Toast.makeText(getApplicationContext(), "One or more answers are missing!",
                    Toast.LENGTH_SHORT);
            toast.show();
            return;
        } else if (radio10CheckedButtonId == R.id.q10a3) {
            counter++;
        }

        //produce a response message according to the score
        CharSequence toastMessage;

        if (counter < 3) {
            toastMessage = "Hmm... you could do better";
        } else if (counter < 5) {
            toastMessage = "Not so bad, dude";
        } else if (counter < 7) {
            toastMessage = "Hey, you rock!";
        } else if (counter < 9) {
            toastMessage = "Really impressive!";
        } else {
            toastMessage = "Wow, we have a geek here!!!";
        }

        //display the score and the relative response message
        DisplayToast(counter, toastMessage);

    }

    private void DisplayToast(int score, CharSequence toastMessage) {

        String toastScore = "Your score: " + String.valueOf(score) + "/10";

        //build a toast using the layout specified in the file toast.xml
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(toast,
                (ViewGroup) findViewById(R.id.toastContainer));

        TextView header = (TextView) layout.findViewById(R.id.toastScore);
        header.setText(toastScore);

        TextView text = (TextView) layout.findViewById(R.id.toastMessage);
        text.setText(toastMessage);

        ImageView image = (ImageView) layout.findViewById(R.id.toastImage);

        if (score < 3) {
            image.setImageResource(R.drawable.ralph);
            header.setTextColor(ContextCompat.getColor(this,R.color.colorRed));
        } else if (score < 5) {
            image.setImageResource(R.drawable.homer);
            header.setTextColor(ContextCompat.getColor(this,R.color.colorViolet));
        } else if (score < 7) {
            image.setImageResource(R.drawable.otto);
            header.setTextColor(ContextCompat.getColor(this,R.color.colorPurple));
        } else if (score < 9) {
            image.setImageResource(R.drawable.lisa);
            header.setTextColor(ContextCompat.getColor(this,R.color.colorOrange));
        } else {
            image.setImageResource(R.drawable.comicbookguy);
            header.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
        }

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.FILL, 0, 0);  //full screen
        toast.setDuration(Toast.LENGTH_LONG);  //lasts 3.5s
        toast.setView(layout);
        toast.show();

        //wait for the toast to close (3500ms) then reset all
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ResetAll();
            }
        }, 3500);

    }

    private void ResetAll() {
        counter = 0;

        ((TextView) findViewById(R.id.q1)).setText("");
        ((RadioGroup) findViewById(R.id.radio2)).clearCheck();
        ((CheckBox) findViewById(R.id.checkbox1)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox2)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox3)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox4)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox5)).setChecked(false);
        ((RadioGroup) findViewById(R.id.radio4)).clearCheck();
        ((TextView) findViewById(R.id.q5)).setText("");
        ((RadioGroup) findViewById(R.id.radio6)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio7)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio8)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio9)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio10)).clearCheck();

        //scroll back to the beginning of the ScrollView
        ((ScrollView)findViewById(R.id.scrollView)).fullScroll(ScrollView.FOCUS_UP);
    }

}
