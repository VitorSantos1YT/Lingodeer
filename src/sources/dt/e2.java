package dt;

import java.util.List;
import mt.j6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23772a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23777f;

    public /* synthetic */ e2(z1.r rVar, String str, boolean z11, boolean z12, fz.a aVar, int i11) {
        this.f23776e = rVar;
        this.f23773b = str;
        this.f23774c = z11;
        this.f23775d = z12;
        this.f23777f = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23772a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                v2.c(this.f23774c, this.f23773b, (List) this.f23776e, this.f23775d, (j3.y0) this.f23777f, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                j6.c((z1.r) this.f23776e, this.f23773b, this.f23774c, this.f23775d, (fz.a) this.f23777f, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e2(boolean z11, String str, List list, boolean z12, j3.y0 y0Var, int i11) {
        this.f23774c = z11;
        this.f23773b = str;
        this.f23776e = list;
        this.f23775d = z12;
        this.f23777f = y0Var;
    }
}
