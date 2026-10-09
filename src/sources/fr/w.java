package fr;

import com.lingodeer.data.model.CourseQuestionPreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseQuestionPreference f27932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f27933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CourseQuestionPreference courseQuestionPreference, x xVar, vy.d dVar) {
        super(1, dVar);
        this.f27932d = courseQuestionPreference;
        this.f27933e = xVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new w(this.f27932d, this.f27933e, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((w) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r0.a(r3, r11) == r1) goto L20;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fr.x r0 = r11.f27933e
            au.e1 r0 = r0.f27958a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r11.f27931c
            com.lingodeer.data.model.CourseQuestionPreference r3 = r11.f27932d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L26
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L16
            com.bumptech.glide.e.F(r12)
            goto L79
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            int r2 = r11.f27929a
            java.lang.String r5 = r11.f27930b
            com.bumptech.glide.e.F(r12)
            goto L4b
        L26:
            com.bumptech.glide.e.F(r12)
            int r2 = r3.getKeyLanguage()
            java.lang.String r12 = com.lingodeer.data.model.CourseQuestionPreferencePayloadKt.buildCourseQuestionPreferenceProgressId(r2)
            r11.f27930b = r12
            r11.f27929a = r2
            r11.f27931c = r5
            w9.s r6 = r0.f2984a
            au.f r7 = new au.f
            r8 = 22
            r7.<init>(r12, r8)
            r8 = 0
            java.lang.Object r5 = cf.x.C(r11, r6, r5, r8, r7)
            if (r5 != r1) goto L48
            goto L78
        L48:
            r10 = r5
            r5 = r12
            r12 = r10
        L4b:
            com.lingodeer.database.model.SubLearnProgressEntity r12 = (com.lingodeer.database.model.SubLearnProgressEntity) r12
            r6 = 0
            if (r12 == 0) goto L55
            java.lang.String r12 = r12.getProgress()
            goto L56
        L55:
            r12 = r6
        L56:
            com.lingodeer.data.model.CourseQuestionPreferencePayload$Companion r7 = com.lingodeer.data.model.CourseQuestionPreferencePayload.Companion
            com.lingodeer.data.model.CourseQuestionPreferencePayload r12 = r7.parse(r12)
            r12.upsert(r3)
            com.lingodeer.database.model.SubLearnProgressEntity r3 = new com.lingodeer.database.model.SubLearnProgressEntity
            java.lang.String r7 = r12.toProgressString()
            long r8 = r12.maxUpdatedAt()
            r3.<init>(r5, r7, r8)
            r11.f27930b = r6
            r11.f27929a = r2
            r11.f27931c = r4
            java.lang.Object r12 = r0.a(r3, r11)
            if (r12 != r1) goto L79
        L78:
            return r1
        L79:
            qy.b0 r12 = qy.b0.f48488a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
