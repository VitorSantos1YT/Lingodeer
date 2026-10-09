package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_000 {
    private String Explanation;
    private long Id;
    private long SentenceId;

    public Model_Sentence_000(long j11, long j12, String str) {
        this.Id = j11;
        this.SentenceId = j12;
        this.Explanation = str;
    }

    public String getExplanation() {
        return this.Explanation;
    }

    public long getId() {
        return this.Id;
    }

    public long getSentenceId() {
        return this.SentenceId;
    }

    public void setExplanation(String str) {
        this.Explanation = str;
    }

    public void setId(long j11) {
        this.Id = j11;
    }

    public void setSentenceId(long j11) {
        this.SentenceId = j11;
    }

    public Model_Sentence_000() {
    }
}
