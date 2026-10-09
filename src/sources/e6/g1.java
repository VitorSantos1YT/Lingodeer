package e6;

import com.lingodeer.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f24914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f24915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f24916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1 f24917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1 f24918f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g1 f24919t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24920a;

    static {
        int i11 = 1;
        f24914b = new g1(i11, 0);
        f24915c = new g1(i11, 1);
        f24916d = new g1(i11, 2);
        f24917e = new g1(i11, 3);
        f24918f = new g1(i11, 4);
        f24919t = new g1(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i11, int i12) {
        super(i11);
        this.f24920a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        c6.h hVar;
        c6.l lVarD;
        c6.l lVarD2;
        switch (this.f24920a) {
            case 0:
                return Boolean.valueOf(((c6.k) obj) instanceof d6.b);
            case 1:
                c6.k kVar = (c6.k) obj;
                return Boolean.valueOf((kVar instanceof k6.t) || (kVar instanceof k6.m) || (kVar instanceof y));
            case 2:
                c6.g gVar = (c6.g) obj;
                if (gVar instanceof a0) {
                    return gVar;
                }
                if (!gVar.b().b(new g1(1, 6))) {
                    return gVar;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                c6.l lVarB = gVar.b();
                boolean zB = lVarB.b(f24917e);
                c6.l lVar = c6.j.f6631a;
                qy.l lVar2 = zB ? (qy.l) lVarB.a(new qy.l(null, lVar), z0.S) : new qy.l(null, lVarB);
                if (lVar2.f48495a != null) {
                    throw new ClassCastException();
                }
                c6.l lVar3 = (c6.l) lVar2.f48496b;
                int i11 = 0;
                ((Number) lVar3.a(0, z0.U)).intValue();
                qy.l lVar4 = lVar3.b(f24918f) ? (qy.l) lVar3.a(new qy.l(null, lVar), z0.T) : new qy.l(null, lVar3);
                d6.b bVar = (d6.b) lVar4.f48495a;
                c6.l lVar5 = (c6.l) lVar4.f48496b;
                arrayList.add(bVar);
                if (bVar != null) {
                    c6.a aVar = new c6.a(R.drawable.glance_ripple);
                    hVar = new c6.h();
                    hVar.f6626a = vc.a.i(lVar);
                    hVar.f6627b = aVar;
                } else {
                    hVar = null;
                }
                c0 c0Var = lVar5.b(f24915c) ? (c0) lVar5.a(new c0((c6.l) null, 3), z0.N) : new c0(lVar5, 1);
                c6.l lVar6 = c0Var.f24882a;
                c6.l lVar7 = c0Var.f24883b;
                arrayList.add(lVar6);
                arrayList2.add(vc.a.i(lVar7));
                k6.i iVar = new k6.i();
                int size = arrayList.size();
                int i12 = 0;
                c6.l lVar8 = lVar;
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    c6.l lVar9 = (c6.l) obj2;
                    if (lVar9 != null && (lVarD2 = lVar8.d(lVar9)) != null) {
                        lVar8 = lVarD2;
                    }
                }
                iVar.f37928c = lVar8;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    c6.l lVar10 = (c6.l) obj3;
                    if (lVar10 != null && (lVarD = lVar.d(lVar10)) != null) {
                        lVar = lVarD;
                    }
                }
                gVar.c(lVar);
                ArrayList arrayList3 = iVar.f6630b;
                arrayList3.add(gVar);
                if (hVar != null) {
                    arrayList3.add(hVar);
                }
                return iVar;
            case 3:
                return Boolean.FALSE;
            case 4:
                return Boolean.valueOf(((c6.k) obj) instanceof d6.b);
            case 5:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(((c6.k) obj) instanceof d6.b);
        }
    }
}
