package kr;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f38404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ i f38405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ float f38406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ j f38407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ List f38408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f38409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, vy.d dVar) {
        super(6, dVar);
        this.f38409f = b0Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        float fFloatValue = ((Number) obj3).floatValue();
        a0 a0Var = new a0(this.f38409f, (vy.d) obj6);
        a0Var.f38404a = (List) obj;
        a0Var.f38405b = (i) obj2;
        a0Var.f38406c = fFloatValue;
        a0Var.f38407d = (j) obj4;
        a0Var.f38408e = (List) obj5;
        return a0Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kr.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list = this.f38404a;
        i iVar = this.f38405b;
        float f5 = this.f38406c;
        j jVar = this.f38407d;
        List list2 = this.f38408e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ?? arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (true) {
            obj2 = null;
            z = false;
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            n nVar = (n) it.next();
            boolean zEquals = nVar.f38533a.equals(iVar != null ? iVar.f38491a : null);
            if (zEquals && iVar != null) {
                z11 = iVar.f38492b;
            }
            boolean z12 = z11;
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (zEquals && iVar != null) {
                f11 = iVar.f38493c;
            }
            arrayList.add(n.a(nVar, 0, false, zEquals, z12, f11, 255));
        }
        b0 b0Var = this.f38409f;
        String[] strArrL = jh.h.l(b0Var.f38428e, list2.size());
        List listK0 = strArrL != null ? ry.l.k0(strArrL) : ry.r.f50854a;
        if (!arrayList.isEmpty() && ((n) ry.m.q0(arrayList)).f38533a.equals(((fr.o0) b0Var.f38424a).w())) {
            obj2 = (n) ry.m.q0(arrayList);
        }
        if (obj2 != null) {
            arrayList = arrayList.subList(1, arrayList.size());
        }
        return new l(obj2, arrayList, list2, listK0, jVar, iVar != null ? iVar.f38494d : 0, f5);
    }
}
