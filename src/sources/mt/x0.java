package mt;

import com.yalantis.ucrop.view.CropImageView;
import rt.oe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe f42042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f42044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f42045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f42046f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f42047t;

    public /* synthetic */ x0(oe oeVar, int i11, float f5, fz.e eVar, l1.b1 b1Var, l1.g1 g1Var, int i12) {
        this.f42041a = i12;
        this.f42042b = oeVar;
        this.f42043c = i11;
        this.f42044d = f5;
        this.f42045e = eVar;
        this.f42046f = b1Var;
        this.f42047t = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f42041a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.e eVar = this.f42045e;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = this.f42044d;
        int i12 = this.f42043c;
        l1.g1 g1Var = this.f42047t;
        l1.b1 b1Var = this.f42046f;
        oe oeVar = this.f42042b;
        switch (i11) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    String str = oeVar.f50220a;
                    float f12 = b1.f41269a;
                    b1Var.setValue(str);
                    if (i12 <= 0) {
                        f5 = f11;
                    }
                    g1Var.m(f5);
                }
                eVar.invoke(oeVar, bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                if (bool2.booleanValue()) {
                    String str2 = oeVar.f50220a;
                    float f13 = b1.f41269a;
                    b1Var.setValue(str2);
                    if (i12 <= 0) {
                        f5 = f11;
                    }
                    g1Var.m(f5);
                }
                eVar.invoke(oeVar, bool2);
                break;
        }
        return b0Var;
    }
}
