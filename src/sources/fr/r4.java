package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4 f27818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(x4 x4Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f27818b = x4Var;
        this.f27819c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new r4(this.f27818b, this.f27819c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (((fr.o0) r15).d0(r12.f27819c, r14) == r0) goto L22;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r14 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r14.f27817a
            fr.x4 r2 = r14.f27818b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L6b
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L42
        L20:
            com.bumptech.glide.e.F(r15)
            r15 = r4
            dv.u0 r4 = r2.f27971d
            vt.n0 r1 = r2.f27970c
            fr.o0 r1 = (fr.o0) r1
            java.lang.String r5 = r1.w()
            r14.f27817a = r15
            java.lang.String r6 = ""
            java.lang.String r7 = r14.f27819c
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 2040(0x7f8, float:2.859E-42)
            r12 = r14
            java.lang.Object r15 = dv.u0.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L42
            goto L6a
        L42:
            com.lingodeer.network.model.ApiResponse r15 = (com.lingodeer.network.model.ApiResponse) r15
            boolean r1 = r15 instanceof com.lingodeer.network.model.ApiResponse.Error
            if (r1 == 0) goto L4a
            r15 = 0
            goto L5a
        L4a:
            boolean r1 = r15 instanceof com.lingodeer.network.model.ApiResponse.Success
            if (r1 == 0) goto L6e
            com.lingodeer.network.model.ApiResponse$Success r15 = (com.lingodeer.network.model.ApiResponse.Success) r15
            java.lang.Object r15 = r15.getData()
            com.lingodeer.network.model.BooleanResponse r15 = (com.lingodeer.network.model.BooleanResponse) r15
            boolean r15 = r15.getSuccess()
        L5a:
            if (r15 == 0) goto L6b
            vt.n0 r15 = r2.f27970c
            r12.f27817a = r3
            fr.o0 r15 = (fr.o0) r15
            java.lang.String r1 = r12.f27819c
            java.lang.Object r15 = r15.d0(r1, r14)
            if (r15 != r0) goto L6b
        L6a:
            return r0
        L6b:
            qy.b0 r15 = qy.b0.f48488a
            return r15
        L6e:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.r4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
