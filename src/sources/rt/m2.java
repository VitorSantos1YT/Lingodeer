package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50052c;

    public m2(long j11, String unitName, boolean z11) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f50050a = j11;
        this.f50051b = unitName;
        this.f50052c = z11;
    }

    public static m2 a(m2 m2Var, boolean z11) {
        long j11 = m2Var.f50050a;
        String unitName = m2Var.f50051b;
        m2Var.getClass();
        kotlin.jvm.internal.m.f(unitName, "unitName");
        return new m2(j11, unitName, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.f50050a == m2Var.f50050a && kotlin.jvm.internal.m.a(this.f50051b, m2Var.f50051b) && this.f50052c == m2Var.f50052c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50052c) + defpackage.e.d(Long.hashCode(this.f50050a) * 31, 31, this.f50051b);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f50050a, "CourseFlashCardReviewUnit(unitId=", ", unitName=", this.f50051b);
        sbP.append(", isChecked=");
        sbP.append(this.f50052c);
        sbP.append(")");
        return sbP.toString();
    }
}
