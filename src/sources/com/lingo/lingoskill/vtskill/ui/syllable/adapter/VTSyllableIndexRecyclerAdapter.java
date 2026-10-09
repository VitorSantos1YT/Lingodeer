package com.lingo.lingoskill.vtskill.ui.syllable.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import b7.e0;
import bq.z;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIndexRecyclerAdapter;
import com.lingodeer.R;
import fz.c;
import ij.l;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import kp.j;
import pq.b;
import qy.b0;
import sq.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class VTSyllableIndexRecyclerAdapter extends BaseQuickAdapter<b, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22072b;

    public VTSyllableIndexRecyclerAdapter(ArrayList arrayList, g gVar) {
        super(R.layout.item_pinyin_lesson_index, arrayList);
        this.f22071a = gVar;
        if (l.f34436b == null) {
            synchronized (l.class) {
                if (l.f34436b == null) {
                    l.f34436b = new l();
                }
            }
        }
        this.f22072b = e0.d(l.f34436b, 7);
    }

    public static void a(VTSyllableIndexRecyclerAdapter vTSyllableIndexRecyclerAdapter, View it) {
        m.f(it, "it");
        Toast.makeText(vTSyllableIndexRecyclerAdapter.mContext, R.string.please_complete_previous_lesson, 0).show();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, b bVar) {
        final b item = bVar;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_lesson_name, item.f46987b);
        helper.setText(R.id.tv_lesson_description, item.f46988c);
        View view = helper.getView(R.id.iv_right_arrow);
        m.e(view, "getView(...)");
        ImageView imageView = (ImageView) view;
        if (helper.getAdapterPosition() == 1) {
            helper.setVisible(R.id.iv_lock, false);
        } else {
            helper.setVisible(R.id.iv_lock, true);
        }
        int adapterPosition = helper.getAdapterPosition() - getHeaderLayoutCount();
        int i11 = this.f22072b;
        int i12 = R.drawable.ic_lock_unlock;
        if (adapterPosition <= i11) {
            View itemView = helper.itemView;
            m.e(itemView, "itemView");
            final int i13 = 0;
            z.b(itemView, new c(this) { // from class: mq.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VTSyllableIndexRecyclerAdapter f41176b;

                {
                    this.f41176b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            m.f(it, "it");
                            this.f41176b.f22071a.x(item);
                            break;
                        default:
                            m.f(it, "it");
                            this.f41176b.f22071a.x(item);
                            break;
                    }
                    return b0.f48488a;
                }
            });
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext.getColor(R.color.colorAccent)));
            if (helper.getAdapterPosition() - getHeaderLayoutCount() < this.f22072b) {
                i12 = R.drawable.ic_lock_unlocked;
            }
            helper.setImageResource(R.id.iv_lock, i12);
            return;
        }
        if (item.f46986a != -2 || i11 <= 1) {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext2.getColor(R.color.color_E3E3E3)));
            View itemView2 = helper.itemView;
            m.e(itemView2, "itemView");
            z.b(itemView2, new j(this, 15));
            helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock);
            return;
        }
        View itemView3 = helper.itemView;
        m.e(itemView3, "itemView");
        final int i14 = 1;
        z.b(itemView3, new c(this) { // from class: mq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VTSyllableIndexRecyclerAdapter f41176b;

            {
                this.f41176b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        m.f(it, "it");
                        this.f41176b.f22071a.x(item);
                        break;
                    default:
                        m.f(it, "it");
                        this.f41176b.f22071a.x(item);
                        break;
                }
                return b0.f48488a;
            }
        });
        Context mContext3 = this.mContext;
        m.e(mContext3, "mContext");
        x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext3.getColor(R.color.colorAccent)));
        helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock_unlock);
    }
}
