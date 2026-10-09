package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f29576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z11, d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f29575c = z11;
        this.f29576d = dVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        c cVar = new c(this.f29575c, this.f29576d, dVar);
        cVar.f29574b = obj;
        return cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        return r2;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.InterruptedException {
        /*
            r10 = this;
            gq.d r0 = r10.f29576d
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r0.f29577a
            java.lang.Object r1 = r10.f29574b
            uz.j r1 = (uz.j) r1
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r10.f29573a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            com.bumptech.glide.e.F(r11)
            goto La2
        L22:
            com.bumptech.glide.e.F(r11)
            boolean r11 = r10.f29575c
            if (r11 == 0) goto L2c
            r6 = 1
            goto L2e
        L2c:
            r6 = 3600(0xe10, double:1.7786E-320)
        L2e:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder r11 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder
            r11.<init>()
            r11.a(r6)
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings r3 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
            r3.<init>(r11)
            java.util.concurrent.Executor r11 = r0.f20647c
            com.google.common.cache.a r6 = new com.google.common.cache.a
            r7 = 1
            r6.<init>(r7, r0, r3)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.call(r11, r6)
            com.google.android.gms.tasks.Tasks.await(r11)
            com.google.android.gms.tasks.Task r11 = r0.a()
            com.google.android.gms.tasks.Tasks.await(r11)
            com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl r11 = r0.c()
            int r11 = r11.f20774a
            r3 = -1
            r6 = 0
            if (r11 != r3) goto L95
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r11 = r0.f20648d
            com.google.android.gms.tasks.Task r11 = r11.b()
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r3 = r0.f20649e
            com.google.android.gms.tasks.Task r3 = r3.b()
            com.google.android.gms.tasks.Task[] r4 = new com.google.android.gms.tasks.Task[]{r11, r3}
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.whenAllComplete(r4)
            java.util.concurrent.Executor r7 = r0.f20647c
            com.google.firebase.crashlytics.internal.concurrency.a r8 = new com.google.firebase.crashlytics.internal.concurrency.a
            r9 = 1
            r8.<init>(r0, r11, r3, r9)
            com.google.android.gms.tasks.Task r11 = r4.continueWithTask(r7, r8)
            java.lang.Object r11 = com.google.android.gms.tasks.Tasks.await(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            com.lingo.lingoskill.object.MergedBillingThemeBillingPage r11 = c.a.v()
            r11.getBannerPicUrl()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.f29574b = r6
            r10.f29573a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r2) goto La2
            goto La1
        L95:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.f29574b = r6
            r10.f29573a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r2) goto La2
        La1:
            return r2
        La2:
            qy.b0 r11 = qy.b0.f48488a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
