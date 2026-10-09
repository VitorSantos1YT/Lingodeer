package pb;

import gb.a0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb.d f46744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb.i f46745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46747d;

    public k(gb.d processor, gb.i token, boolean z11, int i11) {
        kotlin.jvm.internal.m.f(processor, "processor");
        kotlin.jvm.internal.m.f(token, "token");
        this.f46744a = processor;
        this.f46745b = token;
        this.f46746c = z11;
        this.f46747d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0VarB;
        if (this.f46746c) {
            gb.d dVar = this.f46744a;
            gb.i iVar = this.f46745b;
            int i11 = this.f46747d;
            dVar.getClass();
            String str = iVar.f28935a.f44817a;
            synchronized (dVar.f28927k) {
                a0VarB = dVar.b(str);
            }
            gb.d.d(a0VarB, i11);
        } else {
            gb.d dVar2 = this.f46744a;
            gb.i iVar2 = this.f46745b;
            int i12 = this.f46747d;
            dVar2.getClass();
            String str2 = iVar2.f28935a.f44817a;
            synchronized (dVar2.f28927k) {
                try {
                    if (dVar2.f28922f.get(str2) != null) {
                        fb.l.b().getClass();
                    } else {
                        Set set = (Set) dVar2.f28924h.get(str2);
                        if (set != null && set.contains(iVar2)) {
                            gb.d.d(dVar2.b(str2), i12);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        fb.l lVarB = fb.l.b();
        fb.l.c("StopWorkRunnable");
        String str3 = this.f46745b.f28935a.f44817a;
        lVarB.getClass();
    }
}
