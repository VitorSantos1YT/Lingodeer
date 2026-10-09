package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55477e;

    public y(String openId, String nickName, String from, String str, String str2) {
        kotlin.jvm.internal.m.f(openId, "openId");
        kotlin.jvm.internal.m.f(nickName, "nickName");
        kotlin.jvm.internal.m.f(from, "from");
        this.f55473a = openId;
        this.f55474b = nickName;
        this.f55475c = from;
        this.f55476d = str;
        this.f55477e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.f55473a, yVar.f55473a) && kotlin.jvm.internal.m.a(this.f55474b, yVar.f55474b) && kotlin.jvm.internal.m.a(this.f55475c, yVar.f55475c) && kotlin.jvm.internal.m.a(this.f55476d, yVar.f55476d) && kotlin.jvm.internal.m.a(this.f55477e, yVar.f55477e);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f55473a.hashCode() * 31, 31, this.f55474b), 31, this.f55475c);
        String str = this.f55476d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55477e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("OpenIdLogin(openId=", this.f55473a, ", nickName=", this.f55474b, ", from=");
        com.google.android.material.datepicker.d.w(sbS, this.f55475c, ", email=", this.f55476d, ", avatar=");
        return ep.a.k(sbS, this.f55477e, ")");
    }
}
