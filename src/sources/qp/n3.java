package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.z5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n3 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3 f48079a = new n3(3, hj.i2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView31Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_31, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_del;
        FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.card_del);
        if (frameLayout != null) {
            i11 = R.id.edit_content;
            EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edit_content);
            if (editText != null) {
                i11 = R.id.flex_key_board;
                FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_key_board);
                if (flexboxLayout != null) {
                    i11 = R.id.include_test_video;
                    View viewQ = fr.j3.q(viewInflate, R.id.include_test_video);
                    if (viewQ != null) {
                        z5 z5VarB = z5.b(viewQ);
                        i11 = R.id.iv_hint_audio;
                        ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_audio);
                        if (imageView != null) {
                            i11 = R.id.iv_hint_eye;
                            ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_eye);
                            if (imageView2 != null) {
                                i11 = R.id.ll_hint_parent;
                                LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_hint_parent);
                                if (linearLayout != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                    i11 = R.id.tv_trans;
                                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                    if (textView != null) {
                                        return new hj.i2(linearLayout2, frameLayout, editText, flexboxLayout, z5VarB, imageView, imageView2, linearLayout, textView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
