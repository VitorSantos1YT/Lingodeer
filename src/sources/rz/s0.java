package rz;

import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50950a;

    public s0(boolean z11) {
        this.f50950a = z11;
    }

    @Override // rz.d1
    public final u1 b() {
        return null;
    }

    @Override // rz.d1
    public final boolean isActive() {
        return this.f50950a;
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder(txBUGYhC.hFjKVPKVIQUWUWv), this.f50950a ? "Active" : "New", '}');
    }
}
