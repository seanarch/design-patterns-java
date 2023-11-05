package memento;

public class EditorState {
    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

}
