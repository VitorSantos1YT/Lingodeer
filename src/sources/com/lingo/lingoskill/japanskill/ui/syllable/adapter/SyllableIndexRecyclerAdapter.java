package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import b7.e0;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.object.Lesson;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import ff.h;
import i0.pKy.shrCcjmOhAmRC;
import ij.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SyllableIndexRecyclerAdapter extends BaseQuickAdapter<Lesson, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Env f21904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyllableIndexRecyclerAdapter(ArrayList arrayList, Env env) {
        super(R.layout.item_pinyin_lesson_index, arrayList);
        m.f(env, aYZzTH.SyDiIJmpNlL);
        this.f21904a = env;
        if (l.f34436b == null) {
            synchronized (l.class) {
                if (l.f34436b == null) {
                    l.f34436b = new l();
                }
            }
        }
        this.f21905b = e0.d(l.f34436b, 1);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Lesson lesson) {
        Lesson item = lesson;
        m.f(helper, "helper");
        m.f(item, "item");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_right_arrow);
        if (helper.getAdapterPosition() == 1) {
            helper.setVisible(R.id.iv_lock, false);
        } else {
            helper.setVisible(R.id.iv_lock, true);
        }
        if (item.getSortIndex() <= this.f21905b) {
            helper.setImageResource(R.id.iv_lock, item.getSortIndex() < this.f21905b ? R.drawable.ic_lock_unlocked : R.drawable.ic_lock_unlock);
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
        if (item.getSortIndex() == -1 || item.getSortIndex() == -2) {
            helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock_unlock);
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext3.getColor(R.color.colorAccent)));
            helper.itemView.setClickable(true);
        }
        if (item.getSortIndex() == -3) {
            helper.setGone(R.id.card_sale, true);
            if (FirebaseRemoteConfig.d().f("billing_ad_page_title").equals("Limited Time Offer")) {
                ((TextView) helper.getView(R.id.tv_title_1)).setText(this.mContext.getString(R.string.limited_time_offer));
            } else if (FirebaseRemoteConfig.d().f("billing_ad_page_title").length() > 0) {
                ((TextView) helper.getView(R.id.tv_title_1)).setText(FirebaseRemoteConfig.d().f("billing_ad_page_title"));
            }
            if (FirebaseRemoteConfig.d().f("billing_ad_page_subtitle").equals(shrCcjmOhAmRC.RKL)) {
                ((TextView) helper.getView(R.id.tv_title_2)).setText(this.mContext.getString(R.string.get_50_off));
            } else if (FirebaseRemoteConfig.d().f("billing_ad_page_subtitle").length() > 0) {
                ((TextView) helper.getView(R.id.tv_title_2)).setText(FirebaseRemoteConfig.d().f("billing_ad_page_subtitle"));
            }
        } else {
            helper.setGone(R.id.card_sale, false);
        }
        if (this.f21904a.isPing) {
            String description = item.getDescription();
            m.e(description, "getDescription(...)");
            Pattern patternCompile = Pattern.compile(";");
            m.e(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(description).replaceAll("\n");
            m.e(strReplaceAll, "replaceAll(...)");
            helper.setText(R.id.tv_lesson_description, strReplaceAll);
            if (item.getSortIndex() == -1 || item.getSortIndex() == -2) {
                helper.setText(R.id.tv_lesson_name, item.getLessonName());
            } else {
                Locale locale = Locale.getDefault();
                Context mContext4 = this.mContext;
                m.e(mContext4, "mContext");
                helper.setText(R.id.tv_lesson_name, String.format(locale, h.y(mContext4, R.string.lesson_s), Arrays.copyOf(new Object[]{Integer.valueOf(item.getSortIndex())}, 1)));
            }
        } else {
            String wordList = item.getWordList();
            m.e(wordList, "getWordList(...)");
            Pattern patternCompile2 = Pattern.compile(";");
            m.e(patternCompile2, "compile(...)");
            String strReplaceAll2 = patternCompile2.matcher(wordList).replaceAll("\n");
            m.e(strReplaceAll2, "replaceAll(...)");
            helper.setText(R.id.tv_lesson_description, strReplaceAll2);
            if (item.getSortIndex() == -1 || item.getSortIndex() == -2) {
                helper.setText(R.id.tv_lesson_name, item.getLessonName());
            } else {
                Locale locale2 = Locale.getDefault();
                Context mContext5 = this.mContext;
                m.e(mContext5, "mContext");
                helper.setText(R.id.tv_lesson_name, String.format(locale2, h.y(mContext5, R.string.lesson_s), Arrays.copyOf(new Object[]{Integer.valueOf(item.getSortIndex())}, 1)));
            }
        }
        item.getSortIndex();
        item.getWordList();
    }
}
