package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4646a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4651f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f4652t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i11, kr.l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.H = l1Var;
        this.f4650e = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4646a) {
            case 0:
                return new j0((ep.c) this.f4651f, (x1.p) this.f4652t, (l0.w) this.H, dVar);
            case 1:
                return new j0((fr.i) this.H, dVar);
            default:
                return new j0(this.f4650e, (kr.l1) this.H, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4646a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0201  */
    /* JADX WARN: Code duplicated, block: B:58:0x0220  */
    /* JADX WARN: Code duplicated, block: B:61:0x023f  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:14:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0007
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ep.c cVar, x1.p pVar, l0.w wVar, vy.d dVar) {
        super(2, dVar);
        this.f4651f = cVar;
        this.f4652t = pVar;
        this.H = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(fr.i iVar, vy.d dVar) {
        super(2, dVar);
        this.H = iVar;
    }
}
