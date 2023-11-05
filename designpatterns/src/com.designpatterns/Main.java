package com.designpatterns;

import memento.Editor;
import memento.EditorState;
import memento.History;

public class Main {
    public static void main(String[] args) {


        var editor = new Editor();
        var history = new History();
        var editorstate = new EditorState("");

        editor.setContent("a");
        history.push(editorstate.createState());

        editor.setContent("b");
        history.push(editorstate.createState());

        editor.setContent("c");
        editorstate.restore(history.pop());


        System.out.println(editor.getContent());
    }

    public  static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

 

 