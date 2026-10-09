package com.lingo.lingoskill.franchskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FRSyllableAdapter3 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21881a;

    public FRSyllableAdapter3(List list, List list2) {
        super(R.layout.fr_syllable_table_item_3, list);
        this.f21881a = list2;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        helper.setText(R.id.tv_left, (CharSequence) listW0.get(0));
        helper.setText(R.id.tv_left_2, (CharSequence) listW0.get(1));
        SpannableString spannableString = new SpannableString((CharSequence) listW0.get(2));
        List list = this.f21881a;
        if (list != null && !list.isEmpty()) {
            String str2 = this.mData.size() == list.size() ? (String) list.get(helper.getAdapterPosition()) : (String) list.get(0);
            if (q.v0((CharSequence) listW0.get(2), str2, false)) {
                if (x.k0((String) listW0.get(2), "[MX]", false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.color_43CC93)), q.I0((CharSequence) listW0.get(2), str2, 0, false, 6), str2.length() + q.I0((CharSequence) listW0.get(2), str2, 0, false, 6), 33);
                } else if (m.a(listW0.get(2), "bleibt") || m.a(listW0.get(2), "contacto")) {
                    Context mContext2 = this.mContext;
                    m.e(mContext2, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0((CharSequence) listW0.get(2), str2, 1, false, 4), str2.length() + q.I0((CharSequence) listW0.get(2), str2, 1, false, 4), 33);
                } else {
                    Context mContext3 = this.mContext;
                    m.e(mContext3, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), q.I0((CharSequence) listW0.get(2), str2, 0, false, 6), str2.length() + q.I0((CharSequence) listW0.get(2), str2, 0, false, 6), 33);
                }
            }
        }
        helper.setText(R.id.tv_right, spannableString);
        helper.addOnClickListener(R.id.tv_right);
    }
}
