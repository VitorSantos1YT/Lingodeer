package com.lingo.lingoskill.franchskill.ui.learn.adapter;

import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
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

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FRSyllableAdapter4 extends BaseQuickAdapter<String, BaseViewHolder> {
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
        helper.setText(R.id.tv_left, strArr[1]);
        helper.setText(R.id.tv_right, str2);
        helper.addOnClickListener(R.id.tv_right);
    }
}
