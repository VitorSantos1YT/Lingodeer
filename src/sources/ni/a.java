package ni;

import b7.e0;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.q;
import com.android.billingclient.api.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements r, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f43802a;

    public /* synthetic */ a(m mVar) {
        this.f43802a = mVar;
    }

    @Override // com.android.billingclient.api.q
    public void a(com.android.billingclient.api.j jVar, List purchaseList) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.m.f(jVar, "<unused var>");
        kotlin.jvm.internal.m.f(purchaseList, "purchaseList");
        if (purchaseList.isEmpty()) {
            return;
        }
        m mVar = this.f43802a;
        ArrayList arrayList = mVar.f43836f;
        i1 i1Var = mVar.P;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : purchaseList) {
            Purchase purchase = (Purchase) obj3;
            Objects.toString(purchase);
            purchase.f7456c.optInt("purchaseState", 1);
            if (purchase.f7456c.optInt("purchaseState", 1) != 4) {
                arrayList2.add(obj3);
            }
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ((Purchase) next).toString();
        }
        int size = arrayList.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            Purchase purchase2 = (Purchase) obj;
            Object obj4 = purchase2.b().get(0);
            kotlin.jvm.internal.m.e(obj4, "get(...)");
            if (oz.q.v0((CharSequence) obj4, "_12_", false)) {
                break;
            }
            Object obj5 = purchase2.b().get(0);
            kotlin.jvm.internal.m.e(obj5, "get(...)");
            if (oz.q.v0((CharSequence) obj5, "premium_year", false)) {
                break;
            }
            obj2 = purchase2.b().get(0);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
        } while (!oz.q.v0((CharSequence) obj2, "_3_", false));
        if (((Purchase) obj) != null) {
            i iVar = i.f43812f;
            i1Var.getClass();
            i1Var.l(null, iVar);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            i iVar2 = i.f43813g;
            i1Var.getClass();
            i1Var.l(null, iVar2);
        }
    }

    @Override // com.android.billingclient.api.r
    public void d(com.android.billingclient.api.j billingResult, List list) {
        kotlin.jvm.internal.m.f(billingResult, "billingResult");
        int i11 = billingResult.f7519a;
        kotlin.jvm.internal.m.e(billingResult.f7521c, "getDebugMessage(...)");
        m mVar = this.f43802a;
        i1 i1Var = mVar.f43837t;
        AtomicBoolean atomicBoolean = mVar.W;
        Integer numValueOf = Integer.valueOf(i11);
        i1Var.getClass();
        i1Var.l(null, numValueOf);
        if (i11 != 0) {
            if (i11 == 1 && kotlin.jvm.internal.m.a(mVar.T, "splash")) {
                e0.A(mVar.f43834d, "jxz_subscribe_failure");
            }
        } else if (atomicBoolean.get()) {
            if (list == null) {
                mVar.b(null);
            } else {
                xt.b.f56285g.set(true);
                mVar.b(list);
            }
        }
        atomicBoolean.set(false);
    }
}
