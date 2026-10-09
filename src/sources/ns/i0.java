package ns;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class i0 {
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43986c;

    public /* synthetic */ i0(int i11, String str, String str2, String str3) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, g0.f43974a.getDescriptor());
            throw null;
        }
        this.f43984a = str;
        this.f43985b = str2;
        this.f43986c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.m.a(this.f43984a, i0Var.f43984a) && kotlin.jvm.internal.m.a(this.f43985b, i0Var.f43985b) && kotlin.jvm.internal.m.a(this.f43986c, i0Var.f43986c);
    }

    public final int hashCode() {
        return this.f43986c.hashCode() + defpackage.e.d(this.f43984a.hashCode() * 31, 31, this.f43985b);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.s("CourseMistakeExplainMeta(uiLanguage=", this.f43984a, ", targetLanguage=", this.f43985b, ", questionType="), this.f43986c, ")");
    }

    public i0(String str, String str2, String str3) {
        this.f43984a = str;
        this.f43985b = str2;
        this.f43986c = str3;
    }
}
