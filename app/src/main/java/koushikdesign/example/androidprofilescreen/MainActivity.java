package koushikdesign.example.androidprofilescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;

public class MainActivity extends AppCompatActivity {

    AppBarLayout appBarLayout;
    Toolbar toolbar;

    int colorOffet=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Koushik CafeCode");

        setSupportActionBar(toolbar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.BaseOnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                colorOffet = -(i);
                if (colorOffet>255)
                    colorOffet=255;

                //Hide Toolbar
                toolbar.getBackground().setAlpha(colorOffet);
                toolbar.setAlpha(colorOffet/256f);

            }
        });
    }
}
