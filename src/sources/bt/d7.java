package bt;

import android.net.Uri;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.l9;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d7 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qy.e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5321a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5326f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5327t;

    public /* synthetic */ d7(ht.o oVar, CourseWord courseWord, l1.b1 b1Var, l1.b1 b1Var2, fz.a aVar, boolean z11, ht.q qVar, fz.a aVar2, fz.e eVar) {
        this.f5323c = oVar;
        this.f5324d = courseWord;
        this.f5325e = b1Var;
        this.f5326f = b1Var2;
        this.f5327t = aVar;
        this.f5322b = z11;
        this.K = qVar;
        this.H = aVar2;
        this.L = eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5321a) {
            case 0:
                ht.o oVar = (ht.o) this.f5323c;
                CourseWord courseWord = (CourseWord) this.f5324d;
                l1.b1 b1Var = (l1.b1) this.f5325e;
                l1.b1 b1Var2 = (l1.b1) this.f5326f;
                fz.a aVar = (fz.a) this.f5327t;
                ht.q qVar = (ht.q) this.K;
                fz.a aVar2 = (fz.a) this.H;
                fz.e eVar = (fz.e) this.L;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z11 = oVar.f33762j;
                    z1.o oVar2 = z1.o.f58481a;
                    l1.g gVar = l1.m.f39353a;
                    if (z11) {
                        sVar.d0(-1719109999);
                        Uri videoUri = courseWord.getVideoUri();
                        z1.r rVarB = d2.h.b(j0.e2.n(oVar2, AchievementLevelType.DAY_STREAK_LV_8), r0.f.d(12));
                        long jLongValue = ((Number) b1Var.getValue()).longValue();
                        Long lValueOf = Long.valueOf(oVar.f33756d);
                        boolean zF = sVar.f(b1Var2) | sVar.f(aVar);
                        Object objQ = sVar.Q();
                        if (zF || objQ == gVar) {
                            objQ = new au.d1(24, aVar, b1Var2);
                            sVar.o0(objQ);
                        }
                        dt.y4.a(videoUri, rVarB, null, false, jLongValue, lValueOf, (fz.c) objQ, sVar, 0, 12);
                        sVar.p(false);
                    } else if (this.f5322b) {
                        sVar.d0(-1718105258);
                        ht.l lVar = (ht.l) b1Var2.getValue();
                        boolean zF2 = sVar.f(oVar) | sVar.f(eVar) | sVar.h(courseWord) | sVar.f(b1Var2);
                        Object objQ2 = sVar.Q();
                        if (zF2 || objQ2 == gVar) {
                            e7 e7Var = new e7(courseWord, b1Var2, oVar, b1Var, eVar, 1);
                            sVar.o0(e7Var);
                            objQ2 = e7Var;
                        }
                        dt.e.o(qVar, lVar, aVar2, (fz.a) objQ2, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1717583869);
                        j0.c.g(sVar, j0.e2.g(oVar2, 12));
                        z1.r rVarN = j0.e2.n(oVar2, 72);
                        boolean z12 = ((ht.l) b1Var2.getValue()) instanceof ht.c;
                        boolean zF3 = sVar.f(oVar) | sVar.f(eVar) | sVar.h(courseWord) | sVar.f(b1Var2);
                        Object objQ3 = sVar.Q();
                        if (zF3 || objQ3 == gVar) {
                            e7 e7Var2 = new e7(courseWord, b1Var2, oVar, b1Var, eVar, 2);
                            sVar.o0(e7Var2);
                            objQ3 = e7Var2;
                        }
                        dt.a0.f(rVarN, CropImageView.DEFAULT_ASPECT_RATIO, z12, (fz.a) objQ3, sVar, 6, 2);
                        ep.a.C(oVar2, 26, sVar, false);
                    }
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                ue.f.c((z1.r) this.f5323c, (l0.w) this.f5324d, (j0.v1) this.f5325e, (j0.f) this.f5326f, (z1.i) this.f5327t, (f0.t0) this.H, this.f5322b, (d0.i) this.K, (fz.c) this.L, (l1.n) obj, l1.t.M(24961));
                break;
            default:
                ((Integer) obj2).getClass();
                mt.y3.e((List) this.f5323c, (r8) this.f5324d, this.f5322b, (rt.e3) this.f5325e, (l9) this.f5326f, (fz.a) this.f5327t, (fz.c) this.K, (fz.a) this.H, (fz.c) this.L, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d7(List list, r8 r8Var, boolean z11, rt.e3 e3Var, l9 l9Var, fz.a aVar, fz.c cVar, fz.a aVar2, fz.c cVar2, int i11) {
        this.f5323c = list;
        this.f5324d = r8Var;
        this.f5322b = z11;
        this.f5325e = e3Var;
        this.f5326f = l9Var;
        this.f5327t = aVar;
        this.K = cVar;
        this.H = aVar2;
        this.L = cVar2;
    }

    public /* synthetic */ d7(z1.r rVar, l0.w wVar, j0.v1 v1Var, j0.f fVar, z1.i iVar, f0.t0 t0Var, boolean z11, d0.i iVar2, fz.c cVar, int i11) {
        this.f5323c = rVar;
        this.f5324d = wVar;
        this.f5325e = v1Var;
        this.f5326f = fVar;
        this.f5327t = iVar;
        this.H = t0Var;
        this.f5322b = z11;
        this.K = iVar2;
        this.L = cVar;
    }
}
