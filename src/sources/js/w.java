package js;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import rz.e0;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChineseToneUnit f36840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f36841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f36842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f36843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f36844e;

    public w(ChineseToneUnit unit, g0 g0Var, vt.c cVar) {
        kotlin.jvm.internal.m.f(unit, "unit");
        this.f36840a = unit;
        this.f36841b = g0Var;
        this.f36842c = cVar;
        i1 i1VarC = x0.c(s.f36832a);
        this.f36843d = i1VarC;
        this.f36844e = new r0(i1VarC);
        vy.d dVar = null;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new gu.b(this, dVar, 24), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, dVar, 19), 3);
    }

    public static final List a(w wVar, List list) {
        LessonState lessonState;
        if (list.isEmpty()) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (arrayList.size() <= 1) {
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new a0((ChineseToneLesson) it2.next()));
                    }
                    return arrayList2;
                }
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (i12 < list.size()) {
                    ChineseToneLesson chineseToneLesson = (ChineseToneLesson) list.get(i12);
                    if (b(chineseToneLesson)) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(chineseToneLesson);
                        while (true) {
                            i12++;
                            if (i12 >= list.size() || b((ChineseToneLesson) list.get(i12))) {
                                break;
                            }
                            arrayList4.add(list.get(i12));
                        }
                        ChineseToneLesson chineseToneLesson2 = (ChineseToneLesson) ry.m.q0(arrayList4);
                        String description = !oz.q.K0(chineseToneLesson2.getDescription()) ? chineseToneLesson2.getDescription() : chineseToneLesson2.getLessonName();
                        ArrayList arrayListH0 = ry.m.H0(ns.o.K(chineseToneLesson2.copy((16383 & 1) != 0 ? chineseToneLesson2.lessonId : 0L, (16383 & 2) != 0 ? chineseToneLesson2.lessonName : null, (16383 & 4) != 0 ? chineseToneLesson2.description : BuildConfig.VERSION_NAME, (16383 & 8) != 0 ? chineseToneLesson2.tDescription : null, (16383 & 16) != 0 ? chineseToneLesson2.wordList : null, (16383 & 32) != 0 ? chineseToneLesson2.sentenceList : null, (16383 & 64) != 0 ? chineseToneLesson2.characterList : null, (16383 & 128) != 0 ? chineseToneLesson2.repeatRegex : null, (16383 & 256) != 0 ? chineseToneLesson2.lastRegex : null, (16383 & 512) != 0 ? chineseToneLesson2.challengeRegex : null, (16383 & 1024) != 0 ? chineseToneLesson2.levelId : 0L, (16383 & 2048) != 0 ? chineseToneLesson2.unitId : 0L, (16383 & 4096) != 0 ? chineseToneLesson2.sortIndex : 0, (16383 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? chineseToneLesson2.normalRegex : null, (16383 & 16384) != 0 ? chineseToneLesson2.state : null)), ry.m.k0(arrayList4, 1));
                        if (!arrayListH0.isEmpty()) {
                            if (!arrayListH0.isEmpty()) {
                                int size = arrayListH0.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size) {
                                        lessonState = LessonState.StateOpen;
                                        break;
                                    }
                                    Object obj = arrayListH0.get(i13);
                                    i13++;
                                    LessonState state = ((ChineseToneLesson) obj).getState();
                                    LessonState lessonState2 = LessonState.StateLocked;
                                    if (state == lessonState2) {
                                        lessonState = lessonState2;
                                        break;
                                    }
                                }
                            } else {
                                lessonState = LessonState.StateOpen;
                                break;
                            }
                        } else {
                            lessonState = LessonState.StateLocked;
                        }
                        ArrayList arrayList5 = new ArrayList(ry.n.W(arrayListH0, 10));
                        int size2 = arrayListH0.size();
                        int i14 = 0;
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayListH0.get(i15);
                            i15++;
                            int i16 = i14 + 1;
                            if (i14 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            ChineseToneLesson chineseToneLessonCopy = (ChineseToneLesson) obj2;
                            if (chineseToneLessonCopy.getLessonId() > 0) {
                                chineseToneLessonCopy = chineseToneLessonCopy.copy((16383 & 1) != 0 ? chineseToneLessonCopy.lessonId : 0L, (16383 & 2) != 0 ? chineseToneLessonCopy.lessonName : nv.p.j(i14, "Lesson "), (16383 & 4) != 0 ? chineseToneLessonCopy.description : null, (16383 & 8) != 0 ? chineseToneLessonCopy.tDescription : null, (16383 & 16) != 0 ? chineseToneLessonCopy.wordList : null, (16383 & 32) != 0 ? chineseToneLessonCopy.sentenceList : null, (16383 & 64) != 0 ? chineseToneLessonCopy.characterList : null, (16383 & 128) != 0 ? chineseToneLessonCopy.repeatRegex : null, (16383 & 256) != 0 ? chineseToneLessonCopy.lastRegex : null, (16383 & 512) != 0 ? chineseToneLessonCopy.challengeRegex : null, (16383 & 1024) != 0 ? chineseToneLessonCopy.levelId : 0L, (16383 & 2048) != 0 ? chineseToneLessonCopy.unitId : 0L, (16383 & 4096) != 0 ? chineseToneLessonCopy.sortIndex : 0, (16383 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? chineseToneLessonCopy.normalRegex : null, (16383 & 16384) != 0 ? chineseToneLessonCopy.state : null);
                            }
                            arrayList5.add(chineseToneLessonCopy);
                            i14 = i16;
                        }
                        arrayList3.add(new z(description, arrayList5, true, lessonState));
                    } else {
                        if (i12 == 0) {
                            arrayList3.add(new a0(chineseToneLesson));
                        }
                        i12++;
                    }
                }
                if (arrayList3.size() <= 3) {
                    return arrayList3;
                }
                ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList3, 10));
                int size3 = arrayList3.size();
                int i17 = 0;
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList3.get(i18);
                    i18++;
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    Object objA = (b0) obj3;
                    if (objA instanceof z) {
                        z zVar = (z) objA;
                        objA = z.a(zVar, null, zVar.f36859d == LessonState.StateOpen, null, 11);
                    }
                    arrayList6.add(objA);
                    i17 = i19;
                }
                return arrayList6;
            }
            Object next = it.next();
            int i21 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            Integer numValueOf = b((ChineseToneLesson) next) ? Integer.valueOf(i11) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i11 = i21;
        }
    }

    public static boolean b(ChineseToneLesson chineseToneLesson) {
        String lowerCase = oz.q.i1(chineseToneLesson.getLessonName()).toString().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return chineseToneLesson.getLessonId() < 0 || oz.q.v0(lowerCase, "intro", false);
    }

    public final void c(int i11) {
        Object value;
        i1 i1Var = this.f36843d;
        u uVar = (u) i1Var.getValue();
        if (uVar instanceof t) {
            t tVar = (t) uVar;
            List<Object> list = tVar.f36834b;
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            int i12 = 0;
            for (Object objA : list) {
                if (!(objA instanceof a0)) {
                    if (!(objA instanceof z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i12 == i11) {
                        i12++;
                        z zVar = (z) objA;
                        objA = z.a(zVar, null, !zVar.f36858c, null, 11);
                    } else {
                        i12++;
                        objA = (z) objA;
                    }
                }
                arrayList.add(objA);
            }
            do {
                value = i1Var.getValue();
            } while (!i1Var.j(value, t.a(tVar, arrayList, null, 5)));
        }
    }
}
