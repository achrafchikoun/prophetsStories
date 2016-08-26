package com.example.ultrapc.prophetsstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Story> Stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        StroriesAdapter rva = new StroriesAdapter(Stories);
        recyclerView.setAdapter(rva);
    }

    private void initializeData(){
        Stories = new ArrayList<>();
        String[] prophets = getResources().getStringArray(R.array.prophets);
        for(int i =0 ; i < prophets.length ; i++){
            Stories.add(new Story(prophets[i], "Marrakech"));
        }
    }

    public class StroriesAdapter extends RecyclerView.Adapter<StroriesAdapter.StroyViewHolder>{

        List<Story> storiesList;

        StroriesAdapter(List<Story> stories){
            storiesList = stories;
        }

        @Override
        public StroyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
            StroyViewHolder pvh = new StroyViewHolder(v);
            return pvh;
        }

        @Override
        public void onBindViewHolder(StroyViewHolder holder, int position) {
            holder.storyTitle.setText(storiesList.get(position).getStroyTitle());
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

        @Override
        public int getItemCount() {
            return storiesList.size();
        }

        public class StroyViewHolder extends RecyclerView.ViewHolder {

            CardView cv;
            TextView storyTitle;

            StroyViewHolder(View itemView) {
                super(itemView);
                cv = (CardView)itemView.findViewById(R.id.cv);
                storyTitle = (TextView)itemView.findViewById(R.id.txt_story_title);
            }
        }

    }
}
