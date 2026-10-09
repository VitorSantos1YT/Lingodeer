package com.lingo.lingoskill.chineseskill.ui.pinyin.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import b7.e0;
import bq.z;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonIndexRecyclerAdapter;
import com.lingodeer.R;
import ij.l;
import java.util.ArrayList;
import qy.b0;
import s0.a;
import ui.m;
import xi.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PinyinLessonIndexRecyclerAdapter extends BaseQuickAdapter<c, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21745b;

    public PinyinLessonIndexRecyclerAdapter(ArrayList arrayList, m mVar) {
        super(R.layout.item_pinyin_lesson_index, arrayList);
        this.f21744a = mVar;
        if (l.f34436b == null) {
            synchronized (l.class) {
                if (l.f34436b == null) {
                    l.f34436b = new l();
                }
            }
        }
        this.f21745b = e0.d(l.f34436b, 0);
    }

    public static void a(PinyinLessonIndexRecyclerAdapter pinyinLessonIndexRecyclerAdapter, View it) {
        kotlin.jvm.internal.m.f(it, "it");
        Toast.makeText(pinyinLessonIndexRecyclerAdapter.mContext, R.string.please_complete_previous_lesson, 0).show();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, c cVar) {
        final c item = cVar;
        kotlin.jvm.internal.m.f(helper, "helper");
        kotlin.jvm.internal.m.f(item, "item");
        helper.setText(R.id.tv_lesson_name, item.f56096b);
        helper.setText(R.id.tv_lesson_description, item.f56097c);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_right_arrow);
        if (helper.getAdapterPosition() == 1) {
            helper.setVisible(R.id.iv_lock, false);
        } else {
            helper.setVisible(R.id.iv_lock, true);
        }
        int adapterPosition = helper.getAdapterPosition() - getHeaderLayoutCount();
        int i11 = this.f21745b;
        int i12 = R.drawable.ic_lock_unlock_auto_mirrored;
        if (adapterPosition <= i11) {
            View itemView = helper.itemView;
            kotlin.jvm.internal.m.e(itemView, "itemView");
            final int i13 = 0;
            z.b(itemView, new fz.c(this) { // from class: vi.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PinyinLessonIndexRecyclerAdapter f54067b;

                {
                    this.f54067b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                    }
                    return b0.f48488a;
                }
            });
            kotlin.jvm.internal.m.c(imageView);
            Context mContext = this.mContext;
            kotlin.jvm.internal.m.e(mContext, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext.getColor(R.color.colorAccent)));
            if (helper.getAdapterPosition() - getHeaderLayoutCount() < this.f21745b) {
                i12 = R.drawable.ic_lock_unlocked_auto_mirrored;
            }
            helper.setImageResource(R.id.iv_lock, i12);
        } else if (item.f56095a != -2 || i11 <= 1) {
            kotlin.jvm.internal.m.c(imageView);
            Context mContext2 = this.mContext;
            kotlin.jvm.internal.m.e(mContext2, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext2.getColor(R.color.color_E3E3E3)));
            View itemView2 = helper.itemView;
            kotlin.jvm.internal.m.e(itemView2, "itemView");
            z.b(itemView2, new a(this, 16));
            helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock_auto_mirrored);
        } else {
            View itemView3 = helper.itemView;
            kotlin.jvm.internal.m.e(itemView3, "itemView");
            final int i14 = 1;
            z.b(itemView3, new fz.c(this) { // from class: vi.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PinyinLessonIndexRecyclerAdapter f54067b;

                {
                    this.f54067b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f54067b.f21744a.y(item);
                            break;
                    }
                    return b0.f48488a;
                }
            });
            kotlin.jvm.internal.m.c(imageView);
            Context mContext3 = this.mContext;
            kotlin.jvm.internal.m.e(mContext3, "mContext");
            x.L(imageView, R.drawable.ic_sc_jianhao, ColorStateList.valueOf(mContext3.getColor(R.color.colorAccent)));
            helper.setImageResource(R.id.iv_lock, R.drawable.ic_lock_unlock_auto_mirrored);
        }
        if (item.f56095a != -3) {
            helper.setGone(R.id.card_sale, false);
            return;
        }
        helper.setGone(R.id.card_sale, true);
        View itemView4 = helper.itemView;
        kotlin.jvm.internal.m.e(itemView4, "itemView");
        final int i15 = 2;
        z.b(itemView4, new fz.c(this) { // from class: vi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinyinLessonIndexRecyclerAdapter f54067b;

            {
                this.f54067b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f54067b.f21744a.y(item);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f54067b.f21744a.y(item);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f54067b.f21744a.y(item);
                        break;
                }
                return b0.f48488a;
            }
        });
        if (FirebaseRemoteConfig.d().f("billing_ad_page_title").equals("Limited Time Offer")) {
            ((TextView) helper.getView(R.id.tv_title_1)).setText(this.mContext.getString(R.string.limited_time_offer));
        } else if (FirebaseRemoteConfig.d().f("billing_ad_page_title").length() > 0) {
            ((TextView) helper.getView(R.id.tv_title_1)).setText(FirebaseRemoteConfig.d().f("billing_ad_page_title"));
        }
        if (FirebaseRemoteConfig.d().f("billing_ad_page_subtitle").equals("SAVE 50% TODAY")) {
            ((TextView) helper.getView(R.id.tv_title_2)).setText(this.mContext.getString(R.string.get_50_off));
        } else if (FirebaseRemoteConfig.d().f("billing_ad_page_subtitle").length() > 0) {
            ((TextView) helper.getView(R.id.tv_title_2)).setText(FirebaseRemoteConfig.d().f("billing_ad_page_subtitle"));
        }
    }
}
