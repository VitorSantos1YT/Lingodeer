package bt;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0 implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5910a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5915f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5916t;

    public /* synthetic */ r0(int i11, rt.t4 t4Var, boolean z11, boolean z12, rt.x4 x4Var, fz.a aVar, z1.r rVar, int i12) {
        this.f5914e = i11;
        this.f5915f = t4Var;
        this.f5911b = z11;
        this.f5912c = z12;
        this.f5916t = x4Var;
        this.H = aVar;
        this.f5913d = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5910a) {
            case 0:
                ((Integer) obj2).intValue();
                b.g0((String) this.f5915f, (List) this.f5916t, (l1.b1) this.H, this.f5911b, this.f5912c, (fz.c) this.f5913d, (l1.n) obj, l1.t.M(this.f5914e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mt.m3.d(this.f5911b, (Map) this.f5915f, this.f5912c, (fz.a) this.f5916t, (fz.c) this.f5913d, (fz.c) this.H, (l1.n) obj, l1.t.M(this.f5914e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                mt.l5.g(this.f5914e, (rt.t4) this.f5915f, this.f5911b, this.f5912c, (rt.x4) this.f5916t, (fz.a) this.H, (z1.r) this.f5913d, (l1.n) obj, iM);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ r0(String str, List list, l1.b1 b1Var, boolean z11, boolean z12, fz.c cVar, int i11) {
        this.f5915f = str;
        this.f5916t = list;
        this.H = b1Var;
        this.f5911b = z11;
        this.f5912c = z12;
        this.f5913d = cVar;
        this.f5914e = i11;
    }

    public /* synthetic */ r0(boolean z11, Map map, boolean z12, fz.a aVar, fz.c cVar, fz.c cVar2, int i11) {
        this.f5911b = z11;
        this.f5915f = map;
        this.f5912c = z12;
        this.f5916t = aVar;
        this.f5913d = cVar;
        this.H = cVar2;
        this.f5914e = i11;
    }
}
