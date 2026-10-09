package com.lingo.lingoskill.ui.base.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.HorizontalLevel;
import com.lingodeer.R;
import ff.h;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProfileLevelTopAdapter extends BaseMultiItemQuickAdapter<HorizontalLevel, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        HorizontalLevel item = (HorizontalLevel) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        if (item.getItemType() == -1) {
            Locale locale = Locale.getDefault();
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            helper.setText(R.id.tv_level, String.format(locale, h.y(mContext, R.string.lv_s), Arrays.copyOf(new Object[]{0}, 1)));
            View view = helper.getView(R.id.pb_right);
            m.e(view, "getView(...)");
            ProgressBar progressBar = (ProgressBar) view;
            if ((item.getStartLevel() >= 0 || item.getEndLevel() < 0) && item.getEndLevel() < 0) {
                progressBar.setProgress(5);
            } else {
                progressBar.setProgress(0);
            }
            helper.setBackgroundRes(R.id.view_point, R.drawable.point_accent);
            helper.setGone(R.id.iv_level_lock, false);
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_level);
            helper.addOnClickListener(R.id.view_point);
        } else if (item.getItemType() == 1) {
            Locale locale2 = Locale.getDefault();
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            helper.setText(R.id.tv_level, String.format(locale2, h.y(mContext2, R.string.lv_s), Arrays.copyOf(new Object[]{100}, 1)));
            View view2 = helper.getView(R.id.pb_left);
            m.e(view2, "getView(...)");
            ProgressBar progressBar2 = (ProgressBar) view2;
            if (item.getStartLevel() < 0 && item.getEndLevel() >= 0) {
                int startLevel = item.getStartLevel();
                int endLevel = item.getEndLevel();
                if (startLevel <= endLevel) {
                    int i11 = -1;
                    while (true) {
                        i11++;
                        if (startLevel != 0) {
                            if (startLevel == endLevel) {
                                break;
                            } else {
                                startLevel++;
                            }
                        } else {
                            progressBar2.setProgress(i11);
                            break;
                        }
                    }
                }
            } else if (item.getEndLevel() < 0) {
                progressBar2.setProgress(5);
                helper.setBackgroundRes(R.id.view_point, R.drawable.point_accent);
                helper.setGone(R.id.iv_level_lock, false);
                c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_level);
            } else {
                progressBar2.setProgress(0);
                helper.setBackgroundRes(R.id.view_point, R.drawable.point_fofofo);
                helper.setGone(R.id.iv_level_lock, true);
                c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_level);
            }
        } else {
            Locale locale3 = Locale.getDefault();
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            helper.setText(R.id.tv_level, String.format(locale3, h.y(mContext3, R.string.lv_s), Arrays.copyOf(new Object[]{Integer.valueOf((item.getEndLevel() + item.getStartLevel()) / 2)}, 1)));
            View view3 = helper.getView(R.id.pb_left);
            m.e(view3, "getView(...)");
            ProgressBar progressBar3 = (ProgressBar) view3;
            View view4 = helper.getView(R.id.pb_right);
            m.e(view4, "getView(...)");
            ProgressBar progressBar4 = (ProgressBar) view4;
            if (item.getStartLevel() < 0 && item.getEndLevel() >= 0) {
                int startLevel2 = item.getStartLevel();
                int endLevel2 = item.getEndLevel();
                if (startLevel2 <= endLevel2) {
                    int i12 = -1;
                    while (true) {
                        int i13 = i12 + 1;
                        if (startLevel2 != 0) {
                            if (startLevel2 == endLevel2) {
                                break;
                            }
                            startLevel2++;
                            i12 = i13;
                        } else {
                            if (i13 >= 5) {
                                progressBar3.setProgress(5);
                                progressBar4.setProgress(i12 - 4);
                                helper.setBackgroundRes(R.id.view_point, R.drawable.point_accent);
                                helper.setGone(R.id.iv_level_lock, false);
                                c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_level);
                                break;
                            }
                            progressBar3.setProgress(i13);
                            helper.setBackgroundRes(R.id.view_point, R.drawable.point_fofofo);
                            helper.setGone(R.id.iv_level_lock, true);
                            c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_level);
                            break;
                        }
                    }
                }
            } else if (item.getEndLevel() < 0) {
                progressBar3.setProgress(5);
                progressBar4.setProgress(5);
                helper.setBackgroundRes(R.id.view_point, R.drawable.point_accent);
                helper.setGone(R.id.iv_level_lock, false);
                c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_level);
            } else {
                progressBar3.setProgress(0);
                progressBar4.setProgress(0);
                helper.setBackgroundRes(R.id.view_point, R.drawable.point_fofofo);
                helper.setGone(R.id.iv_level_lock, true);
                c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_level);
            }
            helper.addOnClickListener(R.id.view_point);
        }
        TextView textView = (TextView) helper.getView(R.id.tv_level);
        if (helper.getAdapterPosition() == 0) {
            textView.setTextSize(14.0f);
        } else {
            textView.setTextSize(12.0f);
        }
    }
}
