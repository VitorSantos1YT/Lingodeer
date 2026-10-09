package com.lingo.lingoskill.ui.base.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cf.x;
import com.bumptech.glide.c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingodeer.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewsFeedAdapter extends BaseQuickAdapter<NewsFeed, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f22047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedAdapter(ArrayList data) {
        super(R.layout.item_news_feed, data);
        m.f(data, "data");
        this.f22047a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, NewsFeed newsFeed) throws ParseException {
        NewsFeed item = newsFeed;
        m.f(helper, "helper");
        m.f(item, "item");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_banner);
        TextView textView = (TextView) helper.getView(R.id.tv_title);
        TextView textView2 = (TextView) helper.getView(R.id.tv_summary);
        TextView textView3 = (TextView) helper.getView(R.id.tv_pub_date);
        String feedBannar = item.getFeedBannar();
        m.e(feedBannar, "getFeedBannar(...)");
        int i11 = 0;
        if (feedBannar.length() > 0) {
            imageView.setVisibility(0);
            c.e(this.mContext).k(item.getFeedBannar()).x(imageView);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(item.getFeedTitle());
        textView2.setText(item.getFeedSummary());
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String hasReadFeedList = x.n().hasReadFeedList;
        m.e(hasReadFeedList, "hasReadFeedList");
        if (q.v0(hasReadFeedList, item.getFeedId() + ";", false)) {
            View[] viewArr = {imageView, textView, textView2, textView3};
            while (i11 < 4) {
                viewArr[i11].setAlpha(0.5f);
                i11++;
            }
        } else {
            View[] viewArr2 = {imageView, textView, textView2, textView3};
            while (i11 < 4) {
                viewArr2[i11].setAlpha(1.0f);
                i11++;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = simpleDateFormat.parse(item.getPubDate());
        String str = simpleDateFormat.format(new Date());
        Date date2 = simpleDateFormat.parse(str);
        if (m.a(item.getPubDate(), str)) {
            textView3.setText("Today");
            return;
        }
        long time = date2.getTime() - date.getTime();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = time / timeUnit.toMillis(1L);
        if (1 <= millis && millis < 7) {
            textView3.setText((time / timeUnit.toMillis(1L)) + "d");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        int i12 = calendar2.get(2);
        int i13 = calendar2.get(5);
        int i14 = calendar2.get(1);
        int i15 = calendar.get(1);
        int i16 = calendar2.get(1);
        String[] strArr = this.f22047a;
        if (i15 == i16) {
            textView3.setText(strArr[i12] + " " + i13);
            return;
        }
        textView3.setText(strArr[i12] + " " + i13 + ", " + i14);
    }
}
