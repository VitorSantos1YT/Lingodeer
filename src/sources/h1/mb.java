package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class mb extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb(ArrayList arrayList, w2.g1 g1Var, int i11) {
        super(1);
        this.f30703a = i11;
        this.f30704b = arrayList;
        this.f30705c = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30703a) {
            case 0:
                w2.f1 f1Var = (w2.f1) obj;
                ArrayList arrayList = this.f30704b;
                f1Var.f((w2.g1) arrayList.get(0), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                f1Var.f((w2.g1) arrayList.get(1), ((w2.g1) arrayList.get(0)).f54501a, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                int i11 = ((w2.g1) arrayList.get(0)).f54501a;
                w2.g1 g1Var = this.f30705c;
                f1Var.f(g1Var, i11 - (g1Var.f54501a / 2), 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            default:
                w2.f1 f1Var2 = (w2.f1) obj;
                ArrayList arrayList2 = this.f30704b;
                f1Var2.f((w2.g1) arrayList2.get(0), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                f1Var2.f((w2.g1) arrayList2.get(1), 0, ((w2.g1) arrayList2.get(0)).f54502b, CropImageView.DEFAULT_ASPECT_RATIO);
                int i12 = ((w2.g1) arrayList2.get(0)).f54502b;
                w2.g1 g1Var2 = this.f30705c;
                f1Var2.f(g1Var2, 0, i12 - (g1Var2.f54502b / 2), CropImageView.DEFAULT_ASPECT_RATIO);
                break;
        }
        return qy.b0.f48488a;
    }
}
