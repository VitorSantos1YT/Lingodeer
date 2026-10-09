package bh;

import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f4281c;

    public /* synthetic */ l0(uz.j jVar, a1 a1Var, int i11) {
        this.f4279a = i11;
        this.f4280b = jVar;
        this.f4281c = a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0234  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:165:0x0342  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:217:0x0444  */
    /* JADX WARN: Code duplicated, block: B:243:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        k0 k0Var;
        int i11;
        uz.j jVar;
        uz.j jVar2;
        o0 o0Var;
        int i12;
        uz.j jVar3;
        uz.j jVar4;
        p0 p0Var;
        int i13;
        uz.j jVar5;
        uz.j jVar6;
        q0 q0Var;
        int i14;
        uz.j jVar7;
        uz.j jVar8;
        r0 r0Var;
        int i15;
        uz.j jVar9;
        uz.j jVar10;
        s0 s0Var;
        int i16;
        uz.j jVar11;
        uz.j jVar12;
        t0 t0Var;
        int i17;
        uz.j jVar13;
        uz.j jVar14;
        u0 u0Var;
        int i18;
        uz.j jVar15;
        uz.j jVar16;
        v0 v0Var;
        int i19;
        uz.j jVar17;
        uz.j jVar18;
        w0 w0Var;
        int i21;
        uz.j jVar19;
        uz.j jVar20;
        switch (this.f4279a) {
            case 0:
                if (dVar instanceof k0) {
                    k0Var = (k0) dVar;
                    int i22 = k0Var.f4263b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        k0Var.f4263b = i22 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new k0(this, dVar);
                    }
                } else {
                    k0Var = new k0(this, dVar);
                }
                Object obj2 = k0Var.f4262a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i23 = k0Var.f4263b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i23 != 0) {
                    if (i23 == 1) {
                        i11 = k0Var.f4266e;
                        jVar2 = k0Var.f4265d;
                        com.bumptech.glide.e.F(obj2);
                    } else {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj2);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj2);
                CourseLessonFinishStatus courseLessonFinishStatus = (CourseLessonFinishStatus) obj;
                boolean practiceComprehensive = courseLessonFinishStatus.getPracticeComprehensive();
                i11 = 0;
                jVar = this.f4280b;
                if (!practiceComprehensive) {
                    CourseLessonFinishStatus courseLessonFinishStatusCopy$default = CourseLessonFinishStatus.copy$default(courseLessonFinishStatus, null, null, false, false, false, true, 0L, true, 95, null);
                    k0Var.f4265d = jVar;
                    k0Var.f4266e = 0;
                    k0Var.f4263b = 1;
                    if (a1.c(this.f4281c, courseLessonFinishStatusCopy$default, k0Var) == aVar) {
                        return aVar;
                    }
                    jVar2 = jVar;
                }
                k0Var.f4265d = null;
                k0Var.f4266e = i11;
                k0Var.f4263b = 2;
                if (jVar.emit(b0Var, k0Var) == aVar) {
                    return aVar;
                }
                return b0Var;
                jVar = jVar2;
                k0Var.f4265d = null;
                k0Var.f4266e = i11;
                k0Var.f4263b = 2;
                if (jVar.emit(b0Var, k0Var) == aVar) {
                    return aVar;
                }
                return b0Var;
            case 1:
                if (dVar instanceof o0) {
                    o0Var = (o0) dVar;
                    int i24 = o0Var.f4313b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        o0Var.f4313b = i24 - Integer.MIN_VALUE;
                    } else {
                        o0Var = new o0(this, dVar);
                    }
                } else {
                    o0Var = new o0(this, dVar);
                }
                Object obj3 = o0Var.f4312a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i25 = o0Var.f4313b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i25 != 0) {
                    if (i25 == 1) {
                        i12 = o0Var.f4316e;
                        jVar4 = o0Var.f4315d;
                        com.bumptech.glide.e.F(obj3);
                    } else {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj3);
                    }
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj3);
                CourseLessonFinishStatus courseLessonFinishStatus2 = (CourseLessonFinishStatus) obj;
                boolean practiceListening = courseLessonFinishStatus2.getPracticeListening();
                i12 = 0;
                jVar3 = this.f4280b;
                if (!practiceListening) {
                    CourseLessonFinishStatus courseLessonFinishStatusCopy$default2 = CourseLessonFinishStatus.copy$default(courseLessonFinishStatus2, null, null, true, false, false, false, 0L, true, 123, null);
                    o0Var.f4315d = jVar3;
                    o0Var.f4316e = 0;
                    o0Var.f4313b = 1;
                    if (a1.c(this.f4281c, courseLessonFinishStatusCopy$default2, o0Var) == aVar2) {
                        return aVar2;
                    }
                    jVar4 = jVar3;
                }
                o0Var.f4315d = null;
                o0Var.f4316e = i12;
                o0Var.f4313b = 2;
                if (jVar3.emit(b0Var2, o0Var) == aVar2) {
                    return aVar2;
                }
                return b0Var2;
                jVar3 = jVar4;
                o0Var.f4315d = null;
                o0Var.f4316e = i12;
                o0Var.f4313b = 2;
                if (jVar3.emit(b0Var2, o0Var) == aVar2) {
                    return aVar2;
                }
                return b0Var2;
            case 2:
                if (dVar instanceof p0) {
                    p0Var = (p0) dVar;
                    int i26 = p0Var.f4327b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        p0Var.f4327b = i26 - Integer.MIN_VALUE;
                    } else {
                        p0Var = new p0(this, dVar);
                    }
                } else {
                    p0Var = new p0(this, dVar);
                }
                Object obj4 = p0Var.f4326a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i27 = p0Var.f4327b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i27 != 0) {
                    if (i27 == 1) {
                        i13 = p0Var.f4330e;
                        jVar6 = p0Var.f4329d;
                        com.bumptech.glide.e.F(obj4);
                    } else {
                        if (i27 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj4);
                    }
                    return b0Var3;
                }
                com.bumptech.glide.e.F(obj4);
                CourseLessonFinishStatus courseLessonFinishStatus3 = (CourseLessonFinishStatus) obj;
                boolean practiceSpeaking = courseLessonFinishStatus3.getPracticeSpeaking();
                i13 = 0;
                jVar5 = this.f4280b;
                if (!practiceSpeaking) {
                    CourseLessonFinishStatus courseLessonFinishStatusCopy$default3 = CourseLessonFinishStatus.copy$default(courseLessonFinishStatus3, null, null, false, true, false, false, 0L, true, 119, null);
                    p0Var.f4329d = jVar5;
                    p0Var.f4330e = 0;
                    p0Var.f4327b = 1;
                    if (a1.c(this.f4281c, courseLessonFinishStatusCopy$default3, p0Var) == aVar3) {
                        return aVar3;
                    }
                    jVar6 = jVar5;
                }
                p0Var.f4329d = null;
                p0Var.f4330e = i13;
                p0Var.f4327b = 2;
                if (jVar5.emit(b0Var3, p0Var) == aVar3) {
                    return aVar3;
                }
                return b0Var3;
                jVar5 = jVar6;
                p0Var.f4329d = null;
                p0Var.f4330e = i13;
                p0Var.f4327b = 2;
                if (jVar5.emit(b0Var3, p0Var) == aVar3) {
                    return aVar3;
                }
                return b0Var3;
            case 3:
                if (dVar instanceof q0) {
                    q0Var = (q0) dVar;
                    int i28 = q0Var.f4337b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        q0Var.f4337b = i28 - Integer.MIN_VALUE;
                    } else {
                        q0Var = new q0(this, dVar);
                    }
                } else {
                    q0Var = new q0(this, dVar);
                }
                Object obj5 = q0Var.f4336a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i29 = q0Var.f4337b;
                qy.b0 b0Var4 = qy.b0.f48488a;
                if (i29 != 0) {
                    if (i29 == 1) {
                        i14 = q0Var.f4340e;
                        jVar8 = q0Var.f4339d;
                        com.bumptech.glide.e.F(obj5);
                    } else {
                        if (i29 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj5);
                    }
                    return b0Var4;
                }
                com.bumptech.glide.e.F(obj5);
                CourseLessonFinishStatus courseLessonFinishStatus4 = (CourseLessonFinishStatus) obj;
                boolean practiceSpelling = courseLessonFinishStatus4.getPracticeSpelling();
                i14 = 0;
                jVar7 = this.f4280b;
                if (!practiceSpelling) {
                    CourseLessonFinishStatus courseLessonFinishStatusCopy$default4 = CourseLessonFinishStatus.copy$default(courseLessonFinishStatus4, null, null, false, false, true, false, 0L, true, 111, null);
                    q0Var.f4339d = jVar7;
                    q0Var.f4340e = 0;
                    q0Var.f4337b = 1;
                    if (a1.c(this.f4281c, courseLessonFinishStatusCopy$default4, q0Var) == aVar4) {
                        return aVar4;
                    }
                    jVar8 = jVar7;
                }
                q0Var.f4339d = null;
                q0Var.f4340e = i14;
                q0Var.f4337b = 2;
                if (jVar7.emit(b0Var4, q0Var) == aVar4) {
                    return aVar4;
                }
                return b0Var4;
                jVar7 = jVar8;
                q0Var.f4339d = null;
                q0Var.f4340e = i14;
                q0Var.f4337b = 2;
                if (jVar7.emit(b0Var4, q0Var) == aVar4) {
                    return aVar4;
                }
                return b0Var4;
            case 4:
                if (dVar instanceof r0) {
                    r0Var = (r0) dVar;
                    int i30 = r0Var.f4347b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        r0Var.f4347b = i30 - Integer.MIN_VALUE;
                    } else {
                        r0Var = new r0(this, dVar);
                    }
                } else {
                    r0Var = new r0(this, dVar);
                }
                Object obj6 = r0Var.f4346a;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i31 = r0Var.f4347b;
                qy.b0 b0Var5 = qy.b0.f48488a;
                if (i31 != 0) {
                    if (i31 == 1) {
                        i15 = r0Var.f4350e;
                        jVar10 = r0Var.f4349d;
                        com.bumptech.glide.e.F(obj6);
                    } else {
                        if (i31 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj6);
                    }
                    return b0Var5;
                }
                com.bumptech.glide.e.F(obj6);
                CourseUnitFinishStatus courseUnitFinishStatus = (CourseUnitFinishStatus) obj;
                boolean dialogPractice = courseUnitFinishStatus.getDialogPractice();
                i15 = 0;
                jVar9 = this.f4280b;
                if (!dialogPractice) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus, null, null, 0, false, false, false, false, true, false, 0L, true, 895, null);
                    r0Var.f4349d = jVar9;
                    r0Var.f4350e = 0;
                    r0Var.f4347b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default, r0Var) == aVar5) {
                        return aVar5;
                    }
                    jVar10 = jVar9;
                }
                r0Var.f4349d = null;
                r0Var.f4350e = i15;
                r0Var.f4347b = 2;
                if (jVar9.emit(b0Var5, r0Var) == aVar5) {
                    return aVar5;
                }
                return b0Var5;
                jVar9 = jVar10;
                r0Var.f4349d = null;
                r0Var.f4350e = i15;
                r0Var.f4347b = 2;
                if (jVar9.emit(b0Var5, r0Var) == aVar5) {
                    return aVar5;
                }
                return b0Var5;
            case 5:
                if (dVar instanceof s0) {
                    s0Var = (s0) dVar;
                    int i32 = s0Var.f4356b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        s0Var.f4356b = i32 - Integer.MIN_VALUE;
                    } else {
                        s0Var = new s0(this, dVar);
                    }
                } else {
                    s0Var = new s0(this, dVar);
                }
                Object obj7 = s0Var.f4355a;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i33 = s0Var.f4356b;
                qy.b0 b0Var6 = qy.b0.f48488a;
                if (i33 != 0) {
                    if (i33 == 1) {
                        i16 = s0Var.f4359e;
                        jVar12 = s0Var.f4358d;
                        com.bumptech.glide.e.F(obj7);
                    } else {
                        if (i33 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj7);
                    }
                    return b0Var6;
                }
                com.bumptech.glide.e.F(obj7);
                CourseUnitFinishStatus courseUnitFinishStatus2 = (CourseUnitFinishStatus) obj;
                boolean dialogSpeaking = courseUnitFinishStatus2.getDialogSpeaking();
                i16 = 0;
                jVar11 = this.f4280b;
                if (!dialogSpeaking) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default2 = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus2, null, null, 0, false, false, false, false, false, true, 0L, true, 767, null);
                    s0Var.f4358d = jVar11;
                    s0Var.f4359e = 0;
                    s0Var.f4356b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default2, s0Var) == aVar6) {
                        return aVar6;
                    }
                    jVar12 = jVar11;
                }
                s0Var.f4358d = null;
                s0Var.f4359e = i16;
                s0Var.f4356b = 2;
                if (jVar11.emit(b0Var6, s0Var) == aVar6) {
                    return aVar6;
                }
                return b0Var6;
                jVar11 = jVar12;
                s0Var.f4358d = null;
                s0Var.f4359e = i16;
                s0Var.f4356b = 2;
                if (jVar11.emit(b0Var6, s0Var) == aVar6) {
                    return aVar6;
                }
                return b0Var6;
            case 6:
                if (dVar instanceof t0) {
                    t0Var = (t0) dVar;
                    int i34 = t0Var.f4376b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        t0Var.f4376b = i34 - Integer.MIN_VALUE;
                    } else {
                        t0Var = new t0(this, dVar);
                    }
                } else {
                    t0Var = new t0(this, dVar);
                }
                Object obj8 = t0Var.f4375a;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i35 = t0Var.f4376b;
                qy.b0 b0Var7 = qy.b0.f48488a;
                if (i35 != 0) {
                    if (i35 == 1) {
                        i17 = t0Var.f4379e;
                        jVar14 = t0Var.f4378d;
                        com.bumptech.glide.e.F(obj8);
                    } else {
                        if (i35 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj8);
                    }
                    return b0Var7;
                }
                com.bumptech.glide.e.F(obj8);
                CourseUnitFinishStatus courseUnitFinishStatus3 = (CourseUnitFinishStatus) obj;
                boolean dialogWarmUp = courseUnitFinishStatus3.getDialogWarmUp();
                i17 = 0;
                jVar13 = this.f4280b;
                if (!dialogWarmUp) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default3 = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus3, null, null, 0, false, false, false, true, false, false, 0L, true, 959, null);
                    t0Var.f4378d = jVar13;
                    t0Var.f4379e = 0;
                    t0Var.f4376b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default3, t0Var) == aVar7) {
                        return aVar7;
                    }
                    jVar14 = jVar13;
                }
                t0Var.f4378d = null;
                t0Var.f4379e = i17;
                t0Var.f4376b = 2;
                if (jVar13.emit(b0Var7, t0Var) == aVar7) {
                    return aVar7;
                }
                return b0Var7;
                jVar13 = jVar14;
                t0Var.f4378d = null;
                t0Var.f4379e = i17;
                t0Var.f4376b = 2;
                if (jVar13.emit(b0Var7, t0Var) == aVar7) {
                    return aVar7;
                }
                return b0Var7;
            case 7:
                if (dVar instanceof u0) {
                    u0Var = (u0) dVar;
                    int i36 = u0Var.f4395b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        u0Var.f4395b = i36 - Integer.MIN_VALUE;
                    } else {
                        u0Var = new u0(this, dVar);
                    }
                } else {
                    u0Var = new u0(this, dVar);
                }
                Object obj9 = u0Var.f4394a;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i37 = u0Var.f4395b;
                qy.b0 b0Var8 = qy.b0.f48488a;
                if (i37 != 0) {
                    if (i37 == 1) {
                        i18 = u0Var.f4398e;
                        jVar16 = u0Var.f4397d;
                        com.bumptech.glide.e.F(obj9);
                    } else {
                        if (i37 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj9);
                    }
                    return b0Var8;
                }
                com.bumptech.glide.e.F(obj9);
                CourseUnitFinishStatus courseUnitFinishStatus4 = (CourseUnitFinishStatus) obj;
                boolean storyReading = courseUnitFinishStatus4.getStoryReading();
                i18 = 0;
                jVar15 = this.f4280b;
                if (!storyReading) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default4 = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus4, null, null, 0, true, false, false, false, false, false, 0L, true, 1015, null);
                    u0Var.f4397d = jVar15;
                    u0Var.f4398e = 0;
                    u0Var.f4395b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default4, u0Var) == aVar8) {
                        return aVar8;
                    }
                    jVar16 = jVar15;
                }
                u0Var.f4397d = null;
                u0Var.f4398e = i18;
                u0Var.f4395b = 2;
                if (jVar15.emit(b0Var8, u0Var) == aVar8) {
                    return aVar8;
                }
                return b0Var8;
                jVar15 = jVar16;
                u0Var.f4397d = null;
                u0Var.f4398e = i18;
                u0Var.f4395b = 2;
                if (jVar15.emit(b0Var8, u0Var) == aVar8) {
                    return aVar8;
                }
                return b0Var8;
            case 8:
                if (dVar instanceof v0) {
                    v0Var = (v0) dVar;
                    int i38 = v0Var.f4402b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        v0Var.f4402b = i38 - Integer.MIN_VALUE;
                    } else {
                        v0Var = new v0(this, dVar);
                    }
                } else {
                    v0Var = new v0(this, dVar);
                }
                Object obj10 = v0Var.f4401a;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i39 = v0Var.f4402b;
                qy.b0 b0Var9 = qy.b0.f48488a;
                if (i39 != 0) {
                    if (i39 == 1) {
                        i19 = v0Var.f4405e;
                        jVar18 = v0Var.f4404d;
                        com.bumptech.glide.e.F(obj10);
                    } else {
                        if (i39 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj10);
                    }
                    return b0Var9;
                }
                com.bumptech.glide.e.F(obj10);
                CourseUnitFinishStatus courseUnitFinishStatus5 = (CourseUnitFinishStatus) obj;
                boolean storySpeaking = courseUnitFinishStatus5.getStorySpeaking();
                i19 = 0;
                jVar17 = this.f4280b;
                if (!storySpeaking) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default5 = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus5, null, null, 0, false, true, false, false, false, false, 0L, true, 1007, null);
                    v0Var.f4404d = jVar17;
                    v0Var.f4405e = 0;
                    v0Var.f4402b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default5, v0Var) == aVar9) {
                        return aVar9;
                    }
                    jVar18 = jVar17;
                }
                v0Var.f4404d = null;
                v0Var.f4405e = i19;
                v0Var.f4402b = 2;
                if (jVar17.emit(b0Var9, v0Var) == aVar9) {
                    return aVar9;
                }
                return b0Var9;
                jVar17 = jVar18;
                v0Var.f4404d = null;
                v0Var.f4405e = i19;
                v0Var.f4402b = 2;
                if (jVar17.emit(b0Var9, v0Var) == aVar9) {
                    return aVar9;
                }
                return b0Var9;
            default:
                if (dVar instanceof w0) {
                    w0Var = (w0) dVar;
                    int i40 = w0Var.f4413b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        w0Var.f4413b = i40 - Integer.MIN_VALUE;
                    } else {
                        w0Var = new w0(this, dVar);
                    }
                } else {
                    w0Var = new w0(this, dVar);
                }
                Object obj11 = w0Var.f4412a;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i41 = w0Var.f4413b;
                qy.b0 b0Var10 = qy.b0.f48488a;
                if (i41 != 0) {
                    if (i41 == 1) {
                        i21 = w0Var.f4416e;
                        jVar20 = w0Var.f4415d;
                        com.bumptech.glide.e.F(obj11);
                    } else {
                        if (i41 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj11);
                    }
                    return b0Var10;
                }
                com.bumptech.glide.e.F(obj11);
                CourseUnitFinishStatus courseUnitFinishStatus6 = (CourseUnitFinishStatus) obj;
                boolean tipsReading = courseUnitFinishStatus6.getTipsReading();
                i21 = 0;
                jVar19 = this.f4280b;
                if (!tipsReading) {
                    CourseUnitFinishStatus courseUnitFinishStatusCopy$default6 = CourseUnitFinishStatus.copy$default(courseUnitFinishStatus6, null, null, 0, false, false, true, false, false, false, 0L, true, 991, null);
                    w0Var.f4415d = jVar19;
                    w0Var.f4416e = 0;
                    w0Var.f4413b = 1;
                    if (a1.d(this.f4281c, courseUnitFinishStatusCopy$default6, w0Var) == aVar10) {
                        return aVar10;
                    }
                    jVar20 = jVar19;
                }
                w0Var.f4415d = null;
                w0Var.f4416e = i21;
                w0Var.f4413b = 2;
                if (jVar19.emit(b0Var10, w0Var) == aVar10) {
                    return aVar10;
                }
                return b0Var10;
                jVar19 = jVar20;
                w0Var.f4415d = null;
                w0Var.f4416e = i21;
                w0Var.f4413b = 2;
                if (jVar19.emit(b0Var10, w0Var) == aVar10) {
                    return aVar10;
                }
                return b0Var10;
        }
    }
}
