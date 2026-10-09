package com.lingo.fluent.object;

import com.lingo.lingoskill.object.PdWord;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordSpellOption {
    public static final int $stable = 8;
    private List<? extends PdWord> answerCharList;
    private List<? extends PdWord> bodyCharList;
    private List<? extends PdWord> optionCharList;
    private PdWord word;

    public WordSpellOption(PdWord word, List<? extends PdWord> bodyCharList, List<? extends PdWord> optionCharList, List<? extends PdWord> answerCharList) {
        m.f(word, "word");
        m.f(bodyCharList, "bodyCharList");
        m.f(optionCharList, "optionCharList");
        m.f(answerCharList, "answerCharList");
        this.word = word;
        this.bodyCharList = bodyCharList;
        this.optionCharList = optionCharList;
        this.answerCharList = answerCharList;
    }

    public final List<PdWord> getAnswerCharList() {
        return this.answerCharList;
    }

    public final List<PdWord> getBodyCharList() {
        return this.bodyCharList;
    }

    public final List<PdWord> getOptionCharList() {
        return this.optionCharList;
    }

    public final PdWord getWord() {
        return this.word;
    }

    public final void setAnswerCharList(List<? extends PdWord> list) {
        m.f(list, "<set-?>");
        this.answerCharList = list;
    }

    public final void setBodyCharList(List<? extends PdWord> list) {
        m.f(list, "<set-?>");
        this.bodyCharList = list;
    }

    public final void setOptionCharList(List<? extends PdWord> list) {
        m.f(list, "<set-?>");
        this.optionCharList = list;
    }

    public final void setWord(PdWord pdWord) {
        m.f(pdWord, "<set-?>");
        this.word = pdWord;
    }
}
