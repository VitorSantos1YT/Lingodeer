package qp;

import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.lingo.lingoskill.widget.DeleteWordView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f48093b;

    public /* synthetic */ o1(q1 q1Var, int i11) {
        this.f48092a = i11;
        this.f48093b = q1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48092a) {
            case 0:
                q1 q1Var = this.f48093b;
                if (q1Var.f48129j != null) {
                    ta.a aVar = q1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ViewGroup.LayoutParams layoutParams = ((hj.h2) aVar).f32654d.getLayoutParams();
                    FrameLayout frameLayout = q1Var.f48129j;
                    kotlin.jvm.internal.m.c(frameLayout);
                    layoutParams.width = frameLayout.getWidth();
                    FrameLayout frameLayout2 = q1Var.f48129j;
                    kotlin.jvm.internal.m.c(frameLayout2);
                    layoutParams.height = frameLayout2.getHeight();
                    ta.a aVar2 = q1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.h2) aVar2).f32654d.setLayoutParams(layoutParams);
                    ta.a aVar3 = q1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    DeleteWordView deleteWordView = ((hj.h2) aVar3).f32654d;
                    deleteWordView.postDelayed(new b2.c(4, deleteWordView, new o1(q1Var, 1)), 0L);
                }
                break;
            default:
                q1 q1Var2 = this.f48093b;
                ta.a aVar4 = q1Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.h2) aVar4).f32654d.setVisibility(0);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                FrameLayout frameLayout3 = q1Var2.f48129j;
                kotlin.jvm.internal.m.c(frameLayout3);
                TextView textView = (TextView) frameLayout3.findViewById(R.id.tv_middle);
                ta.a aVar5 = q1Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.h2) aVar5).f32654d.getLocationOnScreen(iArr);
                FrameLayout frameLayout4 = q1Var2.f48129j;
                kotlin.jvm.internal.m.c(frameLayout4);
                frameLayout4.getLocationOnScreen(iArr2);
                textView.getLocationOnScreen(new int[2]);
                int i11 = iArr2[0] - iArr[0];
                int i12 = iArr2[1] - iArr[1];
                ta.a aVar6 = q1Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                z4.w0 w0VarB = z4.s0.b(((hj.h2) aVar6).f32654d);
                w0VarB.k(i11);
                w0VarB.m(i12);
                w0VarB.e(200L);
                w0VarB.g(new um.a());
                w0VarB.f(new DecelerateInterpolator());
                w0VarB.i();
                break;
        }
        return qy.b0.f48488a;
    }
}
