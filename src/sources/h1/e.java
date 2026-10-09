package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.s0 f30183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, w2.s0 s0Var, int i11, ArrayList arrayList2) {
        super(1);
        float f5 = k.f30507a;
        this.f30182a = arrayList;
        this.f30183b = s0Var;
        this.f30184c = i11;
        this.f30185d = arrayList2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.s0 s0Var;
        w2.f1 f1Var = (w2.f1) obj;
        float f5 = k.f30509c;
        ArrayList arrayList = this.f30182a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) arrayList.get(i11);
            int size2 = list.size();
            int[] iArr = new int[size2];
            int i12 = 0;
            while (true) {
                s0Var = this.f30183b;
                if (i12 >= size2) {
                    break;
                }
                iArr[i12] = ((w2.g1) list.get(i12)).f54501a + (i12 < ns.o.A(list) ? s0Var.n0(f5) : 0);
                i12++;
            }
            j0.b bVar = j0.i.f35304b;
            int[] iArr2 = new int[size2];
            for (int i13 = 0; i13 < size2; i13++) {
                iArr2[i13] = 0;
            }
            bVar.b(s0Var, this.f30184c, iArr, s0Var.getLayoutDirection(), iArr2);
            int size3 = list.size();
            for (int i14 = 0; i14 < size3; i14++) {
                f1Var.f((w2.g1) list.get(i14), iArr2[i14], ((Number) this.f30185d.get(i11)).intValue(), CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        return qy.b0.f48488a;
    }
}
