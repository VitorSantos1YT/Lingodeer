package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class kb extends xy.i implements fz.g {
    public final /* synthetic */ vt.n0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f49983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ qy.l f49986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f49987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ fb f49988f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ mb f49989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(mb mbVar, vt.n0 n0Var, vy.d dVar) {
        super(4, dVar);
        this.f49989t = mbVar;
        this.H = n0Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        kb kbVar = new kb(this.f49989t, this.H, (vy.d) obj4);
        kbVar.f49986d = (qy.l) obj;
        kbVar.f49987e = iIntValue;
        kbVar.f49988f = (fb) obj3;
        return kbVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (rt.ia.a(r2, (java.util.List) r3, r7, r34) == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
    
        if (r4 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
    
        if (rz.e0.m(300, r34) == r6) goto L50;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.kb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
