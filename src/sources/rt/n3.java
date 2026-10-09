package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4 f50120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(int i11, b4 b4Var, vy.d dVar) {
        super(2, dVar);
        this.f50118a = i11;
        this.f50120c = b4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50118a) {
            case 0:
                return new n3(0, this.f50120c, dVar);
            case 1:
                return new n3(1, this.f50120c, dVar);
            case 2:
                return new n3(2, this.f50120c, dVar);
            default:
                return new n3(3, this.f50120c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50118a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((n3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0326 A[LOOP:2: B:122:0x0320->B:124:0x0326, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e5, code lost:
    
        if (r4 == r15) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.n3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
