package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.divider.MaterialDivider;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d3 f4537a = new d3(1, hj.b0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityMainBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i11 = R.id.bnv;
        if (((BottomNavigationView) fr.j3.q(viewInflate, R.id.bnv)) != null) {
            i11 = R.id.compose_view;
            ComposeView composeView = (ComposeView) fr.j3.q(viewInflate, R.id.compose_view);
            if (composeView != null) {
                i11 = R.id.divider;
                if (((MaterialDivider) fr.j3.q(viewInflate, R.id.divider)) != null) {
                    i11 = R.id.frame_mask;
                    if (((FrameLayout) fr.j3.q(viewInflate, R.id.frame_mask)) != null) {
                        i11 = R.id.include_audiolesson_card;
                        View viewQ = fr.j3.q(viewInflate, R.id.include_audiolesson_card);
                        if (viewQ != null) {
                            hj.j jVarA = hj.j.a(viewQ);
                            View viewQ2 = fr.j3.q(viewInflate, R.id.include_custom_bnv_view);
                            if (viewQ2 != null) {
                                int i12 = R.id.ll_feed;
                                if (((LinearLayout) fr.j3.q(viewQ2, R.id.ll_feed)) != null) {
                                    i12 = R.id.ll_leaderboard;
                                    if (((LinearLayout) fr.j3.q(viewQ2, R.id.ll_leaderboard)) != null) {
                                        i12 = R.id.ll_me;
                                        if (((LinearLayout) fr.j3.q(viewQ2, R.id.ll_me)) != null) {
                                            i12 = R.id.ll_membership;
                                            if (((LinearLayout) fr.j3.q(viewQ2, R.id.ll_membership)) != null) {
                                                i12 = R.id.ll_review;
                                                if (((LinearLayout) fr.j3.q(viewQ2, R.id.ll_review)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    ViewPager2 viewPager2 = (ViewPager2) fr.j3.q(viewInflate, R.id.view_pager);
                                                    if (viewPager2 != null) {
                                                        return new hj.b0(constraintLayout, composeView, jVarA, viewPager2);
                                                    }
                                                    i11 = R.id.view_pager;
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewQ2.getResources().getResourceName(i12)));
                            }
                            i11 = R.id.include_custom_bnv_view;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
