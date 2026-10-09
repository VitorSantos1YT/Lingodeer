package tg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f52352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f52353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f52355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f52356e;

    public r(i0 i0Var, c0 c0Var, int i11, t1.d dVar, List list) {
        this.f52352a = i0Var;
        this.f52353b = c0Var;
        this.f52354c = i11;
        this.f52355d = dVar;
        this.f52356e = list;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
                j0 j0VarB = k0.b(this.f52352a, nVar);
                v.a(null, new j0(this.f52353b.f52261c, j0VarB.f52300b, j0VarB.f52301c, j0VarB.f52302d, j0VarB.f52303e, j0VarB.f52304f, j0VarB.f52305g, j0VarB.f52306h), t1.e.d(1766993238, new q(this.f52354c, this.f52355d, this.f52356e, iIntValue), nVar), nVar, 384, 1);
            }
        } else {
            j0 j0VarB2 = k0.b(this.f52352a, nVar);
            v.a(null, new j0(this.f52353b.f52261c, j0VarB2.f52300b, j0VarB2.f52301c, j0VarB2.f52302d, j0VarB2.f52303e, j0VarB2.f52304f, j0VarB2.f52305g, j0VarB2.f52306h), t1.e.d(1766993238, new q(this.f52354c, this.f52355d, this.f52356e, iIntValue), nVar), nVar, 384, 1);
        }
        return qy.b0.f48488a;
    }
}
