package com.issing.calc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class Calculator1Activity extends Activity implements OnTouchListener {
    
    public EditText txtCalc;
    public String str1="";
    public String firstNum="";
    public String secondNum="";
    public String symbol="";
    public MediaPlayer noise;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        setUp();
        
    }
    public void setUp()
    {
    	noise=MediaPlayer.create(this, R.raw.button);
    	txtCalc = (EditText) findViewById(R.id.txtCalc);
    	Button btnAbout =(Button) findViewById(R.id.btnAbout);
    	btnAbout.setOnTouchListener(this);
    	Button btnS = (Button) findViewById(R.id.btnSquare);
    	btnS.setOnTouchListener(this);
    	Button btnC = (Button) findViewById(R.id.btnCube);
    	btnC.setOnTouchListener(this);
    	Button btnSR = (Button) findViewById(R.id.btnSR);
    	btnSR.setOnTouchListener(this);
    	Button btnCR = (Button) findViewById(R.id.btnCR);
    	btnCR.setOnTouchListener(this);
    	Button btn1 = (Button) findViewById(R.id.btnOne);
    	btn1.setOnTouchListener(this);
    	Button btn2 = (Button) findViewById(R.id.btnTwo);
    	btn2.setOnTouchListener(this);
    	Button btn3 = (Button) findViewById(R.id.btnThree);
    	btn3.setOnTouchListener(this);
    	Button btn4 = (Button) findViewById(R.id.btnFour);
    	btn4.setOnTouchListener(this);
    	Button btn5 = (Button) findViewById(R.id.btnFive);
    	btn5.setOnTouchListener(this);
    	Button btn6 = (Button) findViewById(R.id.btnSix);
    	btn6.setOnTouchListener(this);
    	Button btn7 = (Button) findViewById(R.id.btnSeven);
    	btn7.setOnTouchListener(this);
    	Button btn8 = (Button) findViewById(R.id.btnEight);
    	btn8.setOnTouchListener(this);
    	Button btn9 = (Button) findViewById(R.id.btnNine);
    	btn9.setOnTouchListener(this);
    	Button btn0 = (Button) findViewById(R.id.btnZero);
    	btn0.setOnTouchListener(this);
    	Button btnEnter =(Button) findViewById(R.id.btnEnter);
    	btnEnter.setOnTouchListener(this);
    	Button btnClear= (Button) findViewById(R.id.btnClear);
    	btnClear.setOnTouchListener(this);
    	Button btnAdd= (Button) findViewById(R.id.btnAdd);
    	btnAdd.setOnTouchListener(this);
    	Button btnSub= (Button) findViewById(R.id.btnSub);
    	btnSub.setOnTouchListener(this);
    	Button btnMult= (Button) findViewById(R.id.btnMult);
    	btnMult.setOnTouchListener(this);
    	Button btnDiv= (Button) findViewById(R.id.btnDiv);
    	btnDiv.setOnTouchListener(this);
    }
	@Override
	public boolean onTouch(View v, MotionEvent arg1) {
		if ((v.getId()==R.id.btnAbout)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			new AlertDialog.Builder(this)
		    .setTitle("About")
		    .setMessage("This app was created by Chris at night the day before it was due so it is not great. Thank You.")
		    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		            dialog.cancel();
		        }
		     })
		     .show();
			
		}
		if ((v.getId()==R.id.btnAdd)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			str1="";
			txtCalc.setText(str1);
			symbol="add";
			
			
		}
		if ((v.getId()==R.id.btnSquare)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			int tot = Integer.parseInt(firstNum)*Integer.parseInt(firstNum);
			txtCalc.setText(""+tot);
			firstNum="";
			secondNum="";
			str1="";
			
			
		}
		if ((v.getId()==R.id.btnSR)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			double tot = Math.sqrt((double)Integer.parseInt(firstNum));
			txtCalc.setText(""+tot);
			firstNum="";
			secondNum="";
			str1="";
			
			
		}
		if ((v.getId()==R.id.btnCube)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			int tot = Integer.parseInt(firstNum)*Integer.parseInt(firstNum)*Integer.parseInt(firstNum);
			txtCalc.setText(""+tot);
			firstNum="";
			secondNum="";
			str1="";
			
			
		}
		if ((v.getId()==R.id.btnCR)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			double tot = Math.pow(Integer.parseInt(firstNum), 1.0/3);
			txtCalc.setText(""+tot);
			firstNum="";
			secondNum="";
			str1="";
			
		}
		if ((v.getId()==R.id.btnSub)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			str1="";
			txtCalc.setText(str1);
			symbol="sub";
			
		}
		if ((v.getId()==R.id.btnMult)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			str1="";
			txtCalc.setText(str1);
			symbol="mult";
			
		}
		if ((v.getId()==R.id.btnDiv)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			firstNum=str1;
			str1="";
			txtCalc.setText(str1);
			symbol="div";
			
		}
		if ((v.getId()==R.id.btnEnter)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			if (firstNum==""){
				firstNum="1";
			}
			if (str1=="")
			{
				str1="0";
			}
			int tot;
			txtCalc.setText("");
			if (firstNum!=null)
			{
				if (symbol=="add")
				{
				secondNum=str1;
				tot=(Integer.parseInt(firstNum)+Integer.parseInt(secondNum));
				txtCalc.setText(""+tot);
				
				}
				else if(symbol=="sub")
				{
					secondNum=str1;
					tot=(Integer.parseInt(firstNum)-Integer.parseInt(secondNum));
					txtCalc.setText(""+tot);
				}
				else if(symbol=="mult")
				{
					secondNum=str1;
					tot=(Integer.parseInt(firstNum)*Integer.parseInt(secondNum));
					txtCalc.setText(""+tot);
				}
				else if(symbol=="div")
				{
					secondNum=str1;
					double tot1=((double)(Integer.parseInt(firstNum))/((double)Integer.parseInt(secondNum)));
					txtCalc.setText(""+tot1);
				}
			}
			firstNum="";
			secondNum="";
			str1="";
			
			
			
		}
		if ((v.getId()==R.id.btnOne)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			
			noise.start();
			txtCalc.setText(str1);
			str1+="1";
			txtCalc.setText(str1);
			
		}
		if ((v.getId()==R.id.btnTwo)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="2";
			txtCalc.setText(str1);
			
		}
		if ((v.getId()==R.id.btnThree)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="3";
			txtCalc.setText(str1);
			
		}
		if ((v.getId()==R.id.btnFour)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="4";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnFive)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="5";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnSix)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="6";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnSeven)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="7";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnEight)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="8";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnNine)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="9";
			txtCalc.setText(str1);
		}
		if ((v.getId()==R.id.btnZero)&&(arg1.getAction()==MotionEvent.ACTION_DOWN))
		{
			noise.start();
			txtCalc.setText("");
			str1+="0";
			txtCalc.setText(str1);
		}
		if (v.getId()==R.id.btnClear)
		{
			noise.start();
			txtCalc.setText("");
			str1="";
			txtCalc.setText(str1);
		}
		return false;
	}
}