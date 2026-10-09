package e6;

import android.content.ComponentName;
import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f25081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f25084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f25085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f25086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f25088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25089l;
    public final Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ComponentName f25090n;

    public x1(Context context, int i11, boolean z11, w0 w0Var, int i12, boolean z12, AtomicInteger atomicInteger, u0 u0Var, AtomicBoolean atomicBoolean, long j11, int i13, boolean z13, Integer num, ComponentName componentName) {
        this.f25078a = context;
        this.f25079b = i11;
        this.f25080c = z11;
        this.f25081d = w0Var;
        this.f25082e = i12;
        this.f25083f = z12;
        this.f25084g = atomicInteger;
        this.f25085h = u0Var;
        this.f25086i = atomicBoolean;
        this.f25087j = j11;
        this.f25088k = i13;
        this.f25089l = z13;
        this.m = num;
        this.f25090n = componentName;
    }

    public static x1 a(x1 x1Var, int i11, AtomicInteger atomicInteger, u0 u0Var, AtomicBoolean atomicBoolean, long j11, Integer num, int i12) {
        return new x1(x1Var.f25078a, x1Var.f25079b, x1Var.f25080c, x1Var.f25081d, (i12 & 16) != 0 ? x1Var.f25082e : i11, (i12 & 32) != 0 ? x1Var.f25083f : true, (i12 & 64) != 0 ? x1Var.f25084g : atomicInteger, (i12 & 128) != 0 ? x1Var.f25085h : u0Var, (i12 & 256) != 0 ? x1Var.f25086i : atomicBoolean, (i12 & 512) != 0 ? x1Var.f25087j : j11, (i12 & 1024) != 0 ? x1Var.f25088k : 0, (i12 & 4096) != 0 ? x1Var.f25089l : true, (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? x1Var.m : num, x1Var.f25090n);
    }

    public final x1 b(u0 u0Var, int i11) {
        return a(this, i11, null, u0Var, null, 0L, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f25078a.equals(x1Var.f25078a) && this.f25079b == x1Var.f25079b && this.f25080c == x1Var.f25080c && this.f25081d.equals(x1Var.f25081d) && this.f25082e == x1Var.f25082e && this.f25083f == x1Var.f25083f && kotlin.jvm.internal.m.a(this.f25084g, x1Var.f25084g) && kotlin.jvm.internal.m.a(this.f25085h, x1Var.f25085h) && kotlin.jvm.internal.m.a(this.f25086i, x1Var.f25086i) && this.f25087j == x1Var.f25087j && this.f25088k == x1Var.f25088k && this.f25089l == x1Var.f25089l && kotlin.jvm.internal.m.a(this.m, x1Var.m) && kotlin.jvm.internal.m.a(this.f25090n, x1Var.f25090n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.b(-1, defpackage.e.b(this.f25088k, defpackage.e.f(this.f25087j, (this.f25086i.hashCode() + ((this.f25085h.hashCode() + ((this.f25084g.hashCode() + defpackage.e.e(defpackage.e.b(this.f25082e, (this.f25081d.hashCode() + defpackage.e.e(defpackage.e.b(this.f25079b, this.f25078a.hashCode() * 31, 31), 31, this.f25080c)) * 31, 31), 31, this.f25083f)) * 31)) * 31)) * 31, 31), 31), 31), 31, this.f25089l);
        Integer num = this.m;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f25090n;
        return iHashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f25078a + ", appWidgetId=" + this.f25079b + ", isRtl=" + this.f25080c + ", layoutConfiguration=" + this.f25081d + ", itemPosition=" + this.f25082e + ", isLazyCollectionDescendant=" + this.f25083f + ", lastViewId=" + this.f25084g + ", parentContext=" + this.f25085h + ", isBackgroundSpecified=" + this.f25086i + ", layoutSize=" + ((Object) v3.h.c(this.f25087j)) + ", layoutCollectionViewId=" + this.f25088k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.f25089l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.f25090n + ')';
    }
}
