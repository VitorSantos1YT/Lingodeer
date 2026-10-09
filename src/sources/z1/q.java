package z1;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import rz.b0;
import rz.e0;
import rz.g1;
import rz.h1;
import rz.z;
import y2.k1;
import y2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements y2.m {
    public k1 H;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public d2.c O;
    public boolean P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wz.d f58483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58484c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f58486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f58487f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p1 f58488t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f58482a = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58485d = -1;

    public final b0 H0() {
        wz.d dVar = this.f58483b;
        if (dVar != null) {
            return dVar;
        }
        wz.d dVarC = e0.c(y2.f.y(this).getCoroutineContext().plus(new h1((g1) y2.f.y(this).getCoroutineContext().get(z.f50978b))));
        this.f58483b = dVarC;
        return dVarC;
    }

    public boolean I0() {
        return !(this instanceof d0.o);
    }

    public void J0() {
        if (this.P) {
            v2.a.b("node attached multiple times");
        }
        if (this.H == null) {
            v2.a.b("attach invoked on a node without a coordinator");
        }
        this.P = true;
        this.M = true;
    }

    public void K0() {
        if (!this.P) {
            v2.a.b("Cannot detach a node that is not attached");
        }
        if (this.M) {
            v2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.N) {
            v2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.P = false;
        wz.d dVar = this.f58483b;
        if (dVar != null) {
            e0.i(dVar, new ModifierNodeDetachedCancellationException());
            this.f58483b = null;
        }
    }

    public void O0() {
        if (!this.P) {
            v2.a.b("reset() called on an unattached node");
        }
        N0();
    }

    public void P0() {
        if (!this.P) {
            v2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.M) {
            v2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.M = false;
        L0();
        this.N = true;
    }

    public void Q0() {
        if (!this.P) {
            v2.a.b("node detached multiple times");
        }
        if (this.H == null) {
            v2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.N) {
            v2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.N = false;
        d2.c cVar = this.O;
        if (cVar != null) {
            cVar.invoke();
        }
        M0();
    }

    public void R0(q qVar) {
        this.f58482a = qVar;
    }

    public void S0(k1 k1Var) {
        this.H = k1Var;
    }

    public void L0() {
    }

    public void M0() {
    }

    public void N0() {
    }
}
