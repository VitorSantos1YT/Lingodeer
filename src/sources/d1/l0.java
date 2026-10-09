package d1;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22934b;

    public /* synthetic */ l0(int i11, ArrayList arrayList) {
        this.f22933a = i11;
        this.f22934b = arrayList;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f22933a) {
            case 0:
                w2.f1 f1Var = (w2.f1) obj;
                ArrayList arrayList = this.f22934b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f1Var.f((w2.g1) arrayList.get(i11), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                return qy.b0.f48488a;
            case 1:
                List normalizedReference = (List) obj;
                kotlin.jvm.internal.m.f(normalizedReference, "normalizedReference");
                ArrayList arrayListC1 = ry.m.c1(normalizedReference);
                ArrayList arrayList2 = this.f22934b;
                int size2 = arrayList2.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    if (!arrayListC1.remove((String) obj2)) {
                        i12++;
                    }
                }
                return Integer.valueOf(Math.max(arrayListC1.size(), i12));
            case 2:
                w2.f1 f1Var2 = (w2.f1) obj;
                ArrayList arrayList3 = this.f22934b;
                int size3 = arrayList3.size();
                int i14 = 0;
                while (i14 < size3) {
                    o0.e eVar = (o0.e) arrayList3.get(i14);
                    List list = eVar.f44363b;
                    boolean z11 = eVar.f44368g;
                    if (eVar.f44372k == Integer.MIN_VALUE) {
                        i0.a.a(IMCc.oEAiDBktEwEStT);
                    }
                    int size4 = list.size();
                    int i15 = 0;
                    while (i15 < size4) {
                        w2.g1 g1Var = (w2.g1) list.get(i15);
                        int[] iArr = eVar.f44370i;
                        int i16 = i15 * 2;
                        int i17 = i14;
                        long jE = v3.j.e((((long) iArr[i16 + 1]) & 4294967295L) | (((long) iArr[i16]) << 32), eVar.f44364c);
                        if (z11) {
                            w2.f1.q(f1Var2, g1Var, jE);
                        } else {
                            w2.f1.m(f1Var2, g1Var, jE);
                        }
                        i15++;
                        i14 = i17;
                    }
                    i14++;
                }
                return qy.b0.f48488a;
            default:
                w2.f1 f1Var3 = (w2.f1) obj;
                ArrayList arrayList4 = this.f22934b;
                int size5 = arrayList4.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    w2.f1.k(f1Var3, (w2.g1) arrayList4.get(i18), 0, 0);
                }
                return qy.b0.f48488a;
        }
    }
}
