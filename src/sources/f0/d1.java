package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends xy.i implements fz.e {
    public final /* synthetic */ kotlin.jvm.internal.y H;
    public final /* synthetic */ float K;
    public final /* synthetic */ g1 L;
    public final /* synthetic */ float M;
    public final /* synthetic */ i2 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.u f26229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.u f26230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f26233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f26234f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f26235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, float f5, g1 g1Var, float f11, i2 i2Var, vy.d dVar) {
        super(2, dVar);
        this.f26234f = vVar;
        this.f26235t = yVar;
        this.H = yVar2;
        this.K = f5;
        this.L = g1Var;
        this.M = f11;
        this.N = i2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        d1 d1Var = new d1(this.f26234f, this.f26235t, this.H, this.K, this.L, this.M, this.N, dVar);
        d1Var.f26233e = obj;
        return d1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((g2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x0094  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0185 -> B:37:0x0186). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
