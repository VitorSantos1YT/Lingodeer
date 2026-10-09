package com.lingo.lingoskill.esusskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
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
public final class ESUSSyllableAdapter2 extends BaseQuickAdapter<String, BaseViewHolder> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listK;
        List listT;
        List listK2;
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
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = r.f50854a;
        if (zIsEmpty) {
            listT = listT2;
            break;
        }
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
        String[] strArr = (String[]) listT.toArray(new String[0]);
        String strG = strArr[0];
        String str2 = strArr[1];
        helper.setText(R.id.tv_left, strG);
        if (q.v0(strG, "=", false)) {
            Matcher matcherW = p.w(0, "=", "compile(...)", strG);
            if (matcherW.find()) {
                ArrayList arrayList2 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = p.c(matcherW, strG, iC2, arrayList2);
                } while (matcherW.find());
                p.B(iC2, strG, arrayList2);
                listK2 = arrayList2;
            } else {
                listK2 = o.K(strG.toString());
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
            String str3 = ((String[]) listT2.toArray(new String[0]))[1];
            int length = str3.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = m.h(str3.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            strG = c.g(str3, length, 1, i11);
        }
        switch (str2.hashCode()) {
            case -288026409:
                if (str2.equals("estudiáis")) {
                    strG = "iái";
                }
                break;
            case -152486979:
                if (str2.equals("cambiéis")) {
                    strG = "iéi";
                }
                break;
            case 103506:
                if (str2.equals("hoy")) {
                    strG = "oy";
                }
                break;
            case 108497:
                if (str2.equals("muy")) {
                    strG = "uy";
                }
                break;
            case 722104727:
                if (str2.equals("averigüéis")) {
                    strG = "üéi";
                }
                break;
            case 1503360766:
                if (str2.equals("Uruguay")) {
                    strG = "uay";
                }
                break;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        int length2 = spannableStringBuilder.length();
        for (int i12 = 0; i12 < length2; i12++) {
            String strValueOf = String.valueOf(spannableStringBuilder.charAt(i12));
            Locale locale = Locale.getDefault();
            m.e(locale, "getDefault(...)");
            String lowerCase = strG.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            if (m.a(strValueOf, lowerCase)) {
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), i12, i12 + 1, 33);
            }
        }
        Locale locale2 = Locale.getDefault();
        m.e(locale2, "getDefault(...)");
        String lowerCase2 = strG.toLowerCase(locale2);
        m.e(lowerCase2, "toLowerCase(...)");
        if (q.v0(str2, lowerCase2, false)) {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(str2, p0.n("getDefault(...)", strG, "toLowerCase(...)"), 0, false, 6), strG.length() + q.I0(str2, p0.n("getDefault(...)", strG, "toLowerCase(...)"), 0, false, 6), 33);
        }
        helper.setText(R.id.tv_right, spannableStringBuilder);
        helper.addOnClickListener(R.id.tv_right);
    }
}
