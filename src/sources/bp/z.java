package bp;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4928f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4929t;

    public /* synthetic */ z(int i11, int i12, fz.a aVar, String str, String str2, z1.r rVar) {
        this.f4923a = 4;
        this.f4926d = i11;
        this.f4925c = str;
        this.f4928f = str2;
        this.f4924b = rVar;
        this.f4929t = aVar;
        this.f4927e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4923a) {
            case 0:
                ((Integer) obj2).getClass();
                g1.e((String) this.f4925c, (z1.r) this.f4924b, this.f4926d, (fz.c) this.f4928f, (ep.c) this.f4929t, (l1.n) obj, l1.t.M(this.f4927e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dt.a0.g((ht.q) this.f4928f, (z1.r) this.f4924b, (String) this.f4925c, (fz.a) this.f4929t, (l1.n) obj, l1.t.M(this.f4926d | 1), this.f4927e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv.j0.a((String) this.f4925c, (fz.a) this.f4928f, (z1.r) this.f4924b, (v3.f) this.f4929t, (l1.n) obj, l1.t.M(this.f4926d | 1), this.f4927e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                iv.z0.p((kv.z0) this.f4925c, (fz.c) this.f4928f, (z1.r) this.f4924b, (g2.x) this.f4929t, (l1.n) obj, l1.t.M(this.f4926d | 1), this.f4927e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                qu.r.b(this.f4926d, (String) this.f4925c, (String) this.f4928f, (z1.r) this.f4924b, (fz.a) this.f4929t, (l1.n) obj, l1.t.M(this.f4927e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                xn.a.a((String) this.f4925c, (z1.r) this.f4924b, (List) this.f4928f, (j3.y0) this.f4929t, (l1.n) obj, l1.t.M(this.f4926d | 1), this.f4927e);
                break;
            default:
                ((Integer) obj2).intValue();
                xu.q1.e((String) this.f4925c, (String[]) this.f4924b, this.f4926d, (fz.a) this.f4929t, (fz.c) this.f4928f, (l1.n) obj, l1.t.M(this.f4927e | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ z(int i11, int i12, j3.y0 y0Var, String str, List list, z1.r rVar) {
        this.f4923a = 5;
        this.f4925c = str;
        this.f4924b = rVar;
        this.f4928f = list;
        this.f4929t = y0Var;
        this.f4926d = i11;
        this.f4927e = i12;
    }

    public /* synthetic */ z(ht.q qVar, z1.r rVar, String str, fz.a aVar, int i11, int i12) {
        this.f4923a = 1;
        this.f4928f = qVar;
        this.f4924b = rVar;
        this.f4925c = str;
        this.f4929t = aVar;
        this.f4926d = i11;
        this.f4927e = i12;
    }

    public /* synthetic */ z(Object obj, qy.e eVar, z1.r rVar, Object obj2, int i11, int i12, int i13) {
        this.f4923a = i13;
        this.f4925c = obj;
        this.f4928f = eVar;
        this.f4924b = rVar;
        this.f4929t = obj2;
        this.f4926d = i11;
        this.f4927e = i12;
    }

    public /* synthetic */ z(String str, z1.r rVar, int i11, fz.c cVar, ep.c cVar2, int i12) {
        this.f4923a = 0;
        this.f4925c = str;
        this.f4924b = rVar;
        this.f4926d = i11;
        this.f4928f = cVar;
        this.f4929t = cVar2;
        this.f4927e = i12;
    }

    public /* synthetic */ z(String str, String[] strArr, int i11, fz.a aVar, fz.c cVar, int i12) {
        this.f4923a = 6;
        this.f4925c = str;
        this.f4924b = strArr;
        this.f4926d = i11;
        this.f4929t = aVar;
        this.f4928f = cVar;
        this.f4927e = i12;
    }
}
