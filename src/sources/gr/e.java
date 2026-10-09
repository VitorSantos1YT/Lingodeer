package gr;

import com.lingodeer.R;
import h1.r4;
import j0.e2;
import java.util.List;
import l1.a1;
import l1.h1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29677e;

    public /* synthetic */ e(String str, long j11, long j12, z1.r rVar, int i11) {
        this.f29673a = 1;
        this.f29674b = str;
        this.f29675c = j11;
        this.f29676d = j12;
        this.f29677e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29673a) {
            case 0:
                String str = (String) this.f29674b;
                z1.r rVar = (z1.r) this.f29677e;
                ((Integer) obj2).getClass();
                n.f(l1.t.M(3073), this.f29675c, this.f29676d, str, (l1.n) obj, rVar);
                break;
            case 1:
                String str2 = (String) this.f29674b;
                z1.r rVar2 = (z1.r) this.f29677e;
                ((Integer) obj2).getClass();
                yg.o.l(l1.t.M(3073), this.f29675c, this.f29676d, str2, (l1.n) obj, rVar2);
                break;
            case 2:
                String str3 = (String) this.f29674b;
                z1.r rVar3 = (z1.r) this.f29677e;
                ((Integer) obj2).getClass();
                yg.o.h(l1.t.M(1), this.f29675c, this.f29676d, str3, (l1.n) obj, rVar3);
                break;
            default:
                List list = (List) this.f29674b;
                a1 a1Var = (a1) this.f29677e;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.ic_pinyin_arrow, sVar, 0), "Next", e2.n(z1.o.f58481a, 24), ((h1) a1Var).l() < list.size() - 1 ? this.f29675c : this.f29676d, sVar, 432, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ e(String str, long j11, z1.r rVar, long j12, int i11, int i12) {
        this.f29673a = i12;
        this.f29674b = str;
        this.f29675c = j11;
        this.f29677e = rVar;
        this.f29676d = j12;
    }

    public /* synthetic */ e(List list, long j11, long j12, a1 a1Var) {
        this.f29673a = 3;
        this.f29674b = list;
        this.f29675c = j11;
        this.f29676d = j12;
        this.f29677e = a1Var;
    }
}
