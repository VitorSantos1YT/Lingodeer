package jg;

import a9.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import b7.f0;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.YinTuAdapter;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingodeer.R;
import hj.m6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import km.j2;
import kotlin.jvm.internal.m;
import lc.d;
import s7.j;
import s7.n;
import ux.b;
import xx.f;
import y6.p;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ComponentFactory, BaseQuickAdapter.OnItemClickListener, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36337d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f36334a = obj;
        this.f36335b = obj2;
        this.f36336c = obj3;
        this.f36337d = obj4;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        return new DefaultFirebaseAppCheck((FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.c(HeartBeatController.class), (Executor) componentContainer.f((Qualified) this.f36334a), (Executor) componentContainer.f((Qualified) this.f36335b), (Executor) componentContainer.f((Qualified) this.f36336c), (ScheduledExecutorService) componentContainer.f((Qualified) this.f36337d));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // s7.n
    public List e(int i11, p0 p0Var, int[] iArr) {
        int i12;
        int i13;
        int i14;
        int i15;
        p0 p0Var2 = p0Var;
        j jVar = (j) this.f36334a;
        String str = (String) this.f36335b;
        int[] iArr2 = (int[]) this.f36336c;
        Point point = (Point) this.f36337d;
        int i16 = iArr2[i11];
        int i17 = point != null ? point.x : jVar.f57343e;
        int i18 = point != null ? point.y : jVar.f57344f;
        boolean z11 = jVar.f57346h;
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            i12 = Integer.MAX_VALUE;
        } else {
            int i19 = Integer.MAX_VALUE;
            for (int i21 = 0; i21 < p0Var2.f57304a; i21++) {
                p pVar = p0Var2.f57307d[i21];
                int i22 = pVar.f57298u;
                int i23 = pVar.f57299v;
                if (i22 > 0 && i23 > 0) {
                    if (!z11) {
                        i14 = i17;
                        i15 = i18;
                    } else if ((i22 > i23) != (i17 > i18)) {
                        i15 = i17;
                        i14 = i18;
                    } else {
                        i14 = i17;
                        i15 = i18;
                    }
                    int i24 = i22 * i15;
                    int i25 = i23 * i14;
                    Point point2 = i24 >= i25 ? new Point(i14, f0.e(i25, i22)) : new Point(f0.e(i24, i23), i15);
                    int i26 = pVar.f57298u;
                    int i27 = i26 * i23;
                    if (i26 >= ((int) (point2.x * 0.98f)) && i23 >= ((int) (point2.y * 0.98f)) && i27 < i19) {
                        i19 = i27;
                    }
                }
            }
            i12 = i19;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i28 = 0;
        while (i28 < p0Var2.f57304a) {
            p pVar2 = p0Var2.f57307d[i28];
            int i29 = pVar2.f57298u;
            int i30 = (i29 == -1 || (i13 = pVar2.f57299v) == -1) ? -1 : i29 * i13;
            builder.h(new s7.p(i11, p0Var2, i28, jVar, iArr[i28], str, i16, i12 == Integer.MAX_VALUE || (i30 != -1 && i30 <= i12)));
            i28++;
            p0Var2 = p0Var;
        }
        return builder.j();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        j2 j2Var = (j2) this.f36334a;
        AtomicBoolean atomicBoolean = j2Var.X;
        View view2 = (View) this.f36335b;
        View view3 = (View) this.f36336c;
        YinTuAdapter yinTuAdapter = (YinTuAdapter) this.f36337d;
        f fVar = j2Var.R;
        if (fVar != null) {
            b.a(fVar);
        }
        i iVar = j2Var.T;
        m.c(iVar);
        iVar.y();
        atomicBoolean.set(true);
        BaseYintuIntel baseYintuIntel = (BaseYintuIntel) baseQuickAdapter.getItem(i11);
        m.c(baseYintuIntel);
        if (baseYintuIntel.getId() > 0) {
            ta.a aVar = j2Var.f36400f;
            m.c(aVar);
            j2Var.A(((m6) aVar).f32941b, view2, view3);
            int headerLayoutCount = yinTuAdapter.getHeaderLayoutCount() + i11;
            ta.a aVar2 = j2Var.f36400f;
            m.c(aVar2);
            yinTuAdapter.a(headerLayoutCount, ((m6) aVar2).f32941b);
            if (j2Var.S == null) {
                l.m mVar = j2Var.f36398d;
                m.c(mVar);
                j2Var.S = new um.f(mVar, j2Var.r(), j2Var.U, j2Var.V, j2Var.W);
            }
            um.f fVar2 = j2Var.S;
            m.c(fVar2);
            List<BaseYintuIntel> list = j2Var.N;
            m.c(list);
            ArrayList arrayList = new ArrayList();
            for (BaseYintuIntel baseYintuIntel2 : list) {
                if (baseYintuIntel2.getId() > 0) {
                    arrayList.add(baseYintuIntel2);
                }
            }
            fVar2.a(baseYintuIntel, arrayList);
            um.f fVar3 = j2Var.S;
            m.c(fVar3);
            d dVar = fVar3.f53040j;
            m.c(dVar);
            dVar.show();
            return;
        }
        if (baseYintuIntel.getId() == -1) {
            Drawable background = view.getBackground();
            m.d(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            int color = ((ColorDrawable) background).getColor();
            ta.a aVar3 = j2Var.f36400f;
            m.c(aVar3);
            j2Var.A(((m6) aVar3).f32941b, view2, view3);
            Context contextRequireContext = j2Var.requireContext();
            m.e(contextRequireContext, "requireContext(...)");
            if (color != contextRequireContext.getColor(R.color.white)) {
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_ctr);
                m.c(imageView);
                Context contextRequireContext2 = j2Var.requireContext();
                m.e(contextRequireContext2, "requireContext(...)");
                x.L(imageView, R.drawable.ic_ctr_play, ColorStateList.valueOf(contextRequireContext2.getColor(R.color.colorAccent)));
                Context contextRequireContext3 = j2Var.requireContext();
                m.e(contextRequireContext3, "requireContext(...)");
                view.setBackgroundColor(contextRequireContext3.getColor(R.color.white));
                return;
            }
            ta.a aVar4 = j2Var.f36400f;
            m.c(aVar4);
            RecyclerView recyclerView = ((m6) aVar4).f32941b;
            int headerLayoutCount2 = yinTuAdapter.getHeaderLayoutCount() + i11;
            ta.a aVar5 = j2Var.f36400f;
            m.c(aVar5);
            NestedScrollView nestedScrollView = ((m6) aVar5).f32942c;
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = headerLayoutCount2 - (j2Var.O < 2 ? 5 : 3); i12 < headerLayoutCount2; i12++) {
                g2 g2VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i12);
                m.c(g2VarFindViewHolderForAdapterPosition);
                View itemView = g2VarFindViewHolderForAdapterPosition.itemView;
                m.e(itemView, "itemView");
                if (((String) itemView.getTag()) != null) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            atomicBoolean.set(false);
            j2Var.Q = 0;
            j2Var.z(recyclerView, arrayList2, nestedScrollView);
            int headerLayoutCount3 = yinTuAdapter.getHeaderLayoutCount() + i11;
            ta.a aVar6 = j2Var.f36400f;
            m.c(aVar6);
            yinTuAdapter.b(headerLayoutCount3, ((m6) aVar6).f32941b);
        }
    }
}
