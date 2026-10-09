package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f52326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f52327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f52328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52330e;

    public o(d0 d0Var, c0 c0Var, i0 i0Var, int i11, int i12) {
        this.f52326a = d0Var;
        this.f52327b = c0Var;
        this.f52328c = i0Var;
        this.f52329d = i11;
        this.f52330e = i12;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        int i12;
        i0 i0Var;
        c0 c0Var;
        int iIntValue = ((Number) obj).intValue();
        l1.n nVar = (l1.n) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= ((l1.s) nVar).d(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                i11 = n.f52324a[this.f52326a.ordinal()];
                i12 = this.f52329d;
                i0Var = this.f52328c;
                c0Var = this.f52327b;
                if (i11 != 1) {
                    l1.s sVar2 = (l1.s) nVar;
                    sVar2.d0(795189615);
                    fz.c cVar = c0Var.f52262d;
                    kotlin.jvm.internal.m.c(cVar);
                    e0 e0Var = (e0) cVar.invoke(i0Var);
                    int i13 = this.f52330e + iIntValue;
                    e0Var.getClass();
                    sVar2.d0(1794592430);
                    e0Var.f52269a.f(Integer.valueOf(i12), Integer.valueOf(i13), sVar2, 0);
                    sVar2.p(false);
                    sVar2.p(false);
                } else {
                    if (i11 == 2) {
                        throw nv.p.x((l1.s) nVar, 795187654, false);
                    }
                    l1.s sVar3 = (l1.s) nVar;
                    sVar3.d0(795192699);
                    fz.c cVar2 = c0Var.f52263e;
                    kotlin.jvm.internal.m.c(cVar2);
                    z0 z0Var = (z0) cVar2.invoke(i0Var);
                    z0Var.getClass();
                    sVar3.d0(-1198094772);
                    z0Var.f52404a.invoke(Integer.valueOf(i12), sVar3, 0);
                    sVar3.p(false);
                    sVar3.p(false);
                }
            }
        } else {
            i11 = n.f52324a[this.f52326a.ordinal()];
            i12 = this.f52329d;
            i0Var = this.f52328c;
            c0Var = this.f52327b;
            if (i11 != 1) {
                l1.s sVar4 = (l1.s) nVar;
                sVar4.d0(795189615);
                fz.c cVar3 = c0Var.f52262d;
                kotlin.jvm.internal.m.c(cVar3);
                e0 e0Var2 = (e0) cVar3.invoke(i0Var);
                int i14 = this.f52330e + iIntValue;
                e0Var2.getClass();
                sVar4.d0(1794592430);
                e0Var2.f52269a.f(Integer.valueOf(i12), Integer.valueOf(i14), sVar4, 0);
                sVar4.p(false);
                sVar4.p(false);
            } else {
                if (i11 == 2) {
                    throw nv.p.x((l1.s) nVar, 795187654, false);
                }
                l1.s sVar5 = (l1.s) nVar;
                sVar5.d0(795192699);
                fz.c cVar4 = c0Var.f52263e;
                kotlin.jvm.internal.m.c(cVar4);
                z0 z0Var2 = (z0) cVar4.invoke(i0Var);
                z0Var2.getClass();
                sVar5.d0(-1198094772);
                z0Var2.f52404a.invoke(Integer.valueOf(i12), sVar5, 0);
                sVar5.p(false);
                sVar5.p(false);
            }
        }
        return qy.b0.f48488a;
    }
}
