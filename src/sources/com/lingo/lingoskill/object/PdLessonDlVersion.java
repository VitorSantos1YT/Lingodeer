package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonDlVersion {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21962id;
    private Long version;

    public PdLessonDlVersion(String str, Long l9) {
        this.f21962id = str;
        this.version = l9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PdLessonDlVersion) {
            return ((PdLessonDlVersion) obj).f21962id.equals(this.f21962id);
        }
        return false;
    }

    public String getId() {
        return this.f21962id;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setId(String str) {
        this.f21962id = str;
    }

    public void setVersion(Long l9) {
        this.version = l9;
    }

    public PdLessonDlVersion() {
    }
}
