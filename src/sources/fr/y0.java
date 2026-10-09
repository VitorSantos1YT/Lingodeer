package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27986e;

    public y0(String code, float f5, int i11, int i12, float f11) {
        kotlin.jvm.internal.m.f(code, "code");
        this.f27982a = code;
        this.f27983b = f5;
        this.f27984c = i11;
        this.f27985d = i12;
        this.f27986e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.m.a(this.f27982a, y0Var.f27982a) && Float.compare(this.f27983b, y0Var.f27983b) == 0 && this.f27984c == y0Var.f27984c && this.f27985d == y0Var.f27985d && Float.compare(this.f27986e, y0Var.f27986e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27986e) + defpackage.e.b(this.f27985d, defpackage.e.b(this.f27984c, defpackage.e.a(this.f27982a.hashCode() * 31, this.f27983b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageData(code=");
        sb2.append(this.f27982a);
        sb2.append(", progress=");
        sb2.append(this.f27983b);
        sb2.append(", wordCount=");
        ep.a.v(this.f27984c, this.f27985d, ", sentenceCount=", ", previousProgress=", sb2);
        return nv.p.h(this.f27986e, ")", sb2);
    }
}
