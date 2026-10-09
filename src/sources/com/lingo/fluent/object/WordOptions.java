package com.lingo.fluent.object;

import com.lingo.lingoskill.object.PdWord;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordOptions {
    public static final int $stable = 8;
    private ArrayList<PdWord> options;
    private PdWord word;

    public WordOptions(PdWord word, ArrayList<PdWord> options) {
        m.f(word, "word");
        m.f(options, "options");
        this.word = word;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WordOptions copy$default(WordOptions wordOptions, PdWord pdWord, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pdWord = wordOptions.word;
        }
        if ((i11 & 2) != 0) {
            arrayList = wordOptions.options;
        }
        return wordOptions.copy(pdWord, arrayList);
    }

    public final PdWord component1() {
        return this.word;
    }

    public final ArrayList<PdWord> component2() {
        return this.options;
    }

    public final WordOptions copy(PdWord word, ArrayList<PdWord> options) {
        m.f(word, "word");
        m.f(options, "options");
        return new WordOptions(word, options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordOptions)) {
            return false;
        }
        WordOptions wordOptions = (WordOptions) obj;
        return m.a(this.word, wordOptions.word) && m.a(this.options, wordOptions.options);
    }

    public final ArrayList<PdWord> getOptions() {
        return this.options;
    }

    public final PdWord getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.options.hashCode() + (this.word.hashCode() * 31);
    }

    public final void setOptions(ArrayList<PdWord> arrayList) {
        m.f(arrayList, "<set-?>");
        this.options = arrayList;
    }

    public final void setWord(PdWord pdWord) {
        m.f(pdWord, "<set-?>");
        this.word = pdWord;
    }

    public String toString() {
        return "WordOptions(word=" + this.word + ", options=" + this.options + ")";
    }
}
