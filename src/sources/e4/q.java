package e4;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f24819f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f24820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f24823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24824e;

    public final void a(ArrayList arrayList) {
        int size = this.f24820a.size();
        if (this.f24824e != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q qVar = (q) arrayList.get(i11);
                if (this.f24824e == qVar.f24821b) {
                    c(this.f24822c, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(b4.c cVar, int i11) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f24820a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d4.h hVar = (d4.h) ((d4.g) arrayList.get(0)).V;
        cVar.t();
        hVar.b(cVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((d4.g) arrayList.get(i12)).b(cVar, false);
        }
        if (i11 == 0 && hVar.D0 > 0) {
            d4.n.a(hVar, cVar, arrayList, 0);
        }
        if (i11 == 1 && hVar.E0 > 0) {
            d4.n.a(hVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e8) {
            System.err.println(e8.toString() + "\n" + Arrays.toString(e8.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", BuildConfig.VERSION_NAME));
        }
        this.f24823d = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            d4.g gVar = (d4.g) arrayList.get(i13);
            tw.c cVar2 = new tw.c(7);
            new WeakReference(gVar);
            b4.c.n(gVar.J);
            b4.c.n(gVar.K);
            b4.c.n(gVar.L);
            b4.c.n(gVar.M);
            b4.c.n(gVar.N);
            this.f24823d.add(cVar2);
        }
        if (i11 == 0) {
            iN = b4.c.n(hVar.J);
            iN2 = b4.c.n(hVar.L);
            cVar.t();
        } else {
            iN = b4.c.n(hVar.K);
            iN2 = b4.c.n(hVar.M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i11, q qVar) {
        int i12 = qVar.f24821b;
        ArrayList arrayList = this.f24820a;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            d4.g gVar = (d4.g) obj;
            ArrayList arrayList2 = qVar.f24820a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
            if (i11 == 0) {
                gVar.f23152s0 = i12;
            } else {
                gVar.f23154t0 = i12;
            }
        }
        this.f24824e = i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f24822c;
        if (i11 == 0) {
            str = "Horizontal";
        } else if (i11 == 1) {
            str = "Vertical";
        } else {
            str = i11 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strI = p0.i(this.f24821b, "] <", sb2);
        ArrayList arrayList = this.f24820a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            StringBuilder sbR = defpackage.e.r(strI, " ");
            sbR.append(((d4.g) obj).f23137k0);
            strI = sbR.toString();
        }
        return defpackage.e.m(strI, " >");
    }
}
