package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b3 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f23662b;

    public /* synthetic */ b3(t1.d dVar, int i11) {
        this.f23661a = i11;
        this.f23662b = dVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        switch (this.f23661a) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).d(iIntValue) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).g(zBooleanValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    this.f23662b.i(j0.r.f35391a, num, bool, sVar, Integer.valueOf((i11 << 3) & 1008));
                } else {
                    sVar.W();
                }
                break;
            default:
                o0.o HorizontalPager = (o0.o) obj;
                Integer num2 = (Integer) obj2;
                num2.getClass();
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                this.f23662b.f(HorizontalPager, num2, (l1.n) obj3, Integer.valueOf(iIntValue3 & 126));
                break;
        }
        return qy.b0.f48488a;
    }
}
