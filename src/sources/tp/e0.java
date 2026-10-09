package tp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import fr.j3;
import hj.t3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f52455a = new e0(3, t3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentBaseFlashCardTestBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_base_flash_card_test, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.banner_view;
        if (((ConstraintLayout) j3.q(viewInflate, R.id.banner_view)) != null) {
            i11 = R.id.flash_card_eye_btn;
            AppCompatButton appCompatButton = (AppCompatButton) j3.q(viewInflate, R.id.flash_card_eye_btn);
            if (appCompatButton != null) {
                i11 = R.id.flash_card_grey_bg;
                ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.flash_card_grey_bg);
                if (constraintLayout != null) {
                    i11 = R.id.hw_view;
                    HwView hwView = (HwView) j3.q(viewInflate, R.id.hw_view);
                    if (hwView != null) {
                        i11 = R.id.remember_level_parent;
                        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.remember_level_parent);
                        if (linearLayout != null) {
                            i11 = R.id.rl_btm_panel;
                            if (((RelativeLayout) j3.q(viewInflate, R.id.rl_btm_panel)) != null) {
                                i11 = R.id.strokes_order_tian;
                                if (((ImageView) j3.q(viewInflate, R.id.strokes_order_tian)) != null) {
                                    i11 = R.id.strokes_replay_btn;
                                    ImageButton imageButton = (ImageButton) j3.q(viewInflate, R.id.strokes_replay_btn);
                                    if (imageButton != null) {
                                        i11 = R.id.strokes_write_btn;
                                        ImageButton imageButton2 = (ImageButton) j3.q(viewInflate, R.id.strokes_write_btn);
                                        if (imageButton2 != null) {
                                            i11 = R.id.strokes_writing2_btn;
                                            ImageButton imageButton3 = (ImageButton) j3.q(viewInflate, R.id.strokes_writing2_btn);
                                            if (imageButton3 != null) {
                                                i11 = R.id.tv_no_study;
                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_no_study);
                                                if (textView != null) {
                                                    i11 = R.id.tv_remember_badly;
                                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_remember_badly);
                                                    if (textView2 != null) {
                                                        i11 = R.id.tv_remember_normal;
                                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_remember_normal);
                                                        if (textView3 != null) {
                                                            i11 = R.id.tv_remember_perfect;
                                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_remember_perfect);
                                                            if (textView4 != null) {
                                                                i11 = R.id.tv_trans;
                                                                TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_trans);
                                                                if (textView5 != null) {
                                                                    i11 = R.id.tv_word;
                                                                    TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_word);
                                                                    if (textView6 != null) {
                                                                        return new t3((RelativeLayout) viewInflate, appCompatButton, constraintLayout, hwView, linearLayout, imageButton, imageButton2, imageButton3, textView, textView2, textView3, textView4, textView5, textView6);
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
