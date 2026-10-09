package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f49601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f49602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49599a = i11;
        this.f49601c = e0Var;
        this.f49602d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49599a) {
            case 0:
                return new d0(this.f49601c, this.f49602d, dVar, 0);
            default:
                return new d0(this.f49601c, this.f49602d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49599a) {
            case 0:
                break;
        }
        return ((d0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f49599a
            java.lang.String r1 = r9.f49602d
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            rt.e0 r3 = r9.f49601c
            r4 = 1
            qy.b0 r5 = qy.b0.f48488a
            r6 = 0
            switch(r0) {
                case 0: goto L61;
                default: goto Lf;
            }
        Lf:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r7 = r9.f49600b
            r8 = 2
            if (r7 == 0) goto L28
            if (r7 == r4) goto L24
            if (r7 != r8) goto L1e
            com.bumptech.glide.e.F(r10)
            goto L56
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L24:
            com.bumptech.glide.e.F(r10)
            goto L49
        L28:
            com.bumptech.glide.e.F(r10)
            vt.h r10 = r3.f49658a
            r9.f49600b = r4
            vt.r r10 = (vt.r) r10
            r10.getClass()
            yz.f r2 = rz.o0.f50940a
            yz.e r2 = yz.e.f58387a
            vt.k r4 = new vt.k
            r7 = 0
            r4.<init>(r10, r1, r6, r7)
            java.lang.Object r10 = rz.e0.M(r2, r4, r9)
            if (r10 != r0) goto L45
            goto L46
        L45:
            r10 = r5
        L46:
            if (r10 != r0) goto L49
            goto L54
        L49:
            vt.c r10 = r3.f49659b
            r9.f49600b = r8
            vt.d r10 = (vt.d) r10
            r10.j(r9)
            if (r5 != r0) goto L56
        L54:
            r5 = r0
            goto L60
        L56:
            uz.i1 r10 = r3.f49662e
            r10.getClass()
            rt.o r0 = rt.o.f50161a
            r10.l(r6, r0)
        L60:
            return r5
        L61:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r7 = r9.f49600b
            if (r7 == 0) goto L73
            if (r7 != r4) goto L6d
            com.bumptech.glide.e.F(r10)
            goto L88
        L6d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L73:
            com.bumptech.glide.e.F(r10)
            vt.h r10 = r3.f49658a
            java.lang.String r2 = r3.f49660c
            java.lang.String r7 = r3.f49661d
            r9.f49600b = r4
            vt.r r10 = (vt.r) r10
            java.lang.Object r10 = r10.b(r2, r7, r1, r9)
            if (r10 != r0) goto L88
            r5 = r0
            goto L96
        L88:
            vt.y r10 = (vt.y) r10
            uz.i1 r0 = r3.f49662e
            rt.p r10 = rt.ia.d(r10)
            r0.getClass()
            r0.l(r6, r10)
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
