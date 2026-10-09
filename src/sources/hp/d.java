package hp;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp.b1;
import com.lingo.lingoskill.ui.handwrite.adapter.HandWriteIndexAdapter;
import com.lingodeer.R;
import f10.k;
import hj.v3;
import java.util.ArrayList;
import ji.e;
import kotlin.jvm.internal.m;
import org.greenrobot.eventbus.ThreadMode;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {
    public ip.a N;
    public HandWriteIndexAdapter O;
    public final ArrayList P;

    public d() {
        super(b.f33686a, "CharacterDrillTabLearn");
        this.P = new ArrayList();
        com.bumptech.glide.d.u(j.NONE, new b1(14, this, new bj.a(this, 17)));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(np.b refreshEvent) {
        m.f(refreshEvent, "refreshEvent");
        if (refreshEvent.f43921a == 23) {
            ip.a aVar = this.N;
            if (aVar == null) {
                m.n("viewModel");
                throw null;
            }
            Context contextRequireContext = requireContext();
            m.e(contextRequireContext, "requireContext(...)");
            aVar.a(contextRequireContext);
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.O = new HandWriteIndexAdapter(R.layout.item_jp_hw_char_group, this.P);
        ta.a aVar = this.f36400f;
        m.c(aVar);
        RecyclerView recyclerView = ((v3) aVar).f33457c;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        m.c(aVar2);
        RecyclerView recyclerView2 = ((v3) aVar2).f33457c;
        HandWriteIndexAdapter handWriteIndexAdapter = this.O;
        if (handWriteIndexAdapter == null) {
            m.n("adapter");
            throw null;
        }
        recyclerView2.setAdapter(handWriteIndexAdapter);
        ip.a aVar3 = (ip.a) new ViewModelProvider(this).get(ip.a.class);
        this.N = aVar3;
        if (aVar3 == null) {
            m.n("viewModel");
            throw null;
        }
        aVar3.f34550d.observe(getViewLifecycleOwner(), new a(this, 0));
        ip.a aVar4 = this.N;
        if (aVar4 == null) {
            m.n("viewModel");
            throw null;
        }
        aVar4.f34551e.setValue(100);
        MutableLiveData mutableLiveData = aVar4.f34552f;
        mutableLiveData.setValue(ip.b.SUCCESS);
        mutableLiveData.observe(getViewLifecycleOwner(), new a(this, 1));
        HandWriteIndexAdapter handWriteIndexAdapter2 = this.O;
        if (handWriteIndexAdapter2 != null) {
            handWriteIndexAdapter2.setOnItemClickListener(new hh.c(this, 3));
        } else {
            m.n("adapter");
            throw null;
        }
    }

    @Override // ji.e
    public final boolean w() {
        return true;
    }
}
