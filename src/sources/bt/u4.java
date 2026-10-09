package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u4 extends xy.i implements fz.e {
    public final /* synthetic */ l1.a1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f6068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6069f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f6070t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(boolean z11, l1.b3 b3Var, l1.b1 b1Var, l1.a1 a1Var, l1.a1 a1Var2, l1.b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.f6067d = z11;
        this.f6068e = b3Var;
        this.f6069f = b1Var;
        this.f6070t = a1Var;
        this.H = a1Var2;
        this.K = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new u4(this.f6067d, this.f6068e, this.f6069f, this.f6070t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u4) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:15:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r8.f6066c
            qy.b0 r2 = qy.b0.f48488a
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 != r5) goto L15
            int r1 = r8.f6065b
            int r6 = r8.f6064a
            com.bumptech.glide.e.F(r9)
            goto L4e
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            com.bumptech.glide.e.F(r9)
            l1.b3 r9 = r8.f6068e
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8f
            r6 = r3
            r1 = r4
        L30:
            if (r1 >= r6) goto L50
            com.lingo.lingoskill.object.a r9 = new com.lingo.lingoskill.object.a
            r7 = 28
            r9.<init>(r7)
            r8.f6064a = r6
            r8.f6065b = r1
            r8.f6066c = r5
            vy.i r7 = r8.getContext()
            l1.w0 r7 = l1.t.x(r7)
            java.lang.Object r9 = r7.p(r9, r8)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            int r1 = r1 + r5
            goto L30
        L50:
            l1.b1 r9 = r8.f6069f
            java.lang.Object r9 = r9.getValue()
            f2.c r9 = (f2.c) r9
            if (r9 == 0) goto L6e
            float r0 = r9.f26574c
            float r1 = r9.f26572a
            float r0 = r0 - r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6e
            float r0 = r9.f26575d
            float r9 = r9.f26573b
            float r0 = r0 - r9
            int r9 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r9 <= 0) goto L6e
            r4 = r5
        L6e:
            boolean r9 = r8.f6067d
            if (r9 != 0) goto L8f
            if (r4 == 0) goto L8f
            l1.a1 r9 = r8.f6070t
            l1.h1 r9 = (l1.h1) r9
            int r9 = r9.l()
            if (r9 <= r3) goto L8f
            l1.a1 r9 = r8.H
            l1.h1 r9 = (l1.h1) r9
            int r9 = r9.l()
            if (r9 >= r3) goto L8f
            l1.b1 r9 = r8.K
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.setValue(r0)
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.u4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
