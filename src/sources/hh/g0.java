package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.j4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f32233a = new g0(3, j4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPdLearnDictationBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pd_learn_dictation, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_finish;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_finish);
        if (materialButton != null) {
            i11 = R.id.btn_redo;
            MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.btn_redo);
            if (materialButton2 != null) {
                i11 = R.id.const_btm;
                ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.const_btm);
                if (constraintLayout != null) {
                    i11 = R.id.const_finish;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) j3.q(viewInflate, R.id.const_finish);
                    if (constraintLayout2 != null) {
                        i11 = R.id.const_toolbar;
                        if (((ConstraintLayout) j3.q(viewInflate, R.id.const_toolbar)) != null) {
                            i11 = R.id.flex_option;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_option);
                            if (flexboxLayout != null) {
                                i11 = R.id.iv_back;
                                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_back);
                                if (imageView != null) {
                                    i11 = R.id.iv_delete;
                                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_delete);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_keyboard;
                                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_keyboard);
                                        if (imageView3 != null) {
                                            i11 = R.id.iv_switch_display;
                                            ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_switch_display);
                                            if (imageView4 != null) {
                                                i11 = R.id.ll_parent;
                                                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
                                                if (linearLayout != null) {
                                                    i11 = R.id.scroll_option;
                                                    if (((NestedScrollView) j3.q(viewInflate, R.id.scroll_option)) != null) {
                                                        i11 = R.id.scroll_view;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) j3.q(viewInflate, R.id.scroll_view);
                                                        if (nestedScrollView != null) {
                                                            i11 = R.id.status_bar_view;
                                                            View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                                                            if (viewQ != null) {
                                                                i11 = R.id.tv_ok;
                                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_ok);
                                                                if (textView != null) {
                                                                    i11 = R.id.tv_title;
                                                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_title);
                                                                    if (textView2 != null) {
                                                                        i11 = R.id.tv_trans;
                                                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_trans);
                                                                        if (textView3 != null) {
                                                                            i11 = R.id.view_line;
                                                                            View viewQ2 = j3.q(viewInflate, R.id.view_line);
                                                                            if (viewQ2 != null) {
                                                                                return new j4((ConstraintLayout) viewInflate, materialButton, materialButton2, constraintLayout, constraintLayout2, flexboxLayout, imageView, imageView2, imageView3, imageView4, linearLayout, nestedScrollView, viewQ, textView, textView2, textView3, viewQ2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
