package uz.javokhir_apps.learning_english;

import androidx.annotation.NonNull;

public class Word {
    private String name;
    private String translation;

    public Word(String name, String translation) {
        this.name = name;
        this.translation = translation;
    }

    public String getWord() {
        return name;
    }

    public void setWord(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return translation;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public void setDefinition(String translation) {
        this.translation = translation;

    }
}

