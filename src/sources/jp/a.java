package jp;

import a0.b2;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.m1;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f36447b;

    public /* synthetic */ a(i iVar, int i11) {
        this.f36446a = i11;
        this.f36447b = iVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36446a) {
            case 0:
                Bundle bundle = new Bundle();
                b7.e0.v(this.f36447b.f47881a.d(), bundle, "U", "unit");
                return bundle;
            case 1:
                i iVar = this.f36447b;
                ta.a aVar = iVar.f47886f;
                ArrayList arrayList = iVar.f36485o;
                kotlin.jvm.internal.m.c(aVar);
                m1 layoutManager = ((hj.a) aVar).f32324g.getLayoutManager();
                if (layoutManager != null) {
                    AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                    if (absDialogModelAdapter == null) {
                        kotlin.jvm.internal.m.n("mAdapter");
                        throw null;
                    }
                    View viewFindViewByPosition = layoutManager.findViewByPosition(absDialogModelAdapter.getHeaderLayoutCount());
                    if (viewFindViewByPosition != null) {
                        AbsDialogModelAdapter absDialogModelAdapter2 = iVar.f36486p;
                        if (absDialogModelAdapter2 == null) {
                            kotlin.jvm.internal.m.n("mAdapter");
                            throw null;
                        }
                        Object obj = arrayList.get(0);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        absDialogModelAdapter2.l(viewFindViewByPosition, (Sentence) obj);
                        iVar.f36489s = true;
                        if (((Sentence) arrayList.get(0)).getItemType() == 1) {
                            iVar.x(1);
                            th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(iVar, 21), vx.b.f54316e), iVar.f47887g);
                        }
                    }
                }
                ef.e.B(iVar.o());
                return qy.b0.f48488a;
            case 2:
                i iVar2 = this.f36447b;
                ta.a aVar2 = iVar2.f47886f;
                ArrayList arrayList2 = iVar2.f36485o;
                kotlin.jvm.internal.m.c(aVar2);
                m1 layoutManager2 = ((hj.a) aVar2).f32324g.getLayoutManager();
                if (layoutManager2 != null) {
                    AbsDialogModelAdapter absDialogModelAdapter3 = iVar2.f36486p;
                    if (absDialogModelAdapter3 == null) {
                        kotlin.jvm.internal.m.n("mAdapter");
                        throw null;
                    }
                    View viewFindViewByPosition2 = layoutManager2.findViewByPosition(absDialogModelAdapter3.getHeaderLayoutCount());
                    if (viewFindViewByPosition2 != null) {
                        AbsDialogModelAdapter absDialogModelAdapter4 = iVar2.f36486p;
                        if (absDialogModelAdapter4 == null) {
                            kotlin.jvm.internal.m.n("mAdapter");
                            throw null;
                        }
                        Object obj2 = arrayList2.get(0);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        absDialogModelAdapter4.l(viewFindViewByPosition2, (Sentence) obj2);
                        iVar2.f36489s = true;
                        if (((Sentence) arrayList2.get(0)).getItemType() == 1) {
                            iVar2.x(1);
                            th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b2(iVar2, 22), vx.b.f54316e), iVar2.f47887g);
                        }
                    }
                }
                return qy.b0.f48488a;
            case 3:
                Bundle bundle2 = new Bundle();
                b7.e0.v(this.f36447b.f47881a.d(), bundle2, "U", "unit");
                return bundle2;
            case 4:
                Bundle bundle3 = new Bundle();
                b7.e0.v(this.f36447b.f47881a.d(), bundle3, "U", "unit");
                return bundle3;
            default:
                i iVar3 = this.f36447b;
                ta.a aVar3 = iVar3.f47886f;
                ArrayList arrayList3 = iVar3.f36485o;
                kotlin.jvm.internal.m.c(aVar3);
                m1 layoutManager3 = ((hj.a) aVar3).f32324g.getLayoutManager();
                if (layoutManager3 != null) {
                    int i11 = iVar3.f36491u;
                    AbsDialogModelAdapter absDialogModelAdapter5 = iVar3.f36486p;
                    if (absDialogModelAdapter5 == null) {
                        kotlin.jvm.internal.m.n("mAdapter");
                        throw null;
                    }
                    View viewFindViewByPosition3 = layoutManager3.findViewByPosition(absDialogModelAdapter5.getHeaderLayoutCount() + i11);
                    if (viewFindViewByPosition3 != null) {
                        int i12 = iVar3.f36491u;
                        AbsDialogModelAdapter absDialogModelAdapter6 = iVar3.f36486p;
                        if (absDialogModelAdapter6 == null) {
                            kotlin.jvm.internal.m.n("mAdapter");
                            throw null;
                        }
                        Object obj3 = arrayList3.get(i12);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        absDialogModelAdapter6.l(viewFindViewByPosition3, (Sentence) obj3);
                        if (((Sentence) arrayList3.get(iVar3.f36491u)).getItemType() == 1) {
                            th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new d(iVar3), vx.b.f54316e), iVar3.f47887g);
                        }
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
