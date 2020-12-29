package android.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView titleView = findViewById(R.id.titleTxt);
        TextView recipe = findViewById(R.id.recipeTxt);

        Intent intent = getIntent();
        if (intent != null) {
          titleView.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));

        }
    }
}
