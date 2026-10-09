package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f4805a = new s3(1, hj.f0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityNewsFeedBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_news_feed, (ViewGroup) null, false);
        int i11 = R.id.chat_in_mes;
        if (((TextView) fr.j3.q(viewInflate, R.id.chat_in_mes)) != null) {
            i11 = R.id.ll_chat_now;
            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_chat_now);
            if (linearLayout != null) {
                i11 = R.id.recycler_feeds;
                RecyclerView recyclerView = (RecyclerView) fr.j3.q(viewInflate, R.id.recycler_feeds);
                if (recyclerView != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) fr.j3.q(viewInflate, R.id.swipe_refresh_layout);
                    if (swipeRefreshLayout != null) {
                        return new hj.f0(linearLayout2, linearLayout, recyclerView, swipeRefreshLayout);
                    }
                    i11 = R.id.swipe_refresh_layout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
