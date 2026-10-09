package ot;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CoursePracticeTypeKt;
import com.lingodeer.data.model.TestModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends xy.i implements fz.e {
    public final /* synthetic */ long H;
    public final /* synthetic */ CoursePracticeType K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ob.l f45745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x2 f45746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f45747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f45749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f45750f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f45751t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, String str, long j11, CoursePracticeType coursePracticeType, vy.d dVar) {
        super(2, dVar);
        this.f45750f = e0Var;
        this.f45751t = str;
        this.H = j11;
        this.K = coursePracticeType;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        b0 b0Var = new b0(this.f45750f, this.f45751t, this.H, this.K, dVar);
        b0Var.f45749e = obj;
        return b0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0298  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:130:0x031a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0329 A[LOOP:5: B:131:0x0327->B:132:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0354 A[LOOP:6: B:134:0x0352->B:135:0x0354, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0380 A[LOOP:7: B:137:0x037e->B:138:0x0380, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b6 A[LOOP:8: B:141:0x03b4->B:142:0x03b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x03e2 A[LOOP:9: B:144:0x03e0->B:145:0x03e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0415 A[LOOP:10: B:147:0x0413->B:148:0x0415, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0431  */
    /* JADX WARN: Code duplicated, block: B:151:0x044c  */
    /* JADX WARN: Code duplicated, block: B:153:0x045b A[LOOP:11: B:152:0x0459->B:153:0x045b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0486 A[LOOP:12: B:155:0x0484->B:156:0x0486, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x04b4 A[LOOP:13: B:158:0x04b2->B:159:0x04b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x04e1 A[LOOP:4: B:162:0x04df->B:163:0x04e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0502 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0125  */
    /* JADX WARN: Code duplicated, block: B:28:0x0137 A[LOOP:14: B:26:0x0131->B:28:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x0190  */
    /* JADX WARN: Code duplicated, block: B:44:0x0199  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0208  */
    /* JADX WARN: Code duplicated, block: B:66:0x0211  */
    /* JADX WARN: Code duplicated, block: B:68:0x0214  */
    /* JADX WARN: Code duplicated, block: B:69:0x021d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0223 A[PHI: r11
      0x0223: PHI (r11v23 java.lang.Integer) = (r11v15 java.lang.Integer), (r11v16 java.lang.Integer) binds: [B:70:0x0221, B:180:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0227  */
    /* JADX WARN: Code duplicated, block: B:75:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:95:0x0271 A[PHI: r2 r3
      0x0271: PHI (r2v33 com.lingodeer.data.model.CourseLesson) = (r2v22 com.lingodeer.data.model.CourseLesson), (r2v24 com.lingodeer.data.model.CourseLesson) binds: [B:94:0x026f, B:173:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r3v25 java.util.List) = (r3v15 java.util.List), (r3v19 java.util.List) binds: [B:94:0x026f, B:173:0x0271] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0277  */
    /* JADX WARN: Code duplicated, block: B:98:0x027e  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ob.l lVar;
        x2 x2Var;
        Object objV;
        List<TestModel> listD;
        Object objV2;
        CourseLesson courseLesson;
        long lessonId;
        long unitId;
        x2 x2Var2;
        ob.l lVar2;
        CourseLesson courseLesson2;
        vt.n0 n0Var;
        vt.n0 n0Var2;
        String lastRegex;
        boolean z11;
        String str;
        CoursePracticeType coursePracticeType;
        int i11;
        int i12;
        CourseLesson courseLesson3;
        ArrayList arrayList;
        ArrayList arrayListN;
        int size;
        int i13;
        int i14;
        ArrayList arrayListN2;
        int size2;
        int i15;
        ArrayList arrayList2;
        ArrayList arrayListN3;
        int size3;
        int i16;
        long lessonId2;
        long unitId2;
        int size4;
        ArrayList arrayListN4;
        int size5;
        int i17;
        int i18;
        ArrayList arrayListN5;
        int size6;
        int i19;
        ArrayList arrayListN6;
        int size7;
        int i21;
        ArrayList arrayList3;
        ArrayList arrayListN7;
        int size8;
        int i22;
        ArrayList arrayListN8;
        int size9;
        int i23;
        ArrayList arrayListN9;
        int size10;
        int i24;
        List<TestModel> listA1;
        ArrayList arrayList4;
        int size11;
        int i25;
        TestModel testModel;
        int i26;
        Integer numValueOf;
        Iterator it;
        TestModel testModel2;
        Integer num;
        boolean z12;
        int size12;
        int i27;
        TestModel testModel3;
        CourseLesson courseLesson4;
        List list;
        int iIntValue;
        boolean z13;
        int i28;
        uz.j jVar = (uz.j) this.f45749e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i29 = this.f45748d;
        qy.b0 b0Var = qy.b0.f48488a;
        e0 e0Var = this.f45750f;
        int i30 = 1;
        Integer num2 = null;
        if (i29 == 0) {
            com.bumptech.glide.e.F(obj);
            vt.n0 n0Var3 = e0Var.f45797c;
            wt.m mVar = e0Var.f45795a;
            ob.l lVar3 = new ob.l(n0Var3, 25);
            vt.n0 n0Var4 = e0Var.f45797c;
            x2 x2Var3 = new x2();
            x2Var3.f48709a = n0Var4;
            x2Var3.f48711c = new ArrayList();
            x2Var3.f48712d = new ArrayList();
            x2Var3.f48713e = new ArrayList();
            x2Var3.f48714f = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
            x2Var3.f48715t = BuildConfig.VERSION_NAME;
            int length = this.f45751t.length();
            long j11 = this.H;
            if (length > 0) {
                listD = android.support.v4.media.session.a.D(this.f45751t, false, false, false, x2Var3, lVar3);
                gp.r rVarD = mVar.d(j11);
                this.f45749e = jVar;
                this.f45745a = null;
                this.f45746b = null;
                this.f45747c = listD;
                this.f45748d = 1;
                objV2 = uz.x0.v(rVarD, this);
                if (objV2 != aVar) {
                    courseLesson = (CourseLesson) objV2;
                    if (courseLesson != null) {
                        lessonId = courseLesson.getLessonId();
                        unitId = courseLesson.getUnitId();
                        for (TestModel testModel4 : listD) {
                            testModel4.lessonId = lessonId;
                            testModel4.unitId = unitId;
                        }
                    }
                    this.f45749e = null;
                    this.f45745a = null;
                    this.f45746b = null;
                    this.f45747c = null;
                    this.f45748d = 2;
                    if (jVar.emit(listD, this) == aVar) {
                        return b0Var;
                    }
                }
            } else {
                lVar = lVar3;
                x2Var = x2Var3;
                gp.r rVarD2 = mVar.d(j11);
                this.f45749e = jVar;
                this.f45745a = lVar;
                this.f45746b = x2Var;
                this.f45748d = 3;
                objV = uz.x0.v(rVarD2, this);
                if (objV != aVar) {
                    x2Var2 = x2Var;
                    lVar2 = lVar;
                    courseLesson2 = (CourseLesson) objV;
                    if (courseLesson2 == null) {
                        this.f45749e = null;
                        this.f45745a = null;
                        this.f45746b = null;
                        this.f45747c = null;
                        this.f45748d = 4;
                        if (jVar.emit(ry.r.f50854a, this) == aVar) {
                            return b0Var;
                        }
                    } else {
                        n0Var = e0Var.f45797c;
                        n0Var2 = e0Var.f45797c;
                        if (((fr.o0) n0Var).f27733a.isRepeatRegex) {
                            lastRegex = courseLesson2.getRepeatRegex();
                            z11 = true;
                        } else {
                            lastRegex = courseLesson2.getLastRegex();
                            z11 = false;
                        }
                        str = lastRegex;
                        coursePracticeType = this.K;
                        Objects.toString(coursePracticeType);
                        i11 = a0.f45739a[coursePracticeType.ordinal()];
                        i12 = 13;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                i18 = 7;
                                if (i11 != 3) {
                                    courseLesson3 = courseLesson2;
                                    arrayList2 = new ArrayList();
                                    arrayListN5 = ks.b.n(courseLesson3.getWordList());
                                    size6 = arrayListN5.size();
                                    i19 = 0;
                                    while (i19 < size6) {
                                        Object obj2 = arrayListN5.get(i19);
                                        i19++;
                                        long jLongValue = ((Number) obj2).longValue();
                                        TestModel testModel5 = new TestModel();
                                        testModel5.elemType = 0;
                                        testModel5.elemId = jLongValue;
                                        testModel5.modelType = 7;
                                        arrayList2.add(testModel5);
                                    }
                                    arrayListN6 = ks.b.n(courseLesson3.getSentenceList());
                                    size7 = arrayListN6.size();
                                    i21 = 0;
                                    while (i21 < size7) {
                                        Object obj3 = arrayListN6.get(i21);
                                        i21++;
                                        long jLongValue2 = ((Number) obj3).longValue();
                                        TestModel testModel6 = new TestModel();
                                        testModel6.elemType = 1;
                                        testModel6.elemId = jLongValue2;
                                        testModel6.modelType = 7;
                                        arrayList2.add(testModel6);
                                    }
                                } else if (i11 != 4) {
                                    arrayList2 = ry.m.c1(android.support.v4.media.session.a.D(str, z11, CoursePracticeTypeKt.isTestOut(coursePracticeType), true, x2Var2, lVar2));
                                    if (CoursePracticeTypeKt.isTestOut(coursePracticeType)) {
                                        TestModel testModel7 = new TestModel();
                                        testModel7.elemType = -1;
                                        testModel7.elemId = 0L;
                                        testModel7.modelType = 2;
                                        arrayList2.add(0, testModel7);
                                        listA1 = ry.m.a1(arrayList2);
                                        arrayList4 = new ArrayList();
                                        for (TestModel testModel8 : listA1) {
                                            i26 = testModel8.elemType;
                                            if (i26 != 0) {
                                                if (i26 == i30) {
                                                    numValueOf = num2;
                                                } else {
                                                    numValueOf = num2;
                                                }
                                            } else if (i26 == i30) {
                                                numValueOf = num2;
                                            } else {
                                                numValueOf = num2;
                                            }
                                            if (numValueOf == null) {
                                                arrayList4.add(testModel8);
                                                courseLesson4 = courseLesson2;
                                                list = listA1;
                                            } else {
                                                if (listA1.isEmpty()) {
                                                    num = numValueOf;
                                                    z12 = false;
                                                } else {
                                                    it = listA1.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            testModel2 = (TestModel) it.next();
                                                            if (testModel2 == testModel8) {
                                                                num = numValueOf;
                                                            } else {
                                                                num = numValueOf;
                                                            }
                                                            numValueOf = num;
                                                        } else {
                                                            num = numValueOf;
                                                            z12 = false;
                                                        }
                                                    }
                                                }
                                                if (arrayList4.isEmpty()) {
                                                    courseLesson4 = courseLesson2;
                                                    list = listA1;
                                                    z13 = false;
                                                } else {
                                                    size12 = arrayList4.size();
                                                    i27 = 0;
                                                    while (true) {
                                                        if (i27 < size12) {
                                                            Object obj4 = arrayList4.get(i27);
                                                            i27++;
                                                            testModel3 = (TestModel) obj4;
                                                            if (testModel3.elemType == testModel8.elemType) {
                                                                courseLesson4 = courseLesson2;
                                                                list = listA1;
                                                                if (testModel3.elemId == testModel8.elemId) {
                                                                    iIntValue = num.intValue();
                                                                    if (iIntValue == 13) {
                                                                        i28 = testModel3.modelType;
                                                                        if (i28 != 13) {
                                                                        }
                                                                        z13 = true;
                                                                    } else if (testModel3.modelType == iIntValue) {
                                                                        z13 = true;
                                                                    }
                                                                }
                                                                courseLesson2 = courseLesson4;
                                                                listA1 = list;
                                                            } else {
                                                                courseLesson4 = courseLesson2;
                                                                list = listA1;
                                                            }
                                                            courseLesson2 = courseLesson4;
                                                            listA1 = list;
                                                        } else {
                                                            courseLesson4 = courseLesson2;
                                                            list = listA1;
                                                            z13 = false;
                                                        }
                                                    }
                                                }
                                                if (z12) {
                                                }
                                            }
                                            courseLesson2 = courseLesson4;
                                            listA1 = list;
                                            i12 = 13;
                                            i18 = 7;
                                            i30 = 1;
                                            num2 = null;
                                        }
                                        courseLesson3 = courseLesson2;
                                        arrayList2.clear();
                                        arrayList2.addAll(arrayList4);
                                        size11 = arrayList2.size();
                                        i25 = 0;
                                        while (i25 < size11) {
                                            Object obj5 = arrayList2.get(i25);
                                            i25++;
                                            testModel = (TestModel) obj5;
                                            if (testModel.elemType != 0) {
                                            }
                                        }
                                    } else {
                                        courseLesson3 = courseLesson2;
                                    }
                                } else {
                                    courseLesson3 = courseLesson2;
                                    arrayList3 = new ArrayList();
                                    if (!ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var2).f27733a.keyLanguage))) {
                                        arrayListN9 = ks.b.n(courseLesson3.getCharacterList());
                                        size10 = arrayListN9.size();
                                        i24 = 0;
                                        while (i24 < size10) {
                                            Object obj6 = arrayListN9.get(i24);
                                            i24++;
                                            long jLongValue3 = ((Number) obj6).longValue();
                                            TestModel testModel9 = new TestModel();
                                            testModel9.elemType = 2;
                                            testModel9.elemId = jLongValue3;
                                            testModel9.modelType = 1;
                                            arrayList3.add(testModel9);
                                        }
                                    }
                                    arrayListN7 = ks.b.n(courseLesson3.getWordList());
                                    size8 = arrayListN7.size();
                                    i22 = 0;
                                    while (i22 < size8) {
                                        Object obj7 = arrayListN7.get(i22);
                                        i22++;
                                        long jLongValue4 = ((Number) obj7).longValue();
                                        TestModel testModel10 = new TestModel();
                                        testModel10.elemType = 0;
                                        testModel10.elemId = jLongValue4;
                                        testModel10.modelType = 3;
                                        arrayList3.add(testModel10);
                                    }
                                    arrayListN8 = ks.b.n(courseLesson3.getSentenceList());
                                    size9 = arrayListN8.size();
                                    i23 = 0;
                                    while (i23 < size9) {
                                        Object obj8 = arrayListN8.get(i23);
                                        i23++;
                                        long jLongValue5 = ((Number) obj8).longValue();
                                        TestModel testModel11 = new TestModel();
                                        testModel11.elemType = 1;
                                        testModel11.elemId = jLongValue5;
                                        testModel11.modelType = 4;
                                        arrayList3.add(testModel11);
                                    }
                                    arrayList2 = arrayList3;
                                }
                            } else {
                                courseLesson3 = courseLesson2;
                                arrayList2 = new ArrayList();
                                arrayListN4 = ks.b.n(courseLesson3.getCharacterList());
                                size5 = arrayListN4.size();
                                i17 = 0;
                                while (i17 < size5) {
                                    Object obj9 = arrayListN4.get(i17);
                                    i17++;
                                    long jLongValue6 = ((Number) obj9).longValue();
                                    TestModel testModel12 = new TestModel();
                                    testModel12.elemType = 2;
                                    testModel12.elemId = jLongValue6;
                                    testModel12.modelType = 3;
                                    arrayList2.add(testModel12);
                                }
                            }
                            i14 = 0;
                        } else {
                            courseLesson3 = courseLesson2;
                            arrayList = new ArrayList();
                            if (!ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var2).f27733a.keyLanguage))) {
                                arrayListN3 = ks.b.n(courseLesson3.getCharacterList());
                                size3 = arrayListN3.size();
                                i16 = 0;
                                while (i16 < size3) {
                                    Object obj10 = arrayListN3.get(i16);
                                    i16++;
                                    long jLongValue7 = ((Number) obj10).longValue();
                                    TestModel testModel13 = new TestModel();
                                    testModel13.elemType = 2;
                                    testModel13.elemId = jLongValue7;
                                    testModel13.modelType = 3;
                                    arrayList.add(testModel13);
                                }
                            }
                            arrayListN = ks.b.n(courseLesson3.getWordList());
                            size = arrayListN.size();
                            i13 = 0;
                            while (i13 < size) {
                                Object obj11 = arrayListN.get(i13);
                                i13++;
                                long jLongValue8 = ((Number) obj11).longValue();
                                TestModel testModel14 = new TestModel();
                                testModel14.elemType = 0;
                                testModel14.elemId = jLongValue8;
                                testModel14.modelType = 10;
                                arrayList.add(testModel14);
                            }
                            i14 = 0;
                            arrayListN2 = ks.b.n(courseLesson3.getSentenceList());
                            size2 = arrayListN2.size();
                            i15 = 0;
                            while (i15 < size2) {
                                Object obj12 = arrayListN2.get(i15);
                                i15++;
                                long jLongValue9 = ((Number) obj12).longValue();
                                TestModel testModel15 = new TestModel();
                                testModel15.elemType = 1;
                                testModel15.elemId = jLongValue9;
                                testModel15.modelType = 13;
                                arrayList.add(testModel15);
                            }
                            arrayList2 = arrayList;
                        }
                        lessonId2 = courseLesson3.getLessonId();
                        unitId2 = courseLesson3.getUnitId();
                        size4 = arrayList2.size();
                        while (i14 < size4) {
                            Object obj13 = arrayList2.get(i14);
                            i14++;
                            TestModel testModel16 = (TestModel) obj13;
                            testModel16.lessonId = lessonId2;
                            testModel16.unitId = unitId2;
                        }
                        this.f45749e = null;
                        this.f45745a = null;
                        this.f45746b = null;
                        this.f45747c = null;
                        this.f45748d = 5;
                        if (jVar.emit(arrayList2, this) == aVar) {
                            return b0Var;
                        }
                    }
                }
            }
        } else if (i29 == 1) {
            listD = this.f45747c;
            com.bumptech.glide.e.F(obj);
            objV2 = obj;
            courseLesson = (CourseLesson) objV2;
            if (courseLesson != null) {
                lessonId = courseLesson.getLessonId();
                unitId = courseLesson.getUnitId();
                while (r6.hasNext()) {
                    testModel4.lessonId = lessonId;
                    testModel4.unitId = unitId;
                }
            }
            this.f45749e = null;
            this.f45745a = null;
            this.f45746b = null;
            this.f45747c = null;
            this.f45748d = 2;
            if (jVar.emit(listD, this) == aVar) {
                return b0Var;
            }
        } else {
            if (i29 == 2) {
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            if (i29 != 3) {
                if (i29 != 4 && i29 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            x2Var = this.f45746b;
            lVar = this.f45745a;
            com.bumptech.glide.e.F(obj);
            objV = obj;
            x2Var2 = x2Var;
            lVar2 = lVar;
            courseLesson2 = (CourseLesson) objV;
            if (courseLesson2 == null) {
                this.f45749e = null;
                this.f45745a = null;
                this.f45746b = null;
                this.f45747c = null;
                this.f45748d = 4;
                if (jVar.emit(ry.r.f50854a, this) == aVar) {
                    return b0Var;
                }
            } else {
                n0Var = e0Var.f45797c;
                n0Var2 = e0Var.f45797c;
                if (((fr.o0) n0Var).f27733a.isRepeatRegex) {
                    lastRegex = courseLesson2.getRepeatRegex();
                    z11 = true;
                } else {
                    lastRegex = courseLesson2.getLastRegex();
                    z11 = false;
                }
                str = lastRegex;
                coursePracticeType = this.K;
                Objects.toString(coursePracticeType);
                i11 = a0.f45739a[coursePracticeType.ordinal()];
                i12 = 13;
                if (i11 != 1) {
                    if (i11 != 2) {
                        i18 = 7;
                        if (i11 != 3) {
                            courseLesson3 = courseLesson2;
                            arrayList2 = new ArrayList();
                            arrayListN5 = ks.b.n(courseLesson3.getWordList());
                            size6 = arrayListN5.size();
                            i19 = 0;
                            while (i19 < size6) {
                                Object obj14 = arrayListN5.get(i19);
                                i19++;
                                long jLongValue10 = ((Number) obj14).longValue();
                                TestModel testModel17 = new TestModel();
                                testModel17.elemType = 0;
                                testModel17.elemId = jLongValue10;
                                testModel17.modelType = 7;
                                arrayList2.add(testModel17);
                            }
                            arrayListN6 = ks.b.n(courseLesson3.getSentenceList());
                            size7 = arrayListN6.size();
                            i21 = 0;
                            while (i21 < size7) {
                                Object obj15 = arrayListN6.get(i21);
                                i21++;
                                long jLongValue11 = ((Number) obj15).longValue();
                                TestModel testModel18 = new TestModel();
                                testModel18.elemType = 1;
                                testModel18.elemId = jLongValue11;
                                testModel18.modelType = 7;
                                arrayList2.add(testModel18);
                            }
                        } else if (i11 != 4) {
                            arrayList2 = ry.m.c1(android.support.v4.media.session.a.D(str, z11, CoursePracticeTypeKt.isTestOut(coursePracticeType), true, x2Var2, lVar2));
                            if (CoursePracticeTypeKt.isTestOut(coursePracticeType)) {
                                TestModel testModel19 = new TestModel();
                                testModel19.elemType = -1;
                                testModel19.elemId = 0L;
                                testModel19.modelType = 2;
                                arrayList2.add(0, testModel19);
                                listA1 = ry.m.a1(arrayList2);
                                arrayList4 = new ArrayList();
                                while (r8.hasNext()) {
                                    i26 = testModel8.elemType;
                                    if (i26 != 0 && testModel8.modelType == i18) {
                                        numValueOf = Integer.valueOf((int) r8);
                                    } else if (i26 == i30 || testModel8.modelType != i18) {
                                        numValueOf = num2;
                                    } else {
                                        numValueOf = Integer.valueOf(i12);
                                    }
                                    if (numValueOf == null) {
                                        arrayList4.add(testModel8);
                                        courseLesson4 = courseLesson2;
                                        list = listA1;
                                    } else {
                                        if (listA1.isEmpty()) {
                                            num = numValueOf;
                                            z12 = false;
                                        } else {
                                            it = listA1.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    testModel2 = (TestModel) it.next();
                                                    if (testModel2 == testModel8 && testModel2.elemType == testModel8.elemType) {
                                                        num = numValueOf;
                                                        if (testModel2.elemId != testModel8.elemId) {
                                                            continue;
                                                        } else {
                                                            int iIntValue2 = num.intValue();
                                                            if (iIntValue2 == 13) {
                                                                int i31 = testModel2.modelType;
                                                                if (i31 == 13 || i31 == 31) {
                                                                    z12 = true;
                                                                }
                                                            } else if (testModel2.modelType == iIntValue2) {
                                                                z12 = true;
                                                            }
                                                        }
                                                    } else {
                                                        num = numValueOf;
                                                    }
                                                    numValueOf = num;
                                                } else {
                                                    num = numValueOf;
                                                    z12 = false;
                                                }
                                            }
                                        }
                                        if (arrayList4.isEmpty()) {
                                            courseLesson4 = courseLesson2;
                                            list = listA1;
                                            z13 = false;
                                        } else {
                                            size12 = arrayList4.size();
                                            i27 = 0;
                                            while (true) {
                                                if (i27 < size12) {
                                                    Object obj16 = arrayList4.get(i27);
                                                    i27++;
                                                    testModel3 = (TestModel) obj16;
                                                    if (testModel3.elemType == testModel8.elemType) {
                                                        courseLesson4 = courseLesson2;
                                                        list = listA1;
                                                        if (testModel3.elemId == testModel8.elemId) {
                                                            iIntValue = num.intValue();
                                                            if (iIntValue == 13) {
                                                                i28 = testModel3.modelType;
                                                                if (i28 != 13 || i28 == 31) {
                                                                    z13 = true;
                                                                }
                                                            } else if (testModel3.modelType == iIntValue) {
                                                                z13 = true;
                                                            }
                                                        }
                                                        courseLesson2 = courseLesson4;
                                                        listA1 = list;
                                                    } else {
                                                        courseLesson4 = courseLesson2;
                                                        list = listA1;
                                                    }
                                                    courseLesson2 = courseLesson4;
                                                    listA1 = list;
                                                } else {
                                                    courseLesson4 = courseLesson2;
                                                    list = listA1;
                                                    z13 = false;
                                                }
                                            }
                                        }
                                        if (z12 && !z13) {
                                            testModel8.modelType = num.intValue();
                                            arrayList4.add(testModel8);
                                        }
                                    }
                                    courseLesson2 = courseLesson4;
                                    listA1 = list;
                                    i12 = 13;
                                    i18 = 7;
                                    i30 = 1;
                                    num2 = null;
                                }
                                courseLesson3 = courseLesson2;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList4);
                                size11 = arrayList2.size();
                                i25 = 0;
                                while (i25 < size11) {
                                    Object obj17 = arrayList2.get(i25);
                                    i25++;
                                    testModel = (TestModel) obj17;
                                    if (testModel.elemType != 0 && testModel.modelType == 3) {
                                        testModel.modelType = 4;
                                    }
                                }
                            } else {
                                courseLesson3 = courseLesson2;
                            }
                        } else {
                            courseLesson3 = courseLesson2;
                            arrayList3 = new ArrayList();
                            if (!ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var2).f27733a.keyLanguage))) {
                                arrayListN9 = ks.b.n(courseLesson3.getCharacterList());
                                size10 = arrayListN9.size();
                                i24 = 0;
                                while (i24 < size10) {
                                    Object obj18 = arrayListN9.get(i24);
                                    i24++;
                                    long jLongValue12 = ((Number) obj18).longValue();
                                    TestModel testModel20 = new TestModel();
                                    testModel20.elemType = 2;
                                    testModel20.elemId = jLongValue12;
                                    testModel20.modelType = 1;
                                    arrayList3.add(testModel20);
                                }
                            }
                            arrayListN7 = ks.b.n(courseLesson3.getWordList());
                            size8 = arrayListN7.size();
                            i22 = 0;
                            while (i22 < size8) {
                                Object obj19 = arrayListN7.get(i22);
                                i22++;
                                long jLongValue13 = ((Number) obj19).longValue();
                                TestModel testModel110 = new TestModel();
                                testModel110.elemType = 0;
                                testModel110.elemId = jLongValue13;
                                testModel110.modelType = 3;
                                arrayList3.add(testModel110);
                            }
                            arrayListN8 = ks.b.n(courseLesson3.getSentenceList());
                            size9 = arrayListN8.size();
                            i23 = 0;
                            while (i23 < size9) {
                                Object obj20 = arrayListN8.get(i23);
                                i23++;
                                long jLongValue14 = ((Number) obj20).longValue();
                                TestModel testModel111 = new TestModel();
                                testModel111.elemType = 1;
                                testModel111.elemId = jLongValue14;
                                testModel111.modelType = 4;
                                arrayList3.add(testModel111);
                            }
                            arrayList2 = arrayList3;
                        }
                    } else {
                        courseLesson3 = courseLesson2;
                        arrayList2 = new ArrayList();
                        arrayListN4 = ks.b.n(courseLesson3.getCharacterList());
                        size5 = arrayListN4.size();
                        i17 = 0;
                        while (i17 < size5) {
                            Object obj21 = arrayListN4.get(i17);
                            i17++;
                            long jLongValue15 = ((Number) obj21).longValue();
                            TestModel testModel112 = new TestModel();
                            testModel112.elemType = 2;
                            testModel112.elemId = jLongValue15;
                            testModel112.modelType = 3;
                            arrayList2.add(testModel112);
                        }
                    }
                    i14 = 0;
                } else {
                    courseLesson3 = courseLesson2;
                    arrayList = new ArrayList();
                    if (!ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var2).f27733a.keyLanguage))) {
                        arrayListN3 = ks.b.n(courseLesson3.getCharacterList());
                        size3 = arrayListN3.size();
                        i16 = 0;
                        while (i16 < size3) {
                            Object obj110 = arrayListN3.get(i16);
                            i16++;
                            long jLongValue16 = ((Number) obj110).longValue();
                            TestModel testModel113 = new TestModel();
                            testModel113.elemType = 2;
                            testModel113.elemId = jLongValue16;
                            testModel113.modelType = 3;
                            arrayList.add(testModel113);
                        }
                    }
                    arrayListN = ks.b.n(courseLesson3.getWordList());
                    size = arrayListN.size();
                    i13 = 0;
                    while (i13 < size) {
                        Object obj111 = arrayListN.get(i13);
                        i13++;
                        long jLongValue17 = ((Number) obj111).longValue();
                        TestModel testModel114 = new TestModel();
                        testModel114.elemType = 0;
                        testModel114.elemId = jLongValue17;
                        testModel114.modelType = 10;
                        arrayList.add(testModel114);
                    }
                    i14 = 0;
                    arrayListN2 = ks.b.n(courseLesson3.getSentenceList());
                    size2 = arrayListN2.size();
                    i15 = 0;
                    while (i15 < size2) {
                        Object obj112 = arrayListN2.get(i15);
                        i15++;
                        long jLongValue18 = ((Number) obj112).longValue();
                        TestModel testModel115 = new TestModel();
                        testModel115.elemType = 1;
                        testModel115.elemId = jLongValue18;
                        testModel115.modelType = 13;
                        arrayList.add(testModel115);
                    }
                    arrayList2 = arrayList;
                }
                lessonId2 = courseLesson3.getLessonId();
                unitId2 = courseLesson3.getUnitId();
                size4 = arrayList2.size();
                while (i14 < size4) {
                    Object obj113 = arrayList2.get(i14);
                    i14++;
                    TestModel testModel116 = (TestModel) obj113;
                    testModel116.lessonId = lessonId2;
                    testModel116.unitId = unitId2;
                }
                this.f45749e = null;
                this.f45745a = null;
                this.f45746b = null;
                this.f45747c = null;
                this.f45748d = 5;
                if (jVar.emit(arrayList2, this) == aVar) {
                    return b0Var;
                }
            }
        }
        return aVar;
    }
}
