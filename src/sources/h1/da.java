package h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class da extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.q1 f30158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f30159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f30160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30162f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.f f30163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ArrayList arrayList, w2.q1 q1Var, fz.e eVar, kotlin.jvm.internal.w wVar, long j11, int i11, fz.f fVar, ArrayList arrayList2, int i12) {
        super(1);
        this.f30157a = arrayList;
        this.f30158b = q1Var;
        this.f30159c = eVar;
        this.f30160d = wVar;
        this.f30161e = j11;
        this.f30162f = i11;
        this.f30163t = fVar;
        this.H = arrayList2;
        this.K = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        w2.f1 f1Var = (w2.f1) obj;
        ArrayList arrayList = this.f30157a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            w2.f1.k(f1Var, (w2.g1) arrayList.get(i12), this.f30160d.f38359a * i12, 0);
        }
        ga gaVar = ga.Divider;
        fz.e eVar = this.f30159c;
        w2.q1 q1Var = this.f30158b;
        List listC = q1Var.C(gaVar, eVar);
        int size2 = listC.size();
        int i13 = 0;
        while (true) {
            i11 = this.f30162f;
            if (i13 >= size2) {
                break;
            }
            w2.g1 g1VarB = ((w2.p0) listC.get(i13)).B(v3.a.a(0, 0, 0, 0, 11, this.f30161e));
            w2.f1.k(f1Var, g1VarB, 0, i11 - g1VarB.f54502b);
            i13++;
        }
        List listC2 = q1Var.C(ga.Indicator, new t1.d(new b2.h(6, this.f30163t, this.H), true, 1621992604));
        int size3 = listC2.size();
        for (int i14 = 0; i14 < size3; i14++) {
            w2.p0 p0Var = (w2.p0) listC2.get(i14);
            int i15 = this.K;
            if (!((i15 >= 0) & (i11 >= 0))) {
                v3.i.a("width and height must be >= 0");
            }
            w2.f1.k(f1Var, p0Var.B(v3.b.h(i15, i15, i11, i11)), 0, 0);
        }
        return qy.b0.f48488a;
    }
}
