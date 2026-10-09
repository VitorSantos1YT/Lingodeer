package nw;

import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import lf.x0;
import mw.b0;
import mw.f0;
import mw.n3;
import mw.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements b0 {
    public final int H;
    public final boolean K;
    public final mw.e L;
    public final long M;
    public final int N;
    public final int O;
    public boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f44208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f44209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f44210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f44211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3 f44212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f44213f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f44214t;

    public i(x0 x0Var, x0 x0Var2, SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.c cVar, int i11, boolean z11, long j11, long j12, int i12, int i13, n3 n3Var) {
        this.f44208a = x0Var;
        this.f44209b = (Executor) x0Var.B();
        this.f44210c = x0Var2;
        this.f44211d = (ScheduledExecutorService) x0Var2.B();
        this.f44213f = sSLSocketFactory;
        this.f44214t = cVar;
        this.H = i11;
        this.K = z11;
        this.L = new mw.e(j11);
        this.M = j12;
        this.N = i12;
        this.O = i13;
        Preconditions.k(n3Var, "transportTracerFactory");
        this.f44212e = n3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.P) {
            return;
        }
        this.P = true;
        this.f44208a.F(this.f44209b);
        this.f44210c.F(this.f44211d);
    }

    @Override // mw.b0
    public final f0 y0(SocketAddress socketAddress, mw.a0 a0Var, z1 z1Var) {
        if (this.P) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        mw.e eVar = this.L;
        long j11 = eVar.f42397b.get();
        p pVar = new p(this, (InetSocketAddress) socketAddress, a0Var.f42303a, a0Var.f42304b, a0Var.f42305c, new aj.i(new androidx.recyclerview.widget.e(eVar, j11, 6), 24));
        if (this.K) {
            pVar.G = true;
            pVar.H = j11;
            pVar.I = this.M;
        }
        return pVar;
    }
}
