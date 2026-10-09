package j9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@b0("navigation")
public class u extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f36255c;

    public u(d0 navigatorProvider) {
        kotlin.jvm.internal.m.f(navigatorProvider, "navigatorProvider");
        this.f36255c = navigatorProvider;
    }

    @Override // j9.c0
    public final void d(List list, y yVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            q qVar = eVar.f36188b;
            kotlin.jvm.internal.m.d(qVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            s sVar = (s) qVar;
            b7.c cVar = sVar.f36242b;
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f38361a = eVar.H.a();
            a.a aVar = sVar.f36251f;
            int i11 = aVar.f5b;
            String str = (String) aVar.f9f;
            if (i11 == 0 && str == null) {
                cVar.getClass();
                String superName = String.valueOf(cVar.f3958a);
                kotlin.jvm.internal.m.f(superName, "superName");
                if (((s) aVar.f6c).f36242b.f3958a == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            q qVarW = str != null ? aVar.w(str, false) : (q) ((u0) aVar.f7d).d(i11);
            if (qVarW == null) {
                if (((String) aVar.f8e) == null) {
                    String strValueOf = (String) aVar.f9f;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(aVar.f5b);
                    }
                    aVar.f8e = strValueOf;
                }
                String str2 = (String) aVar.f8e;
                kotlin.jvm.internal.m.c(str2);
                throw new IllegalArgumentException(ep.a.g("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            b7.c cVar2 = qVarW.f36242b;
            if (str != null) {
                if (!str.equals((String) cVar2.f3962e)) {
                    p pVarC = cVar2.c(str);
                    Bundle bundle = pVarC != null ? pVarC.f36236b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                        bundleB.putAll(bundle);
                        Bundle bundle2 = (Bundle) yVar2.f38361a;
                        if (bundle2 != null) {
                            bundleB.putAll(bundle2);
                        }
                        yVar2.f38361a = bundleB;
                    }
                }
                if (qVarW.d().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListC = c.a.C(qVarW.d(), new fr.e(yVar2, 2));
                    if (!arrayListC.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + qVarW + ". Missing required arguments [" + arrayListC + ']').toString());
                    }
                }
            }
            this.f36255c.b(qVarW.f36241a).d(ns.o.K(b().b(qVarW, qVarW.b((Bundle) yVar2.f38361a))), yVar);
        }
    }

    @Override // j9.c0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s a() {
        return new s(this);
    }
}
