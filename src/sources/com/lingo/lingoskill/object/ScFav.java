package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScFav {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private long f21967id;
    private int isFav;
    private int score;

    public ScFav(long j11, int i11, int i12) {
        this.f21967id = j11;
        this.score = i11;
        this.isFav = i12;
    }

    public long getId() {
        return this.f21967id;
    }

    public int getIsFav() {
        return this.isFav;
    }

    public int getScore() {
        return this.score;
    }

    public void setId(long j11) {
        this.f21967id = j11;
    }

    public void setIsFav(int i11) {
        this.isFav = i11;
    }

    public void setScore(int i11) {
        this.score = i11;
    }

    public ScFav() {
        this.score = -1;
    }
}
