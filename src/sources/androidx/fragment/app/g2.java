package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1670e;

    public g2(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1666a = i11;
        this.f1667b = arrayList;
        this.f1668c = arrayList2;
        this.f1669d = arrayList3;
        this.f1670e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i11 = 0; i11 < this.f1666a; i11++) {
            View view = (View) this.f1667b.get(i11);
            String str = (String) this.f1668c.get(i11);
            WeakHashMap weakHashMap = z4.s0.f58893a;
            z4.j0.n(view, str);
            z4.j0.n((View) this.f1669d.get(i11), (String) this.f1670e.get(i11));
        }
    }
}
