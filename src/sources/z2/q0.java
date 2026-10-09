package z2;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rz.m f58651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f58652b;

    public q0(rz.m mVar, l1.f fVar, fz.c cVar) {
        this.f58651a = mVar;
        this.f58652b = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        Object objL;
        try {
            objL = this.f58652b.invoke(Long.valueOf(j11));
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        this.f58651a.resumeWith(objL);
    }
}
