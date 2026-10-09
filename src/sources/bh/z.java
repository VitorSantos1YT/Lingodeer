package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4439a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i11, long j11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4442d = i11;
        this.f4440b = j11;
        this.f4444f = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4439a) {
            case 0:
                z zVar = new z(this.f4442d, this.f4440b, (a1) this.f4444f, dVar);
                zVar.f4443e = obj;
                return zVar;
            case 1:
                return new z((nu.e) this.f4443e, this.f4442d, (g2.k) this.f4444f, dVar);
            default:
                return new z((a9.i) this.f4444f, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4439a) {
            case 0:
                return ((z) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((z) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((z) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #2 {, blocks: (B:26:0x0065, B:28:0x007c), top: B:122:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: Exception -> 0x003d, CancellationException -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0040, Exception -> 0x003d, blocks: (B:38:0x0094, B:13:0x0038), top: B:124:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[LOOP:0: B:37:0x0092->B:41:0x00a3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005a -> B:24:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008e -> B:37:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:45:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a9.i iVar, vy.d dVar) {
        super(2, dVar);
        this.f4444f = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(nu.e eVar, int i11, g2.k kVar, vy.d dVar) {
        super(2, dVar);
        this.f4443e = eVar;
        this.f4442d = i11;
        this.f4444f = kVar;
    }
}
