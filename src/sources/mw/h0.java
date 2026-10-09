package mw;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42438b;

    public /* synthetic */ h0(Object obj, int i11) {
        this.f42437a = i11;
        this.f42438b = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42437a) {
            case 0:
                lw.r rVar = (lw.r) this.f42438b;
                lw.r rVarA = rVar.a();
                try {
                    b();
                    return;
                } finally {
                    rVar.c(rVarA);
                }
            default:
                nw.c cVar = (nw.c) this.f42438b;
                try {
                    if (cVar.K == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    a();
                    return;
                } catch (Exception e8) {
                    cVar.f44192d.n(e8);
                    return;
                }
        }
    }
}
