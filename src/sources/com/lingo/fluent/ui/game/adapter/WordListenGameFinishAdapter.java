package com.lingo.fluent.ui.game.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import gu.g;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import pr.a0;
import ry.p;
import th.e;
import th.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordListenGameFinishAdapter extends BaseQuickAdapter<PdWord, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f21659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordListenGameFinishAdapter(ArrayList arrayList, e player) {
        super(R.layout.item_word_listen_finish_game_item, arrayList);
        m.f(player, "player");
        this.f21658a = player;
        if (arrayList == null || arrayList.size() <= 1) {
            return;
        }
        p.Z(arrayList, new g(18));
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
        View view4 = helper.getView(R.id.view_point);
        Long finishSortIndex = item.getFinishSortIndex();
        view4.setBackgroundResource((finishSortIndex != null && finishSortIndex.longValue() == 0) ? R.drawable.ic_word_status_wrong : R.drawable.ic_word_status_correct);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a0(this, imageView, item, 12));
    }
}
