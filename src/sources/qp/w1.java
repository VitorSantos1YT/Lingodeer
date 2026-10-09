package qp;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f48245b;

    public /* synthetic */ w1(y1 y1Var, int i11) {
        this.f48244a = i11;
        this.f48245b = y1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48244a) {
            case 0:
                y1 y1Var = this.f48245b;
                y1Var.r();
                ta.a aVar = y1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                FlexboxLayout flexboxLayout = ((hj.l2) aVar).f32845c;
                kotlin.jvm.internal.m.c(flexboxLayout);
                int childCount = flexboxLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = y1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    FlexboxLayout flexboxLayout2 = ((hj.l2) aVar2).f32845c;
                    kotlin.jvm.internal.m.c(flexboxLayout2);
                    View childAt = flexboxLayout2.getChildAt(i11);
                    Object tag = childAt.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    y1Var.s(childAt, (Word) tag);
                    childAt.requestLayout();
                }
                ta.a aVar3 = y1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                FlexboxLayout flexboxLayout3 = ((hj.l2) aVar3).f32845c;
                kotlin.jvm.internal.m.c(flexboxLayout3);
                flexboxLayout3.requestLayout();
                break;
            default:
                this.f48245b.r();
                break;
        }
        return qy.b0.f48488a;
    }
}
