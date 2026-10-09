package x2;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import w2.l1;
import y.e0;
import y2.i0;
import y2.n;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f55754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.e f55755b = new n1.e(new y2.c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.e f55756c = new n1.e(new h[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1.e f55757d = new n1.e(new i0[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1.e f55758e = new n1.e(new h[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55759f;

    public d(AndroidComposeView androidComposeView) {
        this.f55754a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(q qVar, h hVar, HashSet hashSet) {
        if (!qVar.f58482a.P) {
            v2.a.b("visitSubtreeIf called on an unattached node");
        }
        n1.e eVar = new n1.e(new q[16]);
        q qVar2 = qVar.f58482a;
        q qVar3 = qVar2.f58487f;
        if (qVar3 == null) {
            y2.f.b(eVar, qVar2);
        } else {
            eVar.c(qVar3);
        }
        while (true) {
            int i11 = eVar.f43114c;
            if (i11 == 0) {
                return;
            }
            q qVar4 = (q) eVar.l(i11 - 1);
            if ((qVar4.f58485d & 32) != 0) {
                q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.P) {
                        if ((qVar5.f58484c & 32) != 0) {
                            ?? F = qVar5;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof e) {
                                    e eVar3 = (e) F;
                                    if (eVar3 instanceof y2.c) {
                                        y2.c cVar = (y2.c) eVar3;
                                        if ((cVar.Q instanceof c) && cVar.S.contains(hVar)) {
                                            hashSet.add(eVar3);
                                        }
                                    }
                                    if (eVar3.X().n(hVar)) {
                                        break;
                                    }
                                } else if ((F.f58484c & 32) != 0 && (F instanceof n)) {
                                    q qVar6 = ((n) F).R;
                                    int i12 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.f58484c & 32) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar2 = eVar2;
                                                F = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new n1.e(new q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.c(F);
                                                    F = 0;
                                                }
                                                eVar2.c(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f58487f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = y2.f.f(eVar2);
                            }
                        }
                        qVar5 = qVar5.f58487f;
                    }
                }
            }
            y2.f.b(eVar, qVar4);
        }
    }

    public final void a() {
        if (this.f55759f) {
            return;
        }
        this.f55759f = true;
        l1 l1Var = new l1(this, 3);
        e0 e0Var = this.f55754a.Y0;
        if (e0Var.g(l1Var) >= 0) {
            return;
        }
        e0Var.a(l1Var);
    }
}
