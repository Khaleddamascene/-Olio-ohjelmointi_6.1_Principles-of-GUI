package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import Model.Note;
import Model.Notebook;

public class NoteController {

    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private ListView<Note> notesListView;
    @FXML private Button addButton;
    @FXML private Button deleteButton;

    private Notebook notebook = new Notebook();
    private ObservableList<Note> notes = FXCollections.observableArrayList();

    // @FXML on fields makes initialize() run automatically
    @FXML
    private void initialize() {  // ← No Initializable needed!
        notesListView.setItems(notes);
        notesListView.getSelectionModel().selectedItemProperty().addListener((obs, old, newValue) -> {
            deleteButton.setDisable(newValue == null);
        });
    }

    @FXML
    private void handleAddNote() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isEmpty()) title = "Untitled";
        if (content.isEmpty()) content = "(no content)";

        Note note = new Note(title, content);
        notebook.addNote(note);
        notes.add(note);
        titleField.clear();
        contentArea.clear();
    }

    @FXML
    private void handleDeleteNote() {
        Note selected = notesListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            notebook.removeNote(selected);
            notes.remove(selected);
            notesListView.getSelectionModel().clearSelection();
        }
    }
}
