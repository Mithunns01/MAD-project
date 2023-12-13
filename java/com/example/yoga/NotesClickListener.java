package com.example.yoga;

import androidx.cardview.widget.CardView;

import com.example.yoga.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
