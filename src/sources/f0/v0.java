package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26461a = i11;
        this.f26465e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fz.e, xy.h] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26461a) {
            case 0:
                v0 v0Var = new v0((vy.i) this.f26464d, (fz.e) this.f26465e, dVar);
                v0Var.f26462b = obj;
                return v0Var;
            case 1:
                v0 v0Var2 = new v0((cr.n) this.f26465e, dVar, 1);
                v0Var2.f26464d = obj;
                return v0Var2;
            case 2:
                v0 v0Var3 = new v0((s2.m) this.f26464d, (kotlin.jvm.internal.y) this.f26465e, dVar);
                v0Var3.f26462b = obj;
                return v0Var3;
            default:
                v0 v0Var4 = new v0((s0.a1) this.f26465e, dVar, 3);
                v0Var4.f26462b = obj;
                return v0Var4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26461a) {
            case 0:
                return ((v0) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((v0) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((v0) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((v0) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(s2.m mVar, kotlin.jvm.internal.y yVar, vy.d dVar) {
        super(2, dVar);
        this.f26461a = 2;
        this.f26464d = mVar;
        this.f26465e = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ed A[Catch: CancellationException -> 0x01d4, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01d4, blocks: (B:107:0x01ed, B:110:0x01fc, B:96:0x01d0, B:101:0x01db), top: B:121:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [fz.e, xy.h] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0206 -> B:105:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0219 -> B:105:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0130 -> B:60:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019e -> B:84:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01a1 -> B:84:0x01a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(vy.i iVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f26461a = 0;
        this.f26464d = iVar;
        this.f26465e = (xy.h) eVar;
    }
}
