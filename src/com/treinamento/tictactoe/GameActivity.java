package com.treinamento.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity {
	
	enum State{Blank, X, O};
	State currentState = State.X;
	int n = 3, moveCount; 
	Integer xwins = 0, owins = 0, draws = 0;
	State[][] board = new State[n][n];
	Intent appIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		setupGame();
	}
	
	public void setupButton(Button b) {
		b.setText(currentState.toString());
		b.setEnabled(Boolean.FALSE);
	}
	
	public void setupGame() {
		appIntent = getIntent();
		String winner = appIntent.getStringExtra("winner");
		if (winner != null) {
			xwins = Integer.parseInt(appIntent.getStringExtra("xwins").trim());
			owins = Integer.parseInt(appIntent.getStringExtra("owins").trim());
			draws = Integer.parseInt(appIntent.getStringExtra("draws").trim());
		}
	}
	
	public void turnState() {
		currentState = (currentState == State.X ? State.O : State.X);
	}
	
	public void move(int x, int y, State s) {

		board[x][y] = s;
		turnState();
		moveCount++;

		// verifica colunas
		for (int i = 0; i < n; i++) {
			if (board[x][i] != s) break;
			if (i == n - 1) {
				showStats(s);
			}
		}

		// verifica linhas
		for (int i = 0; i < n; i++) {
			if (board[i][y] != s) break;
			if (i == n - 1) {
				showStats(s);
			}
		}

		// verifica diagonal
		if (x == y) {
			// we're on a diagonal
			for (int i = 0; i < n; i++) {
				if (board[i][i] != s) break;
				if (i == n - 1) {
					showStats(s);
				}
			}
		}

		// verifica antidiagonal
		for (int i = 0; i < n; i++) {
			if (board[i][(n - 1) - i] != s) break;
			if (i == n - 1) {
				showStats(s);
			}
		}

		// verifica velha
		if (moveCount == (Math.pow(n, 2) - 1)) {
			showStats(State.Blank);
		}
	}
	
	public void showStats(State s) {
		Intent i = getIntent();
		i.setClass(this , StatsActivity.class);
		
		if (s == State.X) {
			xwins++;
		} else if (s == State.O) { 
			owins++;
		} else {
			draws++;
		}
		
		i.putExtra("winner", s.toString());
		i.putExtra("xwins", xwins.toString());
		i.putExtra("owins", owins.toString());
		i.putExtra("draws", draws.toString());
		
		startActivity(i);
	}
	
	public void click1(View view) {
		Button button = (Button)findViewById(R.id.button1);
		setupButton(button);
		move(0, 0, currentState);
	}
	
	public void click2(View view) {
		Button button = (Button)findViewById(R.id.button2);
		setupButton(button);
		move(0, 1, currentState);
	}
	
	public void click3(View view) {
		Button button = (Button)findViewById(R.id.button3);
		setupButton(button);
		move(0, 2, currentState);
	}
	
	public void click4(View view) {
		Button button = (Button)findViewById(R.id.button4);
		setupButton(button);
		move(1, 0, currentState);
	}
	
	public void click5(View view) {
		Button button = (Button)findViewById(R.id.button5);
		setupButton(button);
		move(1, 1, currentState);
	}
	
	public void click6(View view) {
		Button button = (Button)findViewById(R.id.button6);
		setupButton(button);
		move(1, 2, currentState);
	}
	
	public void click7(View view) {
		Button button = (Button)findViewById(R.id.button7);
		setupButton(button);
		move(2, 0, currentState);
	}
	
	public void click8(View view) {
		Button button = (Button)findViewById(R.id.button8);
		setupButton(button);
		move(2, 1, currentState);
	}
	
	public void click9(View view) {
		Button button = (Button)findViewById(R.id.button9);
		setupButton(button);
		move(2, 2, currentState);
	}
	
}
