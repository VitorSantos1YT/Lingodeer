package rt;

import bw.ORXQ.ADSb;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f49712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f49713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mt.q2 f49716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f49717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f49718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f49719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f49720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f49721l;
    public final boolean m;

    public f2(List list, List list2, List list3, List list4, boolean z11, boolean z12, mt.q2 currentFlashCardPracticeMode, boolean z13, int i11, boolean z14, int i12, int i13, boolean z15) {
        kotlin.jvm.internal.m.f(currentFlashCardPracticeMode, "currentFlashCardPracticeMode");
        this.f49710a = list;
        this.f49711b = list2;
        this.f49712c = list3;
        this.f49713d = list4;
        this.f49714e = z11;
        this.f49715f = z12;
        this.f49716g = currentFlashCardPracticeMode;
        this.f49717h = z13;
        this.f49718i = i11;
        this.f49719j = z14;
        this.f49720k = i12;
        this.f49721l = i13;
        this.m = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return kotlin.jvm.internal.m.a(this.f49710a, f2Var.f49710a) && kotlin.jvm.internal.m.a(this.f49711b, f2Var.f49711b) && kotlin.jvm.internal.m.a(this.f49712c, f2Var.f49712c) && kotlin.jvm.internal.m.a(this.f49713d, f2Var.f49713d) && this.f49714e == f2Var.f49714e && this.f49715f == f2Var.f49715f && this.f49716g == f2Var.f49716g && this.f49717h == f2Var.f49717h && this.f49718i == f2Var.f49718i && this.f49719j == f2Var.f49719j && this.f49720k == f2Var.f49720k && this.f49721l == f2Var.f49721l && this.m == f2Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + defpackage.e.b(this.f49721l, defpackage.e.b(this.f49720k, defpackage.e.e(defpackage.e.b(this.f49718i, defpackage.e.e((this.f49716g.hashCode() + defpackage.e.e(defpackage.e.e(hh.p0.b(hh.p0.b(hh.p0.b(this.f49710a.hashCode() * 31, 31, this.f49711b), 31, this.f49712c), 31, this.f49713d), 31, this.f49714e), 31, this.f49715f)) * 31, 31, this.f49717h), 31), 31, this.f49719j), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(needReviewList=");
        sb2.append(this.f49710a);
        sb2.append(", newReviewList=");
        sb2.append(this.f49711b);
        sb2.append(", allNewReviewList=");
        sb2.append(this.f49712c);
        sb2.append(", upComingReviews=");
        sb2.append(this.f49713d);
        sb2.append(", enableCustomReview=");
        ep.a.B(", canAccessPracticeMode=", ", currentFlashCardPracticeMode=", sb2, this.f49714e, this.f49715f);
        sb2.append(this.f49716g);
        sb2.append(", showFutureReviewIcon=");
        sb2.append(this.f49717h);
        sb2.append(", practiceCount=");
        sb2.append(this.f49718i);
        sb2.append(", shuffleNewReviews=");
        sb2.append(this.f49719j);
        sb2.append(", dailyNewReviewsLimit=");
        ep.a.v(this.f49720k, this.f49721l, ", dailyNewReviewsRemainingCount=", ADSb.nrIRUNhVau, sb2);
        return hh.p0.p(sb2, this.m, ")");
    }
}
