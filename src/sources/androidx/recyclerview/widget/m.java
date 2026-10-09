package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2522s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f2524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f2525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f2526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f2528l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f2531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f2533r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g2) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.i1
    public final boolean a(g2 g2Var, g2 g2Var2, h1 h1Var, h1 h1Var2) {
        int i11;
        int i12;
        int i13 = h1Var.f2466a;
        int i14 = h1Var.f2467b;
        if (g2Var2.shouldIgnore()) {
            int i15 = h1Var.f2466a;
            i12 = h1Var.f2467b;
            i11 = i15;
        } else {
            i11 = h1Var2.f2466a;
            i12 = h1Var2.f2467b;
        }
        if (g2Var == g2Var2) {
            return g(g2Var, i13, i14, i11, i12);
        }
        float translationX = g2Var.itemView.getTranslationX();
        float translationY = g2Var.itemView.getTranslationY();
        float alpha = g2Var.itemView.getAlpha();
        l(g2Var);
        g2Var.itemView.setTranslationX(translationX);
        g2Var.itemView.setTranslationY(translationY);
        g2Var.itemView.setAlpha(alpha);
        l(g2Var2);
        g2Var2.itemView.setTranslationX(-((int) ((i11 - i13) - translationX)));
        g2Var2.itemView.setTranslationY(-((int) ((i12 - i14) - translationY)));
        g2Var2.itemView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        ArrayList arrayList = this.f2527k;
        k kVar = new k();
        kVar.f2492a = g2Var;
        kVar.f2493b = g2Var2;
        kVar.f2494c = i13;
        kVar.f2495d = i14;
        kVar.f2496e = i11;
        kVar.f2497f = i12;
        arrayList.add(kVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.i1
    public final void d(g2 g2Var) {
        ArrayList arrayList = this.f2528l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.f2529n;
        View view = g2Var.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f2526j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((l) arrayList4.get(size)).f2501a == g2Var) {
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                c(g2Var);
                arrayList4.remove(size);
            }
        }
        j(this.f2527k, g2Var);
        if (this.f2524h.remove(g2Var)) {
            view.setAlpha(1.0f);
            c(g2Var);
        }
        if (this.f2525i.remove(g2Var)) {
            view.setAlpha(1.0f);
            c(g2Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, g2Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((l) arrayList6.get(size4)).f2501a == g2Var) {
                    view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                    c(g2Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(g2Var)) {
                view.setAlpha(1.0f);
                c(g2Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f2532q.remove(g2Var);
        this.f2530o.remove(g2Var);
        this.f2533r.remove(g2Var);
        this.f2531p.remove(g2Var);
        i();
    }

    @Override // androidx.recyclerview.widget.i1
    public final void e() {
        ArrayList arrayList = this.f2529n;
        ArrayList arrayList2 = this.f2528l;
        ArrayList arrayList3 = this.m;
        ArrayList arrayList4 = this.f2527k;
        ArrayList arrayList5 = this.f2525i;
        ArrayList arrayList6 = this.f2524h;
        ArrayList arrayList7 = this.f2526j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            l lVar = (l) arrayList7.get(size);
            View view = lVar.f2501a.itemView;
            view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
            c(lVar.f2501a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((g2) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g2 g2Var = (g2) arrayList5.get(size3);
            g2Var.itemView.setAlpha(1.0f);
            c(g2Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            k kVar = (k) arrayList4.get(size4);
            g2 g2Var2 = kVar.f2492a;
            if (g2Var2 != null) {
                k(kVar, g2Var2);
            }
            g2 g2Var3 = kVar.f2493b;
            if (g2Var3 != null) {
                k(kVar, g2Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    l lVar2 = (l) arrayList8.get(size6);
                    View view2 = lVar2.f2501a.itemView;
                    view2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    view2.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                    c(lVar2.f2501a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    g2 g2Var4 = (g2) arrayList9.get(size8);
                    g2Var4.itemView.setAlpha(1.0f);
                    c(g2Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    k kVar2 = (k) arrayList10.get(size10);
                    g2 g2Var5 = kVar2.f2492a;
                    if (g2Var5 != null) {
                        k(kVar2, g2Var5);
                    }
                    g2 g2Var6 = kVar2.f2493b;
                    if (g2Var6 != null) {
                        k(kVar2, g2Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f2532q);
            h(this.f2531p);
            h(this.f2530o);
            h(this.f2533r);
            ArrayList arrayList11 = this.f2478b;
            if (arrayList11.size() > 0) {
                throw hh.p0.e(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.i1
    public final boolean f() {
        return (this.f2525i.isEmpty() && this.f2527k.isEmpty() && this.f2526j.isEmpty() && this.f2524h.isEmpty() && this.f2531p.isEmpty() && this.f2532q.isEmpty() && this.f2530o.isEmpty() && this.f2533r.isEmpty() && this.m.isEmpty() && this.f2528l.isEmpty() && this.f2529n.isEmpty()) ? false : true;
    }

    public final boolean g(g2 g2Var, int i11, int i12, int i13, int i14) {
        View view = g2Var.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) g2Var.itemView.getTranslationY());
        l(g2Var);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            c(g2Var);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        ArrayList arrayList = this.f2526j;
        l lVar = new l();
        lVar.f2501a = g2Var;
        lVar.f2502b = translationX;
        lVar.f2503c = translationY;
        lVar.f2504d = i13;
        lVar.f2505e = i14;
        arrayList.add(lVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2478b;
        if (arrayList.size() > 0) {
            throw hh.p0.e(0, arrayList);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, g2 g2Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k kVar = (k) arrayList.get(size);
            if (k(kVar, g2Var) && kVar.f2492a == null && kVar.f2493b == null) {
                arrayList.remove(kVar);
            }
        }
    }

    public final boolean k(k kVar, g2 g2Var) {
        if (kVar.f2493b == g2Var) {
            kVar.f2493b = null;
        } else {
            if (kVar.f2492a != g2Var) {
                return false;
            }
            kVar.f2492a = null;
        }
        g2Var.itemView.setAlpha(1.0f);
        g2Var.itemView.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        g2Var.itemView.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        c(g2Var);
        return true;
    }

    public final void l(g2 g2Var) {
        if (f2522s == null) {
            f2522s = new ValueAnimator().getInterpolator();
        }
        g2Var.itemView.animate().setInterpolator(f2522s);
        d(g2Var);
    }
}
