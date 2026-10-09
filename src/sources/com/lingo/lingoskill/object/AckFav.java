package com.lingo.lingoskill.object;

import com.google.firebase.database.Exclude;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AckFav {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21917id;
    private int isFav;
    private long time;

    public AckFav(String str, long j11, int i11) {
        this.f21917id = str;
        this.time = j11;
        this.isFav = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AckFav) {
            return this.f21917id.equals(((AckFav) obj).f21917id);
        }
        return false;
    }

    public String getId() {
        return this.f21917id;
    }

    public int getIsFav() {
        return this.isFav;
    }

    public long getTime() {
        return this.time;
    }

    public void setId(String str) {
        this.f21917id = str;
    }

    public void setIsFav(int i11) {
        this.isFav = i11;
    }

    public void setTime(long j11) {
        this.time = j11;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("time", Long.valueOf(this.time));
        map.put("isFav", Integer.valueOf(this.isFav));
        return map;
    }

    public AckFav() {
        this.time = 0L;
    }
}
