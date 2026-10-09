package hp;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.Observer;
import com.lingo.lingoskill.ui.handwrite.adapter.HandWriteIndexAdapter;
import com.lingodeer.R;
import hj.v3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f33685b;

    public /* synthetic */ a(d dVar, int i11) {
        this.f33684a = i11;
        this.f33685b = dVar;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f33684a) {
            case 0:
                List list = (List) obj;
                if (list != null) {
                    d dVar = this.f33685b;
                    dVar.P.clear();
                    dVar.P.addAll(list);
                    HandWriteIndexAdapter handWriteIndexAdapter = dVar.O;
                    if (handWriteIndexAdapter != null) {
                        handWriteIndexAdapter.notifyDataSetChanged();
                        return;
                    } else {
                        m.n("adapter");
                        throw null;
                    }
                }
                return;
            case 1:
                ip.b bVar = (ip.b) obj;
                if (bVar != null) {
                    int i11 = c.f33687a[bVar.ordinal()];
                    d dVar2 = this.f33685b;
                    if (i11 == 1) {
                        Toast.makeText(dVar2.requireContext(), dVar2.getString(R.string.error), 0).show();
                        return;
                    }
                    if (i11 == 2) {
                        ta.a aVar = dVar2.f36400f;
                        m.c(aVar);
                        ((v3) aVar).f33456b.setVisibility(0);
                        ip.a aVar2 = dVar2.N;
                        if (aVar2 != null) {
                            aVar2.f34551e.observe(dVar2.getViewLifecycleOwner(), new a(dVar2, 2));
                            return;
                        } else {
                            m.n("viewModel");
                            throw null;
                        }
                    }
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ta.a aVar3 = dVar2.f36400f;
                    m.c(aVar3);
                    ((v3) aVar3).f33456b.setVisibility(8);
                    ip.a aVar4 = dVar2.N;
                    if (aVar4 == null) {
                        m.n("viewModel");
                        throw null;
                    }
                    Context contextRequireContext = dVar2.requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    aVar4.a(contextRequireContext);
                    return;
                }
                return;
            default:
                ta.a aVar5 = this.f33685b.f36400f;
                m.c(aVar5);
                ((v3) aVar5).f33458d.setText(((Integer) obj) + " %");
                return;
        }
    }
}
