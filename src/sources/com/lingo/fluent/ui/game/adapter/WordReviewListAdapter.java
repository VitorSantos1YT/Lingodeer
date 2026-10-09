package com.lingo.fluent.ui.game.adapter;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.fluent.widget.DonutProgress;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import pr.a0;
import th.e;
import th.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordReviewListAdapter extends BaseQuickAdapter<PdWord, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f21662c;

    public WordReviewListAdapter(ArrayList arrayList, e eVar, long j11) {
        super(R.layout.item_word_spell_review_section_body, arrayList);
        this.f21660a = eVar;
        this.f21661b = j11;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, PdWord pdWord) {
        PdWord item = pdWord;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_word, item.getDetailWord());
        helper.setText(R.id.tv_trans, item.getDetailTrans());
        View view = helper.getView(R.id.tv_zhuyin);
        m.e(view, "getView(...)");
        View view2 = helper.getView(R.id.tv_word);
        m.e(view2, "getView(...)");
        View view3 = helper.getView(R.id.tv_luoma);
        m.e(view3, "getView(...)");
        h.b(item, (TextView) view, (TextView) view2, (TextView) view3, 432);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a0(this, imageView, item, 13));
        long j11 = this.f21661b;
        if (j11 == 2) {
            helper.itemView.setBackgroundResource(R.drawable.bg_word_spell_preview_item);
        } else if (j11 == 3) {
            helper.itemView.setBackgroundResource(R.drawable.bg_word_choose_preview_item);
        } else if (j11 == 1) {
            helper.itemView.setBackgroundResource(R.drawable.bg_word_listen_preview_item);
        }
        DonutProgress donutProgress = (DonutProgress) helper.getView(R.id.pb_member);
        donutProgress.setFinishedStrokeColor(Color.parseColor("#7ED321"));
        donutProgress.setProgress(item.getCorrectRate().floatValue() * 100);
    }
}
