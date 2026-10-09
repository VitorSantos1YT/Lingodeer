package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a4 extends xy.i implements fz.e {
    public final /* synthetic */ float H;
    public final /* synthetic */ boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f49433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f49435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49437f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f49438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, int i11, int i12, int i13, int i14, int i15, float f5, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f49433b = b4Var;
        this.f49434c = i11;
        this.f49435d = i12;
        this.f49436e = i13;
        this.f49437f = i14;
        this.f49438t = i15;
        this.H = f5;
        this.K = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new a4(this.f49433b, this.f49434c, this.f49435d, this.f49436e, this.f49437f, this.f49438t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a4) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (((fr.o0) r10).B(r9.K, r9) == r0) goto L39;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
