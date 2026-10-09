package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f2567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2568l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f2567k.size();
        View view2 = null;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            View view3 = ((g2) this.f2567k.get(i12)).itemView;
            n1 n1Var = (n1) view3.getLayoutParams();
            if (view3 != view && !n1Var.f2546a.isRemoved() && (layoutPosition = (n1Var.f2546a.getLayoutPosition() - this.f2560d) * this.f2561e) >= 0 && layoutPosition < i11) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i11 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f2560d = -1;
        } else {
            this.f2560d = ((n1) view2.getLayoutParams()).f2546a.getLayoutPosition();
        }
    }

    public final View b(u1 u1Var) {
        List list = this.f2567k;
        if (list == null) {
            View viewD = u1Var.d(this.f2560d);
            this.f2560d += this.f2561e;
            return viewD;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = ((g2) this.f2567k.get(i11)).itemView;
            n1 n1Var = (n1) view.getLayoutParams();
            if (!n1Var.f2546a.isRemoved() && this.f2560d == n1Var.f2546a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
