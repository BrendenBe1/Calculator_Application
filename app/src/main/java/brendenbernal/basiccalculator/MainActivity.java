package brendenbernal.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.util.LinkedList;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClick();
    }

   public void onClick()
   {
       //TextView screenText = (TextView) findViewById(R.id.screenText);
       final EditText screenText = (EditText) findViewById(R.id.screenText);
       Button button0 = (Button) findViewById(R.id.button0);
       Button button1 = (Button) findViewById(R.id.button1);
       Button button2 = (Button) findViewById(R.id.button2);
       Button button3 = (Button) findViewById(R.id.button3);
       Button button4 = (Button) findViewById(R.id.button4);
       Button button5 = (Button) findViewById(R.id.button5);
       Button button6 = (Button) findViewById(R.id.button6);
       Button button7 = (Button) findViewById(R.id.button7);
       Button button8 = (Button) findViewById(R.id.button8);
       Button button9 = (Button) findViewById(R.id.button9);
       Button buttonClear = (Button) findViewById(R.id.buttonClear);
       Button buttonBack = (Button) findViewById(R.id.buttonBack);
       Button buttonPLUS = (Button) findViewById(R.id.buttonPLUS);
       Button buttonSUB = (Button) findViewById(R.id.buttonSUB);
       Button buttonMULT = (Button) findViewById(R.id.buttonMULT);
       Button buttonDIV = (Button) findViewById(R.id.buttonDIV);
       Button buttonDEC = (Button) findViewById(R.id.buttonDEC);
       Button buttonOPARENTH = (Button) findViewById(R.id.buttonOPARENTH);
       Button buttonCPARENTH = (Button) findViewById(R.id.buttonCPARENTH);
       Button buttonEQ = (Button) findViewById(R.id.buttonEQ);

       button0.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("0 ");
           }
       });

       button1.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("1 ");
           }
       });

       button2.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("2 ");
           }
       });

       button3.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("3 ");
           }
       });

       button4.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("4 ");
           }
       });

       button5.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("5 ");
           }
       });

       button6.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("6 ");
           }
       });

       button7.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("7 ");
           }
       });

       button8.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("8 ");
           }
       });

       button9.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("9 ");
           }
       });

       buttonClear.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.setText(" ");
           }
       });

       buttonBack.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               if(!(screenText.length()==0))
                   screenText.setText(screenText.getText().delete(screenText.length() - 2, screenText.length()));
           }
       });

       buttonPLUS.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("+ ");
           }
       });

       buttonSUB.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("- ");
           }
       });

       buttonMULT.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("* ");
           }
       });

       buttonDIV.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("/ ");
           }
       });

       buttonDEC.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               if(!(screenText.length()==0))
               {
                   screenText.setText(screenText.getText().delete(screenText.length() - 1, screenText.length()));
                   //Editable temp = (screenText.getText().delete(screenText.length() - 1, screenText.length()));
                   //temp.append(".");
                   //screenText.setText();
                   String checkingLast = screenText.getText().toString();
                   String[] lastArray = checkingLast.split("");
                   Log.d("split0", lastArray[0]);
                   Log.d("split-1", lastArray[-1]);
                   if(lastArray[-1] == " "){
                       screenText.append(" .");
                   }
                   else{
                       screenText.append(".");
                   }
                   //screenText.append(".");
               }
               else{
                   screenText.append(".");
               }
               //screenText.append(".");
           }
       });

       buttonOPARENTH.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("( ");
           }
       });

       buttonCPARENTH.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append(") ");
           }
       });

       buttonEQ.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               String inputEquation = screenText.getText().toString();
