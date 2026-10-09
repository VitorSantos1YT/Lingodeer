package c5;

import hh.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.view.insets.a f6601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6603d;

    public a(androidx.core.view.insets.a aVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f6600a = arrayList2;
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
        ArrayList arrayList3 = aVar.f1416b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw p0.e(size, arrayList2);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw p0.e(size2, arrayList2);
            }
        }
        this.f6601b = aVar;
    }
}
