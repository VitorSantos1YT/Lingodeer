package rt;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f50199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8 f50200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f50202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f50203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r8 f50204g;

    public o8(List filteredContents, Set set, p8 selectedFilterMethod, boolean z11, List practiceModels, Set set2, r8 selectedPracticeModel) {
        kotlin.jvm.internal.m.f(filteredContents, "filteredContents");
        kotlin.jvm.internal.m.f(selectedFilterMethod, "selectedFilterMethod");
        kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
        kotlin.jvm.internal.m.f(selectedPracticeModel, "selectedPracticeModel");
        this.f50198a = filteredContents;
        this.f50199b = set;
        this.f50200c = selectedFilterMethod;
        this.f50201d = z11;
        this.f50202e = practiceModels;
        this.f50203f = set2;
        this.f50204g = selectedPracticeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return kotlin.jvm.internal.m.a(this.f50198a, o8Var.f50198a) && kotlin.jvm.internal.m.a(this.f50199b, o8Var.f50199b) && this.f50200c == o8Var.f50200c && this.f50201d == o8Var.f50201d && kotlin.jvm.internal.m.a(this.f50202e, o8Var.f50202e) && kotlin.jvm.internal.m.a(this.f50203f, o8Var.f50203f) && this.f50204g == o8Var.f50204g;
    }

    public final int hashCode() {
        return this.f50204g.hashCode() + ((this.f50203f.hashCode() + hh.p0.b(defpackage.e.e((this.f50200c.hashCode() + ((this.f50199b.hashCode() + (this.f50198a.hashCode() * 31)) * 31)) * 31, 31, this.f50201d), 31, this.f50202e)) * 31);
    }

    public final String toString() {
        return "CourseReviewModeChooseUiState(filteredContents=" + this.f50198a + ", enabledFilterMethods=" + this.f50199b + ", selectedFilterMethod=" + this.f50200c + ", isShuffleFilter=" + this.f50201d + ", practiceModels=" + this.f50202e + ", enabledPracticeModels=" + this.f50203f + ", selectedPracticeModel=" + this.f50204g + ")";
    }
}
