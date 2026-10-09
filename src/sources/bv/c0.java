package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class c0 {
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6290g;

    public /* synthetic */ c0(int i11, String str, int i12, String str2, int i13, String str3, int i14, int i15) {
        if (127 != (i11 & 127)) {
            d1.k(i11, 127, a0.f6279a.getDescriptor());
            throw null;
        }
        this.f6284a = str;
        this.f6285b = i12;
        this.f6286c = str2;
        this.f6287d = i13;
        this.f6288e = str3;
        this.f6289f = i14;
        this.f6290g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f6284a, c0Var.f6284a) && this.f6285b == c0Var.f6285b && kotlin.jvm.internal.m.a(this.f6286c, c0Var.f6286c) && this.f6287d == c0Var.f6287d && kotlin.jvm.internal.m.a(this.f6288e, c0Var.f6288e) && this.f6289f == c0Var.f6289f && this.f6290g == c0Var.f6290g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6290g) + defpackage.e.b(this.f6289f, defpackage.e.d(defpackage.e.b(this.f6287d, defpackage.e.d(defpackage.e.b(this.f6285b, this.f6284a.hashCode() * 31, 31), 31, this.f6286c), 31), 31, this.f6288e), 31);
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f6285b, "SubDetails(shengMu=", this.f6284a, ", shengMuScore=", ", yunMu=");
        sbQ.append(this.f6286c);
        sbQ.append(", yunMuScore=");
        sbQ.append(this.f6287d);
        sbQ.append(", tone=");
        sbQ.append(this.f6288e);
        sbQ.append(", toneScore=");
        sbQ.append(this.f6289f);
        sbQ.append(", pronunciation=");
        return hh.p0.i(this.f6290g, ")", sbQ);
    }

    public c0(String shengMu, int i11, String yunMu, int i12, String tone, int i13, int i14) {
        kotlin.jvm.internal.m.f(shengMu, "shengMu");
        kotlin.jvm.internal.m.f(yunMu, "yunMu");
        kotlin.jvm.internal.m.f(tone, "tone");
        this.f6284a = shengMu;
        this.f6285b = i11;
        this.f6286c = yunMu;
        this.f6287d = i12;
        this.f6288e = tone;
        this.f6289f = i13;
        this.f6290g = i14;
    }
}
