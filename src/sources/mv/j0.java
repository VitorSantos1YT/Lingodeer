package mv;

import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ qy.l f42226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f42227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ fb f42228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f42229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fv.c f42230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, fv.c cVar, vy.d dVar) {
        super(4, dVar);
        this.f42229e = k0Var;
        this.f42230f = cVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        j0 j0Var = new j0(this.f42229e, this.f42230f, (vy.d) obj4);
        j0Var.f42226b = (qy.l) obj;
        j0Var.f42227c = iIntValue;
        j0Var.f42228d = (fb) obj3;
        return j0Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0229  */
    /* JADX WARN: Code duplicated, block: B:86:0x0237  */
    /* JADX WARN: Code duplicated, block: B:88:0x0251  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
    
        if (mv.r.a(r29.f42230f, r1, ry.r.f50854a, r3, r0, r29) == r8) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020d, code lost:
    
        if (r6.u(false, true, r29) == r8) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0261, code lost:
    
        if (rz.e0.m(300, r29) == r8) goto L90;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x020d -> B:83:0x0210). Please report as a decompilation issue!!! */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
