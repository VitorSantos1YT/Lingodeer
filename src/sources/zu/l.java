package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f59481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f59482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f59486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f59487k;

    public l(boolean z11, String str, String str2, String str3, String str4, String str5, String str6, String membershipType, boolean z12, boolean z13, a changePasswordResult) {
        kotlin.jvm.internal.m.f(membershipType, "membershipType");
        kotlin.jvm.internal.m.f(changePasswordResult, "changePasswordResult");
        this.f59477a = z11;
        this.f59478b = str;
        this.f59479c = str2;
        this.f59480d = str3;
        this.f59481e = str4;
        this.f59482f = str5;
        this.f59483g = str6;
        this.f59484h = membershipType;
        this.f59485i = z12;
        this.f59486j = z13;
        this.f59487k = changePasswordResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f59477a == lVar.f59477a && kotlin.jvm.internal.m.a(this.f59478b, lVar.f59478b) && kotlin.jvm.internal.m.a(this.f59479c, lVar.f59479c) && kotlin.jvm.internal.m.a(this.f59480d, lVar.f59480d) && kotlin.jvm.internal.m.a(this.f59481e, lVar.f59481e) && kotlin.jvm.internal.m.a(this.f59482f, lVar.f59482f) && kotlin.jvm.internal.m.a(this.f59483g, lVar.f59483g) && kotlin.jvm.internal.m.a(this.f59484h, lVar.f59484h) && this.f59485i == lVar.f59485i && this.f59486j == lVar.f59486j && this.f59487k == lVar.f59487k;
    }

    public final int hashCode() {
        return this.f59487k.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(Boolean.hashCode(this.f59477a) * 31, 31, this.f59478b), 31, this.f59479c), 31, this.f59480d), 31, this.f59481e), 31, this.f59482f), 31, this.f59483g), 31, this.f59484h), 31, this.f59485i), 31, this.f59486j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(isLoginUser=");
        sb2.append(this.f59477a);
        sb2.append(", uid=");
        sb2.append(this.f59478b);
        sb2.append(", nickName=");
        com.google.android.material.datepicker.d.w(sb2, this.f59479c, ", email=", this.f59480d, ", avatar=");
        com.google.android.material.datepicker.d.w(sb2, this.f59481e, ", accountType=", this.f59482f, ", userJoinDate=");
        com.google.android.material.datepicker.d.w(sb2, this.f59483g, ", membershipType=", this.f59484h, ", hasPurchased=");
        ep.a.B(", isLoading=", ", changePasswordResult=", sb2, this.f59485i, this.f59486j);
        sb2.append(this.f59487k);
        sb2.append(")");
        return sb2.toString();
    }
}
