package j9;

import java.util.ArrayList;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f36252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f36254h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 provider, String startDestination) {
        super(provider.b(com.bumptech.glide.e.u(u.class)), (String) null);
        kotlin.jvm.internal.m.f(provider, "provider");
        kotlin.jvm.internal.m.f(startDestination, "startDestination");
        this.f36254h = new ArrayList();
        this.f36252f = provider;
        this.f36253g = startDestination;
    }

    public final s g() {
        s sVar = (s) super.a();
        ArrayList nodes = this.f36254h;
        kotlin.jvm.internal.m.f(nodes, "nodes");
        a.a aVar = sVar.f36251f;
        aVar.getClass();
        int size = nodes.size();
        int iHashCode = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = nodes.get(i11);
            i11++;
            q qVar = (q) obj;
            if (qVar != null) {
                u0 u0Var = (u0) aVar.f7d;
                s sVar2 = (s) aVar.f6c;
                b7.c cVar = sVar2.f36242b;
                b7.c cVar2 = qVar.f36242b;
                int i12 = cVar2.f3958a;
                String str = (String) cVar2.f3962e;
                if (i12 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) cVar.f3962e;
                if (str2 != null && kotlin.jvm.internal.m.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same route as graph " + sVar2).toString());
                }
                if (i12 == cVar.f3958a) {
                    throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same id as graph " + sVar2).toString());
                }
                q qVar2 = (q) u0Var.d(i12);
                if (qVar2 == qVar) {
                    continue;
                } else {
                    if (qVar.f36243c != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (qVar2 != null) {
                        qVar2.f36243c = null;
                    }
                    qVar.f36243c = sVar2;
                    u0Var.g(cVar2.f3958a, qVar);
                }
            }
        }
        String str3 = this.f36253g;
        if (str3 == null) {
            if (((String) this.f36246b) != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        s sVar3 = (s) aVar.f6c;
        if (str3 != null) {
            if (str3.equals((String) sVar3.f36242b.f3962e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + sVar3).toString());
            }
            if (oz.q.K0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i13 = q.f36240e;
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        aVar.f5b = iHashCode;
        aVar.f9f = str3;
        return sVar;
    }
}
