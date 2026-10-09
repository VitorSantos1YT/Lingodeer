package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f50216d;

    public oc(int i11, int i12, int i13, float f5) {
        this.f50213a = i11;
        this.f50214b = i12;
        this.f50215c = i13;
        this.f50216d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return this.f50213a == ocVar.f50213a && this.f50214b == ocVar.f50214b && this.f50215c == ocVar.f50215c && Float.compare(this.f50216d, ocVar.f50216d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50216d) + defpackage.e.b(this.f50215c, defpackage.e.b(this.f50214b, Integer.hashCode(this.f50213a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("CourseTestSummaryMetrics(correctCount=", this.f50213a, ", accuracyTotalCount=", this.f50214b, ", accuracyPercent=");
        sbK.append(this.f50215c);
        sbK.append(", xpMultiplier=");
        sbK.append(this.f50216d);
        sbK.append(")");
        return sbK.toString();
    }
}
