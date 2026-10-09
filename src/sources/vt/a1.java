package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54178d;

    public a1(String language, float f5, int i11, int i12) {
        kotlin.jvm.internal.m.f(language, "language");
        this.f54175a = language;
        this.f54176b = f5;
        this.f54177c = i11;
        this.f54178d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f54175a, a1Var.f54175a) && Float.compare(this.f54176b, a1Var.f54176b) == 0 && this.f54177c == a1Var.f54177c && this.f54178d == a1Var.f54178d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54178d) + defpackage.e.b(this.f54177c, defpackage.e.a(this.f54175a.hashCode() * 31, this.f54176b, 31), 31);
    }

    public final String toString() {
        return "SkillMasteryServerRecord(language=" + this.f54175a + ", progress=" + this.f54176b + ", wordCount=" + this.f54177c + ", sentenceCount=" + this.f54178d + ")";
    }
}
