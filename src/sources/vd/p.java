package vd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final le.i f53935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f53936c;

    public /* synthetic */ p(s sVar, le.i iVar, int i11) {
        this.f53934a = i11;
        this.f53936c = sVar;
        this.f53935b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53934a) {
            case 0:
                le.i iVar = this.f53935b;
                iVar.f39925a.a();
                synchronized (iVar.f39926b) {
                    synchronized (this.f53936c) {
                        try {
                            if (this.f53936c.f53940a.f53939a.contains(new q(this.f53935b, pe.f.f46821b))) {
                                s sVar = this.f53936c;
                                le.i iVar2 = this.f53935b;
                                sVar.getClass();
                                try {
                                    iVar2.f(sVar.S, 5);
                                } catch (Throwable th2) {
                                    throw new c(th2);
                                }
                            }
                            this.f53936c.d();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return;
            default:
                le.i iVar3 = this.f53935b;
                iVar3.f39925a.a();
                synchronized (iVar3.f39926b) {
                    synchronized (this.f53936c) {
                        try {
                            if (this.f53936c.f53940a.f53939a.contains(new q(this.f53935b, pe.f.f46821b))) {
                                this.f53936c.U.a();
                                s sVar2 = this.f53936c;
                                le.i iVar4 = this.f53935b;
                                sVar2.getClass();
                                try {
                                    iVar4.i(sVar2.U, sVar2.Q, sVar2.X);
                                    this.f53936c.h(this.f53935b);
                                } catch (Throwable th4) {
                                    throw new c(th4);
                                }
                            }
                            this.f53936c.d();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                return;
        }
    }
}
