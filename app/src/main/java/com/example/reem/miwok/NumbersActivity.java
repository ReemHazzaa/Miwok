package com.example.reem.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One","Lutti",R.drawable.number_one));
        words.add(new Word("Two","Otiiko",R.drawable.number_two));
        words.add(new Word("Tree","Tolookosa",R.drawable.number_three));
        words.add(new Word("Four","Oyyisa",R.drawable.number_four));
        words.add(new Word("Five","Massokka",R.drawable.number_five));
        words.add(new Word("Six","Temmokka",R.drawable.number_six));
        words.add(new Word("Seven","Kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight","Kawinta",R.drawable.number_eight));
        words.add(new Word("Nine","Wo'e",R.drawable.number_nine));
        words.add(new Word("Ten","Na'aacha",R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.numbersColor);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
