package oo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingo.lingoskill.speak.ui.SpeakTestActivity;
import com.lingo.lingoskill.speak.ui.SpeakTryActivity;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.e3;
import hj.z4;
import java.io.File;
import java.util.ArrayList;
import op.a;
import op.b;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m<T extends op.b, F extends op.a, G extends PodSentence<T, F>> extends bp.n implements jo.b {
    public int P;
    public long Q;
    public int R;

    public m() {
        super(l.f45693a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    public final void A(String progress, boolean z11) {
        kotlin.jvm.internal.m.f(progress, "progress");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        e3 e3Var = ((z4) aVar).f33672b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
        } else {
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
        }
        if (z11) {
            if (LingoSkillApplication.f21670t) {
                th.j.a(y().k(ky.e.f38937b).g(px.b.a()).h(new lp.b(this, 9), f.f45649c), this.f36401t);
            } else {
                x();
            }
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String strP;
        String strO;
        String strU;
        String strK;
        this.P = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.Q = requireArguments().getLong(INTENTS.EXTRA_LONG);
        this.R = requireArguments().getInt(INTENTS.EXTRA_INT_2);
        z();
        ii.a aVar = this.N;
        kotlin.jvm.internal.m.c(aVar);
        bm.c cVar = (bm.c) aVar;
        int i11 = this.P;
        switch (cVar.f4467d) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 1:
                qy.q qVar2 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 2:
                qy.q qVar3 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 3:
                qy.q qVar4 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 4:
                qy.q qVar5 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 5:
                qy.q qVar6 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 6:
                qy.q qVar7 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            case 7:
                qy.q qVar8 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
            default:
                qy.q qVar9 = fv.b.f28186a;
                strP = fv.b.P(i11);
                break;
        }
        switch (cVar.f4467d) {
            case 0:
                qy.q qVar10 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 1:
                qy.q qVar11 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 2:
                qy.q qVar12 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 3:
                qy.q qVar13 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 4:
                qy.q qVar14 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 5:
                qy.q qVar15 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 6:
                qy.q qVar16 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            case 7:
                qy.q qVar17 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
            default:
                qy.q qVar18 = fv.b.f28186a;
                strO = fv.b.O(i11);
                break;
        }
        fv.a aVar2 = new fv.a(4L, strP, strO);
        switch (cVar.f4467d) {
            case 0:
                qy.q qVar19 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 1:
                qy.q qVar20 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 2:
                qy.q qVar21 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 3:
                qy.q qVar22 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 4:
                qy.q qVar23 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 5:
                qy.q qVar24 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 6:
                qy.q qVar25 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            case 7:
                qy.q qVar26 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
            default:
                qy.q qVar27 = fv.b.f28186a;
                strU = fv.g.u(i11);
                break;
        }
        switch (cVar.f4467d) {
            case 0:
                qy.q qVar28 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 1:
                qy.q qVar29 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 2:
                qy.q qVar30 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 3:
                qy.q qVar31 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 4:
                qy.q qVar32 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 5:
                qy.q qVar33 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 6:
                qy.q qVar34 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            case 7:
                qy.q qVar35 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
            default:
                qy.q qVar36 = fv.b.f28186a;
                strK = fv.b.K(i11);
                break;
        }
        ArrayList arrayListB = ns.o.b(aVar2, new fv.a(5L, strU, strK));
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListB.get(i12);
            i12++;
            if (!new File(((fv.a) obj).f28184c).exists()) {
                arrayList.add(obj);
            }
        }
        int i13 = 1;
        if (arrayList.isEmpty()) {
            ((m) cVar.f4464a).A(BuildConfig.VERSION_NAME, true);
            return;
        }
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        fv.c cVar2 = new fv.c();
        cVar.f4465b = cVar2;
        cVar2.c(arrayList, new mo.b(cVar, wVar, arrayList, i13), false);
    }

    public final void x() {
        requireActivity().finish();
        int i11 = this.R;
        if (i11 == 0) {
            int i12 = SpeakTestActivity.R;
            p0 p0VarRequireActivity = requireActivity();
            kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
            int i13 = this.P;
            long j11 = this.Q;
            Intent intent = new Intent(p0VarRequireActivity, (Class<?>) SpeakTestActivity.class);
            intent.putExtra(INTENTS.EXTRA_INT, i13);
            intent.putExtra(INTENTS.EXTRA_LONG, j11);
            startActivity(intent);
            final int i14 = 0;
            t().c("jxz_main_click_story_read", new fz.a(this) { // from class: oo.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f45690b;

                {
                    this.f45690b = this;
                }

                @Override // fz.a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            Bundle bundle = new Bundle();
                            b7.e0.v(this.f45690b.P, bundle, "U", "unit");
                            return bundle;
                        default:
                            Bundle bundle2 = new Bundle();
                            b7.e0.v(this.f45690b.P, bundle2, "U", "unit");
                            bundle2.putString("source", "lesson_index");
                            return bundle2;
                    }
                }
            });
            return;
        }
        final int i15 = 1;
        if (i11 == 1) {
            int i16 = SpeakTryActivity.R;
            p0 p0VarRequireActivity2 = requireActivity();
            kotlin.jvm.internal.m.e(p0VarRequireActivity2, "requireActivity(...)");
            startActivity(ns.o.N(p0VarRequireActivity2, this.P, this.Q));
            t().c("jxz_main_click_story_speak", new fz.a(this) { // from class: oo.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f45690b;

                {
                    this.f45690b = this;
                }

                @Override // fz.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            Bundle bundle = new Bundle();
                            b7.e0.v(this.f45690b.P, bundle, "U", "unit");
                            return bundle;
                        default:
                            Bundle bundle2 = new Bundle();
                            b7.e0.v(this.f45690b.P, bundle2, "U", "unit");
                            bundle2.putString("source", "lesson_index");
                            return bundle2;
                    }
                }
            });
            return;
        }
        if (i11 == 2) {
            int i17 = SpeakLeadBoardActivity.H;
            p0 p0VarRequireActivity3 = requireActivity();
            kotlin.jvm.internal.m.e(p0VarRequireActivity3, "requireActivity(...)");
            startActivity(md.a.p(p0VarRequireActivity3, this.P));
        }
    }

    public abstract ay.g0 y();

    public abstract void z();
}
