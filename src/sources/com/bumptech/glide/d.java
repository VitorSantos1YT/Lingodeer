package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Base64;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.ParserException;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import b0.x0;
import bt.h7;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SerializableTimingResult;
import com.yalantis.ucrop.view.CropImageView;
import e6.a0;
import e6.g1;
import e6.i1;
import e6.k1;
import e6.z0;
import fb.g0;
import fr.a2;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j0.e2;
import j9.d0;
import j9.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kv.j0;
import l1.b1;
import l1.s;
import l1.t;
import l1.x1;
import org.koin.core.error.NoDefinitionFoundException;
import qp.n2;
import qy.c0;
import ry.x;
import rz.e0;
import rz.o0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final a20.a G(Object... objArr) {
        return new a20.a(2, ry.l.l0(objArr));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    public static void H(Context context, Bitmap bitmap, int i11) throws Throwable {
        BaseObj baseObj;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.setRadius(i11);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        renderScriptCreate.destroy();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                    } catch (Throwable th2) {
                        th = th2;
                        BaseObj baseObj2 = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        baseObj = baseObj2;
                        if (renderScript != null) {
                            renderScript.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (baseObj != null) {
                            baseObj.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    baseObj = allocationCreateTyped;
                    if (renderScript != null) {
                        renderScript.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (baseObj != null) {
                        baseObj.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th5) {
            th = th5;
            baseObj = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }

    public static void I(View view, final ViewGroup viewGroup) {
        final Point point = new Point();
        View.OnDragListener onDragListener = new View.OnDragListener() { // from class: vq.e
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view2, DragEvent dragEvent) {
                dragEvent.getAction();
                d dVar = (d) dragEvent.getLocalState();
                if (dVar != null) {
                    View view3 = dVar.f54094a;
                    f fVar = dVar.f54095b;
                    if (fVar != null) {
                        int[] iArr = new int[2];
                        view2.getLocationOnScreen(iArr);
                        int x11 = (int) (dragEvent.getX() + iArr[0]);
                        Point point2 = point;
                        point2.x = x11;
                        point2.y = (int) (((dragEvent.getY() + iArr[1]) - view3.getHeight()) - (view3.getHeight() / 2));
                        int[] iArr2 = new int[2];
                        Rect rect = new Rect();
                        int action = dragEvent.getAction();
                        if (action != 1) {
                            ViewGroup viewGroup2 = viewGroup;
                            if (action == 2) {
                                viewGroup2.getLocationOnScreen(iArr2);
                                int i11 = iArr2[0];
                                rect.left = i11;
                                rect.top = iArr2[1];
                                rect.right = viewGroup2.getWidth() + i11;
                                rect.bottom = viewGroup2.getHeight() + iArr2[1];
                                fVar.f(view3, point2);
                                return true;
                            }
                            if (action == 3) {
                                viewGroup2.getLocationOnScreen(iArr2);
                                int i12 = iArr2[0];
                                rect.left = i12;
                                rect.top = iArr2[1];
                                rect.right = viewGroup2.getWidth() + i12;
                                rect.bottom = viewGroup2.getHeight() + iArr2[1];
                                if (rect.contains(point2.x, point2.y)) {
                                    return fVar.w(view3, point2);
                                }
                            } else {
                                if (action == 4) {
                                    view2.post(new androidx.fragment.app.d(view2, dVar, fVar));
                                    return true;
                                }
                                if (action != 6) {
                                }
                            }
                        } else if (view2 == view3) {
                            view2.setVisibility(4);
                            fVar.r(view2);
                        }
                        return true;
                    }
                }
                return false;
            }
        };
        view.setOnDragListener(onDragListener);
        viewGroup.setOnDragListener(onDragListener);
    }

    public static final void L(c6.i iVar) {
        g1 g1Var = g1.f24916d;
        ArrayList arrayList = iVar.f6630b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            c6.g gVar = (c6.g) g1Var.invoke((c6.g) obj);
            iVar.f6630b.set(i11, gVar);
            if (gVar instanceof c6.i) {
                L((c6.i) gVar);
            }
            i11 = i13;
        }
    }

    public static final LinkedHashMap N(c6.i iVar) {
        ArrayList arrayList = iVar.f6630b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            c6.g gVar = (c6.g) obj;
            c6.l lVarB = gVar.b();
            qy.l lVar = lVarB.b(g1.f24914b) ? (qy.l) lVarB.a(new qy.l(null, c6.j.f6631a), z0.M) : new qy.l(null, lVarB);
            d6.b bVar = (d6.b) lVar.f48495a;
            c6.l lVar2 = (c6.l) lVar.f48496b;
            d6.a aVar = bVar != null ? bVar.f23202a : null;
            qy.l lVar3 = aVar instanceof d6.e ? new qy.l(aVar, lVar2) : new qy.l(null, lVar2);
            if (gVar instanceof c6.i) {
                for (Map.Entry entry : N((c6.i) gVar).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i11 = i13;
        }
        return linkedHashMap;
    }

    public static final void a(r rVar, int i11, ht.l lVar, RecordingStatus recordingStatus, ht.q courseTestState, fz.a getAudioTime, fz.a aVar, l1.n nVar, int i12) {
        fz.a aVar2;
        vy.d dVar;
        l1.g gVar;
        ht.l audioPlayingState = lVar;
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        s sVar = (s) nVar;
        sVar.f0(288955543);
        int i13 = i12 | (sVar.f(rVar) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(audioPlayingState) ? 256 : 128) | (sVar.h(recordingStatus) ? 2048 : 1024) | (sVar.d(courseTestState.ordinal()) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(getAudioTime) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | 1572864;
        if (sVar.T(i13 & 1, (599187 & i13) != 599186)) {
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            fz.a aVar3 = (fz.a) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = t.B(new qy.l(-1L, -1L));
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar2) {
                objQ3 = t.B(new qy.l(-1L, -1L));
                sVar.o0(objQ3);
            }
            b1 b1Var2 = (b1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar2) {
                objQ4 = t.B(null);
                sVar.o0(objQ4);
            }
            b1 b1Var3 = (b1) objQ4;
            int i14 = 57344 & i13;
            boolean z11 = i14 == 16384;
            Object objQ5 = sVar.Q();
            if (z11 || objQ5 == gVar2) {
                objQ5 = t.B(Boolean.FALSE);
                sVar.o0(objQ5);
            }
            b1 b1Var4 = (b1) objQ5;
            y yVar = new y();
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar2) {
                sVar.o0(null);
                objQ6 = null;
            }
            yVar.f38361a = (rz.g1) objQ6;
            RiveAnimationView riveAnimationView = (RiveAnimationView) b1Var3.getValue();
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar2) {
                objQ7 = new nu.b(10, b1Var3, aVar3, null);
                sVar.o0(objQ7);
            }
            RiveAnimationView.Companion companion = RiveAnimationView.Companion;
            t.f((fz.e) objQ7, riveAnimationView, sVar);
            boolean zF = (i14 == 16384) | sVar.f(b1Var4);
            Object objQ8 = sVar.Q();
            if (zF || objQ8 == gVar2) {
                dVar = null;
                objQ8 = new nu.b(11, courseTestState, b1Var4, dVar);
                sVar.o0(objQ8);
            } else {
                dVar = null;
            }
            t.f((fz.e) objQ8, courseTestState, sVar);
            int i15 = i13 & 112;
            boolean z12 = i15 == 32;
            Object objQ9 = sVar.Q();
            if (z12 || objQ9 == gVar2) {
                objQ9 = "Reset";
                sVar.o0("Reset");
            }
            String str = (String) objQ9;
            t.f(new x0(b1Var3, i11, str, b1Var, b1Var2, yVar, (vy.d) null), (qy.l) b1Var.getValue(), sVar);
            boolean zF2 = (i14 == 16384) | sVar.f(b1Var4);
            Object objQ10 = sVar.Q();
            if (zF2 || objQ10 == gVar2) {
                gVar = gVar2;
                qg.e eVar = new qg.e(b1Var3, courseTestState, b1Var4, dVar, 5);
                sVar.o0(eVar);
                objQ10 = eVar;
            } else {
                gVar = gVar2;
            }
            t.f((fz.e) objQ10, courseTestState, sVar);
            t.f(new ss.a(b1Var3, recordingStatus, str, yVar, null), recordingStatus, sVar);
            audioPlayingState = lVar;
            t.f(new h7(yVar, lVar, b1Var, getAudioTime, null), audioPlayingState, sVar);
            r rVarD = e2.d(rVar, 1.0f);
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar) {
                objQ11 = new mt.p(21, b1Var3);
                sVar.o0(objQ11);
            }
            tv.g.a(rVarD, i11, null, null, false, (fz.c) objQ11, sVar, i15 | 1572864, 60);
            aVar2 = aVar3;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(rVar, i11, audioPlayingState, recordingStatus, courseTestState, getAudioTime, aVar2, i12);
        }
    }

    public static final long c(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final void d(y yVar, b1 b1Var) {
        rz.g1 g1Var = (rz.g1) yVar.f38361a;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        RiveAnimationView riveAnimationView = (RiveAnimationView) b1Var.getValue();
        if (riveAnimationView != null) {
            for (StateMachineInstance stateMachine : riveAnimationView.getController().getStateMachines()) {
                kotlin.jvm.internal.m.f(stateMachine, "stateMachine");
                List<SMIInput> inputs = stateMachine.getInputs();
                ArrayList arrayList = new ArrayList();
                for (Object obj : inputs) {
                    if (((SMIInput) obj).isNumber()) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    riveAnimationView.setNumberState(stateMachine.getName(), ((SMIInput) obj2).getName(), CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
            RiveFileController.setNumberState$default(riveAnimationView.getController(), "InLesson", "100", 100.0f, null, 8, null);
        }
    }

    public static final Context e(e20.a aVar) throws a4.b {
        kotlin.jvm.internal.m.f(aVar, "<this>");
        try {
            return (Context) aVar.a(null, null, z.a(Context.class));
        } catch (NoDefinitionFoundException unused) {
            throw new a4.b("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 2);
        }
    }

    public static final String f(j0 j0Var) {
        kotlin.jvm.internal.m.f(j0Var, "<this>");
        return nv.p.k(j0Var.f38761b, j0Var.f38767h.name(), ":");
    }

    public static final List g(ArrayList arrayList, List list, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Instant instant, ZoneId zoneId) {
        long j11;
        int iFloorMod;
        ArrayList arrayList2;
        Instant instant2;
        long epochSecond;
        long j12;
        int iIntValue;
        if (list.isEmpty()) {
            return ry.r.f50854a;
        }
        LocalDate localDate4 = localDate.compareTo((ChronoLocalDate) localDate2) <= 0 ? localDate : localDate2;
        LocalDate localDate5 = localDate.compareTo((ChronoLocalDate) localDate2) >= 0 ? localDate : localDate2;
        long j13 = 1;
        long jBetween = ChronoUnit.DAYS.between(localDate4, localDate5) + 1;
        long j14 = 0;
        if (jBetween <= 0) {
            throw new IllegalArgumentException("Future review schedule range must contain at least one date");
        }
        List listS0 = ry.m.S0(list, new a2(new gu.g(19), 5));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((SRSStatus) it.next()).getId());
        }
        Map mapQ = o00.a.q(new lf.x0(nz.n.R(nz.n.X(new nz.i(ry.m.g0(arrayList), false, new ot.e2(linkedHashSet, 19)), new ot.e2(zoneId, 20)), new n2(8, localDate4, localDate5)), 29));
        if (listS0.size() < jBetween) {
            int size = listS0.size();
            LinkedHashMap linkedHashMapK0 = x.k0(mapQ);
            arrayList2 = new ArrayList(size);
            int i11 = 0;
            while (i11 < size) {
                long j15 = i11;
                long j16 = j13;
                long j17 = size;
                long j18 = j14;
                long j19 = (j15 * jBetween) / j17;
                long j21 = (((j15 + j16) * jBetween) / j17) - j16;
                long j22 = j19 + j21;
                long j23 = Long.MAX_VALUE;
                LocalDate localDatePlusDays = localDate4.plusDays(j19);
                int i12 = Integer.MAX_VALUE;
                while (j19 <= j21) {
                    LocalDate localDatePlusDays2 = localDate4.plusDays(j19);
                    Integer num = (Integer) linkedHashMapK0.get(localDatePlusDays2);
                    if (num != null) {
                        long j24 = j19;
                        iIntValue = num.intValue();
                        j12 = j24;
                    } else {
                        j12 = j19;
                        iIntValue = 0;
                    }
                    long jAbs = Math.abs((2 * j12) - j22);
                    if (iIntValue < i12 || ((iIntValue == i12 && jAbs < j23) || (iIntValue == i12 && jAbs == j23 && localDatePlusDays2.compareTo(localDatePlusDays) < 0))) {
                        localDatePlusDays = localDatePlusDays2;
                        i12 = iIntValue;
                        j23 = jAbs;
                    }
                    j19 = j12 + j16;
                }
                linkedHashMapK0.put(localDatePlusDays, Integer.valueOf(i12 + 1));
                arrayList2.add(localDatePlusDays);
                i11++;
                j13 = j16;
                j14 = j18;
            }
            j11 = j14;
        } else {
            j11 = 0;
            int size2 = listS0.size();
            int i13 = (int) jBetween;
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(localDate4.plusDays(i14));
            }
            int[] iArr = new int[i13];
            for (int i15 = 0; i15 < i13; i15++) {
                Integer num2 = (Integer) mapQ.get(arrayList3.get(i15));
                iArr[i15] = num2 != null ? num2.intValue() : 0;
            }
            if (i13 == 1) {
                iFloorMod = 0;
            } else {
                long epochDay = localDate4.toEpochDay();
                Iterator it2 = listS0.iterator();
                while (it2.hasNext()) {
                    String id2 = ((SRSStatus) it2.next()).getId();
                    for (int i16 = 0; i16 < id2.length(); i16++) {
                        epochDay = (epochDay * 31) + ((long) id2.charAt(i16));
                    }
                    epochDay = (epochDay * 31) + 1;
                }
                iFloorMod = (int) Math.floorMod(epochDay, i13);
            }
            arrayList2 = new ArrayList(size2);
            int i17 = 0;
            while (i17 < size2) {
                Integer numC0 = ry.l.c0(iArr);
                int iIntValue2 = numC0 != null ? numC0.intValue() : 0;
                int size3 = arrayList3.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    int i19 = (iFloorMod + i18) % i13;
                    if (iArr[i19] == iIntValue2) {
                        iFloorMod = i19;
                        break;
                    }
                }
                iArr[iFloorMod] = iArr[iFloorMod] + 1;
                arrayList2.add((LocalDate) arrayList3.get(iFloorMod));
                i17++;
                iFloorMod = (iFloorMod + 1) % i13;
            }
        }
        List listR0 = ry.m.R0(arrayList2);
        Iterator it3 = listS0.iterator();
        Iterator it4 = listR0.iterator();
        ArrayList arrayList4 = new ArrayList(Math.min(ry.n.W(listS0, 10), ry.n.W(listR0, 10)));
        while (it3.hasNext() && it4.hasNext()) {
            Object next = it3.next();
            LocalDate localDate6 = (LocalDate) it4.next();
            SRSStatus sRSStatus = (SRSStatus) next;
            Instant instant3 = localDate6.L(sRSStatus.getNextReviewTime() > j11 ? Instant.ofEpochSecond(sRSStatus.getNextReviewTime()).atZone(zoneId).toLocalTime() : LocalTime.NOON).G(zoneId).toInstant();
            if (localDate6.equals(localDate3)) {
                instant2 = instant;
                if (instant3.isBefore(instant2)) {
                    epochSecond = instant2.getEpochSecond();
                }
                arrayList4.add(SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, epochSecond, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, instant2.getEpochSecond(), true, null, 1308671, null));
            } else {
                instant2 = instant;
            }
            epochSecond = instant3.getEpochSecond();
            arrayList4.add(SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, epochSecond, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, instant2.getEpochSecond(), true, null, 1308671, null));
        }
        return arrayList4;
    }

    public static final double j(int i11, int i12, int i13, int i14, hc.f fVar) {
        double d5 = ((double) i13) / ((double) i11);
        double d11 = ((double) i14) / ((double) i12);
        int i15 = xb.g.f55989a[fVar.ordinal()];
        if (i15 == 1) {
            return Math.max(d5, d11);
        }
        if (i15 == 2) {
            return Math.min(d5, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final v k(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        v vVar = new v(context);
        m9.g gVar = vVar.f36257b;
        d0 d0Var = gVar.f41087s;
        d0Var.a(new k9.g(d0Var));
        d0 d0Var2 = gVar.f41087s;
        d0Var2.a(new k9.i());
        d0Var2.a(new k9.o());
        return vVar;
    }

    public static Bitmap l(byte[] bArr, int i11, int i12) throws IOException {
        BitmapFactory.Options options;
        int i13 = 0;
        if (i12 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i11, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i12; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i11, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            y5.h hVar = new y5.h(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (hVar.c()) {
                case 3:
                case 4:
                    i13 = AchievementLevelType.DAY_STREAK_LV_8;
                    break;
                case 5:
                case 8:
                    i13 = 270;
                    break;
                case 6:
                case 7:
                    i13 = 90;
                    break;
            }
            if (i13 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i13);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == 'a') {
                sb2.append('z');
            } else if (cCharAt == 'A') {
                sb2.append('Z');
            } else if ((cCharAt <= 'a' || cCharAt > 'z') && (cCharAt <= 'A' || cCharAt > 'Z')) {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - 1));
            }
        }
        try {
            return new String(Base64.decode(sb2.toString().getBytes(Constants.ENCODING), 2), Constants.ENCODING);
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        } catch (NullPointerException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String n(String str) {
        try {
            String str2 = new String(Base64.encode(str.getBytes(Constants.ENCODING), 2), Constants.ENCODING);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str2.length(); i11++) {
                char cCharAt = str2.charAt(i11);
                if (cCharAt == 'z') {
                    sb2.append('a');
                } else if (cCharAt == 'Z') {
                    sb2.append('A');
                } else if ((cCharAt < 'a' || cCharAt >= 'z') && (cCharAt < 'A' || cCharAt >= 'Z')) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + 1));
                }
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        } catch (NullPointerException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0018->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0071 A[SYNTHETIC] */
    public static final List o(i1 i1Var, int i11, int i12) {
        TreeMap treeMap;
        qy.l lVar;
        Iterator it;
        boolean z11;
        int iIntValue;
        TreeMap treeMap2;
        kotlin.jvm.internal.m.f(i1Var, "<this>");
        LinkedHashMap linkedHashMap = i1Var.f24942a;
        if (i11 == i12) {
            return ry.r.f50854a;
        }
        boolean z12 = i12 > i11;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z12) {
                if (i11 <= i12) {
                    return arrayList;
                }
                if (z12) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i11));
                    if (treeMap2 == null) {
                        lVar = null;
                    } else {
                        lVar = new qy.l(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i11));
                    if (treeMap == null) {
                        lVar = null;
                    } else {
                        lVar = new qy.l(treeMap, treeMap.keySet());
                    }
                }
                if (lVar == null) {
                    Map map = (Map) lVar.f48495a;
                    it = ((Iterable) lVar.f48496b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z11 = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z12) {
                            if (i11 + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i12 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i11 >= i12) {
                    return arrayList;
                }
                if (z12) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i11));
                    if (treeMap2 == null) {
                        lVar = null;
                    } else {
                        lVar = new qy.l(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i11));
                    if (treeMap == null) {
                        lVar = null;
                    } else {
                        lVar = new qy.l(treeMap, treeMap.keySet());
                    }
                }
                if (lVar == null) {
                    Map map2 = (Map) lVar.f48495a;
                    it = ((Iterable) lVar.f48496b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z12) {
                            if (i12 <= iIntValue && iIntValue < i11) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                kotlin.jvm.internal.m.c(obj);
                                arrayList.add(obj);
                                z11 = true;
                                i11 = iIntValue;
                                break;
                                break;
                            }
                        } else if (i11 + 1 <= iIntValue && iIntValue <= i12) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            kotlin.jvm.internal.m.c(obj2);
                            arrayList.add(obj2);
                            z11 = true;
                            i11 = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z11);
        return null;
    }

    public static final Object p(SerializableTimingResult serializableTimingResult, xy.c cVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new av.p(serializableTimingResult, null, 19), cVar);
    }

    public static boolean s(String str) {
        boolean z11 = false;
        for (int i11 = 0; i11 < 5; i11++) {
            String str2 = zq.b.f59264t[i11];
            int length = str2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                boolean z13 = kotlin.jvm.internal.m.h(str2.charAt(!z12 ? i12 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length--;
                } else if (z13) {
                    i12++;
                } else {
                    z12 = true;
                }
            }
            String strG = w4.c.g(str2, length, 1, i12);
            int length2 = str.length() - 1;
            int i13 = 0;
            boolean z14 = false;
            while (i13 <= length2) {
                boolean z15 = kotlin.jvm.internal.m.h(str.charAt(!z14 ? i13 : length2), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length2--;
                } else if (z15) {
                    i13++;
                } else {
                    z14 = true;
                }
            }
            if (kotlin.jvm.internal.m.a(strG, str.subSequence(i13, length2 + 1).toString())) {
                z11 = true;
                break;
            }
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 65 && str.equals(";")) {
            return true;
        }
        return z11;
    }

    public static final boolean t(w9.b bVar, int i11, int i12) {
        kotlin.jvm.internal.m.f(bVar, "<this>");
        if (i11 > i12 && bVar.f54765l) {
            return false;
        }
        Set set = bVar.m;
        return bVar.f54764k && (set == null || !set.contains(Integer.valueOf(i11)));
    }

    public static qy.h u(qy.j mode, fz.a initializer) {
        qy.y yVar = qy.y.f48514a;
        kotlin.jvm.internal.m.f(mode, "mode");
        kotlin.jvm.internal.m.f(initializer, "initializer");
        int i11 = qy.i.f48494a[mode.ordinal()];
        if (i11 == 1) {
            return new qy.q(initializer);
        }
        if (i11 == 2) {
            qy.p pVar = new qy.p();
            pVar.f48500a = initializer;
            pVar.f48501b = yVar;
            return pVar;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        c0 c0Var = new c0();
        c0Var.f48489a = initializer;
        c0Var.f48490b = yVar;
        return c0Var;
    }

    public static qy.q v(fz.a initializer) {
        kotlin.jvm.internal.m.f(initializer, "initializer");
        return new qy.q(initializer);
    }

    public static final j9.y w(fz.c cVar) {
        j9.z zVar = new j9.z();
        cVar.invoke(zVar);
        boolean z11 = zVar.f36278b;
        boolean z12 = zVar.f36279c;
        String str = zVar.f36281e;
        j9.x xVar = zVar.f36277a;
        if (str != null) {
            boolean z13 = zVar.f36282f;
            boolean z14 = zVar.f36283g;
            xVar.f36264b = str;
            xVar.f36263a = -1;
            xVar.f36265c = z13;
            xVar.f36266d = z14;
        } else {
            int i11 = zVar.f36280d;
            boolean z15 = zVar.f36282f;
            boolean z16 = zVar.f36283g;
            xVar.f36263a = i11;
            xVar.f36264b = null;
            xVar.f36265c = z15;
            xVar.f36266d = z16;
        }
        String str2 = xVar.f36264b;
        if (str2 == null) {
            return new j9.y(z11, z12, xVar.f36263a, xVar.f36265c, xVar.f36266d, xVar.f36267e, xVar.f36268f);
        }
        boolean z17 = xVar.f36265c;
        boolean z18 = xVar.f36266d;
        int i12 = xVar.f36267e;
        int i13 = xVar.f36268f;
        int i14 = j9.q.f36240e;
        j9.y yVar = new j9.y(z11, z12, "android-app://androidx.navigation/".concat(str2).hashCode(), z17, z18, i12, i13);
        yVar.f36276h = str2;
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    public static final void x(k1 k1Var) {
        ArrayList arrayList = k1Var.f6630b;
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        if (!(((c6.g) obj) instanceof a0)) {
                            if (arrayList.size() != 1) {
                                k6.i iVar = new k6.i();
                                ry.m.d0(iVar.f6630b, arrayList);
                                arrayList.clear();
                                arrayList.add(iVar);
                            }
                        }
                    }
                }
            }
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                c6.g gVar = (c6.g) obj2;
                kotlin.jvm.internal.m.d(gVar, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                ArrayList arrayList2 = ((a0) gVar).f6630b;
                if (arrayList2.size() != 1) {
                    k6.i iVar2 = new k6.i();
                    ry.m.d0(iVar2.f6630b, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(iVar2);
                }
            }
        } else if (arrayList.size() != 1) {
            k6.i iVar3 = new k6.i();
            ry.m.d0(iVar3.f6630b, arrayList);
            arrayList.clear();
            arrayList.add(iVar3);
        }
        y(k1Var);
        L(k1Var);
    }

    public static final void y(c6.i iVar) {
        ArrayList arrayList = iVar.f6630b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            c6.g gVar = (c6.g) obj;
            if (gVar instanceof c6.i) {
                y((c6.i) gVar);
            }
        }
        k6.m mVar = (k6.m) iVar.b().a(null, z0.O);
        p6.g gVar2 = p6.f.f46316a;
        boolean z11 = (mVar != null ? mVar.f37937a : gVar2) instanceof p6.f;
        p6.e eVar = p6.e.f46315a;
        if (z11 && (arrayList == null || !arrayList.isEmpty())) {
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList.get(i13);
                i13++;
                k6.m mVar2 = (k6.m) ((c6.g) obj2).b().a(null, z0.Q);
                if ((mVar2 != null ? mVar2.f37937a : null) instanceof p6.e) {
                    iVar.c(iVar.b().d(new k6.m(eVar)));
                    break;
                }
            }
        }
        k6.t tVar = (k6.t) iVar.b().a(null, z0.P);
        if (tVar != null) {
            gVar2 = tVar.f37954a;
        }
        if (gVar2 instanceof p6.f) {
            if (arrayList == null || !arrayList.isEmpty()) {
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    k6.t tVar2 = (k6.t) ((c6.g) obj3).b().a(null, z0.R);
                    if ((tVar2 != null ? tVar2.f37954a : null) instanceof p6.e) {
                        iVar.c(iVar.b().d(new k6.t(eVar)));
                        return;
                    }
                }
            }
        }
    }

    public static Bitmap z(Context context, Bitmap bitmap, py.a aVar) {
        boolean z11;
        int i11;
        int i12 = aVar.f47207a;
        int i13 = aVar.f47210d;
        int i14 = i12 / i13;
        int i15 = aVar.f47208b / i13;
        int[] iArr = {i14, i15};
        int i16 = 0;
        while (true) {
            Bitmap bitmap2 = null;
            if (i16 >= 2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f5 = 1.0f / aVar.f47210d;
                canvas.scale(f5, f5);
                Paint paint = new Paint();
                paint.setFlags(3);
                paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmap, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
                try {
                    H(context, bitmapCreateBitmap, aVar.f47209c);
                    z11 = true;
                } catch (RSRuntimeException unused) {
                    int i17 = aVar.f47209c;
                    if (i17 < 1) {
                        z11 = true;
                    } else {
                        int width = bitmapCreateBitmap.getWidth();
                        int height = bitmapCreateBitmap.getHeight();
                        int i18 = width * height;
                        int[] iArr2 = new int[i18];
                        bitmapCreateBitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
                        int i19 = width - 1;
                        int i21 = height - 1;
                        int i22 = i17 + i17;
                        int i23 = i22 + 1;
                        int[] iArr3 = new int[i18];
                        int[] iArr4 = new int[i18];
                        int[] iArr5 = new int[i18];
                        z11 = true;
                        int[] iArr6 = new int[Math.max(width, height)];
                        int i24 = (i22 + 2) >> 1;
                        int i25 = i24 * i24;
                        int i26 = 0;
                        int i27 = i25 * 256;
                        int[] iArr7 = new int[i27];
                        for (int i28 = 0; i28 < i27; i28++) {
                            iArr7[i28] = i28 / i25;
                        }
                        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i23, 3);
                        int i29 = i17 + 1;
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 0;
                        while (i30 < height) {
                            int[][] iArr9 = iArr8;
                            int i33 = -i17;
                            int i34 = i26;
                            int i35 = i34;
                            int i36 = i35;
                            int i37 = i36;
                            int i38 = i37;
                            int i39 = i38;
                            int i40 = i39;
                            int i41 = i40;
                            int i42 = i41;
                            while (i33 <= i17) {
                                int[] iArr10 = iArr4;
                                int i43 = i29;
                                int i44 = i26;
                                int i45 = iArr2[Math.min(i19, Math.max(i33, i44)) + i31];
                                int[] iArr11 = iArr9[i33 + i17];
                                iArr11[i44] = (i45 & 16711680) >> 16;
                                iArr11[1] = (i45 & 65280) >> 8;
                                iArr11[2] = i45 & 255;
                                int iAbs = i43 - Math.abs(i33);
                                int i46 = iArr11[i44];
                                i34 = (i46 * iAbs) + i34;
                                int i47 = iArr11[1];
                                i35 = (i47 * iAbs) + i35;
                                int i48 = iArr11[2];
                                i36 = (iAbs * i48) + i36;
                                if (i33 > 0) {
                                    i40 += i46;
                                    i41 += i47;
                                    i42 += i48;
                                } else {
                                    i37 += i46;
                                    i38 += i47;
                                    i39 += i48;
                                }
                                i33++;
                                iArr4 = iArr10;
                                i29 = i43;
                                i26 = 0;
                            }
                            int[] iArr12 = iArr4;
                            int i49 = i29;
                            int i50 = i17;
                            int i51 = 0;
                            while (i51 < width) {
                                iArr3[i31] = iArr7[i34];
                                iArr12[i31] = iArr7[i35];
                                iArr5[i31] = iArr7[i36];
                                int i52 = i34 - i37;
                                int i53 = i35 - i38;
                                int i54 = i36 - i39;
                                int[] iArr13 = iArr9[((i50 - i17) + i23) % i23];
                                int i55 = i37 - iArr13[0];
                                int i56 = i38 - iArr13[1];
                                int i57 = i39 - iArr13[2];
                                if (i30 == 0) {
                                    i11 = i51;
                                    iArr6[i11] = Math.min(i51 + i17 + 1, i19);
                                } else {
                                    i11 = i51;
                                }
                                int i58 = iArr2[i32 + iArr6[i11]];
                                int i59 = (i58 & 16711680) >> 16;
                                iArr13[0] = i59;
                                int i60 = (i58 & 65280) >> 8;
                                iArr13[1] = i60;
                                int i61 = i58 & 255;
                                iArr13[2] = i61;
                                int i62 = i40 + i59;
                                int i63 = i41 + i60;
                                int i64 = i42 + i61;
                                i34 = i52 + i62;
                                i35 = i53 + i63;
                                i36 = i54 + i64;
                                i50 = (i50 + 1) % i23;
                                int[] iArr14 = iArr9[i50 % i23];
                                int i65 = iArr14[0];
                                i37 = i55 + i65;
                                int i66 = iArr14[1];
                                i38 = i56 + i66;
                                int i67 = iArr14[2];
                                i39 = i57 + i67;
                                i40 = i62 - i65;
                                i41 = i63 - i66;
                                i42 = i64 - i67;
                                i31++;
                                i51 = i11 + 1;
                            }
                            i32 += width;
                            i30++;
                            iArr8 = iArr9;
                            iArr4 = iArr12;
                            i29 = i49;
                            i26 = 0;
                        }
                        int[][] iArr15 = iArr8;
                        int[] iArr16 = iArr4;
                        int i68 = i29;
                        int i69 = 0;
                        while (i69 < width) {
                            int i70 = -i17;
                            int i71 = i70 * width;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (i70 <= i17) {
                                int i81 = i17;
                                int iMax = Math.max(0, i71) + i69;
                                int[] iArr17 = iArr15[i70 + i81];
                                iArr17[0] = iArr3[iMax];
                                iArr17[1] = iArr16[iMax];
                                iArr17[2] = iArr5[iMax];
                                int iAbs2 = i68 - Math.abs(i70);
                                i72 = (iArr3[iMax] * iAbs2) + i72;
                                i73 = (iArr16[iMax] * iAbs2) + i73;
                                i74 = (iArr5[iMax] * iAbs2) + i74;
                                if (i70 > 0) {
                                    i78 += iArr17[0];
                                    i79 += iArr17[1];
                                    i80 += iArr17[2];
                                } else {
                                    i75 += iArr17[0];
                                    i76 += iArr17[1];
                                    i77 += iArr17[2];
                                }
                                if (i70 < i21) {
                                    i71 += width;
                                }
                                i70++;
                                i17 = i81;
                            }
                            int i82 = i17;
                            int i83 = i69;
                            int i84 = i82;
                            int i85 = 0;
                            while (i85 < height) {
                                iArr2[i83] = (iArr2[i83] & (-16777216)) | (iArr7[i72] << 16) | (iArr7[i73] << 8) | iArr7[i74];
                                int i86 = i72 - i75;
                                int i87 = i73 - i76;
                                int i88 = i74 - i77;
                                int[] iArr18 = iArr15[((i84 - i82) + i23) % i23];
                                int i89 = i75 - iArr18[0];
                                int i90 = i76 - iArr18[1];
                                int i91 = i77 - iArr18[2];
                                int i92 = i85;
                                if (i69 == 0) {
                                    iArr6[i92] = Math.min(i92 + i68, i21) * width;
                                }
                                int i93 = iArr6[i92] + i69;
                                int i94 = iArr3[i93];
                                iArr18[0] = i94;
                                int i95 = iArr16[i93];
                                iArr18[1] = i95;
                                int i96 = iArr5[i93];
                                iArr18[2] = i96;
                                int i97 = i78 + i94;
                                int i98 = i79 + i95;
                                int i99 = i80 + i96;
                                i72 = i86 + i97;
                                i73 = i87 + i98;
                                i74 = i88 + i99;
                                i84 = (i84 + 1) % i23;
                                int[] iArr19 = iArr15[i84];
                                int i100 = iArr19[0];
                                i75 = i89 + i100;
                                int i101 = iArr19[1];
                                i76 = i90 + i101;
                                int i102 = iArr19[2];
                                i77 = i91 + i102;
                                i78 = i97 - i100;
                                i79 = i98 - i101;
                                i80 = i99 - i102;
                                i83 += width;
                                i85 = i92 + 1;
                            }
                            i69++;
                            i17 = i82;
                        }
                        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
                        bitmap2 = bitmapCreateBitmap;
                    }
                    bitmapCreateBitmap = bitmap2;
                }
                boolean z12 = z11;
                if (aVar.f47210d == z12) {
                    return bitmapCreateBitmap;
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, aVar.f47207a, aVar.f47208b, z12);
                bitmapCreateBitmap.recycle();
                return bitmapCreateScaledBitmap;
            }
            if (iArr[i16] == 0) {
                return null;
            }
            i16++;
        }
    }

    public abstract void D(int i11);

    public abstract void E(View view, int i11, int i12);

    public abstract void F(View view, float f5, float f11);

    public void J(uw.k kVar) {
        try {
            K(kVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void K(uw.k kVar);

    public abstract boolean M(View view, int i11);

    public abstract int h(View view, int i11);

    public abstract int i(View view, int i11);

    public int q(View view) {
        return 0;
    }

    public int r() {
        return 0;
    }

    public void B(int i11) {
    }

    public void A(int i11, int i12) {
    }

    public void C(View view, int i11) {
    }
}
