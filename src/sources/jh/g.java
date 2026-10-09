package jh;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, vy.d dVar) {
        super(2, dVar);
        this.f36356d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        g gVar = new g(this.f36356d, dVar);
        gVar.f36355c = obj;
        return gVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r1.emit(r0, r9) == r2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Android-"
            java.lang.Object r1 = r9.f36355c
            uz.j r1 = (uz.j) r1
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r9.f36354b
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L33
            if (r3 == r7) goto L2d
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1b
            com.bumptech.glide.e.F(r10)
            goto Lbf
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            int r0 = r9.f36353a
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Exception -> L2a
            goto L9c
        L2a:
            r10 = move-exception
            goto La6
        L2d:
            int r0 = r9.f36353a
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Exception -> L2a
            goto L77
        L33:
            com.bumptech.glide.e.F(r10)
            com.google.gson.JsonObject r10 = new com.google.gson.JsonObject     // Catch: java.lang.Exception -> La4
            r10.<init>()     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = r9.f36356d     // Catch: java.lang.Exception -> La4
            java.lang.String r8 = "uid"
            r10.addProperty(r8, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = "appversion"
            int[] r8 = bq.r.f4959a     // Catch: java.lang.Exception -> La4
            java.lang.String r8 = bq.m.d()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.concat(r8)     // Catch: java.lang.Exception -> La4
            r10.addProperty(r3, r0)     // Catch: java.lang.Exception -> La4
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> La4
            r0.<init>()     // Catch: java.lang.Exception -> La4
            com.lingo.fluent.object.SyncProgress r3 = th.j.g()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.toJson(r3)     // Catch: java.lang.Exception -> La4
            com.google.gson.JsonElement r0 = com.google.gson.JsonParser.parseString(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = "progress"
            r10.add(r3, r0)     // Catch: java.lang.Exception -> La4
            rl.h r0 = rl.h.f49283a     // Catch: java.lang.Exception -> La4
            r9.f36355c = r1     // Catch: java.lang.Exception -> La4
            r9.f36353a = r7     // Catch: java.lang.Exception -> La4
            r9.f36354b = r7     // Catch: java.lang.Exception -> La4
            java.lang.Object r10 = r0.e(r10, r9)     // Catch: java.lang.Exception -> La4
            if (r10 != r2) goto L76
            goto Lbe
        L76:
            r0 = r7
        L77:
            com.lingodeer.network.model.ApiResponse r10 = (com.lingodeer.network.model.ApiResponse) r10     // Catch: java.lang.Exception -> L2a
            boolean r3 = r10 instanceof com.lingodeer.network.model.ApiResponse.Error     // Catch: java.lang.Exception -> L2a
            if (r3 == 0) goto L7f
            r10 = r4
            goto Laa
        L7f:
            boolean r3 = r10 instanceof com.lingodeer.network.model.ApiResponse.Success     // Catch: java.lang.Exception -> L2a
            if (r3 == 0) goto L9e
            com.lingodeer.network.model.ApiResponse$Success r10 = (com.lingodeer.network.model.ApiResponse.Success) r10     // Catch: java.lang.Exception -> L2a
            java.lang.Object r10 = r10.getData()     // Catch: java.lang.Exception -> L2a
            com.lingo.lingoskill.http.model.ProgressFluentLearnSyncResponse r10 = (com.lingo.lingoskill.http.model.ProgressFluentLearnSyncResponse) r10     // Catch: java.lang.Exception -> L2a
            com.lingo.fluent.object.SyncProgress r10 = r10.getProgress()     // Catch: java.lang.Exception -> L2a
            r9.f36355c = r1     // Catch: java.lang.Exception -> L2a
            r9.f36353a = r0     // Catch: java.lang.Exception -> L2a
            r9.f36354b = r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r10 = th.j.o(r10, r9)     // Catch: java.lang.Exception -> L2a
            if (r10 != r2) goto L9c
            goto Lbe
        L9c:
            r10 = r7
            goto Laa
        L9e:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2a
            r10.<init>()     // Catch: java.lang.Exception -> L2a
            throw r10     // Catch: java.lang.Exception -> L2a
        La4:
            r10 = move-exception
            r0 = r7
        La6:
            r10.printStackTrace()
            r10 = r0
        Laa:
            if (r10 == 0) goto Lad
            r4 = r7
        Lad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3 = 0
            r9.f36355c = r3
            r9.f36353a = r10
            r9.f36354b = r5
            java.lang.Object r10 = r1.emit(r0, r9)
            if (r10 != r2) goto Lbf
        Lbe:
            return r2
        Lbf:
            qy.b0 r10 = qy.b0.f48488a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
