package com.lingo.lingoskill.koreanskill.ui.syllable.adapter;

import a9.i;
import aj.c;
import android.view.View;
import android.widget.ImageView;
import b7.e0;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import dn.b;
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
public final class SingleVowelAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f21911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f21912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleVowelAdapter(ArrayList arrayList, i mPlayer) {
        super(R.layout.item_pinyin_lesson_study_simple, arrayList);
        m.f(mPlayer, "mPlayer");
        this.f21911a = mPlayer;
    }

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
        helper.setText(R.id.tv_pinyin, strArr[0]);
        helper.setText(R.id.tv_explains, strArr[1]);
        helper.setGone(R.id.tv_explains, true);
        if (m.a(strArr[0], "ㅇ")) {
            return;
        }
        ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new c(this, strArr, imageView));
    }
}
