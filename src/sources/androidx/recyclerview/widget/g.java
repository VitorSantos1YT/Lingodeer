package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2459c;

    public /* synthetic */ g(m mVar, ArrayList arrayList, int i11) {
        this.f2457a = i11;
        this.f2459c = mVar;
        this.f2458b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2457a) {
            case 0:
                ArrayList arrayList = this.f2458b;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    m mVar = this.f2459c;
                    if (i11 >= size) {
                        arrayList.clear();
                        mVar.m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i11);
                        i11++;
                        l lVar = (l) obj;
                        g2 g2Var = lVar.f2501a;
                        int i12 = lVar.f2502b;
                        int i13 = lVar.f2503c;
                        int i14 = lVar.f2504d;
                        int i15 = lVar.f2505e;
                        mVar.getClass();
                        View view = g2Var.itemView;
                        int i16 = i14 - i12;
                        int i17 = i15 - i13;
                        if (i16 != 0) {
                            view.animate().translationX(CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                        if (i17 != 0) {
                            view.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        mVar.f2531p.add(g2Var);
                        viewPropertyAnimatorAnimate.setDuration(mVar.f2481e).setListener(new i(mVar, g2Var, i16, view, i17, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f2458b;
                int size2 = arrayList2.size();
                int i18 = 0;
                while (true) {
                    m mVar2 = this.f2459c;
                    if (i18 >= size2) {
                        arrayList2.clear();
                        mVar2.f2529n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i18);
                        i18++;
                        k kVar = (k) obj2;
                        ArrayList arrayList3 = mVar2.f2533r;
                        long j11 = mVar2.f2482f;
                        g2 g2Var2 = kVar.f2492a;
                        View view2 = g2Var2 == null ? null : g2Var2.itemView;
                        g2 g2Var3 = kVar.f2493b;
                        View view3 = g2Var3 != null ? g2Var3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j11);
                            arrayList3.add(kVar.f2492a);
                            duration.translationX(kVar.f2496e - kVar.f2494c);
                            duration.translationY(kVar.f2497f - kVar.f2495d);
                            duration.alpha(CropImageView.DEFAULT_ASPECT_RATIO).setListener(new j(mVar2, kVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(kVar.f2493b);
                            viewPropertyAnimatorAnimate2.translationX(CropImageView.DEFAULT_ASPECT_RATIO).translationY(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11).alpha(1.0f).setListener(new j(mVar2, kVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f2458b;
                int size3 = arrayList4.size();
                int i19 = 0;
                while (true) {
                    m mVar3 = this.f2459c;
                    if (i19 >= size3) {
                        arrayList4.clear();
                        mVar3.f2528l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i19);
                        i19++;
                        g2 g2Var4 = (g2) obj3;
                        mVar3.getClass();
                        View view4 = g2Var4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        mVar3.f2530o.add(g2Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(mVar3.f2479c).setListener(new h(mVar3, g2Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
