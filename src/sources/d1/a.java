package d1;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22851d;

    public /* synthetic */ a(int i11, Object obj, boolean z11, boolean z12) {
        this.f22848a = i11;
        this.f22851d = obj;
        this.f22849b = z11;
        this.f22850c = z12;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        long j11;
        switch (this.f22848a) {
            case 0:
                g3.b0 b0Var = (g3.b0) obj;
                long jA = ((l) this.f22851d).a();
                b0Var.b(g0.f22913c, new f0(this.f22849b ? s0.g0.SelectionStart : s0.g0.SelectionEnd, jA, this.f22850c ? e0.Left : e0.Right, (9223372034707292159L & jA) != 9205357640488583168L));
                return qy.b0.f48488a;
            default:
                PdVocabularyActivity pdVocabularyActivity = (PdVocabularyActivity) this.f22851d;
                ArrayList arrayList = pdVocabularyActivity.S;
                List list = (List) obj;
                if (list != null) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    PdVocabularyAdapter pdVocabularyAdapter = pdVocabularyActivity.Q;
                    vy.d dVar = null;
                    if (pdVocabularyAdapter == null) {
                        kotlin.jvm.internal.m.n("allAdapter");
                        throw null;
                    }
                    pdVocabularyAdapter.notifyDataSetChanged();
                    PdVocabularyAdapter pdVocabularyAdapter2 = pdVocabularyActivity.Q;
                    if (pdVocabularyAdapter2 == null) {
                        kotlin.jvm.internal.m.n("allAdapter");
                        throw null;
                    }
                    pdVocabularyAdapter2.setEmptyView(R.layout.include_empty_content_2, ((hj.m0) pdVocabularyActivity.j()).f32907f);
                    if (this.f22849b) {
                        long jLongValue = ((Number) nv.p.f(1, th.j.b(this.f22850c))).longValue();
                        Env env = ((fr.o0) pdVocabularyActivity.l()).f27733a;
                        int i11 = env.keyLanguage;
                        if (i11 == 0) {
                            j11 = env.fluentCNVocabularyEnterLesson;
                        } else if (i11 == 1) {
                            j11 = env.fluentJPVocabularyEnterLesson;
                        } else if (i11 == 2) {
                            j11 = env.fluentKRVocabularyEnterLesson;
                        } else if (i11 == 4) {
                            j11 = env.fluentESVocabularyEnterLesson;
                        } else if (i11 == 5) {
                            j11 = env.fluentFRVocabularyEnterLesson;
                        } else if (i11 == 47) {
                            j11 = env.fluentESVocabularyEnterLesson;
                        } else if (i11 != 53) {
                            j11 = 0;
                        } else {
                            j11 = env.fluentFRVocabularyEnterLesson;
                        }
                        if (jLongValue == j11) {
                            RecyclerView recyclerView = ((hj.m0) pdVocabularyActivity.j()).f32907f;
                            recyclerView.postDelayed(new b2.c(4, recyclerView, new hh.o(pdVocabularyActivity, 6)), 0L);
                        } else {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdVocabularyActivity), null, null, new ar.b(pdVocabularyActivity, jLongValue, dVar, 2), 3);
                        }
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
