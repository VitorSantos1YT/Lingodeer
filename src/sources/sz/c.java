package sz;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import n5.o0;
import qp.n2;
import rz.e0;
import rz.j0;
import rz.m;
import rz.q0;
import rz.t1;
import rz.w1;
import vy.i;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends t1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f51958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f51961d;

    public c(Handler handler, String str, boolean z11) {
        this.f51958a = handler;
        this.f51959b = str;
        this.f51960c = z11;
        this.f51961d = z11 ? this : new c(handler, str, true);
    }

    @Override // rz.j0
    public final void a(long j11, m mVar) {
        pb.b bVar = new pb.b(6, mVar, this);
        if (j11 > 4611686018427387903L) {
            j11 = 4611686018427387903L;
        }
        if (this.f51958a.postDelayed(bVar, j11)) {
            mVar.u(new n2(20, this, bVar));
        } else {
            d(mVar.f50931e, bVar);
        }
    }

    @Override // rz.j0
    public final q0 b(long j11, Runnable runnable, i iVar) {
        if (j11 > 4611686018427387903L) {
            j11 = 4611686018427387903L;
        }
        if (this.f51958a.postDelayed(runnable, j11)) {
            return new o0(1, this, runnable);
        }
        d(iVar, runnable);
        return w1.f50967a;
    }

    public final void d(i iVar, Runnable runnable) {
        e0.j(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        f fVar = rz.o0.f50940a;
        e.f58387a.dispatch(iVar, runnable);
    }

    @Override // rz.y
    public final void dispatch(i iVar, Runnable runnable) {
        if (this.f51958a.post(runnable)) {
            return;
        }
        d(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f51958a == this.f51958a && cVar.f51960c == this.f51960c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51958a) ^ (this.f51960c ? 1231 : 1237);
    }

    @Override // rz.y
    public final boolean isDispatchNeeded(i iVar) {
        return (this.f51960c && kotlin.jvm.internal.m.a(Looper.myLooper(), this.f51958a.getLooper())) ? false : true;
    }

    @Override // rz.y
    public final String toString() {
        c cVar;
        String str;
        f fVar = rz.o0.f50940a;
        c cVar2 = wz.m.f55536a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f51961d;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f51959b;
        if (string == null) {
            string = this.f51958a.toString();
        }
        return this.f51960c ? defpackage.e.m(string, ".immediate") : string;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
