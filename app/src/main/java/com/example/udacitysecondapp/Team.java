package com.example.udacitysecondapp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Team {
    private AttachedButtonAndGui goals;
    private AttachedButtonAndGui fouls;
    private AttachedButtonAndGui corners;
    public Team(Button goalButton,TextView goalTextView,
                Button foulButton, TextView foulTextView,
                Button cornerButton, TextView cornerTextView) {
        goals=new AttachedButtonAndGui(goalButton,goalTextView);
        fouls=new AttachedButtonAndGui(foulButton,foulTextView);
        corners=new AttachedButtonAndGui(cornerButton,cornerTextView);

    }
    class AttachedButtonAndGui{
        private Button button;
        private TextView textView;

        public AttachedButtonAndGui(Button button, final TextView textView) {
            this.button = button;
            this.textView = textView;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText((Integer.parseInt(textView.getText().toString())+1)+"");
                }
            });
        }
    }
}
