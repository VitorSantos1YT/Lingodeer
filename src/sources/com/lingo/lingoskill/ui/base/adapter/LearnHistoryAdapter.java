package com.lingo.lingoskill.ui.base.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import com.lingodeer.data.model.Daily;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import jh.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LearnHistoryAdapter extends BaseQuickAdapter<Daily, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Daily daily) {
        Daily item = daily;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_time, "+" + h.j(item.getLearnSecond()));
        helper.setText(R.id.tv_xp, "+" + item.getLearnXp());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
        try {
            helper.setText(R.id.tv_date, simpleDateFormat.format(simpleDateFormat2.parse(String.valueOf(item.getTime()))));
        } catch (ParseException e8) {
            e8.printStackTrace();
        }
        long time = item.getTime();
        Long lValueOf = Long.valueOf(simpleDateFormat2.format(Calendar.getInstance().getTime()));
        if (lValueOf != null && time == lValueOf.longValue()) {
            helper.setBackgroundRes(R.id.view_point, R.drawable.point_accent);
        } else {
            helper.setBackgroundRes(R.id.view_point, R.drawable.point_cararra);
        }
    }
}
