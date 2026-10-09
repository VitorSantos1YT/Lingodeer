package hh;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.fluent.ui.base.adapter.PdFavAdapter;
import com.lingo.fluent.widget.WrapContentLinearLayoutManager;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingodeer.R;
import hj.h4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ji.e {
    public final ArrayList N;
    public PdFavAdapter O;
    public jh.a P;

    public f() {
        super(d.f32218a, "FluentLessonStarredList");
        this.N = new ArrayList();
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.lesson_starred);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        androidx.fragment.app.p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        androidx.fragment.app.p0 p0VarRequireActivity2 = requireActivity();
        kotlin.jvm.internal.m.e(p0VarRequireActivity2, "requireActivity(...)");
        this.P = (jh.a) new ViewModelProvider(p0VarRequireActivity2).get(jh.a.class);
        this.O = new PdFavAdapter(this.N, LifecycleOwnerKt.getLifecycleScope(this));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((h4) aVar).f32659b.setLayoutManager(new WrapContentLinearLayoutManager(requireContext()));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        RecyclerView recyclerView = ((h4) aVar2).f32659b;
        PdFavAdapter pdFavAdapter = this.O;
        if (pdFavAdapter == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        recyclerView.setAdapter(pdFavAdapter);
        jh.a aVar3 = this.P;
        if (aVar3 == null) {
            kotlin.jvm.internal.m.n("mViewModel");
            throw null;
        }
        final int i11 = 0;
        aVar3.f36339b.observe(getViewLifecycleOwner(), new Observer(this) { // from class: hh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f32206b;

            {
                this.f32206b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            List listS0 = ry.m.S0(list, new e(0));
                            int size = listS0.size();
                            f fVar = this.f32206b;
                            ArrayList arrayList = fVar.N;
                            boolean z11 = size > arrayList.size();
                            androidx.recyclerview.widget.p pVarA = androidx.recyclerview.widget.u.a(new ih.e(arrayList, listS0), true);
                            arrayList.clear();
                            arrayList.addAll(listS0);
                            PdFavAdapter pdFavAdapter2 = fVar.O;
                            if (pdFavAdapter2 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            pVarA.a(new androidx.recyclerview.widget.c(pdFavAdapter2));
                            if (z11) {
                                ta.a aVar4 = fVar.f36400f;
                                kotlin.jvm.internal.m.c(aVar4);
                                androidx.recyclerview.widget.m1 layoutManager = ((h4) aVar4).f32659b.getLayoutManager();
                                kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                            }
                            PdFavAdapter pdFavAdapter3 = fVar.O;
                            if (pdFavAdapter3 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            ta.a aVar5 = fVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar5);
                            pdFavAdapter3.setEmptyView(R.layout.include_empty_content, ((h4) aVar5).f32659b);
                            return;
                        }
                        return;
                    default:
                        PdLesson pdLesson = (PdLesson) obj;
                        if (pdLesson != null) {
                            f fVar2 = this.f32206b;
                            ArrayList arrayList2 = fVar2.N;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = arrayList2.get(i12);
                                i12++;
                                if (kotlin.jvm.internal.m.a(((PdLessonFav) obj2).getLessonId(), pdLesson.getLessonId())) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PdLessonFav pdLessonFav = (PdLessonFav) arrayList3.get(0);
                            PdFavAdapter pdFavAdapter4 = fVar2.O;
                            if (pdFavAdapter4 != null) {
                                pdFavAdapter4.notifyItemChanged(fVar2.N.indexOf(pdLessonFav));
                                return;
                            } else {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        PdFavAdapter pdFavAdapter2 = this.O;
        if (pdFavAdapter2 == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        pdFavAdapter2.setOnItemClickListener(new c(this, 0));
        PdFavAdapter pdFavAdapter3 = this.O;
        if (pdFavAdapter3 == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        pdFavAdapter3.f21625b = new a5.j(this, 17);
        jh.a aVar4 = this.P;
        if (aVar4 == null) {
            kotlin.jvm.internal.m.n("mViewModel");
            throw null;
        }
        final int i12 = 1;
        aVar4.f36338a.observe(getViewLifecycleOwner(), new Observer(this) { // from class: hh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f32206b;

            {
                this.f32206b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            List listS0 = ry.m.S0(list, new e(0));
                            int size = listS0.size();
                            f fVar = this.f32206b;
                            ArrayList arrayList = fVar.N;
                            boolean z11 = size > arrayList.size();
                            androidx.recyclerview.widget.p pVarA = androidx.recyclerview.widget.u.a(new ih.e(arrayList, listS0), true);
                            arrayList.clear();
                            arrayList.addAll(listS0);
                            PdFavAdapter pdFavAdapter4 = fVar.O;
                            if (pdFavAdapter4 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            pVarA.a(new androidx.recyclerview.widget.c(pdFavAdapter4));
                            if (z11) {
                                ta.a aVar5 = fVar.f36400f;
                                kotlin.jvm.internal.m.c(aVar5);
                                androidx.recyclerview.widget.m1 layoutManager = ((h4) aVar5).f32659b.getLayoutManager();
                                kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                            }
                            PdFavAdapter pdFavAdapter5 = fVar.O;
                            if (pdFavAdapter5 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            ta.a aVar6 = fVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar6);
                            pdFavAdapter5.setEmptyView(R.layout.include_empty_content, ((h4) aVar6).f32659b);
                            return;
                        }
                        return;
                    default:
                        PdLesson pdLesson = (PdLesson) obj;
                        if (pdLesson != null) {
                            f fVar2 = this.f32206b;
                            ArrayList arrayList2 = fVar2.N;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj2 = arrayList2.get(i13);
                                i13++;
                                if (kotlin.jvm.internal.m.a(((PdLessonFav) obj2).getLessonId(), pdLesson.getLessonId())) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PdLessonFav pdLessonFav = (PdLessonFav) arrayList3.get(0);
                            PdFavAdapter pdFavAdapter6 = fVar2.O;
                            if (pdFavAdapter6 != null) {
                                pdFavAdapter6.notifyItemChanged(fVar2.N.indexOf(pdLessonFav));
                                return;
                            } else {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
