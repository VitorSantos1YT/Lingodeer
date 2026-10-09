package mw;

import a.ar.MFeWs;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f42702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f42703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w4 f42705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42707h;

    public final t4 a(w4 w4Var) {
        Collection collectionUnmodifiableCollection;
        Preconditions.p("hedging frozen", !this.f42707h);
        Preconditions.p("already committed", this.f42705f == null);
        Collection collection = this.f42703d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(w4Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(w4Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new t4(this.f42701b, this.f42702c, collectionUnmodifiableCollection, this.f42705f, this.f42706g, this.f42700a, this.f42707h, this.f42704e + 1);
    }

    public final t4 b(w4 w4Var) {
        ArrayList arrayList = new ArrayList(this.f42703d);
        arrayList.remove(w4Var);
        return new t4(this.f42701b, this.f42702c, Collections.unmodifiableCollection(arrayList), this.f42705f, this.f42706g, this.f42700a, this.f42707h, this.f42704e);
    }

    public final t4 c(w4 w4Var, w4 w4Var2) {
        ArrayList arrayList = new ArrayList(this.f42703d);
        arrayList.remove(w4Var);
        arrayList.add(w4Var2);
        return new t4(this.f42701b, this.f42702c, Collections.unmodifiableCollection(arrayList), this.f42705f, this.f42706g, this.f42700a, this.f42707h, this.f42704e);
    }

    public final t4 d(w4 w4Var) {
        w4Var.f42778b = true;
        Collection collection = this.f42702c;
        if (!collection.contains(w4Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(w4Var);
        return new t4(this.f42701b, Collections.unmodifiableCollection(arrayList), this.f42703d, this.f42705f, this.f42706g, this.f42700a, this.f42707h, this.f42704e);
    }

    public final t4 e(w4 w4Var) {
        List list;
        Preconditions.p("Already passThrough", !this.f42700a);
        boolean z11 = w4Var.f42778b;
        Collection collectionUnmodifiableCollection = this.f42702c;
        if (!z11) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(w4Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(w4Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        w4 w4Var2 = this.f42705f;
        boolean z12 = w4Var2 != null;
        if (z12) {
            Preconditions.p("Another RPC attempt has already committed", w4Var2 == w4Var);
            list = null;
        } else {
            list = this.f42701b;
        }
        return new t4(list, collection, this.f42703d, this.f42705f, this.f42706g, z12, this.f42707h, this.f42704e);
    }

    public t4(List list, Collection collection, Collection collection2, w4 w4Var, boolean z11, boolean z12, boolean z13, int i11) {
        boolean z14;
        boolean z15;
        boolean z16;
        this.f42701b = list;
        Preconditions.k(collection, "drainedSubstreams");
        this.f42702c = collection;
        this.f42705f = w4Var;
        this.f42703d = collection2;
        this.f42706g = z11;
        this.f42700a = z12;
        this.f42707h = z13;
        this.f42704e = i11;
        if (z12 && list != null) {
            z14 = false;
        } else {
            z14 = true;
        }
        Preconditions.p("passThrough should imply buffer is null", z14);
        if (z12 && w4Var == null) {
            z15 = false;
        } else {
            z15 = true;
        }
        Preconditions.p("passThrough should imply winningSubstream != null", z15);
        if (z12 && ((collection.size() != 1 || !collection.contains(w4Var)) && (collection.size() != 0 || !w4Var.f42778b))) {
            z16 = false;
        } else {
            z16 = true;
        }
        Preconditions.p("passThrough should imply winningSubstream is drained", z16);
        Preconditions.p(MFeWs.OCUjN, (z11 && w4Var == null) ? false : true);
    }
}
