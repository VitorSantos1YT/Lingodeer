package mw;

import java.net.SocketAddress;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw.i f42519a;

    public l(nw.i iVar, p2 p2Var) {
        this.f42519a = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42519a.close();
    }

    @Override // mw.b0
    public final f0 y0(SocketAddress socketAddress, a0 a0Var, z1 z1Var) {
        return new k(this, this.f42519a.y0(socketAddress, a0Var, z1Var), a0Var.f42303a);
    }
}
