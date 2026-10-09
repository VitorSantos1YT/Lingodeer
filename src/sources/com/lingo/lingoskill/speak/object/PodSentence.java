package com.lingo.lingoskill.speak.object;

import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import java.util.Collections;
import java.util.List;
import op.a;
import op.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PodSentence<T extends b, F extends a> {
    private float duration;
    private PodQuestion<F> questions;
    private long sid;
    private PodTrans trans;
    private List<T> words;
    private int speechScore = 0;
    private List<WordAccuracyScoreTimingResult> wordScores = Collections.EMPTY_LIST;

    public float getDuration() {
        return this.duration;
    }

    public PodQuestion<F> getQuestions() {
        return this.questions;
    }

    public long getSid() {
        return this.sid;
    }

    public int getSpeechScore() {
        return this.speechScore;
    }

    public PodTrans getTrans() {
        return this.trans;
    }

    public List<WordAccuracyScoreTimingResult> getWordScores() {
        return this.wordScores;
    }

    public List<T> getWords() {
        return this.words;
    }

    public void setDuration(float f5) {
        this.duration = f5;
    }

    public void setQuestions(PodQuestion<F> podQuestion) {
        this.questions = podQuestion;
    }

    public void setSid(long j11) {
        this.sid = j11;
    }

    public void setSpeechScore(int i11) {
        this.speechScore = i11;
    }

    public void setTrans(PodTrans podTrans) {
        this.trans = podTrans;
    }

    public void setWordScores(List<WordAccuracyScoreTimingResult> list) {
        this.wordScores = list;
    }

    public void setWords(List<T> list) {
        this.words = list;
    }
}
