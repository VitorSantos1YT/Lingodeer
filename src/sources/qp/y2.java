package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f48272a = new y2(3, hj.c2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView131Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_13_1, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_try;
        ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.btn_try);
        if (imageView != null) {
            i11 = R.id.card_del;
            ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.card_del);
            if (imageView2 != null) {
                i11 = R.id.edit_content;
                EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edit_content);
                if (editText != null) {
                    i11 = R.id.fl_edit;
                    if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_edit)) != null) {
                        i11 = R.id.flex_key_board;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_key_board);
                        if (flexboxLayout != null) {
                            i11 = R.id.include_deer_audio;
                            View viewQ = fr.j3.q(viewInflate, R.id.include_deer_audio);
                            if (viewQ != null) {
                                b6 b6VarA = b6.a(viewQ);
                                i11 = R.id.iv_audio_small;
                                ImageView imageView3 = (ImageView) fr.j3.q(viewInflate, R.id.iv_audio_small);
                                if (imageView3 != null) {
                                    i11 = R.id.iv_hint_audio;
                                    ImageView imageView4 = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_audio);
                                    if (imageView4 != null) {
                                        i11 = R.id.iv_hint_eye;
                                        ImageView imageView5 = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_eye);
                                        if (imageView5 != null) {
                                            i11 = R.id.ll_hint_parent;
                                            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_hint_parent);
                                            if (linearLayout != null) {
                                                i11 = R.id.ll_keyboard;
                                                if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_keyboard)) != null) {
                                                    i11 = R.id.ll_title;
                                                    if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_title)) != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        i11 = R.id.tv_hint;
                                                        TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_hint);
                                                        if (textView != null) {
                                                            i11 = R.id.tv_trans;
                                                            TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                                            if (textView2 != null) {
                                                                return new hj.c2(constraintLayout, imageView, imageView2, editText, flexboxLayout, b6VarA, imageView3, imageView4, imageView5, linearLayout, constraintLayout, textView, textView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
