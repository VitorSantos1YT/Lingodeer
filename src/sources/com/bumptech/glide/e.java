package com.bumptech.glide;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import bt.i5;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.g0;
import e6.a0;
import e6.a1;
import e6.e1;
import e6.g1;
import e6.j1;
import e6.k1;
import e6.r1;
import e6.s1;
import e6.t1;
import e6.u0;
import e6.w0;
import e6.x1;
import g2.f0;
import g3.t;
import g3.x;
import j9.b0;
import j9.d0;
import j9.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jt.t0;
import kotlin.NoWhenBranchMatchedException;
import kv.l0;
import l1.s;
import ot.a2;
import ot.c1;
import ot.z0;
import qp.n2;
import rt.d5;
import rt.q4;
import rt.w4;
import rt.z4;
import uz.x0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7613a = 0;

    public static final void A(HashMap map, fz.c cVar) {
        int i11;
        kotlin.jvm.internal.m.f(map, "map");
        HashMap map2 = new HashMap(999);
        Iterator it = map.keySet().iterator();
        loop0: while (true) {
            i11 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Object next = it.next();
                kotlin.jvm.internal.m.e(next, "next(...)");
                map2.put(next, map.get(next));
                i11++;
            } while (i11 != 999);
            cVar.invoke(map2);
            map2.clear();
        }
        if (i11 > 0) {
            cVar.invoke(map2);
        }
    }

    public static final List C(z4 z4Var, List units, w4 resourceMode) {
        kotlin.jvm.internal.m.f(z4Var, "<this>");
        kotlin.jvm.internal.m.f(units, "units");
        kotlin.jvm.internal.m.f(resourceMode, "resourceMode");
        return nz.n.Z(nz.n.T(new cz.i(2, nz.n.R(ry.m.g0(units), new ro.e(20)), new gu.g(24)), new n2(9, resourceMode, z4Var)));
    }

    public static final void D(RemoteViews remoteViews, x1 x1Var, u0 u0Var, List list) {
        int i11 = 0;
        for (Object obj : ry.m.U0(list, 10)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            G(remoteViews, x1Var.b(u0Var, i11), (c6.g) obj);
            i11 = i12;
        }
    }

    public static final void E(a5.g gVar, t tVar) {
        Object objG = tVar.k().f28691a.g(x.f28716g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        t tVarL = tVar.l();
        if (tVarL == null) {
            return;
        }
        Object objG2 = tVarL.k().f28691a.g(x.f28714e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = tVarL.k().f28691a.g(x.f28715f);
            g3.d dVar = (g3.d) (objG3 != null ? objG3 : null);
            if (dVar == null || (dVar.f28644a >= 0 && dVar.f28645b >= 0)) {
                if (tVar.k().f28691a.c(x.I)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = t.j(4, tVarL);
                    int size = listJ.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        t tVar2 = (t) listJ.get(i12);
                        if (tVar2.k().f28691a.c(x.I)) {
                            arrayList.add(tVar2);
                            if (tVar2.f28698c.x() < tVar.f28698c.x()) {
                                i11++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zI = i(arrayList);
                    int i13 = zI ? 0 : i11;
                    int i14 = zI ? i11 : 0;
                    Object objG4 = tVar.k().f28691a.g(x.I);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    gVar.o(a5.f.o(i13, 1, i14, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final void F(Object obj) {
        if (obj instanceof qy.n) {
            throw ((qy.n) obj).f48497a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0356  */
    public static final void G(RemoteViews remoteViews, x1 x1Var, c6.g gVar) {
        e1 e1Var;
        int i11;
        int i12;
        int i13;
        g1 g1Var = g1.f24919t;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        z11 = false;
        if (gVar instanceof k6.i) {
            k6.i iVar = (k6.i) gVar;
            ArrayList arrayList = iVar.f6630b;
            e1 e1Var2 = e1.Box;
            int size = arrayList.size();
            c6.l lVar = iVar.f37928c;
            k6.c cVar = iVar.f37929d;
            u0 u0VarB = a1.b(remoteViews, x1Var, e1Var2, size, lVar, new k6.a(cVar.f37915a), new k6.b(cVar.f37916b));
            ve.i.j(x1Var, remoteViews, iVar.f37928c, u0VarB);
            int size2 = arrayList.size();
            while (i14 < size2) {
                Object obj = arrayList.get(i14);
                i14++;
                c6.g gVar2 = (c6.g) obj;
                gVar2.c(gVar2.b().d(new e6.a(iVar.f37929d)));
            }
            D(remoteViews, x1Var, u0VarB, arrayList);
            return;
        }
        int i17 = 8388613;
        if (gVar instanceof k6.k) {
            k6.k kVar = (k6.k) gVar;
            e1 e1Var3 = (Build.VERSION.SDK_INT < 31 || !kVar.f37933c.b(g1Var)) ? e1.Row : e1.RadioRow;
            ArrayList arrayList2 = kVar.f6630b;
            u0 u0VarB2 = a1.b(remoteViews, x1Var, e1Var3, arrayList2.size(), kVar.f37933c, null, new k6.b(kVar.f37935e));
            int i18 = u0VarB2.f25052a;
            int i19 = kVar.f37934d;
            int i21 = kVar.f37935e;
            if (i19 == 0) {
                i17 = 8388611;
            } else if (i19 != 2) {
                if (i19 == 1) {
                    i17 = 1;
                } else {
                    k6.a.b(i19);
                    i17 = 8388611;
                }
            }
            if (i21 == 0) {
                i13 = 48;
            } else if (i21 == 2) {
                i13 = 80;
            } else if (i21 == 1) {
                i13 = 16;
            } else {
                k6.b.b(i21);
                i13 = 48;
            }
            remoteViews.setInt(i18, "setGravity", i17 | i13);
            ve.i.j(x1.a(x1Var, 0, null, null, null, 0L, null, 28671), remoteViews, kVar.f37933c, u0VarB2);
            D(remoteViews, x1Var, u0VarB2, arrayList2);
            if (!kVar.f37933c.b(g1Var) || arrayList2.isEmpty()) {
                return;
            }
            int size3 = arrayList2.size();
            while (i15 < size3) {
                Object obj2 = arrayList2.get(i15);
                i15++;
            }
            return;
        }
        if (gVar instanceof k6.j) {
            k6.j jVar = (k6.j) gVar;
            e1 e1Var4 = (Build.VERSION.SDK_INT < 31 || !jVar.f37930c.b(g1Var)) ? e1.Column : e1.RadioColumn;
            ArrayList arrayList3 = jVar.f6630b;
            u0 u0VarB3 = a1.b(remoteViews, x1Var, e1Var4, arrayList3.size(), jVar.f37930c, new k6.a(jVar.f37932e), null);
            int i22 = u0VarB3.f25052a;
            int i23 = jVar.f37932e;
            int i24 = jVar.f37931d;
            if (i23 == 0) {
                i17 = 8388611;
            } else if (i23 != 2) {
                if (i23 == 1) {
                    i17 = 1;
                } else {
                    k6.a.b(i23);
                    i17 = 8388611;
                }
            }
            if (i24 == 0) {
                i12 = 48;
            } else if (i24 == 2) {
                i12 = 80;
            } else if (i24 == 1) {
                i12 = 16;
            } else {
                k6.b.b(i24);
                i12 = 48;
            }
            remoteViews.setInt(i22, "setGravity", i17 | i12);
            ve.i.j(x1.a(x1Var, 0, null, null, null, 0L, null, 28671), remoteViews, jVar.f37930c, u0VarB3);
            D(remoteViews, x1Var, u0VarB3, arrayList3);
            if (!jVar.f37930c.b(g1Var) || arrayList3.isEmpty()) {
                return;
            }
            int size4 = arrayList3.size();
            while (i16 < size4) {
                Object obj3 = arrayList3.get(i16);
                i16++;
            }
            return;
        }
        if (!(gVar instanceof o6.a)) {
            if (gVar instanceof k6.l) {
                k6.l lVar2 = (k6.l) gVar;
                ve.i.j(x1Var, remoteViews, lVar2.f37936a, a1.c(remoteViews, x1Var, e1.Frame, lVar2.f37936a));
                return;
            }
            if (!(gVar instanceof c6.h)) {
                if (!(gVar instanceof a0)) {
                    throw new IllegalArgumentException("Unknown element type " + gVar.getClass().getCanonicalName());
                }
                ArrayList arrayList4 = ((a0) gVar).f6630b;
                if (arrayList4.size() > 1) {
                    throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
                }
                c6.g gVar3 = (c6.g) ry.m.s0(arrayList4);
                if (gVar3 != null) {
                    G(remoteViews, x1Var, gVar3);
                    return;
                }
                return;
            }
            c6.h hVar = (c6.h) gVar;
            boolean zQ = vc.a.q(hVar);
            int i25 = hVar.f6628c;
            if (i25 == 0) {
                e1Var = zQ ? e1.ImageCropDecorative : e1.ImageCrop;
            } else if (i25 == 1) {
                e1Var = zQ ? e1.ImageFitDecorative : e1.ImageFit;
            } else if (i25 == 2) {
                e1Var = zQ ? e1.ImageFillBoundsDecorative : e1.ImageFillBounds;
            } else {
                k6.h.a(i25);
                e1Var = e1.ImageFit;
            }
            u0 u0VarC = a1.c(remoteViews, x1Var, e1Var, hVar.f6626a);
            int i26 = u0VarC.f25052a;
            c6.a aVar = hVar.f6627b;
            if (!(aVar instanceof c6.a)) {
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            }
            remoteViews.setImageViewResource(i26, aVar.f6606a);
            ve.i.j(x1Var, remoteViews, hVar.f6626a, u0VarC);
            if (hVar.f6628c == 1) {
                k6.t tVar = (k6.t) hVar.f6626a.a(null, i6.a.f34159b);
                p6.g gVar4 = tVar != null ? tVar.f37954a : null;
                p6.f fVar = p6.f.f46316a;
                if (kotlin.jvm.internal.m.a(gVar4, fVar)) {
                    z11 = true;
                } else {
                    k6.m mVar = (k6.m) hVar.f6626a.a(null, i6.a.f34160c);
                    if (kotlin.jvm.internal.m.a(mVar != null ? mVar.f37937a : null, fVar)) {
                        z11 = true;
                    }
                }
            }
            remoteViews.setBoolean(i26, "setAdjustViewBounds", z11);
            return;
        }
        o6.a aVar2 = (o6.a) gVar;
        u0 u0VarC2 = a1.c(remoteViews, x1Var, e1.Text, aVar2.f44716d);
        int i27 = u0VarC2.f25052a;
        CharSequence charSequence = aVar2.f44713a;
        o6.g gVar5 = aVar2.f44714b;
        int i28 = aVar2.f44715c;
        Context context = x1Var.f25078a;
        if (i28 != Integer.MAX_VALUE) {
            remoteViews.setInt(i27, "setMaxLines", i28);
        }
        if (gVar5 == null) {
            remoteViews.setTextViewText(i27, charSequence);
        } else {
            SpannableString spannableString = new SpannableString(charSequence);
            int length = spannableString.length();
            v3.o oVar = gVar5.f44730b;
            if (oVar != null) {
                long j11 = oVar.f53502a;
                if (!v3.o.e(j11)) {
                    throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
                }
                remoteViews.setTextViewTextSize(i27, 2, v3.o.c(j11));
            }
            ArrayList arrayList5 = new ArrayList();
            o6.b bVar = gVar5.f44731c;
            if (bVar != null) {
                int i29 = bVar.f44717a;
                if (i29 == 700) {
                    i11 = R.style.Glance_AppWidget_TextAppearance_Bold;
                } else {
                    i11 = i29 == 500 ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal;
                }
                arrayList5.add(new TextAppearanceSpan(context, i11));
            }
            if (gVar5.f44732d != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    i6.b.f34162a.a(remoteViews, i27, 49);
                } else {
                    arrayList5.add(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
                }
            }
            int size5 = arrayList5.size();
            int i30 = 0;
            while (i30 < size5) {
                Object obj4 = arrayList5.get(i30);
                i30++;
                spannableString.setSpan((ParcelableSpan) obj4, 0, length, 17);
            }
            remoteViews.setTextViewText(i27, spannableString);
            p6.a aVar3 = gVar5.f44729a;
            if (aVar3 instanceof p6.h) {
                remoteViews.setTextColor(i27, f0.E(0L));
            } else if (aVar3 instanceof p6.i) {
                if (Build.VERSION.SDK_INT >= 31) {
                    e5.k.g(remoteViews, i27, "setTextColor", ((p6.i) aVar3).f46317a);
                } else {
                    remoteViews.setTextColor(i27, f0.E(f0.c(p6.b.f46312a.a(context, ((p6.i) aVar3).f46317a))));
                }
            } else if (!(aVar3 instanceof j6.a)) {
                Objects.toString(aVar3);
            } else if (Build.VERSION.SDK_INT >= 31) {
                j6.a aVar4 = (j6.a) aVar3;
                e5.k.f(remoteViews, i27, "setTextColor", f0.E(aVar4.f36061a), f0.E(aVar4.f36062b));
            } else {
                j6.a aVar5 = (j6.a) aVar3;
                aVar5.getClass();
                remoteViews.setTextColor(i27, f0.E((context.getResources().getConfiguration().uiMode & 48) == 32 ? aVar5.f36062b : aVar5.f36061a));
            }
        }
        ve.i.j(x1Var, remoteViews, aVar2.f44716d, u0VarC2);
    }

    public static final RemoteViews H(Context context, int i11, k1 k1Var, w0 w0Var, int i12, ComponentName componentName) {
        int i13 = 0;
        x1 x1Var = new x1(context, i11, context.getResources().getConfiguration().getLayoutDirection() == 1, w0Var, -1, false, new AtomicInteger(1), new u0(i13, i13, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList arrayList = k1Var.f6630b;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                if (!(((c6.g) obj) instanceof a0)) {
                    c6.g gVar = (c6.g) ry.m.P0(arrayList);
                    j1 j1VarA = a1.a(x1Var, gVar.b(), i12);
                    RemoteViews remoteViews = j1VarA.f24947a;
                    G(remoteViews, x1.a(x1Var.b(j1VarA.f24948b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447), gVar);
                    return remoteViews;
                }
            }
        }
        Object objQ0 = ry.m.q0(arrayList);
        kotlin.jvm.internal.m.d(objQ0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        t1 t1Var = ((a0) objQ0).f24876d;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            c6.g gVar2 = (c6.g) obj2;
            kotlin.jvm.internal.m.d(gVar2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long j11 = ((a0) gVar2).f24875c;
            j1 j1VarA2 = a1.a(x1Var, gVar2.b(), i12);
            RemoteViews remoteViews2 = j1VarA2.f24947a;
            G(remoteViews2, x1.a(x1Var.b(j1VarA2.f24948b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j11, null, 31935), gVar2);
            arrayList2.add(new qy.l(new SizeF(v3.h.b(j11), v3.h.a(j11)), remoteViews2));
        }
        if (t1Var instanceof s1) {
            return (RemoteViews) ((qy.l) ry.m.P0(arrayList2)).f48496b;
        }
        if (!kotlin.jvm.internal.m.a(t1Var, r1.f25039a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return e6.b.f24880a.a(ry.x.g0(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList2, 10));
        int size3 = arrayList2.size();
        int i16 = 0;
        while (i16 < size3) {
            Object obj3 = arrayList2.get(i16);
            i16++;
            arrayList3.add((RemoteViews) ((qy.l) obj3).f48496b);
        }
        int size4 = arrayList3.size();
        if (size4 == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size4 == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    public static final v3.e a(Context context) {
        float f5 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        w3.a aVarA = w3.b.a(f5);
        if (aVarA == null) {
            aVarA = new v3.n(f5);
        }
        return new v3.e(f11, f5, aVarA);
    }

    /* JADX WARN: Failed to calculate best type for var: r13v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v10 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v10 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v11 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v11 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v12 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v31 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v33 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r3v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v37 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r3v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v37 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: l1.s
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v37 ??, new type: boolean
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
    public static final void b(j9.v r43, j9.s r44, z1.r r45, z1.e r46, fz.c r47, fz.c r48, fz.c r49, fz.c r50, l1.n r51, int r52) {
        /*
            Method dump skipped, instruction units count: 2849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.b(j9.v, j9.s, z1.r, z1.e, fz.c, fz.c, fz.c, fz.c, l1.n, int):void");
    }

    public static final void c(v vVar, String str, r rVar, z1.e eVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, l1.n nVar, int i11) {
        int i12;
        fz.c cVar6;
        int i13;
        z1.e eVar2;
        r rVar2;
        fz.c cVar7;
        fz.c cVar8;
        fz.c cVar9;
        fz.c cVar10;
        fz.c cVar11;
        fz.c cVar12;
        fz.c cVar13;
        z1.e eVar3;
        r rVar3;
        s sVar = (s) nVar;
        sVar.f0(1840250294);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(vVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        int i14 = 1797504 | i12;
        if ((i11 & 12582912) == 0) {
            i14 = 5991808 | i12;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= 33554432;
        }
        int i15 = 805306368 | i14;
        char c11 = sVar.h(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i15) == 306783378 && (c11 & 3) == 2 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            eVar3 = eVar;
            cVar13 = cVar;
            cVar12 = cVar2;
            cVar11 = cVar3;
            cVar10 = cVar4;
        } else {
            sVar.Y();
            int i16 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i16 == 0 || sVar.C()) {
                z1.j jVar = z1.c.f58463a;
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new t0(8);
                    sVar.o0(objQ);
                }
                fz.c cVar14 = (fz.c) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new t0(9);
                    sVar.o0(objQ2);
                }
                cVar6 = (fz.c) objQ2;
                i13 = i15 & (-264241153);
                eVar2 = jVar;
                rVar2 = z1.o.f58481a;
                cVar7 = cVar14;
                cVar8 = cVar7;
                cVar9 = cVar6;
            } else {
                sVar.W();
                rVar2 = rVar;
                cVar6 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                i13 = i15 & (-264241153);
                eVar2 = eVar;
                cVar7 = cVar;
            }
            sVar.q();
            boolean z11 = ((i13 & 57344) == 16384) | ((i13 & 112) == 32) | ((c11 & 14) == 4);
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                j9.t tVar = new j9.t(vVar.f36257b.f41087s, str);
                cVar5.invoke(tVar);
                objQ3 = tVar.g();
                sVar.o0(objQ3);
            }
            j9.s sVar2 = (j9.s) objQ3;
            int i17 = i13 >> 3;
            int i18 = (i13 & 8078) | (i17 & 57344) | (458752 & i17) | (i17 & 234881024);
            fz.c cVar15 = cVar9;
            z1.e eVar4 = eVar2;
            fz.c cVar16 = cVar6;
            b(vVar, sVar2, rVar2, eVar4, cVar7, cVar16, cVar8, cVar15, sVar, i18);
            cVar10 = cVar15;
            cVar11 = cVar8;
            cVar12 = cVar16;
            cVar13 = cVar7;
            eVar3 = eVar4;
            rVar3 = rVar2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i5(vVar, str, rVar3, eVar3, cVar13, cVar12, cVar11, cVar10, cVar5, i11, 2);
        }
    }

    public static final void d(boolean z11, fz.e eVar, l1.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1818896922);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(eVar) ? 32 : 16);
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            se.k.c(z11, eVar, sVar, i12 & 126);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g0(z11, eVar, i11);
        }
    }

    public static final f2.c e(long j11, long j12) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new f2.c(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object f(wt.m mVar, l0 l0Var, long j11, xy.c cVar) {
        mv.l0 l0Var2;
        long j12;
        String str;
        l0 l0Var3 = l0Var;
        if (cVar instanceof mv.l0) {
            l0Var2 = (mv.l0) cVar;
            int i11 = l0Var2.f42246d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var2.f42246d = i11 - Integer.MIN_VALUE;
            } else {
                l0Var2 = new mv.l0(cVar);
            }
        } else {
            l0Var2 = new mv.l0(cVar);
        }
        Object objV = l0Var2.f42245c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = l0Var2.f42246d;
        if (i12 == 0) {
            F(objV);
            uz.i iVarA = mVar.a(l0Var3.f38778b);
            l0Var2.f42243a = l0Var3;
            l0Var2.f42244b = j11;
            l0Var2.f42246d = 1;
            objV = x0.v(iVarA, l0Var2);
            if (objV == aVar) {
                return aVar;
            }
            j12 = j11;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = l0Var2.f42244b;
            l0Var3 = l0Var2.f42243a;
            F(objV);
            j12 = j13;
        }
        CourseCharacter courseCharacter = (CourseCharacter) objV;
        if (courseCharacter != null) {
            String str2 = l0Var3.f38778b;
            String str3 = l0Var3.f38779c;
            qy.q qVar = fv.b.f28186a;
            Uri uri = Uri.parse(fv.b.c(se.k.x(str3), null, null));
            kotlin.jvm.internal.m.e(uri, "parse(...)");
            str = "parse(...)";
            CourseCharacter courseCharacterCopy = courseCharacter.copy((7124 & 1) != 0 ? courseCharacter.characterId : j12, (7124 & 2) != 0 ? courseCharacter.character : str2, (7124 & 4) != 0 ? courseCharacter.charPath : null, (7124 & 8) != 0 ? courseCharacter.zhuYin : str3, (7124 & 16) != 0 ? courseCharacter.animation : 0, (7124 & 32) != 0 ? courseCharacter.translation : BuildConfig.VERSION_NAME, (7124 & 64) != 0 ? courseCharacter.tipsAnimation : null, (7124 & 128) != 0 ? courseCharacter.partStrings : null, (7124 & 256) != 0 ? courseCharacter.polygonStrings : null, (7124 & 512) != 0 ? courseCharacter.drillJson : null, (7124 & 1024) != 0 ? courseCharacter.audioUri : uri, (7124 & 2048) != 0 ? courseCharacter.animationUri : null, (7124 & 4096) != 0 ? courseCharacter.options : null);
            if (courseCharacterCopy != null) {
                return courseCharacterCopy;
            }
        } else {
            str = "parse(...)";
        }
        String str4 = l0Var3.f38778b;
        String str5 = l0Var3.f38779c;
        qy.q qVar2 = fv.b.f28186a;
        Uri uri2 = Uri.parse(fv.b.c(se.k.x(str5), null, null));
        kotlin.jvm.internal.m.e(uri2, str);
        String str6 = BuildConfig.VERSION_NAME;
        int i13 = 0;
        String str7 = BuildConfig.VERSION_NAME;
        String str8 = BuildConfig.VERSION_NAME;
        ry.r rVar = ry.r.f50854a;
        return new CourseCharacter(j12, str4, str6, str5, i13, str7, str8, rVar, rVar, null, uri2, null, null, 6656, null);
    }

    public static void g(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return;
            } else {
                j13 = j12 + j11;
            }
        } while (!atomicLong.compareAndSet(j12, j13 >= 0 ? j13 : Long.MAX_VALUE));
    }

    public static final String h(KOSyllableLesson kOSyllableLesson) {
        kotlin.jvm.internal.m.f(kOSyllableLesson, "<this>");
        int i11 = sv.k.f51813a[kOSyllableLesson.getType().ordinal()];
        if (i11 == 1) {
            return ep.a.e("SYLLABLE:", kOSyllableLesson.getLessonID());
        }
        if (i11 == 2) {
            return ep.a.e("SOUND_CHANGE:", kOSyllableLesson.getLessonID());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean i(ArrayList arrayList) {
        List list;
        long j11;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ry.r.f50854a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iA = ns.o.A(arrayList);
                int i11 = 0;
                while (i11 < iA) {
                    i11++;
                    Object obj2 = arrayList.get(i11);
                    t tVar = (t) obj2;
                    t tVar2 = (t) obj;
                    arrayList2.add(new f2.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (tVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (tVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j11 = ((f2.b) ry.m.q0(list)).f26570a;
            } else {
                if (list.isEmpty()) {
                    x3.a.b("Empty collection can't be reduced.");
                }
                Object objQ0 = ry.m.q0(list);
                int iA2 = ns.o.A(list);
                if (1 <= iA2) {
                    int i12 = 1;
                    while (true) {
                        objQ0 = new f2.b(f2.b.h(((f2.b) objQ0).f26570a, ((f2.b) list.get(i12)).f26570a));
                        if (i12 == iA2) {
                            break;
                        }
                        i12++;
                    }
                }
                j11 = ((f2.b) objQ0).f26570a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j11)) >= Float.intBitsToFloat((int) (j11 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void j(d7.f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean k(f2.c cVar, float f5, float f11) {
        float f12 = cVar.f26572a;
        if (f5 > cVar.f26574c || f12 > f5) {
            return false;
        }
        return f11 <= cVar.f26575d && cVar.f26573b <= f11;
    }

    public static final qy.n l(Throwable exception) {
        kotlin.jvm.internal.m.f(exception, "exception");
        return new qy.n(exception);
    }

    public static void m(ViewGroup viewGroup) {
        View viewFindViewWithTag = viewGroup.findViewWithTag("e");
        if (viewFindViewWithTag != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    public static final AchievementLevel n(String achievementStr, String str) {
        kotlin.jvm.internal.m.f(achievementStr, "achievementStr");
        if (achievementStr.length() > 0) {
            return new AchievementLevel(str, Integer.parseInt((String) oz.q.W0((String) ry.m.z0(oz.q.W0(achievementStr, new String[]{";"}, 0, 6)), new String[]{":"}, 0, 6).get(0)), true, achievementStr, Long.parseLong((String) oz.q.W0((String) ry.m.z0(oz.q.W0(achievementStr, new String[]{";"}, 0, 6)), new String[]{":"}, 0, 6).get(1)), BuildConfig.VERSION_NAME, 0, 64, (kotlin.jvm.internal.f) null);
        }
        return new AchievementLevel(str, 0, false, BuildConfig.VERSION_NAME, 0L, BuildConfig.VERSION_NAME, 0, 80, (kotlin.jvm.internal.f) null);
    }

    public static long o() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        Long ackUnitId = lVar.a().getAckUnitId();
        kotlin.jvm.internal.m.e(ackUnitId, "getAckUnitId(...)");
        return ackUnitId.longValue();
    }

    public static int p() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        Integer ackEnterPos = lVar.a().getAckEnterPos();
        kotlin.jvm.internal.m.e(ackEnterPos, "getAckEnterPos(...)");
        return ackEnterPos.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    public static long q() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                return cf.x.n().thaiDbVersion;
            }
            if (i11 == 61) {
                return cf.x.n().hiDbVersion;
            }
            if (i11 == 63) {
                return cf.x.n().ukrDbVersion;
            }
            if (i11 == 65) {
                return cf.x.n().grkDbVersion;
            }
            if (i11 == 69) {
                return cf.x.n().malDbVersion;
            }
            switch (i11) {
                case 0:
                    return cf.x.n().csDbVersion;
                case 1:
                    return cf.x.n().jsDbVersion;
                case 2:
                    return cf.x.n().koDbVersion;
                case 3:
                    return cf.x.n().enDbVersion;
                case 4:
                    return cf.x.n().esDbVersion;
                case 5:
                    return cf.x.n().frDbVersion;
                case 6:
                    return cf.x.n().deDbVersion;
                case 7:
                    return cf.x.n().vtDbVersion;
                case 8:
                    return cf.x.n().ptDbVersion;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            return cf.x.n().ruDbVersion;
                        case 11:
                            return cf.x.n().cnupDbVersion;
                        case 12:
                            return cf.x.n().jpupDbVersion;
                        case 13:
                            return cf.x.n().krupDbVersion;
                        case 14:
                            return cf.x.n().esDbVersion;
                        case 15:
                            return cf.x.n().frDbVersion;
                        case 16:
                            return cf.x.n().deDbVersion;
                        case 17:
                            return cf.x.n().ptDbVersion;
                        case 18:
                            return cf.x.n().idnDbVersion;
                        case 19:
                            return cf.x.n().polDbVersion;
                        case 20:
                            break;
                        case 21:
                            return cf.x.n().turDbVersion;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    return cf.x.n().esusDbVersion;
                                case 49:
                                case 50:
                                    return cf.x.n().enesDbVersion;
                                case 51:
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            return cf.x.n().frusDbVersion;
                                        case 55:
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                    break;
                            }
                            return cf.x.n().arDbVersion;
                    }
                    break;
            }
        }
        return cf.x.n().itDbVersion;
    }

    public static String r() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        String flashCardFocusUnit = lVar.a().getFlashCardFocusUnit();
        kotlin.jvm.internal.m.e(flashCardFocusUnit, "getFlashCardFocusUnit(...)");
        return flashCardFocusUnit;
    }

    public static String s() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        String main = lVar.a().getMain();
        kotlin.jvm.internal.m.e(main, "getMain(...)");
        return oz.x.q0(main, "\"", BuildConfig.VERSION_NAME);
    }

    public static String t() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        return lVar.a().getMain_tt();
    }

    public static String u(Class cls) {
        LinkedHashMap linkedHashMap = d0.f36185b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            b0 b0Var = (b0) cls.getAnnotation(b0.class);
            strValue = b0Var != null ? b0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        kotlin.jvm.internal.m.c(strValue);
        return strValue;
    }

    public static final int v(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                int i14 = i12 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i11 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i12 - i16;
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i11 > i12) {
                int i17 = -i13;
                int i18 = i11 % i17;
                if (i18 < 0) {
                    i18 += i17;
                }
                int i19 = i12 % i17;
                if (i19 < 0) {
                    i19 += i17;
                }
                int i21 = (i18 - i19) % i17;
                if (i21 < 0) {
                    i21 += i17;
                }
                return i21 + i12;
            }
        }
        return i12;
    }

    public static final boolean w(ot.j1 j1Var) {
        if ((j1Var instanceof c1) || (j1Var instanceof z0)) {
            return true;
        }
        if ((j1Var instanceof ot.g1) && ((ot.g1) j1Var).f45826b.f46065c == a2.AudioWord) {
            return true;
        }
        if (!(j1Var instanceof ot.e1)) {
            return false;
        }
        ot.e1 e1Var = (ot.e1) j1Var;
        return e1Var.f45798a.f33770s == ht.r.M5 && e1Var.f45799b.f46042a.getSoundChangePronunciation().length() == 0;
    }

    public static final float x(float f5) {
        return hz.b.Q(hz.b.k(f5, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f) * 2.0f) / 2.0f;
    }

    public static final ArrayList y(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object objL;
        ArrayList arrayListM = w4.c.m(str, "achievementLeaderboard");
        List listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : listW0) {
            if (((String) obj4).length() > 0) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            int i12 = i11 + 1;
            try {
                List listW1 = oz.q.W0((String) arrayList.get(i11), new String[]{":"}, 0, 6);
                objL = new vt.t0((String) listW1.get(0), oz.q.W0((String) listW1.get(1), new String[]{"_"}, 0, 6), Long.parseLong((String) listW1.get(2)));
            } catch (Throwable th2) {
                objL = l(th2);
            }
            vt.t0 t0Var = qy.o.a(objL) == null ? (vt.t0) objL : null;
            if (t0Var != null) {
                arrayList2.add(t0Var);
            }
            i11 = i12;
        }
        String[] strArr = {AchievementLeaderBoardType.LEADERBOARD_CLASS_A, AchievementLeaderBoardType.LEADERBOARD_CLASS_B, AchievementLeaderBoardType.LEADERBOARD_CLASS_C, AchievementLeaderBoardType.LEADERBOARD_CLASS_D, AchievementLeaderBoardType.LEADERBOARD_CLASS_E, AchievementLeaderBoardType.LEADERBOARD_CLASS_F};
        for (int i13 = 0; i13 < 6; i13++) {
            String str2 = strArr[i13];
            int size2 = arrayList2.size();
            int i14 = 0;
            do {
                if (i14 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList2.get(i14);
                i14++;
            } while (!kotlin.jvm.internal.m.a(((vt.t0) obj).f54287a, str2));
            vt.t0 t0Var2 = (vt.t0) obj;
            int size3 = t0Var2 != null ? t0Var2.f54288b.size() : 0;
            int size4 = arrayList2.size();
            int i15 = 0;
            do {
                if (i15 >= size4) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList2.get(i15);
                i15++;
            } while (!kotlin.jvm.internal.m.a(((vt.t0) obj2).f54287a, str2));
            boolean z11 = obj2 != null;
            int size5 = arrayList2.size();
            int i16 = 0;
            do {
                if (i16 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = arrayList2.get(i16);
                i16++;
            } while (!kotlin.jvm.internal.m.a(((vt.t0) obj3).f54287a, str2));
            vt.t0 t0Var3 = (vt.t0) obj3;
            arrayListM.add(new AchievementLeaderBoard(str2, size3, z11, t0Var3 != null ? t0Var3.f54289c : 0L, BuildConfig.VERSION_NAME));
        }
        return arrayListM;
    }

    public static void z(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                qx.p.u(new IllegalStateException(defpackage.e.h(j13, "More produced than requested: ")));
                j13 = 0;
            }
        } while (!atomicLong.compareAndSet(j12, j13));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    public static final ArrayList B(List units, List queue, w4 w4Var) {
        Integer num;
        int iIntValue;
        kotlin.jvm.internal.m.f(units, "units");
        kotlin.jvm.internal.m.f(queue, "queue");
        kotlin.jvm.internal.m.f(w4Var, ypOOxsaJG.mUq);
        Map mapQ = o00.a.q(new lp.b(nz.n.R(ry.m.g0(queue), new ro.e(21)), 28));
        int i11 = 22;
        Map mapQ2 = o00.a.q(new o20.i(nz.n.R(ry.m.g0(queue), new ro.e(i11)), i11));
        ArrayList arrayList = new ArrayList(ry.n.W(units, 10));
        Iterator it = units.iterator();
        while (it.hasNext()) {
            d5 d5VarA = (d5) it.next();
            boolean z11 = d5VarA.f49619g;
            long j11 = d5VarA.f49613a;
            if (z11 && d5VarA.f49618f) {
                int[] iArr = q4.f50284a;
                int i12 = iArr[w4Var.ordinal()];
                int iIntValue2 = 0;
                if (i12 == 1) {
                    num = (Integer) mapQ.get(Long.valueOf(j11));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = (Integer) mapQ.get(Long.valueOf(j11));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = d5VarA.f49616d;
                }
                int i13 = iArr[w4Var.ordinal()];
                if (i13 == 1) {
                    iIntValue2 = d5VarA.f49617e;
                } else {
                    if (i13 != 2 && i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer num2 = (Integer) mapQ2.get(Long.valueOf(j11));
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    }
                }
                d5VarA = d5.a(d5VarA, iIntValue, iIntValue2, false, false, 103);
            }
            arrayList.add(d5VarA);
        }
        return arrayList;
    }
}
