package com.figitaki.androidsamples;

import android.app.ActionBar;
import android.app.ActionBar.LayoutParams;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;

public class SearchActivity  extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a progress bar to display while the list loads
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setLayoutParams(new ActionBar.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        progressBar.setIndeterminate(true);
        getListView().setEmptyView(progressBar);

        ViewGroup root = (ViewGroup)findViewById(android.R.id.content);
        root.addView(progressBar);

        String[] content = {"Cool Item", "Better Item", "hIpStEr ItEm", "LOUD ITEM!"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, content);

        getListView().setAdapter(adapter);
    }
}
