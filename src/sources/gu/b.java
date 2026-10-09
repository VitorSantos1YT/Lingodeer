package gu;

import android.app.Activity;
import com.google.api.Service;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import gr.t;
import h1.e8;
import h1.h4;
import h1.k4;
import h1.p8;
import h1.u8;
import hh.y0;
import java.util.ArrayList;
import js.w;
import js.y;
import jt.s0;
import kr.a1;
import kr.r0;
import kr.z0;
import l1.b1;
import qy.b0;
import rt.eb;
import rt.ia;
import ry.m;
import ry.n;
import uz.i1;
import uz.j;
import vt.n0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f29837a = i11;
        this.f29839c = obj;
        this.f29840d = obj2;
    }

    private final Object e(Object obj) {
        Object value;
        bs.d dVar = (bs.d) this.f29840d;
        y yVar = (y) this.f29839c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29838b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            i1 i1Var = yVar.f36851c;
            do {
                value = i1Var.getValue();
            } while (!i1Var.j(value, eb.f49693a));
            fv.c cVar = yVar.f36850b;
            ArrayList arrayListH0 = m.H0(m.H0(dVar.f5118a, dVar.f5119b), dVar.f5120c);
            ArrayList arrayList = new ArrayList(n.W(arrayListH0, 10));
            int size = arrayListH0.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayListH0.get(i12);
                i12++;
                bs.c cVar2 = (bs.c) obj2;
                arrayList.add(new fv.a(0L, v10.c.o(cVar2.f5112a), v10.c.m(cVar2.f5112a)));
            }
            gs.b bVar = new gs.b(yVar, 16);
            this.f29838b = 1;
            if (ia.a(cVar, arrayList, bVar, this) == aVar) {
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

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29837a) {
            case 0:
                return new b(0, (f) this.f29839c, (DayStreakStatus) this.f29840d, dVar);
            case 1:
                b bVar = new b((f) this.f29839c, dVar);
                bVar.f29840d = obj;
                return bVar;
            case 2:
                return new b((ArrayList) this.f29839c, (String) this.f29840d, this.f29838b, dVar);
            case 3:
                return new b(3, (h0.i) this.f29839c, (b1) this.f29840d, dVar);
            case 4:
                return new b(4, (k4) this.f29839c, (h4) this.f29840d, dVar);
            case 5:
                return new b(5, (k4) this.f29839c, (h0.h) this.f29840d, dVar);
            case 6:
                b bVar2 = new b((fz.a) this.f29840d, dVar, 6);
                bVar2.f29839c = obj;
                return bVar2;
            case 7:
                b bVar3 = new b((p8) this.f29840d, dVar, 7);
                bVar3.f29839c = obj;
                return bVar3;
            case 8:
                return new b(8, (u8) this.f29839c, (z2.e) this.f29840d, dVar);
            case 9:
                b bVar4 = new b((nu.b) this.f29840d, dVar, 9);
                bVar4.f29839c = obj;
                return bVar4;
            case 10:
                return new b(10, (y0) this.f29839c, (String) this.f29840d, dVar);
            case 11:
                return new b(11, (hr.d) this.f29839c, (t) this.f29840d, dVar);
            case 12:
                b bVar5 = new b((n0) this.f29840d, dVar, 12);
                bVar5.f29839c = obj;
                return bVar5;
            case 13:
                return new b(13, (String) this.f29839c, (hs.g) this.f29840d, dVar);
            case 14:
                return new b(14, (ia.b) this.f29839c, (Activity) this.f29840d, dVar);
            case 15:
                return new b(15, (b1) this.f29839c, (e8) this.f29840d, dVar);
            case 16:
                return new b(16, (mv.n) this.f29839c, (fz.a) this.f29840d, dVar);
            case 17:
                return new b(17, (ji.b) this.f29839c, (String) this.f29840d, dVar);
            case 18:
                return new b(18, (au.n0) this.f29839c, (kotlin.jvm.internal.y) this.f29840d, dVar);
            case 19:
                return new b(19, (r0) this.f29839c, (b1) this.f29840d, dVar);
            case 20:
                return new b(20, (z0) this.f29839c, (fz.a) this.f29840d, dVar);
            case 21:
                return new b(21, (a1) this.f29839c, (b1) this.f29840d, dVar);
            case 22:
                return new b((js.g) this.f29840d, dVar, 22);
            case 23:
                return new b(23, (js.i) this.f29839c, (ChineseToneUnit) this.f29840d, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new b((w) this.f29840d, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new b(25, (y) this.f29839c, (bs.a) this.f29840d, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new b(26, (y) this.f29839c, (bs.b) this.f29840d, dVar);
            case 27:
                return new b(27, (y) this.f29839c, (bs.d) this.f29840d, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new b(28, (String) this.f29839c, (String) this.f29840d, dVar);
            default:
                return new b((s0) this.f29840d, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29837a) {
            case 0:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((b) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 3:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 4:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 5:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 6:
                return ((b) create((s2.w) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 7:
                return ((b) create((s2.w) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 8:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 9:
                return ((b) create((r5.b) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 10:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 11:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 12:
                return ((b) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 13:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 14:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 15:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 16:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 17:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 18:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 19:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 20:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 21:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 22:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 23:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 27:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((b) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:337:0x070b  */
    /* JADX WARN: Code duplicated, block: B:574:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026e, code lost:
    
        if (r0 == r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bf, code lost:
    
        if (r3 == r5) goto L79;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, vy.d dVar) {
        super(2, dVar);
        this.f29837a = 1;
        this.f29839c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29837a = i11;
        this.f29840d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, String str, int i11, vy.d dVar) {
        super(2, dVar);
        this.f29837a = 2;
        this.f29839c = arrayList;
        this.f29840d = str;
        this.f29838b = i11;
    }
}
