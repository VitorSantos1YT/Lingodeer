package com.lingo.lingoskill.ptskill.ui.syllable.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import i0.pKy.shrCcjmOhAmRC;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;
import oz.x;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PTHeavyTableAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22004b;

    public PTHeavyTableAdapter(int i11, List list, List list2) {
        super(R.layout.pt_syllable_heavy_item, list);
        this.f22003a = list2;
        this.f22004b = i11;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List list;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        int adapterPosition = helper.getAdapterPosition();
        int i11 = this.f22004b;
        if (adapterPosition <= i11) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            helper.setBackgroundColor(R.id.ll_parent, mContext.getColor(R.color.colorAccent));
            c.v(this.mContext, "mContext", R.color.white, helper, R.id.tv_content);
        } else {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            helper.setBackgroundColor(R.id.ll_parent, mContext2.getColor(R.color.white));
            c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
            helper.addOnClickListener(R.id.ll_parent);
        }
        SpannableString spannableString = new SpannableString(item);
        if (helper.getAdapterPosition() > i11 && (list = this.f22003a) != null && !list.isEmpty()) {
            int i12 = i11 + 1;
            String str2 = this.mData.size() - i12 == list.size() ? (String) list.get(helper.getAdapterPosition() - i12) : (String) list.get(0);
            if (q.v0(item, str2, false)) {
                if (item.equals("bombom")) {
                    Context mContext3 = this.mContext;
                    m.e(mContext3, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), q.I0(item, str2, 2, false, 4), str2.length() + q.I0(item, str2, 2, false, 4), 33);
                } else {
                    Context mContext4 = this.mContext;
                    m.e(mContext4, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext4.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                }
            }
        }
        String str3 = shrCcjmOhAmRC.FKYpt;
        if (q.v0(item, str3, false) && q.v0(item, ")", false)) {
            if (x.s0(item, "pais", false)) {
                Context mContext5 = this.mContext;
                m.e(mContext5, "mContext");
                spannableString.setSpan(new ForegroundColorSpan(mContext5.getColor(R.color.second_black)), q.I0(item, str3, 0, false, 6), item.length(), 33);
            } else {
                Context mContext6 = this.mContext;
                m.e(mContext6, "mContext");
                spannableString.setSpan(new ForegroundColorSpan(mContext6.getColor(R.color.second_black)), q.I0(item, str3, 0, false, 6), q.I0(item, ")", 0, false, 6) + 1, 33);
            }
        }
        helper.setText(R.id.tv_content, spannableString);
    }
}
