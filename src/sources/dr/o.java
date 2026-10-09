package dr;

import android.content.Context;
import au.c1;
import au.z0;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ProgressGetSRSRecordResponse;
import dv.u0;
import fr.o0;
import kotlin.NoWhenBranchMatchedException;
import qy.b0;
import qy.q;
import vt.n0;
import vt.v0;
import xt.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f23580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f23581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f23582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f23583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f23584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f23585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f23586g = com.bumptech.glide.d.v(new cr.n(this, 6));

    public o(z0 z0Var, c1 c1Var, n0 n0Var, u0 u0Var, v0 v0Var, Context context) {
        this.f23580a = z0Var;
        this.f23581b = c1Var;
        this.f23582c = n0Var;
        this.f23583d = u0Var;
        this.f23584e = v0Var;
        this.f23585f = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (((fr.o0) r5).U(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dr.o r5, xy.c r6) {
        /*
            boolean r0 = r6 instanceof dr.l
            if (r0 == 0) goto L13
            r0 = r6
            dr.l r0 = (dr.l) r0
            int r1 = r0.f23572c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23572c = r1
            goto L18
        L13:
            dr.l r0 = new dr.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f23570a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f23572c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.bumptech.glide.e.F(r6)
            goto L4a
        L36:
            com.bumptech.glide.e.F(r6)
            qy.q r6 = r5.f23586g
            java.lang.Object r6 = r6.getValue()
            dr.k r6 = (dr.k) r6
            r0.f23572c = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            vt.n0 r5 = r5.f23582c
            r0.f23572c = r3
            fr.o0 r5 = (fr.o0) r5
            java.lang.Object r5 = r5.U(r0)
            if (r5 != r1) goto L57
        L56:
            return r1
        L57:
            qy.b0 r5 = qy.b0.f48488a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.o.a(dr.o, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:18:0x003c, B:23:0x0048, B:44:0x00a8, B:26:0x0050, B:41:0x0094, B:27:0x0054, B:33:0x006f, B:36:0x0076, B:38:0x007a, B:47:0x00b7, B:48:0x00bc, B:30:0x005b), top: B:58:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:18:0x003c, B:23:0x0048, B:44:0x00a8, B:26:0x0050, B:41:0x0094, B:27:0x0054, B:33:0x006f, B:36:0x0076, B:38:0x007a, B:47:0x00b7, B:48:0x00bc, B:30:0x005b), top: B:58:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:18:0x003c, B:23:0x0048, B:44:0x00a8, B:26:0x0050, B:41:0x0094, B:27:0x0054, B:33:0x006f, B:36:0x0076, B:38:0x007a, B:47:0x00b7, B:48:0x00bc, B:30:0x005b), top: B:58:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(o oVar, xy.c cVar) {
        n nVar;
        ApiResponse apiResponse;
        k kVar;
        q qVar = oVar.f23586g;
        n0 n0Var = oVar.f23582c;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i11 = nVar.f23579d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f23579d = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(oVar, cVar);
            }
        } else {
            nVar = new n(oVar, cVar);
        }
        Object objW = nVar.f23577b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        try {
            try {
                switch (nVar.f23579d) {
                    case 0:
                        com.bumptech.glide.e.F(objW);
                        u0 u0Var = oVar.f23583d;
                        String strW = ((o0) n0Var).w();
                        nVar.f23579d = 1;
                        objW = u0Var.w(strW, nVar);
                        if (objW == aVar) {
                            return aVar;
                        }
                        apiResponse = (ApiResponse) objW;
                        if (!(apiResponse instanceof ApiResponse.Error)) {
                            if (apiResponse instanceof ApiResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String srs_record = ((ProgressGetSRSRecordResponse) ((ApiResponse.Success) apiResponse).getData()).getSrs_record();
                            v0 v0Var = oVar.f23584e;
                            nVar.f23576a = null;
                            nVar.f23579d = 2;
                            objW = t.e(srs_record, v0Var, nVar);
                            if (objW == aVar) {
                                return aVar;
                            }
                            kVar = (k) qVar.getValue();
                            nVar.f23576a = null;
                            nVar.f23579d = 3;
                            if (kVar.g(nVar) == aVar) {
                                return aVar;
                            }
                            nVar.f23576a = null;
                            nVar.f23579d = 4;
                            if (((o0) n0Var).U(nVar) == aVar) {
                                return aVar;
                            }
                        }
                        return b0.f48488a;
                    case 1:
                        com.bumptech.glide.e.F(objW);
                        apiResponse = (ApiResponse) objW;
                        if (!(apiResponse instanceof ApiResponse.Error)) {
                            if (apiResponse instanceof ApiResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String srs_record2 = ((ProgressGetSRSRecordResponse) ((ApiResponse.Success) apiResponse).getData()).getSrs_record();
                            v0 v0Var2 = oVar.f23584e;
                            nVar.f23576a = null;
                            nVar.f23579d = 2;
                            objW = t.e(srs_record2, v0Var2, nVar);
                            if (objW == aVar) {
                                return aVar;
                            }
                            kVar = (k) qVar.getValue();
                            nVar.f23576a = null;
                            nVar.f23579d = 3;
                            if (kVar.g(nVar) == aVar) {
                                return aVar;
                            }
                            nVar.f23576a = null;
                            nVar.f23579d = 4;
                            if (((o0) n0Var).U(nVar) == aVar) {
                                return aVar;
                            }
                        }
                        return b0.f48488a;
                    case 2:
                        com.bumptech.glide.e.F(objW);
                        kVar = (k) qVar.getValue();
                        nVar.f23576a = null;
                        nVar.f23579d = 3;
                        if (kVar.g(nVar) == aVar) {
                            return aVar;
                        }
                        nVar.f23576a = null;
                        nVar.f23579d = 4;
                        if (((o0) n0Var).U(nVar) == aVar) {
                            return aVar;
                        }
                        return b0.f48488a;
                    case 3:
                        com.bumptech.glide.e.F(objW);
                        nVar.f23576a = null;
                        nVar.f23579d = 4;
                        if (((o0) n0Var).U(nVar) == aVar) {
                            return aVar;
                        }
                        return b0.f48488a;
                    case 4:
                        com.bumptech.glide.e.F(objW);
                        return b0.f48488a;
                    case 5:
                        e = nVar.f23576a;
                        com.bumptech.glide.e.F(objW);
                        nVar.f23576a = e;
                        nVar.f23579d = 6;
                        if (((o0) n0Var).U(nVar) == aVar) {
                            return aVar;
                        }
                        return b0.f48488a;
                    case 6:
                        Exception exc = nVar.f23576a;
                        com.bumptech.glide.e.F(objW);
                        return b0.f48488a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e8) {
                e = e8;
                k kVar2 = (k) qVar.getValue();
                nVar.f23576a = e;
                nVar.f23579d = 5;
                if (kVar2.g(nVar) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            throw oVar;
        }
    }
}
