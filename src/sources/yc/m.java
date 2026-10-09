package yc;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f57669a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f57670b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f57671c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f57672d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fd.k f57673e;

    public m(fd.k kVar) {
        this.f57673e = kVar;
    }

    @Override // yc.n
    public final Path a() {
        Path path = this.f57671c;
        path.reset();
        fd.k kVar = this.f57673e;
        if (!kVar.f27175b) {
            int i11 = l.f57668a[kVar.f27174a.ordinal()];
            if (i11 == 1) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f57672d;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i12)).a());
                    i12++;
                }
            } else {
                if (i11 == 2) {
                    b(Path.Op.UNION);
                    return path;
                }
                if (i11 == 3) {
                    b(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i11 == 4) {
                    b(Path.Op.INTERSECT);
                    return path;
                }
                if (i11 == 5) {
                    b(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    public final void b(Path.Op op2) {
        Path path = this.f57670b;
        path.reset();
        Path path2 = this.f57669a;
        path2.reset();
        ArrayList arrayList = this.f57672d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                ArrayList arrayList2 = (ArrayList) dVar.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathA = ((n) arrayList2.get(size2)).a();
                    Matrix matrixE = dVar.f57610d;
                    zc.o oVar = dVar.f57618l;
                    if (oVar != null) {
                        matrixE = oVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathA.transform(matrixE);
                    path.addPath(pathA);
                }
            } else {
                path.addPath(nVar.a());
            }
        }
        int i11 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List listG = dVar2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listG;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                Path pathA2 = ((n) arrayList3.get(i11)).a();
                Matrix matrixE2 = dVar2.f57610d;
                zc.o oVar2 = dVar2.f57618l;
                if (oVar2 != null) {
                    matrixE2 = oVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathA2.transform(matrixE2);
                path2.addPath(pathA2);
                i11++;
            }
        } else {
            path2.set(nVar2.a());
        }
        this.f57671c.op(path2, path, op2);
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57672d;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i11)).c(list, list2);
            i11++;
        }
    }

    @Override // yc.j
    public final void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof n) {
                this.f57672d.add((n) cVar);
                listIterator.remove();
            }
        }
    }
}
