package com.lingo.lingoskill.franchskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FRSyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21880a;

    public FRSyllableAdapter1(int i11, List list, List list2) {
        super(i11, list);
        this.f21880a = list2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0176  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listK;
        List listT;
        List listK2;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        Pattern patternCompile = Pattern.compile(MzwEyWCkjXL.IGPorLyudD);
        m.e(patternCompile, "compile(...)");
        q.U0(0);
        Matcher matcher = patternCompile.matcher(item);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, item, iC, arrayList);
            } while (matcher.find());
            p.B(iC, item, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(item.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = listT2;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT2;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        String str2 = strArr[0];
        String input = strArr[1];
        helper.setText(R.id.tv_left, str2);
        Pattern patternCompile2 = Pattern.compile(",");
        m.e(patternCompile2, "compile(...)");
        m.f(input, "input");
        q.U0(0);
        Matcher matcher2 = patternCompile2.matcher(input);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcher2, input, iC2, arrayList2);
            } while (matcher2.find());
            p.B(iC2, input, arrayList2);
            listK2 = arrayList2;
        } else {
            listK2 = o.K(input.toString());
        }
        if (!listK2.isEmpty()) {
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        }
        String[] strArr2 = (String[]) listT2.toArray(new String[0]);
        helper.setGone(R.id.tv_right_btm, strArr2.length > 1);
        int length = strArr2.length;
        List list = this.f21880a;
        if (length > 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strArr2[0]);
            if (list != null && !list.isEmpty()) {
                List listW0 = q.W0((String) list.get(helper.getAdapterPosition()), new String[]{"\n"}, 0, 6);
                if (q.v0(strArr2[0], (CharSequence) listW0.get(0), false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(strArr2[0], (String) listW0.get(0), 0, false, 6), ((String) listW0.get(0)).length() + q.I0(strArr2[0], (String) listW0.get(0), 0, false, 6), 33);
                }
            }
            helper.setText(R.id.tv_right_top, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strArr2[r10]);
            if (list != null && !list.isEmpty()) {
                List listW1 = q.W0((String) list.get(helper.getAdapterPosition()), new String[]{"\n"}, 0, 6);
                if (q.v0(strArr2[r10], (CharSequence) listW1.get(1), false)) {
                    Context mContext2 = this.mContext;
                    m.e(mContext2, "mContext");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(strArr2[1], (String) listW1.get(1), 0, false, 6), ((String) listW1.get(1)).length() + q.I0(strArr2[1], (String) listW1.get(1), 0, false, 6), 33);
                }
            }
            helper.setText(R.id.tv_right_btm, spannableStringBuilder2);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(input);
            if (list != null && !list.isEmpty()) {
                String str3 = list.size() == 1 ? (String) list.get(0) : (String) list.get(helper.getAdapterPosition());
                if (q.v0(input, str3, false)) {
                    Context mContext3 = this.mContext;
                    m.e(mContext3, "mContext");
                    spannableStringBuilder3.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), q.I0(input, str3, 0, false, 6), str3.length() + q.I0(input, str3, 0, false, 6), 33);
                }
            }
            helper.setText(R.id.tv_right_top, spannableStringBuilder3);
        }
        helper.addOnClickListener(R.id.tv_right_top);
        helper.addOnClickListener(R.id.tv_right_btm);
    }
}
