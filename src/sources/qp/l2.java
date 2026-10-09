package qp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f48042b;

    public /* synthetic */ l2(s2 s2Var, int i11) {
        this.f48041a = i11;
        this.f48042b = s2Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f48041a;
        int i12 = 2;
        int i13 = 1;
        int i14 = 4;
        qy.b0 b0Var = qy.b0.f48488a;
        s2 s2Var = this.f48042b;
        switch (i11) {
            case 0:
                h hVar = s2Var.m;
                kotlin.jvm.internal.m.c(hVar);
                hVar.e();
                s2Var.x();
                ta.a aVar = s2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                FlexboxLayout flexboxLayout = ((hj.a2) aVar).f32335c;
                flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new l2(s2Var, 2)), 0L);
                break;
            case 1:
                s2Var.t();
                break;
            case 2:
                ta.a aVar2 = s2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                int childCount = ((hj.a2) aVar2).f32335c.getChildCount();
                while (i13 < childCount) {
                    ta.a aVar3 = s2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    View childAt = ((hj.a2) aVar3).f32335c.getChildAt(i13);
                    if (childAt.getTag(R.id.tag_view) != null) {
                        Object tag = childAt.getTag(R.id.tag_view);
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type android.view.View");
                        View view = (View) tag;
                        Object tag2 = view.getTag();
                        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        Integer numValueOf = Integer.valueOf(i12);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        TextView textView = (TextView) view.findViewById(R.id.tv_top);
                        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
                        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
                        textView3.setVisibility(8);
                        textView.setVisibility(8);
                        View viewFindViewById = view.findViewById(R.id.ll_item);
                        Context context = s2Var.f47883c;
                        viewFindViewById.setPadding((int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver), (int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver));
                        kotlin.jvm.internal.m.c(textView2);
                        s2Var.v((Word) tag2, textView, textView2, textView3);
                        view.setLayoutParams(layoutParams);
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) && textView2.getPaddingTop() == 0) {
                            textView2.setPadding(textView2.getPaddingLeft(), (int) fr.j3.Z(numValueOf, context), textView2.getPaddingRight(), (int) fr.j3.Z(numValueOf, context));
                        }
                        view.postDelayed(new b2.c(4, view, new mt.l0(childAt, view, s2Var, 18)), 0L);
                    }
                    i13++;
                    b0Var = b0Var;
                    childCount = childCount;
                    i12 = 2;
                }
                break;
            case 3:
                ta.a aVar4 = s2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                FlexboxLayout flexboxLayout2 = ((hj.a2) aVar4).f32335c;
                flexboxLayout2.postDelayed(new b2.c(4, flexboxLayout2, new l2(s2Var, i14)), 0L);
                break;
            default:
                s2Var.t();
                s2Var.u(true);
                break;
        }
        return b0Var;
    }
}
