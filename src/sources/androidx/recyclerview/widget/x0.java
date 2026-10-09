package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2650b;

    public /* synthetic */ x0(int i11, RecyclerView recyclerView) {
        this.f2649a = i11;
        this.f2650b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        int i11 = this.f2649a;
        RecyclerView recyclerView = this.f2650b;
        switch (i11) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.mLayoutSuppressed) {
                        recyclerView.consumePendingUpdateOperations();
                    } else {
                        recyclerView.mLayoutWasDefered = true;
                    }
                    break;
                }
                break;
            default:
                i1 i1Var = recyclerView.mItemAnimator;
                if (i1Var != null) {
                    m mVar = (m) i1Var;
                    long j11 = mVar.f2480d;
                    ArrayList arrayList = mVar.f2524h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = mVar.f2526j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = mVar.f2527k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = mVar.f2525i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            int i13 = i12 + 1;
                            g2 g2Var = (g2) obj;
                            View view = g2Var.itemView;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            mVar.f2532q.add(g2Var);
                            viewPropertyAnimatorAnimate.setDuration(j11).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setListener(new h(mVar, g2Var, viewPropertyAnimatorAnimate, view)).start();
                            i12 = i13;
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z12 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            mVar.m.add(arrayList5);
                            arrayList2.clear();
                            g gVar = new g(mVar, arrayList5, 0);
                            if (z12) {
                                gVar.run();
                            } else {
                                View view2 = ((l) arrayList5.get(0)).f2501a.itemView;
                                WeakHashMap weakHashMap = z4.s0.f58893a;
                                view2.postOnAnimationDelayed(gVar, j11);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            mVar.f2529n.add(arrayList6);
                            arrayList3.clear();
                            g gVar2 = new g(mVar, arrayList6, 1);
                            if (z12) {
                                gVar2.run();
                            } else {
                                View view3 = ((k) arrayList6.get(0)).f2492a.itemView;
                                WeakHashMap weakHashMap2 = z4.s0.f58893a;
                                view3.postOnAnimationDelayed(gVar2, j11);
                            }
                        }
                        if (zIsEmpty4) {
                            z11 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            mVar.f2528l.add(arrayList7);
                            arrayList4.clear();
                            g gVar3 = new g(mVar, arrayList7, 2);
                            if (z12 && zIsEmpty2 && zIsEmpty3) {
                                gVar3.run();
                                z11 = false;
                            } else {
                                if (z12) {
                                    j11 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? mVar.f2481e : 0L, zIsEmpty3 ? 0L : mVar.f2482f) + j11;
                                z11 = false;
                                View view4 = ((g2) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = z4.s0.f58893a;
                                view4.postOnAnimationDelayed(gVar3, jMax);
                            }
                        }
                    }
                } else {
                    z11 = false;
                }
                recyclerView.mPostedAnimatorRunner = z11;
                break;
        }
    }
}
