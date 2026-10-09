package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s2.l f26484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f26488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f26489f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f26490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.u uVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, vy.d dVar) {
        super(2, dVar);
        this.f26488e = uVar;
        this.f26489f = yVar;
        this.f26490t = yVar2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        x xVar = new x(this.f26488e, this.f26489f, this.f26490t, dVar);
        xVar.f26487d = obj;
        return xVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[LOOP:2: B:16:0x005a->B:20:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006d A[EDGE_INSN: B:74:0x006d->B:22:0x006d BREAK  A[LOOP:2: B:16:0x005a->B:20:0x0069], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b8 -> B:39:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
