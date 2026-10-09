package com.lingo.lingoskill.ar.ui.syllable.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import b7.e0;
import bi.a;
import cf.x;
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
public final class ARSyllableIndexAdapter extends BaseQuickAdapter<a, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21673a;

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, a aVar) {
        List listK;
        Collection collectionT;
        a item = aVar;
        m.f(helper, "helper");
        m.f(item, "item");
        String str = item.f4451b;
        m.e(str, "getLessonName(...)");
        Pattern patternCompile = Pattern.compile("\n");
        m.e(patternCompile, "compile(...)");
        q.U0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
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
        if (strArr.length >= 2) {
            helper.setText(R.id.tv_lesson_name, strArr[0]);
            helper.setText(R.id.tv_lesson_name_sub, strArr[1]);
            helper.getView(R.id.tv_lesson_name_sub).setVisibility(0);
            helper.getView(R.id.tv_lesson_description).setVisibility(0);
        } else {
            helper.setText(R.id.tv_lesson_name, item.f4451b);
            helper.getView(R.id.tv_lesson_name_sub).setVisibility(8);
            helper.getView(R.id.tv_lesson_description).setVisibility(8);
        }
        helper.setText(R.id.tv_lesson_description, item.f4452c);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_right_arrow);
        if (helper.getAdapterPosition() == 1) {
            helper.setVisible(R.id.iv_lock, false);
        } else {
            helper.setVisible(R.id.iv_lock, true);
        }
        int i11 = item.f4450a;
        int i12 = this.f21673a;
        if (i11 <= i12 || i11 == 2000) {
            helper.setImageResource(R.id.iv_lock, i11 < i12 ? R.drawable.ic_lock_unlocked : R.drawable.ic_lock_unlock);
            m.c(imageView);
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext.getColor(R.color.colorAccent)));
            helper.itemView.setClickable(true);
        } else {
            helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock);
            m.c(imageView);
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext2.getColor(R.color.color_E3E3E3)));
            helper.itemView.setClickable(true);
        }
        helper.setGone(R.id.card_sale, false);
    }
}
