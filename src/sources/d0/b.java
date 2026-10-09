package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.l1 f22636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0.i f22638f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f22639t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f0.l1 l1Var, long j11, h0.i iVar, f fVar, vy.d dVar) {
        super(2, dVar);
        this.f22636d = l1Var;
        this.f22637e = j11;
        this.f22638f = iVar;
        this.f22639t = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        b bVar = new b(this.f22636d, this.f22637e, this.f22638f, this.f22639t, dVar);
        bVar.f22635c = obj;
        return bVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r15.a(r2, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r15.a(r3, r17) == r1) goto L40;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
