package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i11, int i12, b0.d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f4445a = 1;
        this.f4447c = i11;
        this.f4449e = dVar;
        this.f4448d = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4445a) {
            case 0:
                return new z0((a1) this.f4449e, this.f4447c, this.f4448d, dVar);
            case 1:
                return new z0(this.f4447c, this.f4448d, (b0.d) this.f4449e, dVar);
            case 2:
                z0 z0Var = new z0(this.f4447c, this.f4448d, dVar);
                z0Var.f4449e = obj;
                return z0Var;
            case 3:
                return new z0((nu.e) this.f4449e, dVar, 3);
            default:
                return new z0((tu.j) this.f4449e, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4445a) {
            case 0:
                return ((z0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((z0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((z0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((z0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((z0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x014f -> B:54:0x0152). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f4445a = 2;
        this.f4447c = i11;
        this.f4448d = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f4445a = 0;
        this.f4449e = a1Var;
        this.f4447c = i11;
        this.f4448d = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4445a = i11;
        this.f4449e = obj;
    }
}
