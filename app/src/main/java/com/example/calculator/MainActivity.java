package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int stat = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 0 means insert first , 1 means insert second

        //################################################
        //################################################
        //################################################
        //###################   I was here   #############################
        //################################################




        Button AC = (Button) findViewById(R.id.AC);
        Button calc = (Button) findViewById(R.id.Calc);
        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button div = (Button) findViewById(R.id.dev);
        Button mul = (Button) findViewById(R.id.mul);

        Button b0 = (Button) findViewById(R.id.button0);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);

        final TextView first = (TextView) findViewById(R.id.first);
        final TextView second = (TextView) findViewById(R.id.second);
        final TextView operator = (TextView) findViewById(R.id.operator);
        final TextView result = (TextView) findViewById(R.id.result);

        View.OnClickListener ACclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                result.setText("");
                first.setText("");
                second.setText("");
                operator.setText("");
                stat = 0;
            }
        };
     AC.setOnClickListener( ACclick);

        View.OnClickListener addclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {

                operator.setText("+");
                stat = 1;

            }
        };
        add.setOnClickListener( addclick);

        View.OnClickListener subclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {

                operator.setText("-");
                stat = 1;
            }
        };
        sub.setOnClickListener( subclick);

        View.OnClickListener mulclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {

                operator.setText("*");
                stat = 1;
            }
        };
        mul.setOnClickListener( mulclick);

        View.OnClickListener divclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {

                operator.setText("/");
                stat = 1;
            }
        };
        div.setOnClickListener( divclick);

        View.OnClickListener calcclick = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                int x = Integer.parseInt(first.getText().toString());
                int y = Integer.parseInt(second.getText().toString());
                String res = "";
                String op = operator.getText().toString();

                if( op == "+") {
                    res += String.format( "%d" , x + y);
                    result.setText( res);
                }
                if( op == "-") {
                    res += String.format( "%d" , x - y);
                    result.setText( res);
                }
                if( op == "*") {
                    res += String.format( "%d" , x * y);
                    result.setText( res);
                }
                if( op == "/") {
                    if( y == 0) {
                        res += String.format( "NO WAY!");
                        result.setText( res);

                    } else {
                        res += String.format("%d", x / y);
                        result.setText(res);
                    }
                }





                stat = 0;
            }
        };
        calc.setOnClickListener( calcclick);

        View.OnClickListener b0click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "0");
                } else {
                    second.append( "0");
                }



            }
        };
        b0.setOnClickListener( b0click);

        View.OnClickListener b1click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "1");
                } else {
                    second.append( "1");
                }



            }
        };
        b1.setOnClickListener( b1click);

        View.OnClickListener b2click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "2");
                } else {
                    second.append( "2");
                }



            }
        };
        b2.setOnClickListener( b2click);

        View.OnClickListener b3click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "3");
                } else {
                    second.append( "3");
                }



            }
        };
        b3.setOnClickListener( b3click);

        View.OnClickListener b4click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "4");
                } else {
                    second.append( "4");
                }



            }
        };
        b4.setOnClickListener( b4click);

        View.OnClickListener b5click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "5");
                } else {
                    second.append( "5");
                }



            }
        };
        b5.setOnClickListener( b5click);

        View.OnClickListener b6click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "6");
                } else {
                    second.append( "6");
                }



            }
        };
        b6.setOnClickListener( b6click);

        View.OnClickListener b7click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "7");
                } else {
                    second.append( "7");
                }



            }
        };
        b7.setOnClickListener( b7click);

        View.OnClickListener b8click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "8");
                } else {
                    second.append( "8");
                }



            }
        };
        b8.setOnClickListener( b8click);

        View.OnClickListener b9click = new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                if( stat == 0) {
                    first.append( "9");
                } else {
                    second.append( "9");
                }



            }
        };
        b9.setOnClickListener( b9click);



    }
}
