package android.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.FileUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView.Adapter adapter; // роль адапьара ?
    RecyclerView.LayoutManager layoutManager; //  роль лаяут манаджера ?


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // создаем ArrayList и заполняем его

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_1,
                Utils.PIZZA1_TITLE, Utils.PIZZA1_DESCRIPTION, Utils.PIZZA1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_2,
                Utils.PIZZA2_TITLE, Utils.PIZZA2_DESCRIPTION, Utils.PIZZA2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_3,
                Utils.PIZZA3_TITLE, Utils.PIZZA3_DESCRIPTION, Utils.PIZZA3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_4,
                Utils.PIZZA4_TITLE, Utils.PIZZA4_DESCRIPTION, Utils.PIZZA4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_5,
                Utils.PIZZA5_TITLE, Utils.PIZZA5_DESCRIPTION, Utils.PIZZA5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_6,
                Utils.PIZZA6_TITLE, Utils.PIZZA6_DESCRIPTION, Utils.PIZZA6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_7,
                Utils.PIZZA7_TITLE, Utils.PIZZA7_DESCRIPTION, Utils.PIZZA7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_8,
                Utils.PIZZA8_TITLE, Utils.PIZZA8_DESCRIPTION, Utils.PIZZA8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_9,
                Utils.PIZZA9_TITLE, Utils.PIZZA9_DESCRIPTION, Utils.PIZZA9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_10,
                Utils.PIZZA10_TITLE, Utils.PIZZA10_DESCRIPTION, Utils.PIZZA10_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_11,
                Utils.PIZZA11_TITLE, Utils.PIZZA11_DESCRIPTION, Utils.PIZZA11_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.
                pizza_12,
                Utils.PIZZA12_TITLE, Utils.PIZZA12_DESCRIPTION, Utils.PIZZA12_RECIPE));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
