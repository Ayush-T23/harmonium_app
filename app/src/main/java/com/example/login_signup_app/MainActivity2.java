package com.example.login_signup_app;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private MediaPlayer[] mediaPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize MediaPlayer array with the same size as the number of buttons
        mediaPlayers = new MediaPlayer[20]; // Adjust the size as needed
        mediaPlayers[0] = MediaPlayer.create(this, R.raw.b1);
        mediaPlayers[1] = MediaPlayer.create(this, R.raw.b2);
        mediaPlayers[2] = MediaPlayer.create(this, R.raw.b3);
        mediaPlayers[3] = MediaPlayer.create(this, R.raw.b4);
        mediaPlayers[4] = MediaPlayer.create(this, R.raw.b5);
        mediaPlayers[5] = MediaPlayer.create(this, R.raw.b6);
        mediaPlayers[6] = MediaPlayer.create(this, R.raw.b7);
        mediaPlayers[7] = MediaPlayer.create(this, R.raw.b8);
        mediaPlayers[8] = MediaPlayer.create(this, R.raw.w1);
        mediaPlayers[9] = MediaPlayer.create(this, R.raw.w2);
        mediaPlayers[10] = MediaPlayer.create(this, R.raw.w3);
        mediaPlayers[11] = MediaPlayer.create(this, R.raw.w4);
        mediaPlayers[12] = MediaPlayer.create(this, R.raw.w5);
        mediaPlayers[13] = MediaPlayer.create(this, R.raw.w6);
        mediaPlayers[14] = MediaPlayer.create(this, R.raw.w7);
        mediaPlayers[15] = MediaPlayer.create(this, R.raw.w8);
        mediaPlayers[16] = MediaPlayer.create(this, R.raw.w9);
        mediaPlayers[17] = MediaPlayer.create(this, R.raw.w10);
        mediaPlayers[18] = MediaPlayer.create(this, R.raw.w11);
        mediaPlayers[19] = MediaPlayer.create(this, R.raw.w12);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button w1 = findViewById(R.id.w1);
        Button w2 = findViewById(R.id.w2);
        Button w3 = findViewById(R.id.w3);
        Button w4 = findViewById(R.id.w4);
        Button w5 = findViewById(R.id.w5);
        Button w6 = findViewById(R.id.w6);
        Button w7 = findViewById(R.id.w7);
        Button w8 = findViewById(R.id.w8);
        Button w9 = findViewById(R.id.w9);
        Button w10 = findViewById(R.id.w10);
        Button w11 = findViewById(R.id.w11);
        Button w12 = findViewById(R.id.w12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[0] != null) {
                    mediaPlayers[0].start();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[1] != null) {
                    mediaPlayers[1].start();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[2] != null) {
                    mediaPlayers[2].start();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[3] != null) {
                    mediaPlayers[3].start();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[4] != null) {
                    mediaPlayers[4].start();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[5] != null) {
                    mediaPlayers[5].start();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[6] != null) {
                    mediaPlayers[6].start();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[7] != null) {
                    mediaPlayers[7].start();
                }
            }
        });
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[8] != null) {
                    mediaPlayers[8].start();
                }
            }
        });
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[9] != null) {
                    mediaPlayers[9].start();
                }
            }
        });
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[10] != null) {
                    mediaPlayers[10].start();
                }
            }
        });
        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[11] != null) {
                    mediaPlayers[11].start();
                }
            }
        });
        w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[12] != null) {
                    mediaPlayers[12].start();
                }
            }
        });
        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[13] != null) {
                    mediaPlayers[13].start();
                }
            }
        });
        w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[14] != null) {
                    mediaPlayers[14].start();
                }
            }
        });
        w8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[15] != null) {
                    mediaPlayers[15].start();
                }
            }
        });
        w9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[16] != null) {
                    mediaPlayers[16].start();
                }
            }
        });
        w10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[17] != null) {
                    mediaPlayers[17].start();
                }
            }
        });
        w11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[18] != null) {
                    mediaPlayers[18].start();
                }
            }
        });
        w12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayers[19] != null) {
                    mediaPlayers[19].start();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (MediaPlayer mediaPlayer : mediaPlayers) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        }
    }
}