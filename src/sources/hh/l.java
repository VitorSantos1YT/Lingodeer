package hh;

import a0.b2;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.fluent.widget.MultipleTransformer;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PdGrammarActivity f32258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PdGrammarActivity pdGrammarActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f32256a = i11;
        this.f32258c = pdGrammarActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f32256a) {
            case 0:
                return new l(this.f32258c, dVar, 0);
            case 1:
                return new l(this.f32258c, dVar, 1);
            case 2:
                return new l(this.f32258c, dVar, 2);
            default:
                return new l(this.f32258c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f32256a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((l) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0119  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:90:0x0235  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object objU;
        long j11;
        Object objU2;
        int i12 = this.f32256a;
        int i13 = 5;
        int i14 = 4;
        final int i15 = 2;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        final PdGrammarActivity pdGrammarActivity = this.f32258c;
        int i16 = 1;
        switch (i12) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f32257b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f32257b = 1;
                    if (fb.g0.h(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                int i18 = PdGrammarActivity.W;
                ((hj.j0) pdGrammarActivity.j()).f32742f.setVisibility(8);
                pdGrammarActivity.Q = new ih.b(pdGrammarActivity, pdGrammarActivity.S);
                ViewPager2 viewPager2 = ((hj.j0) pdGrammarActivity.j()).f32745i;
                ih.b bVar = pdGrammarActivity.Q;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("adapter");
                    throw null;
                }
                viewPager2.setAdapter(bVar);
                ((hj.j0) pdGrammarActivity.j()).f32745i.setPageTransformer(new MultipleTransformer(((hj.j0) pdGrammarActivity.j()).f32745i, j3.Z(32, pdGrammarActivity)));
                ((hj.j0) pdGrammarActivity.j()).f32745i.registerOnPageChangeCallback(new m(pdGrammarActivity));
                Env env = ((fr.o0) pdGrammarActivity.l()).f27733a;
                int i19 = env.keyLanguage;
                if (i19 == 0) {
                    i11 = env.fluentCNGrammarEnterPos;
                } else if (i19 == 1) {
                    i11 = env.fluentJPGrammarEnterPos;
                } else if (i19 == 2) {
                    i11 = env.fluentKRGrammarEnterPos;
                } else if (i19 == 4) {
                    i11 = env.fluentESGrammarEnterPos;
                } else if (i19 == 5) {
                    i11 = env.fluentFRGrammarEnterPos;
                } else if (i19 == 47) {
                    i11 = env.fluentESGrammarEnterPos;
                } else if (i19 != 53) {
                    i11 = 0;
                } else {
                    i11 = env.fluentFRGrammarEnterPos;
                }
                pdGrammarActivity.U = i11;
                pdGrammarActivity.R = new ih.b(pdGrammarActivity, pdGrammarActivity.T);
                ViewPager2 viewPager3 = ((hj.j0) pdGrammarActivity.j()).f32746j;
                ih.b bVar2 = pdGrammarActivity.R;
                if (bVar2 == null) {
                    kotlin.jvm.internal.m.n("favAdapter");
                    throw null;
                }
                viewPager3.setAdapter(bVar2);
                ((hj.j0) pdGrammarActivity.j()).f32746j.setPageTransformer(new MultipleTransformer(((hj.j0) pdGrammarActivity.j()).f32746j, j3.Z(32, pdGrammarActivity)));
                ((hj.j0) pdGrammarActivity.j()).f32746j.registerOnPageChangeCallback(new n(pdGrammarActivity));
                int i21 = 3;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity), null, null, new bp.j(i13, pdGrammarActivity, dVar, 1 == true ? 1 : 0), 3);
                final int i22 = 0;
                bq.z.b(((hj.j0) pdGrammarActivity.j()).f32738b, new fz.c() { // from class: hh.j
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        int i23 = i22;
                        int i24 = 3;
                        vy.d dVar2 = null;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        PdGrammarActivity pdGrammarActivity2 = pdGrammarActivity;
                        View it = (View) obj2;
                        switch (i23) {
                            case 0:
                                int i25 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32745i.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new bp.j(5, pdGrammarActivity2, null, false), 3);
                                }
                                return b0Var2;
                            case 1:
                                int i26 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32746j.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new l(pdGrammarActivity2, dVar2, i24), 3);
                                }
                                return b0Var2;
                            default:
                                int i27 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                jh.j jVar = pdGrammarActivity2.P;
                                if (jVar == null) {
                                    kotlin.jvm.internal.m.n("viewModel");
                                    throw null;
                                }
                                if (!jVar.f36360b.isEmpty()) {
                                    t tVar = new t();
                                    tVar.s(R.style.DialogFragmentFullscreenTheme);
                                    tVar.u(pdGrammarActivity2.getSupportFragmentManager(), BuildConfig.VERSION_NAME);
                                }
                                b7.e0.A(pdGrammarActivity2.m(), "jxz_fl_review_keypoint_filter");
                                return b0Var2;
                        }
                    }
                });
                TextView textView = ((hj.j0) pdGrammarActivity.j()).f32739c;
                final char c11 = 1 == true ? 1 : 0;
                bq.z.b(textView, new fz.c() { // from class: hh.j
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        int i23 = c11;
                        int i24 = 3;
                        vy.d dVar2 = null;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        PdGrammarActivity pdGrammarActivity2 = pdGrammarActivity;
                        View it = (View) obj2;
                        switch (i23) {
                            case 0:
                                int i25 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32745i.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new bp.j(5, pdGrammarActivity2, null, false), 3);
                                }
                                return b0Var2;
                            case 1:
                                int i26 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32746j.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new l(pdGrammarActivity2, dVar2, i24), 3);
                                }
                                return b0Var2;
                            default:
                                int i27 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                jh.j jVar = pdGrammarActivity2.P;
                                if (jVar == null) {
                                    kotlin.jvm.internal.m.n("viewModel");
                                    throw null;
                                }
                                if (!jVar.f36360b.isEmpty()) {
                                    t tVar = new t();
                                    tVar.s(R.style.DialogFragmentFullscreenTheme);
                                    tVar.u(pdGrammarActivity2.getSupportFragmentManager(), BuildConfig.VERSION_NAME);
                                }
                                b7.e0.A(pdGrammarActivity2.m(), "jxz_fl_review_keypoint_filter");
                                return b0Var2;
                        }
                    }
                });
                bq.z.b(((hj.j0) pdGrammarActivity.j()).f32741e, new fz.c() { // from class: hh.j
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        int i23 = i15;
                        int i24 = 3;
                        vy.d dVar2 = null;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        PdGrammarActivity pdGrammarActivity2 = pdGrammarActivity;
                        View it = (View) obj2;
                        switch (i23) {
                            case 0:
                                int i25 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32745i.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new bp.j(5, pdGrammarActivity2, null, false), 3);
                                }
                                return b0Var2;
                            case 1:
                                int i26 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (((hj.j0) pdGrammarActivity2.j()).f32746j.getVisibility() != 0) {
                                    ((ConstraintLayout) ((hj.j0) pdGrammarActivity2.j()).f32740d.f32524c).setVisibility(8);
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity2), null, null, new l(pdGrammarActivity2, dVar2, i24), 3);
                                }
                                return b0Var2;
                            default:
                                int i27 = PdGrammarActivity.W;
                                kotlin.jvm.internal.m.f(it, "it");
                                jh.j jVar = pdGrammarActivity2.P;
                                if (jVar == null) {
                                    kotlin.jvm.internal.m.n("viewModel");
                                    throw null;
                                }
                                if (!jVar.f36360b.isEmpty()) {
                                    t tVar = new t();
                                    tVar.s(R.style.DialogFragmentFullscreenTheme);
                                    tVar.u(pdGrammarActivity2.getSupportFragmentManager(), BuildConfig.VERSION_NAME);
                                }
                                b7.e0.A(pdGrammarActivity2.m(), "jxz_fl_review_keypoint_filter");
                                return b0Var2;
                        }
                    }
                });
                jh.j jVar = pdGrammarActivity.P;
                if (jVar != null) {
                    jVar.f36361c.observe(pdGrammarActivity, new ci.c(pdGrammarActivity, i21));
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("viewModel");
                throw null;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f32257b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0VarL = pdGrammarActivity.l();
                int i24 = pdGrammarActivity.U;
                this.f32257b = 1;
                fr.o0 o0Var = (fr.o0) n0VarL;
                o0Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new fr.f0(i24, 15, o0Var, dVar), this);
                if (objM != aVar2) {
                    objM = b0Var;
                }
                return objM == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f32257b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = pdGrammarActivity.n().f55339f;
                    this.f32257b = 1;
                    objU = uz.x0.u(m0Var, this);
                    if (objU != aVar3) {
                    }
                    return aVar3;
                }
                if (i25 != 1) {
                    if (i25 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                objU = obj;
                ArrayList arrayListB = th.j.b(((Boolean) objU).booleanValue());
                if (arrayListB.isEmpty()) {
                    return b0Var;
                }
                long jLongValue = ((Number) nv.p.f(1, arrayListB)).longValue();
                Env env2 = ((fr.o0) pdGrammarActivity.l()).f27733a;
                int i26 = env2.keyLanguage;
                if (i26 == 0) {
                    j11 = env2.fluentCNGrammarEnterLesson;
                } else if (i26 == 1) {
                    j11 = env2.fluentJPGrammarEnterLesson;
                } else if (i26 == 2) {
                    j11 = env2.fluentKRGrammarEnterLesson;
                } else if (i26 == 4) {
                    j11 = env2.fluentESGrammarEnterLesson;
                } else if (i26 == 5) {
                    j11 = env2.fluentFRGrammarEnterLesson;
                } else if (i26 == 47) {
                    j11 = env2.fluentESGrammarEnterLesson;
                } else if (i26 != 53) {
                    j11 = 0;
                } else {
                    j11 = env2.fluentFRGrammarEnterLesson;
                }
                if (jLongValue == j11) {
                    ViewPager2 viewPager4 = ((hj.j0) pdGrammarActivity.j()).f32745i;
                    viewPager4.postDelayed(new b2.c(i14, viewPager4, new o(pdGrammarActivity, 0)), 0L);
                    return b0Var;
                }
                vt.n0 n0VarL2 = pdGrammarActivity.l();
                this.f32257b = 2;
                fr.o0 o0Var2 = (fr.o0) n0VarL2;
                o0Var2.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new fr.h0(o0Var2, jLongValue, null, 6), this);
                if (objM2 != aVar3) {
                    objM2 = b0Var;
                }
                if (objM2 != aVar3) {
                    return b0Var;
                }
                return aVar3;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f32257b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var2 = pdGrammarActivity.n().f55339f;
                    this.f32257b = 1;
                    objU2 = uz.x0.u(m0Var2, this);
                    if (objU2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objU2).booleanValue();
                if (pdGrammarActivity.P == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                th.j.a(new ay.x(new gh.b(zBooleanValue, i16)).k(ky.e.f38937b).g(px.b.a()).h(new b2(pdGrammarActivity, 16), p.f32275c), pdGrammarActivity.f36391f);
                ((hj.j0) pdGrammarActivity.j()).f32739c.setTextColor(pdGrammarActivity.getColor(R.color.primary_black));
                ((hj.j0) pdGrammarActivity.j()).f32738b.setTextColor(pdGrammarActivity.getColor(R.color.color_D8D8D8));
                ((hj.j0) pdGrammarActivity.j()).f32746j.setVisibility(0);
                ((hj.j0) pdGrammarActivity.j()).f32745i.setVisibility(8);
                return b0Var;
        }
    }
}
