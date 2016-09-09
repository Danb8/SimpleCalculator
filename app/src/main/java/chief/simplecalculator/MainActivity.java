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
    private TextView calculationZone;
    private static final String TAG = "debug_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CalcString calculator = new CalcString("0");


        calculationZone = (TextView) findViewById(R.id.calculation_zone);

        calculationZone.setText(calculator.word);

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
                if (calculator.operator.equals("/")) {
                    calculator.num2 = Double.parseDouble(calculator.word);
                    calculator.result = (calculator.num1 / calculator.num2);
                    calculationZone.setText(String.valueOf(calculator.result));
                    calculator.setWord("0");
                    calculator.num1 = 0;
                    calculator.num2 = 0;
                }
                if (calculator.operator.equals("*")) {
                    calculator.num2 = Double.parseDouble(calculator.word);
                    calculator.result = (calculator.num1 * calculator.num2);
                    calculationZone.setText(String.valueOf(calculator.result));
                    calculator.setWord("0");
                    calculator.num1 = 0;
                    calculator.num2 = 0;
                }

                if (calculator.operator.equals("-")) {
                    calculator.num2 = Double.parseDouble(calculator.word);
                    calculator.result = (calculator.num1 - calculator.num2);
                    calculationZone.setText(String.valueOf(calculator.result));
                    calculator.setWord("0");
                    calculator.num1 = 0;
                    calculator.num2 = 0;
                }

                if (calculator.operator.equals("+")) {
                    calculator.num2 = Double.parseDouble(calculator.word);
                    calculator.result = (calculator.num1 + calculator.num2);
                    calculationZone.setText(String.valueOf(calculator.result));
                    calculator.setWord("0");
                    calculator.num1 = 0;
                    calculator.num2 = 0;
                }
            }
        });

        multiply = (Button) findViewById(R.id.multiply_button);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.num1 = Double.parseDouble(calculator.word);
                calculator.setWord("0");
                calculator.operatorIsPressed("*");
            }
        });

        divide = (Button) findViewById(R.id.divide_button);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.num1 = Double.parseDouble(calculator.word);
                calculator.setWord("0");
                calculator.operatorIsPressed("/");
            }
        });

        plus = (Button) findViewById(R.id.plus_button);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.num1 = Double.parseDouble(calculator.word);
                calculator.setWord("0");
                calculator.operatorIsPressed("+");
            }
        });

        minus = (Button) findViewById(R.id.minus_button);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.num1 = Double.parseDouble(calculator.word);
                calculator.setWord("0");
                calculator.operatorIsPressed("-");
            }
        });
    }
}
