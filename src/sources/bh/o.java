package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f4310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f4310c = tVar;
        this.f4311d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        o oVar = new o(this.f4310c, this.f4311d, dVar);
        oVar.f4309b = obj;
        return oVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x015c, code lost:
    
        if (r0.emit(r10, r20) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0258, code lost:
    
        if (r0.emit(r8, r20) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025a, code lost:
    
        return r2;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
