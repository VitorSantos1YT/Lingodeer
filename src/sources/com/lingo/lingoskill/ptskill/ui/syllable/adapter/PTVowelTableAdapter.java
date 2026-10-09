package com.lingo.lingoskill.ptskill.ui.syllable.adapter;

import aj.b;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import ep.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PTVowelTableAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f22007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTVowelTableAdapter(List list, List list2, b listener) {
        super(R.layout.item_pt_vowel_table, list);
        m.f(listener, "listener");
        this.f22006a = list2;
        this.f22007b = listener;
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

    /* JADX WARN: Code duplicated, block: B:11:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x024e  */
    /* JADX WARN: Code duplicated, block: B:9:0x006c  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder baseViewHolder, String str) {
        boolean z11;
        BaseViewHolder helper = baseViewHolder;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        int i11 = R.id.tv_left;
        View view = helper.getView(R.id.tv_left);
        m.e(view, "getView(...)");
        a(helper, (TextView) view);
        boolean z12 = false;
        int i12 = 6;
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        helper.setText(R.id.tv_left, (CharSequence) listW0.get(0));
        int adapterPosition = helper.getAdapterPosition();
        int i13 = R.color.second_black;
        View.OnClickListener onClickListener = this.f22007b;
        List list = this.f22006a;
        if (adapterPosition > 0) {
            m.c(list);
            if (!m.a(list.get(0), "ch") && !m.a(listW0.get(0), "ç")) {
                ((TextView) helper.getView(R.id.tv_left)).setOnClickListener(onClickListener);
            } else if (helper.getAdapterPosition() > 0) {
                a.z(this.mContext, "mContext", R.color.second_black, (TextView) helper.getView(R.id.tv_left));
            }
        } else if (helper.getAdapterPosition() > 0) {
            a.z(this.mContext, "mContext", R.color.second_black, (TextView) helper.getView(R.id.tv_left));
        }
        List listW1 = q.W0((CharSequence) listW0.get(1), new String[]{"!@@@!"}, 0, 6);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_middle_container);
        Iterator it = listW1.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.include_pt_tv, linearLayout, z12);
            m.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
            TextView textView = (TextView) linearLayout2.findViewById(i11);
            LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.ll_right_container);
            List listW2 = q.W0(str2, new String[]{"_"}, z12 ? 1 : 0, i12);
            m.c(textView);
            a(helper, textView);
            if (helper.getAdapterPosition() > 0) {
                if (list == null || m.a(list.get(z12 ? 1 : 0), "á\nà\na\nâ\na\nA")) {
                    textView.setOnClickListener(onClickListener);
                } else {
                    a.z(this.mContext, "mContext", i13, textView);
                }
            }
            textView.setText((CharSequence) listW2.get(z12 ? 1 : 0));
            Iterator it2 = q.W0((CharSequence) listW2.get(1), new String[]{"!***!"}, z12 ? 1 : 0, 6).iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.include_fr_item_right, linearLayout3, z12);
                TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_right_1);
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_right_2);
                Iterator it3 = it;
                Iterator it4 = it2;
                List listW3 = q.W0(str3, new String[]{"!&&&!"}, z12 ? 1 : 0, 6);
                m.c(textView2);
                a(helper, textView2);
                m.c(textView3);
                a(helper, textView3);
                if (helper.getAdapterPosition() > 0) {
                    a.z(this.mContext, "mContext", R.color.second_black, textView2);
                    textView3.setOnClickListener(onClickListener);
                }
                textView2.setText((CharSequence) listW3.get(z12 ? 1 : 0));
                String str4 = (String) listW3.get(1);
                SpannableString spannableString = new SpannableString(str4);
                if (list == null || list.isEmpty() || helper.getAdapterPosition() <= 0) {
                    z11 = z12 ? 1 : 0;
                } else {
                    String str5 = q.W0((CharSequence) list.get(helper.getAdapterPosition() + (-1)), new String[]{"\n"}, z12 ? 1 : 0, 6).size() > 1 ? (String) q.W0((CharSequence) list.get(baseViewHolder.getAdapterPosition() - 1), new String[]{"\n"}, z12 ? 1 : 0, 6).get(i14) : (String) q.W0((CharSequence) list.get(baseViewHolder.getAdapterPosition() - 1), new String[]{"\n"}, z12 ? 1 : 0, 6).get(z12 ? 1 : 0);
                    if (!q.v0(str4, str5, z12)) {
                        z11 = z12 ? 1 : 0;
                    } else if (str4.equals("fala")) {
                        Context mContext = this.mContext;
                        m.e(mContext, "mContext");
                        z11 = false;
                        spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(str4, str5, 1, false, 4), str5.length() + q.I0(str4, str5, 1, false, 4), 33);
                    } else {
                        z11 = z12 ? 1 : 0;
                        Context mContext2 = this.mContext;
                        m.e(mContext2, "mContext");
                        spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(str4, str5, z11 ? 1 : 0, z11, 6), str5.length() + q.I0(str4, str5, z11 ? 1 : 0, z11, 6), 33);
                    }
                }
                textView3.setText(spannableString);
                linearLayout3.addView(viewInflate2);
                i14++;
                helper = baseViewHolder;
                z12 = z11;
                onClickListener = onClickListener;
                it2 = it4;
                it = it3;
                list = list;
            }
            Object[] objArr = z12 ? 1 : 0;
            linearLayout.addView(linearLayout2);
            i12 = 6;
            onClickListener = onClickListener;
            i11 = R.id.tv_left;
            i13 = R.color.second_black;
            helper = baseViewHolder;
        }
    }
}
