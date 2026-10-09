package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.b1;
import androidx.viewpager2.widget.ViewPager2;
import ay.x;
import bp.g;
import bq.z;
import com.lingo.fluent.widget.MultipleTransformer;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.AckFav;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import f10.k;
import fr.j3;
import fz.c;
import hj.f;
import ij.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import ji.b;
import kotlin.jvm.internal.m;
import ky.e;
import o20.w;
import org.greenrobot.eventbus.ThreadMode;
import oz.q;
import ry.r;
import s0.u;
import t7.d;
import th.j;
import ub.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AckCardActivity extends b {
    public static final /* synthetic */ int U = 0;
    public final ArrayList P;
    public List Q;
    public List R;
    public int S;
    public final ArrayList T;

    public AckCardActivity() {
        super("ReviewKnowledgeCard", tp.b.f52442a);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.T = new ArrayList();
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(np.b refreshEvent) {
        m.f(refreshEvent, "refreshEvent");
        if (refreshEvent.f43921a == 16) {
            u();
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        ArrayList arrayList = this.T;
        arrayList.clear();
        RandomAccess integerArrayListExtra = getIntent().getIntegerArrayListExtra(INTENTS.EXTRA_ARRAY_LIST);
        if (integerArrayListExtra == null) {
            integerArrayListExtra = r.f50854a;
        }
        arrayList.addAll(integerArrayListExtra);
        ((f) j()).f32554j.setText(getString(R.string.knowledge_cards));
        final int i11 = 0;
        z.b(((f) j()).f32546b, new c(this) { // from class: tp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AckCardActivity f52438b;

            {
                this.f52438b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                AckCardActivity ackCardActivity = this.f52438b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        ackCardActivity.finish();
                        break;
                    case 1:
                        int i14 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 0) {
                            ackCardActivity.S = 0;
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.white));
                            ackCardActivity.v();
                            ackCardActivity.w();
                        }
                        break;
                    case 2:
                        int i15 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 1) {
                            ackCardActivity.S = 1;
                            ((hj.f) ackCardActivity.j()).f32548d.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32548d.setTextColor(ackCardActivity.getColor(R.color.white));
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.btn_kp_card_fav);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.colorAccent));
                            ackCardActivity.w();
                        }
                        break;
                    default:
                        int i16 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        int currentItem = ((hj.f) ackCardActivity.j()).f32555k.getCurrentItem();
                        ArrayList<? extends Parcelable> arrayList2 = ackCardActivity.P;
                        kotlin.jvm.internal.m.d(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.lingo.lingoskill.object.Ack>");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(INTENTS.EXTRA_INT, currentItem);
                        bundle2.putParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST, arrayList2);
                        i iVar = new i();
                        iVar.setArguments(bundle2);
                        iVar.u(ackCardActivity.getSupportFragmentManager(), "AckCardSearchBottomSheetDialogFragment");
                        iVar.X = new o20.i((Object) ackCardActivity, 25);
                        break;
                }
                return b0Var;
            }
        });
        u();
        ((f) j()).f32555k.setAdapter(new ih.b(this, this.P));
        ((f) j()).f32555k.setPageTransformer(new MultipleTransformer(((f) j()).f32555k, j3.Z(12, this)));
        ((f) j()).f32555k.registerOnPageChangeCallback(new tp.c(this));
        final int i12 = 1;
        z.b(((f) j()).f32547c, new c(this) { // from class: tp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AckCardActivity f52438b;

            {
                this.f52438b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                AckCardActivity ackCardActivity = this.f52438b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        ackCardActivity.finish();
                        break;
                    case 1:
                        int i15 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 0) {
                            ackCardActivity.S = 0;
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.white));
                            ackCardActivity.v();
                            ackCardActivity.w();
                        }
                        break;
                    case 2:
                        int i16 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 1) {
                            ackCardActivity.S = 1;
                            ((hj.f) ackCardActivity.j()).f32548d.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32548d.setTextColor(ackCardActivity.getColor(R.color.white));
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.btn_kp_card_fav);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.colorAccent));
                            ackCardActivity.w();
                        }
                        break;
                    default:
                        int i17 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        int currentItem = ((hj.f) ackCardActivity.j()).f32555k.getCurrentItem();
                        ArrayList<? extends Parcelable> arrayList2 = ackCardActivity.P;
                        kotlin.jvm.internal.m.d(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.lingo.lingoskill.object.Ack>");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(INTENTS.EXTRA_INT, currentItem);
                        bundle2.putParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST, arrayList2);
                        i iVar = new i();
                        iVar.setArguments(bundle2);
                        iVar.u(ackCardActivity.getSupportFragmentManager(), "AckCardSearchBottomSheetDialogFragment");
                        iVar.X = new o20.i((Object) ackCardActivity, 25);
                        break;
                }
                return b0Var;
            }
        });
        final int i13 = 2;
        z.b(((f) j()).f32548d, new c(this) { // from class: tp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AckCardActivity f52438b;

            {
                this.f52438b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                AckCardActivity ackCardActivity = this.f52438b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        ackCardActivity.finish();
                        break;
                    case 1:
                        int i16 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 0) {
                            ackCardActivity.S = 0;
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.white));
                            ackCardActivity.v();
                            ackCardActivity.w();
                        }
                        break;
                    case 2:
                        int i17 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 1) {
                            ackCardActivity.S = 1;
                            ((hj.f) ackCardActivity.j()).f32548d.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32548d.setTextColor(ackCardActivity.getColor(R.color.white));
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.btn_kp_card_fav);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.colorAccent));
                            ackCardActivity.w();
                        }
                        break;
                    default:
                        int i18 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        int currentItem = ((hj.f) ackCardActivity.j()).f32555k.getCurrentItem();
                        ArrayList<? extends Parcelable> arrayList2 = ackCardActivity.P;
                        kotlin.jvm.internal.m.d(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.lingo.lingoskill.object.Ack>");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(INTENTS.EXTRA_INT, currentItem);
                        bundle2.putParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST, arrayList2);
                        i iVar = new i();
                        iVar.setArguments(bundle2);
                        iVar.u(ackCardActivity.getSupportFragmentManager(), "AckCardSearchBottomSheetDialogFragment");
                        iVar.X = new o20.i((Object) ackCardActivity, 25);
                        break;
                }
                return b0Var;
            }
        });
        j.a(new x(new g(11)).f(new w(this, 25)).k(e.f38937b).g(px.b.a()).h(new d(this, 1), tp.d.f52447b), this.f36391f);
        final int i14 = 3;
        z.b(((f) j()).f32549e, new c(this) { // from class: tp.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AckCardActivity f52438b;

            {
                this.f52438b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                qy.b0 b0Var = qy.b0.f48488a;
                AckCardActivity ackCardActivity = this.f52438b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        int i16 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        ackCardActivity.finish();
                        break;
                    case 1:
                        int i17 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 0) {
                            ackCardActivity.S = 0;
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.white));
                            ackCardActivity.v();
                            ackCardActivity.w();
                        }
                        break;
                    case 2:
                        int i18 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        if (ackCardActivity.S != 1) {
                            ackCardActivity.S = 1;
                            ((hj.f) ackCardActivity.j()).f32548d.setBackgroundResource(R.drawable.bg_sub_buy_btn);
                            ((hj.f) ackCardActivity.j()).f32548d.setTextColor(ackCardActivity.getColor(R.color.white));
                            ((hj.f) ackCardActivity.j()).f32547c.setBackgroundResource(R.drawable.btn_kp_card_fav);
                            ((hj.f) ackCardActivity.j()).f32547c.setTextColor(ackCardActivity.getColor(R.color.colorAccent));
                            ackCardActivity.w();
                        }
                        break;
                    default:
                        int i19 = AckCardActivity.U;
                        kotlin.jvm.internal.m.f(it, "it");
                        int currentItem = ((hj.f) ackCardActivity.j()).f32555k.getCurrentItem();
                        ArrayList<? extends Parcelable> arrayList2 = ackCardActivity.P;
                        kotlin.jvm.internal.m.d(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.lingo.lingoskill.object.Ack>");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(INTENTS.EXTRA_INT, currentItem);
                        bundle2.putParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST, arrayList2);
                        i iVar = new i();
                        iVar.setArguments(bundle2);
                        iVar.u(ackCardActivity.getSupportFragmentManager(), "AckCardSearchBottomSheetDialogFragment");
                        iVar.X = new o20.i((Object) ackCardActivity, 25);
                        break;
                }
                return b0Var;
            }
        });
    }

    @Override // ji.b
    public final boolean t() {
        return true;
    }

    public final void u() {
        j.a(new x(new g(12)).k(e.f38937b).g(px.b.a()).h(new tp.e(this, 0), vx.b.f54316e), this.f36391f);
    }

    public final void v() {
        if (this.R.isEmpty()) {
            ((f) j()).f32548d.setEnabled(false);
            ((f) j()).f32548d.setBackgroundResource(R.drawable.bg_sub_unit_go_grey);
            ((f) j()).f32548d.setTextColor(getColor(R.color.white));
            return;
        }
        ((f) j()).f32548d.setEnabled(true);
        if (this.S != 0) {
            ((f) j()).f32548d.setBackgroundResource(R.drawable.bg_sub_buy_btn);
            ((f) j()).f32548d.setTextColor(getColor(R.color.white));
        } else {
            ((f) j()).f32548d.setBackgroundResource(R.drawable.btn_kp_card_fav);
            ((f) j()).f32548d.setTextColor(getColor(R.color.colorAccent));
        }
    }

    public final void w() {
        int iP;
        if (com.bumptech.glide.e.o() != -1) {
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    if (com.bumptech.glide.e.o() != -1) {
                        iP = com.bumptech.glide.e.p();
                        break;
                    } else {
                        iP = 0;
                        break;
                    }
                }
                Object obj = arrayList.get(i11);
                i11++;
                Ack ack = (Ack) obj;
                long unitId = ack.getUnitId();
                if (l.f34436b == null) {
                    synchronized (l.class) {
                        if (l.f34436b == null) {
                            l.f34436b = new l();
                        }
                    }
                }
                l lVar = l.f34436b;
                m.c(lVar);
                Long ackUnitId = lVar.a().getAckUnitId();
                m.e(ackUnitId, "getAckUnitId(...)");
                if (unitId == ackUnitId.longValue()) {
                    iP = this.P.indexOf(ack);
                    break;
                }
            }
            LanCustomInfo lanCustomInfoA = a.Z().a();
            lanCustomInfoA.setAckEnterPos(Integer.valueOf(iP));
            a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA);
            LanCustomInfo lanCustomInfoA2 = a.Z().a();
            lanCustomInfoA2.setAckUnitId(-1L);
            a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA2);
        }
        if (this.S == 0) {
            this.P.clear();
            this.P.addAll(this.Q);
            b1 adapter = ((f) j()).f32555k.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            if (com.bumptech.glide.e.p() >= this.P.size()) {
                int size2 = this.P.size() - 1;
                LanCustomInfo lanCustomInfoA3 = a.Z().a();
                lanCustomInfoA3.setAckEnterPos(Integer.valueOf(size2));
                a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoA3);
            }
            ((f) j()).f32555k.setCurrentItem(com.bumptech.glide.e.p(), false);
        } else {
            this.P.clear();
            ArrayList arrayList2 = this.P;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = this.R.iterator();
            while (it.hasNext()) {
                String id2 = ((AckFav) it.next()).getId();
                m.e(id2, "getId(...)");
                long j11 = Long.parseLong((String) q.W0(id2, new String[]{"_"}, 0, 6).get(1));
                List list = this.Q;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list) {
                    if (((Ack) obj2).getId() == j11) {
                        arrayList4.add(obj2);
                    }
                }
                if (arrayList4.size() > 0) {
                    arrayList3.add(arrayList4.get(0));
                }
            }
            arrayList2.addAll(arrayList3);
            b1 adapter2 = ((f) j()).f32555k.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
            ((f) j()).f32555k.setCurrentItem(this.P.size() - 1, false);
        }
        ViewPager2 viewPager2 = ((f) j()).f32555k;
        viewPager2.postDelayed(new b2.c(4, viewPager2, new u(this, 9)), 0L);
        TextView textView = ((f) j()).f32553i;
        int currentItem = ((f) j()).f32555k.getCurrentItem() + 1;
        b1 adapter3 = ((f) j()).f32555k.getAdapter();
        textView.setText(currentItem + "/" + (adapter3 != null ? Integer.valueOf(adapter3.getItemCount()) : null));
    }
}
