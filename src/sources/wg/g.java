package wg;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55132d;

    public g(String data, String str, String str2, String str3) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f55129a = data;
        this.f55130b = str;
        this.f55131c = str2;
        this.f55132d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f55129a, gVar.f55129a) && kotlin.jvm.internal.m.a(this.f55130b, gVar.f55130b) && kotlin.jvm.internal.m.a(this.f55131c, gVar.f55131c) && kotlin.jvm.internal.m.a(this.f55132d, gVar.f55132d);
    }

    public final int hashCode() {
        int iHashCode = this.f55129a.hashCode() * 31;
        String str = this.f55130b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 111607186) * 31;
        String str2 = this.f55131c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55132d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data(data=");
        sb2.append(this.f55129a);
        sb2.append(", baseUrl=");
        sb2.append(this.f55130b);
        sb2.append(", encoding=utf-8, mimeType=");
        sb2.append(this.f55131c);
        sb2.append(", historyUrl=");
        return p0.o(sb2, this.f55132d, ')');
    }
}
