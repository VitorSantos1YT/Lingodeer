package tp;

import a.ar.MFeWs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.ui.review.adapter.AckCardSearchAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.j3;
import hj.d3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends BottomSheetDialogFragment {
    public int T;
    public AckCardSearchAdapter U;
    public d3 W;
    public o20.i X;
    public ArrayList S = new ArrayList();
    public final n9.q V = new n9.q(29, false);

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_ack_card_search_bottom_sheet_dialog, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_search);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_search)));
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.W = new d3(recyclerView, 1, frameLayout);
        kotlin.jvm.internal.m.e(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.V.f();
        this.W = null;
    }

    public final void w() {
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            Ack ack = (Ack) obj;
            ack.setSelected(false);
            Ack ack2 = i13 < this.S.size() ? (Ack) this.S.get(i13) : null;
            if (this.T >= ack.getSortIndex()) {
                if (ack2 == null) {
                    ack.setSelected(true);
                } else if (this.T < ack2.getSortIndex()) {
                    ack.setSelected(true);
                }
            }
            i11 = i13;
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        RandomAccess parcelableArrayList;
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i11 = 0;
        this.T = arguments != null ? arguments.getInt(INTENTS.EXTRA_INT) : 0;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (parcelableArrayList = arguments2.getParcelableArrayList(INTENTS.EXTRA_ARRAY_LIST)) == null) {
            parcelableArrayList = ry.r.f50854a;
        }
        ArrayList arrayList = (ArrayList) parcelableArrayList;
        this.S = arrayList;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            int i14 = i12 + 1;
            if (i12 < 0) {
                ns.o.V();
                throw null;
            }
            ((Ack) obj).setSortIndex(i12);
            i12 = i14;
        }
        ArrayList arrayList2 = this.S;
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            if (hashSet.add(Long.valueOf(((Ack) obj2).getUnitId()))) {
                arrayList3.add(obj2);
            }
        }
        this.S = arrayList3;
        w();
        ArrayList arrayList4 = this.S;
        kotlin.jvm.internal.m.f(arrayList4, MFeWs.nnr);
        this.U = new AckCardSearchAdapter(R.layout.item_ack_card_search, arrayList4);
        d3 d3Var = this.W;
        kotlin.jvm.internal.m.c(d3Var);
        RecyclerView recyclerView = (RecyclerView) d3Var.f32490c;
        AckCardSearchAdapter ackCardSearchAdapter = this.U;
        if (ackCardSearchAdapter == null) {
            kotlin.jvm.internal.m.n("ackCardAdapter");
            throw null;
        }
        recyclerView.setAdapter(ackCardSearchAdapter);
        d3 d3Var2 = this.W;
        kotlin.jvm.internal.m.c(d3Var2);
        RecyclerView recyclerView2 = (RecyclerView) d3Var2.f32490c;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        AckCardSearchAdapter ackCardSearchAdapter2 = this.U;
        if (ackCardSearchAdapter2 != null) {
            ackCardSearchAdapter2.setOnItemClickListener(new hh.c(this, 26));
        } else {
            kotlin.jvm.internal.m.n("ackCardAdapter");
            throw null;
        }
    }
}
