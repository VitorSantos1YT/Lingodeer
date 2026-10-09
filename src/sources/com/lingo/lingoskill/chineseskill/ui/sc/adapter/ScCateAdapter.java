package com.lingo.lingoskill.chineseskill.ui.sc.adapter;

import ay.x;
import bp.g4;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingodeer.R;
import ff.h;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ky.e;
import n9.q;
import px.b;
import ry.l;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScCateAdapter extends BaseQuickAdapter<TravelCategory, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f21758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScCateAdapter(ArrayList arrayList, q dispose) {
        super(R.layout.item_cs_sc_cate, arrayList);
        m.f(dispose, "dispose");
        this.f21758a = dispose;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, TravelCategory travelCategory) {
        String str;
        TravelCategory item = travelCategory;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_name, item.getTranslation());
        try {
            if (j.d() == 1) {
                str = "jp_sc_";
            } else if (j.d() == 2) {
                str = "kr_sc_";
            } else if (j.d() == 3 || j.d() == 7) {
                str = "en_sc_";
            } else if (j.d() == 57) {
                str = "thai_sc_";
            } else if (j.d() == 21) {
                str = "tur_sc_";
            } else if (j.d() == 61) {
                str = "hi_sc_";
            } else if (j.d() == 63) {
                str = "ukr_sc_";
            } else if (j.d() == 65) {
                str = "grk_sc_";
            } else if (j.d() == 18) {
                str = "idn_sc_";
            } else if (j.d() == 69) {
                str = "mal_sc_";
            } else if (j.d() == 19) {
                str = "pol_sc_";
            } else if (l.D(new Integer[]{51, 55}, Integer.valueOf(j.d()))) {
                str = "ara_sc_";
            } else if (j.d() == 10 && item.getCategoryId() > 11) {
                str = "ru_sc_";
            } else if (j.d() == 6 && item.getCategoryId() > 11) {
                str = "de_sc_";
            } else if (j.d() != 20 || item.getCategoryId() <= 7) {
                str = (j.d() != 8 || item.getCategoryId() <= 11) ? "sc_" : "pt_sc_";
            } else {
                str = "it_sc_";
            }
            helper.setImageResource(R.id.iv_icon, h.v(str + item.getCategoryId()));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        j.a(new x(new g4(item, 2)).k(e.f38937b).g(b.a()).h(new ob.e(3, helper, this), vx.b.f54316e), this.f21758a);
    }
}
