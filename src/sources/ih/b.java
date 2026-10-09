package ih;

import android.os.Bundle;
import androidx.fragment.app.k0;
import androidx.fragment.app.p0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import com.lingodeer.data.model.INTENTS;
import hh.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import tp.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34411a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k0 k0Var, k0[] fragments) {
        super(k0Var);
        m.f(fragments, "fragments");
        this.f34412b = fragments;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final k0 createFragment(int i11) {
        switch (this.f34411a) {
            case 0:
                return p.a((PdTips) ((List) this.f34412b).get(i11));
            case 1:
                Ack ack = (Ack) ((List) this.f34412b).get(i11);
                m.f(ack, "ack");
                Bundle bundle = new Bundle();
                bundle.putParcelable(INTENTS.EXTRA_OBJECT, ack);
                h hVar = new h();
                hVar.setArguments(bundle);
                return hVar;
            default:
                try {
                    return ((k0[]) this.f34412b)[i11];
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        switch (this.f34411a) {
            case 0:
                return ((List) this.f34412b).size();
            case 1:
                return ((List) this.f34412b).size();
            default:
                return ((k0[]) this.f34412b).length;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p0 p0Var, ArrayList list) {
        super(p0Var);
        m.f(list, "list");
        this.f34412b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AckCardActivity ackCardActivity, ArrayList ackList) {
        super(ackCardActivity);
        m.f(ackList, "ackList");
        this.f34412b = ackList;
    }
}
