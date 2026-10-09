package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f47869a = new c1(3, hj.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/AbsEncourageModel00Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.abs_encourage_model_00, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.ic_encourage_deer;
            ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.ic_encourage_deer);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i11 = R.id.tv_subtitle;
                TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_subtitle);
                if (textView != null) {
                    i11 = R.id.tv_title;
                    TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_title);
                    if (textView2 != null) {
                        return new hj.b(linearLayout, materialButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
