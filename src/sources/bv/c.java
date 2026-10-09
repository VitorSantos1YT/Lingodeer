package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6283d;

    public /* synthetic */ c(int i11, String str, String str2, String str3, String str4) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, a.f6278a.getDescriptor());
            throw null;
        }
        this.f6280a = str;
        this.f6281b = str2;
        this.f6282c = str3;
        this.f6283d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f6280a, cVar.f6280a) && kotlin.jvm.internal.m.a(this.f6281b, cVar.f6281b) && kotlin.jvm.internal.m.a(this.f6282c, cVar.f6282c) && kotlin.jvm.internal.m.a(this.f6283d, cVar.f6283d);
    }

    public final int hashCode() {
        return this.f6283d.hashCode() + defpackage.e.d(defpackage.e.d(this.f6280a.hashCode() * 31, 31, this.f6281b), 31, this.f6282c);
    }

    public final String toString() {
        return defpackage.e.p(defpackage.e.s("AppParams(timestamp=", this.f6280a, ", userId=", this.f6281b, ", applicationId="), this.f6282c, ", sig=", this.f6283d, ")");
    }
}
