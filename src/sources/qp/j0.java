package qp;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f47993b;

    public /* synthetic */ j0(l0 l0Var, int i11) {
        this.f47992a = i11;
        this.f47993b = l0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47992a) {
            case 0:
                l0 l0Var = this.f47993b;
                ta.a aVar = l0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.r1) aVar).f33207c.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = l0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View childAt = ((hj.r1) aVar2).f33207c.getChildAt(i11);
                    Word word = (Word) ((CardView) childAt.findViewById(R.id.card_item)).getTag();
                    if (word != null) {
                        l0Var.v(childAt, word);
                    }
                    childAt.requestLayout();
                }
                ta.a aVar3 = l0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.r1) aVar3).f33207c.requestLayout();
                break;
            default:
                l0 l0Var2 = this.f47993b;
                ta.a aVar4 = l0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                int childCount2 = ((hj.r1) aVar4).f33207c.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    ta.a aVar5 = l0Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    View childAt2 = ((hj.r1) aVar5).f33207c.getChildAt(i12);
                    Word word2 = (Word) ((CardView) childAt2.findViewById(R.id.card_item)).getTag();
                    if (word2 != null) {
                        l0Var2.v(childAt2, word2);
                    }
                    childAt2.requestLayout();
                }
                ta.a aVar6 = l0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.r1) aVar6).f33207c.requestLayout();
                break;
        }
        return qy.b0.f48488a;
    }
}
