package h1;

import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f31330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f31331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y1 f31332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y1 f31333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y1 f31334f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y1 f31335t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31336a;

    static {
        int i11 = 3;
        f31330b = new y1(i11, 0);
        f31331c = new y1(i11, 1);
        f31332d = new y1(i11, 2);
        f31333e = new y1(i11, 3);
        f31334f = new y1(i11, 4);
        f31335t = new y1(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i11, int i12) {
        super(i11);
        this.f31336a = i12;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31336a) {
            case 0:
                l1.n nVar = (l1.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    }
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    }
                }
                return qy.b0.f48488a;
            case 2:
                u8 u8Var = (u8) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar3).f(u8Var) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    l1.s sVar3 = (l1.s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        d9.b(u8Var, null, null, 0L, 0L, 0L, 0L, 0L, nVar3, iIntValue & 14);
                    }
                } else {
                    d9.b(u8Var, null, null, 0L, 0L, 0L, 0L, 0L, nVar3, iIntValue & 14);
                }
                return qy.b0.f48488a;
            case 3:
                l1.n nVar4 = (l1.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    l1.s sVar4 = (l1.s) nVar4;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        ua.b(i1.p.i(nVar4, R.string.m3c_time_picker_am), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar4, 0, 0, 131070);
                    }
                } else {
                    ua.b(i1.p.i(nVar4, R.string.m3c_time_picker_am), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar4, 0, 0, 131070);
                }
                return qy.b0.f48488a;
            case 4:
                l1.n nVar5 = (l1.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    l1.s sVar5 = (l1.s) nVar5;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        ua.b(i1.p.i(nVar5, R.string.m3c_time_picker_pm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar5, 0, 0, 131070);
                    }
                } else {
                    ua.b(i1.p.i(nVar5, R.string.m3c_time_picker_pm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar5, 0, 0, 131070);
                }
                return qy.b0.f48488a;
            default:
                w2.s0 s0Var = (w2.s0) obj;
                long j11 = ((v3.a) obj3).f53483a;
                int iN0 = s0Var.n0(g7.f30278a);
                int i11 = iN0 * 2;
                w2.g1 g1VarB = ((w2.p0) obj2).B(v3.b.i(j11, 0, i11));
                return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b - i11, ry.s.f50855a, new b7(iN0, 0, g1VarB));
        }
    }
}
