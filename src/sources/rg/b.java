package rg;

import l1.n;
import l1.t;
import qy.b0;
import se.i;
import sg.q;
import tg.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f49246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f49247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f49248d;

    public /* synthetic */ b(i0 i0Var, q qVar, int i11, int i12) {
        this.f49245a = i12;
        this.f49246b = i0Var;
        this.f49247c = qVar;
        this.f49248d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f49245a) {
            case 0:
                num.getClass();
                i.b(this.f49246b, this.f49247c, nVar, t.M(this.f49248d | 1));
                break;
            case 1:
                num.getClass();
                i.c(this.f49246b, this.f49247c, nVar, t.M(this.f49248d | 1));
                break;
            case 2:
                num.getClass();
                i.c(this.f49246b, this.f49247c, nVar, t.M(this.f49248d | 1));
                break;
            case 3:
                num.getClass();
                i.C(this.f49246b, this.f49247c, nVar, t.M(this.f49248d | 1));
                break;
            default:
                num.intValue();
                ub.a.K(this.f49246b, this.f49247c, nVar, t.M(this.f49248d | 1));
                break;
        }
        return b0.f48488a;
    }
}
