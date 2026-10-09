package com.lingo.lingoskill.ui.base.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import bq.r;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.fluent.widget.DonutProgress;
import com.lingodeer.R;
import com.lingodeer.data.model.LanStaticsInfo;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordsSentencesAdapter extends BaseQuickAdapter<LanStaticsInfo, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, LanStaticsInfo lanStaticsInfo) {
        LanStaticsInfo item = lanStaticsInfo;
        m.f(helper, "helper");
        m.f(item, "item");
        TextView textView = (TextView) helper.getView(R.id.tv_progress);
        TextView textView2 = (TextView) helper.getView(R.id.tv_course_name);
        textView.setVisibility(8);
        int[] iArr = r.f4959a;
        Context mContext = this.mContext;
        m.e(mContext, "mContext");
        textView2.setText(bq.m.s(mContext, item.getLan()));
        ((ImageView) helper.getView(R.id.iv_flag)).setImageResource(h.v("ic_left_draw_lan_".concat(bq.m.t(item.getLan()))));
        item.getProgress();
        DonutProgress donutProgress = (DonutProgress) helper.getView(R.id.pb_learning);
        donutProgress.setMax(1000);
        donutProgress.setProgress(item.getProgress());
        if (item.getProgress() > CropImageView.DEFAULT_ASPECT_RATIO) {
            textView.setVisibility(0);
            textView.setText((item.getProgress() / 10) + txBUGYhC.ODQAlIqlzyP);
        }
        ((TextView) helper.getView(R.id.tv_words_count)).setText(String.valueOf(item.getWordsCount()));
        ((TextView) helper.getView(R.id.tv_sentences_count)).setText(String.valueOf(item.getSentencesCount()));
        ((TextView) helper.getView(R.id.tv_words_sentences_count)).setText(String.valueOf(item.getWordsSentencesCount()));
    }
}
