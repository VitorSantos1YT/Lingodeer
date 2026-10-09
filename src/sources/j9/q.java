package j9;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import y.u0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f36240e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.c f36242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f36243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f36244d;

    static {
        new LinkedHashMap();
    }

    public q(c0 navigator) {
        kotlin.jvm.internal.m.f(navigator, "navigator");
        LinkedHashMap linkedHashMap = d0.f36185b;
        this.f36241a = com.bumptech.glide.e.u(navigator.getClass());
        b7.c cVar = new b7.c();
        cVar.f3959b = this;
        cVar.f3960c = new ArrayList();
        cVar.f3961d = new LinkedHashMap();
        this.f36242b = cVar;
        this.f36244d = new u0(0);
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f36242b.f3961d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            bundleB.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return bundleB;
    }

    public final Map d() {
        return ry.x.h0((LinkedHashMap) this.f36242b.f3961d);
    }

    public p e(ob.m mVar) {
        boolean zF;
        oz.o oVar;
        oz.l lVarE;
        b7.c cVar = this.f36242b;
        LinkedHashMap arguments = (LinkedHashMap) cVar.f3961d;
        Uri uri = (Uri) mVar.f44826b;
        ArrayList arrayList = (ArrayList) cVar.f3960c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        p pVar = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            o oVar2 = (o) obj;
            oVar2.getClass();
            qy.q qVar = oVar2.f36226d;
            if (((oz.o) qVar.getValue()) == null) {
                zF = true;
            } else if (uri == null) {
                zF = false;
            } else {
                oz.o oVar3 = (oz.o) qVar.getValue();
                kotlin.jvm.internal.m.c(oVar3);
                zF = oVar3.f(uri.toString());
            }
            if (zF) {
                Bundle bundleD = uri != null ? oVar2.d(uri, arguments) : null;
                int iB = oVar2.b(uri);
                String str = (String) mVar.f44827c;
                boolean z11 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z11) {
                        kotlin.jvm.internal.m.f(arguments, "arguments");
                        Bundle bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                        if (uri != null && (oVar = (oz.o) qVar.getValue()) != null && (lVarE = oVar.e(uri.toString())) != null) {
                            oVar2.e(lVarE, bundleB, arguments);
                            if (((Boolean) oVar2.f36227e.getValue()).booleanValue()) {
                                oVar2.f(uri, bundleB, arguments);
                            }
                        }
                        if (c.a.C(arguments, new m(1, bundleB)).isEmpty()) {
                        }
                    }
                }
                p pVar2 = new p((q) cVar.f3959b, bundleD, oVar2.f36234l, iB, z11);
                if (pVar == null || pVar2.compareTo(pVar) > 0) {
                    pVar = pVar2;
                }
            }
        }
        return pVar;
    }

    public boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (this != obj) {
            if (obj != null && (obj instanceof q)) {
                b7.c cVar = this.f36242b;
                ArrayList arrayList = (ArrayList) cVar.f3960c;
                q qVar = (q) obj;
                u0 u0Var = qVar.f36244d;
                b7.c cVar2 = qVar.f36242b;
                boolean zA = kotlin.jvm.internal.m.a(arrayList, (ArrayList) cVar2.f3960c);
                u0 u0Var2 = this.f36244d;
                if (u0Var2.h() != u0Var.h()) {
                    z11 = false;
                    break;
                }
                Iterator it = ((nz.a) nz.n.P(new v0(u0Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!kotlin.jvm.internal.m.a(u0Var2.d(iIntValue), u0Var.d(iIntValue))) {
                        z11 = false;
                        break;
                    }
                }
                if (d().size() != qVar.d().size()) {
                    z12 = false;
                    break;
                }
                Iterator it2 = ((Iterable) ry.x.T(d()).f44339b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!qVar.d().containsKey(entry.getKey()) || !kotlin.jvm.internal.m.a(qVar.d().get(entry.getKey()), entry.getValue())) {
                        z12 = false;
                        break;
                    }
                }
                if (cVar.f3958a != cVar2.f3958a || !kotlin.jvm.internal.m.a((String) cVar.f3962e, (String) cVar2.f3962e) || !zA || !z11 || !z12) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b7.c cVar = this.f36242b;
        int i11 = cVar.f3958a * 31;
        String str = (String) cVar.f3962e;
        int iHashCode = i11 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) cVar.f3960c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            iHashCode = (((o) obj).f36223a.hashCode() + (iHashCode * 31)) * 961;
        }
        u0 u0Var = this.f36244d;
        kotlin.jvm.internal.m.f(u0Var, "<this>");
        if (u0Var.h() > 0) {
            u0Var.i(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : d().keySet()) {
            int iD = defpackage.e.d(iHashCode * 31, 31, str2);
            Object obj2 = d().get(str2);
            iHashCode = iD + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        b7.c cVar = this.f36242b;
        cVar.getClass();
        sb2.append(Integer.toHexString(cVar.f3958a));
        sb2.append(")");
        String str = (String) cVar.f3962e;
        if (str != null && !oz.q.K0(str)) {
            sb2.append(" route=");
            sb2.append((String) cVar.f3962e);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
