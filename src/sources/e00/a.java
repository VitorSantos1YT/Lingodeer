package e00;

import hh.p0;
import java.util.ArrayList;
import java.util.HashSet;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f24664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24667f;

    public a(String serialName) {
        kotlin.jvm.internal.m.f(serialName, "serialName");
        this.f24662a = serialName;
        this.f24663b = new ArrayList();
        this.f24664c = new HashSet();
        this.f24665d = new ArrayList();
        this.f24666e = new ArrayList();
        this.f24667f = new ArrayList();
    }

    public static void a(a aVar, String str, g descriptor) {
        aVar.getClass();
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        if (!aVar.f24664c.add(str)) {
            StringBuilder sbQ = p0.q("Element with name '", str, "' is already registered in ");
            sbQ.append(aVar.f24662a);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        aVar.f24663b.add(str);
        aVar.f24665d.add(descriptor);
        aVar.f24666e.add(r.f50854a);
        aVar.f24667f.add(false);
    }
}
