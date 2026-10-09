package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class o {
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f6334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6336f;

    public /* synthetic */ o(int i11, double d5, String str, int i12, f0 f0Var, String str2, String str3) {
        if (63 != (i11 & 63)) {
            d1.k(i11, 63, m.f6329a.getDescriptor());
            throw null;
        }
        this.f6331a = d5;
        this.f6332b = str;
        this.f6333c = i12;
        this.f6334d = f0Var;
        this.f6335e = str2;
        this.f6336f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Double.compare(this.f6331a, oVar.f6331a) == 0 && kotlin.jvm.internal.m.a(this.f6332b, oVar.f6332b) && this.f6333c == oVar.f6333c && kotlin.jvm.internal.m.a(this.f6334d, oVar.f6334d) && kotlin.jvm.internal.m.a(this.f6335e, oVar.f6335e) && kotlin.jvm.internal.m.a(this.f6336f, oVar.f6336f);
    }

    public final int hashCode() {
        return this.f6336f.hashCode() + defpackage.e.d((this.f6334d.hashCode() + defpackage.e.b(this.f6333c, defpackage.e.d(Double.hashCode(this.f6331a) * 31, 31, this.f6332b), 31)) * 31, 31, this.f6335e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhonemeResult(pronunciation=");
        sb2.append(this.f6331a);
        sb2.append(", tone_index=");
        sb2.append(this.f6332b);
        sb2.append(", category=");
        sb2.append(this.f6333c);
        sb2.append(", span=");
        sb2.append(this.f6334d);
        com.google.android.material.datepicker.d.w(sb2, ", phone=", this.f6335e, ", phoneme=", this.f6336f);
        sb2.append(")");
        return sb2.toString();
    }
}
