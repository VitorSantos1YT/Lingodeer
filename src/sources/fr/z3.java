package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4 f28005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(x4 x4Var, vy.d dVar) {
        super(2, dVar);
        this.f28005b = x4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new z3(this.f28005b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:13:0x0022, B:28:0x006d, B:31:0x0074, B:33:0x0078, B:36:0x0087, B:42:0x009b, B:43:0x00a0, B:14:0x0026, B:20:0x003c, B:22:0x0044, B:25:0x004c, B:17:0x0033), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:13:0x0022, B:28:0x006d, B:31:0x0074, B:33:0x0078, B:36:0x0087, B:42:0x009b, B:43:0x00a0, B:14:0x0026, B:20:0x003c, B:22:0x0044, B:25:0x004c, B:17:0x0033), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:13:0x0022, B:28:0x006d, B:31:0x0074, B:33:0x0078, B:36:0x0087, B:42:0x009b, B:43:0x00a0, B:14:0x0026, B:20:0x003c, B:22:0x0044, B:25:0x004c, B:17:0x0033), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:13:0x0022, B:28:0x006d, B:31:0x0074, B:33:0x0078, B:36:0x0087, B:42:0x009b, B:43:0x00a0, B:14:0x0026, B:20:0x003c, B:22:0x0044, B:25:0x004c, B:17:0x0033), top: B:46:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (fr.x4.e(r6, r9) == r0) goto L38;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r9.f28004a
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            fr.x4 r6 = r9.f28005b
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Throwable -> L17
            goto L90
        L17:
            r10 = move-exception
            goto La1
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Throwable -> L17
            goto L6d
        L26:
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Throwable -> L17
            goto L3c
        L2a:
            com.bumptech.glide.e.F(r10)
            gq.k r10 = r6.f27973f
            gq.w r10 = r10.b(r5)
            r9.f28004a = r5     // Catch: java.lang.Throwable -> L17
            java.lang.Object r10 = fr.x4.b(r6, r10, r4, r9)     // Catch: java.lang.Throwable -> L17
            if (r10 != r0) goto L3c
            goto L8f
        L3c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L17
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L4c
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L17
            gq.k r0 = r6.f27973f
            r0.c()
            return r10
        L4c:
            dv.u0 r10 = r6.f27971d     // Catch: java.lang.Throwable -> L17
            vt.n0 r1 = r6.f27970c     // Catch: java.lang.Throwable -> L17
            r7 = r1
            fr.o0 r7 = (fr.o0) r7     // Catch: java.lang.Throwable -> L17
            java.lang.String r7 = r7.w()     // Catch: java.lang.Throwable -> L17
            r8 = r1
            fr.o0 r8 = (fr.o0) r8     // Catch: java.lang.Throwable -> L17
            java.lang.String r8 = r8.q()     // Catch: java.lang.Throwable -> L17
            fr.o0 r1 = (fr.o0) r1     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r1.g()     // Catch: java.lang.Throwable -> L17
            r9.f28004a = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r10 = r10.C(r7, r8, r1, r9)     // Catch: java.lang.Throwable -> L17
            if (r10 != r0) goto L6d
            goto L8f
        L6d:
            com.lingodeer.network.model.ApiResponse r10 = (com.lingodeer.network.model.ApiResponse) r10     // Catch: java.lang.Throwable -> L17
            boolean r1 = r10 instanceof com.lingodeer.network.model.ApiResponse.Error     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L74
            goto L91
        L74:
            boolean r1 = r10 instanceof com.lingodeer.network.model.ApiResponse.Success     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L9b
            com.lingodeer.network.model.ApiResponse$Success r10 = (com.lingodeer.network.model.ApiResponse.Success) r10     // Catch: java.lang.Throwable -> L17
            java.lang.Object r10 = r10.getData()     // Catch: java.lang.Throwable -> L17
            com.lingodeer.network.model.BooleanResponse r10 = (com.lingodeer.network.model.BooleanResponse) r10     // Catch: java.lang.Throwable -> L17
            boolean r10 = r10.getSuccess()     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L87
            goto L91
        L87:
            r9.f28004a = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r10 = fr.x4.e(r6, r9)     // Catch: java.lang.Throwable -> L17
            if (r10 != r0) goto L90
        L8f:
            return r0
        L90:
            r4 = r5
        L91:
            gq.k r10 = r6.f27973f
            r10.c()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        L9b:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L17
            r10.<init>()     // Catch: java.lang.Throwable -> L17
            throw r10     // Catch: java.lang.Throwable -> L17
        La1:
            gq.k r0 = r6.f27973f
            r0.c()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
