package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class w {
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6373d;

    public /* synthetic */ w(int i11, String str, String str2, String str3, String str4) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, u.f6357a.getDescriptor());
            throw null;
        }
        this.f6370a = str;
        this.f6371b = str2;
        this.f6372c = str3;
        if ((i11 & 8) == 0) {
            this.f6373d = null;
        } else {
            this.f6373d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.m.a(this.f6370a, wVar.f6370a) && kotlin.jvm.internal.m.a(this.f6371b, wVar.f6371b) && kotlin.jvm.internal.m.a(this.f6372c, wVar.f6372c) && kotlin.jvm.internal.m.a(this.f6373d, wVar.f6373d);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f6370a.hashCode() * 31, 31, this.f6371b), 31, this.f6372c);
        String str = this.f6373d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.e.p(defpackage.e.s("RequestParams(coreType=", this.f6370a, ", refText=", this.f6371b, ", tokenId="), this.f6372c, ", refPinyin=", this.f6373d, ")");
    }
}
