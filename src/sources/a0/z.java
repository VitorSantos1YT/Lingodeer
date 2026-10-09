package a0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i11, ArrayList arrayList) {
        super(1);
        this.f242a = i11;
        this.f243b = arrayList;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f242a) {
            case 0:
                w2.f1 f1Var = (w2.f1) obj;
                ArrayList arrayList = this.f243b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f1Var.f((w2.g1) arrayList.get(i11), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                break;
            case 1:
                w2.f1 f1Var2 = (w2.f1) obj;
                ArrayList arrayList2 = this.f243b;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    w2.f1.l(f1Var2, (w2.g1) arrayList2.get(i12), 0, 0, null, 12);
                }
                break;
            case 2:
                w2.f1 f1Var3 = (w2.f1) obj;
                ArrayList arrayList3 = this.f243b;
                int size3 = arrayList3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    w2.f1.k(f1Var3, (w2.g1) arrayList3.get(i13), 0, 0);
                }
                break;
            default:
                w2.f1 f1Var4 = (w2.f1) obj;
                ArrayList arrayList4 = this.f243b;
                int iA = ns.o.A(arrayList4);
                if (iA >= 0) {
                    int i14 = 0;
                    while (true) {
                        w2.f1.k(f1Var4, (w2.g1) arrayList4.get(i14), 0, 0);
                        if (i14 != iA) {
                            i14++;
                        }
                    }
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
