package mu;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f42161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, vy.d dVar) {
        super(2, dVar);
        this.f42161b = xVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new q(this.f42161b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r5 == r3) goto L27;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r10 = this;
            mu.x r0 = r10.f42161b
            uz.i1 r1 = r0.K
            vt.n0 r2 = r0.f42183b
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r10.f42160a
            qy.b0 r5 = qy.b0.f48488a
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L25
            if (r4 == r7) goto L21
            if (r4 != r6) goto L19
            com.bumptech.glide.e.F(r11)
            goto L91
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            com.bumptech.glide.e.F(r11)
            goto L3a
        L25:
            com.bumptech.glide.e.F(r11)
            dv.u0 r11 = r0.f42185d
            r4 = r2
            fr.o0 r4 = (fr.o0) r4
            java.lang.String r4 = r4.w()
            r10.f42160a = r7
            java.lang.Object r11 = r11.j(r4, r10)
            if (r11 != r3) goto L3a
            goto L90
        L3a:
            com.lingodeer.network.model.ApiResponse r11 = (com.lingodeer.network.model.ApiResponse) r11
            boolean r4 = r11 instanceof com.lingodeer.network.model.ApiResponse.Error
            if (r4 == 0) goto L53
        L40:
            java.lang.Object r11 = r1.getValue()
            r0 = r11
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r11 = r1.j(r11, r0)
            if (r11 == 0) goto L40
            goto La3
        L53:
            boolean r4 = r11 instanceof com.lingodeer.network.model.ApiResponse.Success
            if (r4 == 0) goto La4
            uz.i1 r4 = r0.O
        L59:
            java.lang.Object r7 = r4.getValue()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            r8 = r11
            com.lingodeer.network.model.ApiResponse$Success r8 = (com.lingodeer.network.model.ApiResponse.Success) r8
            java.lang.Object r8 = r8.getData()
            com.lingodeer.network.model.GemAppendBySomeReasonResponse r8 = (com.lingodeer.network.model.GemAppendBySomeReasonResponse) r8
            int r8 = r8.getReason_grant_gem_amount()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            boolean r7 = r4.j(r7, r9)
            if (r7 == 0) goto L59
            fr.o0 r2 = (fr.o0) r2
            com.lingodeer.data.env.Env r11 = r2.f27733a
            boolean r11 = r11.isUnloginUser()
            if (r11 != 0) goto L91
            vt.c r11 = r0.f42184c
            r10.f42160a = r6
            vt.d r11 = (vt.d) r11
            r11.n(r10)
            if (r5 != r3) goto L91
        L90:
            return r3
        L91:
            java.lang.Object r11 = r1.getValue()
            r0 = r11
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r11 = r1.j(r11, r0)
            if (r11 == 0) goto L91
        La3:
            return r5
        La4:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
