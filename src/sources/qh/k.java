package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import fr.j3;
import hj.v5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f47773a = new k(3, v5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentWordChooseGameIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_word_choose_game_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_play;
        TextView textView = (TextView) j3.q(viewInflate, R.id.btn_play);
        if (textView != null) {
            i11 = R.id.const_body;
            ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.const_body);
            if (constraintLayout != null) {
                i11 = R.id.flex_focus_on;
                if (((FlexboxLayout) j3.q(viewInflate, R.id.flex_focus_on)) != null) {
                    i11 = R.id.iv_close;
                    ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
                    if (imageView != null) {
                        i11 = R.id.iv_question;
                        ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_question);
                        if (imageView2 != null) {
                            i11 = R.id.ll_top;
                            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_top);
                            if (linearLayout != null) {
                                i11 = R.id.rdb_20;
                                RadioButton radioButton = (RadioButton) j3.q(viewInflate, R.id.rdb_20);
                                if (radioButton != null) {
                                    i11 = R.id.rdb_30;
                                    RadioButton radioButton2 = (RadioButton) j3.q(viewInflate, R.id.rdb_30);
                                    if (radioButton2 != null) {
                                        i11 = R.id.rdb_50;
                                        RadioButton radioButton3 = (RadioButton) j3.q(viewInflate, R.id.rdb_50);
                                        if (radioButton3 != null) {
                                            i11 = R.id.rdb_newer;
                                            RadioButton radioButton4 = (RadioButton) j3.q(viewInflate, R.id.rdb_newer);
                                            if (radioButton4 != null) {
                                                i11 = R.id.rdb_starred;
                                                RadioButton radioButton5 = (RadioButton) j3.q(viewInflate, R.id.rdb_starred);
                                                if (radioButton5 != null) {
                                                    i11 = R.id.rdb_weaker;
                                                    RadioButton radioButton6 = (RadioButton) j3.q(viewInflate, R.id.rdb_weaker);
                                                    if (radioButton6 != null) {
                                                        i11 = R.id.rdg_number_per_group;
                                                        RadioGroup radioGroup = (RadioGroup) j3.q(viewInflate, R.id.rdg_number_per_group);
                                                        if (radioGroup != null) {
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                            i11 = R.id.tv_desc;
                                                            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_desc);
                                                            if (textView2 != null) {
                                                                i11 = R.id.tv_focus_on;
                                                                if (((TextView) j3.q(viewInflate, R.id.tv_focus_on)) != null) {
                                                                    i11 = R.id.tv_number_per_group;
                                                                    if (((TextView) j3.q(viewInflate, R.id.tv_number_per_group)) != null) {
                                                                        i11 = R.id.tv_subtitle;
                                                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_subtitle);
                                                                        if (textView3 != null) {
                                                                            return new v5(constraintLayout2, textView, constraintLayout, imageView, imageView2, linearLayout, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, constraintLayout2, textView2, textView3);
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
