package qp;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f48052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f48053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f48054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f48055e;

    public /* synthetic */ m2(s2 s2Var, View view, int[] iArr, int[] iArr2) {
        this.f48051a = 1;
        this.f48052b = s2Var;
        this.f48053c = view;
        this.f48054d = iArr;
        this.f48055e = iArr2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48051a) {
            case 0:
                s2 s2Var = this.f48052b;
                if (s2Var.f48183n != null) {
                    s2Var.t();
                    View view = s2Var.f48183n;
                    int[] iArr = this.f48054d;
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    View view2 = this.f48053c;
                    int[] iArr2 = this.f48055e;
                    view2.getLocationOnScreen(iArr2);
                    View viewFindViewById = view2.findViewById(R.id.card_item);
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    CardView cardView = (CardView) viewFindViewById;
                    View view3 = s2Var.f48183n;
                    if (view3 != null) {
                        view3.setTag(R.id.tag_view, cardView);
                        cardView.setTag(R.id.tag_view, view2);
                        int iC = com.google.android.material.datepicker.d.c(view3, 2, iArr[0]) - ((view2.getWidth() / 2) + iArr2[0]);
                        int height = ((view3.getHeight() / 2) + iArr[1]) - ((view2.getHeight() / 2) + iArr2[1]);
                        z4.w0 w0VarB = z4.s0.b(cardView);
                        w0VarB.k(iC);
                        w0VarB.m(height);
                        w0VarB.e(s2Var.f48185p);
                        w0VarB.g(new r2(s2Var, 0, view3));
                        w0VarB.f(new DecelerateInterpolator());
                        w0VarB.i();
                        s2Var.f48183n = null;
                        view2.setEnabled(false);
                    }
                }
                break;
            case 1:
                s2 s2Var2 = this.f48052b;
                View view4 = s2Var2.f48183n;
                ViewGroup.LayoutParams layoutParams = view4 != null ? view4.getLayoutParams() : null;
                View view5 = this.f48053c;
                if (layoutParams != null) {
                    layoutParams.width = view5.getWidth();
                }
                if (layoutParams != null) {
                    layoutParams.height = view5.getHeight();
                }
                View view6 = s2Var2.f48183n;
                if (view6 != null) {
                    view6.setLayoutParams(layoutParams);
                }
                View view7 = s2Var2.f48183n;
                if (view7 != null) {
                    view7.requestLayout();
                }
                h hVar = s2Var2.m;
                if (hVar != null) {
                    hVar.a();
                }
                View view8 = s2Var2.f48183n;
                if (view8 != null) {
                    view8.postDelayed(new b2.c(4, view8, new m2(s2Var2, this.f48054d, view5, this.f48055e, 2)), 0L);
                }
                break;
            default:
                s2 s2Var3 = this.f48052b;
                if (s2Var3.f48183n != null) {
                    ta.a aVar = s2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    FlexboxLayout flexboxLayout = ((hj.a2) aVar).f32335c;
                    flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new m2(s2Var3, this.f48054d, this.f48053c, this.f48055e, 0)), 0L);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m2(s2 s2Var, int[] iArr, View view, int[] iArr2, int i11) {
        this.f48051a = i11;
        this.f48052b = s2Var;
        this.f48054d = iArr;
        this.f48053c = view;
        this.f48055e = iArr2;
    }
}
