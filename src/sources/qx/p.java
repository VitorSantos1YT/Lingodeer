package qx;

import a0.e1;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.s2;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.api.Service;
import com.google.firebase.database.DatabaseReference;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d1.g0;
import g2.f0;
import g2.v;
import h1.r0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import j0.e2;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kv.e0;
import kv.u0;
import kv.v0;
import kv.w0;
import kv.x;
import kv.x0;
import kv.y0;
import l1.b1;
import l1.c0;
import l1.h0;
import l1.s;
import l1.t;
import l1.x1;
import m1.l0;
import rz.b0;
import s0.o0;
import w2.l1;
import z1.r;
import z2.g1;
import z2.p2;
import z3.a0;
import z3.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile bq.m f48482a;

    public static w5.b A(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j11;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i11 = byteBufferDuplicate.getShort() & 65535;
        if (i11 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                j11 = -1;
                break;
            }
            int i13 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i13) {
                break;
            }
            i12++;
        }
        if (j11 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j11 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i14 = 0; i14 < j12; i14++) {
                int i15 = byteBufferDuplicate.getInt();
                long j13 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i15 || 1701669481 == i15) {
                    byteBufferDuplicate.position((int) (j13 + j11));
                    w5.b bVar = new w5.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f51943d = byteBufferDuplicate;
                    bVar.f51940a = iPosition;
                    int i16 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f51941b = i16;
                    bVar.f51942c = ((ByteBuffer) bVar.f51943d).getShort(i16);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final g.j B(j.a aVar, fz.c cVar, l1.n nVar) {
        j.a aVar2;
        b1 b1VarH = t.H(aVar, nVar);
        b1 b1VarH2 = t.H(cVar, nVar);
        String str = (String) w1.j.e(new Object[0], null, g.c.f28291b, nVar, 3072, 6);
        s sVar = (s) nVar;
        i.j jVar = (i.j) sVar.j(g.h.f28304a);
        if (jVar == null) {
            sVar.d0(1006590171);
            Object baseContext = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof i.j) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            jVar = (i.j) baseContext;
        } else {
            sVar.d0(1006589303);
        }
        sVar.p(false);
        if (jVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        i.i activityResultRegistry = jVar.getActivityResultRegistry();
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new g.a();
            sVar.o0(objQ);
        }
        g.a aVar3 = (g.a) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new g.j(aVar3, b1VarH);
            sVar.o0(objQ2);
        }
        g.j jVar2 = (g.j) objQ2;
        boolean zH = sVar.h(aVar3) | sVar.h(activityResultRegistry) | sVar.f(str) | sVar.h(aVar) | sVar.f(b1VarH2);
        Object objQ3 = sVar.Q();
        if (zH || objQ3 == gVar) {
            aVar2 = aVar;
            objQ3 = new g.b(aVar3, activityResultRegistry, str, aVar2, b1VarH2, 0);
            sVar.o0(objQ3);
        } else {
            aVar2 = aVar;
        }
        fz.c cVar2 = (fz.c) objQ3;
        boolean zF = sVar.f(activityResultRegistry) | sVar.f(str) | sVar.f(aVar2);
        Object objQ4 = sVar.Q();
        if (zF || objQ4 == gVar) {
            objQ4 = new h0(cVar2);
            sVar.o0(objQ4);
        }
        return jVar2;
    }

    public static final void C(l0 l0Var, int i11, Object obj) {
        l0Var.f40801h[(l0Var.f40802i - l0Var.f40797d[l0Var.f40798e - 1].f40794b) + i11] = obj;
    }

    public static final void D(l0 l0Var, int i11, Object obj, int i12, Object obj2) {
        int i13 = l0Var.f40802i - l0Var.f40797d[l0Var.f40798e - 1].f40794b;
        Object[] objArr = l0Var.f40801h;
        objArr[i11 + i13] = obj;
        objArr[i13 + i12] = obj2;
    }

    public static final boolean F(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return !(dialogActionButtonLayout.getVisibleButtons().length == 0) || vc.a.s(dialogActionButtonLayout.getCheckBoxPrompt());
    }

    public static int G(CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int H(CharSequence charSequence, int i11, int i12) {
        while (i11 >= i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11--;
        }
        return i12 - 1;
    }

    public static final x J(x xVar) {
        e0 e0Var = xVar.f38830a;
        e0 e0VarA = e0.a(e0Var, K(e0Var.f38729a));
        e0 e0Var2 = xVar.f38831b;
        return new x(e0VarA, e0.a(e0Var2, K(e0Var2.f38729a)));
    }

    public static final String K(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (12353 <= cCharAt && cCharAt < 12439) {
                cCharAt = (char) (cCharAt + '`');
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return ry.m.y0(arrayList, BuildConfig.VERSION_NAME, null, null, null, 62);
    }

    public static final x0 L(x0 x0Var) {
        kotlin.jvm.internal.m.f(x0Var, "<this>");
        if (x0Var instanceof v0) {
            String value = K(((v0) x0Var).f38826a);
            kotlin.jvm.internal.m.f(value, "value");
            return new v0(value);
        }
        if (!(x0Var instanceof u0)) {
            if (!(x0Var instanceof w0)) {
                throw new NoWhenBranchMatchedException();
            }
            w0 w0Var = (w0) x0Var;
            return new w0(L(w0Var.f38827a), w0Var.f38828b, w0Var.f38829c);
        }
        u0 u0Var = (u0) x0Var;
        List list = u0Var.f38821b;
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                throw new NoWhenBranchMatchedException();
            }
            throw new ClassCastException();
        }
        y0 key = u0Var.f38820a;
        kotlin.jvm.internal.m.f(key, "key");
        return new u0(key, arrayList, true);
    }

    public static tz.h b(int i11, int i12, tz.a aVar) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            aVar = tz.a.SUSPEND;
        }
        if (i11 == -2) {
            if (aVar != tz.a.SUSPEND) {
                return new tz.q(1, aVar);
            }
            tz.l.D.getClass();
            return new tz.h(tz.k.f52704b);
        }
        if (i11 == -1) {
            if (aVar == tz.a.SUSPEND) {
                return new tz.q(1, tz.a.DROP_OLDEST);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i11 == 0) {
            return aVar == tz.a.SUSPEND ? new tz.h(0) : new tz.q(1, aVar);
        }
        if (i11 != Integer.MAX_VALUE) {
            return aVar == tz.a.SUSPEND ? new tz.h(i11) : new tz.q(i11, aVar);
        }
        return new tz.h(Integer.MAX_VALUE);
    }

    public static final void c(d1.l lVar, z1.e eVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-1090171650);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(lVar) : sVar.h(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        boolean z11 = false;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && sVar.f(lVar))) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object objQ = sVar.Q();
            if (z13 || objQ == l1.m.f39353a) {
                objQ = new d1.k(eVar, lVar);
                sVar.o0(objQ);
            }
            z3.k.a((d1.k) objQ, null, new z(false, true, a0.Inherit, false, false), dVar, sVar, ((i12 << 3) & 7168) | 384, 2);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(lVar, eVar, dVar, i11, 5);
        }
    }

    public static final void d(d1.l lVar, boolean z11, u3.j jVar, boolean z12, long j11, float f5, r rVar, l1.n nVar, int i11) {
        int i12;
        long j12;
        int i13;
        long j13;
        boolean z13;
        s sVar = (s) nVar;
        sVar.f0(-466280168);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(lVar) : sVar.h(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.d(jVar.ordinal()) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(rVar) ? 1048576 : 524288;
        }
        int i14 = 0;
        if (sVar.T(i12 & 1, (533651 & i12) != 533650)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                i13 = i12 & (-57345);
                j13 = 9205357640488583168L;
            } else {
                sVar.W();
                i13 = i12 & (-57345);
                j13 = j11;
            }
            sVar.q();
            if (z11) {
                float f11 = g0.f22911a;
                z13 = (jVar == u3.j.Ltr && !z12) || (jVar == u3.j.Rtl && z12);
            } else {
                float f12 = g0.f22911a;
                z13 = !((jVar == u3.j.Ltr && !z12) || (jVar == u3.j.Rtl && z12));
            }
            z1.g gVar = z13 ? z1.a.f58459b : z1.a.f58458a;
            int i15 = i13 & 14;
            boolean zG = ((i13 & 112) == 32) | (i15 == 4 || ((i13 & 8) != 0 && sVar.h(lVar))) | sVar.g(z13);
            Object objQ = sVar.Q();
            if (zG || objQ == l1.m.f39353a) {
                objQ = new d1.a(i14, lVar, z11, z13);
                sVar.o0(objQ);
            }
            long j14 = j13;
            z1.g gVar2 = gVar;
            j12 = j14;
            c(lVar, gVar2, t1.e.d(1365123137, new d1.e((p2) sVar.j(g1.f58557s), j12, z13, g3.r.b(rVar, false, (fz.c) objQ), lVar), sVar), sVar, i15 | 384);
        } else {
            sVar.W();
            j12 = j11;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d1.b(lVar, z11, jVar, z12, j12, f5, rVar, i11);
        }
    }

    public static final void e(int i11, fz.a aVar, l1.n nVar, r rVar, boolean z11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(2111672474);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.h(aVar) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            j0.c.g(sVar, z1.a.a(e2.p(rVar, g0.f22911a, g0.f22912b), new d1.h(aVar, z11)));
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.j(rVar, z11, aVar, i11);
        }
    }

    public static final void f(wg.r state, FrameLayout.LayoutParams layoutParams, boolean z11, wg.q qVar, fz.c cVar, fz.c cVar2, wg.b bVar, wg.a aVar, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(state, "state");
        s sVar = (s) nVar;
        sVar.f0(-98644133);
        WebView webView = (WebView) state.f55169h.getValue();
        se.i.a(z11 && ((Boolean) qVar.f55160b.getValue()).booleanValue(), new l1(webView, 1), sVar, 0, 0);
        sVar.e0(-113259237);
        if (webView != null) {
            vy.d dVar = null;
            t.g(webView, qVar, new wg.k(qVar, webView, dVar, 0), sVar);
            t.g(webView, state, new sr.d(24, state, webView, dVar), sVar);
        }
        sVar.p(false);
        bVar.getClass();
        bVar.f55124a = state;
        kotlin.jvm.internal.m.f(qVar, "<set-?>");
        bVar.f55125b = qVar;
        aVar.getClass();
        aVar.f55123a = state;
        g.b bVar2 = new g.b(cVar, layoutParams, state, aVar, bVar, 1);
        sVar.e0(1157296644);
        boolean zF = sVar.f(cVar2);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = new e1(cVar2, 5);
            sVar.o0(objQ);
        }
        sVar.p(false);
        y3.h.a(bVar2, z1.o.f58481a, (fz.c) objQ, null, sVar, (i11 >> 3) & 112, 20);
        x1 x1VarT = sVar.t();
        if (x1VarT == null) {
            return;
        }
        x1VarT.f39502d = new wg.l(state, layoutParams, z11, qVar, cVar, cVar2, bVar, aVar, i11);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    public static final void g(wg.r state, r rVar, boolean z11, wg.q qVar, fz.c cVar, fz.c cVar2, wg.b bVar, wg.a aVar, l1.n nVar, int i11, int i12) {
        int i13;
        r rVar2;
        int i14;
        int i15;
        r rVar3;
        Object objQ;
        l1.g gVar;
        b0 b0Var;
        boolean zF;
        Object objQ2;
        wg.q qVar2;
        Object objQ3;
        l1.g gVar2;
        Object objQ4;
        int i16;
        r rVar4;
        boolean z12;
        wg.b bVar2;
        fz.c cVar3;
        wg.a aVar2;
        boolean z13;
        r rVar5;
        s sVar;
        wg.q qVar3;
        fz.c cVar4;
        wg.b bVar3;
        wg.a aVar3;
        x1 x1VarT;
        int i17;
        kotlin.jvm.internal.m.f(state, "state");
        s sVar2 = (s) nVar;
        sVar2.f0(1207954029);
        if ((i11 & 14) == 0) {
            i13 = (sVar2.f(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 112) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i14 = i13 | 384;
            if ((i11 & 7168) == 0) {
                i14 = i13 | 1408;
            }
            if ((57344 & i11) == 0) {
                if (sVar2.h(cVar)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i14 |= i17;
            }
            i15 = 105578496 | i14;
            if ((191739611 & i15) == 38347922 || !sVar2.F()) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    sVar2.e0(-197125857);
                    sVar2.e0(773894976);
                    sVar2.e0(-492369756);
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        c0 c0Var = new c0(t.q(sVar2));
                        sVar2.o0(c0Var);
                        objQ = c0Var;
                    }
                    sVar2.p(false);
                    b0Var = ((c0) objQ).f39245a;
                    sVar2.p(false);
                    sVar2.e0(1157296644);
                    zF = sVar2.f(b0Var);
                    objQ2 = sVar2.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new wg.q(b0Var);
                        sVar2.o0(objQ2);
                    }
                    sVar2.p(false);
                    qVar2 = (wg.q) objQ2;
                    sVar2.p(false);
                    sVar2.e0(-492369756);
                    objQ3 = sVar2.Q();
                    gVar2 = l1.m.f39353a;
                    if (objQ3 == gVar2) {
                        objQ3 = new wg.b();
                        sVar2.o0(objQ3);
                    }
                    sVar2.p(false);
                    wg.b bVar4 = (wg.b) objQ3;
                    sVar2.e0(-492369756);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar2) {
                        objQ4 = new wg.a();
                        sVar2.o0(objQ4);
                    }
                    sVar2.p(false);
                    i16 = i15 & (-33037313);
                    rVar4 = rVar3;
                    z12 = true;
                    bVar2 = bVar4;
                    cVar3 = wg.m.f55147b;
                    aVar2 = (wg.a) objQ4;
                } else {
                    sVar2.W();
                    i16 = i15 & (-33037313);
                    z12 = z11;
                    cVar3 = cVar2;
                    bVar2 = bVar;
                    aVar2 = aVar;
                    rVar4 = rVar2;
                    qVar2 = qVar;
                }
                int i19 = i16;
                sVar2.q();
                wg.n nVar2 = new wg.n(state, z12, qVar2, cVar, cVar3, bVar2, aVar2, i19);
                wg.b bVar5 = bVar2;
                wg.a aVar4 = aVar2;
                wg.q qVar4 = qVar2;
                r rVar6 = rVar4;
                j0.c.a(rVar6, null, t1.e.b(sVar2, -1052274877, nVar2), sVar2, ((i19 >> 3) & 14) | 3072, 6);
                z13 = z12;
                rVar5 = rVar6;
                sVar = sVar2;
                qVar3 = qVar4;
                cVar4 = cVar3;
                bVar3 = bVar5;
                aVar3 = aVar4;
            } else {
                sVar2.W();
                qVar3 = qVar;
                cVar4 = cVar2;
                bVar3 = bVar;
                aVar3 = aVar;
                rVar5 = rVar2;
                sVar = sVar2;
                z13 = z11;
            }
            x1VarT = sVar.t();
            if (x1VarT == null) {
                return;
            }
            x1VarT.f39502d = new r0(state, rVar5, z13, qVar3, cVar, cVar4, bVar3, aVar3, i11, i12, 1);
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i13 | 384;
        if ((i11 & 7168) == 0) {
            i14 = i13 | 1408;
        }
        if ((57344 & i11) == 0) {
            if (sVar2.h(cVar)) {
                i17 = 16384;
            } else {
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i14 |= i17;
        }
        i15 = 105578496 | i14;
        if ((191739611 & i15) == 38347922) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar2.e0(-197125857);
                sVar2.e0(773894976);
                sVar2.e0(-492369756);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    c0 c0Var2 = new c0(t.q(sVar2));
                    sVar2.o0(c0Var2);
                    objQ = c0Var2;
                }
                sVar2.p(false);
                b0Var = ((c0) objQ).f39245a;
                sVar2.p(false);
                sVar2.e0(1157296644);
                zF = sVar2.f(b0Var);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                }
                sVar2.p(false);
                qVar2 = (wg.q) objQ2;
                sVar2.p(false);
                sVar2.e0(-492369756);
                objQ3 = sVar2.Q();
                gVar2 = l1.m.f39353a;
                if (objQ3 == gVar2) {
                    objQ3 = new wg.b();
                    sVar2.o0(objQ3);
                }
                sVar2.p(false);
                wg.b bVar6 = (wg.b) objQ3;
                sVar2.e0(-492369756);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new wg.a();
                    sVar2.o0(objQ4);
                }
                sVar2.p(false);
                i16 = i15 & (-33037313);
                rVar4 = rVar3;
                z12 = true;
                bVar2 = bVar6;
                cVar3 = wg.m.f55147b;
                aVar2 = (wg.a) objQ4;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar2.e0(-197125857);
                sVar2.e0(773894976);
                sVar2.e0(-492369756);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    c0 c0Var3 = new c0(t.q(sVar2));
                    sVar2.o0(c0Var3);
                    objQ = c0Var3;
                }
                sVar2.p(false);
                b0Var = ((c0) objQ).f39245a;
                sVar2.p(false);
                sVar2.e0(1157296644);
                zF = sVar2.f(b0Var);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                }
                sVar2.p(false);
                qVar2 = (wg.q) objQ2;
                sVar2.p(false);
                sVar2.e0(-492369756);
                objQ3 = sVar2.Q();
                gVar2 = l1.m.f39353a;
                if (objQ3 == gVar2) {
                    objQ3 = new wg.b();
                    sVar2.o0(objQ3);
                }
                sVar2.p(false);
                wg.b bVar7 = (wg.b) objQ3;
                sVar2.e0(-492369756);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new wg.a();
                    sVar2.o0(objQ4);
                }
                sVar2.p(false);
                i16 = i15 & (-33037313);
                rVar4 = rVar3;
                z12 = true;
                bVar2 = bVar7;
                cVar3 = wg.m.f55147b;
                aVar2 = (wg.a) objQ4;
            }
            int i110 = i16;
            sVar2.q();
            wg.n nVar3 = new wg.n(state, z12, qVar2, cVar, cVar3, bVar2, aVar2, i110);
            wg.b bVar8 = bVar2;
            wg.a aVar5 = aVar2;
            wg.q qVar5 = qVar2;
            r rVar7 = rVar4;
            j0.c.a(rVar7, null, t1.e.b(sVar2, -1052274877, nVar3), sVar2, ((i110 >> 3) & 14) | 3072, 6);
            z13 = z12;
            rVar5 = rVar7;
            sVar = sVar2;
            qVar3 = qVar5;
            cVar4 = cVar3;
            bVar3 = bVar8;
            aVar3 = aVar5;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar2.e0(-197125857);
                sVar2.e0(773894976);
                sVar2.e0(-492369756);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    c0 c0Var4 = new c0(t.q(sVar2));
                    sVar2.o0(c0Var4);
                    objQ = c0Var4;
                }
                sVar2.p(false);
                b0Var = ((c0) objQ).f39245a;
                sVar2.p(false);
                sVar2.e0(1157296644);
                zF = sVar2.f(b0Var);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                }
                sVar2.p(false);
                qVar2 = (wg.q) objQ2;
                sVar2.p(false);
                sVar2.e0(-492369756);
                objQ3 = sVar2.Q();
                gVar2 = l1.m.f39353a;
                if (objQ3 == gVar2) {
                    objQ3 = new wg.b();
                    sVar2.o0(objQ3);
                }
                sVar2.p(false);
                wg.b bVar9 = (wg.b) objQ3;
                sVar2.e0(-492369756);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new wg.a();
                    sVar2.o0(objQ4);
                }
                sVar2.p(false);
                i16 = i15 & (-33037313);
                rVar4 = rVar3;
                z12 = true;
                bVar2 = bVar9;
                cVar3 = wg.m.f55147b;
                aVar2 = (wg.a) objQ4;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                sVar2.e0(-197125857);
                sVar2.e0(773894976);
                sVar2.e0(-492369756);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    c0 c0Var5 = new c0(t.q(sVar2));
                    sVar2.o0(c0Var5);
                    objQ = c0Var5;
                }
                sVar2.p(false);
                b0Var = ((c0) objQ).f39245a;
                sVar2.p(false);
                sVar2.e0(1157296644);
                zF = sVar2.f(b0Var);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new wg.q(b0Var);
                    sVar2.o0(objQ2);
                }
                sVar2.p(false);
                qVar2 = (wg.q) objQ2;
                sVar2.p(false);
                sVar2.e0(-492369756);
                objQ3 = sVar2.Q();
                gVar2 = l1.m.f39353a;
                if (objQ3 == gVar2) {
                    objQ3 = new wg.b();
                    sVar2.o0(objQ3);
                }
                sVar2.p(false);
                wg.b bVar10 = (wg.b) objQ3;
                sVar2.e0(-492369756);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new wg.a();
                    sVar2.o0(objQ4);
                }
                sVar2.p(false);
                i16 = i15 & (-33037313);
                rVar4 = rVar3;
                z12 = true;
                bVar2 = bVar10;
                cVar3 = wg.m.f55147b;
                aVar2 = (wg.a) objQ4;
            }
            int i111 = i16;
            sVar2.q();
            wg.n nVar4 = new wg.n(state, z12, qVar2, cVar, cVar3, bVar2, aVar2, i111);
            wg.b bVar11 = bVar2;
            wg.a aVar6 = aVar2;
            wg.q qVar6 = qVar2;
            r rVar8 = rVar4;
            j0.c.a(rVar8, null, t1.e.b(sVar2, -1052274877, nVar4), sVar2, ((i111 >> 3) & 14) | 3072, 6);
            z13 = z12;
            rVar5 = rVar8;
            sVar = sVar2;
            qVar3 = qVar6;
            cVar4 = cVar3;
            bVar3 = bVar11;
            aVar3 = aVar6;
        }
        x1VarT = sVar.t();
        if (x1VarT == null) {
            return;
        }
        x1VarT.f39502d = new r0(state, rVar5, z13, qVar3, cVar, cVar4, bVar3, aVar3, i11, i12, 1);
    }

    public static final uz.c h(DatabaseReference databaseReference) {
        kotlin.jvm.internal.m.f(databaseReference, "<this>");
        return uz.x0.g(new kb.e(databaseReference, (vy.d) null, 29));
    }

    public static void k(int i11) {
        if (2 > i11 || i11 >= 37) {
            StringBuilder sbI = w4.c.i(i11, "radix ", " was not in valid range ");
            sbI.append(new lz.g(2, 36, 1));
            throw new IllegalArgumentException(sbI.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final g2.h m(d2.e eVar, float f5) {
        int iCeil = ((int) Math.ceil(f5)) * 2;
        g2.h hVarG = se.i.f51598a;
        g2.c cVarA = se.i.f51599b;
        i2.b bVar = se.i.f51600c;
        if (hVarG == null || cVarA == null) {
            hVarG = f0.g(iCeil, iCeil, 1);
            se.i.f51598a = hVarG;
            cVarA = f0.a(hVarG);
            se.i.f51599b = cVarA;
        } else {
            Bitmap bitmap = hVarG.f28568a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                hVarG = f0.g(iCeil, iCeil, 1);
                se.i.f51598a = hVarG;
                cVarA = f0.a(hVarG);
                se.i.f51599b = cVarA;
            }
        }
        g2.h hVar = hVarG;
        g2.c cVar = cVarA;
        if (bVar == null) {
            bVar = new i2.b();
            se.i.f51600c = bVar;
        }
        i2.b bVar2 = bVar;
        i2.a aVar = bVar2.f34120a;
        v3.m layoutDirection = eVar.f23069a.getLayoutDirection();
        Bitmap bitmap2 = hVar.f28568a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        v3.c cVar2 = aVar.f34116a;
        v3.m mVar = aVar.f34117b;
        v vVar = aVar.f34118c;
        long j11 = aVar.f34119d;
        aVar.f34116a = eVar;
        aVar.f34117b = layoutDirection;
        aVar.f34118c = cVar;
        aVar.f34119d = jFloatToRawIntBits;
        cVar.e();
        i2.d.U(bVar2, g2.x.f28615b, 0L, bVar2.d(), CropImageView.DEFAULT_ASPECT_RATIO, 58);
        i2.d.U(bVar2, f0.e(4278190080L), 0L, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), CropImageView.DEFAULT_ASPECT_RATIO, 120);
        i2.d.j(bVar2, f0.e(4278190080L), f5, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), null, 0, 120);
        cVar.p();
        aVar.f34116a = cVar2;
        aVar.f34117b = mVar;
        aVar.f34118c = vVar;
        aVar.f34119d = j11;
        return hVar;
    }

    public static final boolean n(char c11, char c12, boolean z11) {
        if (c11 == c12) {
            return true;
        }
        if (!z11) {
            return false;
        }
        char upperCase = Character.toUpperCase(c11);
        char upperCase2 = Character.toUpperCase(c12);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final long o(long j11, boolean z11, int i11, float f5) {
        int iH = ((z11 || i11 == 2 || i11 == 4 || i11 == 5) && v3.a.d(j11)) ? v3.a.h(j11) : Integer.MAX_VALUE;
        if (v3.a.j(j11) != iH) {
            iH = hz.b.l(o0.p(f5), v3.a.j(j11), iH);
        }
        return com.bumptech.glide.f.q(0, iH, 0, v3.a.g(j11));
    }

    public static int p(char c11, CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean q(byte b3) {
        return b3 > -65;
    }

    public static boolean r(int i11) {
        switch (Character.getType(i11)) {
            default:
                if (i11 != 36 && i11 != 43 && i11 != 94 && i11 != 96 && i11 != 124 && i11 != 126) {
                    switch (i11) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case Service.BILLING_FIELD_NUMBER /* 26 */:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
                return true;
        }
    }

    public static boolean s(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }

    public static boolean t(int i11) {
        return i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32 || Character.getType(i11) == 12;
    }

    public static void u(Throwable th2) {
        bq.m mVar = f48482a;
        if (th2 == null) {
            th2 = gy.f.a("onError called with a null Throwable.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof QueueOverflowException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
        }
        if (mVar != null) {
            try {
                mVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static ed.a v(jd.e eVar, wc.h hVar) {
        return new ed.a(0, id.q.a(eVar, hVar, 1.0f, id.f.f34342b, false));
    }

    public static ed.b w(jd.d dVar, wc.h hVar, boolean z11) {
        return new ed.b(id.q.a(dVar, hVar, z11 ? kd.k.c() : 1.0f, id.f.f34343c, false), 3);
    }

    public static ed.a x(jd.e eVar, wc.h hVar, int i11) {
        s2 s2Var = new s2();
        s2Var.f3677a = i11;
        ArrayList arrayListA = id.q.a(eVar, hVar, 1.0f, s2Var, false);
        for (int i12 = 0; i12 < arrayListA.size(); i12++) {
            ld.a aVar = (ld.a) arrayListA.get(i12);
            fd.c cVar = (fd.c) aVar.f39889b;
            fd.c cVar2 = (fd.c) aVar.f39890c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f27148a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f27148a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f5 = Float.NaN;
                    int i13 = 0;
                    for (int i14 = 0; i14 < length2; i14++) {
                        float f11 = fArr3[i14];
                        if (f11 != f5) {
                            fArr3[i13] = f11;
                            i13++;
                            f5 = fArr3[i14];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i13);
                    aVar = new ld.a(cVar.b(fArrCopyOfRange), cVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i12, aVar);
        }
        return new ed.a(1, arrayListA);
    }

    public static ed.a y(jd.d dVar, wc.h hVar) {
        return new ed.a(2, id.q.a(dVar, hVar, 1.0f, id.f.f34344d, false));
    }

    public static ed.a z(jd.e eVar, wc.h hVar) {
        return new ed.a(3, id.q.a(eVar, hVar, kd.k.c(), id.f.f34346f, true));
    }

    public abstract void E(f.h0 h0Var, f.h0 h0Var2, Window window, View view, boolean z11, boolean z12);

    public abstract void I(q qVar);

    public void i(Window window) {
    }

    public Object j() {
        xx.c cVar = new xx.c(1);
        try {
            I(cVar);
            if (cVar.getCount() != 0) {
                try {
                    cVar.await();
                } catch (InterruptedException e8) {
                    cVar.f56637d = true;
                    rx.b bVar = cVar.f56636c;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    throw gy.f.b(e8);
                }
            }
            Throwable th2 = cVar.f56635b;
            if (th2 == null) {
                return cVar.f56634a;
            }
            throw gy.f.b(th2);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th3) {
            ef.e.E(th3);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static final no.g l(w9.s db2, String[] strArr, fz.c cVar) {
        String str;
        kotlin.jvm.internal.m.f(db2, "db");
        w9.g gVarK = db2.k();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.m.f(tables, "tables");
        w9.g0 g0Var = gVarK.f54801b;
        g0Var.getClass();
        sy.k kVar = new sy.k();
        int length = tables.length;
        int i11 = 0;
        while (true) {
            str = ypOOxsaJG.bEeHdwAr;
            if (i11 >= length) {
                break;
            }
            String str2 = tables[i11];
            HashMap map = g0Var.f54810c;
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(lowerCase, str);
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                kVar.addAll(set);
            } else {
                kVar.add(str2);
            }
            i11++;
        }
        String[] strArr2 = (String[]) b.f(kVar).toArray(new String[0]);
        int length2 = strArr2.length;
        int[] iArr = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            String str3 = strArr2[i12];
            LinkedHashMap linkedHashMap = g0Var.f54813f;
            String lowerCase2 = str3.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(lowerCase2, str);
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str3));
            }
            iArr[i12] = num.intValue();
        }
        qy.l lVar = new qy.l(strArr2, iArr);
        ?? resolvedTableNames = (String[]) lVar.f48495a;
        int[] tableIds = (int[]) lVar.f48496b;
        kotlin.jvm.internal.m.f(resolvedTableNames, "resolvedTableNames");
        kotlin.jvm.internal.m.f(tableIds, "tableIds");
        return new no.g(uz.x0.f(new gp.r(new uz.h0(g0Var, tableIds, (Serializable) resolvedTableNames, (vy.d) null, 4)), -1), db2, cVar, 4);
    }
}
