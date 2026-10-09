package om;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hj.c3;
import hj.q6;
import hj.r1;
import hj.s1;
import hj.z2;
import java.util.concurrent.TimeUnit;
import jp.p0;
import l.t;
import n9.q;
import qp.j4;
import qp.l0;
import qp.t4;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f45620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45621d;

    public /* synthetic */ l(View view, View view2, Object obj, int i11) {
        this.f45618a = i11;
        this.f45619b = view;
        this.f45620c = view2;
        this.f45621d = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f45618a) {
            case 0:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((ImageView) this.f45619b).setVisibility(8);
                w0 w0VarB = s0.b((CardView) this.f45620c);
                w0VarB.c(1.4f);
                w0VarB.d(1.4f);
                w0VarB.e(500L);
                w0VarB.i();
                m mVar = (m) this.f45621d;
                ta.a aVar = mVar.f45600c;
                kotlin.jvm.internal.m.c(aVar);
                w0 w0VarB2 = s0.b(((q6) aVar).f33175c);
                w0VarB2.c(1.4f);
                w0VarB2.d(1.4f);
                w0VarB2.e(500L);
                w0VarB2.i();
                th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new q(mVar, 4), a.M), mVar.f45601d);
                break;
            case 1:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                View view = this.f45619b;
                view.setEnabled(false);
                boolean z11 = true;
                this.f45620c.setEnabled(true);
                l0 l0Var = (l0) this.f45621d;
                Context context = l0Var.f47883c;
                ta.a aVar2 = l0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                int childCount = ((r1) aVar2).f33208d.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar3 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    if (((r1) aVar3).f33208d.getChildAt(i11).getTag(R.id.bottom_view) == null) {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((p0) l0Var.f47881a).O(4);
                    ta.a aVar4 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    int childCount2 = ((r1) aVar4).f33207c.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        ta.a aVar5 = l0Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar5);
                        View childAt = ((r1) aVar5).f33207c.getChildAt(i12);
                        View viewFindViewById = childAt.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                        if (((CardView) viewFindViewById).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context, "context");
                            int color = context.getColor(R.color.divider_line_color);
                            kotlin.jvm.internal.m.f(context, "context");
                            l0.r(childAt, color, context.getColor(R.color.divider_line_color));
                        }
                    }
                }
                kotlin.jvm.internal.m.f(context, "context");
                int color2 = context.getColor(R.color.second_black);
                kotlin.jvm.internal.m.f(context, "context");
                l0.r(view, color2, context.getColor(R.color.primary_black));
                break;
            case 2:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                View view2 = this.f45619b;
                view2.setEnabled(false);
                boolean z12 = true;
                this.f45620c.setEnabled(true);
                l0 l0Var2 = (l0) this.f45621d;
                Context context2 = l0Var2.f47883c;
                ta.a aVar6 = l0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                int childCount3 = ((s1) aVar6).f33259d.getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    ta.a aVar7 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    if (((s1) aVar7).f33259d.getChildAt(i13).getTag(R.id.bottom_view) == null) {
                        z12 = false;
                    }
                }
                if (z12) {
                    ((p0) l0Var2.f47881a).O(4);
                    ta.a aVar8 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    int childCount4 = ((s1) aVar8).f33258c.getChildCount();
                    for (int i14 = 0; i14 < childCount4; i14++) {
                        ta.a aVar9 = l0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        View childAt2 = ((s1) aVar9).f33258c.getChildAt(i14);
                        View viewFindViewById2 = childAt2.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                        if (((CardView) viewFindViewById2).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context2, "context");
                            int color3 = context2.getColor(R.color.divider_line_color);
                            kotlin.jvm.internal.m.f(context2, "context");
                            l0.s(childAt2, color3, context2.getColor(R.color.divider_line_color));
                        }
                    }
                }
                kotlin.jvm.internal.m.f(context2, "context");
                int color4 = context2.getColor(R.color.second_black);
                kotlin.jvm.internal.m.f(context2, "context");
                l0.s(view2, color4, context2.getColor(R.color.primary_black));
                break;
            case 3:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                View view3 = this.f45619b;
                view3.setEnabled(false);
                boolean z13 = true;
                this.f45620c.setEnabled(true);
                j4 j4Var = (j4) this.f45621d;
                Context context3 = j4Var.f47883c;
                ta.a aVar10 = j4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                int childCount5 = ((z2) aVar10).f33659c.getChildCount();
                for (int i15 = 0; i15 < childCount5; i15++) {
                    ta.a aVar11 = j4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    if (((z2) aVar11).f33659c.getChildAt(i15).getTag(R.id.bottom_view) == null) {
                        z13 = false;
                    }
                }
                if (z13) {
                    ((p0) j4Var.f47881a).O(4);
                    ta.a aVar12 = j4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    int childCount6 = ((z2) aVar12).f33658b.getChildCount();
                    for (int i16 = 0; i16 < childCount6; i16++) {
                        ta.a aVar13 = j4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        View childAt3 = ((z2) aVar13).f33658b.getChildAt(i16);
                        View viewFindViewById3 = childAt3.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                        if (((CardView) viewFindViewById3).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context3, "context");
                            int color5 = context3.getColor(R.color.divider_line_color);
                            kotlin.jvm.internal.m.f(context3, "context");
                            j4.s(childAt3, color5, context3.getColor(R.color.divider_line_color));
                        }
                    }
                }
                kotlin.jvm.internal.m.f(context3, "context");
                int color6 = context3.getColor(R.color.second_black);
                kotlin.jvm.internal.m.f(context3, "context");
                j4.s(view3, color6, context3.getColor(R.color.primary_black));
                break;
            case 4:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                View view4 = this.f45619b;
                view4.setEnabled(false);
                boolean z14 = true;
                this.f45620c.setEnabled(true);
                t4 t4Var = (t4) this.f45621d;
                Context context4 = t4Var.f47883c;
                ta.a aVar14 = t4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                int childCount7 = ((c3) aVar14).f32457c.getChildCount();
                for (int i17 = 0; i17 < childCount7; i17++) {
                    ta.a aVar15 = t4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    if (((c3) aVar15).f32457c.getChildAt(i17).getTag(R.id.bottom_view) == null) {
                        z14 = false;
                    }
                }
                if (z14) {
                    ((p0) t4Var.f47881a).O(4);
                    ta.a aVar16 = t4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    int childCount8 = ((c3) aVar16).f32456b.getChildCount();
                    for (int i18 = 0; i18 < childCount8; i18++) {
                        ta.a aVar17 = t4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar17);
                        View childAt4 = ((c3) aVar17).f32456b.getChildAt(i18);
                        View viewFindViewById4 = childAt4.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        if (((CardView) viewFindViewById4).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context4, "context");
                            int color7 = context4.getColor(R.color.divider_line_color);
                            kotlin.jvm.internal.m.f(context4, "context");
                            t4.s(childAt4, color7, context4.getColor(R.color.divider_line_color));
                        }
                    }
                }
                kotlin.jvm.internal.m.f(context4, "context");
                int color8 = context4.getColor(R.color.second_black);
                kotlin.jvm.internal.m.f(context4, "context");
                t4.s(view4, color8, context4.getColor(R.color.primary_black));
                break;
            case 5:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((ImageView) this.f45619b).setVisibility(8);
                rq.i iVar = (rq.i) this.f45621d;
                w0 w0Var = iVar.f49390o;
                if (w0Var != null) {
                    w0Var.b();
                }
                w0 w0VarB3 = s0.b((CardView) this.f45620c);
                w0VarB3.c(1.4f);
                w0VarB3.d(1.4f);
                w0VarB3.e(500L);
                iVar.f49390o = w0VarB3;
                w0VarB3.g(new t(iVar, 5));
                w0 w0Var2 = iVar.f49390o;
                if (w0Var2 != null) {
                    w0Var2.i();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((ImageView) this.f45619b).setVisibility(8);
                w0 w0VarB4 = s0.b((CardView) this.f45620c);
                w0VarB4.c(1.4f);
                w0VarB4.d(1.4f);
                w0VarB4.e(500L);
                w0VarB4.i();
                ay.p pVarG = qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a());
                zi.l lVar = (zi.l) this.f45621d;
                th.j.a(pVarG.h(new t7.d(lVar, 13), zi.a.H), lVar.f59228g);
                break;
        }
    }

    public l(ImageView imageView, rq.i iVar, CardView cardView) {
        this.f45618a = 5;
        this.f45619b = imageView;
        this.f45621d = iVar;
        this.f45620c = cardView;
    }
}
