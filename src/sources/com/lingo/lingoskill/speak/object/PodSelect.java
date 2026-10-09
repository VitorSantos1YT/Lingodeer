package com.lingo.lingoskill.speak.object;

import java.util.List;
import op.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PodSelect<T extends a> {
    private String answer;
    private T answerWord;
    private List<T> options;
    private T title;
    private PodTrans trans;

    public String getAnswer() {
        return this.answer;
    }

    public T getAnswerWord() {
        return this.answerWord;
    }

    public List<T> getOptions() {
        return this.options;
    }

    public T getTitle() {
        return this.title;
    }

    public PodTrans getTrans() {
        return this.trans;
    }

    public void setAnswer(String str) {
        this.answer = str;
    }

    public void setAnswerWord(T t6) {
        this.answerWord = t6;
    }

    public void setOptions(List<T> list) {
        this.options = list;
    }

    public void setTitle(T t6) {
        this.title = t6;
    }

    public void setTrans(PodTrans podTrans) {
        this.trans = podTrans;
    }
}
