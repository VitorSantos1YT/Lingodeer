package androidx.recyclerview.widget;

import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2644b;

    public /* synthetic */ w(Object obj, int i11) {
        this.f2643a = i11;
        this.f2644b = obj;
    }

    @Override // androidx.recyclerview.widget.r1
    public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        switch (this.f2643a) {
            case 1:
                jp.i iVar = (jp.i) this.f2644b;
                if (i11 == 0) {
                    ta.a aVar = iVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    RecyclerView recyclerView2 = ((hj.a) aVar).f32324g;
                    recyclerView2.postDelayed(new b2.c(4, recyclerView2, new jp.a(iVar, 5)), 0L);
                    recyclerView.removeOnScrollListener(this);
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        switch (this.f2643a) {
            case 0:
                z zVar = (z) this.f2644b;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i13 = zVar.f2654a;
                int iComputeVerticalScrollRange = zVar.f2671s.computeVerticalScrollRange();
                int i14 = zVar.f2670r;
                zVar.f2672t = iComputeVerticalScrollRange - i14 > 0 && i14 >= i13;
                int iComputeHorizontalScrollRange = zVar.f2671s.computeHorizontalScrollRange();
                int i15 = zVar.f2669q;
                boolean z11 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i13;
                zVar.f2673u = z11;
                boolean z12 = zVar.f2672t;
                if (z12 || z11) {
                    if (z12) {
                        float f5 = i14;
                        zVar.f2665l = (int) ((((f5 / 2.0f) + iComputeVerticalScrollOffset) * f5) / iComputeVerticalScrollRange);
                        zVar.f2664k = Math.min(i14, (i14 * i14) / iComputeVerticalScrollRange);
                    }
                    if (zVar.f2673u) {
                        float f11 = iComputeHorizontalScrollOffset;
                        float f12 = i15;
                        zVar.f2667o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                        zVar.f2666n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
                    }
                    int i16 = zVar.f2674v;
                    if (i16 == 0 || i16 == 1) {
                        zVar.d(1);
                    }
                } else if (zVar.f2674v != 0) {
                    zVar.d(0);
                }
                break;
            case 2:
                ((DialogRecyclerView) this.f2644b).b();
                break;
        }
    }
}
