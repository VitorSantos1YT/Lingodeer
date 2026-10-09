package mw;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s3 extends lw.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42678a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f42679b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw.q0 f42681d;

    public s3(u3 u3Var, u3 u3Var2) {
        this.f42681d = u3Var;
        this.f42680c = u3Var2;
    }

    @Override // lw.o0
    public final lw.m0 a(b4 b4Var) {
        switch (this.f42678a) {
            case 0:
                if (this.f42679b.compareAndSet(false, true)) {
                    lw.t1 t1VarF = ((u3) this.f42681d).f42718f.f();
                    u3 u3Var = (u3) this.f42680c;
                    Objects.requireNonNull(u3Var);
                    t1VarF.execute(new lf.i0(u3Var, 3));
                }
                break;
            default:
                if (this.f42679b.compareAndSet(false, true)) {
                    ((z3) this.f42681d).f42875f.f().execute(new aj.i(this, 19));
                }
                break;
        }
        return lw.m0.f40417e;
    }

    public s3(z3 z3Var, lw.y yVar) {
        this.f42681d = z3Var;
        Preconditions.k(yVar, "subchannel");
        this.f42680c = yVar;
    }
}
