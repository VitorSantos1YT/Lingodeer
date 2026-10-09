package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lp.b f42592b;

    public /* synthetic */ o0(lp.b bVar, int i11) {
        this.f42591a = i11;
        this.f42592b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42591a) {
            case 0:
                this.f42592b.m(true);
                break;
            case 1:
                this.f42592b.m(false);
                break;
            default:
                y2 y2Var = (y2) this.f42592b.f40184b;
                Preconditions.p("Channel must have been shut down", y2Var.G.get());
                y2Var.H = true;
                y2Var.k(false);
                y2.g(y2Var);
                break;
        }
    }
}
