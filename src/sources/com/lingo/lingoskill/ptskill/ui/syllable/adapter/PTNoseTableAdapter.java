package com.lingo.lingoskill.ptskill.ui.syllable.adapter;

import aj.b;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import ep.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PTNoseTableAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f22005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTNoseTableAdapter(List list, b listener) {
        super(R.layout.item_pt_nose_table, list);
        m.f(listener, "listener");
        this.f22005a = listener;
    }

    public final void a(BaseViewHolder baseViewHolder, TextView textView) {
        if (baseViewHolder.getAdapterPosition() <= 0) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            textView.setBackgroundColor(mContext.getColor(R.color.colorAccent));
            a.z(this.mContext, "mContext", R.color.white, textView);
            return;
        }
        Context mContext2 = this.mContext;
        m.e(mContext2, "mContext");
        textView.setBackgroundColor(mContext2.getColor(R.color.white));
        a.z(this.mContext, "mContext", R.color.primary_black, textView);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        View view = helper.getView(R.id.tv_left);
        m.e(view, "getView(...)");
        a(helper, (TextView) view);
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        helper.setText(R.id.tv_left, (CharSequence) listW0.get(0));
        int adapterPosition = helper.getAdapterPosition();
        View.OnClickListener onClickListener = this.f22005a;
        if (adapterPosition > 0) {
            ((TextView) helper.getView(R.id.tv_left)).setOnClickListener(onClickListener);
        }
        List<String> listW1 = q.W0((CharSequence) listW0.get(1), new String[]{"!@@@!"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(helper.getView(R.id.ll_right_1));
        arrayList.add(helper.getView(R.id.ll_right_2));
        arrayList.add(helper.getView(R.id.ll_right_3));
        for (String str2 : listW1) {
            Object obj = arrayList.get(listW1.indexOf(str2));
            m.e(obj, "get(...)");
            LinearLayout linearLayout = (LinearLayout) obj;
            TextView textView = (TextView) linearLayout.findViewById(R.id.tv_right_1);
            TextView textView2 = (TextView) linearLayout.findViewById(R.id.tv_right_2);
            List listW2 = q.W0(str2, new String[]{"!&&&!"}, 0, 6);
            m.c(textView);
            a(helper, textView);
            m.c(textView2);
            a(helper, textView2);
            if (helper.getAdapterPosition() > 0) {
                a.z(this.mContext, "mContext", R.color.second_black, textView);
            }
            if (helper.getAdapterPosition() > 0) {
                textView2.setOnClickListener(onClickListener);
            }
            linearLayout.setVisibility(0);
            textView.setText((CharSequence) listW2.get(0));
            String str3 = (String) listW2.get(1);
            String string = q.i1((String) q.W0((CharSequence) listW2.get(0), new String[]{"（"}, 0, 6).get(0)).toString();
            SpannableString spannableString = new SpannableString(str3);
            if (q.v0(str3, string, false)) {
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(str3, string, 0, false, 6), string.length() + q.I0(str3, string, 0, false, 6), 33);
            }
            textView2.setText(spannableString);
        }
    }
}
