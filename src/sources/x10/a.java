package x10;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import v10.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55747a = ew.a.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f55748b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f55749c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f55750d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f55751e = new ArrayList();

    public final void a(b bVar) {
        u10.a aVar = bVar.f53471a;
        e eVar = aVar.f52727b;
        String mapping = f20.a.a(eVar) + ':' + BuildConfig.VERSION_NAME + ':' + aVar.f52726a;
        m.f(mapping, "mapping");
        this.f55749c.put(mapping, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return m.a(this.f55747a, ((a) obj).f55747a);
    }

    public final int hashCode() {
        return this.f55747a.hashCode();
    }
}
