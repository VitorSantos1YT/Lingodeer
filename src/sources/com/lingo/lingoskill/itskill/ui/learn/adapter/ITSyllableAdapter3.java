package com.lingo.lingoskill.itskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;
import oz.x;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ITSyllableAdapter3 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21899a;

    public ITSyllableAdapter3(List list, List list2) {
        super(R.layout.item_it_table_4, list);
        this.f21899a = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listW0;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        List listW1 = q.W0(item, new String[]{"\t"}, 0, 6);
        List list = this.f21899a;
        if (list == null || list.isEmpty()) {
            listW0 = r.f50854a;
        } else {
            listW0 = this.mData.size() == list.size() ? q.W0((CharSequence) list.get(helper.getAdapterPosition()), new String[]{"\t"}, 0, 6) : q.W0((CharSequence) list.get(0), new String[]{"\t"}, 0, 6);
        }
        int i11 = 2;
        int i12 = R.id.tv_left;
        TextView[] textViewArr = {helper.getView(R.id.tv_left), helper.getView(R.id.tv_right)};
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            MultiAutoCompleteTextView multiAutoCompleteTextView = textViewArr[i13];
            int i15 = i14 + 1;
            SpannableString spannableString = new SpannableString((CharSequence) listW1.get(i14));
            if (!listW0.isEmpty()) {
                String str2 = i11 == listW0.size() ? (String) listW0.get(i14) : (String) listW0.get(0);
                if (q.v0((CharSequence) listW1.get(i14), str2, false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0((CharSequence) listW1.get(i14), str2, 0, false, 6), str2.length() + q.I0((CharSequence) listW1.get(i14), str2, 0, false, 6), 33);
                }
            }
            multiAutoCompleteTextView.setText(spannableString);
            i13++;
            i14 = i15;
            i11 = 2;
            i12 = R.id.tv_left;
        }
        ((TextView) helper.getView(i12)).setTag(x.q0(x.q0((String) q.W0((CharSequence) listW1.get(1), new String[]{" "}, 0, 6).get(0), "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
        helper.addOnClickListener(R.id.tv_left);
    }
}
