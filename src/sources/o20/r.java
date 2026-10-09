package o20;

import okhttp3.Call;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f44555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44556e;

    public r(s0 s0Var, Call.Factory factory, m mVar, g gVar, boolean z11) {
        super(s0Var, factory, mVar);
        this.f44555d = gVar;
        this.f44556e = z11;
    }

    @Override // o20.t
    public final Object b(b0 b0Var, Object[] objArr) {
        e eVar = (e) this.f44555d.o(b0Var);
        vy.d dVar = (vy.d) objArr[objArr.length - 1];
        try {
            if (!this.f44556e) {
                return c1.b(eVar, dVar);
            }
            kotlin.jvm.internal.m.d(eVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return c1.c(eVar, dVar);
        } catch (LinkageError e8) {
            throw e8;
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (VirtualMachineError e11) {
            throw e11;
        } catch (Throwable th2) {
            return c1.p(th2, dVar);
        }
    }
}
