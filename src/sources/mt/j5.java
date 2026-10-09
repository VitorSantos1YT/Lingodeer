package mt;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.NoWhenBranchMatchedException;
import rt.dd;
import rt.mb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j5 extends kotlin.jvm.internal.j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.f41580a = i13;
    }

    @Override // fz.a
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionD;
        switch (this.f41580a) {
            case 0:
                rt.r5 r5Var = (rt.r5) this.receiver;
                if (r5Var.S) {
                    r5Var.S = false;
                    Object value = r5Var.M.getValue();
                    rt.b5 b5Var = value instanceof rt.b5 ? (rt.b5) value : null;
                    if (b5Var != null && b5Var.f49515h == rt.v4.PAUSED) {
                        r5Var.o();
                    }
                }
                return qy.b0.f48488a;
            case 1:
                ((rt.r5) this.receiver).s(new ro.e(24));
                return qy.b0.f48488a;
            case 2:
                ((rt.r5) this.receiver).s(new ro.e(23));
                return qy.b0.f48488a;
            case 3:
                ((rt.r5) this.receiver).m();
                return qy.b0.f48488a;
            case 4:
                rt.r5 r5Var2 = (rt.r5) this.receiver;
                Object value2 = r5Var2.M.getValue();
                rt.b5 b5Var2 = value2 instanceof rt.b5 ? (rt.b5) value2 : null;
                if (b5Var2 != null) {
                    int i11 = rt.e5.f49680a[b5Var2.f49515h.ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        r5Var2.k();
                    } else if (i11 == 3) {
                        r5Var2.o();
                    } else {
                        if (i11 != 4 && i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (b5Var2.f49513f.isEmpty()) {
                            r5Var2.m();
                        } else {
                            int i12 = b5Var2.f49514g;
                            if (i12 < 0) {
                                i12 = 0;
                            }
                            r5Var2.p(i12);
                        }
                    }
                }
                return qy.b0.f48488a;
            case 5:
                ((n9.j0) this.receiver).f43605c.E(Boolean.TRUE);
                return qy.b0.f48488a;
            case 6:
                ((n9.j0) this.receiver).f43605c.E(Boolean.FALSE);
                return qy.b0.f48488a;
            case 7:
                ((n9.j0) this.receiver).f43605c.E(Boolean.FALSE);
                return qy.b0.f48488a;
            case 8:
                w9.s sVar = (w9.s) this.receiver;
                wz.d dVar = sVar.f54850a;
                if (dVar == null) {
                    kotlin.jvm.internal.m.n("coroutineScope");
                    throw null;
                }
                rz.e0.i(dVar, null);
                sVar.k();
                w9.p pVar = sVar.f54854e;
                if (pVar != null) {
                    pVar.f54830f.close();
                    return qy.b0.f48488a;
                }
                kotlin.jvm.internal.m.n("connectionManager");
                throw null;
            case 9:
                return ((z0.d) this.receiver).R();
            case 10:
                ((mb) this.receiver).l();
                return qy.b0.f48488a;
            case 11:
                ((mb) this.receiver).l();
                return qy.b0.f48488a;
            case 12:
                ((dd) this.receiver).l();
                return qy.b0.f48488a;
            case 13:
                ((dd) this.receiver).l();
                return qy.b0.f48488a;
            default:
                View view = (View) this.receiver;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    a5.d.g(view);
                }
                if (i13 < 29 || (contentCaptureSessionD = c3.c.d(view)) == null) {
                    return null;
                }
                return new c3.b(contentCaptureSessionD, view);
        }
    }
}
