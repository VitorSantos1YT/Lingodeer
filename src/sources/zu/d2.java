package zu;

import aj.uZCn.evRpcb;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f59396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f59399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f59400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f59401l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f59402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f59403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f59404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f59405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f59406r;

    public d2(boolean z11, int i11, boolean z12, int i12, int i13, boolean z13, int i14, String membershipType, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i15, boolean z20, boolean z21, boolean z22) {
        kotlin.jvm.internal.m.f(membershipType, "membershipType");
        this.f59390a = z11;
        this.f59391b = i11;
        this.f59392c = z12;
        this.f59393d = i12;
        this.f59394e = i13;
        this.f59395f = z13;
        this.f59396g = i14;
        this.f59397h = membershipType;
        this.f59398i = z14;
        this.f59399j = z15;
        this.f59400k = z16;
        this.f59401l = z17;
        this.m = z18;
        this.f59402n = z19;
        this.f59403o = i15;
        this.f59404p = z20;
        this.f59405q = z21;
        this.f59406r = z22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f59390a == d2Var.f59390a && this.f59391b == d2Var.f59391b && this.f59392c == d2Var.f59392c && this.f59393d == d2Var.f59393d && this.f59394e == d2Var.f59394e && this.f59395f == d2Var.f59395f && this.f59396g == d2Var.f59396g && kotlin.jvm.internal.m.a(this.f59397h, d2Var.f59397h) && this.f59398i == d2Var.f59398i && this.f59399j == d2Var.f59399j && this.f59400k == d2Var.f59400k && this.f59401l == d2Var.f59401l && this.m == d2Var.m && this.f59402n == d2Var.f59402n && this.f59403o == d2Var.f59403o && this.f59404p == d2Var.f59404p && this.f59405q == d2Var.f59405q && this.f59406r == d2Var.f59406r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59406r) + defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f59403o, defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.d(defpackage.e.b(this.f59396g, defpackage.e.e(defpackage.e.b(this.f59394e, defpackage.e.b(this.f59393d, defpackage.e.e(defpackage.e.b(this.f59391b, Boolean.hashCode(this.f59390a) * 31, 31), 31, this.f59392c), 31), 31), 31, this.f59395f), 31), 31, this.f59397h), 31, this.f59398i), 31, this.f59399j), 31, this.f59400k), 31, this.f59401l), 31, this.m), 31, this.f59402n), 31), 31, this.f59404p), 31, this.f59405q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(isFluent=");
        sb2.append(this.f59390a);
        sb2.append(", keyLanguage=");
        sb2.append(this.f59391b);
        sb2.append(evRpcb.ehj);
        sb2.append(this.f59392c);
        sb2.append(bjXGJ.fqqZwbQdPF);
        sb2.append(this.f59393d);
        sb2.append(", romajiSystem=");
        sb2.append(this.f59394e);
        sb2.append(", redoWeakItems=");
        sb2.append(this.f59395f);
        sb2.append(", voicePack=");
        sb2.append(this.f59396g);
        sb2.append(", membershipType=");
        sb2.append(this.f59397h);
        sb2.append(", soundEffect=");
        ep.a.B(", animation=", nuRcCS.dJZw, sb2, this.f59398i, this.f59399j);
        ep.a.B(", rankingEnable=", ", streakEnable=", sb2, this.f59400k, this.f59401l);
        ep.a.B(", hideMyProfile=", ", themeMode=", sb2, this.m, this.f59402n);
        sb2.append(this.f59403o);
        sb2.append(", allowAlternativeAnswers=");
        sb2.append(this.f59404p);
        sb2.append(", showMistakeExplain=");
        sb2.append(this.f59405q);
        sb2.append(", showAiFeatures=");
        sb2.append(this.f59406r);
        sb2.append(")");
        return sb2.toString();
    }
}
