package p7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f46495e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f46497d;

    public u(y6.o0 o0Var, Object obj, Object obj2) {
        super(o0Var);
        this.f46496c = obj;
        this.f46497d = obj2;
    }

    @Override // p7.q, y6.o0
    public final int b(Object obj) {
        Object obj2;
        if (f46495e.equals(obj) && (obj2 = this.f46497d) != null) {
            obj = obj2;
        }
        return this.f46450b.b(obj);
    }

    @Override // p7.q, y6.o0
    public final y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        this.f46450b.f(i11, m0Var, z11);
        if (Objects.equals(m0Var.f57229b, this.f46497d) && z11) {
            m0Var.f57229b = f46495e;
        }
        return m0Var;
    }

    @Override // p7.q, y6.o0
    public final Object l(int i11) {
        Object objL = this.f46450b.l(i11);
        return Objects.equals(objL, this.f46497d) ? f46495e : objL;
    }

    @Override // p7.q, y6.o0
    public final y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        this.f46450b.m(i11, n0Var, j11);
        if (Objects.equals(n0Var.f57238a, this.f46496c)) {
            n0Var.f57238a = y6.n0.f57236q;
        }
        return n0Var;
    }
}
