package bt;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n6 implements fz.e {
    public final /* synthetic */ CourseWord H;
    public final /* synthetic */ l1.b3 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5767a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f5771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f5772f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5773t;

    public /* synthetic */ n6(ht.o oVar, List list, fz.c cVar, boolean z11, fz.e eVar, l1.b1 b1Var, CourseWord courseWord, l1.b3 b3Var) {
        this.f5769c = oVar;
        this.f5768b = list;
        this.f5771e = cVar;
        this.f5770d = z11;
        this.f5772f = eVar;
        this.f5773t = b1Var;
        this.H = courseWord;
        this.K = b3Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        fz.e eVar;
        CourseWord courseWord;
        fz.e eVar2;
        CourseWord courseWord2;
        l1.b1 b1Var;
        switch (this.f5767a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f8 f8Var = f8.PIC_WORD;
                    boolean zBooleanValue = ((Boolean) this.K.getValue()).booleanValue();
                    final ht.o oVar = this.f5769c;
                    boolean z11 = oVar.f33766o;
                    final boolean z12 = this.f5770d;
                    boolean z13 = z11 || !z12;
                    final l1.b1 b1Var2 = this.f5773t;
                    long jB = ((ht.l) b1Var2.getValue()).b();
                    final fz.c cVar = this.f5771e;
                    boolean zF = sVar.f(cVar) | sVar.f(oVar) | sVar.g(z12);
                    final fz.e eVar3 = this.f5772f;
                    boolean zF2 = zF | sVar.f(eVar3) | sVar.f(b1Var2);
                    final CourseWord courseWord3 = this.H;
                    boolean zH = zF2 | sVar.h(courseWord3);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        final int i11 = 0;
                        objQ = new fz.c() { // from class: bt.q6
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                CourseWord it = (CourseWord) obj3;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(it, xTCJ.EHzzOczGFCMFiT);
                                        cVar.invoke(it);
                                        ht.o oVar2 = oVar;
                                        if (!oVar2.f33757e && !oVar2.f33766o && z12) {
                                            String strL = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var3 = b1Var2;
                                            eVar3.invoke(strL, new bp.p(26, b1Var3));
                                            b1Var3.setValue(new ht.d(it.getWordId(), courseWord3.getVisemedMap()));
                                        }
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar.invoke(it);
                                        ht.o oVar3 = oVar;
                                        if (!oVar3.f33766o && !oVar3.f33757e && z12) {
                                            String strL2 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var4 = b1Var2;
                                            eVar3.invoke(strL2, new bp.p(29, b1Var4));
                                            b1Var4.setValue(new ht.d(it.getWordId(), courseWord3.getVisemedMap()));
                                        }
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar.invoke(it);
                                        ht.o oVar4 = oVar;
                                        if (!oVar4.f33757e && !oVar4.f33766o && z12) {
                                            String strL3 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var5 = b1Var2;
                                            eVar3.invoke(strL3, new z6(18, b1Var5));
                                            b1Var5.setValue(new ht.d(it.getWordId(), courseWord3.getVisemedMap()));
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        eVar = eVar3;
                        courseWord = courseWord3;
                        sVar.o0(objQ);
                    } else {
                        eVar = eVar3;
                        courseWord = courseWord3;
                    }
                    fz.c cVar2 = (fz.c) objQ;
                    boolean zF3 = sVar.f(eVar) | sVar.f(b1Var2) | sVar.h(courseWord);
                    Object objQ2 = sVar.Q();
                    if (zF3 || objQ2 == gVar) {
                        objQ2 = new r6(eVar, courseWord, b1Var2, 0);
                        sVar.o0(objQ2);
                    }
                    b.P(f8Var, zBooleanValue, this.f5768b, z13, jB, cVar2, (fz.c) objQ2, sVar, 6);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) this.K.getValue()).booleanValue();
                    final ht.o oVar2 = this.f5769c;
                    boolean z14 = oVar2.f33766o;
                    final boolean z15 = this.f5770d;
                    boolean z16 = z14 || !z15;
                    boolean z17 = oVar2.f33759g;
                    boolean z18 = oVar2.f33760h;
                    final l1.b1 b1Var3 = this.f5773t;
                    long jB2 = ((ht.l) b1Var3.getValue()).b();
                    final fz.c cVar3 = this.f5771e;
                    boolean zF4 = sVar2.f(cVar3) | sVar2.f(oVar2) | sVar2.g(z15);
                    final fz.e eVar4 = this.f5772f;
                    boolean zF5 = zF4 | sVar2.f(eVar4) | sVar2.f(b1Var3);
                    final CourseWord courseWord4 = this.H;
                    boolean zH2 = zF5 | sVar2.h(courseWord4);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH2 || objQ3 == gVar2) {
                        final int i12 = 1;
                        objQ3 = new fz.c() { // from class: bt.q6
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                CourseWord it = (CourseWord) obj3;
                                switch (i12) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(it, xTCJ.EHzzOczGFCMFiT);
                                        cVar3.invoke(it);
                                        ht.o oVar3 = oVar2;
                                        if (!oVar3.f33757e && !oVar3.f33766o && z15) {
                                            String strL = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var4 = b1Var3;
                                            eVar4.invoke(strL, new bp.p(26, b1Var4));
                                            b1Var4.setValue(new ht.d(it.getWordId(), courseWord4.getVisemedMap()));
                                        }
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar3.invoke(it);
                                        ht.o oVar4 = oVar2;
                                        if (!oVar4.f33766o && !oVar4.f33757e && z15) {
                                            String strL2 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var5 = b1Var3;
                                            eVar4.invoke(strL2, new bp.p(29, b1Var5));
                                            b1Var5.setValue(new ht.d(it.getWordId(), courseWord4.getVisemedMap()));
                                        }
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar3.invoke(it);
                                        ht.o oVar5 = oVar2;
                                        if (!oVar5.f33757e && !oVar5.f33766o && z15) {
                                            String strL3 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var6 = b1Var3;
                                            eVar4.invoke(strL3, new z6(18, b1Var6));
                                            b1Var6.setValue(new ht.d(it.getWordId(), courseWord4.getVisemedMap()));
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ3);
                    }
                    fz.c cVar4 = (fz.c) objQ3;
                    boolean zF6 = sVar2.f(eVar4) | sVar2.f(b1Var3) | sVar2.h(courseWord4);
                    Object objQ4 = sVar2.Q();
                    if (zF6 || objQ4 == gVar2) {
                        objQ4 = new r6(eVar4, courseWord4, b1Var3, 1);
                        sVar2.o0(objQ4);
                    }
                    b.S(this.f5768b, zBooleanValue2, false, z16, z17, z18, jB2, cVar4, (fz.c) objQ4, sVar2, 384);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    f8 f8Var2 = f8.PIC;
                    boolean zBooleanValue3 = ((Boolean) this.K.getValue()).booleanValue();
                    final ht.o oVar3 = this.f5769c;
                    boolean z19 = oVar3.f33766o;
                    final l1.b1 b1Var4 = this.f5773t;
                    long jB3 = ((ht.l) b1Var4.getValue()).b();
                    final fz.c cVar5 = this.f5771e;
                    boolean zF7 = sVar3.f(cVar5) | sVar3.f(oVar3);
                    final boolean z20 = this.f5770d;
                    boolean zG = zF7 | sVar3.g(z20);
                    final fz.e eVar5 = this.f5772f;
                    boolean zF8 = zG | sVar3.f(eVar5) | sVar3.f(b1Var4);
                    final CourseWord courseWord5 = this.H;
                    boolean zH3 = zF8 | sVar3.h(courseWord5);
                    Object objQ5 = sVar3.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH3 || objQ5 == gVar3) {
                        final int i13 = 2;
                        fz.c cVar6 = new fz.c() { // from class: bt.q6
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                CourseWord it = (CourseWord) obj3;
                                switch (i13) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(it, xTCJ.EHzzOczGFCMFiT);
                                        cVar5.invoke(it);
                                        ht.o oVar4 = oVar3;
                                        if (!oVar4.f33757e && !oVar4.f33766o && z20) {
                                            String strL = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var5 = b1Var4;
                                            eVar5.invoke(strL, new bp.p(26, b1Var5));
                                            b1Var5.setValue(new ht.d(it.getWordId(), courseWord5.getVisemedMap()));
                                        }
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar5.invoke(it);
                                        ht.o oVar5 = oVar3;
                                        if (!oVar5.f33766o && !oVar5.f33757e && z20) {
                                            String strL2 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var6 = b1Var4;
                                            eVar5.invoke(strL2, new bp.p(29, b1Var6));
                                            b1Var6.setValue(new ht.d(it.getWordId(), courseWord5.getVisemedMap()));
                                        }
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(it, "it");
                                        cVar5.invoke(it);
                                        ht.o oVar6 = oVar3;
                                        if (!oVar6.f33757e && !oVar6.f33766o && z20) {
                                            String strL3 = b7.e0.l(it, "toString(...)");
                                            l1.b1 b1Var7 = b1Var4;
                                            eVar5.invoke(strL3, new z6(18, b1Var7));
                                            b1Var7.setValue(new ht.d(it.getWordId(), courseWord5.getVisemedMap()));
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        eVar2 = eVar5;
                        courseWord2 = courseWord5;
                        b1Var = b1Var4;
                        sVar3.o0(cVar6);
                        objQ5 = cVar6;
                    } else {
                        b1Var = b1Var4;
                        eVar2 = eVar5;
                        courseWord2 = courseWord5;
                    }
                    fz.c cVar7 = (fz.c) objQ5;
                    boolean zF9 = sVar3.f(eVar2) | sVar3.f(b1Var) | sVar3.h(courseWord2);
                    Object objQ6 = sVar3.Q();
                    if (zF9 || objQ6 == gVar3) {
                        objQ6 = new r6(eVar2, courseWord2, b1Var, 3);
                        sVar3.o0(objQ6);
                    }
                    b.P(f8Var2, zBooleanValue3, this.f5768b, z19, jB3, cVar7, (fz.c) objQ6, sVar3, 6);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n6(ht.o oVar, boolean z11, List list, fz.c cVar, fz.e eVar, l1.b1 b1Var, CourseWord courseWord, l1.b3 b3Var) {
        this.f5769c = oVar;
        this.f5770d = z11;
        this.f5768b = list;
        this.f5771e = cVar;
        this.f5772f = eVar;
        this.f5773t = b1Var;
        this.H = courseWord;
        this.K = b3Var;
    }

    public /* synthetic */ n6(List list, ht.o oVar, boolean z11, fz.c cVar, fz.e eVar, l1.b1 b1Var, CourseWord courseWord, l1.b3 b3Var) {
        this.f5768b = list;
        this.f5769c = oVar;
        this.f5770d = z11;
        this.f5771e = cVar;
        this.f5772f = eVar;
        this.f5773t = b1Var;
        this.H = courseWord;
        this.K = b3Var;
    }
}
