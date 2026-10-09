package mt;

import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.j2 f41543b;

    public /* synthetic */ i2(rt.j2 j2Var, int i11) {
        this.f41542a = i11;
        this.f41543b = j2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41542a) {
            case 0:
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new bt.j1(this.f41543b, 6);
            case 1:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                rt.j2 j2Var = this.f41543b;
                uz.i1 i1Var = j2Var.O;
                i1Var.getClass();
                i1Var.l(null, num);
                rz.e0.B(ViewModelKt.getViewModelScope(j2Var), null, null, new rt.i2(j2Var, iIntValue, null, 1), 3);
                return qy.b0.f48488a;
            case 2:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                rt.j2 j2Var2 = this.f41543b;
                uz.i1 i1Var2 = j2Var2.Q;
                i1Var2.getClass();
                i1Var2.l(null, bool);
                rz.e0.B(ViewModelKt.getViewModelScope(j2Var2), null, null, new bp.j(7, j2Var2, null, zBooleanValue), 3);
                return qy.b0.f48488a;
            case 3:
                Integer num2 = (Integer) obj;
                int iIntValue2 = num2.intValue();
                rt.j2 j2Var3 = this.f41543b;
                uz.i1 i1Var3 = j2Var3.R;
                i1Var3.getClass();
                i1Var3.l(null, num2);
                rz.e0.B(ViewModelKt.getViewModelScope(j2Var3), null, null, new rt.i2(j2Var3, iIntValue2, null, 0), 3);
                return qy.b0.f48488a;
            default:
                q2 it = (q2) obj;
                kotlin.jvm.internal.m.f(it, "it");
                rt.j2 j2Var4 = this.f41543b;
                rz.e0.B(ViewModelKt.getViewModelScope(j2Var4), null, null, new nu.b(2, j2Var4, it, null), 3);
                return qy.b0.f48488a;
        }
    }
}
