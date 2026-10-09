package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.a6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f48147a = new r0(3, hj.s1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnChallengeWordModelView9Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_challenge_word_model_view_9, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_title;
        View viewQ = fr.j3.q(viewInflate, R.id.const_title);
        if (viewQ != null) {
            a6 a6VarA = a6.a(viewQ);
            i11 = R.id.flex_bottom;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
            if (flexboxLayout != null) {
                i11 = R.id.flex_top;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
                if (flexboxLayout2 != null) {
                    i11 = R.id.ll_option;
                    if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_option)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        return new hj.s1(linearLayout, a6VarA, flexboxLayout, flexboxLayout2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
