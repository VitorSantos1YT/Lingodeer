package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f30005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f30006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(w2.g1 g1Var, ArrayList arrayList, w2.g1 g1Var2, long j11, float f5, float f11) {
        super(1);
        this.f30001a = g1Var;
        this.f30002b = arrayList;
        this.f30003c = g1Var2;
        this.f30004d = j11;
        this.f30005e = f5;
        this.f30006f = f11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        long j11;
        w2.f1 f1Var = (w2.f1) obj;
        int i11 = 0;
        w2.g1 g1Var = this.f30001a;
        if (g1Var != null) {
            f1Var.f(g1Var, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ArrayList arrayList = this.f30002b;
        int size = arrayList.size();
        while (true) {
            j11 = this.f30004d;
            if (i11 >= size) {
                break;
            }
            w2.g1 g1Var2 = (w2.g1) arrayList.get(i11);
            int iH = (v3.a.h(j11) / 2) - (g1Var2.f54501a / 2);
            int iG = (v3.a.g(j11) / 2) - (g1Var2.f54502b / 2);
            double d5 = this.f30005e;
            double d11 = ((double) (this.f30006f * i11)) - 1.5707963267948966d;
            f1Var.f(g1Var2, hz.b.P((Math.cos(d11) * d5) + ((double) iH)), hz.b.P((Math.sin(d11) * d5) + ((double) iG)), CropImageView.DEFAULT_ASPECT_RATIO);
            i11++;
            arrayList = arrayList;
        }
        w2.g1 g1Var3 = this.f30003c;
        if (g1Var3 != null) {
            f1Var.f(g1Var3, (v3.a.j(j11) - g1Var3.f54501a) / 2, (v3.a.i(j11) - g1Var3.f54502b) / 2, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        return qy.b0.f48488a;
    }
}
