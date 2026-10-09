package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RankUser {
    private String uid;
    private int weekSeconds;

    public RankUser(String str, int i11) {
        this.uid = str;
        this.weekSeconds = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RankUser) {
            return this.uid.equals(((RankUser) obj).getUid());
        }
        return false;
    }

    public String getUid() {
        return this.uid;
    }

    public int getWeekSeconds() {
        return this.weekSeconds;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setWeekSeconds(int i11) {
        this.weekSeconds = i11;
    }
}
