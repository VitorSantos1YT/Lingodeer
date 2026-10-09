package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.lingodeer.R;
import fr.j3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f32251a = new k(1, hj.j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPdGrammarBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pd_grammar, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        if (((AppBarLayout) j3.q(viewInflate, R.id.app_bar)) != null) {
            i11 = R.id.btn_all;
            TextView textView = (TextView) j3.q(viewInflate, R.id.btn_all);
            if (textView != null) {
                i11 = R.id.btn_fav;
                TextView textView2 = (TextView) j3.q(viewInflate, R.id.btn_fav);
                if (textView2 != null) {
                    i11 = R.id.const_empty_content;
                    View viewQ = j3.q(viewInflate, R.id.const_empty_content);
                    if (viewQ != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewQ;
                        int i12 = R.id.iv_empty;
                        if (((ImageView) j3.q(viewQ, R.id.iv_empty)) != null) {
                            i12 = R.id.tv_desc;
                            TextView textView3 = (TextView) j3.q(viewQ, R.id.tv_desc);
                            if (textView3 != null) {
                                i12 = R.id.tv_title;
                                if (((TextView) j3.q(viewQ, R.id.tv_title)) != null) {
                                    e3 e3Var = new e3(constraintLayout, constraintLayout, textView3, 3);
                                    i11 = R.id.iv_filter;
                                    ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_filter);
                                    if (imageView != null) {
                                        i11 = R.id.progress_bar;
                                        ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                                        if (progressBar != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                            i11 = R.id.toolbar;
                                            if (((Toolbar) j3.q(viewInflate, R.id.toolbar)) != null) {
                                                i11 = R.id.tv_index;
                                                TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_index);
                                                if (textView4 != null) {
                                                    i11 = R.id.tv_tag_count;
                                                    TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_tag_count);
                                                    if (textView5 != null) {
                                                        i11 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) j3.q(viewInflate, R.id.view_pager);
                                                        if (viewPager2 != null) {
                                                            i11 = R.id.view_pager_fav;
                                                            ViewPager2 viewPager3 = (ViewPager2) j3.q(viewInflate, R.id.view_pager_fav);
                                                            if (viewPager3 != null) {
                                                                return new hj.j0(constraintLayout2, textView, textView2, e3Var, imageView, progressBar, textView4, textView5, viewPager2, viewPager3);
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
                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
