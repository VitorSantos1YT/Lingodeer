package bp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.NewsFeedDetailActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3 implements BaseQuickAdapter.OnItemClickListener, oa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewsFeedActivity f4793a;

    public /* synthetic */ r3(NewsFeedActivity newsFeedActivity) {
        this.f4793a = newsFeedActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        NewsFeedActivity newsFeedActivity = this.f4793a;
        Object obj = newsFeedActivity.Q.get(i11);
        kotlin.jvm.internal.m.e(obj, "get(...)");
        NewsFeed newsFeed = (NewsFeed) obj;
        newsFeedActivity.m().c("jxz_news_feed_click", new av.d(newsFeed, 8));
        String feedURL = newsFeed.getFeedURL();
        kotlin.jvm.internal.m.e(feedURL, "getFeedURL(...)");
        if (feedURL.length() > 0) {
            Uri uri = Uri.parse(newsFeed.getFeedURL());
            boolean z11 = false;
            for (String str : uri.getQueryParameterNames()) {
                uri.getQueryParameter(str);
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter == null) {
                    queryParameter = BuildConfig.VERSION_NAME;
                }
                if (kotlin.jvm.internal.m.a(str, "oib")) {
                    try {
                        z11 = Boolean.parseBoolean(queryParameter);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
            if (z11) {
                try {
                    newsFeedActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(newsFeed.getFeedURL())));
                } catch (Exception unused) {
                    Intent intent = new Intent(newsFeedActivity, (Class<?>) NewsFeedDetailActivity.class);
                    intent.putExtra(INTENTS.EXTRA_OBJECT, newsFeed);
                    newsFeedActivity.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(newsFeedActivity, (Class<?>) NewsFeedDetailActivity.class);
                intent2.putExtra(INTENTS.EXTRA_OBJECT, newsFeed);
                newsFeedActivity.startActivity(intent2);
            }
        } else {
            Intent intent3 = new Intent(newsFeedActivity, (Class<?>) NewsFeedDetailActivity.class);
            intent3.putExtra(INTENTS.EXTRA_OBJECT, newsFeed);
            newsFeedActivity.startActivity(intent3);
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(newsFeedActivity), null, null, new t3(newsFeedActivity, newsFeed, i11, (vy.d) null, 0), 3);
    }
}
