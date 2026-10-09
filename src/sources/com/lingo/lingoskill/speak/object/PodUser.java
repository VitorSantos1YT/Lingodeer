package com.lingo.lingoskill.speak.object;

import com.google.firebase.database.Exclude;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PodUser {
    public Map<String, Boolean> like_list = new HashMap();
    private int like_num;
    private String nickname;
    private String picurl;
    private long timestamp;
    private String uid;
    private String videourl;

    public boolean equals(Object obj) {
        if (obj instanceof PodUser) {
            return getUid().equals(((PodUser) obj).getUid());
        }
        return false;
    }

    public Map<String, Boolean> getLike_list() {
        return this.like_list;
    }

    public int getLike_num() {
        return this.like_num;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getUid() {
        return this.uid;
    }

    public String getVideourl() {
        return this.videourl;
    }

    public void setLike_list(Map<String, Boolean> map) {
        this.like_list = map;
    }

    public void setLike_num(int i11) {
        this.like_num = i11;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPicurl(String str) {
        this.picurl = str;
    }

    public void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setVideourl(String str) {
        this.videourl = str;
    }

    @Exclude
    public Map<String, Object> toLatestMap() {
        HashMap map = new HashMap();
        map.put("uid", this.uid);
        map.put("timestamp", Long.valueOf(this.timestamp));
        return map;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("uid", this.uid);
        map.put("like_list", this.like_list);
        map.put("like_num", Integer.valueOf(this.like_num));
        map.put("timestamp", Long.valueOf(this.timestamp));
        map.put("videourl", this.videourl);
        return map;
    }

    @Exclude
    public Map<String, Object> toTopMap() {
        HashMap map = new HashMap();
        map.put("uid", this.uid);
        map.put("like_num", Integer.valueOf(this.like_num));
        return map;
    }
}
