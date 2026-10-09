package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t1 f2635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2636h;

    public u1(RecyclerView recyclerView) {
        this.f2636h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2629a = arrayList;
        this.f2630b = null;
        this.f2631c = new ArrayList();
        this.f2632d = Collections.unmodifiableList(arrayList);
        this.f2633e = 2;
        this.f2634f = 2;
    }

    public static void e(ViewGroup viewGroup, boolean z11) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt, true);
            }
        }
        if (z11) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(g2 g2Var, boolean z11) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(g2Var);
        View view = g2Var.itemView;
        RecyclerView recyclerView = this.f2636h;
        i2 i2Var = recyclerView.mAccessibilityDelegate;
        if (i2Var != null) {
            z4.b bVarJ = i2Var.j();
            z4.s0.q(view, bVarJ instanceof h2 ? (z4.b) ((h2) bVarJ).f2469e.remove(view) : null);
        }
        if (z11) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            b1 b1Var = recyclerView.mAdapter;
            if (b1Var != null) {
                b1Var.onViewRecycled(g2Var);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(g2Var);
            }
        }
        g2Var.mBindingAdapter = null;
        g2Var.mOwnerRecyclerView = null;
        t1 t1VarC = c();
        t1VarC.getClass();
        int itemViewType = g2Var.getItemViewType();
        ArrayList arrayList = t1VarC.a(itemViewType).f2606a;
        if (((s1) t1VarC.f2618a.get(itemViewType)).f2607b <= arrayList.size()) {
            android.support.v4.media.session.a.g(g2Var.itemView);
        } else {
            g2Var.resetInternal();
            arrayList.add(g2Var);
        }
    }

    public final int b(int i11) {
        RecyclerView recyclerView = this.f2636h;
        if (i11 >= 0 && i11 < recyclerView.mState.b()) {
            return !recyclerView.mState.f2430g ? i11 : recyclerView.mAdapterHelper.f(i11, 0);
        }
        StringBuilder sbI = w4.c.i(i11, "invalid position ", ". State item count is ");
        sbI.append(recyclerView.mState.b());
        sbI.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public final t1 c() {
        if (this.f2635g == null) {
            t1 t1Var = new t1();
            t1Var.f2618a = new SparseArray();
            t1Var.f2619b = 0;
            t1Var.f2620c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2635g = t1Var;
            f();
        }
        return this.f2635g;
    }

    public final View d(int i11) {
        return m(i11, Long.MAX_VALUE).itemView;
    }

    public final void f() {
        if (this.f2635g != null) {
            RecyclerView recyclerView = this.f2636h;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            t1 t1Var = this.f2635g;
            t1Var.f2620c.add(recyclerView.mAdapter);
        }
    }

    public final void g(b1 b1Var, boolean z11) {
        t1 t1Var = this.f2635g;
        if (t1Var != null) {
            SparseArray sparseArray = t1Var.f2618a;
            Set set = t1Var.f2620c;
            set.remove(b1Var);
            if (set.size() != 0 || z11) {
                return;
            }
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                ArrayList arrayList = ((s1) sparseArray.get(sparseArray.keyAt(i11))).f2606a;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    android.support.v4.media.session.a.g(((g2) arrayList.get(i12)).itemView);
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f2631c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            a0 a0Var = this.f2636h.mPrefetchRegistry;
            int[] iArr = a0Var.f2404c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            a0Var.f2405d = 0;
        }
    }

    public final void i(int i11) {
        ArrayList arrayList = this.f2631c;
        a((g2) arrayList.get(i11), true);
        arrayList.remove(i11);
    }

    public final void j(View view) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f2636h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        k(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.d(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[LOOP:2: B:43:0x008a->B:47:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0098 A[EDGE_INSN: B:74:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0098 A[EDGE_INSN: B:75:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092, LOOP_LABEL: LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
    public final void k(g2 g2Var) {
        boolean z11;
        int i11;
        int i12;
        a0 a0Var;
        int i13;
        int i14;
        boolean zIsScrap = g2Var.isScrap();
        boolean z12 = false;
        boolean z13 = true;
        RecyclerView recyclerView = this.f2636h;
        if (zIsScrap || g2Var.itemView.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(g2Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(g2Var.itemView.getParent() != null);
            sb2.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (g2Var.isTmpDetached()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(g2Var);
            throw new IllegalArgumentException(defpackage.e.j(recyclerView, sb3));
        }
        if (g2Var.shouldIgnore()) {
            throw new IllegalArgumentException(defpackage.e.j(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        boolean zDoesTransientStatePreventRecycling = g2Var.doesTransientStatePreventRecycling();
        b1 b1Var = recyclerView.mAdapter;
        if ((b1Var != null && zDoesTransientStatePreventRecycling && b1Var.onFailedToRecycleView(g2Var)) || g2Var.isRecyclable()) {
            if (this.f2634f <= 0 || g2Var.hasAnyOfTheFlags(526)) {
                z11 = false;
            } else {
                ArrayList arrayList = this.f2631c;
                int size = arrayList.size();
                if (size >= this.f2634f && size > 0) {
                    i(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    a0 a0Var2 = recyclerView.mPrefetchRegistry;
                    int i15 = g2Var.mPosition;
                    if (a0Var2.f2404c != null) {
                        int i16 = a0Var2.f2405d * 2;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= i16) {
                                i11 = size - 1;
                                loop1: while (i11 >= 0) {
                                    i12 = ((g2) arrayList.get(i11)).mPosition;
                                    a0Var = recyclerView.mPrefetchRegistry;
                                    if (a0Var.f2404c != null) {
                                        break;
                                    }
                                    i13 = a0Var.f2405d * 2;
                                    i14 = 0;
                                    while (true) {
                                        if (i14 < i13) {
                                            break loop1;
                                        } else if (a0Var.f2404c[i14] == i12) {
                                            break;
                                        } else {
                                            i14 += 2;
                                        }
                                    }
                                    i11--;
                                }
                                size = i11 + 1;
                            } else if (a0Var2.f2404c[i17] != i15) {
                                i17 += 2;
                            }
                        }
                    } else {
                        i11 = size - 1;
                        loop1: while (i11 >= 0) {
                            i12 = ((g2) arrayList.get(i11)).mPosition;
                            a0Var = recyclerView.mPrefetchRegistry;
                            if (a0Var.f2404c != null) {
                                break;
                                break;
                            }
                            i13 = a0Var.f2405d * 2;
                            i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    break loop1;
                                    break loop1;
                                } else if (a0Var.f2404c[i14] == i12) {
                                    break;
                                } else {
                                    i14 += 2;
                                }
                            }
                            i11--;
                        }
                        size = i11 + 1;
                    }
                }
                arrayList.add(size, g2Var);
                z11 = true;
            }
            if (z11) {
                z13 = false;
            } else {
                a(g2Var, true);
            }
            z12 = z11;
        } else {
            z13 = false;
        }
        recyclerView.mViewInfoStore.d(g2Var);
        if (z12 || z13 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        android.support.v4.media.session.a.g(g2Var.itemView);
        g2Var.mBindingAdapter = null;
        g2Var.mOwnerRecyclerView = null;
    }

    public final void l(View view) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f2636h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f2630b == null) {
                this.f2630b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f2630b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(defpackage.e.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f2629a.add(childViewHolderInt);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01df  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0213  */
    /* JADX WARN: Code duplicated, block: B:173:0x030d A[EDGE_INSN: B:173:0x030d->B:174:0x030e BREAK  A[LOOP:5: B:168:0x02f5->B:172:0x030a]] */
    /* JADX WARN: Code duplicated, block: B:205:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:221:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:227:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:229:0x0414  */
    /* JADX WARN: Code duplicated, block: B:231:0x0420  */
    /* JADX WARN: Code duplicated, block: B:236:0x0440  */
    /* JADX WARN: Code duplicated, block: B:239:0x044f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0459  */
    /* JADX WARN: Code duplicated, block: B:242:0x045f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0466  */
    /* JADX WARN: Code duplicated, block: B:248:0x046e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0478  */
    /* JADX WARN: Code duplicated, block: B:253:0x047c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0481  */
    /* JADX WARN: Code duplicated, block: B:256:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x0493  */
    /* JADX WARN: Code duplicated, block: B:262:0x049b  */
    /* JADX WARN: Code duplicated, block: B:266:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:267:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:269:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:270:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:273:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:286:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:36:0x0084 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119 A[EDGE_INSN: B:75:0x0119->B:93:0x018b BREAK  A[LOOP:1: B:43:0x0095->B:56:0x00c1]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x016a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x013b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x014f, please report this as an issue */
    public final g2 m(int i11, long j11) {
        g2 childViewHolderInt;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z12;
        long j12;
        long j13;
        long j14;
        int itemViewType;
        long nanoTime;
        long j15;
        boolean z13;
        Object[] objArr;
        View view;
        i2 i2Var;
        z4.b bVarJ;
        h2 h2Var;
        View.AccessibilityDelegate accessibilityDelegateE;
        long j16;
        ViewGroup.LayoutParams layoutParams;
        n1 n1Var;
        int iF;
        RecyclerView recyclerViewFindNestedRecyclerView;
        g2 g2Var;
        int size;
        int i12;
        ArrayList arrayList3;
        int size2;
        int i13;
        View view2;
        int size3;
        int i14;
        g2 g2Var2;
        f fVar;
        e eVar;
        int iIndexOfChild;
        int iJ;
        g2 childViewHolderInt2;
        int i15;
        boolean z14;
        int size4;
        int iF2;
        RecyclerView recyclerView = this.f2636h;
        if (i11 < 0 || i11 >= recyclerView.mState.b()) {
            StringBuilder sbK = w4.c.k("Invalid item position ", i11, "(", i11, "). Item count:");
            sbK.append(recyclerView.mState.b());
            sbK.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        z4.b bVar = null;
        boolean z15 = true;
        if (recyclerView.mState.f2430g) {
            ArrayList arrayList4 = this.f2630b;
            if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        if (recyclerView.mAdapter.hasStableIds() && (iF2 = recyclerView.mAdapterHelper.f(i11, 0)) > 0 && iF2 < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(iF2);
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size4) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                g2 g2Var3 = (g2) this.f2630b.get(i17);
                                if (!g2Var3.wasReturnedFromScrap() && g2Var3.getItemId() == itemId) {
                                    g2Var3.addFlags(32);
                                    childViewHolderInt = g2Var3;
                                    break;
                                }
                                i17++;
                            }
                        } else {
                            childViewHolderInt = null;
                            break;
                        }
                    } else {
                        childViewHolderInt = (g2) this.f2630b.get(i16);
                        if (!childViewHolderInt.wasReturnedFromScrap() && childViewHolderInt.getLayoutPosition() == i11) {
                            childViewHolderInt.addFlags(32);
                            break;
                        }
                        i16++;
                    }
                }
            } else {
                childViewHolderInt = null;
                break;
            }
            if (childViewHolderInt != null) {
                z11 = true;
            }
            arrayList = this.f2629a;
            arrayList2 = this.f2631c;
            if (childViewHolderInt == null) {
                size = arrayList.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        arrayList3 = recyclerView.mChildHelper.f2449c;
                        size2 = arrayList3.size();
                        i13 = 0;
                        while (true) {
                            if (i13 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i13);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                            if (childViewHolderInt2.getLayoutPosition() != i11 && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                break;
                            }
                            i13++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i14 = 0;
                            while (true) {
                                if (i14 < size3) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                g2Var2 = (g2) arrayList2.get(i14);
                                if (g2Var2.isInvalid() && g2Var2.getLayoutPosition() == i11 && !g2Var2.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i14);
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                            fVar = recyclerView.mChildHelper;
                            eVar = fVar.f2448b;
                            iIndexOfChild = fVar.f2447a.f2652a.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                            }
                            if (eVar.F(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            eVar.C(iIndexOfChild);
                            fVar.k(view2);
                            iJ = recyclerView.mChildHelper.j(view2);
                            if (iJ != -1) {
                                StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb2.append(childViewHolderInt);
                                throw new IllegalStateException(defpackage.e.j(recyclerView, sb2));
                            }
                            recyclerView.mChildHelper.c(iJ);
                            l(view2);
                            childViewHolderInt.addFlags(8224);
                            break;
                        }
                    } else {
                        g2Var2 = (g2) arrayList.get(i12);
                        if (!g2Var2.wasReturnedFromScrap() || g2Var2.getLayoutPosition() != i11 || g2Var2.isInvalid() || (!recyclerView.mState.f2430g && g2Var2.isRemoved())) {
                            i12++;
                        } else {
                            g2Var2.addFlags(32);
                        }
                    }
                    childViewHolderInt = g2Var2;
                    break;
                }
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isRemoved()) {
                        z14 = recyclerView.mState.f2430g;
                    } else {
                        i15 = childViewHolderInt.mPosition;
                        if (i15 >= 0 || i15 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(defpackage.e.j(recyclerView, sb3));
                        }
                        z14 = (recyclerView.mState.f2430g || recyclerView.mAdapter.getItemViewType(childViewHolderInt.mPosition) == childViewHolderInt.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || childViewHolderInt.getItemId() == recyclerView.mAdapter.getItemId(childViewHolderInt.mPosition));
                    }
                    if (z14) {
                        z11 = true;
                    } else {
                        childViewHolderInt.addFlags(4);
                        if (childViewHolderInt.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                            childViewHolderInt.unScrap();
                        } else if (childViewHolderInt.wasReturnedFromScrap()) {
                            childViewHolderInt.clearReturnedFromScrapFlag();
                        }
                        k(childViewHolderInt);
                        childViewHolderInt = null;
                    }
                }
            }
            if (childViewHolderInt == null) {
                j12 = 3;
                iF = recyclerView.mAdapterHelper.f(i11, 0);
                if (iF >= 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                    StringBuilder sbK2 = w4.c.k("Inconsistency detected. Invalid item position ", i11, "(offset:", iF, ").state:");
                    sbK2.append(recyclerView.mState.b());
                    sbK2.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbK2.toString());
                }
                int itemViewType2 = recyclerView.mAdapter.getItemViewType(iF);
                j13 = 4;
                if (recyclerView.mAdapter.hasStableIds()) {
                    long itemId2 = recyclerView.mAdapter.getItemId(iF);
                    int size5 = arrayList.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            z12 = z15;
                            j14 = 0;
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    g2 g2Var4 = (g2) arrayList2.get(size6);
                                    if (g2Var4.getItemId() != itemId2 || g2Var4.isAttachedToTransitionOverlay()) {
                                        size6--;
                                    } else {
                                        if (itemViewType2 == g2Var4.getItemViewType()) {
                                            arrayList2.remove(size6);
                                            childViewHolderInt = g2Var4;
                                            break;
                                        }
                                        i(size6);
                                    }
                                }
                                childViewHolderInt = null;
                                break;
                            }
                        }
                        j14 = 0;
                        g2 g2Var5 = (g2) arrayList.get(size5);
                        if (g2Var5.getItemId() != itemId2 || g2Var5.wasReturnedFromScrap()) {
                            z12 = z15;
                        } else {
                            z12 = z15;
                            if (itemViewType2 == g2Var5.getItemViewType()) {
                                g2Var5.addFlags(32);
                                if (g2Var5.isRemoved() && !recyclerView.mState.f2430g) {
                                    g2Var5.setFlags(2, 14);
                                }
                                childViewHolderInt = g2Var5;
                                break;
                            }
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(g2Var5.itemView, false);
                            g2 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(g2Var5.itemView);
                            childViewHolderInt3.mScrapContainer = null;
                            childViewHolderInt3.mInChangeScrap = false;
                            childViewHolderInt3.clearReturnedFromScrapFlag();
                            k(childViewHolderInt3);
                        }
                        size5--;
                        z15 = z12;
                    }
                    if (childViewHolderInt != null) {
                        childViewHolderInt.mPosition = iF;
                        z11 = z12;
                    }
                } else {
                    z12 = true;
                    j14 = 0;
                }
                if (childViewHolderInt == null) {
                    s1 s1Var = (s1) c().f2618a.get(itemViewType2);
                    if (s1Var == null) {
                        g2Var = null;
                        break;
                    }
                    ArrayList arrayList5 = s1Var.f2606a;
                    if (!arrayList5.isEmpty()) {
                        int size7 = arrayList5.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                g2Var = null;
                                break;
                            }
                            if (!((g2) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                g2Var = (g2) arrayList5.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        g2Var = null;
                        break;
                    }
                    if (g2Var != null) {
                        g2Var.resetInternal();
                        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                            View view3 = g2Var.itemView;
                            if (view3 instanceof ViewGroup) {
                                e((ViewGroup) view3, false);
                            }
                        }
                    }
                    childViewHolderInt = g2Var;
                }
                if (childViewHolderInt == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j11 != Long.MAX_VALUE) {
                        long j17 = this.f2635g.a(itemViewType2).f2608c;
                        if (!((j17 == j14 || j17 + nanoTime2 < j11) ? z12 : false)) {
                            return null;
                        }
                    }
                    g2 g2VarCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(g2VarCreateViewHolder.itemView)) != null) {
                        g2VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    s1 s1VarA = this.f2635g.a(itemViewType2);
                    long j18 = s1VarA.f2608c;
                    if (j18 != j14) {
                        nanoTime3 = (nanoTime3 / 4) + ((j18 / 4) * 3);
                    }
                    s1VarA.f2608c = nanoTime3;
                    childViewHolderInt = g2VarCreateViewHolder;
                }
            } else {
                z12 = true;
                j12 = 3;
                j13 = 4;
                j14 = 0;
            }
            if (z11 && !recyclerView.mState.f2430g && childViewHolderInt.hasAnyOfTheFlags(OSSConstants.DEFAULT_BUFFER_SIZE)) {
                childViewHolderInt.setFlags(0, OSSConstants.DEFAULT_BUFFER_SIZE);
                if (recyclerView.mState.f2433j) {
                    i1.b(childViewHolderInt);
                    i1 i1Var = recyclerView.mItemAnimator;
                    childViewHolderInt.getUnmodifiedPayloads();
                    i1Var.getClass();
                    h1 h1Var = new h1();
                    h1Var.a(childViewHolderInt);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, h1Var);
                }
            }
            if (recyclerView.mState.f2430g || !childViewHolderInt.isBound()) {
                if (childViewHolderInt.isBound() || childViewHolderInt.needsUpdate() || childViewHolderInt.isInvalid()) {
                    int iF3 = recyclerView.mAdapterHelper.f(i11, 0);
                    childViewHolderInt.mBindingAdapter = null;
                    childViewHolderInt.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolderInt.getItemViewType();
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j11 != Long.MAX_VALUE) {
                        j16 = this.f2635g.a(itemViewType).f2609d;
                        if (j16 != j14 || j16 + nanoTime4 < j11) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF3);
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    s1 s1VarA2 = this.f2635g.a(childViewHolderInt.getItemViewType());
                    j15 = s1VarA2.f2609d;
                    if (j15 != j14) {
                        nanoTime = (nanoTime / j13) + ((j15 / j13) * j12);
                    }
                    s1VarA2.f2609d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = childViewHolderInt.itemView;
                        WeakHashMap weakHashMap = z4.s0.f58893a;
                        if (view.getImportantForAccessibility() == 0) {
                            z13 = z12;
                            view.setImportantForAccessibility(z13 ? 1 : 0);
                        } else {
                            z13 = z12;
                        }
                        i2Var = recyclerView.mAccessibilityDelegate;
                        if (i2Var != null) {
                            bVarJ = i2Var.j();
                            if (bVarJ instanceof h2) {
                                h2Var = (h2) bVarJ;
                                accessibilityDelegateE = z4.s0.e(view);
                                if (accessibilityDelegateE != null) {
                                    if (accessibilityDelegateE instanceof z4.a) {
                                        bVar = ((z4.a) accessibilityDelegateE).f58803a;
                                    } else {
                                        bVar = new z4.b(accessibilityDelegateE);
                                    }
                                }
                                if (bVar != null && bVar != h2Var) {
                                    h2Var.f2469e.put(view, bVar);
                                }
                            }
                            z4.s0.q(view, bVarJ);
                        }
                    } else {
                        z13 = z12;
                    }
                    if (recyclerView.mState.f2430g) {
                        childViewHolderInt.mPreLayoutPosition = i11;
                    }
                    objArr = z13 ? 1 : 0;
                }
                layoutParams = childViewHolderInt.itemView.getLayoutParams();
                if (layoutParams == null) {
                    n1Var = (n1) recyclerView.generateDefaultLayoutParams();
                    childViewHolderInt.itemView.setLayoutParams(n1Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    n1Var = (n1) layoutParams;
                } else {
                    n1Var = (n1) recyclerView.generateLayoutParams(layoutParams);
                    childViewHolderInt.itemView.setLayoutParams(n1Var);
                }
                n1Var.f2546a = childViewHolderInt;
                if (z11 || objArr == null) {
                    z13 = false;
                }
                n1Var.f2549d = z13;
                return childViewHolderInt;
            }
            childViewHolderInt.mPreLayoutPosition = i11;
            objArr = null;
            z13 = z12;
            layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                n1Var = (n1) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(n1Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                n1Var = (n1) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(n1Var);
            } else {
                n1Var = (n1) layoutParams;
            }
            n1Var.f2546a = childViewHolderInt;
            if (z11) {
                z13 = false;
            } else {
                z13 = false;
            }
            n1Var.f2549d = z13;
            return childViewHolderInt;
        }
        childViewHolderInt = null;
        z11 = false;
        arrayList = this.f2629a;
        arrayList2 = this.f2631c;
        if (childViewHolderInt == null) {
            size = arrayList.size();
            i12 = 0;
            while (true) {
                if (i12 >= size) {
                    g2Var2 = (g2) arrayList.get(i12);
                    if (g2Var2.wasReturnedFromScrap()) {
                    }
                    i12++;
                } else {
                    arrayList3 = recyclerView.mChildHelper.f2449c;
                    size2 = arrayList3.size();
                    i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList3.get(i13);
                        childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                        if (childViewHolderInt2.getLayoutPosition() != i11) {
                        }
                        i13++;
                    }
                    if (view2 != null) {
                        size3 = arrayList2.size();
                        i14 = 0;
                        while (true) {
                            if (i14 < size3) {
                                childViewHolderInt = null;
                                break;
                            }
                            g2Var2 = (g2) arrayList2.get(i14);
                            if (g2Var2.isInvalid()) {
                            }
                            i14++;
                        }
                    } else {
                        childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                        fVar = recyclerView.mChildHelper;
                        eVar = fVar.f2448b;
                        iIndexOfChild = fVar.f2447a.f2652a.indexOfChild(view2);
                        if (iIndexOfChild >= 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                        }
                        if (eVar.F(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        eVar.C(iIndexOfChild);
                        fVar.k(view2);
                        iJ = recyclerView.mChildHelper.j(view2);
                        if (iJ != -1) {
                            StringBuilder sb4 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb4.append(childViewHolderInt);
                            throw new IllegalStateException(defpackage.e.j(recyclerView, sb4));
                        }
                        recyclerView.mChildHelper.c(iJ);
                        l(view2);
                        childViewHolderInt.addFlags(8224);
                        break;
                    }
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isRemoved()) {
                            i15 = childViewHolderInt.mPosition;
                            if (i15 >= 0) {
                            }
                            StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(defpackage.e.j(recyclerView, sb5));
                        }
                        z14 = recyclerView.mState.f2430g;
                        if (z14) {
                            childViewHolderInt.addFlags(4);
                            if (childViewHolderInt.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                                childViewHolderInt.unScrap();
                            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                                childViewHolderInt.clearReturnedFromScrapFlag();
                            }
                            k(childViewHolderInt);
                            childViewHolderInt = null;
                        } else {
                            z11 = true;
                        }
                    }
                }
                childViewHolderInt = g2Var2;
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isRemoved()) {
                        i15 = childViewHolderInt.mPosition;
                        if (i15 >= 0) {
                        }
                        StringBuilder sb6 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb6.append(childViewHolderInt);
                        throw new IndexOutOfBoundsException(defpackage.e.j(recyclerView, sb6));
                    }
                    z14 = recyclerView.mState.f2430g;
                    if (z14) {
                        childViewHolderInt.addFlags(4);
                        if (childViewHolderInt.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                            childViewHolderInt.unScrap();
                        } else if (childViewHolderInt.wasReturnedFromScrap()) {
                            childViewHolderInt.clearReturnedFromScrapFlag();
                        }
                        k(childViewHolderInt);
                        childViewHolderInt = null;
                    } else {
                        z11 = true;
                    }
                }
            }
        }
        if (childViewHolderInt == null) {
            j12 = 3;
            iF = recyclerView.mAdapterHelper.f(i11, 0);
            if (iF >= 0) {
            }
            StringBuilder sbK3 = w4.c.k("Inconsistency detected. Invalid item position ", i11, "(offset:", iF, ").state:");
            sbK3.append(recyclerView.mState.b());
            sbK3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbK3.toString());
        }
        z12 = true;
        j12 = 3;
        j13 = 4;
        j14 = 0;
        if (z11) {
            childViewHolderInt.setFlags(0, OSSConstants.DEFAULT_BUFFER_SIZE);
            if (recyclerView.mState.f2433j) {
                i1.b(childViewHolderInt);
                i1 i1Var2 = recyclerView.mItemAnimator;
                childViewHolderInt.getUnmodifiedPayloads();
                i1Var2.getClass();
                h1 h1Var2 = new h1();
                h1Var2.a(childViewHolderInt);
                recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, h1Var2);
            }
        }
        if (recyclerView.mState.f2430g) {
            if (childViewHolderInt.isBound()) {
                int iF4 = recyclerView.mAdapterHelper.f(i11, 0);
                childViewHolderInt.mBindingAdapter = null;
                childViewHolderInt.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime5 = recyclerView.getNanoTime();
                if (j11 != Long.MAX_VALUE) {
                    j16 = this.f2635g.a(itemViewType).f2609d;
                    if (j16 != j14) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF4);
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                s1 s1VarA3 = this.f2635g.a(childViewHolderInt.getItemViewType());
                j15 = s1VarA3.f2609d;
                if (j15 != j14) {
                    nanoTime = (nanoTime / j13) + ((j15 / j13) * j12);
                }
                s1VarA3.f2609d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap weakHashMap2 = z4.s0.f58893a;
                    if (view.getImportantForAccessibility() == 0) {
                        z13 = z12;
                        view.setImportantForAccessibility(z13 ? 1 : 0);
                    } else {
                        z13 = z12;
                    }
                    i2Var = recyclerView.mAccessibilityDelegate;
                    if (i2Var != null) {
                        bVarJ = i2Var.j();
                        if (bVarJ instanceof h2) {
                            h2Var = (h2) bVarJ;
                            accessibilityDelegateE = z4.s0.e(view);
                            if (accessibilityDelegateE != null) {
                                if (accessibilityDelegateE instanceof z4.a) {
                                    bVar = ((z4.a) accessibilityDelegateE).f58803a;
                                } else {
                                    bVar = new z4.b(accessibilityDelegateE);
                                }
                            }
                            if (bVar != null) {
                                h2Var.f2469e.put(view, bVar);
                            }
                        }
                        z4.s0.q(view, bVarJ);
                    }
                } else {
                    z13 = z12;
                }
                if (recyclerView.mState.f2430g) {
                    childViewHolderInt.mPreLayoutPosition = i11;
                }
                objArr = z13 ? 1 : 0;
            } else {
                int iF5 = recyclerView.mAdapterHelper.f(i11, 0);
                childViewHolderInt.mBindingAdapter = null;
                childViewHolderInt.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime6 = recyclerView.getNanoTime();
                if (j11 != Long.MAX_VALUE) {
                    j16 = this.f2635g.a(itemViewType).f2609d;
                    if (j16 != j14) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF5);
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                s1 s1VarA4 = this.f2635g.a(childViewHolderInt.getItemViewType());
                j15 = s1VarA4.f2609d;
                if (j15 != j14) {
                    nanoTime = (nanoTime / j13) + ((j15 / j13) * j12);
                }
                s1VarA4.f2609d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap weakHashMap3 = z4.s0.f58893a;
                    if (view.getImportantForAccessibility() == 0) {
                        z13 = z12;
                        view.setImportantForAccessibility(z13 ? 1 : 0);
                    } else {
                        z13 = z12;
                    }
                    i2Var = recyclerView.mAccessibilityDelegate;
                    if (i2Var != null) {
                        bVarJ = i2Var.j();
                        if (bVarJ instanceof h2) {
                            h2Var = (h2) bVarJ;
                            accessibilityDelegateE = z4.s0.e(view);
                            if (accessibilityDelegateE != null) {
                                if (accessibilityDelegateE instanceof z4.a) {
                                    bVar = ((z4.a) accessibilityDelegateE).f58803a;
                                } else {
                                    bVar = new z4.b(accessibilityDelegateE);
                                }
                            }
                            if (bVar != null) {
                                h2Var.f2469e.put(view, bVar);
                            }
                        }
                        z4.s0.q(view, bVarJ);
                    }
                } else {
                    z13 = z12;
                }
                if (recyclerView.mState.f2430g) {
                    childViewHolderInt.mPreLayoutPosition = i11;
                }
                objArr = z13 ? 1 : 0;
            }
        } else if (childViewHolderInt.isBound()) {
            int iF6 = recyclerView.mAdapterHelper.f(i11, 0);
            childViewHolderInt.mBindingAdapter = null;
            childViewHolderInt.mOwnerRecyclerView = recyclerView;
            itemViewType = childViewHolderInt.getItemViewType();
            long nanoTime7 = recyclerView.getNanoTime();
            if (j11 != Long.MAX_VALUE) {
                j16 = this.f2635g.a(itemViewType).f2609d;
                if (j16 != j14) {
                }
            }
            recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF6);
            nanoTime = recyclerView.getNanoTime() - nanoTime7;
            s1 s1VarA5 = this.f2635g.a(childViewHolderInt.getItemViewType());
            j15 = s1VarA5.f2609d;
            if (j15 != j14) {
                nanoTime = (nanoTime / j13) + ((j15 / j13) * j12);
            }
            s1VarA5.f2609d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = childViewHolderInt.itemView;
                WeakHashMap weakHashMap4 = z4.s0.f58893a;
                if (view.getImportantForAccessibility() == 0) {
                    z13 = z12;
                    view.setImportantForAccessibility(z13 ? 1 : 0);
                } else {
                    z13 = z12;
                }
                i2Var = recyclerView.mAccessibilityDelegate;
                if (i2Var != null) {
                    bVarJ = i2Var.j();
                    if (bVarJ instanceof h2) {
                        h2Var = (h2) bVarJ;
                        accessibilityDelegateE = z4.s0.e(view);
                        if (accessibilityDelegateE != null) {
                            if (accessibilityDelegateE instanceof z4.a) {
                                bVar = ((z4.a) accessibilityDelegateE).f58803a;
                            } else {
                                bVar = new z4.b(accessibilityDelegateE);
                            }
                        }
                        if (bVar != null) {
                            h2Var.f2469e.put(view, bVar);
                        }
                    }
                    z4.s0.q(view, bVarJ);
                }
            } else {
                z13 = z12;
            }
            if (recyclerView.mState.f2430g) {
                childViewHolderInt.mPreLayoutPosition = i11;
            }
            objArr = z13 ? 1 : 0;
        } else {
            int iF7 = recyclerView.mAdapterHelper.f(i11, 0);
            childViewHolderInt.mBindingAdapter = null;
            childViewHolderInt.mOwnerRecyclerView = recyclerView;
            itemViewType = childViewHolderInt.getItemViewType();
            long nanoTime8 = recyclerView.getNanoTime();
            if (j11 != Long.MAX_VALUE) {
                j16 = this.f2635g.a(itemViewType).f2609d;
                if (j16 != j14) {
                }
            }
            recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iF7);
            nanoTime = recyclerView.getNanoTime() - nanoTime8;
            s1 s1VarA6 = this.f2635g.a(childViewHolderInt.getItemViewType());
            j15 = s1VarA6.f2609d;
            if (j15 != j14) {
                nanoTime = (nanoTime / j13) + ((j15 / j13) * j12);
            }
            s1VarA6.f2609d = nanoTime;
            if (recyclerView.isAccessibilityEnabled()) {
                view = childViewHolderInt.itemView;
                WeakHashMap weakHashMap5 = z4.s0.f58893a;
                if (view.getImportantForAccessibility() == 0) {
                    z13 = z12;
                    view.setImportantForAccessibility(z13 ? 1 : 0);
                } else {
                    z13 = z12;
                }
                i2Var = recyclerView.mAccessibilityDelegate;
                if (i2Var != null) {
                    bVarJ = i2Var.j();
                    if (bVarJ instanceof h2) {
                        h2Var = (h2) bVarJ;
                        accessibilityDelegateE = z4.s0.e(view);
                        if (accessibilityDelegateE != null) {
                            if (accessibilityDelegateE instanceof z4.a) {
                                bVar = ((z4.a) accessibilityDelegateE).f58803a;
                            } else {
                                bVar = new z4.b(accessibilityDelegateE);
                            }
                        }
                        if (bVar != null) {
                            h2Var.f2469e.put(view, bVar);
                        }
                    }
                    z4.s0.q(view, bVarJ);
                }
            } else {
                z13 = z12;
            }
            if (recyclerView.mState.f2430g) {
                childViewHolderInt.mPreLayoutPosition = i11;
            }
            objArr = z13 ? 1 : 0;
        }
        layoutParams = childViewHolderInt.itemView.getLayoutParams();
        if (layoutParams == null) {
            n1Var = (n1) recyclerView.generateDefaultLayoutParams();
            childViewHolderInt.itemView.setLayoutParams(n1Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            n1Var = (n1) recyclerView.generateLayoutParams(layoutParams);
            childViewHolderInt.itemView.setLayoutParams(n1Var);
        } else {
            n1Var = (n1) layoutParams;
        }
        n1Var.f2546a = childViewHolderInt;
        if (z11) {
            z13 = false;
        } else {
            z13 = false;
        }
        n1Var.f2549d = z13;
        return childViewHolderInt;
    }

    public final void n(g2 g2Var) {
        if (g2Var.mInChangeScrap) {
            this.f2630b.remove(g2Var);
        } else {
            this.f2629a.remove(g2Var);
        }
        g2Var.mScrapContainer = null;
        g2Var.mInChangeScrap = false;
        g2Var.clearReturnedFromScrapFlag();
    }

    public final void o() {
        m1 m1Var = this.f2636h.mLayout;
        this.f2634f = this.f2633e + (m1Var != null ? m1Var.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f2631c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2634f; size--) {
            i(size);
        }
    }
}
