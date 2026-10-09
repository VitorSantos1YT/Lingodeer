package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f2477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2482f;

    public static void b(g2 g2Var) {
        int i11 = g2Var.mFlags;
        if (!g2Var.isInvalid() && (i11 & 4) == 0) {
            g2Var.getOldPosition();
            g2Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(g2 g2Var, g2 g2Var2, h1 h1Var, h1 h1Var2);

    public final void c(g2 g2Var) {
        g1 g1Var = this.f2477a;
        if (g1Var != null) {
            RecyclerView recyclerView = ((y0) g1Var).f2652a;
            g2Var.setIsRecyclable(true);
            if (g2Var.mShadowedHolder != null && g2Var.mShadowingHolder == null) {
                g2Var.mShadowedHolder = null;
            }
            g2Var.mShadowingHolder = null;
            if (g2Var.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(g2Var.itemView) || !g2Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(g2Var.itemView, false);
        }
    }

    public abstract void d(g2 g2Var);

    public abstract void e();

    public abstract boolean f();
}
