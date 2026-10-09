package nv;

import bp.b1;
import com.lingodeer.R;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.lingodeer.syllable_ko.model.KOSyllableLessonDataKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j0.e2;
import java.util.ArrayList;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f44151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f44152e;

    public /* synthetic */ j(ArrayList arrayList, String str, fz.a aVar, fz.c cVar, int i11) {
        this.f44148a = i11;
        this.f44149b = arrayList;
        this.f44150c = str;
        this.f44151d = aVar;
        this.f44152e = cVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        switch (this.f44148a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    KOSyllableLesson kOSyllableLesson = (KOSyllableLesson) this.f44149b.get(iIntValue);
                    sVar.d0(-78211561);
                    SyllableLessonStatus status = kOSyllableLesson.getStatus();
                    String strQ0 = oz.x.q0(kOSyllableLesson.getLessonID(), "L", BuildConfig.VERSION_NAME);
                    String description = KOSyllableLessonDataKt.getDescription(kOSyllableLesson);
                    if (kotlin.jvm.internal.m.a(description, "REVIEW")) {
                        description = null;
                    }
                    if (description == null) {
                        description = ep.a.m(sVar, 1798598995, R.string.syllable_review, sVar, false);
                    } else {
                        sVar.d0(1798596794);
                        sVar.p(false);
                    }
                    String str = description;
                    boolean zS0 = oz.x.s0(kOSyllableLesson.getLessonID(), "Test", false);
                    boolean zEquals = this.f44150c.equals(com.bumptech.glide.e.h(kOSyllableLesson));
                    z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
                    fz.c cVar2 = this.f44152e;
                    boolean zF = sVar.f(cVar2) | sVar.h(kOSyllableLesson);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new i(cVar2, kOSyllableLesson, 0);
                        sVar.o0(objQ);
                    }
                    a.a(status, strQ0, str, zS0, zEquals, true, rVarE, this.f44151d, (fz.a) objQ, sVar, 1769472);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    KOSyllableLesson kOSyllableLesson2 = (KOSyllableLesson) this.f44149b.get(iIntValue3);
                    sVar2.d0(-1847796451);
                    SyllableLessonStatus status2 = kOSyllableLesson2.getStatus();
                    String strQ1 = oz.x.q0(kOSyllableLesson2.getLessonID(), "L", BuildConfig.VERSION_NAME);
                    String description2 = KOSyllableLessonDataKt.getDescription(kOSyllableLesson2);
                    if (kotlin.jvm.internal.m.a(description2, "REVIEW")) {
                        description2 = null;
                    }
                    if (description2 == null) {
                        description2 = ep.a.m(sVar2, -890883699, R.string.syllable_review, sVar2, false);
                    } else {
                        sVar2.d0(-890885900);
                        sVar2.p(false);
                    }
                    String str2 = description2;
                    boolean zS1 = oz.x.s0(kOSyllableLesson2.getLessonID(), "Test", false);
                    boolean zEquals2 = this.f44150c.equals(com.bumptech.glide.e.h(kOSyllableLesson2));
                    z1.r rVarE2 = e2.e(z1.o.f58481a, 1.0f);
                    fz.c cVar4 = this.f44152e;
                    boolean zF2 = sVar2.f(cVar4) | sVar2.h(kOSyllableLesson2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new i(cVar4, kOSyllableLesson2, 1);
                        sVar2.o0(objQ2);
                    }
                    a.a(status2, strQ1, str2, zS1, zEquals2, true, rVarE2, this.f44151d, (fz.a) objQ2, sVar2, 1769472);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l0.c cVar5 = (l0.c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(cVar5) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) this.f44149b.get(iIntValue5);
                    sVar3.d0(-1190802133);
                    SyllableLessonStatus status3 = syllableWriteLesson.getStatus();
                    String strValueOf = String.valueOf(syllableWriteLesson.getLessonId() + 1);
                    String lessonDescription = syllableWriteLesson.getLessonDescription();
                    boolean zA = kotlin.jvm.internal.m.a(this.f44150c, c.a.d(syllableWriteLesson));
                    z1.r rVarE3 = e2.e(z1.o.f58481a, 1.0f);
                    fz.c cVar6 = this.f44152e;
                    boolean zF3 = sVar3.f(cVar6) | sVar3.h(syllableWriteLesson);
                    Object objQ3 = sVar3.Q();
                    if (zF3 || objQ3 == l1.m.f39353a) {
                        objQ3 = new b1(25, cVar6, syllableWriteLesson);
                        sVar3.o0(objQ3);
                    }
                    a.a(status3, strValueOf, lessonDescription, false, zA, false, rVarE3, this.f44151d, (fz.a) objQ3, sVar3, 1772544);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
