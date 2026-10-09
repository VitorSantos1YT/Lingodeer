package qp;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f47943b;

    public /* synthetic */ g4(j4 j4Var, int i11) {
        this.f47942a = i11;
        this.f47943b = j4Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47942a) {
            case 0:
                j4 j4Var = this.f47943b;
                ta.a aVar = j4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.z2) aVar).f33658b.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = j4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View childAt = ((hj.z2) aVar2).f33658b.getChildAt(i11);
                    Word word = (Word) ((CardView) childAt.findViewById(R.id.card_item)).getTag();
                    if (word != null) {
                        j4Var.t(childAt, word);
                    }
                    childAt.requestLayout();
                }
                ta.a aVar3 = j4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.z2) aVar3).f33658b.requestLayout();
                break;
            default:
                j4 j4Var2 = this.f47943b;
                ta.a aVar4 = j4Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                int childCount2 = ((hj.z2) aVar4).f33658b.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    ta.a aVar5 = j4Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    View childAt2 = ((hj.z2) aVar5).f33658b.getChildAt(i12);
                    Word word2 = (Word) ((CardView) childAt2.findViewById(R.id.card_item)).getTag();
                    if (word2 != null) {
                        j4Var2.t(childAt2, word2);
                    }
                    childAt2.requestLayout();
                }
                ta.a aVar6 = j4Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.z2) aVar6).f33658b.requestLayout();
                break;
        }
        return qy.b0.f48488a;
    }
}
