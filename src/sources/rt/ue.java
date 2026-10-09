package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50513d;

    public ue(long j11, String unitName, int i11, List list) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f50510a = j11;
        this.f50511b = unitName;
        this.f50512c = i11;
        this.f50513d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return this.f50510a == ueVar.f50510a && kotlin.jvm.internal.m.a(this.f50511b, ueVar.f50511b) && this.f50512c == ueVar.f50512c && kotlin.jvm.internal.m.a(this.f50513d, ueVar.f50513d);
    }

    public final int hashCode() {
        return this.f50513d.hashCode() + defpackage.e.b(this.f50512c, defpackage.e.d(Long.hashCode(this.f50510a) * 31, 31, this.f50511b), 31);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f50510a, "FutureReviewUnitGroupUi(unitId=", ", unitName=", this.f50511b);
        sbP.append(", unitSortIndex=");
        sbP.append(this.f50512c);
        sbP.append(", items=");
        sbP.append(this.f50513d);
        sbP.append(")");
        return sbP.toString();
    }
}
