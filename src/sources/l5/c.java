package l5;

import a5.g;
import android.graphics.Rect;
import ay.k0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f39742a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f39743b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f39745d;

    public c(boolean z11, k0 k0Var) {
        this.f39744c = z11;
        this.f39745d = k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f39745d.getClass();
        Rect rect = this.f39742a;
        ((g) obj).f(rect);
        Rect rect2 = this.f39743b;
        ((g) obj2).f(rect2);
        int i11 = rect.top;
        int i12 = rect2.top;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = rect.left;
        int i14 = rect2.left;
        boolean z11 = this.f39744c;
        if (i13 < i14) {
            return z11 ? 1 : -1;
        }
        if (i13 > i14) {
            return z11 ? -1 : 1;
        }
        int i15 = rect.bottom;
        int i16 = rect2.bottom;
        if (i15 < i16) {
            return -1;
        }
        if (i15 > i16) {
            return 1;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if (i17 < i18) {
            return z11 ? 1 : -1;
        }
        if (i17 > i18) {
            return z11 ? -1 : 1;
        }
        return 0;
    }
}
