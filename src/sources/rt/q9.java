package rt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q9 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9 f50294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc f50295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9(y9 y9Var, cc ccVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50292a = i11;
        this.f50294c = y9Var;
        this.f50295d = ccVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50292a) {
            case 0:
                return new q9(this.f50294c, this.f50295d, dVar, 0);
            case 1:
                return new q9(this.f50294c, this.f50295d, dVar, 1);
            default:
                return new q9(this.f50294c, this.f50295d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50292a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q9) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ot.j1 j1Var;
        switch (this.f50292a) {
            case 0:
                y9 y9Var = this.f50294c;
                ArrayList arrayList = y9Var.N;
                ArrayList arrayList2 = y9Var.O;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50293b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    y9Var.x();
                    String strP = y9Var.p();
                    wb wbVar = (wb) this.f50295d;
                    if (wbVar.f50588a) {
                        ot.j1 j1Var2 = y9Var.f50708d0;
                        if (j1Var2 != null && j1Var2.a().f33755c != 7 && ((j1Var2.a().f33755c != 0 || j1Var2.a().f33753a != 1) && !j1Var2.a().f33761i)) {
                            uz.i1 i1Var = y9Var.M;
                            i1Var.l(null, new Integer(((Number) i1Var.getValue()).intValue() + 1));
                            int i12 = y9Var.Q;
                            if (wbVar.f50590c) {
                                i12++;
                            }
                            y9Var.Q = i12;
                        }
                        if (strP != null && !arrayList2.contains(strP)) {
                            arrayList2.add(strP);
                        }
                    } else {
                        uz.i1 i1Var2 = y9Var.L;
                        i1Var2.l(null, new Integer(((Number) i1Var2.getValue()).intValue() + 1));
                        y9Var.Q = 0;
                        if (!y9Var.s() && ((fr.o0) y9Var.f50701a).f27733a.isTestRepeatWeakItems && (j1Var = y9Var.f50708d0) != null) {
                            Objects.toString(j1Var.a());
                            if (!(j1Var instanceof ot.u0) && !j1Var.a().f33764l && !j1Var.a().f33757e) {
                                uz.i1 i1Var3 = y9Var.V;
                                ArrayList arrayListC1 = ry.m.c1((Collection) i1Var3.getValue());
                                arrayListC1.add(ot.p1.b(j1Var, ht.o.a(j1Var.a(), 0, 0L, false, false, false, false, false, false, false, false, false, false, null, 522239)));
                                i1Var3.l(null, arrayListC1);
                            }
                        }
                        if (strP != null && !arrayList.contains(strP)) {
                            arrayList.add(strP);
                        }
                    }
                    ot.j1 j1Var3 = y9Var.f50708d0;
                    if (j1Var3 != null) {
                        ht.o oVarA = j1Var3.a();
                        int i13 = oVarA.f33753a;
                        long j11 = oVarA.f33754b;
                        int i14 = oVarA.f33755c;
                        boolean z11 = oVarA.f33764l;
                        boolean z12 = oVarA.m;
                        long j12 = wbVar.f50589b;
                        boolean z13 = wbVar.f50588a;
                        this.f50293b = 1;
                        if (y9Var.A(i13, j11, i14, z11, z12, j12, z13, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f50293b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ac acVar = (ac) this.f50295d;
                    long j13 = acVar.f49456a;
                    long j14 = acVar.f49457b;
                    this.f50293b = 1;
                    if (this.f50294c.A(0, j13, 6, false, true, j14, false, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f50293b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    bc bcVar = (bc) this.f50295d;
                    long j15 = bcVar.f49543a;
                    long j16 = bcVar.f49544b;
                    this.f50293b = 1;
                    if (this.f50294c.A(0, j15, 6, false, true, j16, true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
