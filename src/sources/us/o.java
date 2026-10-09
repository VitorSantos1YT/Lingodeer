package us;

import l1.b1;
import qy.b0;
import ys.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f53127b;

    public /* synthetic */ o(int i11, b1 b1Var) {
        this.f53126a = i11;
        this.f53127b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f53126a;
        b0 b0Var = b0.f48488a;
        b1 b1Var = this.f53127b;
        switch (i11) {
            case 0:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 1:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 2:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 3:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 4:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 5:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case 6:
                float f5 = p1.f58207a;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 7:
                float f11 = p1.f58207a;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                float f12 = p1.f58207a;
                b1Var.setValue(Boolean.TRUE);
                break;
            default:
                float f13 = p1.f58207a;
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return b0Var;
    }
}
