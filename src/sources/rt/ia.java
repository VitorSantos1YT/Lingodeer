package rt;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CoursePracticeTypeKt;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ia {
    public static final Object a(fv.c cVar, List list, fz.c cVar2, vy.d dVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new qg.e(list, cVar2, cVar, null, 2), dVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(fv.c cVar, int i11, long j11, CoursePracticeType coursePracticeType, ot.i0 i0Var, fz.c cVar2, fz.a aVar, xy.c cVar3) {
        fa faVar;
        fz.c cVar4;
        fz.a aVar2;
        int i12;
        long j12;
        ArrayList arrayList;
        fv.c cVar5;
        fz.a aVar3;
        if (cVar3 instanceof fa) {
            faVar = (fa) cVar3;
            int i13 = faVar.H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                faVar.H = i13 - Integer.MIN_VALUE;
            } else {
                faVar = new fa(cVar3);
            }
        } else {
            faVar = new fa(cVar3);
        }
        fa faVar2 = faVar;
        Object objM = faVar2.f49761t;
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        int i14 = faVar2.H;
        if (i14 != 0) {
            if (i14 == 1) {
                j12 = faVar2.f49760f;
                i12 = faVar2.f49759e;
                arrayList = faVar2.f49758d;
                fz.a aVar5 = faVar2.f49757c;
                fz.c cVar6 = faVar2.f49756b;
                cVar5 = faVar2.f49755a;
                com.bumptech.glide.e.F(objM);
                aVar2 = aVar5;
                cVar4 = cVar6;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = faVar2.f49757c;
                com.bumptech.glide.e.F(objM);
            }
            aVar3.invoke();
            return qy.b0.f48488a;
        }
        ArrayList arrayListO = ep.a.o(objM);
        if (j11 == -1 || CoursePracticeTypeKt.isTestOut(coursePracticeType) || xt.b.f56279a) {
            cVar4 = cVar2;
            aVar2 = aVar;
            i12 = i11;
            j12 = j11;
            arrayList = arrayListO;
            cVar5 = cVar;
            if (arrayList.isEmpty()) {
                faVar2.f49755a = null;
                faVar2.f49756b = null;
                faVar2.f49757c = aVar2;
                faVar2.f49758d = null;
                faVar2.f49759e = i12;
                faVar2.f49760f = j12;
                faVar2.H = 2;
                if (rz.e0.m(600L, faVar2) != aVar4) {
                    aVar3 = aVar2;
                    aVar3.invoke();
                }
            } else {
                cVar4.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
                rf.a(cVar5, arrayList, new b0.o1(cVar4, 28), aVar2);
            }
            return qy.b0.f48488a;
        }
        faVar2.f49755a = cVar;
        cVar4 = cVar2;
        faVar2.f49756b = cVar4;
        aVar2 = aVar;
        faVar2.f49757c = aVar2;
        faVar2.f49758d = arrayListO;
        faVar2.f49759e = i11;
        faVar2.f49760f = j11;
        faVar2.H = 1;
        i0Var.getClass();
        yz.f fVar = rz.o0.f50940a;
        objM = rz.e0.M(yz.e.f58387a, new ot.h0(i0Var, true, j11, i11, null), faVar2);
        if (objM != aVar4) {
            i12 = i11;
            j12 = j11;
            arrayList = arrayListO;
            cVar5 = cVar;
        }
        return aVar4;
        arrayList.addAll((List) objM);
        if (arrayList.isEmpty()) {
            faVar2.f49755a = null;
            faVar2.f49756b = null;
            faVar2.f49757c = aVar2;
            faVar2.f49758d = null;
            faVar2.f49759e = i12;
            faVar2.f49760f = j12;
            faVar2.H = 2;
            if (rz.e0.m(600L, faVar2) != aVar4) {
                aVar3 = aVar2;
                aVar3.invoke();
            }
            return aVar4;
        }
        cVar4.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
        rf.a(cVar5, arrayList, new b0.o1(cVar4, 28), aVar2);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0521  */
    /* JADX WARN: Code duplicated, block: B:104:0x053e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0556  */
    /* JADX WARN: Code duplicated, block: B:108:0x0573  */
    /* JADX WARN: Code duplicated, block: B:111:0x057f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0582  */
    /* JADX WARN: Code duplicated, block: B:114:0x0586  */
    /* JADX WARN: Code duplicated, block: B:115:0x0589  */
    /* JADX WARN: Code duplicated, block: B:117:0x058d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0590  */
    /* JADX WARN: Code duplicated, block: B:120:0x0593  */
    /* JADX WARN: Code duplicated, block: B:123:0x05de  */
    /* JADX WARN: Code duplicated, block: B:126:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:129:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:132:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:136:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0603  */
    /* JADX WARN: Code duplicated, block: B:142:0x0643  */
    /* JADX WARN: Code duplicated, block: B:145:0x0648  */
    /* JADX WARN: Code duplicated, block: B:148:0x064e  */
    /* JADX WARN: Code duplicated, block: B:151:0x068f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0694  */
    /* JADX WARN: Code duplicated, block: B:157:0x069a  */
    /* JADX WARN: Code duplicated, block: B:160:0x06db  */
    /* JADX WARN: Code duplicated, block: B:163:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0726  */
    /* JADX WARN: Code duplicated, block: B:172:0x072b  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:36:0x0215  */
    /* JADX WARN: Code duplicated, block: B:38:0x0252  */
    /* JADX WARN: Code duplicated, block: B:41:0x0285  */
    /* JADX WARN: Code duplicated, block: B:44:0x028a  */
    /* JADX WARN: Code duplicated, block: B:48:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x0415  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0433  */
    /* JADX WARN: Code duplicated, block: B:84:0x043f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0453  */
    /* JADX WARN: Code duplicated, block: B:88:0x046b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0495  */
    /* JADX WARN: Code duplicated, block: B:96:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x04ea  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x051e, code lost:
    
        if (r13.k(r0, r5) == r7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x036f, code lost:
    
        if (r4 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04cd, code lost:
    
        if (r13.k(r0, r5) == r7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x04d2, code lost:
    
        r0 = r1;
        r1 = r14;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0593, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r25, com.lingodeer.data.model.CoursePracticeType r27, int r28, int r29, int r30, ur.a r31, vt.n0 r32, wt.m r33, xy.c r34) {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ia.c(long, com.lingodeer.data.model.CoursePracticeType, int, int, int, ur.a, vt.n0, wt.m, xy.c):java.lang.Object");
    }

    public static final p d(vt.y yVar) {
        kotlin.jvm.internal.m.f(yVar, "<this>");
        if (yVar instanceof vt.x) {
            return o.f50161a;
        }
        if (yVar.equals(vt.u.f54290a)) {
            return l.f50001a;
        }
        if (yVar.equals(vt.v.f54291a)) {
            return m.f50041a;
        }
        if (yVar.equals(vt.t.f54286a)) {
            return k.f49954a;
        }
        if (yVar.equals(vt.w.f54292a)) {
            return n.f50107a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void e(fv.c cVar) {
        int size;
        kotlin.jvm.internal.m.f(cVar, "<this>");
        mc mcVar = rf.f50351c;
        mcVar.getClass();
        synchronized (mcVar.f50090h) {
            int size2 = ((LinkedHashSet) mcVar.f50092j).size();
            LinkedHashSet linkedHashSet = (LinkedHashSet) mcVar.f50092j;
            kotlin.jvm.internal.m.f(linkedHashSet, "<this>");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                jc jcVar = (jc) it.next();
                kotlin.jvm.internal.m.f(jcVar, FpIL.ffTDxnV);
                if (jcVar.f49936a == cVar) {
                    it.remove();
                }
            }
            size = size2 - ((LinkedHashSet) mcVar.f50092j).size();
        }
        if (size > 0) {
            ((v7) mcVar.f50087e).invoke("owner unsubscribed: batches=" + size);
        }
    }
}