//               if(inputEquation.trim().length() == 0) screenText.setText("Empty");
//               if(inputEquation.contains("*"))
//               {
//                   String[] temp = inputEquation.split("\\*");
//                   Float result = Float.parseFloat(temp[0]) * Float.parseFloat(temp[1]);
//                   String resultString = Float.toString(result);
//                   screenText.setText(resultString);
//               }
//               if(inputEquation.contains("/"))
//               {
//                   String[] temp = inputEquation.split("/");
//                   if(Float.parseFloat(temp[1]) == 0)
//                   {
//                       screenText.setText("Cannot Divide by 0");
//                   }
//                   else
//                   {
//                       Float result = Float.parseFloat(temp[0]) / Float.parseFloat(temp[1]);
//                       String resultString = Float.toString(result);
//                       screenText.setText(resultString);
//                   }
//
//               }
//               if(inputEquation.contains("+"))
//               {
//                   String[] temp = inputEquation.split("\\+");
//                   Float result = Float.parseFloat(temp[0]) + Float.parseFloat(temp[1]);
//                   String resultString = Float.toString(result);
//                   screenText.setText(resultString);
//               }
//               if(inputEquation.contains("-"))
//               {
//                   String[] temp = inputEquation.split("-");
//                   Float result = Float.parseFloat(temp[0]) - Float.parseFloat(temp[1]);
//                   String resultString = Float.toString(result);
//                   screenText.setText(resultString);
//               }
               final String ops = "-+/*";
               StringBuilder sb = new StringBuilder();
               Stack<Integer> s = new Stack<>();
               for (String token : inputEquation.split("\\s")) {
                   if (token.isEmpty())
                       continue;
                   char c = token.charAt(0);
                   int idx = ops.indexOf(c);

                   // check for operator
                   if (idx != -1) {
                       if (s.isEmpty())
                           s.push(idx);

                       else {
                           while (!s.isEmpty()) {
                               int prec2 = s.peek() / 2;
                               int prec1 = idx / 2;
                               if (prec2 > prec1 || (prec2 == prec1))
                                   sb.append(ops.charAt(s.pop())).append(' ');
                               else break;
                           }
                           s.push(idx);
                       }
                   }
                   else if (c == '(') {
                       s.push(-2); // -2 stands for '('
                   }
                   else if (c == ')') {
                       // until '(' on stack, pop operators.
                       while (s.peek() != -2)
                           sb.append(ops.charAt(s.pop())).append(' ');
                       s.pop();
                   }
                   else {
                       sb.append(token).append(' ');
                   }
               }
               while (!s.isEmpty())
                   sb.append(ops.charAt(s.pop())).append(' ');
               String shuntingOutput = sb.toString();
               Log.d("shuntingOutput", shuntingOutput);
               String finalAnswer = Double.toString(evalShunting(shuntingOutput).pop());
               screenText.setText(finalAnswer);
               //screenText.setText(shuntingOutput);
           }
       });
   }

    public static LinkedList<Double> evalShunting(String expr)
    {
        String cleanExpr = cleanExpr(expr);
        Log.d("cleanExpr", cleanExpr);
        //String cleanExpr = expr;
        LinkedList<Double> stack = new LinkedList<Double>();
        //System.out.println("Input\tOperation\tStack after");
        for(String token:cleanExpr.split("\\s")){
            //System.out.print(token+"\t");
            Log.d("token", token+"\t");
            Double tokenNum = null;
            try{
                tokenNum = Double.parseDouble(token);
            }catch(NumberFormatException e){}
            if(tokenNum != null){
                //System.out.print("Push\t\t");
                stack.push(Double.parseDouble(token+""));
            }else if(token.equals("*")){
               //System.out.print("Operate\t\t");
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand * secondOperand);
            }else if(token.equals("/")){
                //System.out.print("Operate\t\t");
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand / secondOperand);
            }else if(token.equals("-")){
                //System.out.print("Operate\t\t");
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand - secondOperand);
            }else if(token.equals("+")){
                //System.out.print("Operate\t\t");
                double secondOperand = stack.pop();
                double firstOperand = stack.pop();
                stack.push(firstOperand + secondOperand);
            }else{
                Log.d("error", stack.pop().toString());
            }
            //System.out.println(stack);
        }
        //System.out.println("Final answer: " + stack.pop());
        return stack;
    }
    private static String cleanExpr(String expr){
        //remove all non-operators, non-whitespace, and non digit chars
        return expr.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", "");
    }
}
