package xq;

import com.google.type.bACG.scNRoQgKSYX;
import com.lingodeer.data.model.DayStreakStatus;
import gp.r;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f56186a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f56187b = new i();

    public static k b(DayStreakStatus dayStreakStatus) {
        d dVar;
        if (dayStreakStatus == null) {
            return new k(0, d.LEARN);
        }
        switch (h.f56185a[dayStreakStatus.getTodayStreakType().ordinal()]) {
            case 1:
            case 2:
                dVar = d.LEARNED;
                break;
            case 3:
                dVar = d.WARNING;
                break;
            case 4:
            case 5:
            case 6:
                dVar = d.LEARN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int dayStreak = dayStreakStatus.getDayStreak();
        return new k(dayStreak >= 0 ? dayStreak : 0, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x0031, B:56:0x0108, B:48:0x00c1, B:50:0x00c8, B:53:0x00ee, B:47:0x00b9, B:44:0x009e, B:40:0x008f), top: B:72:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (c.a.I(r15, r14, r0) == r1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(android.content.Context r14, xy.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xq.i.c(android.content.Context, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(xy.c cVar) {
        m mVar;
        i iVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i11 = mVar.f56198d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f56198d = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objU = mVar.f56196b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = mVar.f56198d;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objU);
                gu.a aVar2 = (gu.a) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(gu.a.class));
                i iVar2 = f56186a;
                r rVarA = ((gu.f) aVar2).a();
                mVar.f56195a = iVar2;
                mVar.f56198d = 1;
                objU = x0.u(rVarA, mVar);
                if (objU == aVar) {
                    return aVar;
                }
                iVar = iVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException(scNRoQgKSYX.kfKn);
                }
                iVar = mVar.f56195a;
                com.bumptech.glide.e.F(objU);
            }
            iVar.getClass();
            return b((DayStreakStatus) objU);
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            return new k(0, d.LEARN);
        }
    }
}
