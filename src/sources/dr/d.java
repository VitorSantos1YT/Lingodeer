package dr;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f23522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23519a = i11;
        this.f23522d = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23519a) {
            case 0:
                d dVar2 = new d(this.f23522d, dVar, 0);
                dVar2.f23521c = obj;
                return dVar2;
            case 1:
                d dVar3 = new d(this.f23522d, dVar, 1);
                dVar3.f23521c = obj;
                return dVar3;
            default:
                d dVar4 = new d(this.f23522d, dVar, 2);
                dVar4.f23521c = obj;
                return dVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23519a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:110:0x0412  */
    /* JADX WARN: Code duplicated, block: B:131:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x039b  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0437, code lost:
    
        if (r2.c(r0, r45) == r11) goto L115;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
