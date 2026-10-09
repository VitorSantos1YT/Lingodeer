package g3;

import androidx.compose.ui.platform.AndroidComposeView;
import y.e0;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f28705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f28706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.m f28707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f28708d = new e0(2);

    public v(i0 i0Var, g gVar, y.x xVar) {
        this.f28705a = i0Var;
        this.f28706b = gVar;
        this.f28707c = xVar;
    }

    public final t a() {
        return new t(this.f28706b, false, this.f28705a, new o());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    public final void b(i0 i0Var, o oVar) {
        String str;
        String str2;
        i3.a aVar;
        i3.a aVar2;
        a2.h hVar;
        a2.h hVar2;
        e0 e0Var = this.f28708d;
        Object[] objArr = e0Var.f56686a;
        int i11 = e0Var.f56687b;
        for (int i12 = 0; i12 < i11; i12++) {
            a2.e eVar = (a2.e) ((p) objArr[i12]);
            y.y yVar = eVar.H;
            AndroidComposeView androidComposeView = eVar.f303c;
            a2.s sVar = eVar.f301a;
            o oVarY = i0Var.y();
            int i13 = i0Var.f56880b;
            if (oVar != null) {
                Object objG = oVar.f28691a.g(x.E);
                if (objG == null) {
                    objG = null;
                }
                j3.h hVar3 = (j3.h) objG;
                if (hVar3 != null) {
                    str = hVar3.f35700b;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (oVarY != null) {
                Object objG2 = oVarY.f28691a.g(x.E);
                if (objG2 == null) {
                    objG2 = null;
                }
                j3.h hVar4 = (j3.h) objG2;
                if (hVar4 != null) {
                    str2 = hVar4.f35700b;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str != str2) {
                if (str == null) {
                    sVar.e(androidComposeView, i13, true);
                } else if (str2 == null) {
                    sVar.e(androidComposeView, i13, false);
                } else if (kotlin.jvm.internal.m.a((a2.f) w.d(oVarY, x.f28726r), a2.p.f313a)) {
                    sVar.b(androidComposeView, i13, a2.j.a(str2));
                }
            }
            if (oVar != null) {
                Object objG3 = oVar.f28691a.g(x.J);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar = (i3.a) objG3;
            } else {
                aVar = null;
            }
            if (oVarY != null) {
                Object objG4 = oVarY.f28691a.g(x.J);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar2 = (i3.a) objG4;
            } else {
                aVar2 = null;
            }
            if (aVar != aVar2) {
                if (aVar == null) {
                    sVar.e(androidComposeView, i13, true);
                } else if (aVar2 == null) {
                    sVar.e(androidComposeView, i13, false);
                } else if (kotlin.jvm.internal.m.a((a2.f) w.d(oVarY, x.f28726r), a2.p.f314b)) {
                    int i14 = a2.b.f296a[aVar2.ordinal()];
                    Boolean bool = i14 != 1 ? i14 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        sVar.b(androidComposeView, i13, a2.j.b(bool.booleanValue()));
                    }
                }
            }
            if (oVar != null) {
                Object objG5 = oVar.f28691a.g(x.f28727s);
                if (objG5 == null) {
                    objG5 = null;
                }
                hVar = (a2.h) objG5;
            } else {
                hVar = null;
            }
            if (oVarY != null) {
                Object objG6 = oVarY.f28691a.g(x.f28727s);
                if (objG6 == null) {
                    objG6 = null;
                }
                hVar2 = (a2.h) objG6;
            } else {
                hVar2 = null;
            }
            if (!kotlin.jvm.internal.m.a(hVar, hVar2)) {
                if (hVar == null) {
                    sVar.e(androidComposeView, i13, true);
                } else if (hVar2 == null) {
                    sVar.e(androidComposeView, i13, false);
                } else {
                    sVar.b(androidComposeView, i13, hVar2.f310a);
                }
            }
            boolean z11 = oVar != null && oVar.f28691a.b(x.f28725q);
            boolean z12 = oVarY != null && oVarY.f28691a.b(x.f28725q);
            if (z11 != z12) {
                if (z12) {
                    yVar.a(i13);
                } else {
                    yVar.e(i13);
                }
            }
        }
    }
}
