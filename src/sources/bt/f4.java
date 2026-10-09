package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f4 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5390a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5395f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5396t;

    public /* synthetic */ f4(j9.v vVar, String str, rt.j2 j2Var, boolean z11, fz.a aVar, rz.b0 b0Var, fz.a aVar2, fz.c cVar, fz.c cVar2, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f5395f = vVar;
        this.f5396t = str;
        this.H = j2Var;
        this.f5391b = z11;
        this.K = aVar;
        this.f5392c = b0Var;
        this.L = aVar2;
        this.M = cVar;
        this.N = cVar2;
        this.f5393d = b1Var;
        this.f5394e = b1Var2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j9.v vVar;
        switch (this.f5390a) {
            case 0:
                t1.d dVar = (t1.d) this.f5395f;
                x1.p pVar = (x1.p) this.L;
                final jt.s0 s0Var = (jt.s0) this.M;
                l1.b1 b1Var = (l1.b1) this.f5396t;
                l1.b1 b1Var2 = (l1.b1) this.H;
                l1.b1 b1Var3 = (l1.b1) this.K;
                l1.a1 a1Var = (l1.a1) this.N;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dVar.invoke(sVar, 0);
                    List list = (List) this.f5393d.getValue();
                    final rz.b0 b0Var = this.f5392c;
                    boolean zH = sVar.h(b0Var) | sVar.h(s0Var);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        final int i11 = 0;
                        objQ = new fz.c() { // from class: bt.h4
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                switch (i11) {
                                    case 0:
                                        CourseWord stem = (CourseWord) obj3;
                                        kotlin.jvm.internal.m.f(stem, "stem");
                                        rz.e0.B(b0Var, null, null, new y4(s0Var, stem, null), 3);
                                        break;
                                    default:
                                        List it = (List) obj3;
                                        kotlin.jvm.internal.m.f(it, "it");
                                        rz.e0.B(b0Var, null, null, new b1.c(18, s0Var, it, (vy.d) null), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    boolean zH2 = sVar.h(b0Var) | sVar.h(s0Var);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        final int i12 = 1;
                        objQ2 = new fz.c() { // from class: bt.h4
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                switch (i12) {
                                    case 0:
                                        CourseWord stem = (CourseWord) obj3;
                                        kotlin.jvm.internal.m.f(stem, "stem");
                                        rz.e0.B(b0Var, null, null, new y4(s0Var, stem, null), 3);
                                        break;
                                    default:
                                        List it = (List) obj3;
                                        kotlin.jvm.internal.m.f(it, "it");
                                        rz.e0.B(b0Var, null, null, new b1.c(18, s0Var, it, (vy.d) null), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ2);
                    }
                    fz.c cVar2 = (fz.c) objQ2;
                    boolean zF = sVar.f(b1Var2);
                    Object objQ3 = sVar.Q();
                    if (zF || objQ3 == gVar) {
                        objQ3 = new bp.h0(5, b1Var2);
                        sVar.o0(objQ3);
                    }
                    b.C(list, pVar, this.f5394e, this.f5391b, cVar, cVar2, b1Var, (fz.c) objQ3, false, (Integer) b1Var3.getValue(), ((l1.h1) a1Var).l(), sVar, 100663296);
                } else {
                    sVar.W();
                }
                break;
            default:
                j9.v vVar2 = (j9.v) this.f5395f;
                String str = (String) this.f5396t;
                rt.j2 j2Var = (rt.j2) this.H;
                fz.a aVar = (fz.a) this.K;
                fz.a aVar2 = (fz.a) this.L;
                fz.c cVar3 = (fz.c) this.M;
                fz.c cVar4 = (fz.c) this.N;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH3 = sVar2.h(j2Var);
                    boolean z11 = this.f5391b;
                    boolean zG = zH3 | sVar2.g(z11) | sVar2.f(aVar);
                    rz.b0 b0Var2 = this.f5392c;
                    boolean zH4 = zG | sVar2.h(b0Var2) | sVar2.h(vVar2) | sVar2.f(aVar2) | sVar2.f(cVar3) | sVar2.f(cVar4);
                    Object objQ4 = sVar2.Q();
                    if (zH4 || objQ4 == l1.m.f39353a) {
                        vVar = vVar2;
                        mt.f2 f2Var = new mt.f2(j2Var, z11, aVar, b0Var2, vVar, aVar2, this.f5393d, this.f5394e, cVar3, cVar4);
                        sVar2.o0(f2Var);
                        objQ4 = f2Var;
                    } else {
                        vVar = vVar2;
                    }
                    com.bumptech.glide.e.c(vVar, str, null, null, null, null, null, null, (fz.c) objQ4, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ f4(t1.d dVar, l1.b1 b1Var, x1.p pVar, l1.b1 b1Var2, boolean z11, rz.b0 b0Var, jt.s0 s0Var, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.a1 a1Var) {
        this.f5395f = dVar;
        this.f5393d = b1Var;
        this.L = pVar;
        this.f5394e = b1Var2;
        this.f5391b = z11;
        this.f5392c = b0Var;
        this.M = s0Var;
        this.f5396t = b1Var3;
        this.H = b1Var4;
        this.K = b1Var5;
        this.N = a1Var;
    }
}
