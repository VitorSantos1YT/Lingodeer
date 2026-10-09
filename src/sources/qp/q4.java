package qp;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t4 f48143b;

    public /* synthetic */ q4(t4 t4Var, int i11) {
        this.f48142a = i11;
        this.f48143b = t4Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48142a) {
            case 0:
                t4 t4Var = this.f48143b;
                ta.a aVar = t4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.c3) aVar).f32456b.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = t4Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View childAt = ((hj.c3) aVar2).f32456b.getChildAt(i11);
                    Word word = (Word) ((CardView) childAt.findViewById(R.id.card_item)).getTag();
                    if (word != null) {
                        t4Var.x(childAt, word);
                    }
                    childAt.requestLayout();
                }
                ta.a aVar3 = t4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.c3) aVar3).f32456b.requestLayout();
                break;
            default:
                t4 t4Var2 = this.f48143b;
                ta.a aVar4 = t4Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                int childCount2 = ((hj.c3) aVar4).f32456b.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    ta.a aVar5 = t4Var2.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    View childAt2 = ((hj.c3) aVar5).f32456b.getChildAt(i12);
                    Word word2 = (Word) ((CardView) childAt2.findViewById(R.id.card_item)).getTag();
                    if (word2 != null) {
                        t4Var2.x(childAt2, word2);
                    }
                    childAt2.requestLayout();
                }
                ta.a aVar6 = t4Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.c3) aVar6).f32456b.requestLayout();
                break;
        }
        return qy.b0.f48488a;
    }
}
