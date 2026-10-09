package kr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f38567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38570g;

    public r0(List sentences, List list, int i11, float f5, boolean z11, int i12, boolean z12) {
        kotlin.jvm.internal.m.f(sentences, "sentences");
        this.f38564a = sentences;
        this.f38565b = list;
        this.f38566c = i11;
        this.f38567d = f5;
        this.f38568e = z11;
        this.f38569f = i12;
        this.f38570g = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f38564a, r0Var.f38564a) && kotlin.jvm.internal.m.a(this.f38565b, r0Var.f38565b) && this.f38566c == r0Var.f38566c && Float.compare(this.f38567d, r0Var.f38567d) == 0 && this.f38568e == r0Var.f38568e && this.f38569f == r0Var.f38569f && this.f38570g == r0Var.f38570g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38570g) + defpackage.e.b(this.f38569f, defpackage.e.e(defpackage.e.a(defpackage.e.b(this.f38566c, hh.p0.b(this.f38564a.hashCode() * 31, 31, this.f38565b), 31), this.f38567d, 31), 31, this.f38568e), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(sentences=");
        sb2.append(this.f38564a);
        sb2.append(", picPaths=");
        sb2.append(this.f38565b);
        sb2.append(", currentSentenceIndex=");
        sb2.append(this.f38566c);
        sb2.append(", progress=");
        sb2.append(this.f38567d);
        sb2.append(", isPlaying=");
        sb2.append(this.f38568e);
        sb2.append(", xp=");
        sb2.append(this.f38569f);
        sb2.append(", isUnLoginUser=");
        return hh.p0.p(sb2, this.f38570g, ")");
    }
}
