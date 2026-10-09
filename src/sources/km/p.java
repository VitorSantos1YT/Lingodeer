package km;

import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f38260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f38261e;

    public p(String topText, String bottomText, String str, r topColorToken, r bottomColorToken) {
        kotlin.jvm.internal.m.f(topText, "topText");
        kotlin.jvm.internal.m.f(bottomText, "bottomText");
        kotlin.jvm.internal.m.f(topColorToken, "topColorToken");
        kotlin.jvm.internal.m.f(bottomColorToken, "bottomColorToken");
        this.f38257a = topText;
        this.f38258b = bottomText;
        this.f38259c = str;
        this.f38260d = topColorToken;
        this.f38261e = bottomColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f38257a, pVar.f38257a) && kotlin.jvm.internal.m.a(this.f38258b, pVar.f38258b) && kotlin.jvm.internal.m.a(this.f38259c, pVar.f38259c) && this.f38260d == pVar.f38260d && this.f38261e == pVar.f38261e;
    }

    public final int hashCode() {
        int iD = defpackage.e.d(this.f38257a.hashCode() * 31, 31, this.f38258b);
        String str = this.f38259c;
        return this.f38261e.hashCode() + ((this.f38260d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("PairCellData(topText=", this.f38257a, ", bottomText=", this.f38258b, OYAvlbfUyD.XEZZcvETxfJ);
        sbS.append(this.f38259c);
        sbS.append(", topColorToken=");
        sbS.append(this.f38260d);
        sbS.append(", bottomColorToken=");
        sbS.append(this.f38261e);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ p(String str, String str2, String str3, r rVar, r rVar2, int i11) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? r.OnSurface : rVar, (i11 & 16) != 0 ? r.OnSurfaceVariant : rVar2);
    }
}
