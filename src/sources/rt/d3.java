package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends xy.i implements fz.g {
    public /* synthetic */ int H;
    public /* synthetic */ fb K;
    public final /* synthetic */ e3 L;
    public final /* synthetic */ vt.n0 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ot.j1 f49609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f49610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49611f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ List f49612t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, vt.n0 n0Var, vy.d dVar) {
        super(4, dVar);
        this.L = e3Var;
        this.M = n0Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        d3 d3Var = new d3(this.L, this.M, (vy.d) obj4);
        d3Var.f49612t = (List) obj;
        d3Var.H = iIntValue;
        d3Var.K = (fb) obj3;
        return d3Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x022a  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b8, code lost:
    
        if (r9.u(false, true, r8) == r11) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024e, code lost:
    
        if (rz.e0.m(300, r30) == r11) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
