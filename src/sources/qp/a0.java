package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.a6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f47819a = new a0(3, hj.i1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnChallengeSentenceModelView13Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_challenge_sentence_model_view_13, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_try;
        if (((ImageView) fr.j3.q(viewInflate, R.id.btn_try)) != null) {
            i11 = R.id.card_del;
            ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.card_del);
            if (imageView != null) {
                i11 = R.id.const_title;
                View viewQ = fr.j3.q(viewInflate, R.id.const_title);
                if (viewQ != null) {
                    a6 a6VarA = a6.a(viewQ);
                    i11 = R.id.edit_content;
                    EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edit_content);
                    if (editText != null) {
                        i11 = R.id.fl_edit;
                        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_edit)) != null) {
                            i11 = R.id.flex_key_board;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_key_board);
                            if (flexboxLayout != null) {
                                i11 = R.id.iv_hint_audio;
                                ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_audio);
                                if (imageView2 != null) {
                                    i11 = R.id.iv_hint_eye;
                                    ImageView imageView3 = (ImageView) fr.j3.q(viewInflate, R.id.iv_hint_eye);
                                    if (imageView3 != null) {
                                        i11 = R.id.ll_hint_parent;
                                        LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_hint_parent);
                                        if (linearLayout != null) {
                                            i11 = R.id.ll_keyboard;
                                            if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_keyboard)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                return new hj.i1(constraintLayout, imageView, a6VarA, editText, flexboxLayout, imageView2, imageView3, linearLayout, constraintLayout);
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
