package w2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends y2.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f54528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f54529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, fz.e eVar, String str) {
        super(str);
        this.f54528b = m0Var;
        this.f54529c = eVar;
    }

    @Override // w2.q0
    public final r0 e(s0 s0Var, List list, long j11) {
        m0 m0Var = this.f54528b;
        h0 h0Var = m0Var.H;
        h0Var.f54507a = s0Var.getLayoutDirection();
        h0Var.f54508b = s0Var.getDensity();
        h0Var.f54509c = s0Var.Z();
        boolean zC0 = s0Var.c0();
        fz.e eVar = this.f54529c;
        if (zC0 || m0Var.f54542a.K == null) {
            m0Var.f54545d = 0;
            r0 r0Var = (r0) eVar.invoke(h0Var, new v3.a(j11));
            return new i0(r0Var, m0Var, m0Var.f54545d, r0Var, 1);
        }
        m0Var.f54546e = 0;
        r0 r0Var2 = (r0) eVar.invoke(m0Var.K, new v3.a(j11));
        return new i0(r0Var2, m0Var, m0Var.f54546e, r0Var2, 0);
    }
}
