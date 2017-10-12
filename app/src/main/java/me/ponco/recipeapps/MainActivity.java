package me.ponco.recipeapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import me.ponco.recipeapps.Adapter.RecipeAdapter;
import me.ponco.recipeapps.Data.RecipeData;
import me.ponco.recipeapps.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<RecipeAdapter> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Resep Makanan");
        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(RecipeData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListRecipe lista = new ListRecipe(this);
        lista.setListRecipe(list);
        rvCategory.setAdapter(lista);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedCat(list.get(position));
            }
        });


    }

    private void showSelectedCat(RecipeAdapter rcp) {
        Intent intent = new Intent(getApplicationContext(), DetailRecipe.class);
        intent.putExtra("name", rcp.getName());
        intent.putExtra("img", rcp.getPhoto());
        intent.putExtra("desk", rcp.getDesc());
        intent.putExtra("recipe", rcp.getRecipe());
        startActivity(intent);
    }

}
