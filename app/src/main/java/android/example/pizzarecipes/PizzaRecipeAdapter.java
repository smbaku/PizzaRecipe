package android.example.pizzarecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {

    // Самый главный процесс по шагово
    // 1 создаем внутренний класс Holder class и наследуемся
    // 2 создаем поля для связи
    //3 имплементуируем методы главного класса PizzaRecipeAdapter
    //4 в методе onCreateViewHolder присваиваем View
    // 5 Cаздаем обьект класса  PizzaRecipeViewHolder и передаем ему view
    //6 связываем поля
    //7 В классе PizzaRecipeAdapter создаем ArrayList
    // 8 Создаем коснструктора PizzaRecipeAdapter для инцализицц ArrayList;
    //9 затем в методе onBindViewHolder
    //10 возврошаем pizzaRecipeItems.size() в методе getItemCount
    //2

    // 7

    ArrayList<PizzaRecipeItem> pizzaRecipeItems;
    Context context;
    //8

    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems, Context context) {
        this.pizzaRecipeItems = pizzaRecipeItems;
        this.context = context;
    }

    //1
    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;
        //public TextView recipe;

        public PizzaRecipeViewHolder(@NonNull View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionImageView);
            //  recipe = itemView.findViewById(R.id.recipeTextView);
        }


        @Override
        public void onClick(View view) {
            PizzaRecipeItem pizzaRecipeItem=pizzaRecipeItems.get(getAdapterPosition()); // на каждый Item я вытаскивыю из ArrayList именно те данные которые нужно

            Intent intent = new Intent(context,RecipeActivity.class);
            intent.putExtra("image",pizzaRecipeItem.getImageResource());
            intent.putExtra("title",pizzaRecipeItem.getTitle());
            intent.putExtra("description",pizzaRecipeItem.getDescription());
            intent.putExtra("recipe",pizzaRecipeItem.getRecipe());


            context.startActivity(intent);

        }
    }


    @NonNull
    @Override
    public PizzaRecipeAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //4
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pizza_recipe_item,
                viewGroup, false);

        //5
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);

        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);
        holder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageResource());
        holder.title.setText(pizzaRecipeItem.getTitle());
        holder.description.setText(pizzaRecipeItem.getDescription());
        //   holder.recipe.setText(pizzaRecipeItem.getRecipe());
    }


    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }

}
