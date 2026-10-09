package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2467b;

    public final void a(g2 g2Var) {
        View view = g2Var.itemView;
        this.f2466a = view.getLeft();
        this.f2467b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
