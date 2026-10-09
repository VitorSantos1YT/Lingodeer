package uz;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements s0, i, vz.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f53384a;

    public q0(w0 w0Var) {
        this.f53384a = w0Var;
    }

    @Override // uz.s0
    public final List a() {
        return this.f53384a.a();
    }

    @Override // vz.l
    public final i b(vy.i iVar, int i11, tz.a aVar) {
        return x0.x(this, iVar, i11, aVar);
    }

    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        return this.f53384a.collect(jVar, dVar);
    }
}
