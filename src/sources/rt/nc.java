package rt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f50156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50157e;

    public nc(int i11, int i12, int i13, Map map, boolean z11) {
        this.f50153a = i11;
        this.f50154b = i12;
        this.f50155c = i13;
        this.f50156d = map;
        this.f50157e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return this.f50153a == ncVar.f50153a && this.f50154b == ncVar.f50154b && this.f50155c == ncVar.f50155c && this.f50156d.equals(ncVar.f50156d) && this.f50157e == ncVar.f50157e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50157e) + ((this.f50156d.hashCode() + defpackage.e.b(this.f50155c, defpackage.e.b(this.f50154b, Integer.hashCode(this.f50153a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("CourseTestSrsUiState(totalCount=", this.f50153a, ", learningCount=", this.f50154b, ", reviewCount=");
        sbK.append(this.f50155c);
        sbK.append(", userRatingMap=");
        sbK.append(this.f50156d);
        sbK.append(", showNextReviewTime=");
        return hh.p0.p(sbK, this.f50157e, ")");
    }
}
