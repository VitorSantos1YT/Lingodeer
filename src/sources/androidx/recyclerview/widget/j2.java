package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2490a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f2491b;

    public j2(k2 k2Var) {
        this.f2491b = k2Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        if (i11 == 0 && this.f2490a) {
            this.f2490a = false;
            this.f2491b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return;
        }
        this.f2490a = true;
    }
}
