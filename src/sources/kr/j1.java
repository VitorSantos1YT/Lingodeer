package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xy.i implements fz.e {
    public final /* synthetic */ l1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uz.i1 f38501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a1 f38502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38505f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f38506t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(a1 a1Var, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f38500a = 1;
        this.f38506t = a1Var;
        this.H = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38500a) {
            case 0:
                return new j1(this.H, this.f38506t, dVar, 0);
            case 1:
                return new j1(this.f38506t, this.H, dVar);
            case 2:
                return new j1(this.H, this.f38506t, dVar, 2);
            default:
                return new j1(this.H, this.f38506t, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38500a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((j1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0313  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0311 -> B:111:0x0315). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:19:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01b7 -> B:55:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0226 -> B:78:0x022b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:110:0x0313
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(l1 l1Var, a1 a1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38500a = i11;
        this.H = l1Var;
        this.f38506t = a1Var;
    }
}
