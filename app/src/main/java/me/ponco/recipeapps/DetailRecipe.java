package me.ponco.recipeapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import me.ponco.recipeapps.R;


public class DetailRecipe extends AppCompatActivity {

    TextView textName;
    TextView textDes;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textDes = (TextView) findViewById(R.id.Recipe);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {


            String j = (String) b.get("name");
            String g = (String) b.get("img");
            String d = (String) b.get("desk");
            String e = (String) b.get("recipe");
            textDes.setText(e);

            getSupportActionBar().setTitle(j);

            ImageView imageView = (ImageView) findViewById(R.id.gambarDetail);

            Glide.with(getApplicationContext())
                    .load(g)
                    .into(imageView);

        } else {
            Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
