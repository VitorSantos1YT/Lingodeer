package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KanjiFav {
    private int fav;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21933id;
    private Long time;

    public KanjiFav(String str, Long l9, int i11) {
        this.f21933id = str;
        this.time = l9;
        this.fav = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KanjiFav) {
            return ((KanjiFav) obj).f21933id.equals(this.f21933id);
        }
        return false;
    }

    public int getFav() {
        return this.fav;
    }

    public String getId() {
        return this.f21933id;
    }

    public Long getTime() {
        return this.time;
    }

    public void setFav(int i11) {
        this.fav = i11;
    }

    public void setId(String str) {
        this.f21933id = str;
    }

    public void setTime(Long l9) {
        this.time = l9;
    }

    public KanjiFav() {
    }
}
