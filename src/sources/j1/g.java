package j1;

import a0.b2;
import com.yalantis.ucrop.view.CropImageView;
import qy.b0;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f35476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f35477c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35478a;

    static {
        int i11 = 1;
        f35476b = new g(i11, 0);
        f35477c = new g(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i11, int i12) {
        super(i11);
        this.f35478a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f35478a) {
            case 0:
                k0 k0Var = (k0) obj;
                xq.c cVarJ0 = k0Var.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((b2) cVarJ0.f56174b).e(-3.4028235E38f, CropImageView.DEFAULT_ASPECT_RATIO, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    k0Var.a();
                    return b0.f48488a;
                } finally {
                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                }
            default:
                return new s(new b0.d(Float.valueOf(((Number) obj).floatValue()), b0.e.f3496j, null, 12));
        }
    }
}
