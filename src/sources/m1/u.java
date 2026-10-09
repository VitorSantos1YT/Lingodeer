package m1;

import java.util.ArrayList;
import l1.o2;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f40815c = new u(1, 0, 2);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        l1.b bVar;
        int iC;
        int iE = tVar.e(0);
        if (p2Var.f39408n != 0) {
            l1.u.a("Cannot move a group while inserting");
        }
        if (iE < 0) {
            l1.u.a("Parameter offset is out of bounds");
        }
        if (iE == 0) {
            return;
        }
        int i11 = p2Var.f39414t;
        int i12 = p2Var.f39416v;
        int i13 = p2Var.f39415u;
        int i14 = i11;
        while (iE > 0) {
            i14 += p2Var.f39397b[(p2Var.r(i14) * 5) + 3];
            if (i14 > i13) {
                l1.u.a("Parameter offset is out of bounds");
            }
            iE--;
        }
        int i15 = p2Var.f39397b[(p2Var.r(i14) * 5) + 3];
        int iG = p2Var.g(p2Var.f39397b, p2Var.r(p2Var.f39414t));
        int iG2 = p2Var.g(p2Var.f39397b, p2Var.r(i14));
        int i16 = i14 + i15;
        int iG3 = p2Var.g(p2Var.f39397b, p2Var.r(i16));
        int i17 = iG3 - iG2;
        p2Var.x(i17, Math.max(p2Var.f39414t - 1, 0));
        p2Var.w(i15);
        int[] iArr = p2Var.f39397b;
        int iR = p2Var.r(i16) * 5;
        ry.l.H(p2Var.r(i11) * 5, iR, iArr, iArr, (i15 * 5) + iR);
        if (i17 > 0) {
            Object[] objArr = p2Var.f39398c;
            int iH = p2Var.h(iG2 + i17);
            System.arraycopy(objArr, iH, objArr, iG, p2Var.h(iG3 + i17) - iH);
        }
        int i18 = iG2 + i17;
        int i19 = i18 - iG;
        int i21 = p2Var.f39406k;
        int i22 = p2Var.f39407l;
        int length = p2Var.f39398c.length;
        int i23 = p2Var.m;
        int i24 = i11 + i15;
        int i25 = i11;
        while (i25 < i24) {
            int iR2 = p2Var.r(i25);
            int i26 = i19;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = p2.i(p2.i(p2Var.g(iArr, iR2) - i26, i23 < iR2 ? 0 : i21, i22, length), p2Var.f39406k, p2Var.f39407l, p2Var.f39398c.length);
            i25++;
            i19 = i26;
            iArr = iArr2;
            i21 = i21;
        }
        int i27 = i16 + i15;
        int iP = p2Var.p();
        int iB = o2.b(p2Var.f39399d, i16, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < p2Var.f39399d.size() && (iC = p2Var.c((bVar = (l1.b) p2Var.f39399d.get(iB)))) >= i16 && iC < i27) {
                arrayList.add(bVar);
            }
        }
        int i28 = i11 - i16;
        int size = arrayList.size();
        for (int i29 = 0; i29 < size; i29++) {
            l1.b bVar2 = (l1.b) arrayList.get(i29);
            int iC2 = p2Var.c(bVar2) + i28;
            if (iC2 >= p2Var.f39402g) {
                bVar2.f39235a = -(iP - iC2);
            } else {
                bVar2.f39235a = iC2;
            }
            p2Var.f39399d.add(o2.b(p2Var.f39399d, iC2, iP), bVar2);
        }
        if (p2Var.I(i16, i15)) {
            l1.u.a("Unexpectedly removed anchors");
        }
        p2Var.m(i12, p2Var.f39415u, i11);
        if (i17 > 0) {
            p2Var.J(i18, i17, i16 - 1);
        }
    }
}
