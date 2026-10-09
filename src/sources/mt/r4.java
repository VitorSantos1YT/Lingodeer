package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41842c;

    public r4(int i11, int i12, int i13) {
        this.f41840a = i11;
        this.f41841b = i12;
        this.f41842c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return this.f41840a == r4Var.f41840a && this.f41841b == r4Var.f41841b && this.f41842c == r4Var.f41842c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41842c) + defpackage.e.b(this.f41841b, Integer.hashCode(this.f41840a) * 31, 31);
    }

    public final String toString() {
        return hh.p0.i(this.f41842c, ")", w4.c.k("CourseListenAlongCenterItem(queueIndex=", this.f41840a, ", offsetToCenterPx=", this.f41841b, ", itemHeightPx="));
    }
}
