package br;

import a0.f1;
import a0.l1;
import b0.k2;
import bp.b5;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingTheme;
import com.lingo.lingoskill.object.NewBillingThemeLearnPage;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.CommonUiState;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.lingodeer.data.model.uistate.DayStreakUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MainUiState;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.o0;
import fr.p3;
import h1.f6;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.List;
import l1.b1;
import l1.q1;
import l1.x1;
import lt.AJC.PQgum;
import mt.y3;
import tu.m0;
import w2.q0;
import xu.a1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f5027a = new t1.d(new at.a(9), false, 297151333);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f5028b = new t1.d(new at.a(10), false, 294752170);

    public static final void a(int i11, String picUrl, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(picUrl, "picUrl");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1984539851);
        int i12 = (sVar.f(picUrl) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            z1.r rVarA = d2.h.a(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new bp.h0(1, b1Var);
                sVar.o0(objQ2);
            }
            wb.k.b(picUrl, null, rVarA, null, (fz.c) objQ2, w2.i.f54517d, sVar, (i12 & 14) | 12583344, 64376);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new k2(29);
                sVar.o0(objQ3);
            }
            l1 l1VarR = f1.r((fz.c) objQ3, 1);
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new k2(29);
                sVar.o0(objQ4);
            }
            rVar2 = rVar;
            a0.j0.d(zBooleanValue, rVar2, l1VarR, f1.w((fz.c) objQ4, 1), null, t1.e.d(-482623139, new at.p(2, picUrl, b1Var), sVar), sVar, (i12 & 112) | 200064, 16);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a(picUrl, rVar2, i11, 0);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
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
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
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
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v24 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v24 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v25 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v25 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v36 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v36 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v37 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v39 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r13v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v42 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r20v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v2 ??, new type: l1.s
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
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r6v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v27 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r6v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v29 ??, new type: boolean
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void b(int r31, int r32, boolean r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.lingo.lingoskill.object.NewBillingTheme r37, fz.a r38, fz.a r39, fz.f r40, t1.d r41, l1.n r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: br.e.b(int, int, boolean, java.lang.String, java.lang.String, java.lang.String, com.lingo.lingoskill.object.NewBillingTheme, fz.a, fz.a, fz.f, t1.d, l1.n, int):void");
    }

    public static final void d(final eh.e uiState, final boolean z11, final fz.c onClickFlashCard, final fz.c onClickQuiz, final fz.c onClickQuizVideo, final fz.c onClickCharacter, final fz.c onClickWord, final fz.c onClickExpression, final fz.c onClickKnowledgeCard, final fz.c onClickBookmarkCharacter, final fz.c cVar, final fz.c onClickBookmarkExtentWord, fz.c onClickBookmarkExpression, final fz.c cVar2, fz.c cVar3, fz.c cVar4, final fz.a onClickFutureReview, final fz.a onClickListenAlong, l1.n nVar, final int i11) {
        final fz.c cVar5;
        final fz.c cVar6;
        final fz.c cVar7;
        l1.s sVar;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onClickFlashCard, "onClickFlashCard");
        kotlin.jvm.internal.m.f(onClickQuiz, "onClickQuiz");
        kotlin.jvm.internal.m.f(onClickQuizVideo, "onClickQuizVideo");
        kotlin.jvm.internal.m.f(onClickCharacter, "onClickCharacter");
        kotlin.jvm.internal.m.f(onClickWord, "onClickWord");
        kotlin.jvm.internal.m.f(onClickExpression, "onClickExpression");
        kotlin.jvm.internal.m.f(onClickKnowledgeCard, "onClickKnowledgeCard");
        kotlin.jvm.internal.m.f(onClickBookmarkCharacter, "onClickBookmarkCharacter");
        kotlin.jvm.internal.m.f(cVar, bjXGJ.EBPoONZ);
        kotlin.jvm.internal.m.f(onClickBookmarkExtentWord, "onClickBookmarkExtentWord");
        kotlin.jvm.internal.m.f(onClickBookmarkExpression, "onClickBookmarkExpression");
        kotlin.jvm.internal.m.f(onClickFutureReview, "onClickFutureReview");
        kotlin.jvm.internal.m.f(onClickListenAlong, "onClickListenAlong");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(210072085);
        int i12 = i11 | (sVar2.f(uiState) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(onClickFlashCard) ? 256 : 128) | (sVar2.h(onClickQuiz) ? 2048 : 1024);
        boolean zH = sVar2.h(onClickQuizVideo);
        int i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i14 = i12 | (zH ? 16384 : 8192) | (sVar2.h(onClickCharacter) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickWord) ? 1048576 : 524288) | (sVar2.h(onClickExpression) ? 8388608 : 4194304) | (sVar2.h(onClickKnowledgeCard) ? 67108864 : 33554432) | (sVar2.h(onClickBookmarkCharacter) ? 536870912 : 268435456);
        int i15 = 48 | (sVar2.h(cVar) ? 4 : 2) | (sVar2.h(onClickBookmarkExpression) ? 256 : 128) | (sVar2.h(cVar2) ? 2048 : 1024);
        if (sVar2.h(cVar3)) {
            i13 = 16384;
        }
        int i16 = i15 | i13 | (sVar2.h(cVar4) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickFutureReview) ? 1048576 : 524288) | (sVar2.h(onClickListenAlong) ? 8388608 : 4194304);
        if (!sVar2.T(i14 & 1, ((i14 & 306783379) == 306783378 && (4793491 & i16) == 4793490) ? false : true)) {
            cVar5 = onClickBookmarkExpression;
            cVar6 = cVar3;
            cVar7 = cVar4;
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(eh.c.f25541a)) {
            sVar2.d0(15837188);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            cVar5 = onClickBookmarkExpression;
            cVar6 = cVar3;
            cVar7 = cVar4;
            sVar = sVar2;
        } else {
            if (!(uiState instanceof eh.d)) {
                throw nv.p.x(sVar2, 15838580, false);
            }
            sVar2.d0(491114960);
            eh.d dVar = (eh.d) uiState;
            int i17 = dVar.f25542a;
            int i18 = dVar.f25546e;
            int i19 = dVar.f25549h;
            int i21 = dVar.f25550i;
            int i22 = i19 + i21;
            int i23 = dVar.f25548g;
            int i24 = dVar.f25554n;
            int i25 = dVar.f25551j;
            int i26 = dVar.f25552k;
            int i27 = dVar.f25553l;
            int i28 = dVar.f25555o;
            int i29 = dVar.m;
            int i30 = dVar.f25556p;
            int i31 = dVar.f25557q;
            int i32 = dVar.f25558r;
            boolean zV = xt.d.v(i17);
            boolean z12 = z11 && xt.d.j(i17);
            boolean z13 = dVar.f25543b;
            int i33 = i14 & 14;
            boolean z14 = ((i14 & 896) == 256) | (i33 == 4);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (z14 || objQ == gVar) {
                final int i34 = 13;
                objQ = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i34) {
                            case 0:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickFlashCard.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickFlashCard.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickFlashCard.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickFlashCard.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean z15 = ((i14 & 7168) == 2048) | (i33 == 4);
            Object objQ2 = sVar2.Q();
            if (z15 || objQ2 == gVar) {
                final int i35 = 1;
                objQ2 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i35) {
                            case 0:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickQuiz.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickQuiz.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickQuiz.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickQuiz.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ2);
            }
            fz.a aVar2 = (fz.a) objQ2;
            boolean z16 = ((i14 & 57344) == 16384) | (i33 == 4);
            Object objQ3 = sVar2.Q();
            if (z16 || objQ3 == gVar) {
                final int i36 = 2;
                objQ3 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i36) {
                            case 0:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickQuizVideo.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickQuizVideo.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickQuizVideo.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickQuizVideo.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ3);
            }
            fz.a aVar3 = (fz.a) objQ3;
            boolean z17 = ((i14 & 458752) == 131072) | (i33 == 4);
            Object objQ4 = sVar2.Q();
            if (z17 || objQ4 == gVar) {
                final int i37 = 3;
                objQ4 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i37) {
                            case 0:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickCharacter.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickCharacter.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickCharacter.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ4);
            }
            fz.a aVar4 = (fz.a) objQ4;
            boolean z18 = ((3670016 & i14) == 1048576) | (i33 == 4);
            Object objQ5 = sVar2.Q();
            if (z18 || objQ5 == gVar) {
                final int i38 = 4;
                objQ5 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i38) {
                            case 0:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickWord.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickWord.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickWord.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickWord.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ5);
            }
            fz.a aVar5 = (fz.a) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = new ju.d(25);
                sVar2.o0(objQ6);
            }
            fz.a aVar6 = (fz.a) objQ6;
            boolean z19 = ((29360128 & i14) == 8388608) | (i33 == 4);
            Object objQ7 = sVar2.Q();
            if (z19 || objQ7 == gVar) {
                final int i39 = 5;
                objQ7 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i39) {
                            case 0:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickExpression.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickExpression.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickExpression.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickExpression.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ7);
            }
            fz.a aVar7 = (fz.a) objQ7;
            boolean z20 = ((234881024 & i14) == 67108864) | (i33 == 4);
            Object objQ8 = sVar2.Q();
            if (z20 || objQ8 == gVar) {
                final int i40 = 0;
                objQ8 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i40) {
                            case 0:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickKnowledgeCard.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickKnowledgeCard.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickKnowledgeCard.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickKnowledgeCard.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ8);
            }
            fz.a aVar8 = (fz.a) objQ8;
            boolean z21 = ((1879048192 & i14) == 536870912) | (i33 == 4);
            Object objQ9 = sVar2.Q();
            if (z21 || objQ9 == gVar) {
                final int i41 = 6;
                objQ9 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i41) {
                            case 0:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickBookmarkCharacter.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickBookmarkCharacter.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickBookmarkCharacter.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickBookmarkCharacter.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ9);
            }
            fz.a aVar9 = (fz.a) objQ9;
            boolean z22 = ((i16 & 14) == 4) | (i33 == 4);
            Object objQ10 = sVar2.Q();
            if (z22 || objQ10 == gVar) {
                final int i42 = 7;
                objQ10 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i42) {
                            case 0:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                cVar.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                cVar.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                cVar.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                cVar.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ10);
            }
            fz.a aVar10 = (fz.a) objQ10;
            boolean z23 = i33 == 4;
            Object objQ11 = sVar2.Q();
            if (z23 || objQ11 == gVar) {
                final int i43 = 8;
                objQ11 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i43) {
                            case 0:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                onClickBookmarkExtentWord.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                onClickBookmarkExtentWord.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ11);
            }
            fz.a aVar11 = (fz.a) objQ11;
            boolean z24 = ((i16 & 896) == 256) | (i33 == 4);
            Object objQ12 = sVar2.Q();
            if (z24 || objQ12 == gVar) {
                final int i44 = 9;
                cVar5 = onClickBookmarkExpression;
                objQ12 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i44) {
                            case 0:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                cVar5.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                cVar5.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                cVar5.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                cVar5.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ12);
            } else {
                cVar5 = onClickBookmarkExpression;
            }
            fz.a aVar12 = (fz.a) objQ12;
            boolean z25 = ((i16 & 7168) == 2048) | (i33 == 4);
            Object objQ13 = sVar2.Q();
            if (z25 || objQ13 == gVar) {
                final int i45 = 10;
                objQ13 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i45) {
                            case 0:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                cVar2.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                cVar2.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                cVar2.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                cVar2.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ13);
            }
            fz.a aVar13 = (fz.a) objQ13;
            boolean z26 = ((i16 & 57344) == 16384) | (i33 == 4);
            Object objQ14 = sVar2.Q();
            if (z26 || objQ14 == gVar) {
                final int i46 = 11;
                cVar6 = cVar3;
                objQ14 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i46) {
                            case 0:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                cVar6.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                cVar6.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                cVar6.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                cVar6.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ14);
            } else {
                cVar6 = cVar3;
            }
            fz.a aVar14 = (fz.a) objQ14;
            boolean z27 = ((i16 & 458752) == 131072) | (i33 == 4);
            Object objQ15 = sVar2.Q();
            if (z27 || objQ15 == gVar) {
                final int i47 = 12;
                cVar7 = cVar4;
                objQ15 = new fz.a() { // from class: br.i0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i47) {
                            case 0:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25551j));
                                break;
                            case 1:
                                eh.d dVar2 = (eh.d) uiState;
                                cVar7.invoke(Integer.valueOf(dVar2.f25549h + dVar2.f25550i));
                                break;
                            case 2:
                                eh.d dVar3 = (eh.d) uiState;
                                cVar7.invoke(Integer.valueOf(dVar3.f25549h + dVar3.f25550i));
                                break;
                            case 3:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25548g));
                                break;
                            case 4:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25549h));
                                break;
                            case 5:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25550i));
                                break;
                            case 6:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25552k));
                                break;
                            case 7:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25553l));
                                break;
                            case 8:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25555o));
                                break;
                            case 9:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).m));
                                break;
                            case 10:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25556p));
                                break;
                            case 11:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25557q));
                                break;
                            case 12:
                                cVar7.invoke(Integer.valueOf(((eh.d) uiState).f25558r));
                                break;
                            default:
                                cVar7.invoke(Boolean.valueOf(((eh.d) uiState).f25547f));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ15);
            } else {
                cVar7 = cVar4;
            }
            y3.n(i18, i22, i23, i19, i24, i21, i25, zV, z12, z13, i26, i27, i29, i28, i30, i31, i32, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, (fz.a) objQ15, onClickFutureReview, onClickListenAlong, sVar2, 0, (i16 >> 9) & 64512);
            sVar = sVar2;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.c cVar8 = cVar6;
            final fz.c cVar9 = cVar7;
            final fz.c cVar10 = cVar5;
            x1VarT.f39502d = new fz.e(z11, onClickFlashCard, onClickQuiz, onClickQuizVideo, onClickCharacter, onClickWord, onClickExpression, onClickKnowledgeCard, onClickBookmarkCharacter, cVar, onClickBookmarkExtentWord, cVar10, cVar2, cVar8, cVar9, onClickFutureReview, onClickListenAlong, i11) { // from class: br.j0
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.c K;
                public final /* synthetic */ fz.c L;
                public final /* synthetic */ fz.c M;
                public final /* synthetic */ fz.c N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ fz.c P;
                public final /* synthetic */ fz.c Q;
                public final /* synthetic */ fz.c R;
                public final /* synthetic */ fz.a S;
                public final /* synthetic */ fz.a T;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f5054b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.c f5055c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.c f5056d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f5057e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f5058f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f5059t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    e.d(this.f5053a, this.f5054b, this.f5055c, this.f5056d, this.f5057e, this.f5058f, this.f5059t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void e(List items, String currentRoute, MergedBillingThemeBillingPage mergedBillingThemeConfig, boolean z11, fz.c onClick, l1.n nVar, int i11) {
        long jW;
        kotlin.jvm.internal.m.f(items, "items");
        kotlin.jvm.internal.m.f(currentRoute, "currentRoute");
        kotlin.jvm.internal.m.f(mergedBillingThemeConfig, "mergedBillingThemeConfig");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1214123195);
        int i12 = i11 | (sVar.h(items) ? 4 : 2) | (sVar.f(currentRoute) ? 32 : 16) | (sVar.h(mergedBillingThemeConfig) ? 256 : 128) | (sVar.g(z11) ? 2048 : 1024) | (sVar.h(onClick) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            boolean zEquals = currentRoute.equals("premium");
            if (zEquals) {
                sVar.d0(2024863161);
                sVar.p(false);
                jW = j3.w(mergedBillingThemeConfig.getMembershipTabSelectedBgColor());
            } else {
                sVar.d0(2024945590);
                jW = ((s1) sVar.j(v1.f31180a)).f31033p;
                sVar.p(false);
            }
            long j11 = jW;
            float f5 = 0;
            f6.a(e2.g(j0.c.v(d0.n.h(z1.o.f58481a, j11, g2.f0.f28556b)), 62), j11, 0L, f5, j0.c.h(CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), t1.e.d(-433810316, new b0(items, currentRoute, zEquals, mergedBillingThemeConfig, onClick, z11), sVar), sVar, 199680);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(items, currentRoute, mergedBillingThemeConfig, z11, onClick, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qy.h] */
    public static final void f(MainComposeActivity mainComposeActivity, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(170560341);
        int i12 = (sVar.h(mainComposeActivity) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            b1 b1VarO = l1.t.o(mainComposeActivity.r().V, sVar);
            b1 b1VarO2 = l1.t.o(mainComposeActivity.r().U, sVar);
            b1 b1VarO3 = l1.t.o(mainComposeActivity.r().W, sVar);
            b1 b1VarO4 = l1.t.o(((m0) mainComposeActivity.H.getValue()).f52609t, sVar);
            boolean zF = sVar.f((DayStreakUiState) b1VarO.getValue()) | sVar.f((DailyGoalUiState) b1VarO2.getValue()) | sVar.f((CommonUiState) b1VarO3.getValue()) | sVar.f((LeaderBoardUiState) b1VarO4.getValue());
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new MainUiState((DayStreakUiState) b1VarO.getValue(), (DailyGoalUiState) b1VarO2.getValue(), (CommonUiState) b1VarO3.getValue(), (LeaderBoardUiState) b1VarO4.getValue());
                sVar.o0(objQ);
            }
            MainUiState mainUiState = (MainUiState) objQ;
            boolean zH = sVar.h(mainComposeActivity);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new h(mainComposeActivity, 2);
                sVar.o0(objQ2);
            }
            a1.c(mainUiState, (fz.c) objQ2, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(mainComposeActivity, i11, 1);
        }
    }

    public static final void g(MainComposeActivity mainComposeActivity, fz.a onSubscribeSuccess, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onSubscribeSuccess, "onSubscribeSuccess");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(129896393);
        int i12 = (sVar.h(mainComposeActivity) ? 4 : 2) | i11 | (sVar.h(onSubscribeSuccess) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            gp.l1 l1VarS = mainComposeActivity.s();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH = sVar.h(mainComposeActivity) | ((i12 & 112) == 32);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new at.f(10, onSubscribeSuccess, mainComposeActivity);
                sVar.o0(objQ2);
            }
            fz.a aVar2 = (fz.a) objQ2;
            boolean zH2 = sVar.h(mainComposeActivity);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new f(mainComposeActivity, 6);
                sVar.o0(objQ3);
            }
            fz.a aVar3 = (fz.a) objQ3;
            boolean zH3 = sVar.h(mainComposeActivity);
            Object objQ4 = sVar.Q();
            if (zH3 || objQ4 == gVar) {
                objQ4 = new f(mainComposeActivity, 7);
                sVar.o0(objQ4);
            }
            fz.a aVar4 = (fz.a) objQ4;
            boolean zH4 = sVar.h(mainComposeActivity);
            Object objQ5 = sVar.Q();
            if (zH4 || objQ5 == gVar) {
                objQ5 = new f(mainComposeActivity, 8);
                sVar.o0(objQ5);
            }
            fz.a aVar5 = (fz.a) objQ5;
            boolean zH5 = sVar.h(mainComposeActivity);
            Object objQ6 = sVar.Q();
            if (zH5 || objQ6 == gVar) {
                objQ6 = new f(mainComposeActivity, 9);
                sVar.o0(objQ6);
            }
            yg.o.g(mainComposeActivity, "bottom_tab", l1VarS, null, false, aVar, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ6, sVar, (i12 & 14) | 221232, 8);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.h(mainComposeActivity, i11, 14, onSubscribeSuccess);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qy.h] */
    public static final void h(MainComposeActivity mainComposeActivity, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1102491179);
        int i12 = (sVar.h(mainComposeActivity) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            b1 b1VarO = l1.t.o(((eh.f) mainComposeActivity.L.getValue()).H, sVar);
            int i13 = ((o0) mainComposeActivity.l()).f27733a.fluentLanguage;
            z1.o oVar = z1.o.f58481a;
            if (i13 != -1) {
                sVar.d0(-699641983);
                ub.a.H(hh.f1.class, e2.d(j0.c.F(oVar), 1.0f), null, null, null, sVar, 0, 28);
                sVar.p(false);
            } else if (((o0) mainComposeActivity.l()).f27733a.scLanguage == -1 && ((o0) mainComposeActivity.l()).f27733a.handWriteLanguage == -1) {
                sVar.d0(-699121927);
                eh.e eVar = (eh.e) b1VarO.getValue();
                boolean z11 = ((o0) mainComposeActivity.l()).f27733a.enableNativeSpeakerVideos;
                boolean zH = sVar.h(mainComposeActivity);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zH || objQ == gVar) {
                    objQ = new h(mainComposeActivity, 3);
                    sVar.o0(objQ);
                }
                fz.c cVar = (fz.c) objQ;
                boolean zH2 = sVar.h(mainComposeActivity);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new h(mainComposeActivity, 8);
                    sVar.o0(objQ2);
                }
                fz.c cVar2 = (fz.c) objQ2;
                boolean zH3 = sVar.h(mainComposeActivity);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == gVar) {
                    objQ3 = new h(mainComposeActivity, 9);
                    sVar.o0(objQ3);
                }
                fz.c cVar3 = (fz.c) objQ3;
                boolean zH4 = sVar.h(mainComposeActivity);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == gVar) {
                    objQ4 = new h(mainComposeActivity, 10);
                    sVar.o0(objQ4);
                }
                fz.c cVar4 = (fz.c) objQ4;
                boolean zH5 = sVar.h(mainComposeActivity);
                Object objQ5 = sVar.Q();
                if (zH5 || objQ5 == gVar) {
                    objQ5 = new h(mainComposeActivity, 11);
                    sVar.o0(objQ5);
                }
                fz.c cVar5 = (fz.c) objQ5;
                boolean zH6 = sVar.h(mainComposeActivity);
                Object objQ6 = sVar.Q();
                if (zH6 || objQ6 == gVar) {
                    objQ6 = new h(mainComposeActivity, 12);
                    sVar.o0(objQ6);
                }
                fz.c cVar6 = (fz.c) objQ6;
                boolean zH7 = sVar.h(mainComposeActivity);
                Object objQ7 = sVar.Q();
                if (zH7 || objQ7 == gVar) {
                    objQ7 = new h(mainComposeActivity, 13);
                    sVar.o0(objQ7);
                }
                fz.c cVar7 = (fz.c) objQ7;
                boolean zH8 = sVar.h(mainComposeActivity);
                Object objQ8 = sVar.Q();
                if (zH8 || objQ8 == gVar) {
                    objQ8 = new h(mainComposeActivity, 14);
                    sVar.o0(objQ8);
                }
                fz.c cVar8 = (fz.c) objQ8;
                boolean zH9 = sVar.h(mainComposeActivity);
                Object objQ9 = sVar.Q();
                if (zH9 || objQ9 == gVar) {
                    objQ9 = new h(mainComposeActivity, 15);
                    sVar.o0(objQ9);
                }
                fz.c cVar9 = (fz.c) objQ9;
                Object objQ10 = sVar.Q();
                if (objQ10 == gVar) {
                    objQ10 = new b(3);
                    sVar.o0(objQ10);
                }
                fz.c cVar10 = (fz.c) objQ10;
                boolean zH10 = sVar.h(mainComposeActivity);
                Object objQ11 = sVar.Q();
                if (zH10 || objQ11 == gVar) {
                    objQ11 = new h(mainComposeActivity, 4);
                    sVar.o0(objQ11);
                }
                fz.c cVar11 = (fz.c) objQ11;
                boolean zH11 = sVar.h(mainComposeActivity);
                Object objQ12 = sVar.Q();
                if (zH11 || objQ12 == gVar) {
                    objQ12 = new h(mainComposeActivity, 5);
                    sVar.o0(objQ12);
                }
                fz.c cVar12 = (fz.c) objQ12;
                boolean zH12 = sVar.h(mainComposeActivity);
                Object objQ13 = sVar.Q();
                if (zH12 || objQ13 == gVar) {
                    objQ13 = new h(mainComposeActivity, 6);
                    sVar.o0(objQ13);
                }
                fz.c cVar13 = (fz.c) objQ13;
                boolean zH13 = sVar.h(mainComposeActivity);
                Object objQ14 = sVar.Q();
                if (zH13 || objQ14 == gVar) {
                    objQ14 = new h(mainComposeActivity, 7);
                    sVar.o0(objQ14);
                }
                fz.c cVar14 = (fz.c) objQ14;
                boolean zH14 = sVar.h(mainComposeActivity);
                Object objQ15 = sVar.Q();
                if (zH14 || objQ15 == gVar) {
                    objQ15 = new f(mainComposeActivity, 10);
                    sVar.o0(objQ15);
                }
                fz.a aVar = (fz.a) objQ15;
                boolean zH15 = sVar.h(mainComposeActivity);
                Object objQ16 = sVar.Q();
                if (zH15 || objQ16 == gVar) {
                    objQ16 = new f(mainComposeActivity, 11);
                    sVar.o0(objQ16);
                }
                d(eVar, z11, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, aVar, (fz.a) objQ16, sVar, 0);
                sVar = sVar;
                sVar.p(false);
            } else {
                sVar.d0(-699389023);
                ub.a.H(b5.class, e2.d(j0.c.F(oVar), 1.0f), null, null, null, sVar, 0, 28);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(mainComposeActivity, i11, 2);
        }
    }

    public static final void c(String saleBarTitle, String str, String timeStr, NewBillingTheme billingTheme, z1.r rVar, fz.a onClickBillingBar, l1.n nVar, int i11) {
        int i12;
        y2.i iVar;
        y2.h hVar;
        String newTopBarBtnEndColor;
        String newTopBarBtnColor;
        String newTopBarEndColor;
        String newTopBarColor;
        kotlin.jvm.internal.m.f(saleBarTitle, "saleBarTitle");
        kotlin.jvm.internal.m.f(str, PQgum.KaIiKtj);
        kotlin.jvm.internal.m.f(timeStr, "timeStr");
        kotlin.jvm.internal.m.f(billingTheme, "billingTheme");
        kotlin.jvm.internal.m.f(onClickBillingBar, "onClickBillingBar");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(486209235);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(saleBarTitle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(timeStr) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(billingTheme) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(onClickBillingBar) ? 131072 : 65536;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 74899) != 74898)) {
            z1.r rVarB = d2.h.b(j0.c.B(e2.g(rVar, 56), 32, 0), r0.f.d(10));
            NewBillingThemeLearnPage learnPage = billingTheme.getLearnPage();
            z1.r rVarG = d0.n.g(rVarB, p3.q(ns.o.L(new g2.x((learnPage == null || (newTopBarColor = learnPage.getNewTopBarColor()) == null) ? g2.f0.e(4280586735L) : tv.a.j(newTopBarColor)), new g2.x((learnPage == null || (newTopBarEndColor = learnPage.getNewTopBarEndColor()) == null) ? g2.f0.e(4280586735L) : tv.a.j(newTopBarEndColor)))), null, 6);
            int i14 = i13 & 458752;
            boolean z11 = i14 == 131072;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new at.r(11, onClickBillingBar);
                sVar.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarG, false, null, (fz.a) objQ, 15);
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = e2.d(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarD);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            String newTopBarLeftIconUrl = billingTheme.getLearnPage().getNewTopBarLeftIconUrl();
            k2.b bVarY = se.k.y(R.drawable.new_top_sale_bar_crown, sVar, 0);
            sVar.e0(1445305568);
            wb.r rVar2 = wb.k.f54917b;
            vb.f fVarE = wb.k.e(wb.s.f54930a, sVar);
            sVar.e0(-79978785);
            wb.l lVar = new wb.l(newTopBarLeftIconUrl, rVar2, fVarE);
            hc.e eVar = wb.t.f54932b;
            wb.i iVarG = wb.k.g(lVar, bVarY == null ? wb.i.W : new s0.a(bVarY, 23), null, w2.i.f54515b, sVar);
            sVar.p(false);
            sVar.p(false);
            float f5 = 8;
            d0.n.c(iVarG, null, e2.n(j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 35), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarC3 = j0.c.C(new i1(1.0f, true), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            y0 y0Var = (y0) sVar.j(ua.f31167a);
            long jA = j3.A(18);
            n3.s sVar2 = n3.s.L;
            String newTopBarTextColor = billingTheme.getLearnPage().getNewTopBarTextColor();
            iu.k.h(saleBarTitle, rVarC3, 0L, null, null, 0L, j3.A(14), j3.A(18), null, 0L, null, 2, false, 2, 0, null, y0.a(y0Var, newTopBarTextColor != null ? tv.a.j(newTopBarTextColor) : g2.x.f28618e, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i13 & 14) | 14155776, 1597440, 1490748);
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar2;
                sVar.k(iVar);
            } else {
                iVar = iVar2;
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC4, sVar);
            long jA2 = j3.A(12);
            String newTopBarCountDownColor = billingTheme.getLearnPage().getNewTopBarCountDownColor();
            y2.h hVar6 = hVar;
            y2.i iVar3 = iVar;
            ua.b(timeStr, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, new y0(newTopBarCountDownColor != null ? tv.a.j(newTopBarCountDownColor) : g2.x.f28618e, jA2, sVar2, null, 0L, 0, 0L, 16777208), sVar, (i13 >> 6) & 14, 0, 65534);
            float f11 = 4;
            z1.r rVarB2 = d2.h.b(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), r0.f.d(50));
            NewBillingThemeLearnPage learnPage2 = billingTheme.getLearnPage();
            z1.r rVarG2 = d0.n.g(rVarB2, p3.q(ns.o.L(new g2.x((learnPage2 == null || (newTopBarBtnColor = learnPage2.getNewTopBarBtnColor()) == null) ? g2.f0.e(4294959104L) : tv.a.j(newTopBarBtnColor)), new g2.x((learnPage2 == null || (newTopBarBtnEndColor = learnPage2.getNewTopBarBtnEndColor()) == null) ? g2.f0.e(4294959104L) : tv.a.j(newTopBarBtnEndColor)))), null, 6);
            boolean z12 = i14 == 131072;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new at.r(12, onClickBillingBar);
                sVar.o0(objQ2);
            }
            z1.r rVarB3 = j0.c.B(d0.n.o(rVarG2, false, null, (fz.a) objQ2, 15), f5, f11);
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarB3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(hVar5, rVarC5, sVar);
            long jA3 = j3.A(10);
            String newTopBarBtnTextColor = billingTheme.getLearnPage().getNewTopBarBtnTextColor();
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, new y0(newTopBarBtnTextColor != null ? tv.a.j(newTopBarBtnTextColor) : g2.f0.e(4280586735L), jA3, sVar2, null, 0L, 0, 0L, 16777208), sVar, (i13 >> 3) & 14, 3072, 57342);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(saleBarTitle, str, timeStr, billingTheme, rVar, onClickBillingBar, i11, 0);
        }
    }
}
