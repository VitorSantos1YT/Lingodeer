package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30635f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30636t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(b0.d dVar, float f5, boolean z11, h0.h hVar, l1.b1 b1Var, vy.d dVar2) {
        super(2, dVar2);
        this.f30630a = 2;
        this.f30632c = dVar;
        this.f30633d = f5;
        this.f30634e = z11;
        this.f30635f = hVar;
        this.f30636t = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30630a) {
            case 0:
                return new m0((b0.d) this.f30632c, this.f30633d, this.f30634e, (n0) this.f30636t, (h0.h) this.f30635f, dVar, 0);
            case 1:
                return new m0((b0.d) this.f30632c, this.f30633d, this.f30634e, (u0) this.f30636t, (h0.h) this.f30635f, dVar, 1);
            case 2:
                return new m0((b0.d) this.f30632c, this.f30633d, this.f30634e, (h0.h) this.f30635f, (l1.b1) this.f30636t, dVar);
            default:
                return new m0((n) this.f30632c, this.f30633d, this.f30634e, (l1.b1) this.f30636t, (l1.b1) this.f30635f, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30630a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((m0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r10.e(r1, r15) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (i1.f0.a(r10, r5, r1, r9, r15) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r0;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, float f5, boolean z11, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30630a = i11;
        this.f30632c = obj;
        this.f30633d = f5;
        this.f30634e = z11;
        this.f30636t = obj2;
        this.f30635f = obj3;
    }
}
