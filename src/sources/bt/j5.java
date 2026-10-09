package bt;

import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j5 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5581c;

    public /* synthetic */ j5(Object obj, int i11, int i12) {
        this.f5579a = i12;
        this.f5581c = obj;
        this.f5580b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5579a) {
            case 0:
                ((Integer) obj2).getClass();
                s5.c((RecordingStatus) this.f5581c, (l1.n) obj, l1.t.M(this.f5580b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                fu.a.d((hu.b) this.f5581c, (l1.n) obj, l1.t.M(this.f5580b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                iv.z0.v((String) this.f5581c, (l1.n) obj, l1.t.M(this.f5580b | 1));
                break;
            case 3:
                l1.a1 a1Var = (l1.a1) this.f5581c;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iL = ((l1.h1) a1Var).l();
                    boolean zF = sVar.f(a1Var);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new a2(a1Var, 14);
                        sVar.o0(objQ);
                    }
                    mt.g.K(iL, (fz.c) objQ, true, null, this.f5580b, sVar, 384, 8);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).intValue();
                tg.v.d((tg.i0) this.f5581c, (l1.n) obj, l1.t.M(this.f5580b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ys.a3.k((CourseUnit) this.f5581c, (l1.n) obj, l1.t.M(this.f5580b | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
