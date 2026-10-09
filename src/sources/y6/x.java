package y6;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f57373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f57374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f57375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f57376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f57377f;

    static {
        kw.b bVar = new kw.b();
        ImmutableMap.k();
        ImmutableList.s();
        List list = Collections.EMPTY_LIST;
        ImmutableList.s();
        j7.t tVar = new j7.t();
        v vVar = v.f57368a;
        bVar.a();
        tVar.a();
        a0 a0Var = a0.B;
        w4.c.s(0, 1, 2, 3, 4);
        b7.f0.G(5);
    }

    public x(String str, s sVar, u uVar, t tVar, a0 a0Var, v vVar) {
        this.f57372a = str;
        this.f57373b = uVar;
        this.f57374c = tVar;
        this.f57375d = a0Var;
        this.f57376e = sVar;
        this.f57377f = vVar;
    }

    public static x a(Uri uri) {
        kw.b bVar = new kw.b();
        ImmutableMap.k();
        ImmutableList.s();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListS = ImmutableList.s();
        j7.t tVar = new j7.t();
        return new x(BuildConfig.VERSION_NAME, new s(bVar), uri != null ? new u(uri, null, null, list, immutableListS, -9223372036854775807L) : null, new t(tVar), a0.B, v.f57368a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Objects.equals(this.f57372a, xVar.f57372a) && this.f57376e.equals(xVar.f57376e) && Objects.equals(this.f57373b, xVar.f57373b) && this.f57374c.equals(xVar.f57374c) && Objects.equals(this.f57375d, xVar.f57375d) && Objects.equals(this.f57377f, xVar.f57377f);
    }

    public final int hashCode() {
        int iHashCode = this.f57372a.hashCode() * 31;
        u uVar = this.f57373b;
        int iHashCode2 = (this.f57375d.hashCode() + ((this.f57376e.hashCode() + ((this.f57374c.hashCode() + ((iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f57377f.getClass();
        return iHashCode2;
    }
}
