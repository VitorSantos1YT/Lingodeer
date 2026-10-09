package cf;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lf.e0;
import lf.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f6973a = ns.o.K("fb_currency");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6974b = ns.o.K("_valueToSum");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6975c = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f6976d = ns.o.L(new qy.l("fb_iap_product_id", ns.o.K("fb_iap_product_id")), new qy.l("fb_iap_product_description", ns.o.K("fb_iap_product_description")), new qy.l("fb_iap_product_title", ns.o.K("fb_iap_product_title")), new qy.l("fb_iap_purchase_token", ns.o.K("fb_iap_purchase_token")));

    public static qy.l a(Bundle bundle, Bundle bundle2, se.t tVar) {
        if (bundle == null) {
            return new qy.l(bundle2, tVar);
        }
        try {
            for (String key : bundle.keySet()) {
                String string = bundle.getString(key);
                if (string != null) {
                    Map map = se.t.f51614b;
                    se.u uVar = se.u.IAPParameters;
                    kotlin.jvm.internal.m.e(key, "key");
                    qy.l lVarI = ve.i.i(uVar, key, string, bundle2, tVar);
                    Bundle bundle3 = (Bundle) lVarI.f48495a;
                    tVar = (se.t) lVarI.f48496b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new qy.l(bundle2, tVar);
    }

    public static List b(boolean z11) {
        e0 e0VarB = h0.b(re.s.b());
        if ((e0VarB != null ? e0VarB.f40020y : null) != null) {
            List<qy.l> list = e0VarB.f40020y;
            if (!list.isEmpty()) {
                if (!z11) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (qy.l lVar : list) {
                    Iterator it = ((List) lVar.f48496b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new qy.l((String) it.next(), ns.o.K(lVar.f48495a)));
                    }
                }
                return arrayList;
            }
        }
        return f6976d;
    }

    public static List c(boolean z11) {
        List<qy.l> list;
        e0 e0VarB = h0.b(re.s.b());
        if (e0VarB == null || (list = e0VarB.f40021z) == null || list.isEmpty()) {
            return null;
        }
        if (!z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (qy.l lVar : list) {
            Iterator it = ((List) lVar.f48496b).iterator();
            while (it.hasNext()) {
                arrayList.add(new qy.l((String) it.next(), ns.o.K(lVar.f48495a)));
            }
        }
        return arrayList;
    }
}
