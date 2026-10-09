package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

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
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FiftySoundTipAdapter4 extends BaseQuickAdapter<String, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listK;
        Collection collectionT;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        Pattern patternCompile = Pattern.compile("#");
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
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = r.f50854a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = r.f50854a;
            break;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        helper.setText(R.id.tv_1, strArr[0]);
        helper.setText(R.id.tv_2, strArr[1]);
        helper.setText(R.id.tv_3, strArr[2]);
        if (helper.getAdapterPosition() != 0) {
            helper.addOnClickListener(R.id.tv_2);
            helper.addOnClickListener(R.id.tv_3);
            if (m.a(strArr[1], strArr[2])) {
                return;
            }
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_2);
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_3);
        }
    }
}
