package com.lingo.lingoskill.chineseskill.ui.pinyin.adapter;

import android.view.View;
import android.widget.ImageView;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import fz.e;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import pr.a0;
import xi.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PinyinLessonStudySimpleAdapter extends BaseQuickAdapter<a, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21746a;

    public PinyinLessonStudySimpleAdapter(ArrayList arrayList, e eVar) {
        super(R.layout.item_pinyin_lesson_study_simple, arrayList);
        this.f21746a = eVar;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, a aVar) {
        a item = aVar;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_pinyin, item.f56085a);
        helper.setText(R.id.tv_explains, item.f56086b);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        helper.setGone(R.id.tv_explains, false);
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a0(this, imageView, item, 25));
    }
}
