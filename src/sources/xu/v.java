package xu;

import ys.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56527b;

    public /* synthetic */ v(int i11, l1.b1 b1Var) {
        this.f56526a = i11;
        this.f56527b = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f56526a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f56527b.setValue(it);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f56527b.setValue(bool);
                break;
            case 2:
                l1.b1 b1Var = this.f56527b;
                b1Var.setValue(Integer.valueOf(Math.max(((Number) b1Var.getValue()).intValue(), (int) (((v3.l) obj).f53498a & 4294967295L))));
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f56527b.setValue(bool2);
                break;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f56527b.setValue(bool3);
                break;
            case 5:
                Float f5 = (Float) obj;
                f5.floatValue();
                this.f56527b.setValue(f5);
                break;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f56527b.setValue(bool4);
                break;
            case 7:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.f56527b.setValue(bool5);
                break;
            case 8:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                this.f56527b.setValue(bool6);
                break;
            case 9:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                this.f56527b.setValue(bool7);
                break;
            case 10:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                this.f56527b.setValue(bool8);
                break;
            case 11:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                this.f56527b.setValue(bool9);
                break;
            case 12:
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                l1.b1 b1Var2 = this.f56527b;
                ((fz.c) b1Var2.getValue()).invoke(Boolean.TRUE);
                return new bt.j1(b1Var2, 15);
            case 13:
                j3.f(this.f56527b, true);
                break;
            case 14:
                j3.f(this.f56527b, true);
                break;
            default:
                this.f56527b.setValue((w2.x) obj);
                break;
        }
        return qy.b0.f48488a;
    }
}
