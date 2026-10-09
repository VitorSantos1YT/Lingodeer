package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.i4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f32307a = new x(3, i4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPdDetailFragmentBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pd_detail_fragment, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.btn_quit;
            MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.btn_quit);
            if (materialButton2 != null) {
                i11 = R.id.const_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.const_content);
                if (constraintLayout != null) {
                    i11 = R.id.frame_tips;
                    FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.frame_tips);
                    if (frameLayout != null) {
                        i11 = R.id.iv_add_gap;
                        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_add_gap);
                        if (imageView != null) {
                            i11 = R.id.iv_close;
                            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_close);
                            if (imageView2 != null) {
                                i11 = R.id.iv_ctl_sentence;
                                ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_ctl_sentence);
                                if (imageView3 != null) {
                                    i11 = R.id.iv_ctl_sentence_slow;
                                    ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_ctl_sentence_slow);
                                    if (imageView4 != null) {
                                        i11 = R.id.iv_ctl_word;
                                        ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_ctl_word);
                                        if (imageView5 != null) {
                                            i11 = R.id.iv_remove_gap;
                                            ImageView imageView6 = (ImageView) j3.q(viewInflate, R.id.iv_remove_gap);
                                            if (imageView6 != null) {
                                                i11 = R.id.iv_tips;
                                                ImageView imageView7 = (ImageView) j3.q(viewInflate, R.id.iv_tips);
                                                if (imageView7 != null) {
                                                    i11 = R.id.iv_trans;
                                                    ImageView imageView8 = (ImageView) j3.q(viewInflate, R.id.iv_trans);
                                                    if (imageView8 != null) {
                                                        i11 = R.id.ll_control;
                                                        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_control);
                                                        if (linearLayout != null) {
                                                            i11 = R.id.ll_control_word_gap;
                                                            if (((LinearLayout) j3.q(viewInflate, R.id.ll_control_word_gap)) != null) {
                                                                i11 = R.id.recycler_view;
                                                                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
                                                                if (recyclerView != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                    i11 = R.id.scroll_view;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) j3.q(viewInflate, R.id.scroll_view);
                                                                    if (nestedScrollView != null) {
                                                                        i11 = R.id.status_bar_view;
                                                                        View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                                                                        if (viewQ != null) {
                                                                            i11 = R.id.toolbar;
                                                                            View viewQ2 = j3.q(viewInflate, R.id.toolbar);
                                                                            if (viewQ2 != null) {
                                                                                b6 b6VarB = b6.b(viewQ2);
                                                                                i11 = R.id.tv_gap_time;
                                                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_gap_time);
                                                                                if (textView != null) {
                                                                                    i11 = R.id.view_pager;
                                                                                    ViewPager2 viewPager2 = (ViewPager2) j3.q(viewInflate, R.id.view_pager);
                                                                                    if (viewPager2 != null) {
                                                                                        return new i4(constraintLayout2, materialButton, materialButton2, constraintLayout, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, linearLayout, recyclerView, nestedScrollView, viewQ, b6VarB, textView, viewPager2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
