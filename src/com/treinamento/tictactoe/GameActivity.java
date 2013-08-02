package com.treinamento.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends Activity {
	
	private static final String SYMBOL_O = "O";
	private static final String SYMBOL_X = "X";
	
	private String playerSymbol = SYMBOL_O;
	String sequencia[][];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	}
	
	public void setupButton(Button b) {
		b.setText(getPlayerSymbol());
		b.setEnabled(Boolean.FALSE);
		verifyWinner();
	}
	
	public String getPlayerSymbol() {
		if (playerSymbol.equals(SYMBOL_O)) {
			playerSymbol = SYMBOL_X;
		}else {
			playerSymbol = SYMBOL_O;
		}
		return playerSymbol;
	}
	
	public void verifyWinner() {
		if (sequencia.length == 9) {
			
		}
		
	}
	
	public void showWinner() {
		Intent i = getIntent();
		Bundle params = i.getExtras();
		params.getSerializable("game");
	}
	
	public void click1(View view) {
		Button button = (Button)findViewById(R.id.button1);
		sequencia[1][1] = playerSymbol;
		setupButton(button);
	}
	
	public void click2(View view) {
		Button button = (Button)findViewById(R.id.button2);
		sequencia[1][2] = playerSymbol;
		setupButton(button);
	}
	
	public void click3(View view) {
		Button button = (Button)findViewById(R.id.button3);
		sequencia[1][3] = playerSymbol;
		setupButton(button);
	}
	
	public void click4(View view) {
		Button button = (Button)findViewById(R.id.button4);
		sequencia[2][1] = playerSymbol;
		setupButton(button);
	}
	
	public void click5(View view) {
		Button button = (Button)findViewById(R.id.button5);
		sequencia[2][2] = playerSymbol;
		setupButton(button);
	}
	
	public void click6(View view) {
		Button button = (Button)findViewById(R.id.button6);
		sequencia[2][3] = playerSymbol;
		setupButton(button);
	}
	
	public void click7(View view) {
		Button button = (Button)findViewById(R.id.button7);
		sequencia[3][1] = playerSymbol;
		setupButton(button);
	}
	
	public void click8(View view) {
		Button button = (Button)findViewById(R.id.button8);
		sequencia[3][2] = playerSymbol;
		setupButton(button);
	}
	
	public void click9(View view) {
		Button button = (Button)findViewById(R.id.button9);
		sequencia[3][3] = playerSymbol;
		setupButton(button);
	}
	
	private	void showMessage(String message) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}
}
