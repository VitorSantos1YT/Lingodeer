package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uz.j f4417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f4421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z11, a1 a1Var, int i11, vy.d dVar) {
        super(2, dVar);
        this.f4420d = z11;
        this.f4421e = a1Var;
        this.f4422f = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        x xVar = new x(this.f4420d, this.f4421e, this.f4422f, dVar);
        xVar.f4419c = obj;
        return xVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r0.emit((com.lingodeer.data.model.LearnProgress) r11, r10) == r1) goto L33;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4419c
            uz.j r0 = (uz.j) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r10.f4418b
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            int r7 = r10.f4422f
            r8 = 0
            if (r2 == 0) goto L36
            if (r2 == r6) goto L30
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            uz.j r0 = r10.f4417a
            com.lingodeer.data.model.LearnProgress r0 = (com.lingodeer.data.model.LearnProgress) r0
            goto L2b
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            com.bumptech.glide.e.F(r11)
            goto L9a
        L2b:
            com.bumptech.glide.e.F(r11)
            goto La9
        L30:
            uz.j r0 = r10.f4417a
            com.bumptech.glide.e.F(r11)
            goto L65
        L36:
            com.bumptech.glide.e.F(r11)
            boolean r11 = r10.f4420d
            bh.a1 r2 = r10.f4421e
            if (r11 == 0) goto L86
            au.t0 r11 = r2.f4147a
            java.lang.String r2 = xt.d.k(r7)
            w9.s r11 = r11.f3072a
            java.lang.String r3 = "learn_progress"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            au.f r4 = new au.f
            r9 = 14
            r4.<init>(r2, r9)
            no.g r11 = qx.p.l(r11, r3, r4)
            r10.f4419c = r0
            r10.f4417a = r0
            r10.f4418b = r6
            java.lang.Object r11 = uz.x0.u(r11, r10)
            if (r11 != r1) goto L65
            goto La8
        L65:
            com.lingodeer.database.model.LearnProgressEntity r11 = (com.lingodeer.database.model.LearnProgressEntity) r11
            if (r11 == 0) goto L70
            com.lingodeer.data.model.LearnProgress r11 = com.lingodeer.data.model.LearnProgressKt.asExternalModel(r11)
            if (r11 == 0) goto L70
            goto L79
        L70:
            com.lingodeer.data.model.LearnProgress r11 = new com.lingodeer.data.model.LearnProgress
            java.lang.String r2 = xt.d.k(r7)
            r11.<init>(r2)
        L79:
            r10.f4419c = r8
            r10.f4417a = r8
            r10.f4418b = r5
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r1) goto La9
            goto La8
        L86:
            yz.f r11 = rz.o0.f50940a
            yz.e r11 = yz.e.f58387a
            bh.w r5 = new bh.w
            r5.<init>(r7, r2, r8)
            r10.f4419c = r0
            r10.f4418b = r4
            java.lang.Object r11 = rz.e0.M(r11, r5, r10)
            if (r11 != r1) goto L9a
            goto La8
        L9a:
            com.lingodeer.data.model.LearnProgress r11 = (com.lingodeer.data.model.LearnProgress) r11
            r10.f4419c = r8
            r10.f4417a = r8
            r10.f4418b = r3
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r1) goto La9
        La8:
            return r1
        La9:
            qy.b0 r11 = qy.b0.f48488a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
