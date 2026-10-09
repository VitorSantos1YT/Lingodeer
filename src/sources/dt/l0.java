package dt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23955a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23960f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23961t;

    public /* synthetic */ l0(ns.r0 r0Var, boolean z11, boolean z12, boolean z13, fz.a aVar, fz.a aVar2, int i11) {
        this.f23959e = r0Var;
        this.f23956b = z11;
        this.f23957c = z12;
        this.f23958d = z13;
        this.f23960f = aVar;
        this.f23961t = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23955a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                e.g((ns.r0) this.f23959e, this.f23956b, this.f23957c, this.f23958d, (fz.a) this.f23960f, (fz.a) this.f23961t, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                v2.d(this.f23956b, (List) this.f23959e, (List) this.f23960f, this.f23957c, this.f23958d, (j3.y0) this.f23961t, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l0(boolean z11, List list, List list2, boolean z12, boolean z13, j3.y0 y0Var, int i11) {
        this.f23956b = z11;
        this.f23959e = list;
        this.f23960f = list2;
        this.f23957c = z12;
        this.f23958d = z13;
        this.f23961t = y0Var;
    }
}
