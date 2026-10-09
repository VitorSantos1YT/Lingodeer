package nm;

import a9.i;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import bq.d;
import cf.x;
import com.bumptech.glide.e;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableTest;
import com.lingodeer.data.env.Env;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fv.c;
import gi.g;
import hj.e3;
import hj.q5;
import java.io.File;
import java.util.ArrayList;
import km.x1;
import kotlin.jvm.internal.m;
import n9.q;
import nv.p;
import om.h;
import om.n;
import om.o;
import qy.b0;
import th.j;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements mm.a {
    public final i H;
    public d K;
    public final c L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f43850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oi.c f43852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public om.b f43853d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43855f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Env f43854e = xt.b.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43856t = -1;
    public final q N = new q(29, false);

    public b(x1 x1Var, SyllableTest syllableTest, int i11) {
        this.f43850a = x1Var;
        this.f43851b = i11;
        x1Var.N = this;
        this.H = new i(1);
        this.L = new c();
    }

    @Override // ii.a
    public final void A() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a(this.M);
        }
        this.N.f();
    }

    public final void a(String path) {
        m.f(path, "path");
        d dVar = this.K;
        if (dVar != null) {
            dVar.k(0);
        }
        this.K = new g7.c(28);
        i iVar = this.H;
        iVar.y();
        if (new File(path).exists()) {
            iVar.f520d = this.K;
            iVar.v(path);
        }
    }

    @Override // mm.a
    public final boolean b() {
        return this.f43856t == this.f43855f - 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm.a
    public final Object j(vy.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f43849c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f43849c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (xy.c) dVar);
            }
        } else {
            aVar = new a(this, (xy.c) dVar);
        }
        Object obj = aVar.f43847a;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = aVar.f43849c;
        int i13 = 0;
        if (i12 == 0) {
            e.F(obj);
            Env mEnv = this.f43854e;
            m.f(mEnv, "mEnv");
            oi.c cVar = new oi.c();
            cVar.f44925a = this;
            cVar.f44926b = mEnv;
            cVar.f44928d = new ArrayList();
            cVar.f44929e = new ArrayList();
            cVar.f44930f = new ArrayList();
            new ArrayList();
            int i14 = this.f43851b;
            cVar.f44927c = cVar.h(i14);
            this.f43852c = cVar;
            if (i14 != -1) {
                ArrayList arrayList = (ArrayList) cVar.f44929e;
                int[] iArr = (int[]) cVar.f44927c;
                if (iArr != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length = iArr.length;
                    for (int i15 = 0; i15 < length; i15++) {
                        o oVar = new o();
                        oVar.f45626b = iArr[i15];
                        oVar.f45625a = 0;
                        arrayList.add(oVar);
                        arrayList2.add(oVar);
                        int i16 = i15 % 2;
                        if (i16 != 0 && i15 != iArr.length - 1) {
                            if (arrayList2.size() > 2) {
                                o oVar2 = new o();
                                oVar2.f45626b = ((o) p.f(3, arrayList2)).f45626b;
                                oVar2.f45625a = 1;
                                arrayList.add(oVar2);
                            }
                            o oVar3 = new o();
                            oVar3.f45626b = ((o) p.f(2, arrayList2)).f45626b;
                            oVar3.f45625a = 1;
                            arrayList.add(oVar3);
                            if ((i15 + 1) % 4 == 0 && i15 != iArr.length - 1) {
                                o oVar4 = new o();
                                oVar4.f45625a = 4;
                                arrayList.add(oVar4);
                                o oVar5 = new o();
                                oVar5.f45625a = 3;
                                arrayList.add(oVar5);
                            }
                        } else if (i16 != 0 && i15 == iArr.length - 1) {
                            if (arrayList2.size() > 2) {
                                o oVar6 = new o();
                                oVar6.f45626b = ((o) p.f(3, arrayList2)).f45626b;
                                oVar6.f45625a = 1;
                                arrayList.add(oVar6);
                            }
                            if (arrayList2.size() >= 2) {
                                o oVar7 = new o();
                                oVar7.f45626b = ((o) p.f(2, arrayList2)).f45626b;
                                oVar7.f45625a = 1;
                                arrayList.add(oVar7);
                            }
                            o oVar8 = new o();
                            oVar8.f45626b = ((o) p.f(1, arrayList2)).f45626b;
                            oVar8.f45625a = 1;
                            arrayList.add(oVar8);
                            o oVar9 = new o();
                            oVar9.f45625a = 4;
                            arrayList.add(oVar9);
                            o oVar10 = new o();
                            oVar10.f45625a = 3;
                            arrayList.add(oVar10);
                            o oVar11 = new o();
                            oVar11.f45625a = 5;
                            arrayList.add(oVar11);
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            if (!x.n().isPing) {
                                o oVar12 = new o();
                                oVar12.f45625a = 6;
                                arrayList.add(oVar12);
                                o oVar13 = new o();
                                oVar13.f45625a = 7;
                                arrayList.add(oVar13);
                            }
                        } else if (i16 == 0 && i15 == iArr.length - 1) {
                            o oVar14 = new o();
                            oVar14.f45626b = ((o) p.f(2, arrayList2)).f45626b;
                            oVar14.f45625a = 1;
                            arrayList.add(oVar14);
                            o oVar15 = new o();
                            oVar15.f45626b = ((o) p.f(1, arrayList2)).f45626b;
                            oVar15.f45625a = 1;
                            arrayList.add(oVar15);
                            o oVar16 = new o();
                            oVar16.f45625a = 4;
                            arrayList.add(oVar16);
                            o oVar17 = new o();
                            oVar17.f45625a = 3;
                            arrayList.add(oVar17);
                            o oVar18 = new o();
                            oVar18.f45625a = 5;
                            arrayList.add(oVar18);
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (!x.n().isPing) {
                                o oVar19 = new o();
                                oVar19.f45625a = 6;
                                arrayList.add(oVar19);
                                o oVar20 = new o();
                                oVar20.f45625a = 7;
                                arrayList.add(oVar20);
                            }
                        }
                    }
                }
            } else {
                aVar.f43849c = 1;
                if (cVar.r(aVar) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(obj);
        }
        oi.c cVar2 = this.f43852c;
        m.c(cVar2);
        int size = ((ArrayList) cVar2.f44929e).size();
        this.f43855f = size;
        x1 x1Var = this.f43850a;
        if (x1Var.getView() != null) {
            ta.a aVar3 = x1Var.f36400f;
            m.c(aVar3);
            ((q5) aVar3).f33171f.setMax(size * 100);
        }
        File file = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar4 = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            yx.d dVarM = new yx.a(new bo.c(file, this), i13).M(ky.e.f38937b);
            qx.o oVarA = px.b.a();
            xx.d dVar2 = new xx.d(vx.b.f54316e, new hh.c(this, 14));
            try {
                dVarM.K(new yx.b(dVar2, oVarA));
                j.a(dVar2, this.N);
            } catch (NullPointerException e8) {
                throw e8;
            } catch (Throwable th2) {
                throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
            }
        } else {
            if (x1Var.getView() != null) {
                ta.a aVar5 = x1Var.f36400f;
                m.c(aVar5);
                e3 e3Var = ((q5) aVar5).f33170e;
                LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
                ComposeView composeView = (ComposeView) e3Var.f32524c;
                ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
                linearLayout.setVisibility(0);
            }
            c cVar3 = this.L;
            m.c(cVar3);
            cVar3.d(aVar4, new aj.e(this, 15));
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01d6  */
    @Override // mm.a
    public final void o() {
        n nVar;
        om.b nVar2;
        int i11;
        int i12 = this.f43856t + 1;
        this.f43856t = i12;
        int i13 = this.f43855f;
        x1 x1Var = this.f43850a;
        if (i12 >= i13 || (xt.b.f56282d && i12 == 1)) {
            om.b bVar = this.f43853d;
            m.c(bVar);
            bVar.b();
            g gVar = new g(this, 1);
            if (x1Var.getView() == null) {
                return;
            }
            ta.a aVar = x1Var.f36400f;
            m.c(aVar);
            ProgressBar progressBar = ((q5) aVar).f33171f;
            ta.a aVar2 = x1Var.f36400f;
            m.c(aVar2);
            int progress = ((q5) aVar2).f33171f.getProgress();
            ta.a aVar3 = x1Var.f36400f;
            m.c(aVar3);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progress, ((q5) aVar3).f33171f.getMax());
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.addListener(gVar);
            objectAnimatorOfInt.start();
            return;
        }
        om.b bVar2 = this.f43853d;
        if (bVar2 != null) {
            bVar2.b();
        }
        int i14 = 0;
        if (this.f43851b != -1) {
            oi.c cVar = this.f43852c;
            m.c(cVar);
            b bVar3 = (b) cVar.f44925a;
            Env env = (Env) cVar.f44926b;
            int i15 = this.f43856t;
            ArrayList arrayList = (ArrayList) cVar.f44930f;
            ArrayList arrayList2 = (ArrayList) cVar.f44929e;
            if (((o) arrayList2.get(i15)).f45625a == 0) {
                nVar2 = new om.e(bVar3, env, ((o) arrayList2.get(i15)).f45626b);
                arrayList.add(arrayList2.get(i15));
            } else if (((o) arrayList2.get(i15)).f45625a == 1) {
                double dRandom = Math.random();
                int size = arrayList.size();
                while (true) {
                    i11 = (int) (dRandom * ((double) size));
                    if (((o) arrayList.get(i11)).f45626b != ((o) arrayList2.get(i15)).f45626b) {
                        break;
                    }
                    dRandom = Math.random();
                    size = arrayList.size();
                }
                nVar2 = env.isPing ? new h(bVar3, env, ((o) arrayList2.get(i15)).f45626b, ((o) arrayList.get(i11)).f45626b, 1) : ((int) (Math.random() * ((double) 2))) == 0 ? new h(bVar3, (Env) cVar.f44926b, ((o) arrayList2.get(i15)).f45626b, ((o) arrayList.get(i11)).f45626b, 0) : new h(bVar3, (Env) cVar.f44926b, ((o) arrayList2.get(i15)).f45626b, ((o) arrayList.get(i11)).f45626b, 1);
            } else if (((o) arrayList2.get(i15)).f45625a == 3) {
                int[] iArrP = j3.P(arrayList.subList(arrayList.size() - 4, arrayList.size()).size(), 4);
                ArrayList arrayList3 = new ArrayList();
                int length = iArrP.length;
                while (i14 < length) {
                    arrayList3.add(Long.valueOf(((o) arrayList.get(iArrP[i14])).f45626b));
                    i14++;
                }
                nVar2 = new om.j(bVar3, env, arrayList3);
            } else if (((o) arrayList2.get(i15)).f45625a == 4) {
                int[] iArrP2 = j3.P(arrayList.subList(arrayList.size() - 4, arrayList.size()).size(), 4);
                ArrayList arrayList4 = new ArrayList();
                int length2 = iArrP2.length;
                while (i14 < length2) {
                    arrayList4.add(Long.valueOf(((o) arrayList.get(iArrP2[i14])).f45626b));
                    i14++;
                }
                nVar2 = new om.m(bVar3, env, arrayList4);
            } else if (((o) arrayList2.get(i15)).f45625a > 4) {
                int[] iArrP3 = j3.P(arrayList.size(), 4);
                ArrayList arrayList5 = new ArrayList();
                for (int length3 = iArrP3.length; i14 < length3; length3 = length3) {
                    arrayList5.add(Long.valueOf(((o) arrayList.get(iArrP3[i14])).f45626b));
                    i14++;
                }
                int i16 = ((o) arrayList2.get(i15)).f45625a;
                if (i16 == 5) {
                    nVar2 = new n(bVar3, env, arrayList5, 0);
                } else if (i16 == 6) {
                    nVar2 = new n(bVar3, env, arrayList5, 1);
                } else if (i16 != 7) {
                    nVar2 = null;
                } else {
                    nVar2 = new n(bVar3, env, arrayList5, 2);
                }
            } else {
                nVar2 = null;
            }
            m.c(nVar2);
            nVar2.f();
        } else {
            oi.c cVar2 = this.f43852c;
            m.c(cVar2);
            int i17 = this.f43856t;
            Env env2 = (Env) cVar2.f44926b;
            b bVar4 = (b) cVar2.f44925a;
            ArrayList arrayList6 = (ArrayList) cVar2.f44928d;
            m.c(arrayList6);
            int[] iArrP4 = j3.P(arrayList6.size(), 4);
            ArrayList arrayList7 = new ArrayList();
            int length4 = iArrP4.length;
            while (i14 < length4) {
                arrayList7.add(Long.valueOf(((Number) arrayList6.get(iArrP4[i14])).intValue()));
                i14++;
            }
            int i18 = ((o) ((ArrayList) cVar2.f44929e).get(i17)).f45625a;
            if (i18 == 5) {
                nVar = new n(bVar4, env2, arrayList7, 0);
            } else if (i18 != 6) {
                if (i18 != 7) {
                    nVar2 = null;
                } else {
                    nVar = new n(bVar4, env2, arrayList7, 2);
                }
                m.c(nVar2);
                nVar2.f();
            } else {
                nVar = new n(bVar4, env2, arrayList7, 1);
            }
            nVar2 = nVar;
            m.c(nVar2);
            nVar2.f();
        }
        this.f43853d = nVar2;
        ta.a aVar4 = x1Var.f36400f;
        m.c(aVar4);
        nVar2.g(((q5) aVar4).f33168c);
        int i19 = this.f43856t;
        if (x1Var.getView() == null) {
            return;
        }
        ta.a aVar5 = x1Var.f36400f;
        m.c(aVar5);
        ProgressBar progressBar2 = ((q5) aVar5).f33171f;
        ta.a aVar6 = x1Var.f36400f;
        m.c(aVar6);
        ProgressBar progressBar3 = ((q5) aVar6).f33171f;
        m.c(progressBar3);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(progressBar2, "progress", progressBar3.getProgress(), i19 * 100);
        objectAnimatorOfInt2.setDuration(500L);
        objectAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt2.start();
    }

    @Override // ii.a
    public final void start() {
    }
}
