package chief.simplecalculator;

/**
 * Created by Mike on 9/8/2016.
 */
public class CalcString {
    String word = "0";
    double num1 = 0;
    double num2 = 1;
    String operator = "*";
    double result;
    CalcString(String word) {
        this.word = word;


    }

    public String append(String i) {
        if (word.equals("0")) {
            return word = i;
        }
        else return word += i;


    }


    public void setWord(String word) {
        this.word = word;
    }

    public String operatorIsPressed(String j) {
        return operator = j;
    }

}
