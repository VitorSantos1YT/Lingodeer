package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b5 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b5 f47859a = new b5(3, hj.t2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView13Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_13, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_item_1;
        View viewQ = fr.j3.q(viewInflate, R.id.card_item_1);
        if (viewQ != null) {
            hj.l0.a(viewQ);
            i11 = R.id.card_item_2;
            View viewQ2 = fr.j3.q(viewInflate, R.id.card_item_2);
            if (viewQ2 != null) {
                hj.l0.a(viewQ2);
                i11 = R.id.card_item_3;
                View viewQ3 = fr.j3.q(viewInflate, R.id.card_item_3);
                if (viewQ3 != null) {
                    hj.l0.a(viewQ3);
                    i11 = R.id.card_item_4;
                    View viewQ4 = fr.j3.q(viewInflate, R.id.card_item_4);
                    if (viewQ4 != null) {
                        hj.l0.a(viewQ4);
                        i11 = R.id.include_word_model_13_title;
                        View viewQ5 = fr.j3.q(viewInflate, R.id.include_word_model_13_title);
                        if (viewQ5 != null) {
                            TextView textView = (TextView) viewQ5;
                            return new hj.t2((LinearLayout) viewInflate, new hj.d3(textView, 9, textView));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
