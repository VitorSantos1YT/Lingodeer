package ur;

import defpackage.e;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f53068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f53069g;

    public b(String str, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f53063a = str;
        this.f53064b = str2;
        this.f53065c = z11;
        this.f53066d = str3;
        this.f53067e = z12;
        this.f53068f = z13;
        this.f53069g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f53063a.equals(bVar.f53063a) && this.f53064b.equals(bVar.f53064b) && this.f53065c == bVar.f53065c && this.f53066d.equals(bVar.f53066d) && this.f53067e == bVar.f53067e && this.f53068f == bVar.f53068f && this.f53069g == bVar.f53069g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53069g) + e.e(e.e(e.d(e.e(e.d(this.f53063a.hashCode() * 31, 31, this.f53064b), 31, this.f53065c), 31, this.f53066d), 31, this.f53067e), 961, this.f53068f);
    }

    public final String toString() {
        StringBuilder sbS = e.s("GlobalUserProperty(keyLanguageCode=", this.f53063a, ", locateLanguageCode=", this.f53064b, ", isLearnFluent=");
        sbS.append(this.f53065c);
        sbS.append(", uid=");
        sbS.append(this.f53066d);
        sbS.append(", isCoffeeUser=");
        ep.a.B(", hasReadBillingPage=", ", initLanguage=, isMultilingual=", sbS, this.f53067e, this.f53068f);
        return p0.p(sbS, this.f53069g, ")");
    }
}
