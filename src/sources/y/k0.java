package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends xy.h implements fz.e {
    public long H;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ l0 M;
    public final /* synthetic */ nz.k N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nz.k f56726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f56727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f56728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56731f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56732t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, nz.k kVar, vy.d dVar) {
        super(2, dVar);
        this.M = l0Var;
        this.N = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        k0 k0Var = new k0(this.M, this.N, dVar);
        k0Var.L = obj;
        return k0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0094 -> B:20:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.K
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.f56732t
            int r6 = r0.f56731f
            long r7 = r0.H
            int r9 = r0.f56730e
            int r10 = r0.f56729d
            long[] r11 = r0.f56728c
            y.l0 r12 = r0.f56727b
            nz.k r13 = r0.f56726a
            java.lang.Object r14 = r0.L
            nz.m r14 = (nz.m) r14
            com.bumptech.glide.e.F(r22)
            goto L97
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            com.bumptech.glide.e.F(r22)
            java.lang.Object r2 = r0.L
            nz.m r2 = (nz.m) r2
            y.l0 r6 = r0.M
            y.j0 r7 = r6.f56735b
            long[] r7 = r7.f56720a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            nz.k r9 = r0.N
            r10 = 0
        L43:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L66:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f44331b = r15
            y.j0 r3 = r12.f56735b
            java.lang.Object[] r3 = r3.f56721b
            r3 = r3[r15]
            r0.L = r14
            r0.f56726a = r13
            r0.f56727b = r12
            r0.f56728c = r11
            r0.f56729d = r10
            r0.f56730e = r9
            r0.H = r7
            r0.f56731f = r6
            r0.f56732t = r2
            r0.K = r5
            wy.a r3 = r14.c(r3, r0)
            if (r3 != r1) goto L97
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L43
        La7:
            qy.b0 r1 = qy.b0.f48488a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
