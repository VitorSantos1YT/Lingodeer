package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38708f;

    public a1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f38703a = str;
        this.f38704b = str2;
        this.f38705c = str3;
        this.f38706d = str4;
        this.f38707e = str5;
        this.f38708f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f38703a, a1Var.f38703a) && kotlin.jvm.internal.m.a(this.f38704b, a1Var.f38704b) && kotlin.jvm.internal.m.a(this.f38705c, a1Var.f38705c) && kotlin.jvm.internal.m.a(this.f38706d, a1Var.f38706d) && kotlin.jvm.internal.m.a(this.f38707e, a1Var.f38707e) && kotlin.jvm.internal.m.a(this.f38708f, a1Var.f38708f);
    }

    public final int hashCode() {
        return this.f38708f.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.f38703a.hashCode() * 31, 31, this.f38704b), 31, this.f38705c), 31, this.f38706d), 31, this.f38707e);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("YoonFormulaData(baseKana=", this.f38703a, ", baseRomaji=", this.f38704b, ", smallKana=");
        com.google.android.material.datepicker.d.w(sbS, this.f38705c, ", smallRomaji=", this.f38706d, ", resultKana=");
        return defpackage.e.p(sbS, this.f38707e, ", resultRomaji=", this.f38708f, ")");
    }
}
