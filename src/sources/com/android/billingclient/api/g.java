package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7507c;

    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:27:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.android.billingclient.api.g r13, qy.b r14, xy.a r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.g.a(com.android.billingclient.api.g, qy.b, xy.a):java.lang.Object");
    }

    public h00.m b() {
        h00.m zVar;
        Object obj;
        a.a aVar = (a.a) this.f7507c;
        byte bI = aVar.I();
        if (bI == 1) {
            return d(true);
        }
        if (bI == 0) {
            return d(false);
        }
        if (bI != 6) {
            if (bI == 8) {
                return c();
            }
            a.a.u(aVar, "Cannot read Json element because of unexpected ".concat(i00.j.s(bI)), 0, null, 6);
            throw null;
        }
        int i11 = this.f7506b + 1;
        this.f7506b = i11;
        if (i11 == 200) {
            i00.r rVar = new i00.r(this, null);
            wy.a aVar2 = qy.a.f48483a;
            qy.b bVar = new qy.b();
            bVar.f48485a = rVar;
            bVar.f48486b = bVar;
            wy.a aVar3 = qy.a.f48483a;
            bVar.f48487c = aVar3;
            while (true) {
                obj = bVar.f48487c;
                vy.d dVar = bVar.f48486b;
                if (dVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.m.a(aVar3, obj)) {
                    try {
                        i00.r rVar2 = bVar.f48485a;
                        kotlin.jvm.internal.c0.d(3, rVar2);
                        i00.r rVar3 = new i00.r(rVar2.f33934c, dVar);
                        rVar3.f33933b = bVar;
                        Object objInvokeSuspend = rVar3.invokeSuspend(qy.b0.f48488a);
                        if (objInvokeSuspend != wy.a.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th2) {
                        dVar.resumeWith(com.bumptech.glide.e.l(th2));
                    }
                } else {
                    bVar.f48487c = aVar3;
                    dVar.resumeWith(obj);
                }
            }
            com.bumptech.glide.e.F(obj);
            zVar = (h00.m) obj;
        } else {
            byte bM = aVar.m((byte) 6);
            if (aVar.I() == 4) {
                a.a.u(aVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.i()) {
                String strQ = this.f7505a ? aVar.q() : aVar.p();
                aVar.m((byte) 5);
                linkedHashMap.put(strQ, b());
                bM = aVar.l();
                if (bM != 4) {
                    if (bM == 7) {
                        break;
                    }
                    a.a.u(aVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bM == 6) {
                aVar.m((byte) 7);
            } else if (bM == 4) {
                i00.j.l(aVar, "object");
                throw null;
            }
            zVar = new h00.z(linkedHashMap);
        }
        this.f7506b--;
        return zVar;
    }

    public h00.e c() {
        a.a aVar = (a.a) this.f7507c;
        byte bL = aVar.l();
        if (aVar.I() == 4) {
            a.a.u(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.i()) {
            arrayList.add(b());
            bL = aVar.l();
            if (bL != 4) {
                boolean z11 = bL == 9;
                int i11 = aVar.f5b;
                if (!z11) {
                    a.a.u(aVar, "Expected end of the array or comma", i11, null, 4);
                    throw null;
                }
            }
        }
        if (bL == 8) {
            aVar.m((byte) 9);
        } else if (bL == 4) {
            i00.j.l(aVar, "array");
            throw null;
        }
        return new h00.e(arrayList);
    }

    public h00.d0 d(boolean z11) {
        a.a aVar = (a.a) this.f7507c;
        String strQ = (this.f7505a || !z11) ? aVar.q() : aVar.p();
        return (z11 || !kotlin.jvm.internal.m.a(strQ, "null")) ? new h00.t(strQ, z11, null) : h00.w.INSTANCE;
    }
}
