package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s4 f48195a = new s4(3, hj.c3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView9Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_9, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_bottom;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
        if (flexboxLayout != null) {
            i11 = R.id.flex_top;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
            if (flexboxLayout2 != null) {
                i11 = R.id.include_iv_audio;
                View viewQ = fr.j3.q(viewInflate, R.id.include_iv_audio);
                if (viewQ != null) {
                    ImageView imageView = (ImageView) viewQ;
                    hj.d3 d3Var = new hj.d3(imageView, 3, imageView);
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i11 = R.id.tv_luoma;
                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_luoma);
                    if (textView != null) {
                        i11 = R.id.tv_title;
                        TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_title);
                        if (textView2 != null) {
                            return new hj.c3(constraintLayout, flexboxLayout, flexboxLayout2, d3Var, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
