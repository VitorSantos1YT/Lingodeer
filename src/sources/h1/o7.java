package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ j0.n2 H;
    public final /* synthetic */ w2.q1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Integer N;
    public final /* synthetic */ ArrayList O;
    public final /* synthetic */ Integer P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a9.e f30802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30803f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f30804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a9.e eVar, int i11, int i12, j0.n2 n2Var, w2.q1 q1Var, int i13, int i14, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f30798a = arrayList;
        this.f30799b = arrayList2;
        this.f30800c = arrayList3;
        this.f30801d = arrayList4;
        this.f30802e = eVar;
        this.f30803f = i11;
        this.f30804t = i12;
        this.H = n2Var;
        this.K = q1Var;
        this.L = i13;
        this.M = i14;
        this.N = num;
        this.O = arrayList5;
        this.P = num2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        w2.f1 f1Var = (w2.f1) obj;
        ArrayList arrayList = this.f30798a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f1Var.f((w2.g1) arrayList.get(i12), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ArrayList arrayList2 = this.f30799b;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            f1Var.f((w2.g1) arrayList2.get(i13), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ArrayList arrayList3 = this.f30800c;
        int size3 = arrayList3.size();
        int i14 = 0;
        while (true) {
            i11 = this.L;
            if (i14 >= size3) {
                break;
            }
            w2.g1 g1Var = (w2.g1) arrayList3.get(i14);
            int i15 = (this.f30803f - this.f30804t) / 2;
            w2.q1 q1Var = this.K;
            f1Var.f(g1Var, this.H.c(q1Var, q1Var.getLayoutDirection()) + i15, i11 - this.M, CropImageView.DEFAULT_ASPECT_RATIO);
            i14++;
        }
        ArrayList arrayList4 = this.f30801d;
        int size4 = arrayList4.size();
        for (int i16 = 0; i16 < size4; i16++) {
            w2.g1 g1Var2 = (w2.g1) arrayList4.get(i16);
            Integer num = this.N;
            f1Var.f(g1Var2, 0, i11 - (num != null ? num.intValue() : 0), CropImageView.DEFAULT_ASPECT_RATIO);
        }
        a9.e eVar = this.f30802e;
        if (eVar != null) {
            ArrayList arrayList5 = this.O;
            int size5 = arrayList5.size();
            for (int i17 = 0; i17 < size5; i17++) {
                w2.g1 g1Var3 = (w2.g1) arrayList5.get(i17);
                int i18 = eVar.f478b;
                Integer num2 = this.P;
                kotlin.jvm.internal.m.c(num2);
                f1Var.f(g1Var3, i18, i11 - num2.intValue(), CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        return qy.b0.f48488a;
    }
}
