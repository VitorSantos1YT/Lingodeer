package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f30627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, float f5, boolean z11, vy.d dVar) {
        super(1, dVar);
        this.f30627b = nVar;
        this.f30628c = f5;
        this.f30629d = z11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new m(this.f30627b, this.f30628c, this.f30629d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((m) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r15.e(r0, r14) == r2) goto L34;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            h1.n r0 = r14.f30627b
            h1.yb r1 = r0.f30706a
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r14.f30626a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            com.bumptech.glide.e.F(r15)
            return r15
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            com.bumptech.glide.e.F(r15)
            goto L96
        L21:
            com.bumptech.glide.e.F(r15)
            int r15 = r1.f()
            r6 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            float r3 = r14.f30628c
            if (r15 != 0) goto L59
            r15 = 1048971922(0x3e860a92, float:0.2617994)
            double r8 = (double) r15
            double r8 = r8 + r6
            double r6 = (double) r3
            double r6 = r6 + r8
            r15 = 1057360530(0x3f060a92, float:0.5235988)
            double r10 = (double) r15
            double r6 = r6 / r10
            int r6 = (int) r6
            r7 = 12
            int r6 = r6 % r7
            int r6 = r6 % r7
            float r6 = (float) r6
            float r6 = r6 * r15
            r0.f30707b = r6
            double r12 = (double) r6
            double r12 = r12 + r8
            double r12 = r12 / r10
            int r15 = (int) r12
            int r15 = r15 % r7
            int r15 = r15 % r7
            boolean r6 = r1.i()
            if (r6 == 0) goto L53
            goto L54
        L53:
            r7 = 0
        L54:
            int r15 = r15 + r7
            r1.b(r15)
            goto L75
        L59:
            r15 = 1029076816(0x3d567750, float:0.05235988)
            double r8 = (double) r15
            double r8 = r8 + r6
            double r6 = (double) r3
            double r6 = r6 + r8
            r15 = 1037465424(0x3dd67750, float:0.10471976)
            double r10 = (double) r15
            double r6 = r6 / r10
            int r6 = (int) r6
            int r6 = r6 % 60
            float r6 = (float) r6
            float r6 = r6 * r15
            r0.f30708c = r6
            double r6 = (double) r6
            double r6 = r6 + r8
            double r6 = r6 / r10
            int r15 = (int) r6
            int r15 = r15 % 60
            r1.c(r15)
        L75:
            boolean r15 = r14.f30629d
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r6 = 0
            r7 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r15 != 0) goto L99
            b0.d r15 = r0.f30709d
            float r3 = r3 + r7
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L88
            float r3 = r3 + r1
        L88:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r3)
            r14.f30626a = r5
            java.lang.Object r15 = r15.e(r0, r14)
            if (r15 != r2) goto L96
            goto Lc0
        L96:
            qy.b0 r15 = qy.b0.f48488a
            return r15
        L99:
            float r3 = r3 + r7
            int r15 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r15 >= 0) goto L9f
            float r3 = r3 + r1
        L9f:
            float r15 = r0.j(r3)
            b0.d r5 = r0.f30709d
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r15)
            r15 = 1143930880(0x442f0000, float:700.0)
            r0 = 4
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            b0.i1 r7 = b0.e.q(r1, r15, r3, r0)
            r14.f30626a = r4
            r8 = 0
            r10 = 12
            r9 = r14
            java.lang.Object r15 = b0.d.c(r5, r6, r7, r8, r9, r10)
            if (r15 != r2) goto Lc1
        Lc0:
            return r2
        Lc1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
