package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2418e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f2419f = new n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2423d;

    public static g2 c(RecyclerView recyclerView, int i11, long j11) {
        int iH = recyclerView.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i12));
            if (childViewHolderInt.mPosition == i11 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        u1 u1Var = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            g2 g2VarM = u1Var.m(i11, j11);
            if (g2VarM != null) {
                if (!g2VarM.isBound() || g2VarM.isInvalid()) {
                    u1Var.a(g2VarM, false);
                } else {
                    u1Var.j(g2VarM.itemView);
                }
            }
            return g2VarM;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow() && this.f2421b == 0) {
            this.f2421b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a0 a0Var = recyclerView.mPrefetchRegistry;
        a0Var.f2402a = i11;
        a0Var.f2403b = i12;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    public final void b(long j11) {
        b0 b0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        b0 b0Var2;
        ArrayList arrayList = this.f2423d;
        ArrayList arrayList2 = this.f2420a;
        int size = arrayList2.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i11 += recyclerView3.mPrefetchRegistry.f2405d;
            }
        }
        arrayList.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i14);
            if (recyclerView4.getWindowVisibility() == 0) {
                a0 a0Var = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(a0Var.f2403b) + Math.abs(a0Var.f2402a);
                for (int i15 = 0; i15 < a0Var.f2405d * 2; i15 += 2) {
                    if (i13 >= arrayList.size()) {
                        b0Var2 = new b0();
                        arrayList.add(b0Var2);
                    } else {
                        b0Var2 = (b0) arrayList.get(i13);
                    }
                    int[] iArr = a0Var.f2404c;
                    int i16 = iArr[i15 + 1];
                    b0Var2.f2412a = i16 <= iAbs;
                    b0Var2.f2413b = iAbs;
                    b0Var2.f2414c = i16;
                    b0Var2.f2415d = recyclerView4;
                    b0Var2.f2416e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(arrayList, f2419f);
        for (int i17 = 0; i17 < arrayList.size() && (recyclerView = (b0Var = (b0) arrayList.get(i17)).f2415d) != null; i17++) {
            g2 g2VarC = c(recyclerView, b0Var.f2416e, b0Var.f2412a ? Long.MAX_VALUE : j11);
            if (g2VarC != null && g2VarC.mNestedRecyclerView != null && g2VarC.isBound() && !g2VarC.isInvalid() && (recyclerView2 = g2VarC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                a0 a0Var2 = recyclerView2.mPrefetchRegistry;
                a0Var2.b(recyclerView2, true);
                if (a0Var2.f2405d != 0) {
                    try {
                        int i18 = v4.g.f53514a;
                        Trace.beginSection("RV Nested Prefetch");
                        c2 c2Var = recyclerView2.mState;
                        b1 b1Var = recyclerView2.mAdapter;
                        c2Var.f2427d = 1;
                        c2Var.f2428e = b1Var.getItemCount();
                        c2Var.f2430g = false;
                        c2Var.f2431h = false;
                        c2Var.f2432i = false;
                        for (int i19 = 0; i19 < a0Var2.f2405d * 2; i19 += 2) {
                            c(recyclerView2, a0Var2.f2404c[i19], j11);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        int i21 = v4.g.f53514a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            b0Var.f2412a = false;
            b0Var.f2413b = 0;
            b0Var.f2414c = 0;
            b0Var.f2415d = null;
            b0Var.f2416e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2420a;
        try {
            int i11 = v4.g.f53514a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i12);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2422c);
                }
            }
            this.f2421b = 0L;
        } finally {
            this.f2421b = 0L;
            int i13 = v4.g.f53514a;
            Trace.endSection();
        }
    }
}
