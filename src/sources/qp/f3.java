package qp;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f3 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3 f47932b;

    public /* synthetic */ f3(h3 h3Var, int i11) {
        this.f47931a = i11;
        this.f47932b = h3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47931a) {
            case 0:
                h3 h3Var = this.f47932b;
                h3Var.r();
                ta.a aVar = h3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                FlexboxLayout flexboxLayout = ((hj.e2) aVar).f32515c;
                kotlin.jvm.internal.m.c(flexboxLayout);
                int childCount = flexboxLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = h3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    FlexboxLayout flexboxLayout2 = ((hj.e2) aVar2).f32515c;
                    kotlin.jvm.internal.m.c(flexboxLayout2);
                    View childAt = flexboxLayout2.getChildAt(i11);
                    Object tag = childAt.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    h3Var.s(childAt, (Word) tag);
                    childAt.requestLayout();
                }
                ta.a aVar3 = h3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                FlexboxLayout flexboxLayout3 = ((hj.e2) aVar3).f32515c;
                kotlin.jvm.internal.m.c(flexboxLayout3);
                flexboxLayout3.requestLayout();
                break;
            default:
                this.f47932b.r();
                break;
        }
        return qy.b0.f48488a;
    }
}
