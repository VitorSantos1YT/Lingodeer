package rt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f50263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f50264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f50270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f50271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f50272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f50273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f50274l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f50275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f50276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f50277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f50278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f50279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f50280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f50281t;

    public q2(n0 n0Var, Map userRatingMap, boolean z11, boolean z12, int i11, int i12, int i13, int i14, boolean z13, String result, int i15, int i16, int i17, int i18, int i19, int i21, boolean z14, int i22, float f5, boolean z15) {
        kotlin.jvm.internal.m.f(userRatingMap, "userRatingMap");
        kotlin.jvm.internal.m.f(result, "result");
        this.f50263a = n0Var;
        this.f50264b = userRatingMap;
        this.f50265c = z11;
        this.f50266d = z12;
        this.f50267e = i11;
        this.f50268f = i12;
        this.f50269g = i13;
        this.f50270h = i14;
        this.f50271i = z13;
        this.f50272j = result;
        this.f50273k = i15;
        this.f50274l = i16;
        this.m = i17;
        this.f50275n = i18;
        this.f50276o = i19;
        this.f50277p = i21;
        this.f50278q = z14;
        this.f50279r = i22;
        this.f50280s = f5;
        this.f50281t = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return kotlin.jvm.internal.m.a(this.f50263a, q2Var.f50263a) && kotlin.jvm.internal.m.a(this.f50264b, q2Var.f50264b) && this.f50265c == q2Var.f50265c && this.f50266d == q2Var.f50266d && this.f50267e == q2Var.f50267e && this.f50268f == q2Var.f50268f && this.f50269g == q2Var.f50269g && this.f50270h == q2Var.f50270h && this.f50271i == q2Var.f50271i && kotlin.jvm.internal.m.a(this.f50272j, q2Var.f50272j) && this.f50273k == q2Var.f50273k && this.f50274l == q2Var.f50274l && this.m == q2Var.m && this.f50275n == q2Var.f50275n && this.f50276o == q2Var.f50276o && this.f50277p == q2Var.f50277p && this.f50278q == q2Var.f50278q && this.f50279r == q2Var.f50279r && Float.compare(this.f50280s, q2Var.f50280s) == 0 && this.f50281t == q2Var.f50281t;
    }

    public final int hashCode() {
        n0 n0Var = this.f50263a;
        return Boolean.hashCode(this.f50281t) + defpackage.e.a(defpackage.e.b(this.f50279r, defpackage.e.e(defpackage.e.b(this.f50277p, defpackage.e.b(this.f50276o, defpackage.e.b(this.f50275n, defpackage.e.b(this.m, defpackage.e.b(this.f50274l, defpackage.e.b(this.f50273k, defpackage.e.d(defpackage.e.e(defpackage.e.b(this.f50270h, defpackage.e.b(this.f50269g, defpackage.e.b(this.f50268f, defpackage.e.b(this.f50267e, defpackage.e.e(defpackage.e.e((this.f50264b.hashCode() + ((n0Var == null ? 0 : n0Var.hashCode()) * 31)) * 31, 31, this.f50265c), 31, this.f50266d), 31), 31), 31), 31), 31, this.f50271i), 31, this.f50272j), 31), 31), 31), 31), 31), 31), 31, this.f50278q), 31), this.f50280s, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(currentCardContent=");
        sb2.append(this.f50263a);
        sb2.append(", userRatingMap=");
        sb2.append(this.f50264b);
        sb2.append(", showNextReviewTime=");
        ep.a.B(", isAnswerShown=", ", currentCardIndex=", sb2, this.f50265c, this.f50266d);
        ep.a.v(this.f50267e, this.f50268f, ", totalCardCount=", ", learningCount=", sb2);
        ep.a.v(this.f50269g, this.f50270h, ", reviewCount=", ", isFinished=", sb2);
        sb2.append(this.f50271i);
        sb2.append(", result=");
        sb2.append(this.f50272j);
        sb2.append(", scriptStyle=");
        ep.a.v(this.f50273k, this.f50274l, ", scriptShortcutDisplay=", ", fontSizeStyle=", sb2);
        ep.a.v(this.m, this.f50275n, ", audioSpeed=", ", flashCardDisplayIn=", sb2);
        ep.a.v(this.f50276o, this.f50277p, ", actualDisplayMode=", ", isVideoFallbackToAudio=", sb2);
        sb2.append(this.f50278q);
        sb2.append(", flashCardIsPlayModel=");
        sb2.append(this.f50279r);
        sb2.append(", pronunciationGuideAlpha=");
        sb2.append(this.f50280s);
        sb2.append(", soundEffect=");
        sb2.append(this.f50281t);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ q2(n0 n0Var, boolean z11, boolean z12, int i11, int i12, int i13, int i14, boolean z13, String str, int i15, int i16, int i17, int i18, int i19, int i21, int i22, float f5, boolean z14, int i23) {
        this(n0Var, ry.s.f50855a, z11, z12, i11, i12, i13, i14, z13, str, i15, i16, i17, i18, i19, i21, false, i22, f5, z14);
    }
}
