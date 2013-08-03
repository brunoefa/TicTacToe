package com.treinamento.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StatsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stats);
		Intent i = getIntent();
		
		String winner = i.getStringExtra("winner");
		
		String player1 = i.getStringExtra("player1");
		String player2 = i.getStringExtra("player2");

		String xwins = i.getStringExtra("xwins");
		String owins = i.getStringExtra("owins");
		String draws = i.getStringExtra("draws");
		
		TextView tv_winner = (TextView)findViewById(R.id.winner);

		if (winner.equals("X")) {
			tv_winner.setText(player1 + " é o vencedor!");
		} else if (winner.equals("O")) {
			tv_winner.setText(player2 + " é o vencedor!");
		}else {
			tv_winner.setText("Jogo empatado");
		}
		
		TextView tv_title_player1 = (TextView)findViewById(R.id.tv_player1_title);
		tv_title_player1.setText(player1);
		TextView tv_player1 = (TextView)findViewById(R.id.tv_player1);
		tv_player1.setText(xwins);
		
		TextView tv_title_player2 = (TextView)findViewById(R.id.tv_player2_title);
		TextView tv_player2 = (TextView)findViewById(R.id.tv_player2);
		tv_title_player2.setText(player2);
		tv_player2.setText(owins);

		TextView tv_draws = (TextView)findViewById(R.id.draws);
		tv_draws.setText(draws);
	}
	
	public void playAgain(View view) {
		Intent intent = getIntent();
		intent.setClass(this, GameActivity.class);
		startActivity(intent);
	}
	
}
