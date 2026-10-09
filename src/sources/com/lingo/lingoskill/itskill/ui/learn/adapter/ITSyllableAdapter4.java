package com.lingo.lingoskill.itskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ITSyllableAdapter4 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21900a;

    public ITSyllableAdapter4(List list, List list2) {
        super(R.layout.item_it_table_5, list);
        this.f21900a = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        List listW0 = q.W0(item, new String[]{"!@@@!"}, 0, 6);
        helper.setText(R.id.tv_desc, (CharSequence) listW0.get(0));
        List listW1 = q.W0((CharSequence) listW0.get(1), new String[]{"\t"}, 0, 6);
        List list = this.f21900a;
        List listW2 = (list == null || list.isEmpty()) ? r.f50854a : this.mData.size() == list.size() ? q.W0((CharSequence) list.get(helper.getAdapterPosition()), new String[]{"\t"}, 0, 6) : q.W0((CharSequence) list.get(0), new String[]{"\t"}, 0, 6);
        View childAt = ((LinearLayout) helper.getView(R.id.ll_top)).getChildAt(0);
        m.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
        View childAt2 = ((LinearLayout) helper.getView(R.id.ll_top)).getChildAt(1);
        m.d(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        View childAt3 = ((LinearLayout) helper.getView(R.id.ll_btm)).getChildAt(0);
        m.d(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        View childAt4 = ((LinearLayout) helper.getView(R.id.ll_btm)).getChildAt(1);
        m.d(childAt4, "null cannot be cast to non-null type android.widget.TextView");
        int i11 = 0;
        for (Object obj : o.L(childAt, childAt2, childAt3, childAt4)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            ((TextView) obj).setText((CharSequence) listW1.get(i11));
            i11 = i12;
        }
        View childAt5 = ((LinearLayout) helper.getView(R.id.ll_top)).getChildAt(1);
        m.d(childAt5, "null cannot be cast to non-null type android.widget.TextView");
        View childAt6 = ((LinearLayout) helper.getView(R.id.ll_btm)).getChildAt(1);
        m.d(childAt6, "null cannot be cast to non-null type android.widget.TextView");
        int i13 = 0;
        for (Object obj2 : o.L(childAt5, childAt6)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                o.V();
                throw null;
            }
            TextView textView = (TextView) obj2;
            SpannableString spannableString = new SpannableString(textView.getText().toString());
            if (!listW2.isEmpty()) {
                String str2 = (String) listW2.get(i13);
                if (q.v0(textView.getText().toString(), str2, false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(textView.getText().toString(), str2, 0, false, 6), str2.length() + q.I0(textView.getText().toString(), str2, 0, false, 6), 33);
                }
            }
            textView.setText(spannableString);
            i13 = i14;
        }
        helper.addOnClickListener(R.id.tv_top_left);
        helper.addOnClickListener(R.id.tv_top_right);
        helper.addOnClickListener(R.id.tv_bottom_left);
        helper.addOnClickListener(R.id.tv_bottom_right);
    }
}
