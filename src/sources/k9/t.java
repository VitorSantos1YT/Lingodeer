package k9;

import android.content.Context;
import b0.c2;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import j9.v;
import java.util.Iterator;
import java.util.List;
import l1.b1;
import l1.b3;
import l1.k1;
import rz.b0;
import y.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b3 f38021f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f38022t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, b3 b3Var, Object obj5, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38016a = i11;
        this.f38017b = obj;
        this.f38018c = obj2;
        this.f38019d = obj3;
        this.f38020e = obj4;
        this.f38021f = b3Var;
        this.f38022t = obj5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38016a) {
            case 0:
                return new t((c2) this.f38017b, (v) this.f38018c, (j9.e) this.f38019d, (c0) this.f38020e, this.f38021f, (i) this.f38022t, dVar, 0);
            case 1:
                return new t((Integer) this.f38017b, (Integer) this.f38018c, (b1) this.f38019d, (b1) this.f38020e, (b1) this.f38021f, (b1) this.f38022t, dVar, 1);
            case 2:
                return new t((PermissionState) this.f38017b, (b1) this.f38018c, (Context) this.f38019d, (b1) this.f38020e, (b1) this.f38021f, (b1) this.f38022t, dVar, 2);
            case 3:
                return new t(this.f38021f, (b3) this.f38017b, (b1) this.f38018c, (b3) this.f38019d, (b3) this.f38020e, (b3) this.f38022t, dVar);
            default:
                return new t((ni.h) this.f38017b, (fz.a) this.f38018c, (ur.a) this.f38019d, (Context) this.f38020e, (b1) this.f38021f, (String) this.f38022t, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38016a) {
            case 0:
                t tVar = (t) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                tVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                t tVar2 = (t) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                tVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                t tVar3 = (t) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                tVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                t tVar4 = (t) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                tVar4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                t tVar5 = (t) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                tVar5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i11 = this.f38016a;
        String str3 = null;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f38020e;
        Object obj3 = this.f38022t;
        Object obj4 = this.f38019d;
        Object obj5 = this.f38018c;
        Object obj6 = this.f38017b;
        b3 b3Var = this.f38021f;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                c2 c2Var = (c2) obj6;
                Object objY = c2Var.f3458a.Y();
                k1 k1Var = c2Var.f3461d;
                if (kotlin.jvm.internal.m.a(objY, k1Var.getValue()) && (((j9.e) ((v) obj5).f36257b.f41075f.j()) == null || kotlin.jvm.internal.m.a(k1Var.getValue(), (j9.e) obj4))) {
                    i iVar = (i) obj3;
                    Iterator it = ((List) b3Var.getValue()).iterator();
                    while (it.hasNext()) {
                        iVar.b().c((j9.e) it.next());
                    }
                    c0 c0Var = (c0) obj2;
                    long[] jArr = c0Var.f56670a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j11 = jArr[i12];
                            char c11 = 7;
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((j11 & 255) < 128) {
                                        int i15 = (i12 << 3) + i14;
                                        str2 = str3;
                                        Object obj7 = c0Var.f56671b[i15];
                                        float f5 = c0Var.f56672c[i15];
                                        if (!kotlin.jvm.internal.m.a((String) obj7, ((j9.e) k1Var.getValue()).f36192f)) {
                                            c0Var.f56674e--;
                                            long[] jArr2 = c0Var.f56670a;
                                            int i16 = c0Var.f56673d;
                                            int i17 = i15 >> 3;
                                            int i18 = (i15 & 7) << 3;
                                            long j12 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
                                            jArr2[i17] = j12;
                                            jArr2[(((i15 - 7) & i16) + (i16 & 7)) >> 3] = j12;
                                            c0Var.f56671b[i15] = str2;
                                        }
                                        j11 >>= 8;
                                        i14++;
                                        str3 = str2;
                                        c11 = c11;
                                    } else {
                                        str2 = str3;
                                    }
                                    j11 >>= 8;
                                    i14++;
                                    str3 = str2;
                                    c11 = c11;
                                }
                                str = str3;
                                if (i13 != 8) {
                                    break;
                                }
                            } else {
                                str = str3;
                            }
                            if (i12 != length) {
                                i12++;
                                str3 = str;
                            }
                        }
                    }
                }
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Integer) obj6) == null && ((Integer) obj5) == null) {
                    ((b1) obj4).setValue(null);
                    ((b1) obj2).setValue(null);
                    ((b1) b3Var).setValue(null);
                    ((b1) obj3).setValue(null);
                }
                break;
            case 2:
                b1 b1Var = (b1) obj5;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (PermissionsUtilKt.b(((PermissionState) obj6).getStatus()) && !((Boolean) b1Var.getValue()).booleanValue()) {
                    ls.f.c((Context) obj4, (b1) obj2, (b1) b3Var, (b1) obj3);
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                com.android.billingclient.api.o oVar = (com.android.billingclient.api.o) b3Var.getValue();
                if (oVar != null) {
                    b1 b1Var2 = (b1) obj5;
                    b3 b3Var2 = (b3) obj4;
                    b3 b3Var3 = (b3) obj2;
                    b3 b3Var4 = (b3) obj3;
                    String str4 = oVar.f7564c;
                    com.android.billingclient.api.o oVar2 = (com.android.billingclient.api.o) ((b3) obj6).getValue();
                    if (!kotlin.jvm.internal.m.a(str4, oVar2 != null ? oVar2.f7564c : null)) {
                        com.android.billingclient.api.o oVar3 = (com.android.billingclient.api.o) b3Var2.getValue();
                        if (!kotlin.jvm.internal.m.a(str4, oVar3 != null ? oVar3.f7564c : null)) {
                            com.android.billingclient.api.o oVar4 = (com.android.billingclient.api.o) b3Var3.getValue();
                            if (!kotlin.jvm.internal.m.a(str4, oVar4 != null ? oVar4.f7564c : null)) {
                                com.android.billingclient.api.o oVar5 = (com.android.billingclient.api.o) b3Var4.getValue();
                                if (kotlin.jvm.internal.m.a(str4, oVar5 != null ? oVar5.f7564c : null)) {
                                    b1Var2.setValue(yg.p.SIX_MONTHS);
                                }
                            } else {
                                b1Var2.setValue(yg.p.LIFETIME);
                            }
                        } else {
                            b1Var2.setValue(yg.p.MONTHLY);
                        }
                    } else {
                        b1Var2.setValue(yg.p.ANNUALLY);
                    }
                }
                break;
            default:
                b1 b1Var3 = (b1) b3Var;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ni.h hVar = (ni.h) obj6;
                if (hVar instanceof ni.d) {
                    b1Var3.setValue(Boolean.TRUE);
                } else if (hVar instanceof ni.e) {
                    b1Var3.setValue(Boolean.FALSE);
                } else if (!(hVar instanceof ni.f)) {
                    ((ur.a) obj4).c("jxz_enter_subscribe", new ar.a((String) obj3, 13));
                    Context context = (Context) obj2;
                    kotlin.jvm.internal.m.f(context, "context");
                    se.m mVar = new se.m(context, (String) null);
                    if (!qf.a.b(mVar)) {
                        try {
                            mVar.d("activate_b_event", null);
                        } catch (Throwable th2) {
                            qf.a.a(mVar, th2);
                        }
                    }
                } else {
                    b1Var3.setValue(Boolean.FALSE);
                    ((fz.a) obj5).invoke();
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b3 b3Var, b3 b3Var2, b1 b1Var, b3 b3Var3, b3 b3Var4, b3 b3Var5, vy.d dVar) {
        super(2, dVar);
        this.f38016a = 3;
        this.f38021f = b3Var;
        this.f38017b = b3Var2;
        this.f38018c = b1Var;
        this.f38019d = b3Var3;
        this.f38020e = b3Var4;
        this.f38022t = b3Var5;
    }
}
