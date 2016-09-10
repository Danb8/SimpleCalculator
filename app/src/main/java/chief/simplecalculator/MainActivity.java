package chief.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;
    private Button equal;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private String digits = "0";
    private String operator = "*";
    private TextView calculationZone;
    private double mNum1 = 0;
    private double mNum2 = 0;
    private static final String CURRENT_VALUE = "The current value displayed in calculationZone";
    private static final String DEBUG_TAG = "heck";
    private static final String NUM_ONE_VALUE = "Value of mNum1";
    private static final String NUM_TWO_VALUE = "Value of mNum2";
    private static final String OPERATOR_VALUE = "Value of operator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(DEBUG_TAG, "1");
        super.onCreate(savedInstanceState);
        Log.d(DEBUG_TAG, "2");

        if (savedInstanceState != null) {
            Log.d(DEBUG_TAG, "3");
            digits = savedInstanceState.getString(CURRENT_VALUE, "0");
            mNum1 = savedInstanceState.getDouble(NUM_ONE_VALUE, 0);
            mNum2 = savedInstanceState.getDouble(NUM_TWO_VALUE, 0);
            operator = savedInstanceState.getString(OPERATOR_VALUE, "*");

            Log.d(DEBUG_TAG, "4");

        }
        setContentView(R.layout.activity_main);


        final CalcString calculator = new CalcString("0");


        calculationZone = (TextView) findViewById(R.id.calculation_zone);

        calculationZone.setText(digits);

        one = (Button) findViewById(R.id.one_button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("1");
                calculationZone.setText(calculator.word);
            }
        });

        two = (Button) findViewById(R.id.two_button);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("2");
                calculationZone.setText(calculator.word);
            }
        });

        three = (Button) findViewById(R.id.three_button);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("3");
                calculationZone.setText(calculator.word);
            }
        });

        four = (Button) findViewById(R.id.four_button);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("4");
                calculationZone.setText(calculator.word);
            }
        });

        five = (Button) findViewById(R.id.five_button);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("5");
                calculationZone.setText(calculator.word);
            }
        });

        six = (Button) findViewById(R.id.six_button);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("6");
                calculationZone.setText(calculator.word);
            }
        });

        seven = (Button) findViewById(R.id.seven_button);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("7");
                calculationZone.setText(calculator.word);
            }
        });

        eight = (Button) findViewById(R.id.eight_button);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("8");
                calculationZone.setText(calculator.word);
            }
        });

        nine = (Button) findViewById(R.id.nine_button);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("9");
                calculationZone.setText(calculator.word);
            }
        });

        zero = (Button) findViewById(R.id.zero_button);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append("0");
                calculationZone.setText(calculator.word);
            }
        });

        decimal = (Button) findViewById(R.id.decimal_button);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append(".");
                calculationZone.setText(calculator.word);
            }
        });

        equal = (Button) findViewById(R.id.equal_button);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNum2 = Double.parseDouble(calculationZone.getText().toString());
                if (operator.equals("/")) {
                    calculator.result = (mNum1 / mNum2);




                }
                if (operator.equals("*")) {
                    calculator.result = (mNum1 * mNum2);




                }

                if (operator.equals("-")) {
                    calculator.result = (mNum1 - mNum2);




                }

                if (operator.equals("+")) {
                    calculator.result = (mNum1 + mNum2);




                }
                calculationZone.setText(String.valueOf(calculator.result));
                mNum1 = calculator.result;
                calculator.setWord("0");
                digits = "0";
            }
        });

        multiply = (Button) findViewById(R.id.multiply_button);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNum1 = Double.parseDouble(calculationZone.getText().toString());
                calculator.setWord("0");
                operator = "*";
            }
        });

        divide = (Button) findViewById(R.id.divide_button);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNum1 = Double.parseDouble(calculationZone.getText().toString());
                calculator.setWord("0");
                operator = "/";
            }
        });

        plus = (Button) findViewById(R.id.plus_button);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNum1 = Double.parseDouble(calculationZone.getText().toString());
                calculator.setWord("0");
                operator = "+";
            }
        });

        minus = (Button) findViewById(R.id.minus_button);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNum1 = Double.parseDouble(calculationZone.getText().toString());
                calculator.setWord("0");
                operator = "-";
            }
        });
    }

    @Override
    public void onSaveInstanceState (Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(DEBUG_TAG, calculationZone.getText().toString());
        savedInstanceState.putString(CURRENT_VALUE, calculationZone.getText().toString());
        savedInstanceState.putDouble(NUM_ONE_VALUE, mNum1);
        savedInstanceState.putDouble(NUM_TWO_VALUE, mNum2);
        savedInstanceState.putString(OPERATOR_VALUE, operator);


    }

    public void onStart() {
        super.onStart();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();

    }

}
