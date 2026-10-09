package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.BrainWaveView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4 f4901a = new x4(3, hj.x4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentScReviewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_sc_review, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.brain_wave_view;
        if (((BrainWaveView) fr.j3.q(viewInflate, R.id.brain_wave_view)) != null) {
            i11 = R.id.card_grammar_ack;
            if (((MaterialCardView) fr.j3.q(viewInflate, R.id.card_grammar_ack)) != null) {
                i11 = R.id.fl_games;
                FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_games);
                if (frameLayout != null) {
                    i11 = R.id.flash_card_go_btn;
                    ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.flash_card_go_btn);
                    if (imageView != null) {
                        i11 = R.id.frame_click;
                        if (((FrameLayout) fr.j3.q(viewInflate, R.id.frame_click)) != null) {
                            i11 = R.id.frame_text_parent;
                            FrameLayout frameLayout2 = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_text_parent);
                            if (frameLayout2 != null) {
                                i11 = R.id.include_deerplus;
                                View viewQ = fr.j3.q(viewInflate, R.id.include_deerplus);
                                if (viewQ != null) {
                                    hj.k.a(viewQ);
                                    i11 = R.id.iv_bg_srs;
                                    if (((ImageView) fr.j3.q(viewInflate, R.id.iv_bg_srs)) != null) {
                                        i11 = R.id.iv_brain;
                                        ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.iv_brain);
                                        if (imageView2 != null) {
                                            i11 = R.id.ll_starred;
                                            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_starred);
                                            if (linearLayout != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                i11 = R.id.scroll_view;
                                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_view)) != null) {
                                                    i11 = R.id.status_bar_view;
                                                    View viewQ2 = fr.j3.q(viewInflate, R.id.status_bar_view);
                                                    if (viewQ2 != null) {
                                                        i11 = R.id.tv_grammar_cards_num;
                                                        TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_grammar_cards_num);
                                                        if (textView != null) {
                                                            return new hj.x4(constraintLayout, frameLayout, imageView, frameLayout2, imageView2, linearLayout, viewQ2, textView);
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
