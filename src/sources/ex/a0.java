package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends lx.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25955f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f25956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(bx.a aVar, Object obj, int i11) {
        super(aVar);
        this.f25955f = i11;
        this.f25956t = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.d(r4) != false) goto L23;
     */
    @Override // bx.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f25955f
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.f40500d
            if (r0 == 0) goto Lb
            r4 = 0
            goto L24
        Lb:
            java.lang.Object r0 = r3.f25956t     // Catch: java.lang.Throwable -> L1f
            yw.c r0 = (yw.c) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "The mapper function returned a null value."
            ax.d.a(r4, r0)     // Catch: java.lang.Throwable -> L1f
            bx.a r0 = r3.f40497a
            boolean r4 = r0.d(r4)
            goto L24
        L1f:
            r4 = move-exception
            r3.b(r4)
            r4 = 1
        L24:
            return r4
        L25:
            boolean r0 = r3.f40500d
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            int r0 = r3.f40501e
            bx.a r1 = r3.f40497a
            if (r0 == 0) goto L36
            r4 = 0
            boolean r4 = r1.d(r4)
            goto L50
        L36:
            r0 = 1
            java.lang.Object r2 = r3.f25956t     // Catch: java.lang.Throwable -> L4b
            yw.d r2 = (yw.d) r2     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L49
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto L49
        L47:
            r4 = r0
            goto L50
        L49:
            r4 = 0
            goto L50
        L4b:
            r4 = move-exception
            r3.b(r4)
            goto L47
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.a0.d(java.lang.Object):boolean");
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        switch (this.f25955f) {
            case 0:
                if (!d(obj)) {
                    this.f40498b.request(1L);
                }
                break;
            default:
                if (!this.f40500d) {
                    int i11 = this.f40501e;
                    bx.a aVar = this.f40497a;
                    if (i11 != 0) {
                        aVar.onNext(null);
                    } else {
                        try {
                            Object objApply = ((yw.c) this.f25956t).apply(obj);
                            ax.d.a(objApply, "The mapper function returned a null value.");
                            aVar.onNext(objApply);
                        } catch (Throwable th2) {
                            b(th2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // bx.g
    public final Object poll() {
        switch (this.f25955f) {
            case 0:
                bx.d dVar = this.f40499c;
                yw.d dVar2 = (yw.d) this.f25956t;
                while (true) {
                    Object objPoll = dVar.poll();
                    if (objPoll == null) {
                        return null;
                    }
                    if (dVar2.test(objPoll)) {
                        return objPoll;
                    }
                    if (this.f40501e == 2) {
                        dVar.request(1L);
                    }
                }
                break;
            default:
                Object objPoll2 = this.f40499c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((yw.c) this.f25956t).apply(objPoll2);
                ax.d.a(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
