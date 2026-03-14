package Model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note){
        if (note != null){
            notes.add(note);
        }
    }

    public void removeNote(Note note){
        notes.remove(note);
    }

    public List<Note> getNotes(){
        return new ArrayList<>(notes);
    }
}


/*
package Model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }
}
*/