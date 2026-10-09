package vc;

import a0.c0;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.glance.session.TimeoutCancellationException;
import b7.g;
import c6.l;
import com.google.android.material.textfield.TextInputLayout;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.CourseAudioMode;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.CourseQuestionPreferenceKey;
import com.lingodeer.data.model.CourseQuestionPreferenceKt;
import com.lingodeer.data.model.CourseVisibilityMode;
import d1.k0;
import d1.m0;
import fa.EQx.nuRcCS;
import g2.f0;
import hh.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.h;
import k6.m;
import k6.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kr.w;
import l0.o;
import l0.p;
import l1.b1;
import l1.k1;
import l1.n;
import l1.q1;
import l1.s;
import l1.w1;
import l1.x1;
import l2.e;
import m6.x;
import ot.a1;
import ot.e1;
import ot.f1;
import ot.h1;
import ot.j0;
import ot.j1;
import ot.n0;
import ot.o0;
import ot.r0;
import ot.s0;
import ot.t0;
import ot.u0;
import ot.v0;
import ot.x0;
import oz.q;
import pr.z;
import rz.e0;
import u8.d;
import u8.j;
import ue.f;
import w2.q0;
import x0.i;
import y2.k;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f53835a;

    public static final l A(float f5) {
        return new t(new p6.c(f5)).d(new m(new p6.c(f5)));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void B(d dVar, j jVar, g gVar) {
        int iF;
        boolean z11;
        long j11 = jVar.f52841a;
        if (j11 == -9223372036854775807L) {
            iF = 0;
        } else {
            iF = dVar.f(j11);
            if (iF == -1) {
                iF = dVar.s();
            }
            if (iF > 0 && dVar.j(iF - 1) == j11) {
                iF--;
            }
        }
        if (j11 == -9223372036854775807L || iF >= dVar.s()) {
            z11 = false;
        } else {
            List listP = dVar.p(j11);
            long j12 = dVar.j(iF);
            if (listP.isEmpty()) {
                z11 = false;
            } else {
                long j13 = jVar.f52841a;
                if (j13 < j12) {
                    gVar.accept(new u8.a(j13, j12 - j13, listP));
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
        for (int i11 = iF; i11 < dVar.s(); i11++) {
            u(dVar, i11, gVar);
        }
        if (jVar.f52842b) {
            if (z11) {
                iF--;
            }
            for (int i12 = 0; i12 < iF; i12++) {
                u(dVar, i12, gVar);
            }
            if (z11) {
                gVar.accept(new u8.a(dVar.j(iF), j11 - dVar.j(iF), dVar.p(j11)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final int C(o oVar) {
        ?? r9 = oVar.f39156k;
        int size = r9.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((p) r9.get(i12)).m;
        }
        return (i11 / r9.size()) + oVar.f39161q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(h2.d dVar, kb.e eVar, xy.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.f40940c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f40940c = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(cVar);
            }
        } else {
            xVar = new x(cVar);
        }
        Object obj = xVar.f40939b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = xVar.f40940c;
        vy.d dVar2 = null;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kb.e eVar2 = xVar.f40938a;
                com.bumptech.glide.e.F(obj);
                return obj;
            }
            com.bumptech.glide.e.F(obj);
            xVar.f40938a = eVar;
            xVar.f40940c = 1;
            Object objL = e0.l(new w(6, eVar, dVar, dVar2), xVar);
            return objL == aVar ? aVar : objL;
        } catch (TimeoutCancellationException e8) {
            if (e8.f2023b == eVar.hashCode()) {
                return null;
            }
            throw e8;
        }
    }

    public static final void a(c6.a aVar, String str, l lVar, int i11, n nVar, int i12, int i13) {
        int i14;
        int i15;
        s sVar = (s) nVar;
        sVar.f0(491792371);
        int i16 = i12 | (sVar.f(aVar) ? 4 : 2) | (sVar.f(lVar) ? 256 : 128);
        int i17 = i13 & 8;
        if (i17 != 0) {
            i14 = i16 | 3072;
        } else {
            i14 = i16 | (sVar.d(i11) ? 2048 : 1024);
        }
        if (((i14 | 24576) & 9363) == 9362 && sVar.F()) {
            sVar.W();
            i15 = i11;
        } else {
            int i18 = i17 != 0 ? 1 : i11;
            sVar.e0(135631275);
            sVar.e0(135633130);
            boolean zF = sVar.f(str);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new c6.o(str, 0);
                sVar.o0(objQ);
            }
            sVar.p(false);
            l6.a aVar2 = new l6.a();
            ((fz.c) objQ).invoke(aVar2);
            l lVarD = lVar.d(new l6.b(aVar2));
            sVar.p(false);
            c6.m mVar = c6.m.f6632a;
            sVar.e0(-1115894518);
            sVar.e0(1886828752);
            if (!(sVar.f39434a instanceof c6.b)) {
                l1.t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(new c0(mVar));
            } else {
                sVar.r0();
            }
            l1.t.J(c6.c.f6608c, aVar, sVar);
            l1.t.J(c6.c.f6609d, lVarD, sVar);
            l1.t.J(c6.c.f6610e, new h(i18), sVar);
            l1.t.J(c6.c.f6611f, null, sVar);
            sVar.p(true);
            sVar.p(false);
            sVar.p(false);
            i15 = i18;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c6.n(aVar, str, lVar, i15, i12, i13);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void b(z1.r r43, o0.t r44, j0.t1 r45, f0.h1 r46, g0.g r47, boolean r48, d0.i r49, float r50, o0.f r51, r2.a r52, z1.i r53, g0.l r54, t1.d r55, l1.n r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.a.b(z1.r, o0.t, j0.t1, f0.h1, g0.g, boolean, d0.i, float, o0.f, r2.a, z1.i, g0.l, t1.d, l1.n, int, int):void");
    }

    public static final void c(r rVar, t1.d dVar, n nVar, int i11) {
        int i12;
        r rVar2;
        t1.d dVar2;
        s sVar = (s) nVar;
        sVar.f0(790527681);
        int i13 = 4;
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                k1 k1Var = new k1(null, l1.g.f39300d);
                sVar.o0(k1Var);
                objQ = k1Var;
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new z(21, b1Var);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            z3.z zVar = x0.l.f55607a;
            z0.c cVarK = f.k(i.f55598b, sVar, 6);
            rVar2 = rVar;
            dVar2 = dVar;
            l1.t.b(new w1[]{z0.f.f58419b.a(v10.c.D(aVar, sVar, 2)), z0.f.f58418a.a(cVarK)}, t1.e.d(1070596993, new k9.l(rVar2, b1Var, dVar2, cVarK, aVar, 1), sVar), sVar, 56);
        } else {
            rVar2 = rVar;
            dVar2 = dVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0.g(rVar2, dVar2, i11, i13);
        }
    }

    public static final void d(r rVar, t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(155925518);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = sVar.j(z0.f.f58418a) != null;
            boolean z12 = sVar.j(z0.f.f58419b) != null;
            if (z11 && z12) {
                sVar.d0(-1977156178);
                q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, rVar);
                k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                dVar.invoke(sVar, Integer.valueOf((i12 >> 3) & 14));
                sVar.p(true);
                sVar.p(false);
            } else if (z11) {
                sVar.d0(-1976965962);
                v10.c.b(rVar, dVar, sVar, i12 & 126);
                sVar.p(false);
            } else if (z12) {
                sVar.d0(-1976815178);
                x0.l.d(rVar, dVar, sVar, i12 & 126);
                sVar.p(false);
            } else {
                sVar.d0(-1976684761);
                c(rVar, dVar, sVar, i12 & 126);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0.g(rVar, dVar, i11, 3);
        }
    }

    public static final void e(r rVar, t1.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1854833411);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = m0.f22935a;
                sVar.o0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVar);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            p0.x(6, dVar, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k0(rVar, dVar, i11, 0);
        }
    }

    public static final String f(int i11) {
        return nv.p.j(i11, "appWidget-");
    }

    public static final void g(i2.d dVar, j2.c cVar) {
        cVar.c(dVar.j0().x(), (j2.c) dVar.j0().f56175c);
    }

    public static Bitmap h(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final l i(l lVar) {
        p6.e eVar = p6.e.f46315a;
        return lVar.d(new t(eVar)).d(new m(eVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int j(AchievementLeaderBoard achievementLeaderBoard) {
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "<this>");
        String id2 = achievementLeaderBoard.getId();
        switch (id2.hashCode()) {
            case 2020897257:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                    return R.drawable.achievement_leaderboard_level_a_active;
                }
                break;
            case 2020897258:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                    return R.drawable.achievement_leaderboard_level_b_active;
                }
                break;
            case 2020897259:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                    return R.drawable.achievement_leaderboard_level_c_active;
                }
                break;
            case 2020897260:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                    return R.drawable.achievement_leaderboard_level_d_active;
                }
                break;
            case 2020897261:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                    return R.drawable.achievement_leaderboard_level_e_active;
                }
                break;
            case 2020897262:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                    return R.drawable.achievement_leaderboard_level_f_active;
                }
                break;
        }
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
    }

    public static final EditText k(lc.d dVar) {
        EditText editText = l(dVar).getEditText();
        if (editText != null) {
            return editText;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    public static final TextInputLayout l(lc.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f39878a;
        Object obj = linkedHashMap.get("[custom_view_input_layout]");
        if (!(obj instanceof TextInputLayout)) {
            obj = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) obj;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        View customView = dVar.f39884t.getContentLayout().getCustomView();
        if (customView == null) {
            throw new IllegalStateException("You have not setup this dialog as a customView dialog.");
        }
        View viewFindViewById = customView.findViewById(R.id.md_input_layout);
        TextInputLayout textInputLayout2 = (TextInputLayout) (viewFindViewById instanceof TextInputLayout ? viewFindViewById : null);
        if (textInputLayout2 == null) {
            throw new IllegalStateException("You have not setup this dialog as an input dialog.");
        }
        linkedHashMap.put("[custom_view_input_layout]", textInputLayout2);
        return textInputLayout2;
    }

    public static final a9.i m() {
        a9.i iVar = t10.a.f52009b;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final List n(AchievementLeaderBoard achievementLeaderBoard) {
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "<this>");
        String id2 = achievementLeaderBoard.getId();
        switch (id2.hashCode()) {
            case 2020897257:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                    return ns.o.L(new g2.x(f0.e(4286213887L)), new g2.x(f0.c(8023807)));
                }
                break;
            case 2020897258:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                    return ns.o.L(new g2.x(f0.e(4283346424L)), new g2.x(f0.c(5156344)));
                }
                break;
            case 2020897259:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                    return ns.o.L(new g2.x(f0.e(4283331832L)), new g2.x(f0.c(5141752)));
                }
                break;
            case 2020897260:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                    return ns.o.L(new g2.x(f0.e(4292434711L)), new g2.x(f0.c(14244631)));
                }
                break;
            case 2020897261:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                    return ns.o.L(new g2.x(f0.e(4290519062L)), new g2.x(f0.c(12328982)));
                }
                break;
            case 2020897262:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                    return ns.o.L(new g2.x(f0.e(4294935562L)), new g2.x(f0.c(16745482)));
                }
                break;
        }
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String p(AchievementLeaderBoard achievementLeaderBoard, n nVar) {
        s sVar;
        int i11;
        int i12;
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "<this>");
        String id2 = achievementLeaderBoard.getId();
        switch (id2.hashCode()) {
            case 2020897257:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_a;
                    i12 = -1820322779;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
            case 2020897258:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_b;
                    i12 = -1820319867;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
            case 2020897259:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_c;
                    i12 = -1820316955;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
            case 2020897260:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_d;
                    i12 = -1820314043;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
            case 2020897261:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_e;
                    i12 = -1820311131;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
            case 2020897262:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                    sVar = (s) nVar;
                    i11 = R.string.class_f;
                    i12 = -1820308219;
                    return ep.a.m(sVar, i12, i11, sVar, false);
                }
                break;
        }
        s sVar2 = (s) nVar;
        sVar2.d0(-1820306622);
        sVar2.p(false);
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
    }

    public static final boolean q(c6.h hVar) {
        String str = null;
        l6.b bVar = (l6.b) hVar.f6626a.a(null, c6.c.f6612t);
        l6.a aVar = bVar != null ? bVar.f39771a : null;
        if (aVar != null) {
            Object obj = aVar.f39770a.get(l6.c.f39772a);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final boolean r(ViewGroup viewGroup) {
        Resources resources = viewGroup.getResources();
        kotlin.jvm.internal.m.b(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        kotlin.jvm.internal.m.b(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    public static final boolean s(View view) {
        if (!(view instanceof Button)) {
            return view.getVisibility() == 0;
        }
        Button button = (Button) view;
        if (button.getVisibility() == 0) {
            CharSequence text = button.getText();
            kotlin.jvm.internal.m.b(text, "this.text");
            if (!q.K0(q.i1(text))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object t(java.util.Collection r8, fz.e r9, xy.c r10) {
        /*
            boolean r0 = r10 instanceof bh.t1
            if (r0 == 0) goto L13
            r0 = r10
            bh.t1 r0 = (bh.t1) r0
            int r1 = r0.f4386t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4386t = r1
            goto L18
        L13:
            bh.t1 r0 = new bh.t1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4385f
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f4386t
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            int r8 = r0.f4384e
            int r9 = r0.f4383d
            java.util.Iterator r2 = r0.f4382c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.util.Collection r4 = r0.f4381b
            java.util.Collection r4 = (java.util.Collection) r4
            fz.e r5 = r0.f4380a
            com.bumptech.glide.e.F(r10)
            r7 = r4
            r4 = r9
            r9 = r5
            r5 = r7
            goto L83
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            com.bumptech.glide.e.F(r10)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r10 = 900(0x384, float:1.261E-42)
            java.util.ArrayList r8 = ry.m.h0(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r4 = r10
            r10 = r8
            r8 = r2
        L59:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r10.next()
            java.util.List r5 = (java.util.List) r5
            r0.f4380a = r9
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f4381b = r6
            r6 = r10
            java.util.Iterator r6 = (java.util.Iterator) r6
            r0.f4382c = r6
            r0.f4383d = r2
            r0.f4384e = r8
            r0.f4386t = r3
            java.lang.Object r5 = r9.invoke(r5, r0)
            if (r5 != r1) goto L7e
            return r1
        L7e:
            r7 = r2
            r2 = r10
            r10 = r5
            r5 = r4
            r4 = r7
        L83:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            ry.m.d0(r5, r10)
            r10 = r2
            r2 = r4
            r4 = r5
            goto L59
        L8c:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.a.t(java.util.Collection, fz.e, xy.c):java.lang.Object");
    }

    public static void u(d dVar, int i11, g gVar) {
        long j11 = dVar.j(i11);
        List listP = dVar.p(j11);
        if (listP.isEmpty()) {
            return;
        }
        if (i11 == dVar.s() - 1) {
            throw new IllegalStateException();
        }
        long j12 = dVar.j(i11 + 1) - dVar.j(i11);
        if (j12 > 0) {
            gVar.accept(new u8.a(j11, j12, listP));
        }
    }

    public static void v(lc.d dVar, TextView textView, Integer num, CharSequence charSequence, int i11, Typeface typeface, int i12) {
        Integer numValueOf = Integer.valueOf(R.attr.md_color_title);
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 32) != 0) {
            numValueOf = null;
        }
        if (charSequence == null) {
            charSequence = c.e(dVar, num, Integer.valueOf(i11), 8);
        }
        if (charSequence == null) {
            textView.setVisibility(8);
            return;
        }
        Object parent = textView.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).setVisibility(0);
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        c.b(textView, dVar.O, numValueOf, null);
    }

    public static final void w(AchievementLeaderBoard achievementLeaderBoard, String str, ur.a eventTracker) {
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "<this>");
        kotlin.jvm.internal.m.f(eventTracker, "eventTracker");
        eventTracker.c("ep_badge_share", new pv.c(8, achievementLeaderBoard, str));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    public static final qs.b x(CourseQuestionPreferenceContext courseQuestionPreferenceContext, j1 courseTestModelData, Collection storedPreferences, boolean z11, boolean z12, int i11) {
        Object next;
        CourseQuestionPreferenceContext courseQuestionPreferenceContext2;
        boolean supportsTranslation;
        boolean z13;
        boolean z14;
        ht.o oVar;
        ht.r rVar;
        kotlin.jvm.internal.m.f(courseTestModelData, "courseTestModelData");
        kotlin.jvm.internal.m.f(storedPreferences, "storedPreferences");
        Iterator it = ry.m.a1(storedPreferences).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CourseQuestionPreference courseQuestionPreference = (CourseQuestionPreference) next;
            if (courseQuestionPreference.getKeyLanguage() == courseQuestionPreferenceContext.getKeyLanguage() && courseQuestionPreference.getQuestionTypeKey() == courseQuestionPreferenceContext.getQuestionTypeKey()) {
                break;
            }
        }
        CourseQuestionPreference courseQuestionPreferenceCopy$default = (CourseQuestionPreference) next;
        if (courseQuestionPreferenceCopy$default != null) {
            courseQuestionPreferenceContext2 = courseQuestionPreferenceContext;
        } else {
            courseQuestionPreferenceContext2 = courseQuestionPreferenceContext;
            courseQuestionPreferenceCopy$default = CourseQuestionPreference.copy$default(CourseQuestionPreferenceKt.buildDefaultCourseQuestionPreference$default(courseQuestionPreferenceContext2, 0L, 2, null), 0, null, z11 ? CourseAudioMode.AUTO_PLAY : CourseAudioMode.TAP_TO_PLAY, z12 ? CourseVisibilityMode.TAP_TO_REVEAL : CourseVisibilityMode.ALWAYS_VISIBLE, null, z11, 0L, 83, null);
        }
        CourseQuestionPreference courseQuestionPreference2 = courseQuestionPreferenceCopy$default;
        CourseQuestionPreferenceKey questionTypeKey = courseQuestionPreferenceContext2.getQuestionTypeKey();
        if (qs.a.f48311b[questionTypeKey.ordinal()] == 1) {
            e1 e1Var = courseTestModelData instanceof e1 ? (e1) courseTestModelData : null;
            if (e1Var == null || (oVar = e1Var.f45798a) == null || (rVar = oVar.f33770s) == null || !ns.o.J(rVar, i11, courseQuestionPreferenceContext2.getKeyLanguage())) {
                supportsTranslation = false;
            } else {
                z13 = true;
                supportsTranslation = true;
            }
            boolean z15 = courseTestModelData.a().f33762j;
            boolean supportsAudio = questionTypeKey.getSupportsAudio();
            if (questionTypeKey.getSupportsAudio() || (courseTestModelData.a().f33762j && (!(courseTestModelData instanceof e1) ? (courseTestModelData instanceof u0) || (courseTestModelData instanceof o0) : ((e1) courseTestModelData).f45798a.f33770s == ht.r.M10))) {
                z14 = false;
            } else {
                z14 = z13;
            }
            return new qs.b(courseQuestionPreferenceContext2, courseQuestionPreference2, z15, supportsAudio, z14, supportsTranslation, questionTypeKey.getSupportsOriginalSentence(), questionTypeKey.getSupportsOptionTapAudio());
        }
        supportsTranslation = questionTypeKey.getSupportsTranslation();
        z13 = true;
        boolean z16 = courseTestModelData.a().f33762j;
        boolean supportsAudio2 = questionTypeKey.getSupportsAudio();
        if (questionTypeKey.getSupportsAudio()) {
            z14 = z13;
        } else {
            z14 = false;
        }
        return new qs.b(courseQuestionPreferenceContext2, courseQuestionPreference2, z16, supportsAudio2, z14, supportsTranslation, questionTypeKey.getSupportsOriginalSentence(), questionTypeKey.getSupportsOptionTapAudio());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public static final CourseQuestionPreferenceContext y(int i11, j1 courseTestModelData) {
        CourseQuestionPreferenceKey courseQuestionPreferenceKey;
        kotlin.jvm.internal.m.f(courseTestModelData, "courseTestModelData");
        if (courseTestModelData instanceof a1) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.VOCAB_M1;
        } else if (courseTestModelData instanceof e1) {
            ht.o oVar = ((e1) courseTestModelData).f45798a;
            int i12 = qs.a.f48310a[oVar.f33770s.ordinal()];
            if (i12 == 1) {
                courseQuestionPreferenceKey = null;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                courseQuestionPreferenceKey = CourseQuestionPreferenceKey.TRANSLATION_SPELLING_SHARED;
            } else if (oVar.f33762j) {
                courseQuestionPreferenceKey = null;
            } else {
                courseQuestionPreferenceKey = CourseQuestionPreferenceKey.VOCAB_M9;
            }
        } else if (courseTestModelData instanceof f1) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.VOCAB_M6;
        } else if (courseTestModelData instanceof h1) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.VOCAB_M8;
        } else if (courseTestModelData instanceof ot.m0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M0;
        } else if (courseTestModelData instanceof ot.q0) {
            courseQuestionPreferenceKey = null;
        } else if (courseTestModelData instanceof r0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M3;
        } else if (courseTestModelData instanceof s0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M4;
        } else if (courseTestModelData instanceof t0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M5;
        } else if (courseTestModelData instanceof u0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SPEAKING_M7_SHARED;
        } else if (courseTestModelData instanceof v0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M8;
        } else if (courseTestModelData instanceof n0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_M10;
        } else if (courseTestModelData instanceof o0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.TRANSLATION_SPELLING_SHARED;
        } else if (courseTestModelData instanceof x0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.SENTENCE_MQA;
        } else if (courseTestModelData instanceof j0) {
            courseQuestionPreferenceKey = CourseQuestionPreferenceKey.CHAR_CN;
        } else {
            courseQuestionPreferenceKey = null;
        }
        if (courseQuestionPreferenceKey == null) {
            return null;
        }
        return new CourseQuestionPreferenceContext(i11, courseQuestionPreferenceKey);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final List o(AchievementLeaderBoard achievementLeaderBoard) {
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "<this>");
        String id2 = achievementLeaderBoard.getId();
        switch (id2.hashCode()) {
            case 2020897257:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                    return ns.o.L(new g2.x(f0.e(4289237247L)), new g2.x(f0.e(4286533375L)));
                }
                break;
            case 2020897258:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                    return ns.o.L(new g2.x(f0.e(4287682559L)), new g2.x(f0.e(4278416082L)));
                }
                break;
            case 2020897259:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                    return ns.o.L(new g2.x(f0.e(4287406847L)), new g2.x(f0.e(4281361140L)));
                }
                break;
            case 2020897260:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                    return ns.o.L(new g2.x(f0.e(4294950028L)), new g2.x(f0.e(4288429357L)));
                }
                break;
            case 2020897261:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                    return ns.o.L(new g2.x(f0.e(4294944930L)), new g2.x(f0.e(4292757310L)));
                }
                break;
            case 2020897262:
                if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                    return ns.o.L(new g2.x(f0.e(4294954914L)), new g2.x(f0.e(4294277147L)));
                }
                break;
        }
        throw new IllegalArgumentException(ep.a.e(bjXGJ.KDfsBVubPeWYSUR, achievementLeaderBoard.getId()));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x000e, B:7:0x0016, B:10:0x001d, B:11:0x0025, B:13:0x002b, B:18:0x004d, B:25:0x0062, B:28:0x0068, B:29:0x006b, B:31:0x0083, B:34:0x008d, B:36:0x00a3, B:41:0x00dd, B:44:0x00e9, B:47:0x0108, B:49:0x0110, B:56:0x0137, B:50:0x0114, B:52:0x0118, B:54:0x0124, B:55:0x012f, B:37:0x00ac, B:38:0x00b4, B:40:0x00cd, B:43:0x00e7, B:57:0x0140, B:58:0x0145, B:64:0x015f, B:61:0x0150), top: B:68:0x000e, inners: #1 }] */
    public static void z(HashMap map) {
        String[] strArr;
        List listK;
        ConcurrentHashMap concurrentHashMap = se.z.f51627e;
        se.z zVar = se.z.f51623a;
        if (qf.a.b(se.z.class)) {
            return;
        }
        try {
            if (!se.z.f51625c.get()) {
                zVar.b();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = kotlin.jvm.internal.m.h(str2.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                String strK = lf.j1.K(zVar.c(str, str2.subSequence(i11, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 != null) {
                        Pattern patternCompile = Pattern.compile(",");
                        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                        q.U0(0);
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(str3.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(str3.subSequence(iEnd, str3.length()).toString());
                            listK = arrayList;
                        } else {
                            listK = ns.o.K(str3.toString());
                        }
                        strArr = (String[]) listK.toArray(new String[0]);
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    } else {
                        strArr = new String[0];
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    kotlin.jvm.internal.m.f(objArrCopyOf, nuRcCS.TsSE);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(ry.x.W(objArrCopyOf.length));
                    ry.l.h0(objArrCopyOf, linkedHashSet);
                    if (linkedHashSet.contains(strK)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strK);
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(strK);
                    } else {
                        for (int i12 = 1; i12 < 5; i12++) {
                            sb2.append(strArr[i12]);
                            sb2.append(",");
                        }
                        sb2.append(strK);
                        linkedHashSet.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, strK);
                }
            }
            String strC = lf.j1.C(concurrentHashMap);
            if (qf.a.b(zVar)) {
                return;
            }
            try {
                re.s.d().execute(new se.c(strC, 1));
            } catch (Throwable th2) {
                qf.a.a(zVar, th2);
            }
        } catch (Throwable th3) {
            qf.a.a(se.z.class, th3);
        }
    }
}
