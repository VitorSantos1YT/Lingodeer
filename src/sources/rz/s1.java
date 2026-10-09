package rz;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy.d f50951d;

    public s1(vy.i iVar, fz.e eVar) {
        super(iVar, false);
        this.f50951d = ue.f.o(eVar, this, this);
    }

    @Override // rz.q1
    public final void P() throws Throwable {
        try {
            wz.b.h(qy.b0.f48488a, ue.f.x(this.f50951d));
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f38363a;
            }
            resumeWith(com.bumptech.glide.e.l(th));
            throw th;
        }
    }
}
