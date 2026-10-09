package o9;

import a0.c0;
import a5.f;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n9.c1;
import n9.d0;
import n9.d2;
import n9.e1;
import n9.e2;
import n9.g2;
import n9.j1;
import n9.k1;
import n9.x;
import ob.m;
import oz.r;
import qy.b0;
import ry.l;
import uz.i1;
import uz.r0;
import uz.w0;
import uz.x0;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f44735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f44736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2 f44737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f44738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f44739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f44740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lp.b f44741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f44742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f44743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1 f44744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r0 f44745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0 f44746l;
    public final /* synthetic */ b m;

    public a(b bVar, i mainContext, e1 e1Var) {
        c1 c1Var;
        d0 d0Var;
        this.m = bVar;
        kotlin.jvm.internal.m.f(mainContext, "mainContext");
        this.f44735a = mainContext;
        this.f44737c = new j1();
        c1 c1Var2 = c1.f43517e;
        d0 d0Var2 = e1Var != null ? (d0) e1Var.f43551d.invoke() : null;
        if (d0Var2 != null) {
            c1Var = new c1(d0Var2);
        } else {
            c1Var = c1.f43517e;
            kotlin.jvm.internal.m.d(c1Var, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.f44738d = c1Var;
        m mVar = new m(24);
        if (e1Var != null && (d0Var = (d0) e1Var.f43551d.invoke()) != null) {
            mVar.P(d0Var.f43534e, d0Var.f43535f);
        }
        this.f44739e = mVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f44740f = copyOnWriteArrayList;
        this.f44741g = new lp.b(true, 5);
        this.f44744j = x0.c(Boolean.FALSE);
        this.f44745k = (r0) mVar.f44828d;
        this.f44746l = x0.a(0, 64, tz.a.DROP_OLDEST);
        copyOnWriteArrayList.add(new c0(this, 23));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(a aVar, List list, int i11, int i12, boolean z11, x xVar, x xVar2, f fVar, xy.c cVar) {
        k1 k1Var;
        c1 c1Var;
        f fVar2;
        List list2;
        List list3;
        aVar.getClass();
        b0 b0Var = b0.f48488a;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i13 = k1Var.N;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                k1Var.N = i13 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(aVar, cVar);
            }
        } else {
            k1Var = new k1(aVar, cVar);
        }
        Object obj = k1Var.L;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i14 = k1Var.N;
        int i15 = 1;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj);
            if (z11 && xVar == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            aVar.f44742h = false;
            c1Var = new c1(i11, i12, list);
            kotlin.jvm.internal.m.d(aVar.f44738d, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            aVar.f44738d = c1Var;
            aVar.f44736b = fVar;
            k1Var.f43616a = aVar;
            k1Var.f43617b = list;
            k1Var.f43618c = xVar;
            k1Var.f43619d = xVar2;
            k1Var.f43620e = fVar;
            k1Var.f43621f = c1Var;
            k1Var.f43622t = i11;
            k1Var.H = i12;
            k1Var.K = z11;
            k1Var.N = 1;
            b bVar = aVar.m;
            bVar.f44749c.setValue(bVar.f44748b.b());
            if (b0Var == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = k1Var.K;
            i12 = k1Var.H;
            i11 = k1Var.f43622t;
            c1 c1Var2 = k1Var.f43621f;
            fVar = k1Var.f43620e;
            xVar2 = k1Var.f43619d;
            xVar = k1Var.f43618c;
            list = k1Var.f43617b;
            a aVar3 = k1Var.f43616a;
            com.bumptech.glide.e.F(obj);
            c1Var = c1Var2;
            aVar = aVar3;
        }
        Integer numValueOf = null;
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb2 = new StringBuilder("Presenting data (\n                            |   first item: ");
            d2 d2Var = (d2) ry.m.s0(list);
            sb2.append((d2Var == null || (list3 = d2Var.f43539b) == null) ? null : ry.m.s0(list3));
            sb2.append("\n                            |   last item: ");
            d2 d2Var2 = (d2) ry.m.A0(list);
            sb2.append((d2Var2 == null || (list2 = d2Var2.f43539b) == null) ? null : ry.m.A0(list2));
            sb2.append("\n                            |   placeholdersBefore: ");
            sb2.append(i11);
            sb2.append("\n                            |   placeholdersAfter: ");
            sb2.append(i12);
            sb2.append("\n                            |   hintReceiver: ");
            sb2.append(fVar);
            sb2.append("\n                            |   sourceLoadStates: ");
            sb2.append(xVar);
            sb2.append("\n                        ");
            String string = sb2.toString();
            if (xVar2 != null) {
                string = string + "|   mediatorLoadStates: " + xVar2 + '\n';
            }
            String message = r.h0(string + "|)");
            kotlin.jvm.internal.m.f(message, "message");
        }
        if (z11) {
            m mVar = aVar.f44739e;
            kotlin.jvm.internal.m.c(xVar);
            mVar.P(xVar, xVar2);
        }
        if (c1Var.c() == 0 && (fVar2 = aVar.f44736b) != null) {
            int i16 = c1Var.f43519b / 2;
            Integer numC0 = l.c0(((d2) ry.m.q0(c1Var.f43518a)).f43538a);
            kotlin.jvm.internal.m.c(numC0);
            int iIntValue = numC0.intValue();
            int[] iArr = ((d2) ry.m.z0(c1Var.f43518a)).f43538a;
            kotlin.jvm.internal.m.f(iArr, "<this>");
            if (iArr.length != 0) {
                int i17 = iArr[0];
                int length = iArr.length - 1;
                if (1 <= length) {
                    while (true) {
                        int i18 = iArr[i15];
                        if (i17 < i18) {
                            i17 = i18;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                    }
                }
                numValueOf = Integer.valueOf(i17);
            }
            kotlin.jvm.internal.m.c(numValueOf);
            fVar2.b(new g2(i16, i16, iIntValue, numValueOf.intValue()));
        }
        return b0Var;
    }

    public final n9.r b() {
        c1 c1Var = this.f44738d;
        int i11 = c1Var.f43520c;
        int i12 = c1Var.f43521d;
        ArrayList arrayList = c1Var.f43518a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ry.m.d0(arrayList2, ((d2) obj).f43539b);
        }
        return new n9.r(arrayList2, i11, i12);
    }
}
