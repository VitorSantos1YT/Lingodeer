package o3;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j3.x0;
import mt.b6;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f44703d = new o2(6, new nv.c(21), new b6(22));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f44704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f44706c;

    public w(j3.h hVar, long j11, x0 x0Var) {
        x0 x0Var2;
        this.f44704a = hVar;
        this.f44705b = j3.t.c(hVar.f35700b.length(), j11);
        if (x0Var != null) {
            x0Var2 = new x0(j3.t.c(hVar.f35700b.length(), x0Var.f35823a));
        } else {
            x0Var2 = null;
        }
        this.f44706c = x0Var2;
    }

    public static w a(w wVar, j3.h hVar, long j11, int i11) {
        if ((i11 & 1) != 0) {
            hVar = wVar.f44704a;
        }
        if ((i11 & 2) != 0) {
            j11 = wVar.f44705b;
        }
        x0 x0Var = (i11 & 4) != 0 ? wVar.f44706c : null;
        wVar.getClass();
        return new w(hVar, j11, x0Var);
    }

    public static w b(w wVar, String str, long j11, int i11) {
        if ((i11 & 2) != 0) {
            j11 = wVar.f44705b;
        }
        x0 x0Var = wVar.f44706c;
        wVar.getClass();
        return new w(new j3.h(str), j11, x0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return x0.b(this.f44705b, wVar.f44705b) && kotlin.jvm.internal.m.a(this.f44706c, wVar.f44706c) && kotlin.jvm.internal.m.a(this.f44704a, wVar.f44704a);
    }

    public final int hashCode() {
        int iHashCode = this.f44704a.hashCode() * 31;
        int i11 = x0.f35822c;
        int iF = defpackage.e.f(this.f44705b, iHashCode, 31);
        x0 x0Var = this.f44706c;
        return iF + (x0Var != null ? Long.hashCode(x0Var.f35823a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f44704a) + "', selection=" + ((Object) x0.h(this.f44705b)) + ", composition=" + this.f44706c + ')';
    }

    public w(String str, long j11, int i11) {
        this(new j3.h((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str), (i11 & 2) != 0 ? x0.f35821b : j11, (x0) null);
    }
}
