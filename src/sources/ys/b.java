package ys;

import com.lingodeer.R;
import h1.r4;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57919a;

    public /* synthetic */ b(int i11) {
        this.f57919a = 4;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57919a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.tips), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar2, 0), null, null, 0L, sVar2, 48, 12);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f((ht.o) obj, "<unused var>");
                break;
            case 3:
                ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f((ht.o) obj, "<unused var>");
                break;
            case 4:
                ((Integer) obj2).getClass();
                a.r((l1.n) obj, l1.t.M(1));
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.please_describe_the_issue_here_the_more_detailed_the_better_we_will_look_into_them_as_soon_as_possible), null, 0L, fr.j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 131062);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b(int i11, byte b3) {
        this.f57919a = i11;
    }
}
