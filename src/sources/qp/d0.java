package qp;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f47890b;

    public /* synthetic */ d0(f0 f0Var, int i11) {
        this.f47889a = i11;
        this.f47890b = f0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47889a) {
            case 0:
                f0 f0Var = this.f47890b;
                f0Var.r();
                ta.a aVar = f0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                FlexboxLayout flexboxLayout = ((hj.j1) aVar).f32750d;
                kotlin.jvm.internal.m.c(flexboxLayout);
                int childCount = flexboxLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = f0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    FlexboxLayout flexboxLayout2 = ((hj.j1) aVar2).f32750d;
                    kotlin.jvm.internal.m.c(flexboxLayout2);
                    View childAt = flexboxLayout2.getChildAt(i11);
                    Object tag = childAt.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    f0Var.t(childAt, (Word) tag);
                    childAt.requestLayout();
                }
                ta.a aVar3 = f0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                FlexboxLayout flexboxLayout3 = ((hj.j1) aVar3).f32750d;
                kotlin.jvm.internal.m.c(flexboxLayout3);
                flexboxLayout3.requestLayout();
                break;
            default:
                this.f47890b.r();
                break;
        }
        return qy.b0.f48488a;
    }
}
