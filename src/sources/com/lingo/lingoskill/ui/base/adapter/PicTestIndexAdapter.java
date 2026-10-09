package com.lingo.lingoskill.ui.base.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.Lesson;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PicTestIndexAdapter extends BaseQuickAdapter<Lesson, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Lesson lesson) {
        Lesson item = lesson;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_lesson_name, "Lesson " + item.getLessonId() + " (" + (helper.getAdapterPosition() + 1) + ")");
    }
}
