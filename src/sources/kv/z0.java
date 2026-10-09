package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38842e;

    public z0(String hiragana, String katakana, String romaji, String str, boolean z11) {
        kotlin.jvm.internal.m.f(hiragana, "hiragana");
        kotlin.jvm.internal.m.f(katakana, "katakana");
        kotlin.jvm.internal.m.f(romaji, "romaji");
        this.f38838a = hiragana;
        this.f38839b = katakana;
        this.f38840c = romaji;
        this.f38841d = str;
        this.f38842e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.m.a(this.f38838a, z0Var.f38838a) && kotlin.jvm.internal.m.a(this.f38839b, z0Var.f38839b) && kotlin.jvm.internal.m.a(this.f38840c, z0Var.f38840c) && kotlin.jvm.internal.m.a(this.f38841d, z0Var.f38841d) && this.f38842e == z0Var.f38842e;
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f38838a.hashCode() * 31, 31, this.f38839b), 31, this.f38840c);
        String str = this.f38841d;
        return Boolean.hashCode(this.f38842e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("KanaCellData(hiragana=", this.f38838a, ", katakana=", this.f38839b, ", romaji=");
        com.google.android.material.datepicker.d.w(sbS, this.f38840c, ", audioKey=", this.f38841d, ", isBlank=");
        return hh.p0.p(sbS, this.f38842e, ")");
    }
}
