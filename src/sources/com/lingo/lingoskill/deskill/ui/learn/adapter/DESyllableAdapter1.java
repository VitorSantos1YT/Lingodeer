package com.lingo.lingoskill.deskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import hh.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DESyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {
    public final SpannableStringBuilder a(String str, String str2) {
        List listK;
        Collection collectionT;
        if (q.v0(str, "=", false)) {
            Matcher matcherW = p.w(0, "=", "compile(...)", str);
            if (matcherW.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iC = 0;
                do {
                    iC = p.c(matcherW, str, iC, arrayList);
                } while (matcherW.find());
                p.B(iC, str, arrayList);
                listK = arrayList;
            } else {
                listK = o.K(str.toString());
            }
            if (!listK.isEmpty()) {
                ListIterator listIterator = listK.listIterator(listK.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionT = r.f50854a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionT = e0.t(listIterator, 1, listK);
                        break;
                    }
                }
            } else {
                collectionT = r.f50854a;
                break;
            }
            String str3 = ((String[]) collectionT.toArray(new String[0]))[1];
            int length = str3.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = m.h(str3.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            str = c.g(str3, length, 1, i11);
        }
        if (m.a(str, "ei/ai") && m.a(str2, "Eis")) {
            str = "Ei";
        } else if (m.a(str, "ei/ai") && m.a(str2, "Mai")) {
            str = "ai";
        } else if (m.a(str, "eu/äu") && m.a(str2, "neu")) {
            str = "eu";
        } else if (m.a(str, "eu/äu") && m.a(str2, "Häuser")) {
            str = "äu";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        int[] iArr = bq.r.f4959a;
        String lowerCase = str.toLowerCase(bq.m.p());
        m.e(lowerCase, "toLowerCase(...)");
        if (q.v0(str2, lowerCase, false)) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(mContext.getColor(R.color.colorAccent));
            String lowerCase2 = str.toLowerCase(bq.m.p());
            m.e(lowerCase2, "toLowerCase(...)");
            int iI0 = q.I0(str2, lowerCase2, 0, false, 6);
            String lowerCase3 = str.toLowerCase(bq.m.p());
            m.e(lowerCase3, "toLowerCase(...)");
            spannableStringBuilder.setSpan(foregroundColorSpan, iI0, str.length() + q.I0(str2, lowerCase3, 0, false, 6), 33);
            String upperCase = str.toUpperCase(bq.m.p());
            m.e(upperCase, "toUpperCase(...)");
            if (q.v0(str2, upperCase, false)) {
                Context mContext2 = this.mContext;
                m.e(mContext2, "mContext");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(str2, p0.m(str, "toUpperCase(...)"), 0, false, 6), str.length() + q.I0(str2, p0.m(str, "toUpperCase(...)"), 0, false, 6), 33);
                return spannableStringBuilder;
            }
        } else {
            String upperCase2 = str.toUpperCase(bq.m.p());
            m.e(upperCase2, "toUpperCase(...)");
            if (q.v0(str2, upperCase2, false)) {
                Context mContext3 = this.mContext;
                m.e(mContext3, "mContext");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), q.I0(str2, p0.m(str, "toUpperCase(...)"), 0, false, 6), str.length() + q.I0(str2, p0.m(str, "toUpperCase(...)"), 0, false, 6), 33);
                String lowerCase4 = str.toLowerCase(bq.m.p());
                m.e(lowerCase4, "toLowerCase(...)");
                if (q.v0(str2, lowerCase4, false)) {
                    Context mContext4 = this.mContext;
                    m.e(mContext4, "mContext");
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(mContext4.getColor(R.color.colorAccent));
                    String lowerCase5 = str.toLowerCase(bq.m.p());
                    m.e(lowerCase5, "toLowerCase(...)");
                    int iI1 = q.I0(str2, lowerCase5, 0, false, 6);
                    String lowerCase6 = str.toLowerCase(bq.m.p());
                    m.e(lowerCase6, "toLowerCase(...)");
                    spannableStringBuilder.setSpan(foregroundColorSpan2, iI1, str.length() + q.I0(str2, lowerCase6, 0, false, 6), 33);
                    return spannableStringBuilder;
                }
            } else if (q.v0(str2, str, false)) {
                Context mContext5 = this.mContext;
                m.e(mContext5, "mContext");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext5.getColor(R.color.colorAccent)), q.I0(str2, str, 0, false, 6), str.length() + q.I0(str2, str, 0, false, 6), 33);
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listK;
        Collection collectionT;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        Pattern patternCompile = Pattern.compile("\t");
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
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr[2];
        helper.setText(R.id.tv_left, str2);
        helper.setText(R.id.tv_right, a(str2, str3));
        helper.setText(R.id.tv_right_2, a(str2, str4));
        helper.addOnClickListener(R.id.tv_right);
        helper.addOnClickListener(R.id.tv_right_2);
    }
}
