package wu;

import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55384e;

    public c0(String openId, String nickName, String from, String str, String str2) {
        kotlin.jvm.internal.m.f(openId, "openId");
        kotlin.jvm.internal.m.f(nickName, "nickName");
        kotlin.jvm.internal.m.f(from, "from");
        this.f55380a = openId;
        this.f55381b = nickName;
        this.f55382c = from;
        this.f55383d = str;
        this.f55384e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f55380a, c0Var.f55380a) && kotlin.jvm.internal.m.a(this.f55381b, c0Var.f55381b) && kotlin.jvm.internal.m.a(this.f55382c, c0Var.f55382c) && kotlin.jvm.internal.m.a(this.f55383d, c0Var.f55383d) && kotlin.jvm.internal.m.a(this.f55384e, c0Var.f55384e);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f55380a.hashCode() * 31, 31, this.f55381b), 31, this.f55382c);
        String str = this.f55383d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55384e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("OpenIdInfo(openId=", this.f55380a, ", nickName=", this.f55381b, ", from=");
        com.google.android.material.datepicker.d.w(sbS, this.f55382c, nuRcCS.kTyTsjrEFAwF, this.f55383d, ", avatar=");
        return ep.a.k(sbS, this.f55384e, ")");
    }
}
