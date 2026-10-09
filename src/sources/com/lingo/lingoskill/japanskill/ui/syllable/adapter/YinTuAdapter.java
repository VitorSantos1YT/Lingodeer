package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import cf.x;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingodeer.R;
import ep.a;
import fv.b;
import kotlin.jvm.internal.m;
import qy.q;
import um.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class YinTuAdapter<T extends BaseYintuIntel> extends BaseMultiItemQuickAdapter<T, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21907b;

    public final void a(int i11, RecyclerView recyclerView) {
        int i12 = this.f21906a;
        if (i12 != -1) {
            g2 g2VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i12);
            m.c(g2VarFindViewHolderForAdapterPosition);
            View itemView = g2VarFindViewHolderForAdapterPosition.itemView;
            m.e(itemView, "itemView");
            TextView textView = (TextView) itemView.findViewById(R.id.tv_top);
            a.z(this.mContext, "mContext", R.color.primary_black, textView);
            itemView.setBackgroundResource(R.color.white);
            c.a(textView);
            textView.setTypeface(textView.getTypeface(), 0);
            textView.setTextSize(20.0f);
        }
        this.f21906a = i11;
        g2 g2VarFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i11);
        m.c(g2VarFindViewHolderForAdapterPosition2);
        View itemView2 = g2VarFindViewHolderForAdapterPosition2.itemView;
        m.e(itemView2, "itemView");
        TextView textView2 = (TextView) itemView2.findViewById(R.id.tv_top);
        a.z(this.mContext, "mContext", R.color.color_FF6666, textView2);
        itemView2.setBackgroundResource(R.drawable.new_color_accent_rect_empty_line_no_coener);
        c.a(textView2);
        textView2.setTypeface(textView2.getTypeface(), 1);
        textView2.setTextSize(22.0f);
    }

    public final void b(int i11, RecyclerView recyclerView) {
        int i12 = this.f21907b;
        if (i12 != -1) {
            g2 g2VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i12);
            m.c(g2VarFindViewHolderForAdapterPosition);
            View itemView = g2VarFindViewHolderForAdapterPosition.itemView;
            m.e(itemView, "itemView");
            ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_ctr);
            m.c(imageView);
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            x.L(imageView, R.drawable.ic_ctr_play, ColorStateList.valueOf(mContext.getColor(R.color.colorAccent)));
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            itemView.setBackgroundColor(mContext2.getColor(R.color.white));
        }
        this.f21907b = i11;
        if (i11 != -1) {
            g2 g2VarFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i11);
            m.c(g2VarFindViewHolderForAdapterPosition2);
            View itemView2 = g2VarFindViewHolderForAdapterPosition2.itemView;
            m.e(itemView2, "itemView");
            ImageView imageView2 = (ImageView) itemView2.findViewById(R.id.iv_ctr);
            m.c(imageView2);
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            x.L(imageView2, R.drawable.ic_ctrl_pause, ColorStateList.valueOf(mContext3.getColor(R.color.white)));
            Context mContext4 = this.mContext;
            m.e(mContext4, "mContext");
            itemView2.setBackgroundColor(mContext4.getColor(R.color.colorAccent));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        BaseYintuIntel item = (BaseYintuIntel) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        if (item.getItemType() != 0) {
            if (item.getId() != -1) {
                helper.itemView.setVisibility(4);
                return;
            }
            helper.itemView.setVisibility(0);
            if (helper.getAdapterPosition() == this.f21907b) {
                ImageView imageView = (ImageView) helper.itemView.findViewById(R.id.iv_ctr);
                m.c(imageView);
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                x.L(imageView, R.drawable.ic_ctrl_pause, ColorStateList.valueOf(mContext.getColor(R.color.white)));
                View view = helper.itemView;
                Context mContext2 = this.mContext;
                m.e(mContext2, "mContext");
                view.setBackgroundColor(mContext2.getColor(R.color.colorAccent));
                return;
            }
            ImageView imageView2 = (ImageView) helper.itemView.findViewById(R.id.iv_ctr);
            m.c(imageView2);
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            x.L(imageView2, R.drawable.ic_ctr_play, ColorStateList.valueOf(mContext3.getColor(R.color.colorAccent)));
            View view2 = helper.itemView;
            Context mContext4 = this.mContext;
            m.e(mContext4, "mContext");
            view2.setBackgroundColor(mContext4.getColor(R.color.white));
            return;
        }
        q qVar = b.f28186a;
        String luoMa = item.getLuoMa();
        m.e(luoMa, "getLuoMa(...)");
        String strC = b.c(luoMa, null, null);
        TextView textView = (TextView) helper.getView(R.id.tv_top);
        TextView textView2 = (TextView) helper.getView(R.id.tv_bottom);
        m.c(textView);
        c.a(textView);
        m.c(textView2);
        c.a(textView2);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().isPing) {
            helper.setText(R.id.tv_top, item.getPing());
            helper.setText(R.id.tv_bottom, item.getPian() + "  " + item.getLuoMa());
        } else {
            helper.setText(R.id.tv_top, item.getPian());
            helper.setText(R.id.tv_bottom, item.getPing() + "  " + item.getLuoMa());
        }
        if (helper.getAdapterPosition() == this.f21906a) {
            w4.c.v(this.mContext, "mContext", R.color.color_FF6666, helper, R.id.tv_top);
            textView.setTypeface(textView.getTypeface(), 1);
            helper.itemView.setBackgroundResource(R.drawable.new_color_accent_rect_empty_line_no_coener);
            textView.setTextSize(22.0f);
        } else {
            w4.c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_top);
            helper.itemView.setBackgroundResource(R.color.white);
            textView.setTypeface(textView.getTypeface(), 0);
            textView.setTextSize(20.0f);
        }
        helper.itemView.setTag(strC);
    }
}
