package com.lingo.lingoskill.ui.base.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bq.m;
import bq.r;
import cf.x;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.fluent.widget.DonutProgress;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.widget.BaseUnitBgDashLine;
import com.lingodeer.R;
import cp.a;
import ff.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oz.q;
import ry.l;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseLearnAdapter2 extends BaseMultiItemQuickAdapter<Unit, BaseViewHolder> {
    public final void a(BaseViewHolder baseViewHolder, Unit unit) {
        DonutProgress donutProgress;
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_open_tag);
        BaseUnitBgDashLine baseUnitBgDashLine = (BaseUnitBgDashLine) baseViewHolder.getView(R.id.unit_dash_line);
        BaseUnitBgDashLine baseUnitBgDashLine2 = (BaseUnitBgDashLine) baseViewHolder.getView(R.id.unit_dash_line_cover);
        BaseUnitBgDashLine baseUnitBgDashLine3 = (BaseUnitBgDashLine) baseViewHolder.getView(R.id.iv_line_vertical_top);
        BaseUnitBgDashLine baseUnitBgDashLine4 = (BaseUnitBgDashLine) baseViewHolder.getView(R.id.iv_line_vertical_bottom);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_icon_solid);
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R.id.const_unit_icon);
        ImageView imageView3 = (ImageView) baseViewHolder.getView(R.id.iv_icon);
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_unit_name);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_unit_progress);
        DonutProgress donutProgress2 = (DonutProgress) baseViewHolder.getView(R.id.pb_unit);
        boolean z11 = (this.mContext.getResources().getConfiguration().uiMode & 48) == 16;
        if (z11) {
            baseUnitBgDashLine.setAlpha(1.0f);
            constraintLayout.setAlpha(1.0f);
            baseUnitBgDashLine3.setAlpha(1.0f);
            baseUnitBgDashLine4.setAlpha(1.0f);
        } else {
            baseUnitBgDashLine.setAlpha(0.2f);
            constraintLayout.setAlpha(0.8f);
            baseUnitBgDashLine3.setAlpha(0.2f);
            baseUnitBgDashLine4.setAlpha(0.2f);
        }
        baseUnitBgDashLine.setVisibility(0);
        baseUnitBgDashLine2.setVisibility(4);
        if (unit.getType() == 1) {
            LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.ll_alphabet);
            ImageView imageView4 = (ImageView) baseViewHolder.getView(R.id.iv_alphabet);
            boolean z12 = z11;
            Space space = (Space) baseViewHolder.getView(R.id.top_space);
            if (z12) {
                linearLayout.setAlpha(1.0f);
            } else {
                linearLayout.setAlpha(0.8f);
            }
            linearLayout.setVisibility(8);
            space.setVisibility(8);
            donutProgress = donutProgress2;
            baseViewHolder.setGone(R.id.ll_alphabet, false);
            if (baseViewHolder.getAdapterPosition() == 0) {
                space.setVisibility(0);
                baseUnitBgDashLine.setVisibility(8);
                baseUnitBgDashLine2.setVisibility(8);
            }
            if (baseViewHolder.getAdapterPosition() == 0) {
                int[] iArr = r.f4959a;
                if (m.m()) {
                    try {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        imageView4.setImageResource(h.v("new_alphabet_".concat(m.t(x.n().keyLanguage))));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    linearLayout.setVisibility(0);
                    linearLayout.setOnClickListener(new a(this, linearLayout, baseViewHolder, 2));
                }
            }
        } else {
            constraintLayout = constraintLayout;
            donutProgress = donutProgress2;
        }
        baseUnitBgDashLine3.setVisibility(8);
        baseUnitBgDashLine4.setVisibility(8);
        if (baseViewHolder.getAdapterPosition() > 0) {
            if (l.D(new Integer[]{2}, Integer.valueOf(((Unit) getData().get(baseViewHolder.getAdapterPosition() - 1)).getType()))) {
                baseUnitBgDashLine3.setVisibility(0);
                baseUnitBgDashLine.setVisibility(8);
                baseUnitBgDashLine2.setVisibility(8);
            }
            if (baseViewHolder.getAdapterPosition() + 1 < getData().size()) {
                if (l.D(new Integer[]{2}, Integer.valueOf(((Unit) getData().get(baseViewHolder.getAdapterPosition() + 1)).getType()))) {
                    baseUnitBgDashLine4.setVisibility(0);
                }
            }
        }
        textView.setText(unit.getUnitName());
        String iconResSuffix = unit.getIconResSuffix();
        int iV = R.drawable.uicon_1;
        if (iconResSuffix != null) {
            try {
                String iconResSuffix2 = unit.getIconResSuffix();
                kotlin.jvm.internal.m.e(iconResSuffix2, "getIconResSuffix(...)");
                iV = h.v((String) q.W0(iconResSuffix2, new String[]{";"}, 0, 6).get(0));
            } catch (Exception unused) {
            }
        }
        imageView3.setImageResource(iV);
        Context mContext = this.mContext;
        kotlin.jvm.internal.m.e(mContext, "mContext");
        baseUnitBgDashLine.setColor(mContext.getColor(R.color.color_D9D9D9));
        Context mContext2 = this.mContext;
        kotlin.jvm.internal.m.e(mContext2, "mContext");
        baseUnitBgDashLine3.setColor(mContext2.getColor(R.color.color_D9D9D9));
        Context mContext3 = this.mContext;
        kotlin.jvm.internal.m.e(mContext3, "mContext");
        baseUnitBgDashLine4.setColor(mContext3.getColor(R.color.color_D9D9D9));
        Context mContext4 = this.mContext;
        kotlin.jvm.internal.m.e(mContext4, "mContext");
        imageView3.setColorFilter(mContext4.getColor(R.color.color_B2B2B2));
        Context mContext5 = this.mContext;
        kotlin.jvm.internal.m.e(mContext5, "mContext");
        imageView2.setColorFilter(mContext5.getColor(R.color.color_D9D9D9));
        textView.setAlpha(0.7f);
        textView2.setAlpha(0.7f);
        donutProgress.setVisibility(8);
        if (!unit.isActive()) {
            baseViewHolder.setText(R.id.tv_unit_progress, unit.getProgress());
            ConstraintLayout constraintLayout2 = constraintLayout;
            constraintLayout2.setOnClickListener(new a(this, unit, constraintLayout2, baseViewHolder, 3));
            if (unit.isCurOpen()) {
                imageView.setVisibility(0);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        baseUnitBgDashLine3.setColor(Color.parseColor(unit.getDashLineColor()));
        baseUnitBgDashLine4.setColor(Color.parseColor(unit.getDashLineColor()));
        textView.setAlpha(1.0f);
        textView2.setAlpha(1.0f);
        String progress = unit.getProgress();
        kotlin.jvm.internal.m.e(progress, "getProgress(...)");
        List listW0 = q.W0(progress, new String[]{"/"}, 0, 6);
        ArrayList arrayList = new ArrayList(n.W(listW0, 10));
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(q.i1((String) it.next()).toString())));
        }
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        String strG;
        Unit item = (Unit) obj;
        kotlin.jvm.internal.m.f(helper, "helper");
        kotlin.jvm.internal.m.f(item, "item");
        int type = item.getType();
        if (type == 0) {
            a(helper, item);
            return;
        }
        if (type == 1) {
            a(helper, item);
            return;
        }
        if (type == 2) {
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(R.id.const_test_out);
            ImageView imageView = (ImageView) helper.getView(R.id.iv_testout_key);
            if ((this.mContext.getResources().getConfiguration().uiMode & 48) == 16) {
                constraintLayout.setAlpha(1.0f);
            } else {
                constraintLayout.setAlpha(0.8f);
            }
            Drawable background = constraintLayout.getBackground();
            Context mContext = this.mContext;
            kotlin.jvm.internal.m.e(mContext, "mContext");
            background.setTint(mContext.getColor(R.color.color_B2B2B2));
            imageView.setImageResource(R.drawable.new_testout_key_grey);
            if (item.isActive()) {
                imageView.setImageResource(R.drawable.new_testout_key_active);
                constraintLayout.getBackground().setTint(Color.parseColor(item.getIconColor()));
            }
            constraintLayout.setOnClickListener(new a(this, item, constraintLayout, helper, 0));
            return;
        }
        if (type == 3) {
            ImageView imageView2 = (ImageView) helper.getView(R.id.iv_go_levelup);
            imageView2.setOnClickListener(new a(this, imageView2, helper, 1));
            return;
        }
        if (type != 4) {
            return;
        }
        if (item.isActive()) {
            helper.setTextColor(R.id.tv_finish, Color.parseColor("#FF880E"));
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            strG = ep.a.g("ic_medal_", m.t(x.n().keyLanguage), "_active");
        } else {
            helper.setTextColor(R.id.tv_finish, Color.parseColor("#969696"));
            int[] iArr2 = r.f4959a;
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            strG = ep.a.g("ic_medal_", m.t(x.n().keyLanguage), "_grey");
        }
        try {
            helper.setImageResource(R.id.iv_lan_pic, h.v(strG));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
