package f7;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f26823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f26824f;

    public k(g0 g0Var, b7.y yVar) {
        this.f26822d = g0Var;
        this.f26821c = new j1(yVar);
        this.f26819a = true;
    }

    public void a(e eVar) {
        k0 k0Var;
        k0 k0VarJ = eVar.j();
        if (k0VarJ == null || k0VarJ == (k0Var = (k0) this.f26824f)) {
            return;
        }
        if (k0Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f26824f = k0VarJ;
        this.f26823e = eVar;
        ((h7.a0) k0VarJ).c(((j1) this.f26821c).f26818e);
    }

    @Override // f7.k0
    public y6.e0 b() {
        k0 k0Var = (k0) this.f26824f;
        return k0Var != null ? k0Var.b() : ((j1) this.f26821c).f26818e;
    }

    @Override // f7.k0
    public void c(y6.e0 e0Var) {
        k0 k0Var = (k0) this.f26824f;
        if (k0Var != null) {
            k0Var.c(e0Var);
            e0Var = ((k0) this.f26824f).b();
        }
        ((j1) this.f26821c).c(e0Var);
    }

    @Override // f7.k0
    public long d() {
        if (this.f26819a) {
            return ((j1) this.f26821c).d();
        }
        k0 k0Var = (k0) this.f26824f;
        k0Var.getClass();
        return k0Var.d();
    }

    @Override // f7.k0
    public boolean e() {
        if (this.f26819a) {
            ((j1) this.f26821c).getClass();
            return false;
        }
        k0 k0Var = (k0) this.f26824f;
        k0Var.getClass();
        return k0Var.e();
    }

    public k(Context context, v7.u uVar) {
        this.f26821c = context.getApplicationContext();
        this.f26822d = uVar;
        this.f26824f = b7.y.f4045a;
    }
}
