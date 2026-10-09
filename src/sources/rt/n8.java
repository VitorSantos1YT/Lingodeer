package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r8 f50137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8 f50138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f50139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f50140f;

    public n8(List baseSelectedContents, List practiceModels, r8 selectedPracticeModel, p8 selectedFilterMethod, List list, List list2) {
        kotlin.jvm.internal.m.f(baseSelectedContents, "baseSelectedContents");
        kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
        kotlin.jvm.internal.m.f(selectedPracticeModel, "selectedPracticeModel");
        kotlin.jvm.internal.m.f(selectedFilterMethod, "selectedFilterMethod");
        this.f50135a = baseSelectedContents;
        this.f50136b = practiceModels;
        this.f50137c = selectedPracticeModel;
        this.f50138d = selectedFilterMethod;
        this.f50139e = list;
        this.f50140f = list2;
    }

    public static n8 a(n8 n8Var, r8 r8Var, p8 p8Var, List list, List list2, int i11) {
        List baseSelectedContents = n8Var.f50135a;
        List practiceModels = n8Var.f50136b;
        if ((i11 & 4) != 0) {
            r8Var = n8Var.f50137c;
        }
        r8 selectedPracticeModel = r8Var;
        if ((i11 & 8) != 0) {
            p8Var = n8Var.f50138d;
        }
        p8 selectedFilterMethod = p8Var;
        if ((i11 & 16) != 0) {
            list = n8Var.f50139e;
        }
        List list3 = list;
        if ((i11 & 32) != 0) {
            list2 = n8Var.f50140f;
        }
        kotlin.jvm.internal.m.f(baseSelectedContents, "baseSelectedContents");
        kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
        kotlin.jvm.internal.m.f(selectedPracticeModel, "selectedPracticeModel");
        kotlin.jvm.internal.m.f(selectedFilterMethod, "selectedFilterMethod");
        return new n8(baseSelectedContents, practiceModels, selectedPracticeModel, selectedFilterMethod, list3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return kotlin.jvm.internal.m.a(this.f50135a, n8Var.f50135a) && kotlin.jvm.internal.m.a(this.f50136b, n8Var.f50136b) && this.f50137c == n8Var.f50137c && this.f50138d == n8Var.f50138d && kotlin.jvm.internal.m.a(this.f50139e, n8Var.f50139e) && kotlin.jvm.internal.m.a(this.f50140f, n8Var.f50140f);
    }

    public final int hashCode() {
        return this.f50140f.hashCode() + hh.p0.b((this.f50138d.hashCode() + ((this.f50137c.hashCode() + hh.p0.b(this.f50135a.hashCode() * 31, 31, this.f50136b)) * 31)) * 31, 31, this.f50139e);
    }

    public final String toString() {
        return "CourseReviewModeChooseInput(baseSelectedContents=" + this.f50135a + ", practiceModels=" + this.f50136b + ", selectedPracticeModel=" + this.f50137c + ", selectedFilterMethod=" + this.f50138d + ", shuffle20Contents=" + this.f50139e + ", shuffle40Contents=" + this.f50140f + ")";
    }
}
