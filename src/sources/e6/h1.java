package e6;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f24929d = new h1(new long[0], new RemoteViews[0], 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f24930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteViews[] f24931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24932c;

    public h1(long[] jArr, RemoteViews[] remoteViewsArr, int i11) {
        this.f24930a = jArr;
        this.f24931b = remoteViewsArr;
        this.f24932c = i11;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = ry.m.j0(arrayList).size();
        if (size <= this.f24932c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f24932c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
