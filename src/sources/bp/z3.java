package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3 f4935a = new z3(1, hj.h0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityNewsFeedWebBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_news_feed_web, (ViewGroup) null, false);
        int i11 = R.id.include_empty_content_news_feed;
        View viewQ = fr.j3.q(viewInflate, R.id.include_empty_content_news_feed);
        if (viewQ != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewQ;
            int i12 = R.id.iv_empty;
            if (((ImageView) fr.j3.q(viewQ, R.id.iv_empty)) != null) {
                i12 = R.id.tv_desc;
                if (((TextView) fr.j3.q(viewQ, R.id.tv_desc)) != null) {
                    i12 = R.id.tv_title;
                    if (((TextView) fr.j3.q(viewQ, R.id.tv_title)) != null) {
                        hj.d3 d3Var = new hj.d3(constraintLayout, 2, constraintLayout);
                        i11 = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) fr.j3.q(viewInflate, R.id.progress_bar);
                        if (progressBar != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) fr.j3.q(viewInflate, R.id.web_view);
                            if (lollipopFixedWebView != null) {
                                return new hj.h0(linearLayout, d3Var, progressBar, lollipopFixedWebView);
                            }
                            i11 = R.id.web_view;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
