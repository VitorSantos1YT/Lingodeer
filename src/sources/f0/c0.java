package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends xy.h implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f26215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26216f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f26217t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(fz.c cVar, fz.e eVar, fz.a aVar, fz.a aVar2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26211a = i11;
        this.f26215e = cVar;
        this.f26216f = eVar;
        this.f26217t = aVar;
        this.H = aVar2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [fz.f, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26211a) {
            case 0:
                c0 c0Var = new c0(this.f26215e, (fz.e) this.f26216f, (fz.a) this.f26217t, (fz.a) this.H, dVar, 0);
                c0Var.f26214d = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0((dv.e) this.f26215e, (ch.b0) this.f26216f, (dt.u2) this.f26217t, (cr.m) this.H, dVar, 1);
                c0Var2.f26214d = obj;
                return c0Var2;
            default:
                c0 c0Var3 = new c0((rz.b0) this.f26216f, (xy.i) this.f26217t, this.f26215e, (l1) this.H, dVar);
                c0Var3.f26214d = obj;
                return c0Var3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        s2.b bVar = (s2.b) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f26211a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c0) create(bVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r0 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e7, code lost:
    
        if (r0 == r14) goto L76;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [f0.b0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [f0.b0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [fz.f, xy.i] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(rz.b0 b0Var, fz.f fVar, fz.c cVar, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f26211a = 2;
        this.f26216f = b0Var;
        this.f26217t = (xy.i) fVar;
        this.f26215e = cVar;
        this.H = l1Var;
    }
}
