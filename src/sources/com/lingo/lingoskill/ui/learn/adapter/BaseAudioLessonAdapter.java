package com.lingo.lingoskill.ui.learn.adapter;

import a0.b2;
import ay.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.common.cache.a;
import com.lingodeer.R;
import dy.j;
import java.io.File;
import java.util.List;
import km.d0;
import kotlin.jvm.internal.m;
import kp.h;
import ky.e;
import n9.q;
import px.b;
import xx.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseAudioLessonAdapter extends BaseQuickAdapter<File, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f22063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAudioLessonAdapter(List data, long j11, q dispose) {
        super(R.layout.item_audio_lesson_index, data);
        m.f(data, "data");
        m.f(dispose, "dispose");
        this.f22062a = j11;
        this.f22063b = dispose;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, File file) {
        File item = file;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_lesson_name, this.mContext.getString(R.string.lesson_s, String.valueOf(helper.getBindingAdapterPosition() + 1)));
        x xVar = new x(new d0(item));
        j jVar = e.f38937b;
        f fVarH = xVar.k(jVar).g(b.a()).h(new b2(helper, 26), h.f38396b);
        q qVar = this.f22063b;
        th.j.a(fVarH, qVar);
        th.j.a(new x(new a(6, this, helper)).k(jVar).g(b.a()).h(new hd.b(helper, 27), h.f38397c), qVar);
    }
}
