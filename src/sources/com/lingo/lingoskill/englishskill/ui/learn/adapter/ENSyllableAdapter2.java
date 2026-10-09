package com.lingo.lingoskill.englishskill.ui.learn.adapter;

import aj.b;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
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
public final class ENSyllableAdapter2 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f21798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ENSyllableAdapter2(List list, List list2, b listener, boolean z11) {
        super(R.layout.en_syllable_table_item, list);
        m.f(listener, "listener");
        this.f21797a = list2;
        this.f21798b = listener;
        this.f21799c = z11;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.text.SpannableString, java.lang.CharSequence] */
    public final void b(TextView textView, List list, BaseViewHolder baseViewHolder) {
        int i11;
        List list2;
        ?? spannableStringBuilder = new SpannableStringBuilder();
        ?? r9 = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                o.V();
                throw null;
            }
            ?? spannableString = new SpannableString((String) obj);
            if (i12 == 1) {
                spannableString.setSpan(new RelativeSizeSpan(0.875f), r9, spannableString.length(), 33);
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.second_black)), r9, spannableString.length(), 33);
            }
            if (baseViewHolder.getAdapterPosition() <= 0 || (list2 = this.f21797a) == null) {
                i11 = 1;
            } else {
                if (baseViewHolder.getAdapterPosition() - 1 < list2.size()) {
                    int i14 = 6;
                    for (String str : q.W0((String) list2.get(baseViewHolder.getAdapterPosition() - 1), new String[]{"\n"}, r9, 6)) {
                        int iI0 = q.I0(spannableString, str, r9, r9, i14);
                        if (iI0 > -1) {
                            Context mContext2 = this.mContext;
                            m.e(mContext2, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), iI0, str.length() + iI0, 33);
                            r9 = 0;
                            i14 = 6;
                        } else {
                            r9 = 0;
                        }
                    }
                }
                i11 = 1;
            }
            if (i12 == i11) {
                spannableStringBuilder.append("\n");
                spannableStringBuilder.append(spannableString);
            } else {
                spannableStringBuilder.append(spannableString);
            }
            i12 = i13;
            r9 = 0;
        }
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(this.f21798b);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        TextView textView = (TextView) helper.getView(R.id.tv_left_1);
        TextView textView2 = (TextView) helper.getView(R.id.tv_left_2);
        TextView textView3 = (TextView) helper.getView(R.id.tv_right_1);
        TextView textView4 = (TextView) helper.getView(R.id.tv_right_2);
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        textView.setText((CharSequence) listW0.get(0));
        a(helper, textView);
        if (helper.getAdapterPosition() > 0) {
            m.c(textView2);
            b(textView2, q.W0((CharSequence) listW0.get(1), new String[]{"  "}, 0, 6), helper);
        } else {
            textView2.setText((CharSequence) listW0.get(1));
        }
        m.c(textView2);
        a(helper, textView2);
        textView3.setText((CharSequence) listW0.get(2));
        a(helper, textView3);
        if (helper.getAdapterPosition() > 0) {
            m.c(textView4);
            b(textView4, q.W0((CharSequence) listW0.get(3), new String[]{"  "}, 0, 6), helper);
        } else {
            textView4.setText((CharSequence) listW0.get(3));
        }
        m.c(textView4);
        a(helper, textView4);
        Boolean bool = Boolean.FALSE;
        textView.setTag(R.id.tag_is_bre, bool);
        textView3.setTag(R.id.tag_is_bre, bool);
        if (helper.getAdapterPosition() > 0) {
            if (this.f21799c) {
                View.OnClickListener onClickListener = this.f21798b;
                textView.setOnClickListener(onClickListener);
                textView3.setOnClickListener(onClickListener);
            } else {
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                textView.setBackgroundColor(mContext.getColor(R.color.color_E5E5E5));
                Context mContext2 = this.mContext;
                m.e(mContext2, "mContext");
                textView3.setBackgroundColor(mContext2.getColor(R.color.color_E5E5E5));
            }
        }
    }
}
