package e5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.widget.RemoteViews;
import hh.p0;
import java.io.Serializable;
import java.util.ArrayList;
import z2.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f24858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24859d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f24858c = jArr;
        this.f24859d = remoteViewsArr;
        this.f24857b = false;
        this.f24856a = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = ry.m.j0(arrayList).size();
        if (size > 1) {
            throw new IllegalArgumentException(p0.h(size, "View type count is set to 1, but the collection contains ", " different layout ids").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public l(Parcel parcel) {
        kotlin.jvm.internal.m.f(parcel, "parcel");
        int i11 = parcel.readInt();
        ?? r9 = new long[i11];
        this.f24858c = r9;
        parcel.readLongArray(r9);
        Parcelable.Creator CREATOR = RemoteViews.CREATOR;
        kotlin.jvm.internal.m.e(CREATOR, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[i11];
        parcel.readTypedArray(remoteViewsArr, CREATOR);
        for (int i12 = 0; i12 < i11; i12++) {
            if (remoteViewsArr[i12] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f24859d = remoteViewsArr;
        this.f24857b = parcel.readInt() == 1;
        this.f24856a = parcel.readInt();
    }

    public l(Context context, z2.o oVar) {
        this.f24858c = oVar;
        this.f24856a = 0;
        this.f24859d = new GestureDetector(context, new o1(this));
    }
}
