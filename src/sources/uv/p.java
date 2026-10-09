package uv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f53225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53226b = false;

    public p(c cVar) {
        this.f53225a = cVar;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj) || obj == this.f53225a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f53226b) {
            return;
        }
        c cVar = this.f53225a;
        if (cVar.f53199d != 10) {
            o00.a.P(cVar, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(cVar.a()), Byte.valueOf(cVar.f53199d));
            return;
        }
        b bVar = cVar.f53198c;
        t tVarD = q.f53227a.d();
        try {
            if (tVarD.c(bVar)) {
                return;
            }
            synchronized (cVar.f53197b) {
                try {
                    if (cVar.f53199d != 10) {
                        o00.a.P(cVar, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(cVar.a()), Byte.valueOf(cVar.f53199d));
                        return;
                    }
                    cVar.f53199d = (byte) 11;
                    a10.f fVar = f.f53206a;
                    fVar.b(bVar);
                    int iA = bVar.a();
                    String str = bVar.f53185f;
                    int i11 = ew.f.f25949a;
                    if (str == null) {
                        str = null;
                    }
                    if (ns.o.D(str, iA, bVar.m, true)) {
                        return;
                    }
                    tp.g gVar = k.f53220a;
                    boolean zN = ((s) gVar.f52461b).n(bVar.f53184e, bVar.f53185f, bVar.f53191l, bVar.f53189j, bVar.m, bVar.f53190k);
                    if (cVar.f53199d == -2) {
                        o00.a.P(cVar, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(cVar.a()));
                        if (zN) {
                            gVar.e(cVar.a());
                            return;
                        }
                        return;
                    }
                    if (zN) {
                        tVarD.d(bVar);
                        return;
                    }
                    if (tVarD.c(bVar)) {
                        return;
                    }
                    aw.p pVarE = cVar.e(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                    if (fVar.h(bVar)) {
                        tVarD.d(bVar);
                        fVar.b(bVar);
                    }
                    fVar.i(bVar, pVarE);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
            f.f53206a.i(bVar, cVar.e(th3));
        }
    }
}
