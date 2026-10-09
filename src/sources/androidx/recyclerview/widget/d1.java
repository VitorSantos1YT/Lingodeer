package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public abstract void onChanged();

    public void onItemRangeChanged(int i11, int i12) {
    }

    public void onItemRangeChanged(int i11, int i12, Object obj) {
        onItemRangeChanged(i11, i12);
    }

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeInserted(int i11, int i12) {
    }

    public void onItemRangeRemoved(int i11, int i12) {
    }

    public void onItemRangeMoved(int i11, int i12, int i13) {
    }
}
