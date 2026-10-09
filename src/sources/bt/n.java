package bt;

import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.LessonType;
import com.lingodeer.data.model.SyllableWriteCharacter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.ee;
import rt.ub;
import rt.vb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, CourseUnitFinishStatus courseUnitFinishStatus, boolean z11, vt.n0 n0Var, vy.d dVar) {
        super(2, dVar);
        this.f5732a = 5;
        this.f5735d = list;
        this.f5736e = courseUnitFinishStatus;
        this.f5733b = z11;
        this.f5734c = n0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5732a) {
            case 0:
                return new n(this.f5733b, (ys.d0) this.f5735d, (CourseCharacter) this.f5736e, (l1.b1) this.f5734c, dVar, 0);
            case 1:
                return new n(this.f5733b, (fz.e) this.f5735d, (CourseWord) this.f5736e, (l1.b1) this.f5734c, dVar, 1);
            case 2:
                return new n(this.f5733b, (fz.c) this.f5735d, (l1.b1) this.f5734c, (l1.b1) this.f5736e, dVar);
            case 3:
                return new n((jt.i2) this.f5735d, this.f5733b, (x1.p) this.f5736e, (HashMap) this.f5734c, dVar);
            case 4:
                return new n((l1.b1) this.f5734c, (SyllableWriteCharacter) this.f5735d, this.f5733b, (fz.c) this.f5736e, dVar);
            default:
                return new n((List) this.f5735d, (CourseUnitFinishStatus) this.f5736e, this.f5733b, (vt.n0) this.f5734c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5732a) {
            case 0:
                n nVar = (n) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                nVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                n nVar2 = (n) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                nVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                n nVar3 = (n) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                nVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                n nVar4 = (n) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                nVar4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                n nVar5 = (n) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                nVar5.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                return ((n) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f9 A[PHI: r1 r28 r33 r43
      0x02f9: PHI (r1v80 float) = (r1v125 float), (r1v126 float) binds: [B:150:0x02f7, B:143:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r28v6 float) = (r28v10 float), (r28v11 float) binds: [B:150:0x02f7, B:143:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r33v17 l1.k1) = (r33v19 l1.k1), (r33v20 l1.k1) binds: [B:150:0x02f7, B:143:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r43v15 java.util.Iterator) = (r43v17 java.util.Iterator), (r43v18 java.util.Iterator) binds: [B:150:0x02f7, B:143:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0317 A[Catch: all -> 0x02eb, TryCatch #8 {all -> 0x02eb, blocks: (B:142:0x02d7, B:154:0x02ff, B:156:0x0317, B:158:0x0339, B:161:0x033f, B:169:0x0381, B:173:0x0389, B:177:0x0391, B:182:0x039a, B:190:0x03e8, B:194:0x03f0, B:198:0x03f8, B:205:0x0405), top: B:462:0x02d7 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0336  */
    /* JADX WARN: Code duplicated, block: B:160:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x033f A[Catch: all -> 0x02eb, TryCatch #8 {all -> 0x02eb, blocks: (B:142:0x02d7, B:154:0x02ff, B:156:0x0317, B:158:0x0339, B:161:0x033f, B:169:0x0381, B:173:0x0389, B:177:0x0391, B:182:0x039a, B:190:0x03e8, B:194:0x03f0, B:198:0x03f8, B:205:0x0405), top: B:462:0x02d7 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0377  */
    /* JADX WARN: Code duplicated, block: B:164:0x0379  */
    /* JADX WARN: Code duplicated, block: B:167:0x037e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0380  */
    /* JADX WARN: Code duplicated, block: B:171:0x0386  */
    /* JADX WARN: Code duplicated, block: B:172:0x0388  */
    /* JADX WARN: Code duplicated, block: B:175:0x038e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0390  */
    /* JADX WARN: Code duplicated, block: B:180:0x0396  */
    /* JADX WARN: Code duplicated, block: B:182:0x039a A[Catch: all -> 0x02eb, TryCatch #8 {all -> 0x02eb, blocks: (B:142:0x02d7, B:154:0x02ff, B:156:0x0317, B:158:0x0339, B:161:0x033f, B:169:0x0381, B:173:0x0389, B:177:0x0391, B:182:0x039a, B:190:0x03e8, B:194:0x03f0, B:198:0x03f8, B:205:0x0405), top: B:462:0x02d7 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03de  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:203:0x0401  */
    /* JADX WARN: Code duplicated, block: B:205:0x0405 A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #8 {all -> 0x02eb, blocks: (B:142:0x02d7, B:154:0x02ff, B:156:0x0317, B:158:0x0339, B:161:0x033f, B:169:0x0381, B:173:0x0389, B:177:0x0391, B:182:0x039a, B:190:0x03e8, B:194:0x03f0, B:198:0x03f8, B:205:0x0405), top: B:462:0x02d7 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x043a  */
    /* JADX WARN: Code duplicated, block: B:210:0x043c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0441  */
    /* JADX WARN: Code duplicated, block: B:214:0x0443  */
    /* JADX WARN: Code duplicated, block: B:217:0x0449  */
    /* JADX WARN: Code duplicated, block: B:218:0x044b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0451  */
    /* JADX WARN: Code duplicated, block: B:222:0x0453  */
    /* JADX WARN: Code duplicated, block: B:228:0x045c  */
    /* JADX WARN: Code duplicated, block: B:230:0x045f A[Catch: all -> 0x0459, TRY_LEAVE, TryCatch #6 {all -> 0x0459, blocks: (B:207:0x0410, B:215:0x0444, B:219:0x044c, B:223:0x0454, B:230:0x045f, B:253:0x04f5, B:257:0x050c), top: B:458:0x0410 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:241:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:242:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:245:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:246:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:392:0x0796  */
    /* JADX WARN: Code duplicated, block: B:395:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:396:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:399:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:402:0x07c8 A[PHI: r11
      0x07c8: PHI (r11v5 w2.x) = (r11v4 w2.x), (r11v7 w2.x) binds: [B:398:0x07b5, B:400:0x07c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:407:0x0805  */
    /* JADX WARN: Code duplicated, block: B:408:0x0815  */
    /* JADX WARN: Code duplicated, block: B:492:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x08a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x08a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x07e1 A[SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        long j11;
        l1.k1 k1Var;
        qy.b0 b0Var;
        w2.x xVar;
        w2.x xVar2;
        Iterator it;
        int i12;
        int i13;
        HashMap map;
        w2.x xVar3;
        int i14;
        w2.x xVar4;
        l1.k1 k1Var2;
        Float fValueOf;
        float f5;
        float f11;
        boolean z11;
        float fIntBitsToFloat;
        Float fValueOf2;
        Float f12;
        float fFloatValue;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        float fIntBitsToFloat5;
        float fIntBitsToFloat6;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f13;
        float fIntBitsToFloat7;
        float fIntBitsToFloat8;
        float fIntBitsToFloat9;
        float fIntBitsToFloat10;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        float fIntBitsToFloat11;
        float fIntBitsToFloat12;
        float fFloatValue2;
        float fIntBitsToFloat13;
        float fIntBitsToFloat14;
        float fIntBitsToFloat15;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        float fIntBitsToFloat16;
        float fIntBitsToFloat17;
        float fIntBitsToFloat18;
        float fIntBitsToFloat19;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        w2.x xVar5;
        HwView hwView;
        int i15 = this.f5732a;
        int i16 = 1;
        qy.b0 b0Var2 = qy.b0.f48488a;
        Object obj2 = this.f5734c;
        boolean z32 = this.f5733b;
        Object obj3 = this.f5735d;
        Object obj4 = this.f5736e;
        switch (i15) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z32) {
                    b.c((ys.d0) obj3, (CourseCharacter) obj4, (l1.b1) obj2);
                }
                return b0Var2;
            case 1:
                l1.b1 b1Var = (l1.b1) obj2;
                CourseWord courseWord = (CourseWord) obj4;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z32) {
                    ((fz.e) obj3).invoke(b7.e0.l(courseWord, "toString(...)"), new z6(20, b1Var));
                    b1Var.setValue(new ht.c(courseWord.getVisemedMap()));
                }
                return b0Var2;
            case 2:
                l1.b1 b1Var2 = (l1.b1) obj4;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                boolean z33 = z32 && ((Boolean) ((l1.b1) obj2).getValue()).booleanValue();
                if (((Boolean) b1Var2.getValue()).booleanValue() && !z33) {
                    ((fz.c) obj3).invoke(dt.z4.Idle);
                }
                b1Var2.setValue(Boolean.valueOf(z33));
                return b0Var2;
            case 3:
                x1.p pVar = (x1.p) obj4;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.i2 i2Var = (jt.i2) obj3;
                jt.h2 h2Var = (jt.h2) i2Var.f36976a.getValue();
                if (h2Var != null) {
                    CourseWord courseWord2 = h2Var.f36962a;
                    j11 = 4294967295L;
                    i11 = 2;
                    long jH = f2.b.h(h2Var.f36965d, h2Var.f36963b);
                    if (!z32 && (xVar5 = (w2.x) i2Var.f36980e.getValue()) != null) {
                        long jC = xVar5.c(0L);
                        long jM = xVar5.m();
                        int i17 = (int) (jC >> 32);
                        float fIntBitsToFloat20 = Float.intBitsToFloat(i17);
                        int i18 = (int) (jC & 4294967295L);
                        float fIntBitsToFloat21 = Float.intBitsToFloat(i18);
                        float fIntBitsToFloat22 = Float.intBitsToFloat(i17) + ((int) (jM >> 32));
                        float fIntBitsToFloat23 = Float.intBitsToFloat(i18) + ((int) (jM & 4294967295L));
                        float fIntBitsToFloat24 = Float.intBitsToFloat((int) (jH >> 32));
                        float fIntBitsToFloat25 = Float.intBitsToFloat((int) (jH & 4294967295L));
                        boolean z34 = (fIntBitsToFloat24 < fIntBitsToFloat22) & (fIntBitsToFloat24 >= fIntBitsToFloat20) & (fIntBitsToFloat25 >= fIntBitsToFloat21) & (fIntBitsToFloat25 < fIntBitsToFloat23);
                        boolean zContains = pVar.contains(courseWord2);
                        if (z34 && !zContains) {
                            pVar.add(courseWord2);
                        }
                    }
                } else {
                    i11 = 2;
                    j11 = 4294967295L;
                }
                HashMap map2 = (HashMap) obj2;
                l1.k1 k1Var3 = i2Var.f36976a;
                if (k1Var3.getValue() != null) {
                    jt.h2 h2Var2 = (jt.h2) k1Var3.getValue();
                    if (map2.containsKey(h2Var2 != null ? h2Var2.f36962a : null)) {
                        jt.h2 h2Var3 = (jt.h2) k1Var3.getValue();
                        if (ry.m.i0(pVar, h2Var3 != null ? h2Var3.f36962a : null)) {
                            Object value = k1Var3.getValue();
                            kotlin.jvm.internal.m.c(value);
                            long j12 = ((jt.h2) value).f36965d;
                            Object value2 = k1Var3.getValue();
                            kotlin.jvm.internal.m.c(value2);
                            long jH2 = f2.b.h(j12, ((jt.h2) value2).f36963b);
                            f2.b.j(jH2);
                            Iterator it2 = x1.q.e(pVar).f55734c.iterator();
                            int i19 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    int i21 = i19 + 1;
                                    CourseWord courseWord3 = (CourseWord) it2.next();
                                    w2.x xVar6 = (w2.x) map2.get(courseWord3);
                                    if (xVar6 != null && xVar6.k()) {
                                        if (i21 < pVar.size()) {
                                            xVar = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                            if (xVar == null) {
                                            }
                                        } else {
                                            xVar = null;
                                        }
                                        if (i19 > i16) {
                                            xVar2 = (w2.x) map2.get((CourseWord) pVar.get(i19 - 1));
                                            if (xVar2 == null) {
                                            }
                                            return b0Var;
                                        }
                                        xVar2 = null;
                                        jt.h2 h2Var4 = (jt.h2) k1Var3.getValue();
                                        if (!kotlin.jvm.internal.m.a(courseWord3, h2Var4 != null ? h2Var4.f36962a : null)) {
                                            k1Var = k1Var3;
                                            it = it2;
                                            b0Var = b0Var2;
                                            int i22 = i19;
                                            int i23 = jt.c.f36897a[hz.b.f(jH2, xVar6, xVar, xVar2, i22, i2Var.f36981f).ordinal()];
                                            i12 = 1;
                                            if (i23 != 1) {
                                                i13 = i11;
                                                if (i23 == i13) {
                                                    Object value3 = k1Var.getValue();
                                                    kotlin.jvm.internal.m.c(value3);
                                                    pVar.remove(((jt.h2) value3).f36962a);
                                                    Object value4 = k1Var.getValue();
                                                    kotlin.jvm.internal.m.c(value4);
                                                    pVar.add(i22, ((jt.h2) value4).f36962a);
                                                } else {
                                                    if (i23 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    it2 = it;
                                                    i16 = i12;
                                                    i19 = i21;
                                                    i11 = i13;
                                                    b0Var2 = b0Var;
                                                    k1Var3 = k1Var;
                                                }
                                            } else {
                                                Object value5 = k1Var.getValue();
                                                kotlin.jvm.internal.m.c(value5);
                                                pVar.remove(((jt.h2) value5).f36962a);
                                                if (i21 >= pVar.size()) {
                                                    Object value6 = k1Var.getValue();
                                                    kotlin.jvm.internal.m.c(value6);
                                                    pVar.add(((jt.h2) value6).f36962a);
                                                } else {
                                                    Object value7 = k1Var.getValue();
                                                    kotlin.jvm.internal.m.c(value7);
                                                    pVar.add(i21, ((jt.h2) value7).f36962a);
                                                }
                                            }
                                            return b0Var;
                                        }
                                        v3.m mVar = i2Var.f36981f;
                                        try {
                                            try {
                                                float fIntBitsToFloat26 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                if (xVar != null) {
                                                    k1Var2 = k1Var3;
                                                    try {
                                                        fValueOf = Float.valueOf(Float.intBitsToFloat((int) (xVar.c(0L) & j11)));
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        it = it2;
                                                        k1Var = k1Var2;
                                                        b0Var = b0Var2;
                                                        map = map2;
                                                        com.bumptech.glide.e.l(th);
                                                        if (i21 < pVar.size()) {
                                                            map2 = map;
                                                            xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                            if (xVar4 == null) {
                                                                xVar3 = xVar4;
                                                            }
                                                            return b0Var;
                                                        }
                                                        map2 = map;
                                                        xVar3 = xVar6;
                                                        i14 = i19 + 2;
                                                        if (i14 < pVar.size()) {
                                                            if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                Object value8 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value8);
                                                                pVar.remove(((jt.h2) value8).f36962a);
                                                                if (i21 >= pVar.size()) {
                                                                    Object value9 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value9);
                                                                    pVar.add(((jt.h2) value9).f36962a);
                                                                } else {
                                                                    Object value10 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value10);
                                                                    pVar.add(i21, ((jt.h2) value10).f36962a);
                                                                }
                                                            } else {
                                                                i12 = 1;
                                                                i13 = i11;
                                                                it2 = it;
                                                                i16 = i12;
                                                                i19 = i21;
                                                                i11 = i13;
                                                                b0Var2 = b0Var;
                                                                k1Var3 = k1Var;
                                                            }
                                                        } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                            Object value11 = k1Var.getValue();
                                                            kotlin.jvm.internal.m.c(value11);
                                                            pVar.remove(((jt.h2) value11).f36962a);
                                                            if (i21 >= pVar.size()) {
                                                                Object value12 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value12);
                                                                pVar.add(((jt.h2) value12).f36962a);
                                                            } else {
                                                                Object value13 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value13);
                                                                pVar.add(i21, ((jt.h2) value13).f36962a);
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            i13 = i11;
                                                            it2 = it;
                                                            i16 = i12;
                                                            i19 = i21;
                                                            i11 = i13;
                                                            b0Var2 = b0Var;
                                                            k1Var3 = k1Var;
                                                        }
                                                        return b0Var;
                                                    }
                                                } else {
                                                    k1Var2 = k1Var3;
                                                    fValueOf = null;
                                                }
                                                if (fValueOf != null && fIntBitsToFloat26 == fValueOf.floatValue()) {
                                                    if (xVar2 != null) {
                                                        it = it2;
                                                        f5 = Float.POSITIVE_INFINITY;
                                                        try {
                                                            k1Var = k1Var2;
                                                            f11 = Float.NEGATIVE_INFINITY;
                                                            try {
                                                                if (Float.intBitsToFloat((int) (xVar2.c(0L) & j11)) != Float.intBitsToFloat((int) (xVar6.c(0L) & j11))) {
                                                                    z11 = true;
                                                                }
                                                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + (((int) (xVar6.m() >> 32)) / 2);
                                                                if (xVar != null) {
                                                                    fValueOf2 = Float.valueOf(Float.intBitsToFloat((int) (xVar.c(0L) >> 32)) + (((int) (xVar.m() >> 32)) / 2));
                                                                } else {
                                                                    fValueOf2 = null;
                                                                }
                                                                if (mVar == v3.m.Ltr) {
                                                                    if (z11) {
                                                                        fIntBitsToFloat16 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                        fIntBitsToFloat17 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                                        fIntBitsToFloat18 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                                        fIntBitsToFloat19 = Float.intBitsToFloat((int) (jH2 & j11));
                                                                        if (fIntBitsToFloat18 >= f11) {
                                                                            z27 = true;
                                                                        } else {
                                                                            z27 = false;
                                                                        }
                                                                        if (fIntBitsToFloat18 < fIntBitsToFloat) {
                                                                            z28 = true;
                                                                        } else {
                                                                            z28 = false;
                                                                        }
                                                                        boolean z35 = z27 & z28;
                                                                        if (fIntBitsToFloat19 >= fIntBitsToFloat16) {
                                                                            z29 = true;
                                                                        } else {
                                                                            z29 = false;
                                                                        }
                                                                        z30 = z35 & z29;
                                                                        if (fIntBitsToFloat19 < fIntBitsToFloat17) {
                                                                            z31 = true;
                                                                        } else {
                                                                            z31 = false;
                                                                        }
                                                                        if (z31 & z30) {
                                                                        }
                                                                        b0Var = b0Var2;
                                                                    }
                                                                    if (fValueOf2 != 0) {
                                                                        fIntBitsToFloat11 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32));
                                                                        fIntBitsToFloat12 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                        fFloatValue2 = fValueOf2.floatValue();
                                                                        fIntBitsToFloat13 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                                        fIntBitsToFloat14 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                                        fIntBitsToFloat15 = Float.intBitsToFloat((int) (jH2 & j11));
                                                                        if (fIntBitsToFloat14 >= fIntBitsToFloat11) {
                                                                            z22 = true;
                                                                        } else {
                                                                            z22 = false;
                                                                        }
                                                                        if (fIntBitsToFloat14 < fFloatValue2) {
                                                                            z23 = true;
                                                                        } else {
                                                                            z23 = false;
                                                                        }
                                                                        boolean z36 = z22 & z23;
                                                                        if (fIntBitsToFloat15 >= fIntBitsToFloat12) {
                                                                            z24 = true;
                                                                        } else {
                                                                            z24 = false;
                                                                        }
                                                                        z25 = z36 & z24;
                                                                        if (fIntBitsToFloat15 < fIntBitsToFloat13) {
                                                                            z26 = true;
                                                                        } else {
                                                                            z26 = false;
                                                                        }
                                                                        if (z26 & z25) {
                                                                            b0Var = b0Var2;
                                                                        }
                                                                    }
                                                                    b0Var = b0Var2;
                                                                } else {
                                                                    f12 = fValueOf2;
                                                                    if (z11 != 0) {
                                                                        f13 = f5;
                                                                        b0Var = b0Var2;
                                                                        try {
                                                                            fIntBitsToFloat7 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                            fIntBitsToFloat8 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                                            fIntBitsToFloat9 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                                            fIntBitsToFloat10 = Float.intBitsToFloat((int) (jH2 & j11));
                                                                            if (fIntBitsToFloat9 >= fIntBitsToFloat) {
                                                                                z17 = true;
                                                                            } else {
                                                                                z17 = false;
                                                                            }
                                                                            if (fIntBitsToFloat9 < f13) {
                                                                                z18 = true;
                                                                            } else {
                                                                                z18 = false;
                                                                            }
                                                                            boolean z37 = z18 & z17;
                                                                            if (fIntBitsToFloat10 >= fIntBitsToFloat7) {
                                                                                z19 = true;
                                                                            } else {
                                                                                z19 = false;
                                                                            }
                                                                            z20 = z19 & z37;
                                                                            if (fIntBitsToFloat10 < fIntBitsToFloat8) {
                                                                                z21 = true;
                                                                            } else {
                                                                                z21 = false;
                                                                            }
                                                                            if (z20 & z21) {
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            map = map2;
                                                                            com.bumptech.glide.e.l(th);
                                                                        }
                                                                    } else {
                                                                        b0Var = b0Var2;
                                                                    }
                                                                    if (f12 != null) {
                                                                        fFloatValue = f12.floatValue();
                                                                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                        fIntBitsToFloat3 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + ((int) (xVar6.m() >> 32));
                                                                        fIntBitsToFloat4 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                                        fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                                        fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & j11));
                                                                        if (fIntBitsToFloat5 >= fFloatValue) {
                                                                            z12 = true;
                                                                        } else {
                                                                            z12 = false;
                                                                        }
                                                                        if (fIntBitsToFloat5 < fIntBitsToFloat3) {
                                                                            z13 = true;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        boolean z38 = z12 & z13;
                                                                        if (fIntBitsToFloat6 >= fIntBitsToFloat2) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = false;
                                                                        }
                                                                        z15 = z38 & z14;
                                                                        if (fIntBitsToFloat6 < fIntBitsToFloat4) {
                                                                            z16 = true;
                                                                        } else {
                                                                            z16 = false;
                                                                        }
                                                                        if (z16 & z15) {
                                                                        }
                                                                    }
                                                                }
                                                                map = map2;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                b0Var = b0Var2;
                                                                map = map2;
                                                                com.bumptech.glide.e.l(th);
                                                                if (i21 < pVar.size()) {
                                                                    map2 = map;
                                                                    xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                    if (xVar4 == null) {
                                                                        xVar3 = xVar4;
                                                                    }
                                                                    return b0Var;
                                                                }
                                                                map2 = map;
                                                                xVar3 = xVar6;
                                                                i14 = i19 + 2;
                                                                if (i14 < pVar.size()) {
                                                                    if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                        Object value14 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value14);
                                                                        pVar.remove(((jt.h2) value14).f36962a);
                                                                        if (i21 >= pVar.size()) {
                                                                            Object value15 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value15);
                                                                            pVar.add(((jt.h2) value15).f36962a);
                                                                        } else {
                                                                            Object value16 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value16);
                                                                            pVar.add(i21, ((jt.h2) value16).f36962a);
                                                                        }
                                                                    } else {
                                                                        i12 = 1;
                                                                        i13 = i11;
                                                                        it2 = it;
                                                                        i16 = i12;
                                                                        i19 = i21;
                                                                        i11 = i13;
                                                                        b0Var2 = b0Var;
                                                                        k1Var3 = k1Var;
                                                                    }
                                                                } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                    Object value17 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value17);
                                                                    pVar.remove(((jt.h2) value17).f36962a);
                                                                    if (i21 >= pVar.size()) {
                                                                        Object value18 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value18);
                                                                        pVar.add(((jt.h2) value18).f36962a);
                                                                    } else {
                                                                        Object value19 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value19);
                                                                        pVar.add(i21, ((jt.h2) value19).f36962a);
                                                                    }
                                                                } else {
                                                                    i12 = 1;
                                                                    i13 = i11;
                                                                    it2 = it;
                                                                    i16 = i12;
                                                                    i19 = i21;
                                                                    i11 = i13;
                                                                    b0Var2 = b0Var;
                                                                    k1Var3 = k1Var;
                                                                }
                                                                return b0Var;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            k1Var = k1Var2;
                                                            b0Var = b0Var2;
                                                            map = map2;
                                                            com.bumptech.glide.e.l(th);
                                                            if (i21 < pVar.size()) {
                                                                map2 = map;
                                                                xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                if (xVar4 == null) {
                                                                    xVar3 = xVar4;
                                                                }
                                                                return b0Var;
                                                            }
                                                            map2 = map;
                                                            xVar3 = xVar6;
                                                            i14 = i19 + 2;
                                                            if (i14 < pVar.size()) {
                                                                if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                    Object value110 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value110);
                                                                    pVar.remove(((jt.h2) value110).f36962a);
                                                                    if (i21 >= pVar.size()) {
                                                                        Object value111 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value111);
                                                                        pVar.add(((jt.h2) value111).f36962a);
                                                                    } else {
                                                                        Object value112 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value112);
                                                                        pVar.add(i21, ((jt.h2) value112).f36962a);
                                                                    }
                                                                } else {
                                                                    i12 = 1;
                                                                    i13 = i11;
                                                                    it2 = it;
                                                                    i16 = i12;
                                                                    i19 = i21;
                                                                    i11 = i13;
                                                                    b0Var2 = b0Var;
                                                                    k1Var3 = k1Var;
                                                                }
                                                            } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                Object value113 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value113);
                                                                pVar.remove(((jt.h2) value113).f36962a);
                                                                if (i21 >= pVar.size()) {
                                                                    Object value114 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value114);
                                                                    pVar.add(((jt.h2) value114).f36962a);
                                                                } else {
                                                                    Object value115 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value115);
                                                                    pVar.add(i21, ((jt.h2) value115).f36962a);
                                                                }
                                                            } else {
                                                                i12 = 1;
                                                                i13 = i11;
                                                                it2 = it;
                                                                i16 = i12;
                                                                i19 = i21;
                                                                i11 = i13;
                                                                b0Var2 = b0Var;
                                                                k1Var3 = k1Var;
                                                            }
                                                            return b0Var;
                                                        }
                                                        if (i21 < pVar.size()) {
                                                            map2 = map;
                                                            xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                            if (xVar4 == null) {
                                                                xVar3 = xVar4;
                                                            }
                                                        } else {
                                                            map2 = map;
                                                            xVar3 = xVar6;
                                                        }
                                                        i14 = i19 + 2;
                                                        if (i14 < pVar.size() || (xVar = (w2.x) map2.get((CourseWord) pVar.get(i14))) != null) {
                                                            if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                Object value116 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value116);
                                                                pVar.remove(((jt.h2) value116).f36962a);
                                                                if (i21 >= pVar.size()) {
                                                                    Object value117 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value117);
                                                                    pVar.add(((jt.h2) value117).f36962a);
                                                                } else {
                                                                    Object value118 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value118);
                                                                    pVar.add(i21, ((jt.h2) value118).f36962a);
                                                                }
                                                            } else {
                                                                i12 = 1;
                                                                i13 = i11;
                                                                it2 = it;
                                                                i16 = i12;
                                                                i19 = i21;
                                                                i11 = i13;
                                                                b0Var2 = b0Var;
                                                                k1Var3 = k1Var;
                                                            }
                                                        }
                                                    } else {
                                                        it = it2;
                                                        k1Var = k1Var2;
                                                        f5 = Float.POSITIVE_INFINITY;
                                                        f11 = Float.NEGATIVE_INFINITY;
                                                    }
                                                    if (i19 == 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + (((int) (xVar6.m() >> 32)) / 2);
                                                    if (xVar != null) {
                                                        fValueOf2 = Float.valueOf(Float.intBitsToFloat((int) (xVar.c(0L) >> 32)) + (((int) (xVar.m() >> 32)) / 2));
                                                    } else {
                                                        fValueOf2 = null;
                                                    }
                                                    if (mVar == v3.m.Ltr) {
                                                        if (z11) {
                                                            fIntBitsToFloat16 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                            fIntBitsToFloat17 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                            fIntBitsToFloat18 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                            fIntBitsToFloat19 = Float.intBitsToFloat((int) (jH2 & j11));
                                                            if (fIntBitsToFloat18 >= f11) {
                                                                z27 = true;
                                                            } else {
                                                                z27 = false;
                                                            }
                                                            if (fIntBitsToFloat18 < fIntBitsToFloat) {
                                                                z28 = true;
                                                            } else {
                                                                z28 = false;
                                                            }
                                                            boolean z39 = z27 & z28;
                                                            if (fIntBitsToFloat19 >= fIntBitsToFloat16) {
                                                                z29 = true;
                                                            } else {
                                                                z29 = false;
                                                            }
                                                            z30 = z39 & z29;
                                                            if (fIntBitsToFloat19 < fIntBitsToFloat17) {
                                                                z31 = true;
                                                            } else {
                                                                z31 = false;
                                                            }
                                                            if (z31 & z30) {
                                                            }
                                                            b0Var = b0Var2;
                                                        }
                                                        if (fValueOf2 != 0) {
                                                            fIntBitsToFloat11 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32));
                                                            fIntBitsToFloat12 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                            fFloatValue2 = fValueOf2.floatValue();
                                                            fIntBitsToFloat13 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                            fIntBitsToFloat14 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                            fIntBitsToFloat15 = Float.intBitsToFloat((int) (jH2 & j11));
                                                            if (fIntBitsToFloat14 >= fIntBitsToFloat11) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            if (fIntBitsToFloat14 < fFloatValue2) {
                                                                z23 = true;
                                                            } else {
                                                                z23 = false;
                                                            }
                                                            boolean z310 = z22 & z23;
                                                            if (fIntBitsToFloat15 >= fIntBitsToFloat12) {
                                                                z24 = true;
                                                            } else {
                                                                z24 = false;
                                                            }
                                                            z25 = z310 & z24;
                                                            if (fIntBitsToFloat15 < fIntBitsToFloat13) {
                                                                z26 = true;
                                                            } else {
                                                                z26 = false;
                                                            }
                                                            if (z26 & z25) {
                                                                b0Var = b0Var2;
                                                            }
                                                        }
                                                        b0Var = b0Var2;
                                                    } else {
                                                        f12 = fValueOf2;
                                                        if (z11 != 0) {
                                                            f13 = f5;
                                                            b0Var = b0Var2;
                                                            fIntBitsToFloat7 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                            fIntBitsToFloat8 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                            fIntBitsToFloat9 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                            fIntBitsToFloat10 = Float.intBitsToFloat((int) (jH2 & j11));
                                                            if (fIntBitsToFloat9 >= fIntBitsToFloat) {
                                                                z17 = true;
                                                            } else {
                                                                z17 = false;
                                                            }
                                                            if (fIntBitsToFloat9 < f13) {
                                                                z18 = true;
                                                            } else {
                                                                z18 = false;
                                                            }
                                                            boolean z311 = z18 & z17;
                                                            if (fIntBitsToFloat10 >= fIntBitsToFloat7) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            z20 = z19 & z311;
                                                            if (fIntBitsToFloat10 < fIntBitsToFloat8) {
                                                                z21 = true;
                                                            } else {
                                                                z21 = false;
                                                            }
                                                            if (z20 & z21) {
                                                            }
                                                        } else {
                                                            b0Var = b0Var2;
                                                        }
                                                        if (f12 != null) {
                                                            fFloatValue = f12.floatValue();
                                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + ((int) (xVar6.m() >> 32));
                                                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                            fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH2 >> 32));
                                                            fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & j11));
                                                            if (fIntBitsToFloat5 >= fFloatValue) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (fIntBitsToFloat5 < fIntBitsToFloat3) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            boolean z312 = z12 & z13;
                                                            if (fIntBitsToFloat6 >= fIntBitsToFloat2) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            z15 = z312 & z14;
                                                            if (fIntBitsToFloat6 < fIntBitsToFloat4) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            if (z16 & z15) {
                                                            }
                                                        }
                                                    }
                                                    map = map2;
                                                    if (i21 < pVar.size()) {
                                                        map2 = map;
                                                        xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                        if (xVar4 == null) {
                                                            xVar3 = xVar4;
                                                        }
                                                    } else {
                                                        map2 = map;
                                                        xVar3 = xVar6;
                                                    }
                                                    i14 = i19 + 2;
                                                    if (i14 < pVar.size()) {
                                                        if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                            Object value119 = k1Var.getValue();
                                                            kotlin.jvm.internal.m.c(value119);
                                                            pVar.remove(((jt.h2) value119).f36962a);
                                                            if (i21 >= pVar.size()) {
                                                                Object value1110 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value1110);
                                                                pVar.add(((jt.h2) value1110).f36962a);
                                                            } else {
                                                                Object value1111 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value1111);
                                                                pVar.add(i21, ((jt.h2) value1111).f36962a);
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            i13 = i11;
                                                            it2 = it;
                                                            i16 = i12;
                                                            i19 = i21;
                                                            i11 = i13;
                                                            b0Var2 = b0Var;
                                                            k1Var3 = k1Var;
                                                        }
                                                    } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                        Object value1112 = k1Var.getValue();
                                                        kotlin.jvm.internal.m.c(value1112);
                                                        pVar.remove(((jt.h2) value1112).f36962a);
                                                        if (i21 >= pVar.size()) {
                                                            Object value1113 = k1Var.getValue();
                                                            kotlin.jvm.internal.m.c(value1113);
                                                            pVar.add(((jt.h2) value1113).f36962a);
                                                        } else {
                                                            Object value1114 = k1Var.getValue();
                                                            kotlin.jvm.internal.m.c(value1114);
                                                            pVar.add(i21, ((jt.h2) value1114).f36962a);
                                                        }
                                                    } else {
                                                        i12 = 1;
                                                        i13 = i11;
                                                        it2 = it;
                                                        i16 = i12;
                                                        i19 = i21;
                                                        i11 = i13;
                                                        b0Var2 = b0Var;
                                                        k1Var3 = k1Var;
                                                    }
                                                } else {
                                                    it = it2;
                                                    k1Var = k1Var2;
                                                    b0Var = b0Var2;
                                                    try {
                                                        float fIntBitsToFloat27 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32));
                                                        float fIntBitsToFloat28 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                        float fIntBitsToFloat29 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + ((int) (xVar6.m() >> 32));
                                                        long j13 = 0;
                                                        try {
                                                            float fIntBitsToFloat30 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                            int i24 = (int) (jH2 >> 32);
                                                            float fIntBitsToFloat31 = Float.intBitsToFloat(i24);
                                                            map = map2;
                                                            int i25 = (int) (jH2 & j11);
                                                            try {
                                                                float fIntBitsToFloat32 = Float.intBitsToFloat(i25);
                                                                if (!((fIntBitsToFloat31 < fIntBitsToFloat29) & (fIntBitsToFloat31 >= fIntBitsToFloat27) & (fIntBitsToFloat32 >= fIntBitsToFloat28) & (fIntBitsToFloat32 < fIntBitsToFloat30))) {
                                                                    f2.c cVar = xVar != null ? new f2.c(Float.intBitsToFloat((int) (xVar.c(0L) >> 32)), Float.intBitsToFloat((int) (xVar.c(0L) & j11)), Float.intBitsToFloat((int) (xVar.c(0L) >> 32)) + ((int) (xVar.m() >> 32)), Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11))) : null;
                                                                    if (mVar == v3.m.Ltr) {
                                                                        if (cVar != null) {
                                                                            float fIntBitsToFloat33 = Float.intBitsToFloat((int) (xVar.c(0L) & j11));
                                                                            float fIntBitsToFloat34 = Float.intBitsToFloat((int) (xVar.c(0L) >> 32)) + (((int) (xVar.m() >> 32)) / 2);
                                                                            float fIntBitsToFloat35 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                                            float fIntBitsToFloat36 = Float.intBitsToFloat(i24);
                                                                            float fIntBitsToFloat37 = Float.intBitsToFloat(i25);
                                                                            if ((fIntBitsToFloat37 >= fIntBitsToFloat33) & (fIntBitsToFloat36 < fIntBitsToFloat34) & (fIntBitsToFloat36 >= Float.NEGATIVE_INFINITY) & (fIntBitsToFloat37 < fIntBitsToFloat35)) {
                                                                            }
                                                                        }
                                                                        float fIntBitsToFloat38 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + (((int) (xVar6.m() >> 32)) / 2);
                                                                        float fIntBitsToFloat39 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                        float fIntBitsToFloat40 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                                        float fIntBitsToFloat41 = Float.intBitsToFloat(i24);
                                                                        float fIntBitsToFloat42 = Float.intBitsToFloat(i25);
                                                                        if (((fIntBitsToFloat41 >= fIntBitsToFloat38) & (fIntBitsToFloat41 < Float.POSITIVE_INFINITY) & (fIntBitsToFloat42 >= fIntBitsToFloat39) & (fIntBitsToFloat42 < fIntBitsToFloat40)) && xVar != null) {
                                                                            Float.intBitsToFloat((int) (xVar.c(0L) & j11));
                                                                            Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                        }
                                                                        if (i21 < pVar.size()) {
                                                                            map2 = map;
                                                                            xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                            if (xVar4 == null) {
                                                                                xVar3 = xVar4;
                                                                            }
                                                                        } else {
                                                                            map2 = map;
                                                                            xVar3 = xVar6;
                                                                        }
                                                                        i14 = i19 + 2;
                                                                        if (i14 < pVar.size()) {
                                                                            if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                                Object value1115 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value1115);
                                                                                pVar.remove(((jt.h2) value1115).f36962a);
                                                                                if (i21 >= pVar.size()) {
                                                                                    Object value1116 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value1116);
                                                                                    pVar.add(((jt.h2) value1116).f36962a);
                                                                                } else {
                                                                                    Object value1117 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value1117);
                                                                                    pVar.add(i21, ((jt.h2) value1117).f36962a);
                                                                                }
                                                                            } else {
                                                                                i12 = 1;
                                                                                i13 = i11;
                                                                                it2 = it;
                                                                                i16 = i12;
                                                                                i19 = i21;
                                                                                i11 = i13;
                                                                                b0Var2 = b0Var;
                                                                                k1Var3 = k1Var;
                                                                            }
                                                                        } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                            Object value1118 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value1118);
                                                                            pVar.remove(((jt.h2) value1118).f36962a);
                                                                            if (i21 >= pVar.size()) {
                                                                                Object value1119 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value1119);
                                                                                pVar.add(((jt.h2) value1119).f36962a);
                                                                            } else {
                                                                                Object value11110 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value11110);
                                                                                pVar.add(i21, ((jt.h2) value11110).f36962a);
                                                                            }
                                                                        } else {
                                                                            i12 = 1;
                                                                            i13 = i11;
                                                                            it2 = it;
                                                                            i16 = i12;
                                                                            i19 = i21;
                                                                            i11 = i13;
                                                                            b0Var2 = b0Var;
                                                                            k1Var3 = k1Var;
                                                                        }
                                                                    } else {
                                                                        if (cVar != null) {
                                                                            float fIntBitsToFloat43 = Float.intBitsToFloat((int) (xVar.c(0L) >> 32)) + (((int) (xVar.m() >> 32)) / 2);
                                                                            float fIntBitsToFloat44 = Float.intBitsToFloat((int) (xVar.c(0L) & j11));
                                                                            float fIntBitsToFloat45 = Float.intBitsToFloat((int) (xVar.c(0L) & j11)) + ((int) (xVar.m() & j11));
                                                                            float fIntBitsToFloat46 = Float.intBitsToFloat(i24);
                                                                            float fIntBitsToFloat47 = Float.intBitsToFloat(i25);
                                                                            if ((fIntBitsToFloat46 >= fIntBitsToFloat43) & (fIntBitsToFloat46 < Float.POSITIVE_INFINITY) & (fIntBitsToFloat47 >= fIntBitsToFloat44) & (fIntBitsToFloat47 < fIntBitsToFloat45)) {
                                                                            }
                                                                        }
                                                                        j13 = 0;
                                                                        try {
                                                                            float fIntBitsToFloat48 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                            float fIntBitsToFloat49 = Float.intBitsToFloat((int) (xVar6.c(0L) >> 32)) + (((int) (xVar6.m() >> 32)) / 2);
                                                                            j13 = 0;
                                                                            float fIntBitsToFloat50 = Float.intBitsToFloat((int) (xVar6.c(0L) & j11)) + ((int) (xVar6.m() & j11));
                                                                            float fIntBitsToFloat51 = Float.intBitsToFloat(i24);
                                                                            float fIntBitsToFloat52 = Float.intBitsToFloat(i25);
                                                                            if (((fIntBitsToFloat52 >= fIntBitsToFloat48) & (fIntBitsToFloat51 < fIntBitsToFloat49) & (fIntBitsToFloat51 >= Float.NEGATIVE_INFINITY) & (fIntBitsToFloat52 < fIntBitsToFloat50)) && xVar != null) {
                                                                                try {
                                                                                    Float.intBitsToFloat((int) (xVar.c(0L) & j11));
                                                                                    Float.intBitsToFloat((int) (xVar6.c(0L) & j11));
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    com.bumptech.glide.e.l(th);
                                                                                }
                                                                                break;
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            com.bumptech.glide.e.l(th);
                                                                            if (i21 < pVar.size()) {
                                                                                map2 = map;
                                                                                xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                                if (xVar4 == null) {
                                                                                    xVar3 = xVar4;
                                                                                }
                                                                                return b0Var;
                                                                            }
                                                                            map2 = map;
                                                                            xVar3 = xVar6;
                                                                            i14 = i19 + 2;
                                                                            if (i14 < pVar.size()) {
                                                                                if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                                    Object value11111 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value11111);
                                                                                    pVar.remove(((jt.h2) value11111).f36962a);
                                                                                    if (i21 >= pVar.size()) {
                                                                                        Object value11112 = k1Var.getValue();
                                                                                        kotlin.jvm.internal.m.c(value11112);
                                                                                        pVar.add(((jt.h2) value11112).f36962a);
                                                                                    } else {
                                                                                        Object value11113 = k1Var.getValue();
                                                                                        kotlin.jvm.internal.m.c(value11113);
                                                                                        pVar.add(i21, ((jt.h2) value11113).f36962a);
                                                                                    }
                                                                                } else {
                                                                                    i12 = 1;
                                                                                    i13 = i11;
                                                                                    it2 = it;
                                                                                    i16 = i12;
                                                                                    i19 = i21;
                                                                                    i11 = i13;
                                                                                    b0Var2 = b0Var;
                                                                                    k1Var3 = k1Var;
                                                                                }
                                                                            } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                                Object value11114 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value11114);
                                                                                pVar.remove(((jt.h2) value11114).f36962a);
                                                                                if (i21 >= pVar.size()) {
                                                                                    Object value11115 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value11115);
                                                                                    pVar.add(((jt.h2) value11115).f36962a);
                                                                                } else {
                                                                                    Object value11116 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value11116);
                                                                                    pVar.add(i21, ((jt.h2) value11116).f36962a);
                                                                                }
                                                                            } else {
                                                                                i12 = 1;
                                                                                i13 = i11;
                                                                                it2 = it;
                                                                                i16 = i12;
                                                                                i19 = i21;
                                                                                i11 = i13;
                                                                                b0Var2 = b0Var;
                                                                                k1Var3 = k1Var;
                                                                            }
                                                                            return b0Var;
                                                                        }
                                                                        if (i21 < pVar.size()) {
                                                                            map2 = map;
                                                                            xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                            if (xVar4 == null) {
                                                                                xVar3 = xVar4;
                                                                            }
                                                                        } else {
                                                                            map2 = map;
                                                                            xVar3 = xVar6;
                                                                        }
                                                                        i14 = i19 + 2;
                                                                        if (i14 < pVar.size()) {
                                                                            if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                                Object value11117 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value11117);
                                                                                pVar.remove(((jt.h2) value11117).f36962a);
                                                                                if (i21 >= pVar.size()) {
                                                                                    Object value11118 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value11118);
                                                                                    pVar.add(((jt.h2) value11118).f36962a);
                                                                                } else {
                                                                                    Object value11119 = k1Var.getValue();
                                                                                    kotlin.jvm.internal.m.c(value11119);
                                                                                    pVar.add(i21, ((jt.h2) value11119).f36962a);
                                                                                }
                                                                            } else {
                                                                                i12 = 1;
                                                                                i13 = i11;
                                                                                it2 = it;
                                                                                i16 = i12;
                                                                                i19 = i21;
                                                                                i11 = i13;
                                                                                b0Var2 = b0Var;
                                                                                k1Var3 = k1Var;
                                                                            }
                                                                        } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                            Object value111110 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value111110);
                                                                            pVar.remove(((jt.h2) value111110).f36962a);
                                                                            if (i21 >= pVar.size()) {
                                                                                Object value111111 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value111111);
                                                                                pVar.add(((jt.h2) value111111).f36962a);
                                                                            } else {
                                                                                Object value111112 = k1Var.getValue();
                                                                                kotlin.jvm.internal.m.c(value111112);
                                                                                pVar.add(i21, ((jt.h2) value111112).f36962a);
                                                                            }
                                                                        } else {
                                                                            i12 = 1;
                                                                            i13 = i11;
                                                                            it2 = it;
                                                                            i16 = i12;
                                                                            i19 = i21;
                                                                            i11 = i13;
                                                                            b0Var2 = b0Var;
                                                                            k1Var3 = k1Var;
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                com.bumptech.glide.e.l(th);
                                                                if (i21 < pVar.size()) {
                                                                    map2 = map;
                                                                    xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                                    if (xVar4 == null) {
                                                                        xVar3 = xVar4;
                                                                    }
                                                                    return b0Var;
                                                                }
                                                                map2 = map;
                                                                xVar3 = xVar6;
                                                                i14 = i19 + 2;
                                                                if (i14 < pVar.size()) {
                                                                    if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                        Object value111113 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value111113);
                                                                        pVar.remove(((jt.h2) value111113).f36962a);
                                                                        if (i21 >= pVar.size()) {
                                                                            Object value111114 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value111114);
                                                                            pVar.add(((jt.h2) value111114).f36962a);
                                                                        } else {
                                                                            Object value111115 = k1Var.getValue();
                                                                            kotlin.jvm.internal.m.c(value111115);
                                                                            pVar.add(i21, ((jt.h2) value111115).f36962a);
                                                                        }
                                                                    } else {
                                                                        i12 = 1;
                                                                        i13 = i11;
                                                                        it2 = it;
                                                                        i16 = i12;
                                                                        i19 = i21;
                                                                        i11 = i13;
                                                                        b0Var2 = b0Var;
                                                                        k1Var3 = k1Var;
                                                                    }
                                                                } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                    Object value111116 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value111116);
                                                                    pVar.remove(((jt.h2) value111116).f36962a);
                                                                    if (i21 >= pVar.size()) {
                                                                        Object value111117 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value111117);
                                                                        pVar.add(((jt.h2) value111117).f36962a);
                                                                    } else {
                                                                        Object value111118 = k1Var.getValue();
                                                                        kotlin.jvm.internal.m.c(value111118);
                                                                        pVar.add(i21, ((jt.h2) value111118).f36962a);
                                                                    }
                                                                } else {
                                                                    i12 = 1;
                                                                    i13 = i11;
                                                                    it2 = it;
                                                                    i16 = i12;
                                                                    i19 = i21;
                                                                    i11 = i13;
                                                                    b0Var2 = b0Var;
                                                                    k1Var3 = k1Var;
                                                                }
                                                                return b0Var;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            map = map2;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        map = map2;
                                                        com.bumptech.glide.e.l(th);
                                                        if (i21 < pVar.size()) {
                                                            map2 = map;
                                                            xVar4 = (w2.x) map2.get((CourseWord) pVar.get(i21));
                                                            if (xVar4 == null) {
                                                                xVar3 = xVar4;
                                                            }
                                                            return b0Var;
                                                        }
                                                        map2 = map;
                                                        xVar3 = xVar6;
                                                        i14 = i19 + 2;
                                                        if (i14 < pVar.size()) {
                                                            if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                                Object value111119 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value111119);
                                                                pVar.remove(((jt.h2) value111119).f36962a);
                                                                if (i21 >= pVar.size()) {
                                                                    Object value1111110 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value1111110);
                                                                    pVar.add(((jt.h2) value1111110).f36962a);
                                                                } else {
                                                                    Object value1111111 = k1Var.getValue();
                                                                    kotlin.jvm.internal.m.c(value1111111);
                                                                    pVar.add(i21, ((jt.h2) value1111111).f36962a);
                                                                }
                                                            } else {
                                                                i12 = 1;
                                                                i13 = i11;
                                                                it2 = it;
                                                                i16 = i12;
                                                                i19 = i21;
                                                                i11 = i13;
                                                                b0Var2 = b0Var;
                                                                k1Var3 = k1Var;
                                                            }
                                                        } else if (jt.c.f36897a[hz.b.f(jH2, xVar3, xVar, xVar6, i21, i2Var.f36981f).ordinal()] == 1) {
                                                            Object value1111112 = k1Var.getValue();
                                                            kotlin.jvm.internal.m.c(value1111112);
                                                            pVar.remove(((jt.h2) value1111112).f36962a);
                                                            if (i21 >= pVar.size()) {
                                                                Object value1111113 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value1111113);
                                                                pVar.add(((jt.h2) value1111113).f36962a);
                                                            } else {
                                                                Object value1111114 = k1Var.getValue();
                                                                kotlin.jvm.internal.m.c(value1111114);
                                                                pVar.add(i21, ((jt.h2) value1111114).f36962a);
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            i13 = i11;
                                                            it2 = it;
                                                            i16 = i12;
                                                            i19 = i21;
                                                            i11 = i13;
                                                            b0Var2 = b0Var;
                                                            k1Var3 = k1Var;
                                                        }
                                                        return b0Var;
                                                    }
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                k1Var = k1Var3;
                                                it = it2;
                                            }
                                            break;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            k1Var = k1Var3;
                                            it = it2;
                                            b0Var = b0Var2;
                                        }
                                        return b0Var;
                                    }
                                }
                                k1Var = k1Var3;
                                b0Var = b0Var2;
                                return b0Var;
                            }
                        }
                    }
                }
                return b0Var2;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var3 = (l1.b1) obj2;
                if (((HwView) b1Var3.getValue()) != null && (hwView = (HwView) b1Var3.getValue()) != null) {
                    hwView.postDelayed(new pb.b(11, hwView, new e4((SyllableWriteCharacter) obj3, z32, b1Var3, (fz.c) obj4)), 0L);
                }
                return b0Var2;
            default:
                CourseUnitFinishStatus courseUnitFinishStatus = (CourseUnitFinishStatus) obj4;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (List) obj3) {
                    if (((CourseLesson) obj5).getLessonType() != LessonType.TypeLesson) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int size = arrayList.size();
                boolean z40 = false;
                boolean dialogSpeaking = false;
                int i26 = 0;
                while (i26 < size) {
                    Object obj6 = arrayList.get(i26);
                    i26++;
                    CourseLesson courseLesson = (CourseLesson) obj6;
                    if (courseLesson.getLessonState() != LessonState.StateLocked) {
                        z40 = true;
                    }
                    int i27 = ub.f50494a[courseLesson.getLessonType().ordinal()];
                    if (i27 == 1) {
                        dialogSpeaking = courseUnitFinishStatus.getDialogWarmUp();
                    } else if (i27 == 2) {
                        dialogSpeaking = courseUnitFinishStatus.getDialogPractice();
                    } else if (i27 == 3) {
                        dialogSpeaking = courseUnitFinishStatus.getDialogSpeaking();
                    }
                }
                vt.n0 n0Var = (vt.n0) obj2;
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size2 = arrayList.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj7 = arrayList.get(i28);
                    i28++;
                    CourseLesson courseLesson2 = (CourseLesson) obj7;
                    arrayList2.add(CourseLesson.copy$default(courseLesson2, 0L, null, null, 0, null, null, null, null, null, null, null, 0L, null, 0, false, z32 || vb.e(n0Var, courseLesson2.getUnitSortIndex()), false, null, false, false, false, 0, null, null, null, 33521663, null));
                }
                return new ee(arrayList2, dialogSpeaking ? LessonState.StateRedo : z40 ? LessonState.StateOpen : LessonState.StateLocked);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jt.i2 i2Var, boolean z11, x1.p pVar, HashMap map, vy.d dVar) {
        super(2, dVar);
        this.f5732a = 3;
        this.f5735d = i2Var;
        this.f5733b = z11;
        this.f5736e = pVar;
        this.f5734c = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l1.b1 b1Var, SyllableWriteCharacter syllableWriteCharacter, boolean z11, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f5732a = 4;
        this.f5734c = b1Var;
        this.f5735d = syllableWriteCharacter;
        this.f5733b = z11;
        this.f5736e = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, fz.c cVar, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.f5732a = 2;
        this.f5733b = z11;
        this.f5735d = cVar;
        this.f5734c = b1Var;
        this.f5736e = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z11, Object obj, Object obj2, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5732a = i11;
        this.f5733b = z11;
        this.f5735d = obj;
        this.f5736e = obj2;
        this.f5734c = b1Var;
    }
}
