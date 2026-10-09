package pl;

import a9.i;
import fv.e;
import gv.h;
import kotlin.NoWhenBranchMatchedException;
import qy.b0;
import qy.j;
import rz.e0;
import rz.o0;
import se.k;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements s10.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p20.c f46951b = new p20.c(25);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d f46952c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46953a = com.bumptech.glide.d.u(j.SYNCHRONIZED, new b());

    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:12:0x002b, B:25:0x006d, B:28:0x0075, B:30:0x0079, B:33:0x007f, B:35:0x0083, B:36:0x0088), top: B:42:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:12:0x002b, B:25:0x006d, B:28:0x0075, B:30:0x0079, B:33:0x007f, B:35:0x0083, B:36:0x0088), top: B:42:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:12:0x002b, B:25:0x006d, B:28:0x0075, B:30:0x0079, B:33:0x007f, B:35:0x0083, B:36:0x0088), top: B:42:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:12:0x002b, B:25:0x006d, B:28:0x0075, B:30:0x0079, B:33:0x007f, B:35:0x0083, B:36:0x0088), top: B:42:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qy.h] */
    public final Object a(String str, String str2, String str3, e eVar, xy.c cVar) {
        c cVar2;
        e eVar2;
        gv.d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f46950d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f46950d = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objM = cVar2.f46948b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f46950d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            if (str3 != null) {
                try {
                    gv.e eVar3 = (gv.e) this.f46953a.getValue();
                    cVar2.f46947a = eVar;
                    cVar2.f46950d = 1;
                    h hVar = (h) eVar3;
                    hVar.getClass();
                    f fVar = o0.f50940a;
                    objM = e0.M(yz.e.f58387a, new b0.f(hVar, str, str2, str3, (vy.d) null, 26), cVar2);
                    if (objM == aVar) {
                        return aVar;
                    }
                    eVar2 = eVar;
                    dVar = (gv.d) objM;
                    if (dVar instanceof gv.c) {
                        if (eVar2 != null) {
                            eVar2.g();
                            return b0Var;
                        }
                    } else {
                        if (dVar instanceof gv.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (eVar2 != null) {
                            eVar2.r();
                            return b0Var;
                        }
                    }
                } catch (Exception unused) {
                    eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.r();
                    }
                }
            } else if (eVar != null) {
                eVar.r();
                return b0Var;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = cVar2.f46947a;
            try {
                com.bumptech.glide.e.F(objM);
                dVar = (gv.d) objM;
                if (dVar instanceof gv.c) {
                    if (eVar2 != null) {
                        eVar2.g();
                        return b0Var;
                    }
                } else {
                    if (dVar instanceof gv.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eVar2 != null) {
                        eVar2.r();
                        return b0Var;
                    }
                }
            } catch (Exception unused2) {
                if (eVar2 != null) {
                    eVar2.r();
                }
            }
        }
        return b0Var;
    }

    @Override // s10.a
    public final i e() {
        return k.o();
    }
}
