package ds;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.ChineseToneLastVisited;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.SubLearnProgress;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import cr.n;
import cu.t;
import d0.y1;
import fr.h0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import oz.x;
import qy.b0;
import qy.q;
import ry.r;
import rz.o0;
import vt.b1;
import vt.c1;
import vt.d1;
import vt.e0;
import vt.f0;
import vt.g0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f23617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cu.g f23618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f23619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f23620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f23621f = com.bumptech.glide.d.v(new n(this, 8));

    public g(Context context, n0 n0Var, cu.g gVar, b1 b1Var, e0 e0Var) {
        this.f23616a = context;
        this.f23617b = n0Var;
        this.f23618c = gVar;
        this.f23619d = b1Var;
        this.f23620e = e0Var;
    }

    public static LinkedHashMap d(String str) {
        int iH0;
        if (oz.q.K0(str)) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : oz.q.X0(str, new char[]{';'}, 6)) {
            if (!oz.q.K0(str2) && (iH0 = oz.q.H0(str2, ':', 0, 6)) > 0 && iH0 < str2.length() - 1) {
                String strSubstring = str2.substring(0, iH0);
                m.e(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iH0 + 1);
                m.e(strSubstring2, "substring(...)");
                Long lU0 = x.u0(strSubstring);
                Integer numT0 = x.t0(strSubstring2);
                if (lU0 != null && numT0 != null) {
                    linkedHashMap.put(lU0, numT0);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(List list, xy.c cVar) {
        b bVar;
        List<ChineseToneLesson> list2;
        Object objM;
        String progress;
        LessonState lessonState;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f23598d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f23598d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f23596b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f23598d;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (list.isEmpty()) {
                return r.f50854a;
            }
            list2 = list;
            bVar.f23595a = list2;
            bVar.f23598d = 1;
            d1 d1Var = (d1) this.f23619d;
            yz.f fVar = o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new c1(d1Var, null, i13), bVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = bVar.f23595a;
            com.bumptech.glide.e.F(obj);
            objM = obj;
            list2 = list3;
        }
        SubLearnProgress subLearnProgress = (SubLearnProgress) objM;
        if (subLearnProgress == null || (progress = subLearnProgress.getProgress()) == null) {
            progress = BuildConfig.VERSION_NAME;
        }
        LinkedHashMap linkedHashMapD = d(progress);
        ArrayList arrayList = new ArrayList(ry.n.W(list2, 10));
        for (ChineseToneLesson chineseToneLesson : list2) {
            Integer num = (Integer) linkedHashMapD.get(new Long(chineseToneLesson.getLessonId()));
            if (num == null) {
                long lessonId = chineseToneLesson.getLessonId();
                long unitId = chineseToneLesson.getUnitId();
                lessonState = ((unitId != 1 || unitId == 4) && lessonId > 0) ? LessonState.StateLocked : LessonState.StateOpen;
            } else {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    lessonState = LessonState.StateLocked;
                } else if (iIntValue != 1) {
                    lessonState = iIntValue != 2 ? LessonState.StateLocked : LessonState.StateRedo;
                } else {
                    lessonState = LessonState.StateOpen;
                }
                if (lessonState == null) {
                    long lessonId2 = chineseToneLesson.getLessonId();
                    long unitId2 = chineseToneLesson.getUnitId();
                    if (unitId2 != 1) {
                    }
                }
            }
            arrayList.add(chineseToneLesson.copy((16383 & 1) != 0 ? chineseToneLesson.lessonId : 0L, (16383 & 2) != 0 ? chineseToneLesson.lessonName : null, (16383 & 4) != 0 ? chineseToneLesson.description : null, (16383 & 8) != 0 ? chineseToneLesson.tDescription : null, (16383 & 16) != 0 ? chineseToneLesson.wordList : null, (16383 & 32) != 0 ? chineseToneLesson.sentenceList : null, (16383 & 64) != 0 ? chineseToneLesson.characterList : null, (16383 & 128) != 0 ? chineseToneLesson.repeatRegex : null, (16383 & 256) != 0 ? chineseToneLesson.lastRegex : null, (16383 & 512) != 0 ? chineseToneLesson.challengeRegex : null, (16383 & 1024) != 0 ? chineseToneLesson.levelId : 0L, (16383 & 2048) != 0 ? chineseToneLesson.unitId : 0L, (16383 & 4096) != 0 ? chineseToneLesson.sortIndex : 0, (16383 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? chineseToneLesson.normalRegex : null, (16383 & 16384) != 0 ? chineseToneLesson.state : lessonState));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xy.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f23601c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f23601c = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objM = cVar2.f23599a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f23601c;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            cVar2.f23601c = 1;
            f0 f0Var = (f0) this.f23620e;
            yz.f fVar = o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new tp.f0(f0Var, dVar, 7), cVar2);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        ChineseToneLastVisited chineseToneLastVisited = (ChineseToneLastVisited) objM;
        if (chineseToneLastVisited != null) {
            return new Long(chineseToneLastVisited.getLessonId());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Enum c(long j11, long j12, xy.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f23606e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f23606e = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objM = dVar.f23604c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar.f23606e;
        Object[] objArr = 0;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            dVar.f23602a = j11;
            dVar.f23603b = j12;
            dVar.f23606e = 1;
            d1 d1Var = (d1) this.f23619d;
            yz.f fVar = o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new c1(d1Var, objArr == true ? 1 : 0, i13), dVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j12 = dVar.f23603b;
            j11 = dVar.f23602a;
            com.bumptech.glide.e.F(objM);
        }
        SubLearnProgress subLearnProgress = (SubLearnProgress) objM;
        String progress = subLearnProgress != null ? subLearnProgress.getProgress() : null;
        if (progress == null) {
            progress = BuildConfig.VERSION_NAME;
        }
        Integer num = (Integer) d(progress).get(new Long(j11));
        if (num != null && num.intValue() == 0) {
            return LessonState.StateLocked;
        }
        if (num != null && num.intValue() == 1) {
            return LessonState.StateOpen;
        }
        if (num != null && num.intValue() == 2) {
            return LessonState.StateRedo;
        }
        if (j12 == 1 || j12 == 4) {
            return j11 <= 0 ? LessonState.StateOpen : LessonState.StateLocked;
        }
        return LessonState.StateOpen;
    }

    public final Object e(r rVar, fz.e eVar, xy.c cVar) {
        t tVar = (t) this.f23621f.getValue();
        tVar.getClass();
        yz.f fVar = o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new b0.f(tVar, rVar, eVar, (vy.d) null), cVar);
    }

    public final Object f(long j11, xy.c cVar) {
        fr.o0 o0Var = (fr.o0) this.f23617b;
        yz.f fVar = o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new h0(o0Var, j11, null, 2), cVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        b0 b0Var = b0.f48488a;
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? objM : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(long j11, LessonState lessonState, xy.c cVar) {
        f fVar;
        long jCurrentTimeMillis;
        LessonState lessonState2;
        long j12;
        Object objM;
        String progress;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f23615f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f23615f = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f23613d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f23615f;
        b0 b0Var = b0.f48488a;
        b1 b1Var = this.f23619d;
        int i13 = 1;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            lessonState2 = lessonState;
            fVar.f23612c = lessonState2;
            j12 = j11;
            fVar.f23610a = j12;
            fVar.f23611b = jCurrentTimeMillis;
            fVar.f23615f = 1;
            yz.f fVar2 = o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new c1((d1) b1Var, dVar, i13), fVar);
            if (objM != aVar) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        jCurrentTimeMillis = fVar.f23611b;
        j12 = fVar.f23610a;
        LessonState lessonState3 = fVar.f23612c;
        com.bumptech.glide.e.F(obj);
        objM = obj;
        lessonState2 = lessonState3;
        SubLearnProgress subLearnProgress = (SubLearnProgress) objM;
        String strY0 = BuildConfig.VERSION_NAME;
        if (subLearnProgress == null || (progress = subLearnProgress.getProgress()) == null) {
            progress = BuildConfig.VERSION_NAME;
        }
        LinkedHashMap linkedHashMapD = d(progress);
        Long l9 = new Long(j12);
        int i14 = a.f23594a[lessonState2.ordinal()];
        if (i14 == 1) {
            i13 = 0;
        } else if (i14 != 2) {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 2;
        }
        linkedHashMapD.put(l9, new Integer(i13));
        if (!linkedHashMapD.isEmpty()) {
            strY0 = ry.m.y0(ry.m.S0(linkedHashMapD.entrySet(), new b4.e(7)), txBUGYhC.cCNOLAauvDKRLM, null, null, new y1(12), 30);
        }
        SubLearnProgress subLearnProgress2 = new SubLearnProgress("cn_tone", strY0, jCurrentTimeMillis);
        fVar.f23612c = null;
        fVar.f23610a = j12;
        fVar.f23611b = jCurrentTimeMillis;
        fVar.f23615f = 2;
        yz.f fVar3 = o0.f50940a;
        Object objM2 = rz.e0.M(yz.e.f58387a, new sr.d(15, (d1) b1Var, subLearnProgress2, dVar), fVar);
        if (objM2 != aVar) {
            objM2 = b0Var;
        }
        return objM2 == aVar ? aVar : b0Var;
    }
}
