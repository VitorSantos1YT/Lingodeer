package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f39327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, vy.d dVar) {
        super(2, dVar);
        this.f39327f = lVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        k kVar = new k(this.f39327f, dVar);
        kVar.f39326e = obj;
        return kVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0113  */
    /* JADX WARN: Code duplicated, block: B:25:0x0138  */
    /* JADX WARN: Code duplicated, block: B:26:0x0147  */
    /* JADX WARN: Code duplicated, block: B:29:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0171  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0171 -> B:31:0x0173). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
