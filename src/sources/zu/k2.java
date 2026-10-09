package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f59472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f59473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f59474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f59475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f59476k;

    public k2(boolean z11, String str, String str2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z12) {
        this.f59466a = z11;
        this.f59467b = str;
        this.f59468c = str2;
        this.f59469d = i11;
        this.f59470e = i12;
        this.f59471f = i13;
        this.f59472g = i14;
        this.f59473h = i15;
        this.f59474i = i16;
        this.f59475j = i17;
        this.f59476k = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f59466a == k2Var.f59466a && kotlin.jvm.internal.m.a(this.f59467b, k2Var.f59467b) && kotlin.jvm.internal.m.a(this.f59468c, k2Var.f59468c) && this.f59469d == k2Var.f59469d && this.f59470e == k2Var.f59470e && this.f59471f == k2Var.f59471f && this.f59472g == k2Var.f59472g && this.f59473h == k2Var.f59473h && this.f59474i == k2Var.f59474i && this.f59475j == k2Var.f59475j && this.f59476k == k2Var.f59476k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59476k) + defpackage.e.b(this.f59475j, defpackage.e.b(this.f59474i, defpackage.e.b(this.f59473h, defpackage.e.b(this.f59472g, defpackage.e.b(this.f59471f, defpackage.e.b(this.f59470e, defpackage.e.b(this.f59469d, defpackage.e.d(defpackage.e.d(Boolean.hashCode(this.f59466a) * 31, 31, this.f59467b), 31, this.f59468c), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(isLoginUser=");
        sb2.append(this.f59466a);
        sb2.append(", nickName=");
        sb2.append(this.f59467b);
        sb2.append(", avatar=");
        sb2.append(this.f59468c);
        sb2.append(", totalXP=");
        sb2.append(this.f59469d);
        sb2.append(", todayXP=");
        ep.a.v(this.f59470e, this.f59471f, ", weeklyXP=", ", wordSentCount=", sb2);
        ep.a.v(this.f59472g, this.f59473h, ", followingCount=", ", followerCount=", sb2);
        ep.a.v(this.f59474i, this.f59475j, ", gemCount=", ", hasPurchased=", sb2);
        return hh.p0.p(sb2, this.f59476k, ")");
    }
}
