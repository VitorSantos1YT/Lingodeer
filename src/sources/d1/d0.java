package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f22886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i11, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f22883a = i11;
        this.f22886d = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22883a) {
            case 0:
                d0 d0Var = new d0(0, this.f22886d, dVar);
                d0Var.f22885c = obj;
                return d0Var;
            default:
                d0 d0Var2 = new d0(1, this.f22886d, dVar);
                d0Var2.f22885c = obj;
                return d0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        s2.b bVar = (s2.b) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22883a) {
            case 0:
                break;
        }
        return ((d0) create(bVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008f -> B:34:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f22883a
            fz.c r1 = r7.f22886d
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L63;
                default: goto La;
            }
        La:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r4 = r7.f22884b
            r5 = 2
            if (r4 == 0) goto L27
            if (r4 == r3) goto L1f
            if (r4 != r5) goto L19
            com.bumptech.glide.e.F(r8)
            goto L59
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
            throw r8
        L1f:
            java.lang.Object r2 = r7.f22885c
            s2.b r2 = (s2.b) r2
            com.bumptech.glide.e.F(r8)
            goto L3a
        L27:
            com.bumptech.glide.e.F(r8)
            java.lang.Object r8 = r7.f22885c
            r2 = r8
            s2.b r2 = (s2.b) r2
            r7.f22885c = r2
            r7.f22884b = r3
            java.lang.Object r8 = fb.g0.e(r2, r7)
            if (r8 != r0) goto L3a
            goto L62
        L3a:
            s2.t r8 = (s2.t) r8
            r8.a()
            long r3 = r8.f51345c
            f2.b r8 = new f2.b
            r8.<init>(r3)
            r1.invoke(r8)
            r8 = 0
            r7.f22885c = r8
            r7.f22884b = r5
            ad.a0 r8 = f0.s2.f26428a
            s2.m r8 = s2.m.Main
            java.lang.Object r8 = f0.s2.h(r2, r8, r7)
            if (r8 != r0) goto L59
            goto L62
        L59:
            s2.t r8 = (s2.t) r8
            if (r8 == 0) goto L60
            r8.a()
        L60:
            qy.b0 r0 = qy.b0.f48488a
        L62:
            return r0
        L63:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r4 = r7.f22884b
            if (r4 == 0) goto L79
            if (r4 != r3) goto L73
            java.lang.Object r2 = r7.f22885c
            s2.b r2 = (s2.b) r2
            com.bumptech.glide.e.F(r8)
            goto L92
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
            throw r8
        L79:
            com.bumptech.glide.e.F(r8)
            java.lang.Object r8 = r7.f22885c
            s2.b r8 = (s2.b) r8
        L80:
            s2.m r2 = s2.m.Initial
            r7.f22885c = r8
            r7.f22884b = r3
            s2.k0 r8 = (s2.k0) r8
            java.lang.Object r2 = r8.b(r2, r7)
            if (r2 != r0) goto L8f
            return r0
        L8f:
            r6 = r2
            r2 = r8
            r8 = r6
        L92:
            s2.l r8 = (s2.l) r8
            boolean r8 = ub.a.W(r8)
            r8 = r8 ^ r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1.invoke(r8)
            r8 = r2
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
