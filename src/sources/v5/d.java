package v5;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import qp.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ob.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.c f53517c;

    public d(com.android.billingclient.api.c cVar) {
        this.f53517c = cVar;
    }

    @Override // ob.f
    public final void E(Throwable th2) {
        ((j) this.f53517c.f7466a).f(th2);
    }

    @Override // ob.f
    public final void F(ob.i iVar) {
        com.android.billingclient.api.c cVar = this.f53517c;
        cVar.f7468c = iVar;
        ob.i iVar2 = (ob.i) cVar.f7468c;
        j jVar = (j) cVar.f7466a;
        re.q qVar = jVar.f53532g;
        c cVar2 = jVar.f53534i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? m.a() : qx.b.o();
        m3 m3Var = new m3();
        m3Var.f48056a = qVar;
        m3Var.f48057b = iVar2;
        m3Var.f48058c = cVar2;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                m3Var.i(str, 0, str.length(), 1, true, new com.android.billingclient.api.a(str, 1));
            }
        }
        cVar.f7467b = m3Var;
        j jVar2 = (j) cVar.f7466a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f53526a.writeLock().lock();
        try {
            jVar2.f53528c = 1;
            arrayList.addAll(jVar2.f53527b);
            jVar2.f53527b.clear();
            jVar2.f53526a.writeLock().unlock();
            jVar2.f53529d.post(new h(arrayList, jVar2.f53528c, null));
        } catch (Throwable th2) {
            jVar2.f53526a.writeLock().unlock();
            throw th2;
        }
    }
}
