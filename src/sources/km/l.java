package km;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f38232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f38233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f38234f;

    public l(String str, String str2, String str3, r backgroundColorToken) {
        r leftColorToken = r.OnSurface;
        r rightColorToken = r.OnSurfaceVariant;
        kotlin.jvm.internal.m.f(backgroundColorToken, "backgroundColorToken");
        kotlin.jvm.internal.m.f(leftColorToken, "leftColorToken");
        kotlin.jvm.internal.m.f(rightColorToken, "rightColorToken");
        this.f38229a = str;
        this.f38230b = str2;
        this.f38231c = str3;
        this.f38232d = backgroundColorToken;
        this.f38233e = leftColorToken;
        this.f38234f = rightColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f38229a, lVar.f38229a) && kotlin.jvm.internal.m.a(this.f38230b, lVar.f38230b) && kotlin.jvm.internal.m.a(this.f38231c, lVar.f38231c) && this.f38232d == lVar.f38232d && this.f38233e == lVar.f38233e && this.f38234f == lVar.f38234f;
    }

    public final int hashCode() {
        int iD = defpackage.e.d(this.f38229a.hashCode() * 31, 31, this.f38230b);
        String str = this.f38231c;
        return this.f38234f.hashCode() + ((this.f38233e.hashCode() + ((this.f38232d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("LeftRightCellData(leftText=", this.f38229a, ", rightText=", this.f38230b, ", audioKey=");
        sbS.append(this.f38231c);
        sbS.append(", backgroundColorToken=");
        sbS.append(this.f38232d);
        sbS.append(", leftColorToken=");
        sbS.append(this.f38233e);
        sbS.append(", rightColorToken=");
        sbS.append(this.f38234f);
        sbS.append(")");
        return sbS.toString();
    }
}
