package g3;

import com.yalantis.ucrop.view.CropImageView;
import fr.a2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f28642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28643b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i11 = 0;
        while (i11 < 2) {
            comparatorArr[i11] = new a2(new a2(i11 == 0 ? i.f28649c : i.f28648b), 2);
            i11++;
        }
        f28642a = comparatorArr;
        f28643b = m.X;
    }

    public static final void a(t tVar, ArrayList arrayList, p0 p0Var, p0 p0Var2, y.x xVar) {
        o oVar = tVar.f28699d;
        Object objG = oVar.f28691a.g(x.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) p0Var2.invoke(tVar)).booleanValue()) && ((Boolean) p0Var.invoke(tVar)).booleanValue()) {
            arrayList.add(tVar);
        }
        if (zBooleanValue) {
            xVar.h(tVar.f28702g, b(tVar, p0Var, p0Var2, t.j(7, tVar)));
            return;
        }
        List listJ = t.j(7, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            a((t) listJ.get(i11), arrayList, p0Var, p0Var2, xVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    public static final ArrayList b(t tVar, p0 p0Var, p0 p0Var2, List list) {
        y.x xVar = y.n.f56742a;
        y.x xVar2 = new y.x();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a((t) list.get(i11), arrayList, p0Var, p0Var2, xVar2);
        }
        char c11 = tVar.f28698c.f56883c0 == v3.m.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iA = ns.o.A(arrayList);
        if (iA >= 0) {
            int i12 = 0;
            while (true) {
                t tVar2 = (t) arrayList.get(i12);
                if (i12 == 0) {
                    arrayList2.add(new qy.l(tVar2.h(), ns.o.M(tVar2)));
                    break;
                }
                float f5 = tVar2.h().f26573b;
                float f11 = tVar2.h().f26575d;
                boolean z11 = f5 >= f11;
                int iA2 = ns.o.A(arrayList2);
                if (iA2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        f2.c cVar = (f2.c) ((qy.l) arrayList2.get(i13)).f48495a;
                        float f12 = cVar.f26573b;
                        float f13 = cVar.f26575d;
                        boolean z12 = f12 >= f13;
                        if (!z11 && !z12 && Math.max(f5, f12) < Math.min(f11, f13)) {
                            arrayList2.set(i13, new qy.l(new f2.c(Math.max(cVar.f26572a, CropImageView.DEFAULT_ASPECT_RATIO), Math.max(cVar.f26573b, f5), Math.min(cVar.f26574c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((qy.l) arrayList2.get(i13)).f48496b));
                            ((List) ((qy.l) arrayList2.get(i13)).f48496b).add(tVar2);
                            break;
                        }
                        if (i13 != iA2) {
                            i13++;
                        }
                    }
                }
                arrayList2.add(new qy.l(tVar2.h(), ns.o.M(tVar2)));
                break;
                if (i12 == iA) {
                    break;
                }
                i12++;
            }
        }
        ry.p.Z(arrayList2, i.f28650d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f28642a[c11 ^ 1];
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            qy.l lVar = (qy.l) arrayList2.get(i14);
            ry.p.Z((List) lVar.f48496b, comparator);
            arrayList3.addAll((Collection) lVar.f48496b);
        }
        ry.p.Z(arrayList3, new com.google.android.material.button.a(f28643b, 3));
        int size3 = 0;
        while (size3 <= ns.o.A(arrayList3)) {
            List list2 = (List) xVar2.b(((t) arrayList3.get(size3)).f28702g);
            if (list2 != null) {
                if (((Boolean) p0Var2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
