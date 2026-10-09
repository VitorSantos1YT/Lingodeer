package e6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f24971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Set set, vy.d dVar, int i11) {
        super(2, dVar);
        this.f24969a = i11;
        this.f24971c = set;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f24969a) {
            case 0:
                l0 l0Var = new l0(this.f24971c, dVar, 0);
                l0Var.f24970b = obj;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f24971c, dVar, 1);
                l0Var2.f24970b = obj;
                return l0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        r5.b bVar = (r5.b) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f24969a) {
            case 0:
                break;
        }
        return ((l0) create(bVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f24969a;
        Set set = this.f24971c;
        int i12 = 0;
        z = false;
        boolean z11 = false;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r5.b bVar = (r5.b) this.f24970b;
                Set set2 = (Set) bVar.c(o0.f25004g);
                if (set2 == null) {
                    return bVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set2) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return bVar;
                }
                r5.b bVarG = bVar.g();
                bVarG.e(o0.f25004g, qx.b.z(set2, arrayList));
                int size = arrayList.size();
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    bVarG.d(j0.a(o0.f25001d, (String) obj3));
                }
                return bVarG.h();
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Set setKeySet = ((r5.b) this.f24970b).a().keySet();
                ArrayList arrayList2 = new ArrayList(ry.n.W(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((r5.d) it.next()).f48822a);
                }
                if (set == q5.l.f47470a) {
                    z11 = true;
                } else {
                    Set set3 = set;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it2 = set3.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList2.contains((String) it2.next())) {
                                z11 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z11);
        }
    }
}
