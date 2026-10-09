package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.t f26344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(s2.t tVar, vy.d dVar) {
        super(2, dVar);
        this.f26344d = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        k2 k2Var = new k2(this.f26344d, dVar);
        k2Var.f26343c = obj;
        return k2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r7.f26342b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f26341a
            java.lang.Object r1 = r7.f26343c
            s2.b r1 = (s2.b) r1
            com.bumptech.glide.e.F(r8)
            goto L42
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            com.bumptech.glide.e.F(r8)
            java.lang.Object r8 = r7.f26343c
            s2.b r8 = (s2.b) r8
            s2.t r1 = r7.f26344d
            long r3 = r1.f51344b
            s2.k0 r8 = (s2.k0) r8
            z2.p2 r1 = r8.e()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L34:
            r7.f26343c = r1
            r7.f26341a = r3
            r7.f26342b = r2
            r8 = 3
            java.lang.Object r8 = f0.s2.c(r1, r7, r8)
            if (r8 != r0) goto L42
            return r0
        L42:
            s2.t r8 = (s2.t) r8
            long r5 = r8.f51344b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L34
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
