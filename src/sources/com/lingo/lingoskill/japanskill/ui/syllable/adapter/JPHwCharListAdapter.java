package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

import android.view.View;
import bq.i;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import qy.l;
import th.e;
import ur.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JPHwCharListAdapter extends BaseQuickAdapter<HwCharacter, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f21903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JPHwCharListAdapter(ArrayList arrayList, a eventTracker) {
        super(R.layout.item_jp_hw_char_list, arrayList);
        m.f(eventTracker, "eventTracker");
        this.f21901a = eventTracker;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        this.f21902b = new e(lingoSkillApplication);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, HwCharacter hwCharacter) {
        HwCharacter item = hwCharacter;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_trans, item.getTranslation());
        helper.setText(R.id.tv_zhuyin, item.getPinyin());
        HwView hwView = (HwView) helper.getView(R.id.hw_view);
        hwView.g();
        hwView.setVisibility(8);
        HwCharThumbView hwCharThumbView = (HwCharThumbView) helper.getView(R.id.hw_thumb_view);
        hwCharThumbView.setAHanzi(item.getShowCharPath());
        hwCharThumbView.setVisibility(0);
        l lVarA = i.a(item);
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new b1.a(this, hwView, hwCharThumbView, item, lVarA, 13));
    }
}
