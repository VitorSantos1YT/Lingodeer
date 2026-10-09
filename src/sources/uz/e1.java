package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j f53286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f53287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f53288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, vy.d dVar) {
        super(3, dVar);
        this.f53288d = f1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        e1 e1Var = new e1(this.f53288d, (vy.d) obj3);
        e1Var.f53286b = (j) obj;
        e1Var.f53287c = iIntValue;
        return e1Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[PHI: r1
      0x0064: PHI (r1v3 uz.j) = (r1v2 uz.j), (r1v6 uz.j) binds: [B:25:0x0061, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r8.f53285a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L30
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            uz.j r1 = r8.f53286b
            com.bumptech.glide.e.F(r9)
            goto L74
        L24:
            uz.j r1 = r8.f53286b
            com.bumptech.glide.e.F(r9)
            goto L64
        L2a:
            uz.j r1 = r8.f53286b
            com.bumptech.glide.e.F(r9)
            goto L57
        L30:
            com.bumptech.glide.e.F(r9)
            goto L82
        L34:
            com.bumptech.glide.e.F(r9)
            uz.j r1 = r8.f53286b
            int r9 = r8.f53287c
            if (r9 <= 0) goto L48
            uz.z0 r9 = uz.z0.START
            r8.f53285a = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L82
            goto L81
        L48:
            uz.f1 r9 = r8.f53288d
            long r6 = r9.f53296a
            r8.f53286b = r1
            r8.f53285a = r5
            java.lang.Object r9 = rz.e0.m(r6, r8)
            if (r9 != r0) goto L57
            goto L81
        L57:
            uz.z0 r9 = uz.z0.STOP
            r8.f53286b = r1
            r8.f53285a = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L64
            goto L81
        L64:
            r8.f53286b = r1
            r8.f53285a = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = rz.e0.m(r3, r8)
            if (r9 != r0) goto L74
            goto L81
        L74:
            uz.z0 r9 = uz.z0.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r8.f53286b = r3
            r8.f53285a = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L82
        L81:
            return r0
        L82:
            qy.b0 r9 = qy.b0.f48488a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
