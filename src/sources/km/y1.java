package km;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38323e;

    public y1(String topText, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.m.f(topText, "topText");
        this.f38319a = topText;
        this.f38320b = str;
        this.f38321c = str2;
        this.f38322d = str3;
        this.f38323e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.m.a(this.f38319a, y1Var.f38319a) && kotlin.jvm.internal.m.a(this.f38320b, y1Var.f38320b) && kotlin.jvm.internal.m.a(this.f38321c, y1Var.f38321c) && kotlin.jvm.internal.m.a(this.f38322d, y1Var.f38322d) && kotlin.jvm.internal.m.a(this.f38323e, y1Var.f38323e);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f38319a.hashCode() * 31, 31, this.f38320b), 31, this.f38321c);
        String str = this.f38322d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f38323e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("TripleColumnData(topText=", this.f38319a, ", middleText=", this.f38320b, ", bottomText=");
        com.google.android.material.datepicker.d.w(sbS, this.f38321c, ", middleAudioKey=", this.f38322d, ", bottomAudioKey=");
        return ep.a.k(sbS, this.f38323e, ")");
    }
}
