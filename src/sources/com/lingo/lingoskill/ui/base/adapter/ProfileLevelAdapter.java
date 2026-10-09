package com.lingo.lingoskill.ui.base.adapter;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.lingo.lingoskill.object.AchievementLevel;
import com.lingodeer.R;
import ff.h;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProfileLevelAdapter extends BaseQuickAdapter<AchievementLevel, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder baseViewHolder, AchievementLevel achievementLevel) {
        int i11;
        int iV;
        int i12;
        AchievementLevel item = achievementLevel;
        m.f(baseViewHolder, ualZoVVCQs.ABAXIVCPp);
        m.f(item, "item");
        Context mContext = this.mContext;
        m.e(mContext, "mContext");
        String strY = h.y(mContext, R.string.level_);
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault(...)");
        String upperCase = strY.toUpperCase(locale);
        m.e(upperCase, "toUpperCase(...)");
        baseViewHolder.setText(R.id.tv_level, upperCase + item.getLevel());
        Locale locale2 = Locale.getDefault();
        Context mContext2 = this.mContext;
        m.e(mContext2, "mContext");
        baseViewHolder.setText(R.id.tv_xp, String.format(locale2, h.y(mContext2, R.string._s_xp), Arrays.copyOf(new Object[]{Integer.valueOf(item.getXp())}, 1)));
        baseViewHolder.setText(R.id.tv_medal_level, String.valueOf(item.getLevel()));
        int i13 = -1;
        int i14 = 0;
        while (true) {
            if (i14 >= 10) {
                i11 = 10;
                break;
            } else {
                if (item.getLevel() > i13 && item.getLevel() <= (i11 = (i14 + 1) * 10)) {
                    break;
                }
                i14++;
                i13 = i14 * 10;
            }
        }
        if (item.getLevel() <= 0) {
            View view = baseViewHolder.itemView;
            if (i11 <= 10) {
                i12 = R.drawable.bg_level_10;
            } else if (i11 <= 20) {
                i12 = R.drawable.bg_level_20;
            } else if (i11 <= 30) {
                i12 = R.drawable.bg_level_30;
            } else if (i11 <= 40) {
                i12 = R.drawable.bg_level_40;
            } else if (i11 <= 50) {
                i12 = R.drawable.bg_level_50;
            } else if (i11 <= 60) {
                i12 = R.drawable.bg_level_60;
            } else if (i11 <= 70) {
                i12 = R.drawable.bg_level_70;
            } else if (i11 <= 80) {
                i12 = R.drawable.bg_level_80;
            } else {
                i12 = i11 <= 90 ? R.drawable.bg_level_90 : R.drawable.bg_level_100;
            }
            view.setBackgroundResource(i12);
            c.v(this.mContext, "mContext", R.color.always_white, baseViewHolder, R.id.tv_level);
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            baseViewHolder.setTextColor(R.id.tv_xp, mContext3.getColor(R.color.colorAccent));
            iV = h.v("ic_medal_lv_" + i11 + "_active");
        } else {
            baseViewHolder.itemView.setBackgroundResource(R.drawable.bg_item_profile_level_grey);
            c.v(this.mContext, "mContext", R.color.color_D6D6D6, baseViewHolder, R.id.tv_level);
            Context mContext4 = this.mContext;
            m.e(mContext4, "mContext");
            baseViewHolder.setTextColor(R.id.tv_xp, mContext4.getColor(R.color.color_C4C4C8));
            iV = h.v("ic_medal_lv_" + i11 + "_grey");
        }
        baseViewHolder.setImageResource(R.id.iv_medal_level, iV);
    }
}
