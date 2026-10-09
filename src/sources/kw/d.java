package kw;

import a0.b2;
import com.yalantis.ucrop.view.CropImageView;
import g3.b0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sz.xej.iFLeRCXvYCGdPW;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f38854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f38855c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38856a;

    static {
        int i11 = 1;
        f38854b = new d(i11, 0);
        f38855c = new d(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, int i12) {
        super(i11);
        this.f38856a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f38856a) {
            case 0:
                b0 semantics = (b0) obj;
                m.f(semantics, "$this$semantics");
                break;
            default:
                k0 k0Var = (k0) obj;
                m.f(k0Var, iFLeRCXvYCGdPW.wfmCqxiPv);
                xq.c cVarJ0 = k0Var.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                ((b2) cVarJ0.f56174b).e(-3.4028235E38f, CropImageView.DEFAULT_ASPECT_RATIO, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                k0Var.a();
                cVarJ0.x().p();
                cVarJ0.T(jH);
                break;
        }
        return qy.b0.f48488a;
    }
}
