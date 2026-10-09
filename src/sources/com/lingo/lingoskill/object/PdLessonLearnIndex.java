package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonLearnIndex {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21964id;
    private int index;

    public PdLessonLearnIndex(String str, int i11) {
        this.f21964id = str;
        this.index = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PdLessonLearnIndex) {
            return ((PdLessonLearnIndex) obj).f21964id.equals(this.f21964id);
        }
        return false;
    }

    public String getId() {
        return this.f21964id;
    }

    public int getIndex() {
        return this.index;
    }

    public void setId(String str) {
        this.f21964id = str;
    }

    public void setIndex(int i11) {
        this.index = i11;
    }

    public PdLessonLearnIndex() {
    }
}
