package com.lingo.lingoskill.ruskill.ui.learn.adapter;

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
public final class RUSyllableAdapter3 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f22013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RUSyllableAdapter3(List list, List list2, b listener) {
        super(R.layout.item_ru_table_3, list);
        m.f(listener, "listener");
        this.f22012a = list2;
        this.f22013b = listener;
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
    /* JADX WARN: Code duplicated, block: B:9:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.chad.library.adapter.base.BaseQuickAdapter, com.lingo.lingoskill.ruskill.ui.learn.adapter.RUSyllableAdapter3] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder baseViewHolder, String str) {
        View.OnClickListener onClickListener;
        LinearLayout linearLayout;
        ?? r11;
        BaseViewHolder helper = baseViewHolder;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        int i11 = R.id.tv_left;
        View view = helper.getView(R.id.tv_left);
        m.e(view, "getView(...)");
        a(helper, (TextView) view);
        boolean z11 = false;
        int i12 = 6;
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        helper.setText(R.id.tv_left, (CharSequence) listW0.get(0));
        int adapterPosition = helper.getAdapterPosition();
        int i13 = R.color.second_black;
        View.OnClickListener onClickListener2 = this.f22013b;
        List list = this.f22012a;
        if (adapterPosition > 0) {
            m.c(list);
            if (!m.a(list.get(0), "ch") && !m.a(listW0.get(0), "ç")) {
                ((TextView) helper.getView(R.id.tv_left)).setOnClickListener(onClickListener2);
            } else if (helper.getAdapterPosition() > 0) {
                a.z(this.mContext, "mContext", R.color.second_black, (TextView) helper.getView(R.id.tv_left));
            }
        } else if (helper.getAdapterPosition() > 0) {
            a.z(this.mContext, "mContext", R.color.second_black, (TextView) helper.getView(R.id.tv_left));
        }
        List listW1 = q.W0((CharSequence) listW0.get(1), new String[]{"!@@@!"}, 0, 6);
        LinearLayout linearLayout2 = (LinearLayout) helper.getView(R.id.ll_middle_container);
        Iterator it = listW1.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.include_ru_tv, linearLayout2, z11);
            m.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout3 = (LinearLayout) viewInflate;
            TextView textView = (TextView) linearLayout3.findViewById(i11);
            LinearLayout linearLayout4 = (LinearLayout) linearLayout3.findViewById(R.id.ll_right_container);
            List listW2 = q.W0(str2, new String[]{"_"}, z11 ? 1 : 0, i12);
            m.c(textView);
            a(helper, textView);
            if (helper.getAdapterPosition() > 0) {
                if (list == null || m.a(list.get(z11 ? 1 : 0), "á\nà\na\nâ\na\nA")) {
                    textView.setOnClickListener(onClickListener2);
                } else {
                    a.z(this.mContext, "mContext", i13, textView);
                }
            }
            textView.setText((CharSequence) listW2.get(z11 ? 1 : 0));
            Iterator it2 = q.W0((CharSequence) listW2.get(1), new String[]{"!***!"}, z11 ? 1 : 0, 6).iterator();
            ?? r9 = z11;
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.include_ru_item_right_2, linearLayout4, r9);
                TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_right_1);
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_right_2);
                Iterator it3 = it;
                Iterator it4 = it2;
                ?? W0 = q.W0(str3, new String[]{"!&&&!"}, r9, 6);
                m.c(textView2);
                a(helper, textView2);
                m.c(textView3);
                a(helper, textView3);
                if (helper.getAdapterPosition() > 0) {
                    textView2.setOnClickListener(onClickListener2);
                }
                String str4 = (String) W0.get(r9);
                SpannableString spannableString = new SpannableString(str4);
                if (list == null || list.isEmpty() || helper.getAdapterPosition() <= 0) {
                    onClickListener = onClickListener2;
                    list = list;
                    linearLayout = linearLayout2;
                    i14 = i14;
                    r11 = r9;
                } else {
                    onClickListener = onClickListener2;
                    linearLayout = linearLayout2;
                    String str5 = q.W0((CharSequence) list.get(helper.getAdapterPosition() + (-1)), new String[]{"\n"}, 0, 6).size() > 1 ? (String) q.W0((CharSequence) list.get(baseViewHolder.getAdapterPosition() - 1), new String[]{"\n"}, 0, 6).get(i14) : (String) q.W0((CharSequence) list.get(baseViewHolder.getAdapterPosition() - 1), new String[]{"\n"}, 0, 6).get(0);
                    if (!q.v0(str4, str5, false)) {
                        r11 = 0;
                    } else if (str4.equals("fala")) {
                        Context mContext = this.mContext;
                        m.e(mContext, "mContext");
                        r11 = 0;
                        spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(str4, str5, 1, false, 4), str5.length() + q.I0(str4, str5, 1, false, 4), 33);
                    } else {
                        list = list;
                        i14 = i14;
                        r11 = 0;
                        Context mContext2 = this.mContext;
                        m.e(mContext2, "mContext");
                        spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(str4, str5, 0, false, 6), str5.length() + q.I0(str4, str5, 0, false, 6), 33);
                    }
                }
                textView2.setText(spannableString);
                textView3.setText((CharSequence) W0.get(1));
                linearLayout4.addView(viewInflate2);
                i14++;
                helper = baseViewHolder;
                r9 = r11;
                it2 = it4;
                it = it3;
                list = list;
                onClickListener2 = onClickListener;
                linearLayout2 = linearLayout;
            }
            LinearLayout linearLayout5 = linearLayout2;
            linearLayout5.addView(linearLayout3);
            z11 = r9 == true ? 1 : 0;
            i12 = 6;
            list = list;
            i11 = R.id.tv_left;
            i13 = R.color.second_black;
            linearLayout2 = linearLayout5;
            helper = baseViewHolder;
        }
    }
}
