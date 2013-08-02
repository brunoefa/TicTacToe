package com.treinamento.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayersActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_players);
	}
	
	public void startGame(View view) {
		EditText et_jogador1 = (EditText)findViewById(R.id.et_jogador_1);
		EditText et_jogador2 = (EditText)findViewById(R.id.et_jogador_2);
		
		Game game = new Game();
		game.setJogador1(et_jogador1.getText().toString());
		game.setJogador2(et_jogador2.getText().toString());
		
		Bundle params = new Bundle();
		params.putSerializable("game", game);
		
		Intent i = new Intent(this, GameActivity.class);
		i.putExtras(params);
		startActivity(i);
	}

}
