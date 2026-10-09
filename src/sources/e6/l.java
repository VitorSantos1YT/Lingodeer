package e6;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.lingodeer.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz.h f24959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xq.c f24960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f24961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n6.a f24962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f24963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.k1 f24965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.k1 f24966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f24967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rz.h1 f24968l;
    public final uz.i1 m;

    public l(xq.c cVar, c cVar2, Bundle bundle, int i11) {
        bundle = (i11 & 4) != 0 ? null : bundle;
        n6.f fVar = n6.f.f43456a;
        r1 r1Var = (r1) cVar.f56176d;
        this.f24957a = vc.a.f(cVar2.f24881a);
        this.f24958b = new AtomicBoolean(true);
        this.f24959c = qx.p.b(Integer.MAX_VALUE, 6, null);
        this.f24960d = cVar;
        this.f24961e = cVar2;
        this.f24962f = fVar;
        this.f24963g = r1Var;
        this.f24964h = true;
        int i12 = cVar2.f24881a;
        if (Integer.MIN_VALUE <= i12 && i12 < -1) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        l1.g gVar = l1.g.f39300d;
        this.f24965i = new l1.k1(null, gVar);
        this.f24966j = new l1.k1(bundle, gVar);
        this.f24967k = ry.s.f50855a;
        this.f24968l = rz.e0.d();
        this.m = uz.x0.c(null);
    }

    public final void a(Context context, Throwable th2) {
        if (!this.f24964h) {
            throw th2;
        }
        int i11 = this.f24961e.f24881a;
        this.f24960d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i11, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        if (r15.b(r5) == r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        if (r15.b(r5) == r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        if (r15.b(r5) == r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        if (r15.b(r5) == r6) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r19, c6.i r20, xy.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.l.b(android.content.Context, c6.i, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final Object c(Context context, Object obj, xy.c cVar) throws Throwable {
        i iVar;
        x1.b bVarC;
        x1.b bVarC2;
        l lVar;
        x1.b bVarC3;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f24936d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f24936d = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objC = iVar.f24934b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f24936d;
        qy.b0 b0Var = qy.b0.f48488a;
        qy.b0 b0Var2 = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            boolean z11 = obj instanceof f;
            String str = this.f24957a;
            if (!z11) {
                if (obj instanceof e) {
                    x1.f fVarJ = x1.l.j();
                    x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
                    if (bVar == null || (bVarC2 = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        x1.f fVarJ2 = bVarC2.j();
                        try {
                            this.f24966j.setValue(((e) obj).f24890a);
                            x1.f.q(fVarJ2);
                            bVarC2.w().d();
                            bVarC2.c();
                            return b0Var;
                        } catch (Throwable th2) {
                            x1.f.q(fVarJ2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        bVarC2.c();
                        throw th3;
                    }
                }
                if (obj instanceof d) {
                    x1.f fVarJ3 = x1.l.j();
                    x1.b bVar2 = fVarJ3 instanceof x1.b ? (x1.b) fVarJ3 : null;
                    if (bVar2 == null || (bVarC = bVar2.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        x1.f fVarJ4 = bVarC.j();
                        try {
                            List list = (List) this.f24967k.get(((d) obj).f24887a);
                            if (list != null) {
                                Iterator it = list.iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                                b0Var2 = b0Var;
                            }
                            x1.f.q(fVarJ4);
                            bVarC.w().d();
                            bVarC.c();
                            if (b0Var2 == null) {
                                xy.f.a(Log.w("AppWidgetSession", defpackage.e.p(new StringBuilder("Triggering Action("), ((d) obj).f24887a, ") for session(", str, ") failed")));
                                return b0Var;
                            }
                        } catch (Throwable th4) {
                            x1.f.q(fVarJ4);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        bVarC.c();
                        throw th5;
                    }
                } else {
                    if (!(obj instanceof g)) {
                        throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                    }
                    rz.h1 h1Var = ((g) obj).f24909a;
                    if (h1Var.isActive()) {
                        h1Var.J(b0Var);
                    }
                }
                return b0Var;
            }
            n6.h hVar = (n6.h) this.f24960d.f56175c;
            if (hVar != null) {
                iVar.f24933a = this;
                iVar.f24936d = 1;
                objC = ((n6.f) this.f24962f).c(context, hVar, str, iVar);
                if (objC == aVar) {
                    return aVar;
                }
                lVar = this;
            } else {
                lVar = this;
                objC = null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = iVar.f24933a;
            com.bumptech.glide.e.F(objC);
        }
        x1.f fVarJ5 = x1.l.j();
        x1.b bVar3 = fVarJ5 instanceof x1.b ? (x1.b) fVarJ5 : null;
        if (bVar3 == null || (bVarC3 = bVar3.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            x1.f fVarJ6 = bVarC3.j();
            try {
                lVar.f24965i.setValue(objC);
                x1.f.q(fVarJ6);
                bVarC3.w().d();
                bVarC3.c();
                return b0Var;
            } catch (Throwable th6) {
                x1.f.q(fVarJ6);
                throw th6;
            }
        } catch (Throwable th7) {
            bVarC3.c();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: ClosedReceiveChannelException -> 0x008f, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x008f, blocks: (B:13:0x002e, B:22:0x0058, B:26:0x006f, B:28:0x0077, B:18:0x0046, B:21:0x004d), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r5.c(r2, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r8, a0.j r9, xy.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof m6.g
            if (r0 == 0) goto L13
            r0 = r10
            m6.g r0 = (m6.g) r0
            int r1 = r0.f40890t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40890t = r1
            goto L18
        L13:
            m6.g r0 = new m6.g
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f40888e
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f40890t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            tz.c r8 = r0.f40887d
            fz.c r9 = r0.f40886c
            android.content.Context r2 = r0.f40885b
            e6.l r5 = r0.f40884a
            com.bumptech.glide.e.F(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
        L31:
            r10 = r2
            r2 = r8
            r8 = r10
            r10 = r5
            goto L58
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            tz.c r8 = r0.f40887d
            fz.c r9 = r0.f40886c
            android.content.Context r2 = r0.f40885b
            e6.l r5 = r0.f40884a
            com.bumptech.glide.e.F(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            goto L6f
        L4a:
            com.bumptech.glide.e.F(r10)
            tz.h r10 = r7.f24959c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r10.getClass()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            tz.c r2 = new tz.c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r2.<init>(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r10 = r7
        L58:
            r0.f40884a = r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40885b = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40886c = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40887d = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40890t = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            java.lang.Object r5 = r2.a(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            if (r5 != r1) goto L69
            goto L8e
        L69:
            r6 = r2
            r2 = r8
            r8 = r6
            r6 = r5
            r5 = r10
            r10 = r6
        L6f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            boolean r10 = r10.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r8.c()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r9.invoke(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40884a = r5     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40885b = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40886c = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40887d = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            r0.f40890t = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            java.lang.Object r10 = r5.c(r2, r10, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L8f
            if (r10 != r1) goto L31
        L8e:
            return r1
        L8f:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.l.d(android.content.Context, a0.j, xy.c):java.lang.Object");
    }

    public final Object e(Object obj, xy.c cVar) {
        Object objF = this.f24959c.f(obj, cVar);
        return objF == wy.a.COROUTINE_SUSPENDED ? objF : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) {
        k kVar;
        g gVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f24952d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f24952d = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f24950b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar.f24952d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            g gVar2 = new g(new rz.h1(this.f24968l));
            kVar.f24949a = gVar2;
            kVar.f24952d = 1;
            if (e(gVar2, kVar) == obj2) {
                return obj2;
            }
            gVar = gVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = kVar.f24949a;
            com.bumptech.glide.e.F(obj);
        }
        return gVar.f24909a;
    }
}
