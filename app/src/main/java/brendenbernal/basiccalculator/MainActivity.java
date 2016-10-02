package brendenbernal.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

       button0.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("0");
           }
       });

       button1.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("1");
           }
       });

       button2.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("2");
           }
       });

       button3.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("3");
           }
       });

       button4.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("4");
           }
       });

       button5.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("5");
           }
       });

       button6.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("6");
           }
       });

       button7.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("7");
           }
       });

       button8.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("8");
           }
       });

       button9.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("9");
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
                   screenText.setText(screenText.getText().delete(screenText.length() - 1, screenText.length()));
           }
       });

       buttonPLUS.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("+");
           }
       });

       buttonSUB.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("-");
           }
       });

       buttonMULT.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("*");
           }
       });

       buttonDIV.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append("/");
           }
       });

       buttonDEC.setOnClickListener(new OnClickListener()
       {
           @Override
           public void onClick (View v)
           {
               screenText.append(".");
           }
       });
   }
}
