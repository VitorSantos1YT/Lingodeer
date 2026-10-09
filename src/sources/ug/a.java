package ug;

import fz.e;
import fz.g;
import g2.x;
import h1.h2;
import h1.ua;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.t;
import qy.b0;
import tg.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52958b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f52959c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52960a;

    public /* synthetic */ a(int i11) {
        this.f52960a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f52960a) {
            case 0:
                y0 textStyle = (y0) obj;
                e content = (e) obj2;
                n nVar = (n) obj3;
                int iIntValue = ((Number) obj4).intValue();
                m.f(textStyle, "textStyle");
                m.f(content, "content");
                if ((iIntValue & 6) == 0) {
                    i11 = (((s) nVar).f(textStyle) ? 4 : 2) | iIntValue;
                } else {
                    i11 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i11 |= ((s) nVar).h(content) ? 32 : 16;
                }
                if ((i11 & 147) == 146) {
                    s sVar = (s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        ua.a(textStyle, content, nVar, i11 & 126);
                    }
                } else {
                    ua.a(textStyle, content, nVar, i11 & 126);
                }
                break;
            default:
                long j11 = ((x) obj).f28624a;
                e content2 = (e) obj2;
                n nVar2 = (n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                m.f(content2, "content");
                if ((iIntValue2 & 6) == 0) {
                    i12 = (((s) nVar2).e(j11) ? 4 : 2) | iIntValue2;
                } else {
                    i12 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i12 |= ((s) nVar2).h(content2) ? 32 : 16;
                }
                if ((i12 & 147) == 146) {
                    s sVar2 = (s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        t.a(h2.f30320a.a(new x(j11)), t1.e.d(-2003013541, new k(content2, 2), nVar2), nVar2, 56);
                    }
                } else {
                    t.a(h2.f30320a.a(new x(j11)), t1.e.d(-2003013541, new k(content2, 2), nVar2), nVar2, 56);
                }
                break;
        }
        return b0.f48488a;
    }
}
