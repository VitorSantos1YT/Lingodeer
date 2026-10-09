package ya;

import android.graphics.Rect;
import hh.p0;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57545d;

    static {
        new b(0, 0, 0, 0);
    }

    public b(int i11, int i12, int i13, int i14) {
        this.f57542a = i11;
        this.f57543b = i12;
        this.f57544c = i13;
        this.f57545d = i14;
        if (i11 > i13) {
            throw new IllegalArgumentException(p.p("Left must be less than or equal to right, left: ", i11, i13, ", right: ").toString());
        }
        if (i12 > i14) {
            throw new IllegalArgumentException(p.p("top must be less than or equal to bottom, top: ", i12, i14, ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f57545d - this.f57543b;
    }

    public final int b() {
        return this.f57544c - this.f57542a;
    }

    public final Rect c() {
        return new Rect(this.f57542a, this.f57543b, this.f57544c, this.f57545d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f57542a == bVar.f57542a && this.f57543b == bVar.f57543b && this.f57544c == bVar.f57544c && this.f57545d == bVar.f57545d;
    }

    public final int hashCode() {
        return (((((this.f57542a * 31) + this.f57543b) * 31) + this.f57544c) * 31) + this.f57545d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f57542a);
        sb2.append(',');
        sb2.append(this.f57543b);
        sb2.append(',');
        sb2.append(this.f57544c);
        sb2.append(',');
        return p0.i(this.f57545d, "] }", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        m.f(rect, HOBXIlHxIkMBEA.xjcpixYKGWTQqpH);
    }
}
