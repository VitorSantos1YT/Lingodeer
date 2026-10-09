package kotlin.jvm.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.Collections;
import java.util.List;
import jt.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements mz.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f38350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38351b;

    public d0(e eVar) {
        List arguments = Collections.EMPTY_LIST;
        m.f(arguments, "arguments");
        this.f38350a = eVar;
        this.f38351b = arguments;
    }

    @Override // mz.k
    public final boolean a() {
        return false;
    }

    @Override // mz.k
    public final List c() {
        return this.f38351b;
    }

    @Override // mz.k
    public final mz.c d() {
        return this.f38350a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        if (!this.f38350a.equals(((d0) obj).f38350a)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return m.a(list, list);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + p0.b(this.f38350a.hashCode() * 31, 31, Collections.EMPTY_LIST);
    }

    public final String toString() {
        String name;
        StringBuilder sb2 = new StringBuilder();
        Class clsP = qx.b.p(this.f38350a);
        if (!clsP.isArray()) {
            name = clsP.getName();
        } else if (clsP.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsP.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsP.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsP.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsP.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsP.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsP.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsP.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = Collections.EMPTY_LIST;
        sb2.append(name + (list.isEmpty() ? BuildConfig.VERSION_NAME : ry.m.y0(list, ", ", "<", ">", new t0(16), 24)) + BuildConfig.VERSION_NAME);
        sb2.append(" (Kotlin reflection is not available)");
        return sb2.toString();
    }
}
