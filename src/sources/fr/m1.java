package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(v1 v1Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f27696c = v1Var;
        this.f27697d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        m1 m1Var = new m1(this.f27696c, this.f27697d, dVar);
        m1Var.f27695b = obj;
        return m1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        if (r15 == r1) goto L25;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f27695b
            rz.b0 r0 = (rz.b0) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r14.f27694a
            fr.v1 r3 = r14.f27696c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L26
            if (r2 == r5) goto L21
            if (r2 != r4) goto L19
            com.bumptech.glide.e.F(r15)
            r13 = r14
            goto Lb9
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            com.bumptech.glide.e.F(r15)
            r13 = r14
            goto L6a
        L26:
            com.bumptech.glide.e.F(r15)
            dv.u0 r7 = r3.f27913d
            r14.f27695b = r0
            r14.f27694a = r5
            java.lang.String r15 = "emailornickname"
            java.lang.String r2 = r14.f27697d
            com.google.gson.JsonObject r15 = ep.a.c(r15, r2)
            java.lang.String r2 = r7.f24526e
            hv.a r2 = b7.e0.i(r7, r15, r2)
            java.lang.String r5 = "toJson(...)"
            qy.l r15 = nv.p.y(r15, r5, r2)
            java.lang.Object r2 = r15.f48496b
            qy.l r2 = (qy.l) r2
            java.lang.Object r5 = r2.f48495a
            r8 = r5
            javax.crypto.SecretKey r8 = (javax.crypto.SecretKey) r8
            java.lang.Object r2 = r2.f48496b
            r9 = r2
            javax.crypto.SecretKey r9 = (javax.crypto.SecretKey) r9
            java.lang.Object r15 = r15.f48495a
            com.google.gson.JsonObject r15 = (com.google.gson.JsonObject) r15
            com.lingodeer.network.NetworkClient$userSearchFriends$2 r10 = new com.lingodeer.network.NetworkClient$userSearchFriends$2
            r10.<init>()
            dv.p0 r12 = new dv.p0
            r2 = 23
            r12.<init>(r7, r15, r6, r2)
            r11 = 0
            r13 = r14
            java.lang.Object r15 = r7.v(r8, r9, r10, r11, r12, r13)
            if (r15 != r1) goto L6a
            goto Lb8
        L6a:
            com.lingodeer.network.model.ApiResponse r15 = (com.lingodeer.network.model.ApiResponse) r15
            boolean r2 = r15 instanceof com.lingodeer.network.model.ApiResponse.Error
            if (r2 == 0) goto L73
            ry.r r15 = ry.r.f50854a
            return r15
        L73:
            boolean r2 = r15 instanceof com.lingodeer.network.model.ApiResponse.Success
            if (r2 == 0) goto Lbc
            com.lingodeer.network.model.ApiResponse$Success r15 = (com.lingodeer.network.model.ApiResponse.Success) r15
            java.lang.Object r15 = r15.getData()
            com.lingodeer.network.model.UserSearchFriendsResponse r15 = (com.lingodeer.network.model.UserSearchFriendsResponse) r15
            java.util.List r15 = r15.getUsers()
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = ry.n.W(r15, r5)
            r2.<init>(r5)
            java.util.Iterator r15 = r15.iterator()
        L92:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r15.next()
            com.lingodeer.network.model.SearchUser r5 = (com.lingodeer.network.model.SearchUser) r5
            b0.x0 r7 = new b0.x0
            r8 = 8
            r7.<init>(r8, r5, r3, r6)
            r5 = 3
            rz.i0 r5 = rz.e0.f(r0, r6, r6, r7, r5)
            r2.add(r5)
            goto L92
        Lae:
            r13.f27695b = r6
            r13.f27694a = r4
            java.lang.Object r15 = rz.e0.g(r2, r14)
            if (r15 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            java.util.List r15 = (java.util.List) r15
            return r15
        Lbc:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
