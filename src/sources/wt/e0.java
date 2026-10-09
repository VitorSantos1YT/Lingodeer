package wt;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55255b;

    public e0(int i11, int i12) {
        this.f55254a = i11;
        this.f55255b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f55254a == e0Var.f55254a && this.f55255b == e0Var.f55255b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55255b) + (Integer.hashCode(this.f55254a) * 31);
    }

    public final String toString() {
        return p0.l("SrsCourseRepairResult(upsertedCount=", this.f55254a, ", deletedCount=", this.f55255b, ")");
    }
}
