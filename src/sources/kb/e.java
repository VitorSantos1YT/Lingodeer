package kb;

import androidx.glance.session.SessionWorker;
import com.google.api.Service;
import com.google.firebase.database.DatabaseReference;
import e6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kr.k0;
import kr.p0;
import kr.r0;
import kr.w;
import kr.z0;
import kv.i0;
import l1.s1;
import mv.g0;
import mv.n;
import n5.h0;
import n5.v;
import n9.j0;
import n9.w0;
import n9.y1;
import qy.b0;
import rt.b4;
import rz.e0;
import tz.t;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f38032a = i11;
        this.f38034c = obj;
        this.f38035d = obj2;
    }

    private final Object e(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38033b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.d dVarM = x0.m(((w0) this.f38034c).f43724g);
            b1.b bVar = new b1.b((y1) this.f38035d, 11);
            this.f38033b = 1;
            if (dVarM.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0.f48488a;
    }

    private final Object j(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38033b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.i iVar = ((w0) this.f38034c).f43721d;
            b1.b bVar = new b1.b((tz.h) this.f38035d, 12);
            this.f38033b = 1;
            if (iVar.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fz.e, xy.i] */
    private final Object m(Object obj) {
        tz.h hVar = (tz.h) this.f38034c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38033b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                w wVar = new w(hVar, (fz.e) this.f38035d, (vy.d) null);
                this.f38033b = 1;
                if (e0.l(wVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            hVar.k(null);
        } catch (Throwable th2) {
            hVar.l(th2, false);
        }
        return b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r1v56, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38032a) {
            case 0:
                return new e(0, (f) this.f38034c, (t) this.f38035d, dVar);
            case 1:
                return new e(1, (kr.b0) this.f38034c, (kr.h) this.f38035d, dVar);
            case 2:
                return new e(2, (k0) this.f38034c, (p0) this.f38035d, dVar);
            case 3:
                return new e(3, (r0) this.f38034c, (z0) this.f38035d, dVar);
            case 4:
                return new e(4, (z0) this.f38034c, (String) this.f38035d, dVar);
            case 5:
                return new e(5, (uz.i) this.f38034c, (s1) this.f38035d, dVar);
            case 6:
                e eVar = new e((lb.b) this.f38035d, dVar, 6);
                eVar.f38034c = obj;
                return eVar;
            case 7:
                return new e(7, (ln.a) this.f38034c, (String) this.f38035d, dVar);
            case 8:
                return new e(8, (List) this.f38034c, (lu.b) this.f38035d, dVar);
            case 9:
                e eVar2 = new e((lv.b) this.f38035d, dVar, 9);
                eVar2.f38034c = obj;
                return eVar2;
            case 10:
                e eVar3 = new e((l) this.f38035d, dVar, 10);
                eVar3.f38034c = obj;
                return eVar3;
            case 11:
                return new e(11, (SessionWorker) this.f38034c, (l) this.f38035d, dVar);
            case 12:
                e eVar4 = new e((SessionWorker) this.f38035d, dVar, 12);
                eVar4.f38034c = obj;
                return eVar4;
            case 13:
                return new e(13, (mi.c) this.f38034c, (com.android.billingclient.api.a) this.f38035d, dVar);
            case 14:
                return new e(14, (ml.a) this.f38034c, (String) this.f38035d, dVar);
            case 15:
                return new e(15, (mr.e) this.f38034c, (ArrayList) this.f38035d, dVar);
            case 16:
                return new e(16, (b4) this.f38034c, (fz.a) this.f38035d, dVar);
            case 17:
                return new e(17, (n) this.f38034c, (i0) this.f38035d, dVar);
            case 18:
                return new e(18, (n) this.f38034c, (Collection) this.f38035d, dVar);
            case 19:
                return new e(19, (g0) this.f38034c, (mv.b0) this.f38035d, dVar);
            case 20:
                return new e(20, (fz.e) this.f38034c, (n5.c) this.f38035d, dVar);
            case 21:
                e eVar5 = new e((v) this.f38035d, dVar, 21);
                eVar5.f38034c = obj;
                return eVar5;
            case 22:
                return new e((dm.c) this.f38035d, dVar, 22);
            case 23:
                e eVar6 = new e((a9.i) this.f38035d, dVar, 23);
                eVar6.f38034c = obj;
                return eVar6;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new e(24, (uz.i) this.f38034c, (a9.i) this.f38035d, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                e eVar7 = new e((j0) this.f38035d, dVar, 25);
                eVar7.f38034c = obj;
                return eVar7;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new e(26, (w0) this.f38034c, (y1) this.f38035d, dVar);
            case 27:
                return new e(27, (w0) this.f38034c, (tz.h) this.f38035d, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new e((tz.h) this.f38034c, (fz.e) this.f38035d, dVar);
            default:
                e eVar8 = new e((DatabaseReference) this.f38035d, dVar, 29);
                eVar8.f38034c = obj;
                return eVar8;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38032a) {
            case 0:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 3:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 4:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 5:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 6:
                return ((e) create((t) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 7:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 8:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 9:
                return ((e) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 10:
                return ((e) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 11:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 12:
                return ((e) create((m6.w) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 13:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 14:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 15:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 16:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 17:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 18:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 19:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 20:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 21:
                return ((e) create((h0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 22:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 23:
                return ((e) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((e) create((y1) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 27:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((e) create((t) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:413:0x0925  */
    /* JADX WARN: Code duplicated, block: B:416:0x0939  */
    /* JADX WARN: Code duplicated, block: B:419:0x094e  */
    /* JADX WARN: Code duplicated, block: B:422:0x0970  */
    /* JADX WARN: Code duplicated, block: B:425:0x0975  */
    /* JADX WARN: Code duplicated, block: B:428:0x098a  */
    /* JADX WARN: Code duplicated, block: B:431:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:504:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ae -> B:72:0x01b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0153
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38032a = i11;
        this.f38035d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(tz.h hVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f38032a = 28;
        this.f38034c = hVar;
        this.f38035d = (xy.i) eVar;
    }
}
