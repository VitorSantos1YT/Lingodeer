package km;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import bp.g4;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.YinTuAdapter;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j2<T extends BaseYintuIntel> extends ji.e {
    public List N;
    public int O;
    public int P;
    public int Q;
    public xx.f R;
    public um.f S;
    public a9.i T;
    public bc.i U;
    public b7.c V;
    public fv.c W;
    public final AtomicBoolean X;
    public im.a Y;

    public j2() {
        super(h2.f38209a, BuildConfig.VERSION_NAME);
        this.P = 6;
        this.X = new AtomicBoolean(false);
    }

    public final void A(RecyclerView recyclerView, View view, View view2) {
        LinearLayout linearLayout = (LinearLayout) view;
        LinearLayout linearLayout2 = (LinearLayout) view2;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout3 = (LinearLayout) childAt;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            linearLayout3.setBackgroundColor(contextRequireContext.getColor(R.color.white));
            if (i11 < linearLayout.getChildCount() - 1) {
                View childAt2 = linearLayout3.getChildAt(0);
                kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                cf.x.L((ImageView) childAt2, R.drawable.ic_ctr_play, ColorStateList.valueOf(contextRequireContext2.getColor(R.color.colorAccent)));
            } else {
                TextView textView = (TextView) linearLayout3.findViewById(R.id.tv_all);
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                textView.setTextColor(contextRequireContext3.getColor(R.color.colorAccent));
            }
        }
        int childCount2 = linearLayout2.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt3 = linearLayout2.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt3, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) childAt3;
            Context contextRequireContext4 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
            linearLayout4.setBackgroundColor(contextRequireContext4.getColor(R.color.white));
            if (i12 < linearLayout2.getChildCount() - 1) {
                View childAt4 = linearLayout4.getChildAt(0);
                kotlin.jvm.internal.m.d(childAt4, "null cannot be cast to non-null type android.widget.ImageView");
                Context contextRequireContext5 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                cf.x.L((ImageView) childAt4, R.drawable.ic_ctr_play, ColorStateList.valueOf(contextRequireContext5.getColor(R.color.colorAccent)));
            } else {
                TextView textView2 = (TextView) linearLayout4.findViewById(R.id.tv_all);
                Context contextRequireContext6 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                textView2.setTextColor(contextRequireContext6.getColor(R.color.colorAccent));
            }
        }
        androidx.recyclerview.widget.b1 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.m.d(adapter, "null cannot be cast to non-null type com.lingo.lingoskill.japanskill.ui.syllable.adapter.YinTuAdapter<*>");
        ((YinTuAdapter) adapter).b(-1, recyclerView);
    }

    public final void B(View view, ArrayList arrayList) {
        int i11 = this.O < 2 ? 6 : 4;
        LinearLayout linearLayout = (LinearLayout) view;
        int childCount = linearLayout.getChildCount() - 1;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = linearLayout.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) childAt;
            ArrayList arrayList2 = new ArrayList();
            i12++;
            int i13 = 0;
            int i14 = i12;
            while (true) {
                int i15 = i14 - 1;
                if (i15 < arrayList.size()) {
                    if (((Number) arrayList.get(i15)).intValue() > 0) {
                        arrayList2.add(Integer.valueOf(i14));
                    }
                    i13++;
                    i14 = (i13 * i11) + i12;
                }
            }
            linearLayout2.setTag(arrayList2);
        }
        View childAt2 = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout3 = (LinearLayout) childAt2;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            if (((Number) arrayList.get(i16)).intValue() > 0) {
                arrayList3.add(Integer.valueOf(i16 + 1));
            }
        }
        linearLayout3.setTag(arrayList3);
    }

    @Override // ji.e
    public final void q() {
        bq.f fVar;
        xx.f fVar2 = this.R;
        if (fVar2 != null) {
            ux.b.a(fVar2);
        }
        um.f fVar3 = this.S;
        if (fVar3 != null) {
            bc.i iVar = fVar3.f53033c;
            if (iVar != null) {
                ((a9.i) iVar.f4126f).l();
            }
            b7.c cVar = fVar3.f53034d;
            if (cVar != null && (fVar = (bq.f) cVar.f3962e) != null) {
                fVar.t();
                cVar.f3962e = null;
            }
            fv.c cVar2 = fVar3.f53035e;
            if (cVar2 != null) {
                cVar2.a(fVar3.f53041k);
            }
        }
    }

    @Override // androidx.fragment.app.k0
    public final void setUserVisibleHint(boolean z11) {
        xx.f fVar;
        super.setUserVisibleHint(z11);
        if (z11 || (fVar = this.R) == null) {
            return;
        }
        ux.b.a(fVar);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        l.m mVar = this.f36398d;
        this.T = new a9.i(1);
        this.U = new bc.i(mVar);
        this.V = new b7.c(r());
        this.W = new fv.c();
        y();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        um.c.b(contextRequireContext, new hh.o(this, 26));
        im.a aVar = this.Y;
        if (aVar == null) {
            kotlin.jvm.internal.m.n("mViewModel");
            throw null;
        }
        th.j.a(new ay.x(new g4(aVar, 7)).k(ky.e.f38937b).g(px.b.a()).h(new hd.b(new gr.s(this, 26), 20), vx.b.f54316e), aVar.f34465d);
    }

    public final void x(View view, View view2, RecyclerView recyclerView, NestedScrollView nestedScrollView) {
        LinearLayout linearLayout = (LinearLayout) view;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) childAt;
            bq.z.b(linearLayout2, new g2(linearLayout2, this, view, view2, recyclerView, nestedScrollView, i11, linearLayout));
        }
    }

    public abstract void y();

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final void z(RecyclerView recyclerView, List list, NestedScrollView nestedScrollView) {
        String str;
        View view;
        androidx.recyclerview.widget.g2 g2VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(((Number) list.get(this.Q)).intValue());
        if (g2VarFindViewHolderForAdapterPosition != null) {
            View itemView = g2VarFindViewHolderForAdapterPosition.itemView;
            kotlin.jvm.internal.m.e(itemView, "itemView");
            str = (String) itemView.getTag();
            if (str != null) {
                view = g2VarFindViewHolderForAdapterPosition.itemView;
            } else {
                str = null;
                view = null;
            }
        } else {
            str = null;
            view = null;
        }
        if (str == null) {
            this.Q++;
            return;
        }
        xx.f fVar = this.R;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        a9.i iVar = this.T;
        kotlin.jvm.internal.m.c(iVar);
        iVar.v(str);
        kotlin.jvm.internal.m.c(view);
        float y10 = view.getY();
        kotlin.jvm.internal.m.c(nestedScrollView);
        float height = y10 - ((nestedScrollView.getHeight() - view.getHeight()) / 2);
        androidx.recyclerview.widget.b1 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.m.d(adapter, "null cannot be cast to non-null type com.lingo.lingoskill.japanskill.ui.syllable.adapter.YinTuAdapter<*>");
        ((YinTuAdapter) adapter).a(((Number) list.get(this.Q)).intValue(), recyclerView);
        nestedScrollView.scrollTo(0, (int) height);
        int[] iArr = bq.r.f4959a;
        this.R = qx.h.m(bq.m.B(str) + ((long) 500), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new dm.c(this, list, recyclerView, nestedScrollView, 5), d.K);
    }
}
