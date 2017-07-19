package com.example.android.quizapp;

import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int mCounter;
    private LinearLayout mParent;
    private TextView mTextEdit1;
    private RadioGroup mRadioGroup2;
    private CheckBox mCheckBox3_1;
    private CheckBox mCheckBox3_2;
    private CheckBox mCheckBox3_3;
    private CheckBox mCheckBox3_4;
    private CheckBox mCheckBox3_5;
    private RadioGroup mRadioGroup4;
    private TextView mTextEdit5;
    private RadioGroup mRadioGroup6;
    private RadioGroup mRadioGroup7;
    private RadioGroup mRadioGroup8;
    private RadioGroup mRadioGroup9;
    private RadioGroup mRadioGroup10;
    private ScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParent = (LinearLayout) findViewById(R.id.parent);
        mTextEdit1 = (TextView) findViewById(R.id.q1);
        mRadioGroup2 = (RadioGroup) findViewById(R.id.radio2);
        mCheckBox3_1 = (CheckBox) findViewById(R.id.checkbox1);
        mCheckBox3_2 = (CheckBox) findViewById(R.id.checkbox2);
        mCheckBox3_3 = (CheckBox) findViewById(R.id.checkbox3);
        mCheckBox3_4 = (CheckBox) findViewById(R.id.checkbox4);
        mCheckBox3_5 = (CheckBox) findViewById(R.id.checkbox5);
        mRadioGroup4 = (RadioGroup) findViewById(R.id.radio4);
        mTextEdit5 = (TextView) findViewById(R.id.q5);
        mRadioGroup6 = (RadioGroup) findViewById(R.id.radio6);
        mRadioGroup7 = (RadioGroup) findViewById(R.id.radio7);
        mRadioGroup8 = (RadioGroup) findViewById(R.id.radio8);
        mRadioGroup9 = (RadioGroup) findViewById(R.id.radio9);
        mRadioGroup10 = (RadioGroup) findViewById(R.id.radio10);
        mScrollView = (ScrollView) findViewById(R.id.scrollView);

    }

    public void Submit(View view) {

        mCounter = 0;

        //check answer 1 (editable text)
        CharSequence a1 = mTextEdit1.getText();
        if (a1.toString().equals("")) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if ((a1.toString().toLowerCase()).equals("bouvier") ||
                (a1.toString().toLowerCase()).equals("marge bouvier") ||
                (a1.toString().toLowerCase()).equals("marjorie bouvier") ||
                (a1.toString().toLowerCase()).equals("marjorie jacqueline bouvier")) {
            // answer 1 is correct
            mCounter++;
        }

        //check answer 2 (radio buttons)
        int radio2CheckedButtonId = mRadioGroup2.getCheckedRadioButtonId();
        if (radio2CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio2CheckedButtonId == R.id.q2a2) {
            // answer 2 is correct
            mCounter++;
        }

        //check answer 3 (checkboxes)
        if (!((mCheckBox3_1).isChecked()) && !((mCheckBox3_2).isChecked()) &&
                !((mCheckBox3_3).isChecked()) && !((mCheckBox3_4).isChecked()) &&
                !((mCheckBox3_5).isChecked())) {

            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if ((mCheckBox3_1).isChecked() &&
                !(mCheckBox3_2).isChecked() &&
                (mCheckBox3_3).isChecked() &&
                (mCheckBox3_4).isChecked() &&
                !(mCheckBox3_5).isChecked()) {
            // answer 3 is correct
            mCounter++;
        }

        //check answer 4 (radio buttons)
        int radio4CheckedButtonId = mRadioGroup4.getCheckedRadioButtonId();
        if (radio4CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio4CheckedButtonId == R.id.q4a1) {
            // answer 4 is correct
            mCounter++;
        }

        //check answer 5 (editable text)
        CharSequence a5 = mTextEdit5.getText();
        if (a5.toString().equals("")) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if ((a5.toString().toLowerCase()).equals("milhouse") ||
                (a5.toString().toLowerCase()).equals("milhouse van houten")) {
            // answer 5 is correct
            mCounter++;
        }

        //check answer 6 (radio buttons)
        int radio6CheckedButtonId = mRadioGroup6.getCheckedRadioButtonId();
        if (radio6CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio6CheckedButtonId == R.id.q6a1) {
            // answer 6 is correct
            mCounter++;
        }

        //check answer 7 (radio buttons)
        int radio7CheckedButtonId = mRadioGroup7.getCheckedRadioButtonId();
        if (radio7CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio7CheckedButtonId == R.id.q7a3) {
            // answer 7 is correct
            mCounter++;
        }

        //check answer 8 (radio buttons)
        int radio8CheckedButtonId = mRadioGroup8.getCheckedRadioButtonId();
        if (radio8CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio8CheckedButtonId == R.id.q8a2) {
            // answer 8 is correct
            mCounter++;
        }

        //check answer 9 (radio buttons)
        int radio9CheckedButtonId = mRadioGroup9.getCheckedRadioButtonId();
        if (radio9CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio9CheckedButtonId == R.id.q9a2) {
            // answer 9 is correct
            mCounter++;
        }

        //check answer 10 (radio buttons)
        int radio10CheckedButtonId = mRadioGroup10.getCheckedRadioButtonId();
        if (radio10CheckedButtonId == -1) {
            Toast toast = Toast.makeText(this, getString(R.string.ErrorMsg),
                    Toast.LENGTH_SHORT);
            toast.show();
            return;

        } else if (radio10CheckedButtonId == R.id.q10a3) {
            // answer 10 is correct
            mCounter++;
        }

        //produce a response message according to the score
        CharSequence toastMessage;

        if (mCounter < 3) {
            toastMessage = "Hmm... you could do better";
        } else if (mCounter < 5) {
            toastMessage = "Not so bad, dude";
        } else if (mCounter < 7) {
            toastMessage = "Hey, you rock!";
        } else if (mCounter < 9) {
            toastMessage = "Really impressive!";
        } else {
            toastMessage = "Wow, we have a geek here!!!";
        }

        //display the score and the relative response message
        DisplayToast(mCounter, toastMessage);

    }

    private void DisplayToast(int score, CharSequence toastMessage) {

        String toastScore = "Your score: " + String.valueOf(score) + "/10";

        //build a toast using the layout specified in the file toast.xml
        View layout = LayoutInflater.from(this).inflate(R.layout.toast, mParent, false);

        TextView header = (TextView) layout.findViewById(R.id.toastScore);
        header.setText(toastScore);

        TextView text = (TextView) layout.findViewById(R.id.toastMessage);
        text.setText(toastMessage);

        ImageView image = (ImageView) layout.findViewById(R.id.toastImage);

        if (score < 3) {
            image.setImageResource(R.drawable.ralph);
            header.setTextColor(ContextCompat.getColor(this, R.color.colorRed));
        } else if (score < 5) {
            image.setImageResource(R.drawable.homer);
            header.setTextColor(ContextCompat.getColor(this, R.color.colorViolet));
        } else if (score < 7) {
            image.setImageResource(R.drawable.otto);
            header.setTextColor(ContextCompat.getColor(this, R.color.colorPurple));
        } else if (score < 9) {
            image.setImageResource(R.drawable.lisa);
            header.setTextColor(ContextCompat.getColor(this, R.color.colorOrange));
        } else {
            image.setImageResource(R.drawable.comicbookguy);
            header.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        }

        Toast toast = new Toast(this);
        toast.setGravity(Gravity.FILL, 0, 0);  //full screen
        toast.setDuration(Toast.LENGTH_LONG);  //lasts 3.5s
        toast.setView(layout);
        toast.show();

        //wait for the toast to close (3500ms) then reset all
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ResetAll();
            }
        }, 3500);
    }

    private void ResetAll() {
        mCounter = 0;

        mTextEdit1.setText("");
        mRadioGroup2.clearCheck();
        mCheckBox3_1.setChecked(false);
        mCheckBox3_2.setChecked(false);
        mCheckBox3_3.setChecked(false);
        mCheckBox3_4.setChecked(false);
        mCheckBox3_5.setChecked(false);
        mRadioGroup4.clearCheck();
        mTextEdit5.setText("");
        mRadioGroup6.clearCheck();
        mRadioGroup7.clearCheck();
        mRadioGroup8.clearCheck();
        mRadioGroup9.clearCheck();
        mRadioGroup10.clearCheck();

        //scroll back to the beginning of the ScrollView
        mScrollView.fullScroll(ScrollView.FOCUS_UP);
    }
}
