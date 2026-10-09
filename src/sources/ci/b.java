package ci;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableIntroductionActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestIndexActivity;
import com.lingo.lingoskill.ar.ui.syllable.adapter.ARSyllableIndexAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements i.b, BaseQuickAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f7124a;

    public /* synthetic */ b(g gVar) {
        this.f7124a = gVar;
    }

    @Override // i.b
    public void f(Object obj) {
        g gVar = this.f7124a;
        i.a it = (i.a) obj;
        kotlin.jvm.internal.m.f(it, "it");
        ARSyllableIndexAdapter aRSyllableIndexAdapter = gVar.O;
        if (aRSyllableIndexAdapter == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        aRSyllableIndexAdapter.f21673a = b7.e0.d(ij.l.f34436b, 51);
        ARSyllableIndexAdapter aRSyllableIndexAdapter2 = gVar.O;
        if (aRSyllableIndexAdapter2 != null) {
            aRSyllableIndexAdapter2.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        g gVar = this.f7124a;
        Object obj = gVar.N.get(i11);
        kotlin.jvm.internal.m.e(obj, "get(...)");
        bi.a aVar = (bi.a) obj;
        int i12 = aVar.f4450a;
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (i12 > b7.e0.d(ij.l.f34436b, 51) && aVar.f4450a != 2000) {
            Toast.makeText(gVar.requireContext(), R.string.please_complete_previous_lesson, 0).show();
            return;
        }
        if (i11 == 0) {
            gVar.Q.a(new Intent(gVar.requireContext(), (Class<?>) ARSyllableIntroductionActivity.class));
            return;
        }
        gVar.t().c("jxz_alphabet_click_lesson", new av.d(aVar, 25));
        i.c cVar = gVar.Q;
        int i13 = ARSyllableTestIndexActivity.Q;
        Context contextRequireContext = gVar.requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        Intent intent = new Intent(contextRequireContext, (Class<?>) ARSyllableTestIndexActivity.class);
        intent.putExtra(INTENTS.EXTRA_OBJECT, aVar);
        cVar.a(intent);
    }
}
