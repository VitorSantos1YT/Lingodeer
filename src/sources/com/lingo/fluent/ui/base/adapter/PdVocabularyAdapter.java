package com.lingo.fluent.ui.base.adapter;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bq.r;
import bq.z;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.material.datepicker.d;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import fu.j0;
import fv.c;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import n9.q;
import th.e;
import th.h;
import th.j;
import ur.a;
import xt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdVocabularyAdapter extends BaseQuickAdapter<PdWord, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f21654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f21655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdVocabularyAdapter(ArrayList arrayList, q dispose, e player, a eventTracker) {
        super(R.layout.item_pd_vocabulary, arrayList);
        m.f(dispose, "dispose");
        m.f(player, "player");
        m.f(eventTracker, "eventTracker");
        this.f21652a = player;
        this.f21653b = eventTracker;
        this.f21655d = new c();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, PdWord pdWord) {
        String strM;
        fv.a aVar;
        PdWord item = pdWord;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_trans, item.getDetailTrans());
        View view = helper.getView(R.id.tv_top);
        m.e(view, "getView(...)");
        View view2 = helper.getView(R.id.tv_middle);
        m.e(view2, "getView(...)");
        View view3 = helper.getView(R.id.tv_bottom);
        m.e(view3, "getView(...)");
        h.b(item, (TextView) view, (TextView) view2, (TextView) view3, 176);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_fav);
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String strD = ep.a.D(bq.m.k(x.n().keyLanguage), "_", item.getFavId());
        if (gh.c.f29196a == null) {
            synchronized (gh.c.class) {
                if (gh.c.f29196a == null) {
                    gh.c.f29196a = new gh.c();
                }
            }
        }
        m.c(gh.c.f29196a);
        if (gh.c.d(strD)) {
            imageView.setImageResource(R.drawable.ic_pd_word_tag_fav);
        } else {
            imageView.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
        }
        m.c(imageView);
        z.b(imageView, new j0(strD, imageView, this, 9));
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv_audio);
        Drawable drawable = imageView2.getDrawable();
        m.e(drawable, "getDrawable(...)");
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        if (item.getWordStruct() == 1) {
            String strF = b.a().f();
            Long wordId = item.getWordId();
            m.e(wordId, "getWordId(...)");
            StringBuilder sbM = d.m(wordId.longValue(), "pod-", bq.m.g(x.n().keyLanguage), "-w-yx-");
            sbM.append(".mp3");
            strM = defpackage.e.m(strF, sbM.toString());
        } else {
            String strF2 = b.a().f();
            Long wordId2 = item.getWordId();
            m.e(wordId2, "getWordId(...)");
            StringBuilder sbM2 = d.m(wordId2.longValue(), "pod-", bq.m.g(x.n().keyLanguage), "-w-");
            sbM2.append(".mp3");
            strM = defpackage.e.m(strF2, sbM2.toString());
        }
        String str = strM;
        if (item.getWordStruct() == 1) {
            Long wordId3 = item.getWordId();
            m.e(wordId3, "getWordId(...)");
            String strL = j.l(wordId3.longValue());
            Long wordId4 = item.getWordId();
            m.e(wordId4, "getWordId(...)");
            aVar = new fv.a(9L, strL, j.k(wordId4.longValue()));
        } else {
            Long wordId5 = item.getWordId();
            m.e(wordId5, "getWordId(...)");
            String strJ = j.j(wordId5.longValue());
            Long wordId6 = item.getWordId();
            m.e(wordId6, "getWordId(...)");
            aVar = new fv.a(9L, strJ, j.i(wordId6.longValue()));
        }
        z.b(imageView2, new b0.a(this, imageView2, str, aVar, 17));
    }
}
