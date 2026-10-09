package pb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f46755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.j f46756b;

    public r(s sVar, ob.j jVar) {
        this.f46755a = sVar;
        this.f46756b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f46755a.f46760d) {
            try {
                if (((r) this.f46755a.f46758b.remove(this.f46756b)) != null) {
                    q qVar = (q) this.f46755a.f46759c.remove(this.f46756b);
                    if (qVar != null) {
                        ob.j jVar = this.f46756b;
                        ib.f fVar = (ib.f) qVar;
                        fb.l lVarB = fb.l.b();
                        Objects.toString(jVar);
                        lVarB.getClass();
                        fVar.H.execute(new ib.e(fVar, 0));
                    }
                } else {
                    fb.l lVarB2 = fb.l.b();
                    Objects.toString(this.f46756b);
                    lVarB2.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
