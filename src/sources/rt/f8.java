package rt;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f8 implements g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8 f49743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f49744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f49745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f49746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o8 f49747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k8 f49748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f49749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f49751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f49752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f49753l;

    public static f8 a(f8 f8Var, ArrayList arrayList, ArrayList arrayList2, o8 o8Var, k8 k8Var, List list, String str, boolean z11, boolean z12, k0 k0Var, int i11) {
        boolean z13 = f8Var.f49742a;
        f8Var.getClass();
        r8 practiceModel = f8Var.f49743b;
        List list2 = f8Var.f49744c;
        List list3 = arrayList;
        if ((i11 & 16) != 0) {
            list3 = f8Var.f49745d;
        }
        List list4 = list3;
        List list5 = (i11 & 32) != 0 ? f8Var.f49746e : arrayList2;
        o8 o8Var2 = (i11 & 64) != 0 ? f8Var.f49747f : o8Var;
        k8 viewMode = (i11 & 128) != 0 ? f8Var.f49748g : k8Var;
        List bookmarkFolderSummaries = (i11 & 256) != 0 ? f8Var.f49749h : list;
        String str2 = (i11 & 512) != 0 ? f8Var.f49750i : str;
        boolean z14 = (i11 & 1024) != 0 ? f8Var.f49751j : z11;
        boolean z15 = (i11 & 2048) != 0 ? f8Var.f49752k : z12;
        k0 bookmarkFolderOperationResult = (i11 & 4096) != 0 ? f8Var.f49753l : k0Var;
        f8Var.getClass();
        kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
        kotlin.jvm.internal.m.f(viewMode, "viewMode");
        kotlin.jvm.internal.m.f(bookmarkFolderSummaries, "bookmarkFolderSummaries");
        kotlin.jvm.internal.m.f(bookmarkFolderOperationResult, "bookmarkFolderOperationResult");
        return new f8(z13, practiceModel, list2, list4, list5, o8Var2, viewMode, bookmarkFolderSummaries, str2, z14, z15, bookmarkFolderOperationResult);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f49742a == f8Var.f49742a && this.f49743b == f8Var.f49743b && this.f49744c.equals(f8Var.f49744c) && this.f49745d.equals(f8Var.f49745d) && this.f49746e.equals(f8Var.f49746e) && kotlin.jvm.internal.m.a(this.f49747f, f8Var.f49747f) && kotlin.jvm.internal.m.a(this.f49748g, f8Var.f49748g) && kotlin.jvm.internal.m.a(this.f49749h, f8Var.f49749h) && kotlin.jvm.internal.m.a(this.f49750i, f8Var.f49750i) && this.f49751j == f8Var.f49751j && this.f49752k == f8Var.f49752k && kotlin.jvm.internal.m.a(this.f49753l, f8Var.f49753l);
    }

    public final int hashCode() {
        int iB = hh.p0.b(hh.p0.b(hh.p0.b((this.f49743b.hashCode() + defpackage.e.e(Boolean.hashCode(this.f49742a) * 31, 31, false)) * 31, 31, this.f49744c), 31, this.f49745d), 31, this.f49746e);
        o8 o8Var = this.f49747f;
        int iB2 = hh.p0.b((this.f49748g.hashCode() + ((iB + (o8Var == null ? 0 : o8Var.hashCode())) * 31)) * 31, 31, this.f49749h);
        String str = this.f49750i;
        return this.f49753l.hashCode() + defpackage.e.e(defpackage.e.e((iB2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f49751j), 31, this.f49752k);
    }

    public final String toString() {
        return "Success(hasPurchased=" + this.f49742a + ", needPremiumPlus=false, practiceModel=" + this.f49743b + ", practiceModels=" + this.f49744c + ", selectedReviews=" + this.f49745d + ", courseReviewUnits=" + this.f49746e + ", practiceModeChooser=" + this.f49747f + ", viewMode=" + this.f49748g + ", bookmarkFolderSummaries=" + this.f49749h + ", currentBookmarkFolderName=" + this.f49750i + ", enableBookmarkFolder=" + this.f49751j + ", loadNote=" + this.f49752k + ", bookmarkFolderOperationResult=" + this.f49753l + ")";
    }

    public f8(boolean z11, r8 r8Var, List list, List list2, List list3, o8 o8Var, k8 viewMode, List bookmarkFolderSummaries, String str, boolean z12, boolean z13, k0 bookmarkFolderOperationResult) {
        kotlin.jvm.internal.m.f(r8Var, FpIL.DmootBXAfS);
        kotlin.jvm.internal.m.f(viewMode, "viewMode");
        kotlin.jvm.internal.m.f(bookmarkFolderSummaries, "bookmarkFolderSummaries");
        kotlin.jvm.internal.m.f(bookmarkFolderOperationResult, "bookmarkFolderOperationResult");
        this.f49742a = z11;
        this.f49743b = r8Var;
        this.f49744c = list;
        this.f49745d = list2;
        this.f49746e = list3;
        this.f49747f = o8Var;
        this.f49748g = viewMode;
        this.f49749h = bookmarkFolderSummaries;
        this.f49750i = str;
        this.f49751j = z12;
        this.f49752k = z13;
        this.f49753l = bookmarkFolderOperationResult;
    }
}
