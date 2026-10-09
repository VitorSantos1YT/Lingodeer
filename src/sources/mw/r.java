package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42652c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.c f42653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xq.c cVar, lw.c1 c1Var) {
        super(((v) cVar.f56176d).f42735h, 0);
        this.f42653d = cVar;
        this.f42654e = c1Var;
    }

    @Override // mw.h0
    public final void b() {
        switch (this.f42652c) {
            case 0:
                xq.c cVar = this.f42653d;
                tw.b.c();
                try {
                    tw.b.a();
                    tw.b.f52660a.getClass();
                    if (((lw.q1) cVar.f56175c) == null) {
                        try {
                            ((lw.y) cVar.f56174b).j((lw.c1) this.f42654e);
                        } catch (Throwable th2) {
                            lw.q1 q1VarH = lw.q1.f40435f.g(th2).h("Failed to read headers");
                            cVar.f56175c = q1VarH;
                            ((v) cVar.f56176d).f42739l.p(q1VarH);
                        }
                        break;
                    }
                    tw.b.f52660a.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        tw.b.f52660a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                tw.b.c();
                try {
                    tw.b.a();
                    tw.a aVar = tw.b.f52660a;
                    aVar.getClass();
                    c();
                    aVar.getClass();
                    return;
                } catch (Throwable th5) {
                    try {
                        tw.b.f52660a.getClass();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0033 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f42654e
            dm.a r0 = (dm.a) r0
            xq.c r1 = r6.f42653d
            java.lang.Object r2 = r1.f56176d
            mw.v r2 = (mw.v) r2
            java.lang.Object r3 = r1.f56175c
            lw.q1 r3 = (lw.q1) r3
            if (r3 == 0) goto L1c
            java.util.logging.Logger r1 = mw.k1.f42487a
        L12:
            java.io.InputStream r1 = r0.u()
            if (r1 == 0) goto L3a
            mw.k1.b(r1)
            goto L12
        L1c:
            java.io.InputStream r3 = r0.u()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L3a
            java.lang.Object r4 = r1.f56174b     // Catch: java.lang.Throwable -> L35
            lw.y r4 = (lw.y) r4     // Catch: java.lang.Throwable -> L35
            lw.e1 r5 = r2.f42731d     // Catch: java.lang.Throwable -> L35
            com.google.protobuf.MessageLite r5 = r5.b(r3)     // Catch: java.lang.Throwable -> L35
            r4.k(r5)     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.lang.Throwable -> L33
            goto L1c
        L33:
            r3 = move-exception
            goto L3b
        L35:
            r4 = move-exception
            mw.k1.b(r3)     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L33
        L3a:
            return
        L3b:
            java.util.logging.Logger r4 = mw.k1.f42487a
        L3d:
            java.io.InputStream r4 = r0.u()
            if (r4 == 0) goto L47
            mw.k1.b(r4)
            goto L3d
        L47:
            lw.q1 r0 = lw.q1.f40435f
            lw.q1 r0 = r0.g(r3)
            java.lang.String r3 = "Failed to read message."
            lw.q1 r0 = r0.h(r3)
            r1.f56175c = r0
            mw.w r1 = r2.f42739l
            r1.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.r.c():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xq.c cVar, dm.a aVar) {
        super(((v) cVar.f56176d).f42735h, 0);
        this.f42653d = cVar;
        this.f42654e = aVar;
    }
}
