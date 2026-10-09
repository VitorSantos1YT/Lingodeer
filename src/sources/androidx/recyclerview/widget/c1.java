package androidx.recyclerview.widget;

import android.database.Observable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void c(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i11, i12, 1);
        }
    }

    public final void d(int i11, int i12, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i11, i12, obj);
        }
    }

    public final void e(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i11, i12);
        }
    }

    public final void f(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i11, i12);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((d1) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
