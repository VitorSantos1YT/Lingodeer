package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScFavNew {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21968id;
    private int isFav;
    private int score;

    public ScFavNew(String str, int i11, int i12) {
        this.f21968id = str;
        this.score = i11;
        this.isFav = i12;
    }

    public String getId() {
        return this.f21968id;
    }

    public int getIsFav() {
        return this.isFav;
    }

    public int getScore() {
        return this.score;
    }

    public void setId(String str) {
        this.f21968id = str;
    }

    public void setIsFav(int i11) {
        this.isFav = i11;
    }

    public void setScore(int i11) {
        this.score = i11;
    }

    public ScFavNew() {
        this.score = -1;
    }
}
