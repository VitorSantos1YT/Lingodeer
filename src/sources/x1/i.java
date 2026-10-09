package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f55675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f55679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f55680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, vy.d dVar) {
        super(2, dVar);
        this.f55680f = jVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        i iVar = new i(this.f55680f, dVar);
        iVar.f55679e = obj;
        return iVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:32:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a8 -> B:32:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d4 -> B:44:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:43:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
