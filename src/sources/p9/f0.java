package p9;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i2 {
    public final e0 H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f46660f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h2 f46661t;

    public f0(RecyclerView recyclerView) {
        super(recyclerView);
        this.f46661t = this.f2484e;
        this.H = new e0(this, 0);
        this.f46660f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.i2
    public final z4.b j() {
        return this.H;
    }
}
