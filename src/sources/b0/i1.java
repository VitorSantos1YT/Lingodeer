package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3565c;

    public i1(float f5, float f11, Object obj) {
        this.f3563a = f5;
        this.f3564b = f11;
        this.f3565c = obj;
    }

    @Override // b0.m
    public final l2 a(j2 j2Var) {
        Object obj = this.f3565c;
        return new dm.a(this.f3563a, this.f3564b, obj == null ? null : (s) j2Var.f3575a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (i1Var.f3563a == this.f3563a && i1Var.f3564b == this.f3564b && kotlin.jvm.internal.m.a(i1Var.f3565c, this.f3565c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3565c;
        return Float.hashCode(this.f3564b) + defpackage.e.a((obj != null ? obj.hashCode() : 0) * 31, this.f3563a, 31);
    }

    public /* synthetic */ i1(Object obj, int i11) {
        this(1.0f, 1500.0f, (i11 & 4) != 0 ? null : obj);
    }
}
