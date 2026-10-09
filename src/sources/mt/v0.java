package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.w f41975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41976f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41977t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(boolean z11, String str, l0.w wVar, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f41971a = i11;
        this.f41973c = z11;
        this.f41974d = str;
        this.f41975e = wVar;
        this.f41976f = b1Var;
        this.f41977t = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41971a) {
            case 0:
                return new v0(this.f41973c, this.f41974d, this.f41975e, this.f41976f, this.f41977t, dVar, 0);
            default:
                return new v0(this.f41973c, this.f41974d, this.f41975e, this.f41976f, this.f41977t, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f41971a) {
            case 0:
                break;
        }
        return ((v0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r7.j(0, 0, r14) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r7.j(0, 0, r14) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r7.j(r2, r8, r14) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        if (r7.j(0, 0, r14) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        if (r7.j(0, 0, r14) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0161, code lost:
    
        if (r7.j(r2, r8, r14) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r0;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
