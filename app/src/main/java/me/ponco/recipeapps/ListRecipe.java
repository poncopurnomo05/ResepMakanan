package me.ponco.recipeapps;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import me.ponco.recipeapps.Adapter.RecipeAdapter;
import me.ponco.recipeapps.R;

public class ListRecipe extends RecyclerView.Adapter<ListRecipe.CategoryViewHolder> {

    private Context context;

    public ArrayList<RecipeAdapter> getListRecipe() {
        return listRecipe;
    }

    public void setListRecipe(ArrayList<RecipeAdapter> listRecipe) {
        this.listRecipe = listRecipe;
    }

    private ArrayList<RecipeAdapter> listRecipe;

    public ListRecipe(Context context) {
        this.context = context;
    }

    @Override
    public ListRecipe.CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_recipe, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(ListRecipe.CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListRecipe().get(position).getName());
        holder.tvDesc.setText(getListRecipe().get(position).getDesc());
        holder.tvRecipe.setText(getListRecipe().get(position).getRecipe());
        Glide.with(context)
                .load(getListRecipe().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListRecipe().size();
    }

    public class CategoryViewHolder  extends  RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvDesc;
        ImageView imgPhoto;
        TextView tvRecipe;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvRecipe = itemView.findViewById(R.id.tv_item_recipe);
        }
    }
}
