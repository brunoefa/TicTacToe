package com.treinamento.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends Activity {
	
	private static final String SYMBOL_O = "O";
	private static final String SYMBOL_X = "X";
	
	private String playerSymbol = SYMBOL_O;
	private Integer currentIndex = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	}
	
	public void setupButton(Button b) {
		b.setText(getPlayerSymbol());
		b.setEnabled(Boolean.FALSE);
		showMessage("Index: " + currentIndex);
//		Intent i = getIntent();
//		Bundle params = i.getExtras();
//		Game game = (Game)params.getSerializable("game");
	}
	
	public String getPlayerSymbol() {
		if (playerSymbol.equals(SYMBOL_O)) {
			playerSymbol = SYMBOL_X;
		}else {
			playerSymbol = SYMBOL_O;
		}
		return playerSymbol;
	}
	
	
	
/*	
	public void onClick(View view) {
		int id = 0; 
		switch (view.getId()) {
			case R.id.button1: id = R.id.button1; currentIndex = 1; break;
			case R.id.button2: id = R.id.button2; currentIndex = 2; break;
			case R.id.button3: id = R.id.button3; currentIndex = 3; break;
			case R.id.button4: id = R.id.button4; currentIndex = 4; break;
			case R.id.button5: id = R.id.button5; currentIndex = 5; break;
			case R.id.button6: id = R.id.button6; currentIndex = 6; break;
			case R.id.button7: id = R.id.button7; currentIndex = 7; break;
			case R.id.button8: id = R.id.button8; currentIndex = 8; break;
			case R.id.button9: id = R.id.button9; currentIndex = 9; break;
		}
		showMessage("Clicado: " + id);
		if (id != 0){
			Button button = (Button)findViewById(id);
			setupButton(button);	
		}
	}
*/	
	public void click1(View view) {
		Button button = (Button)findViewById(R.id.button1);
		currentIndex = 1;
		setupButton(button);
	}
	
	public void click2(View view) {
		Button button = (Button)findViewById(R.id.button2);
		currentIndex = 2;
		setupButton(button);
	}
	
	public void click3(View view) {
		Button button = (Button)findViewById(R.id.button3);
		currentIndex = 3;
		setupButton(button);
	}
	
	public void click4(View view) {
		Button button = (Button)findViewById(R.id.button4);
		currentIndex = 4;
		setupButton(button);
	}
	
	public void click5(View view) {
		Button button = (Button)findViewById(R.id.button5);
		currentIndex = 5;
		setupButton(button);
	}
	
	public void click6(View view) {
		Button button = (Button)findViewById(R.id.button6);
		currentIndex = 6;
		setupButton(button);
	}
	
	public void click7(View view) {
		Button button = (Button)findViewById(R.id.button7);
		currentIndex = 7;
		setupButton(button);
	}
	
	public void click8(View view) {
		Button button = (Button)findViewById(R.id.button8);
		currentIndex = 8;
		setupButton(button);
	}
	
	public void click9(View view) {
		Button button = (Button)findViewById(R.id.button9);
		currentIndex = 9;
		setupButton(button);
	}
	
	private	void showMessage(String message) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}
}
