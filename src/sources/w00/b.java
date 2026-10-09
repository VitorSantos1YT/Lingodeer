package w00;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f54370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f54374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f54375g;

    public b(ArrayList arrayList, char c11, boolean z11, boolean z12, b bVar) {
        this.f54369a = arrayList;
        this.f54370b = c11;
        this.f54372d = z11;
        this.f54373e = z12;
        this.f54374f = bVar;
        this.f54371c = arrayList.size();
    }

    public final List a(int i11) {
        ArrayList arrayList = this.f54369a;
        if (i11 < 1 || i11 > arrayList.size()) {
            throw new IllegalArgumentException(nv.p.p("length must be between 1 and ", arrayList.size(), i11, ", was "));
        }
        return arrayList.subList(0, i11);
    }

    public final List b(int i11) {
        ArrayList arrayList = this.f54369a;
        if (i11 < 1 || i11 > arrayList.size()) {
            throw new IllegalArgumentException(nv.p.p("length must be between 1 and ", arrayList.size(), i11, ", was "));
        }
        return arrayList.subList(arrayList.size() - i11, arrayList.size());
    }
}
