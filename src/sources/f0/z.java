package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends xy.h implements fz.e {
    public float H;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ fz.a M;
    public final /* synthetic */ kotlin.jvm.internal.x N;
    public final /* synthetic */ h1 O;
    public final /* synthetic */ fz.f P;
    public final /* synthetic */ fz.e Q;
    public final /* synthetic */ fz.a R;
    public final /* synthetic */ fz.c S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f26506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.x f26507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.e f26508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s2.t f26509f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f26510t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fz.a aVar, kotlin.jvm.internal.x xVar, h1 h1Var, fz.f fVar, fz.e eVar, fz.a aVar2, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.M = aVar;
        this.N = xVar;
        this.O = h1Var;
        this.P = fVar;
        this.Q = eVar;
        this.R = aVar2;
        this.S = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        z zVar = new z(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, dVar);
        zVar.L = obj;
        return zVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x016b  */
    /* JADX WARN: Code duplicated, block: B:235:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f2 A[LOOP:8: B:34:0x01d6->B:38:0x01f2, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0332 -> B:111:0x0335). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x033a -> B:114:0x0351). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x03d3 -> B:149:0x03fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x03f8 -> B:149:0x03fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x041d -> B:153:0x0421). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0435 -> B:80:0x0292). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0490 -> B:169:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0194 -> B:28:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01ff -> B:28:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0206 -> B:28:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x022a -> B:28:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0246 -> B:73:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x024d -> B:30:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0272 -> B:70:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02f4 -> B:86:0x02b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
