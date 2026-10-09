package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2417a;

    @Override // androidx.recyclerview.widget.s0
    public void onChanged(int i11, int i12, Object obj) {
        ((b1) this.f2417a).notifyItemRangeChanged(i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onInserted(int i11, int i12) {
        ((b1) this.f2417a).notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onMoved(int i11, int i12) {
        ((b1) this.f2417a).notifyItemMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onRemoved(int i11, int i12) {
        ((b1) this.f2417a).notifyItemRangeRemoved(i11, i12);
    }
}
