package qh;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.lingo.fluent.widget.GameWaveView;
import com.lingodeer.R;
import fr.j3;
import hj.x5;
import java.util.concurrent.TimeUnit;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47761b;

    public /* synthetic */ g0(k0 k0Var, int i11) {
        this.f47760a = i11;
        this.f47761b = k0Var;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        float f5;
        switch (this.f47760a) {
            case 0:
                Boolean it = (Boolean) obj;
                kotlin.jvm.internal.m.f(it, "it");
                k0 k0Var = this.f47761b;
                k0Var.A();
                k0Var.B();
                ta.a aVar = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                GameWaveView gameWaveView = ((x5) aVar).f33603o;
                gameWaveView.postDelayed(new b2.c(4, gameWaveView, new d0(k0Var, 1)), 0L);
                sh.d dVar = k0Var.T;
                if (dVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (!dVar.N) {
                    ta.a aVar2 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((x5) aVar2).f33591b.setVisibility(8);
                    ta.a aVar3 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((x5) aVar3).f33598i.setVisibility(8);
                    return;
                }
                ta.a aVar4 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((x5) aVar4).f33591b.setVisibility(8);
                ta.a aVar5 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((x5) aVar5).f33593d.setVisibility(8);
                ta.a aVar6 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((x5) aVar6).m.setVisibility(8);
                ta.a aVar7 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ((x5) aVar7).f33598i.setVisibility(0);
                ta.a aVar8 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ProgressBar progressBar = ((x5) aVar8).f33598i;
                sh.d dVar2 = k0Var.T;
                if (dVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                progressBar.setMax(dVar2.b().size());
                ta.a aVar9 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((x5) aVar9).f33598i.setProgress(0);
                return;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                k0 k0Var2 = this.f47761b;
                Context contextRequireContext = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                int iZ = (int) j3.Z(16, contextRequireContext);
                Context contextRequireContext2 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                int iY = j3.y(contextRequireContext2);
                Context contextRequireContext3 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                vVar.f38358a = th.j.n(iZ, iY - ((int) j3.Z(46, contextRequireContext3)));
                ta.a aVar10 = k0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                float height = ((x5) aVar10).f33600k.getHeight();
                Context contextRequireContext4 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                int iZ2 = (int) j3.Z(70, contextRequireContext4);
                Context contextRequireContext5 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                int iN = th.j.n(iZ2, (int) j3.Z(140, contextRequireContext5));
                while (true) {
                    f5 = height - iN;
                    ta.a aVar11 = k0Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar11);
                    float x11 = ((x5) aVar11).f33592c.getX();
                    ta.a aVar12 = k0Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar12);
                    float x12 = ((x5) aVar12).f33592c.getX();
                    ta.a aVar13 = k0Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar13);
                    float width = x12 + ((x5) aVar13).f33592c.getWidth();
                    float f11 = vVar.f38358a;
                    Context contextRequireContext6 = k0Var2.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                    float fZ = j3.Z(30, contextRequireContext6) + f11;
                    if (x11 <= fZ && fZ <= width) {
                        ta.a aVar14 = k0Var2.f36400f;
                        kotlin.jvm.internal.m.c(aVar14);
                        float y10 = ((x5) aVar14).f33592c.getY();
                        ta.a aVar15 = k0Var2.f36400f;
                        kotlin.jvm.internal.m.c(aVar15);
                        float y11 = ((x5) aVar15).f33592c.getY();
                        ta.a aVar16 = k0Var2.f36400f;
                        kotlin.jvm.internal.m.c(aVar16);
                        float height2 = y11 + ((x5) aVar16).f33592c.getHeight();
                        Context contextRequireContext7 = k0Var2.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext7, "requireContext(...)");
                        float fZ2 = j3.Z(19, contextRequireContext7) + f5;
                        if (y10 <= fZ2 && fZ2 <= height2) {
                            Context contextRequireContext8 = k0Var2.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext8, "requireContext(...)");
                            int iZ3 = (int) j3.Z(16, contextRequireContext8);
                            Context contextRequireContext9 = k0Var2.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext9, "requireContext(...)");
                            int iY2 = j3.y(contextRequireContext9);
                            Context contextRequireContext10 = k0Var2.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext10, "requireContext(...)");
                            vVar.f38358a = th.j.n(iZ3, iY2 - ((int) j3.Z(46, contextRequireContext10)));
                            ta.a aVar17 = k0Var2.f36400f;
                            kotlin.jvm.internal.m.c(aVar17);
                            height = ((x5) aVar17).f33600k.getHeight();
                            Context contextRequireContext11 = k0Var2.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext11, "requireContext(...)");
                            int iZ4 = (int) j3.Z(70, contextRequireContext11);
                            Context contextRequireContext12 = k0Var2.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext12, "requireContext(...)");
                            iN = th.j.n(iZ4, (int) j3.Z(140, contextRequireContext12));
                        }
                    }
                }
                ta.a aVar18 = k0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar18);
                int height3 = ((x5) aVar18).f33600k.getHeight();
                Context contextRequireContext13 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext13, "requireContext(...)");
                float fM = (height3 - th.j.m((int) j3.Z(70, contextRequireContext13))) - f5;
                Context contextRequireContext14 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext14, "requireContext(...)");
                float fZ3 = 1.0f - (fM / ((int) j3.Z(160, contextRequireContext14)));
                ImageView imageView = new ImageView(k0Var2.requireContext());
                imageView.setImageResource(R.drawable.ic_game_word_spell_bottle);
                imageView.setX(vVar.f38358a);
                imageView.setY(f5);
                imageView.setScaleX(fZ3);
                imageView.setScaleY(fZ3);
                ta.a aVar19 = k0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                ((x5) aVar19).f33600k.addView(imageView);
                k0Var2.P.add(imageView);
                ViewPropertyAnimator viewPropertyAnimatorTranslationXBy = imageView.animate().translationXBy((k0Var2.x().f32541f.getX() + (k0Var2.x().f32541f.getWidth() / 2)) - vVar.f38358a);
                float y12 = k0Var2.x().f32541f.getY();
                Context contextRequireContext15 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext15, "requireContext(...)");
                viewPropertyAnimatorTranslationXBy.translationYBy(((j3.Z(72, contextRequireContext15) + y12) + (k0Var2.x().f32541f.getHeight() / 2)) - f5).setDuration(0L).start();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                ay.p pVarG = qx.h.m(400L, timeUnit, jVar).g(px.b.a());
                x0 x0Var = new x0(k0Var2, 16);
                re.q qVar = vx.b.f54316e;
                pVarG.h(x0Var, qVar);
                ViewPropertyAnimator viewPropertyAnimatorTranslationXBy2 = imageView.animate().translationXBy(-((k0Var2.x().f32541f.getX() + (k0Var2.x().f32541f.getWidth() / 2)) - vVar.f38358a));
                float y13 = k0Var2.x().f32541f.getY();
                Context contextRequireContext16 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext16, "requireContext(...)");
                viewPropertyAnimatorTranslationXBy2.translationYBy(-(((j3.Z(72, contextRequireContext16) + y13) + (k0Var2.x().f32541f.getHeight() / 2)) - f5)).setDuration(500L).start();
                th.j.a(qx.h.m(550L, timeUnit, jVar).g(px.b.a()).h(new ob.m(imageView, vVar, k0Var2, 28), qVar), k0Var2.f36401t);
                return;
        }
    }
}
