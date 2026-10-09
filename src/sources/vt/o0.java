package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54269c;

    public o0(String str, String str2, long j11) {
        this.f54267a = str;
        this.f54268b = str2;
        this.f54269c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f54267a, o0Var.f54267a) && kotlin.jvm.internal.m.a(this.f54268b, o0Var.f54268b) && this.f54269c == o0Var.f54269c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54269c) + defpackage.e.d(this.f54267a.hashCode() * 31, 31, this.f54268b);
    }

    public final String toString() {
        return defpackage.e.i(this.f54269c, ")", defpackage.e.s("KnowledgeNoteIdParts(languageCode=", this.f54267a, ", noteTypeCode=", this.f54268b, ", elemId="));
    }
}
