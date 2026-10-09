package bp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingodeer.data.model.AchievementLevel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4884f;

    public /* synthetic */ x(int i11, rz.b0 b0Var, l1.b1 b1Var, l1.b1 b1Var2, ur.a aVar) {
        this.f4879a = 2;
        this.f4880b = i11;
        this.f4882d = b0Var;
        this.f4881c = b1Var;
        this.f4883e = b1Var2;
        this.f4884f = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4879a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f4881c;
                ep.c cVar = (ep.c) this.f4882d;
                Context context = (Context) this.f4883e;
                LocateLanguageItem locateLanguageItem = (LocateLanguageItem) this.f4884f;
                b1Var.setValue(Boolean.FALSE);
                cVar.q(this.f4880b, context, locateLanguageItem.getLocate());
                break;
            case 1:
                FrameLayout frameLayout = (FrameLayout) this.f4881c;
                int[] iArr = (int[]) this.f4882d;
                lp.k kVar = (lp.k) this.f4883e;
                View view = (View) this.f4884f;
                frameLayout.getLocationOnScreen(iArr);
                View view2 = kVar.f40212i;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = this.f4880b;
                layoutParams.height = view.getHeight();
                view2.setLayoutParams(layoutParams);
                int[] iArr2 = new int[2];
                view2.getLocationOnScreen(iArr2);
                view2.setVisibility(0);
                z4.w0 w0VarB = z4.s0.b(view2);
                w0VarB.k((ff.h.l(8.0f) + (frameLayout.getWidth() + iArr[0])) - iArr2[0]);
                w0VarB.m(iArr[1] - iArr2[1]);
                w0VarB.e(0L);
                w0VarB.i();
                break;
            case 2:
                rz.b0 b0Var = (rz.b0) this.f4882d;
                l1.b1 b1Var2 = (l1.b1) this.f4881c;
                l1.b1 b1Var3 = (l1.b1) this.f4883e;
                ur.a aVar = (ur.a) this.f4884f;
                b1Var3.setValue((AchievementLevel) ((List) b1Var2.getValue()).get(this.f4880b));
                rz.e0.B(b0Var, null, null, new pr.l(aVar, b1Var3, null, 1), 3);
                break;
            case 3:
                FrameLayout frameLayout2 = (FrameLayout) this.f4881c;
                int[] iArr3 = (int[]) this.f4882d;
                qp.s sVar = (qp.s) this.f4883e;
                View view3 = (View) this.f4884f;
                frameLayout2.getLocationOnScreen(iArr3);
                ta.a aVar2 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ViewGroup.LayoutParams layoutParams2 = ((hj.m1) aVar2).f32914f.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.width = this.f4880b;
                layoutParams3.height = view3.getHeight();
                ta.a aVar3 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.m1) aVar3).f32914f.setLayoutParams(layoutParams3);
                int[] iArr4 = new int[2];
                ta.a aVar4 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.m1) aVar4).f32914f.getLocationOnScreen(iArr4);
                ta.a aVar5 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.m1) aVar5).f32914f.setVisibility(0);
                ta.a aVar6 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                z4.w0 w0VarB2 = z4.s0.b(((hj.m1) aVar6).f32914f);
                w0VarB2.k((frameLayout2.getWidth() + iArr3[0]) - iArr4[0]);
                w0VarB2.m(iArr3[1] - iArr4[1]);
                w0VarB2.e(0L);
                w0VarB2.i();
                break;
            default:
                FrameLayout frameLayout3 = (FrameLayout) this.f4881c;
                int[] iArr5 = (int[]) this.f4882d;
                qp.b2 b2Var = (qp.b2) this.f4883e;
                View view4 = (View) this.f4884f;
                frameLayout3.getLocationOnScreen(iArr5);
                ta.a aVar7 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ViewGroup.LayoutParams layoutParams4 = ((hj.m2) aVar7).f32919d.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                layoutParams5.width = this.f4880b;
                layoutParams5.height = view4.getHeight();
                ta.a aVar8 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.m2) aVar8).f32919d.setLayoutParams(layoutParams5);
                int[] iArr6 = new int[2];
                ta.a aVar9 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.m2) aVar9).f32919d.getLocationOnScreen(iArr6);
                ta.a aVar10 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ((hj.m2) aVar10).f32919d.setVisibility(0);
                ta.a aVar11 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                z4.w0 w0VarB3 = z4.s0.b(((hj.m2) aVar11).f32919d);
                w0VarB3.k((frameLayout3.getWidth() + iArr5[0]) - iArr6[0]);
                w0VarB3.m(iArr5[1] - iArr6[1]);
                w0VarB3.e(0L);
                w0VarB3.i();
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ x(FrameLayout frameLayout, int[] iArr, Object obj, int i11, View view, int i12) {
        this.f4879a = i12;
        this.f4881c = frameLayout;
        this.f4882d = iArr;
        this.f4883e = obj;
        this.f4880b = i11;
        this.f4884f = view;
    }

    public /* synthetic */ x(l1.b1 b1Var, ep.c cVar, Context context, LocateLanguageItem locateLanguageItem, int i11) {
        this.f4879a = 0;
        this.f4881c = b1Var;
        this.f4882d = cVar;
        this.f4883e = context;
        this.f4884f = locateLanguageItem;
        this.f4880b = i11;
    }
}
