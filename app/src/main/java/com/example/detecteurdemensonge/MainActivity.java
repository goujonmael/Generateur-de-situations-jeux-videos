package com.example.detecteurdemensonge;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String unityGameID = "3054608";


    final private UnityAdsListener unityAdsListener = new UnityAdsListener();

    private static final String TAG = "MainActivity";

    RelativeLayout mRelativeLayout;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (UnityAds.isReady()) {
                    UnityAds.show(MainActivity.this);
                    Toast.makeText(MainActivity.this, "ADS REEEADY", Toast.LENGTH_SHORT).show();
                }


                //EPOQUE


                    Random random = new Random();
                    int nb;
                    nb = random.nextInt(15);
                TextView mytextview = (TextView)findViewById(R.id.epoque1);
                    if (nb == 1) {
                        mytextview.setText("Moyen Age Tardif");
                        mytextview.setTextColor(Color.RED);
                    }
                    else if (nb == 2){
                        mytextview.setText("Grèce/Rome Antique");
                        mytextview.setTextColor(Color.RED);
                    }
                    else if (nb == 3){
                        mytextview.setText("Présent");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 4){
                        mytextview.setText("Viking");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 5){
                        mytextview.setText("Futur Proche");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 6){
                        mytextview.setText("Futur Avancé");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 7){
                        mytextview.setText("Science Fiction");
                        mytextview.setTextColor(Color.RED);
                    }
                    else if (nb == 8){
                        mytextview.setText("Entre guerre/guerre mondiale ");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 9){
                        mytextview.setText("70/80");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 10){
                        mytextview.setText("Féodale Asiatique");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 11){
                        mytextview.setText("Égypte Antique");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 12){
                        mytextview.setText("Début Moyen Age");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 13){
                        mytextview.setText("Héroïque Fantaisie");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 14){
                        mytextview.setText("Post Appocalyptique");
                        mytextview.setTextColor(Color.RED);
                    }else if (nb == 15){
                        mytextview.setText("Far West");
                        mytextview.setTextColor(Color.RED);
                    }



                    //GENRE



                Random random2 = new Random();
                int nb2;
                nb2 = random.nextInt(10);
                TextView mytextview2 = (TextView)findViewById(R.id.mytextview2);
                if (nb2 == 1) {
                    mytextview2.setText("RPG");
                    mytextview2.setTextColor(Color.RED);
                }
                else if (nb2 == 2){
                    mytextview2.setText("Shooter");
                    mytextview2.setTextColor(Color.RED);
                }
                else if (nb == 3){
                    mytextview2.setText("Moba");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 4){
                    mytextview2.setText("Stratégie");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 5){
                    mytextview2.setText("Gestion");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 6){
                    mytextview2.setText("Aventure / Exploration");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 7){
                    mytextview2.setText("Horreur");
                    mytextview2.setTextColor(Color.RED);
                }
                else if (nb2 == 8){
                    mytextview2.setText("Mmorpg");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 9){
                    mytextview2.setText("RTS");
                    mytextview2.setTextColor(Color.RED);
                }else if (nb2 == 10){
                    mytextview2.setText("Card Game");
                    mytextview2.setTextColor(Color.RED);
                }
                    UnityAds.initialize(MainActivity.this, "3815613", unityAdsListener);


                
            }

        });
    }
    private class UnityAdsListener implements IUnityAdsListener{
        @Override
        public void onUnityAdsReady(String s) {
            }

        @Override
        public void onUnityAdsStart(String s) {
            Toast.makeText(MainActivity.this, "Merci de me soutenir !", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

        }

        @Override
        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

        }
    }
}