package js;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import fr.o0;
import java.util.Iterator;
import java.util.List;
import rz.e0;
import uz.i1;
import uz.x0;
import vt.g0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs.b f36758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f36759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f36760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f36761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f36762e;

    public g(hs.b bVar, n0 n0Var, vt.c cVar, g0 g0Var) {
        this.f36758a = bVar;
        this.f36759b = cVar;
        this.f36760c = g0Var;
        i1 i1VarC = x0.c(a.f36735a);
        this.f36761d = i1VarC;
        this.f36762e = i1VarC;
        vy.d dVar = null;
        if (i1VarC.getValue() instanceof a) {
            e0.B(ViewModelKt.getViewModelScope(this), null, null, new gu.b(this, dVar, 22), 3);
        }
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, dVar, 17), 3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:26:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:19:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00fc -> B:12:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(js.g r30, java.util.List r31, xy.c r32) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.g.a(js.g, java.util.List, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3 A[EDGE_INSN: B:61:0x00e3->B:46:0x00e3 BREAK  A[LOOP:0: B:32:0x00ae->B:62:0x00ae, LOOP_LABEL: LOOP:0: B:32:0x00ae->B:62:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:1: B:40:0x00cd->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(g gVar, List list, xy.c cVar) {
        f fVar;
        long j11;
        Long l9;
        long jLongValue;
        nz.g gVar2;
        Object next;
        ChineseToneUnit chineseToneUnit;
        long unitId;
        long j12;
        List<ChineseToneLesson> lessons;
        Iterator<T> it;
        g0 g0Var = gVar.f36760c;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f36757f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f36757f = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(gVar, cVar);
            }
        } else {
            fVar = new f(gVar, cVar);
        }
        Object l11 = fVar.f36755d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f36757f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(l11);
            fVar.f36752a = list;
            fVar.f36757f = 1;
            l11 = new Long(((o0) ((ds.g) g0Var).f23617b).f27733a.currentEnteredChineseToneUnitId);
            if (l11 != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            list = fVar.f36752a;
            com.bumptech.glide.e.F(l11);
        } else {
            if (i12 == 2) {
                j11 = fVar.f36753b;
                list = fVar.f36752a;
                com.bumptech.glide.e.F(l11);
                l9 = (Long) l11;
                if (l9 != null) {
                    return new Long(-1L);
                }
                jLongValue = l9.longValue();
                gVar2 = new nz.g(nz.n.R(nz.n.T(ry.m.g0(list), new j9.a0(23)), new j9.a0(24)));
                loop0: while (true) {
                    if (gVar2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = gVar2.next();
                    lessons = ((ChineseToneUnit) next).getLessons();
                    if (lessons != null || !lessons.isEmpty()) {
                        it = lessons.iterator();
                        while (it.hasNext()) {
                            if (((ChineseToneLesson) it.next()).getLessonId() == jLongValue) {
                                break loop0;
                            }
                        }
                    }
                }
                chineseToneUnit = (ChineseToneUnit) next;
                if (chineseToneUnit != null) {
                    return new Long(-1L);
                }
                unitId = chineseToneUnit.getUnitId();
                fVar.f36752a = null;
                fVar.f36753b = j11;
                fVar.f36754c = unitId;
                fVar.f36757f = 3;
                if (((ds.g) g0Var).f(unitId, fVar) != aVar) {
                    j12 = unitId;
                }
                return aVar;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j12 = fVar.f36754c;
            com.bumptech.glide.e.F(l11);
        }
        return new Long(j12);
        long jLongValue2 = ((Number) l11).longValue();
        if (jLongValue2 != -1) {
            return new Long(jLongValue2);
        }
        fVar.f36752a = list;
        fVar.f36753b = jLongValue2;
        fVar.f36757f = 2;
        l11 = ((ds.g) g0Var).b(fVar);
        if (l11 != aVar) {
            j11 = jLongValue2;
            l9 = (Long) l11;
            if (l9 != null) {
                return new Long(-1L);
            }
            jLongValue = l9.longValue();
            gVar2 = new nz.g(nz.n.R(nz.n.T(ry.m.g0(list), new j9.a0(23)), new j9.a0(24)));
            loop0: while (true) {
                if (gVar2.hasNext()) {
                    next = null;
                    break;
                }
                next = gVar2.next();
                lessons = ((ChineseToneUnit) next).getLessons();
                if (lessons != null) {
                }
                it = lessons.iterator();
                while (it.hasNext()) {
                    if (((ChineseToneLesson) it.next()).getLessonId() == jLongValue) {
                        break loop0;
                        break loop0;
                    }
                }
            }
            chineseToneUnit = (ChineseToneUnit) next;
            if (chineseToneUnit != null) {
                return new Long(-1L);
            }
            unitId = chineseToneUnit.getUnitId();
            fVar.f36752a = null;
            fVar.f36753b = j11;
            fVar.f36754c = unitId;
            fVar.f36757f = 3;
            if (((ds.g) g0Var).f(unitId, fVar) != aVar) {
                j12 = unitId;
                return new Long(j12);
            }
        }
        return aVar;
    }
}
