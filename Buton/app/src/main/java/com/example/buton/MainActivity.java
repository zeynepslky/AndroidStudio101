package com.example.buton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton button;
    private TextView timer,scores;
    private int score = 0;
    private boolean gameRunning = false;
    private final int GAME_DURATION_SECONDS = 30; // Oyun süresi (saniye)
    private int screenWidth;
    private int screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (ImageButton) findViewById(R.id.image);
        timer = (TextView) findViewById(R.id.timer);
        scores = (TextView) findViewById(R.id.scores);

        // Ekran genişliği ve yüksekliğini al
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameRunning) {
                    increaseScore();
                    moveButton();
                } else {
                    startGame();
                }
            }
        });
    }

    private void startGame() {
        gameRunning = true;
        score = 0;
        //button.setText("Catch Me");
        new CountDownTimer(GAME_DURATION_SECONDS * 1000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText("Time: " + millisUntilFinished / 1000);
                scores.setText("Score: " + score);
            }

            public void onFinish() {
                gameRunning = false;
                //button.setText("Start");
                Toast.makeText(MainActivity.this, "Game Over! Your Score: " + score, Toast.LENGTH_LONG).show();
            }
        }.start();
    }

    private void increaseScore() {
        score++;
        // Puanı arttır ve ekranda göster
        //Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
    }

    private void moveButton() {
        // Butonu rastgele bir konuma taşı
        int newX = (int) (Math.random() * (screenWidth - button.getWidth()));
        int newY = (int) (Math.random() * (screenHeight - button.getHeight()));
        button.setX(newX);
        button.setY(newY);
    }
}
