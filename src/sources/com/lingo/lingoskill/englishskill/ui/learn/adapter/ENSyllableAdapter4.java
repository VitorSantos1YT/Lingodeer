package com.lingo.lingoskill.englishskill.ui.learn.adapter;

import aj.b;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import ep.a;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ENSyllableAdapter4 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f21801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ENSyllableAdapter4(List list, List list2, b listener) {
        super(R.layout.en_syllable_table_3_item, list);
        m.f(listener, "listener");
        this.f21800a = list2;
        this.f21801b = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        ?? r9 = 0;
        int i11 = 6;
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_parent);
        int size = listW0.size();
        int i12 = 0;
        for (Object obj : listW0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                o.V();
                throw null;
            }
            String str2 = (String) obj;
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.en_syllable_table_item_1, linearLayout, (boolean) r9);
            m.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            if (helper.getAdapterPosition() <= 0) {
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                textView.setBackgroundColor(mContext.getColor(R.color.colorAccent));
                a.z(this.mContext, "mContext", R.color.white, textView);
            } else {
                Context mContext2 = this.mContext;
                m.e(mContext2, "mContext");
                textView.setBackgroundColor(mContext2.getColor(R.color.white));
                a.z(this.mContext, "mContext", R.color.primary_black, textView);
            }
            SpannableString spannableString = new SpannableString(str2);
            if (helper.getAdapterPosition() > 0) {
                int adapterPosition = helper.getAdapterPosition() - 1;
                List list = this.f21800a;
                if (adapterPosition < list.size()) {
                    boolean z11 = r9;
                    for (String str3 : q.W0((String) list.get(helper.getAdapterPosition() - 1), new String[]{"\n"}, r9, i11)) {
                        int iI0 = q.I0(spannableString, str3, z11 ? 1 : 0, z11, i11);
                        if (iI0 > -1) {
                            Context mContext3 = this.mContext;
                            m.e(mContext3, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), iI0, str3.length() + iI0, 33);
                            z11 = 0;
                        }
                        i11 = 6;
                        z11 = z11;
                    }
                }
            }
            if (helper.getAdapterPosition() > 0) {
                textView.setOnClickListener(this.f21801b);
            }
            textView.setText(spannableString);
            if (i12 < 2) {
                textView.setTag(R.id.tag_is_bre, Boolean.TRUE);
            } else {
                textView.setTag(R.id.tag_is_bre, Boolean.FALSE);
            }
            linearLayout.addView(textView);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            m.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = 0;
            if (size == 2) {
                layoutParams2.weight = 1.0f;
            } else if (size == 4) {
                if (i12 % 2 == 0) {
                    layoutParams2.weight = 1.0f;
                    textView.setTextSize(14.0f);
                    a.z(this.mContext, "mContext", R.color.second_black, textView);
                } else {
                    textView.setTextSize(16.0f);
                    a.z(this.mContext, "mContext", R.color.primary_black, textView);
                    layoutParams2.weight = 2.0f;
                }
            }
            textView.setLayoutParams(layoutParams2);
            r9 = 0;
            i12 = i13;
            i11 = 6;
        }
    }
}
