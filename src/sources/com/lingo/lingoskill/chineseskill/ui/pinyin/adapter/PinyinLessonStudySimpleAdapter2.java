package com.lingo.lingoskill.chineseskill.ui.pinyin.adapter;

import android.view.View;
import android.widget.ImageView;
import bq.z;
import com.bumptech.glide.f;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter2;
import com.lingodeer.R;
import fz.c;
import fz.e;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import qy.b0;
import xi.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PinyinLessonStudySimpleAdapter2 extends BaseQuickAdapter<d, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21747a;

    public PinyinLessonStudySimpleAdapter2(ArrayList arrayList, e eVar) {
        super(R.layout.item_pinyin_lesson_study_simple_2, arrayList);
        this.f21747a = eVar;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, d dVar) {
        final d item = dVar;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_pinyin_sm, item.f56102a);
        helper.setText(R.id.tv_pinyin_ym, item.f56103b);
        helper.setText(R.id.tv_pinyin, item.f56104c);
        final ImageView imageView = (ImageView) helper.getView(R.id.iv_audio_sm);
        final ImageView imageView2 = (ImageView) helper.getView(R.id.iv_audio_ym);
        final ImageView imageView3 = (ImageView) helper.getView(R.id.iv_audio_py);
        m.c(imageView);
        final int i11 = 0;
        z.b(imageView, new c(this) { // from class: vi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinyinLessonStudySimpleAdapter2 f54070b;

            {
                this.f54070b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView, f.r(1, item.f56102a));
                        break;
                    case 1:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView, f.r(1, item.f56103b));
                        break;
                    default:
                        m.f(it, "it");
                        e eVar = this.f54070b.f21747a;
                        d dVar2 = item;
                        String str = dVar2.f56102a;
                        String str2 = dVar2.f56103b;
                        new xi.b(1, str, str2, true);
                        String strA = fv.f.a(1, str, str2);
                        eVar.invoke(imageView, xt.b.a().b() + strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view = helper.getView(R.id.tv_pinyin_sm);
        m.e(view, "getView(...)");
        z.b(view, new ih.c(imageView, 10));
        m.c(imageView2);
        final int i12 = 1;
        z.b(imageView2, new c(this) { // from class: vi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinyinLessonStudySimpleAdapter2 f54070b;

            {
                this.f54070b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView2, f.r(1, item.f56102a));
                        break;
                    case 1:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView2, f.r(1, item.f56103b));
                        break;
                    default:
                        m.f(it, "it");
                        e eVar = this.f54070b.f21747a;
                        d dVar2 = item;
                        String str = dVar2.f56102a;
                        String str2 = dVar2.f56103b;
                        new xi.b(1, str, str2, true);
                        String strA = fv.f.a(1, str, str2);
                        eVar.invoke(imageView2, xt.b.a().b() + strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view2 = helper.getView(R.id.tv_pinyin_ym);
        m.e(view2, "getView(...)");
        z.b(view2, new ih.c(imageView2, 11));
        m.c(imageView3);
        final int i13 = 2;
        z.b(imageView3, new c(this) { // from class: vi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinyinLessonStudySimpleAdapter2 f54070b;

            {
                this.f54070b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView3, f.r(1, item.f56102a));
                        break;
                    case 1:
                        m.f(it, "it");
                        this.f54070b.f21747a.invoke(imageView3, f.r(1, item.f56103b));
                        break;
                    default:
                        m.f(it, "it");
                        e eVar = this.f54070b.f21747a;
                        d dVar2 = item;
                        String str = dVar2.f56102a;
                        String str2 = dVar2.f56103b;
                        new xi.b(1, str, str2, true);
                        String strA = fv.f.a(1, str, str2);
                        eVar.invoke(imageView3, xt.b.a().b() + strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view3 = helper.getView(R.id.tv_pinyin);
        m.e(view3, "getView(...)");
        z.b(view3, new ih.c(imageView3, 12));
    }
}
