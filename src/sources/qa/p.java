package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hj.c3;
import hj.r1;
import hj.s1;
import hj.z2;
import qp.j4;
import qp.l0;
import qp.t4;
import z4.a1;
import z4.g1;
import z4.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47653c;

    public /* synthetic */ p(int i11, Object obj, Object obj2) {
        this.f47651a = i11;
        this.f47652b = obj;
        this.f47653c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f47651a) {
            case 5:
                ((x0) this.f47652b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f47651a) {
            case 0:
                ((y.e) this.f47652b).remove(animation);
                ((v) this.f47653c).R.remove(animation);
                break;
            case 1:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((View) this.f47652b).setEnabled(true);
                l0 l0Var = (l0) this.f47653c;
                Context context = l0Var.f47883c;
                ta.a aVar = l0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((r1) aVar).f33208d.getChildCount();
                boolean z11 = false;
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    if (((r1) aVar2).f33208d.getChildAt(i11).getTag(R.id.bottom_view) == null) {
                        z11 = true;
                    }
                }
                if (z11) {
                    ta.a aVar3 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    int childCount2 = ((r1) aVar3).f33207c.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        ta.a aVar4 = l0Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar4);
                        View childAt = ((r1) aVar4).f33207c.getChildAt(i12);
                        View viewFindViewById = childAt.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                        if (((CardView) viewFindViewById).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context, "context");
                            int color = context.getColor(R.color.second_black);
                            kotlin.jvm.internal.m.f(context, "context");
                            l0.r(childAt, color, context.getColor(R.color.primary_black));
                        }
                    }
                }
                break;
            case 2:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((View) this.f47652b).setEnabled(true);
                l0 l0Var2 = (l0) this.f47653c;
                Context context2 = l0Var2.f47883c;
                ta.a aVar5 = l0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                int childCount3 = ((s1) aVar5).f33259d.getChildCount();
                boolean z12 = false;
                for (int i13 = 0; i13 < childCount3; i13++) {
                    ta.a aVar6 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    if (((s1) aVar6).f33259d.getChildAt(i13).getTag(R.id.bottom_view) == null) {
                        z12 = true;
                    }
                }
                if (z12) {
                    ta.a aVar7 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    int childCount4 = ((s1) aVar7).f33258c.getChildCount();
                    for (int i14 = 0; i14 < childCount4; i14++) {
                        ta.a aVar8 = l0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar8);
                        View childAt2 = ((s1) aVar8).f33258c.getChildAt(i14);
                        View viewFindViewById2 = childAt2.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                        if (((CardView) viewFindViewById2).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context2, "context");
                            int color2 = context2.getColor(R.color.second_black);
                            kotlin.jvm.internal.m.f(context2, "context");
                            l0.s(childAt2, color2, context2.getColor(R.color.primary_black));
                        }
                    }
                }
                break;
            case 3:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((View) this.f47652b).setEnabled(true);
                j4 j4Var = (j4) this.f47653c;
                Context context3 = j4Var.f47883c;
                ta.a aVar9 = j4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                int childCount5 = ((z2) aVar9).f33659c.getChildCount();
                boolean z13 = false;
                for (int i15 = 0; i15 < childCount5; i15++) {
                    ta.a aVar10 = j4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    if (((z2) aVar10).f33659c.getChildAt(i15).getTag(R.id.bottom_view) == null) {
                        z13 = true;
                    }
                }
                if (z13) {
                    ta.a aVar11 = j4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    int childCount6 = ((z2) aVar11).f33658b.getChildCount();
                    for (int i16 = 0; i16 < childCount6; i16++) {
                        ta.a aVar12 = j4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        View childAt3 = ((z2) aVar12).f33658b.getChildAt(i16);
                        View viewFindViewById3 = childAt3.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                        if (((CardView) viewFindViewById3).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context3, "context");
                            int color3 = context3.getColor(R.color.second_black);
                            kotlin.jvm.internal.m.f(context3, "context");
                            j4.s(childAt3, color3, context3.getColor(R.color.primary_black));
                        }
                    }
                }
                break;
            case 4:
                kotlin.jvm.internal.m.f(animation, "animation");
                super.onAnimationEnd(animation);
                ((View) this.f47652b).setEnabled(true);
                t4 t4Var = (t4) this.f47653c;
                Context context4 = t4Var.f47883c;
                ta.a aVar13 = t4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                int childCount7 = ((c3) aVar13).f32457c.getChildCount();
                boolean z14 = false;
                for (int i17 = 0; i17 < childCount7; i17++) {
                    ta.a aVar14 = t4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    if (((c3) aVar14).f32457c.getChildAt(i17).getTag(R.id.bottom_view) == null) {
                        z14 = true;
                    }
                }
                if (z14) {
                    ta.a aVar15 = t4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    int childCount8 = ((c3) aVar15).f32456b.getChildCount();
                    for (int i18 = 0; i18 < childCount8; i18++) {
                        ta.a aVar16 = t4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        View childAt4 = ((c3) aVar16).f32456b.getChildAt(i18);
                        View viewFindViewById4 = childAt4.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        if (((CardView) viewFindViewById4).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                            kotlin.jvm.internal.m.f(context4, "context");
                            int color4 = context4.getColor(R.color.second_black);
                            kotlin.jvm.internal.m.f(context4, "context");
                            t4.s(childAt4, color4, context4.getColor(R.color.primary_black));
                        }
                    }
                }
                break;
            case 5:
                ((x0) this.f47652b).b((View) this.f47653c);
                break;
            default:
                g1 g1Var = (g1) this.f47652b;
                g1Var.f58839a.e(1.0f);
                a1.f((View) this.f47653c, g1Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f47651a) {
            case 0:
                ((v) this.f47653c).R.add(animator);
                break;
            case 5:
                ((x0) this.f47652b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public p(v vVar, y.e eVar) {
        this.f47651a = 0;
        this.f47653c = vVar;
        this.f47652b = eVar;
    }
}
