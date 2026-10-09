package vz;

import hh.p0;
import java.util.ArrayList;
import lt.AJC.PQgum;
import qy.b0;
import rz.d0;
import rz.e0;
import tz.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f54332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz.a f54334c;

    public d(vy.i iVar, int i11, tz.a aVar) {
        this.f54332a = iVar;
        this.f54333b = i11;
        this.f54334c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // vz.l
    public final uz.i b(vy.i iVar, int i11, tz.a aVar) {
        vy.i iVar2 = this.f54332a;
        vy.i iVarPlus = iVar.plus(iVar2);
        tz.a aVar2 = tz.a.SUSPEND;
        tz.a aVar3 = this.f54334c;
        int i12 = this.f54333b;
        if (aVar == aVar2) {
            if (i12 != -3) {
                if (i11 == -3) {
                    i11 = i12;
                } else if (i12 != -2) {
                    if (i11 == -2) {
                        i11 = i12;
                    } else {
                        i11 += i12;
                        if (i11 < 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.m.a(iVarPlus, iVar2) && i11 == i12 && aVar == aVar3) ? this : g(iVarPlus, i11, aVar);
    }

    @Override // uz.i
    public Object collect(uz.j jVar, vy.d dVar) {
        Object objL = e0.l(new rt.h(23, jVar, this, null), dVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : b0.f48488a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(tz.t tVar, vy.d dVar);

    public abstract d g(vy.i iVar, int i11, tz.a aVar);

    public uz.i h() {
        return null;
    }

    public v i(rz.b0 b0Var) {
        int i11 = this.f54333b;
        if (i11 == -3) {
            i11 = -2;
        }
        d0 d0Var = d0.ATOMIC;
        fz.e dVar = new sr.d(this, null, 17);
        tz.s sVar = new tz.s(e0.C(b0Var, this.f54332a), qx.p.b(i11, 4, this.f54334c));
        sVar.Z(d0Var, sVar, dVar);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        vy.j jVar = vy.j.f54321a;
        vy.i iVar = this.f54332a;
        if (iVar != jVar) {
            arrayList.add(PQgum.mKKnVPIbPTVzLW + iVar);
        }
        int i11 = this.f54333b;
        if (i11 != -3) {
            arrayList.add("capacity=" + i11);
        }
        tz.a aVar = tz.a.SUSPEND;
        tz.a aVar2 = this.f54334c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return p0.o(sb2, ry.m.y0(arrayList, ", ", null, null, null, 62), ']');
    }
}
