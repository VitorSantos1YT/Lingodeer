package g7;

import b7.f0;
import java.util.HashMap;
import java.util.Random;
import p7.b0;
import y6.m0;
import y6.n0;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.common.base.a f28818h = new com.google.common.base.a(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f28819i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f28823d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28825f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f28820a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f28821b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28822c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f28824e = o0.f57278a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28826g = -1;

    public final void a(g gVar) {
        long j11 = gVar.f28813c;
        if (j11 != -1) {
            this.f28826g = j11;
        }
        this.f28825f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final g b(int i11, b0 b0Var) {
        long j11;
        long j12;
        long j13;
        HashMap map = this.f28822c;
        g gVar = null;
        long j14 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            long j15 = gVar2.f28813c;
            b0 b0Var2 = gVar2.f28814d;
            if (j15 == -1 && i11 == gVar2.f28812b && b0Var != null) {
                long j16 = b0Var.f46331d;
                h hVar = gVar2.f28817g;
                j11 = -1;
                g gVar3 = (g) hVar.f28822c.get(hVar.f28825f);
                if (gVar3 != null) {
                    j13 = gVar3.f28813c;
                    if (j13 == -1) {
                        j13 = hVar.f28826g + 1;
                    }
                } else {
                    j13 = hVar.f28826g + 1;
                }
                if (j16 >= j13) {
                    gVar2.f28813c = j16;
                }
            } else {
                j11 = -1;
            }
            if (b0Var != null) {
                long j17 = b0Var.f46331d;
                if (b0Var2 == null) {
                    if (!b0Var.b() && j17 == gVar2.f28813c) {
                        j12 = gVar2.f28813c;
                        if (j12 != j11) {
                        }
                        gVar = gVar2;
                        j14 = j12;
                    }
                } else if (j17 == b0Var2.f46331d && b0Var.f46329b == b0Var2.f46329b && b0Var.f46330c == b0Var2.f46330c) {
                    j12 = gVar2.f28813c;
                    if (j12 != j11) {
                    }
                    gVar = gVar2;
                    j14 = j12;
                }
            } else if (i11 == gVar2.f28812b) {
                j12 = gVar2.f28813c;
                if (j12 != j11 || j12 < j14) {
                    gVar = gVar2;
                    j14 = j12;
                } else if (j12 == j14) {
                    String str = f0.f3975a;
                    if (gVar.f28814d != null && b0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str2 = (String) f28818h.get();
        g gVar4 = new g(this, str2, i11, b0Var);
        map.put(str2, gVar4);
        return gVar4;
    }

    public final synchronized String c(o0 o0Var, b0 b0Var) {
        return b(o0Var.g(b0Var.f46328a, this.f28821b).f57230c, b0Var).f28811a;
    }

    public final void d(a aVar) {
        b0 b0Var;
        o0 o0Var = aVar.f28785b;
        int i11 = aVar.f28786c;
        b0 b0Var2 = aVar.f28787d;
        boolean zP = o0Var.p();
        HashMap map = this.f28822c;
        if (zP) {
            String str = this.f28825f;
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(this.f28825f);
        this.f28825f = b(i11, b0Var2).f28811a;
        e(aVar);
        if (b0Var2 != null) {
            long j11 = b0Var2.f46331d;
            if (b0Var2.b()) {
                if (gVar2 != null && gVar2.f28813c == j11 && (b0Var = gVar2.f28814d) != null && b0Var.f46329b == b0Var2.f46329b && b0Var.f46330c == b0Var2.f46330c) {
                    return;
                }
                b(i11, new b0(j11, b0Var2.f46328a));
                this.f28823d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb), top: B:52:0x0001 }] */
    public final synchronized void e(a aVar) {
        long j11;
        this.f28823d.getClass();
        if (aVar.f28785b.p()) {
            return;
        }
        b0 b0Var = aVar.f28787d;
        if (b0Var != null) {
            long j12 = b0Var.f46331d;
            g gVar = (g) this.f28822c.get(this.f28825f);
            if (gVar != null) {
                j11 = gVar.f28813c;
                if (j11 == -1) {
                    j11 = this.f28826g + 1;
                }
            } else {
                j11 = this.f28826g + 1;
            }
            if (j12 < j11) {
                return;
            }
            g gVar2 = (g) this.f28822c.get(this.f28825f);
            if (gVar2 != null && gVar2.f28813c == -1 && gVar2.f28812b != aVar.f28786c) {
                return;
            }
        }
        g gVarB = b(aVar.f28786c, aVar.f28787d);
        if (this.f28825f == null) {
            this.f28825f = gVarB.f28811a;
        }
        b0 b0Var2 = aVar.f28787d;
        if (b0Var2 != null && b0Var2.b()) {
            b0 b0Var3 = aVar.f28787d;
            g gVarB2 = b(aVar.f28786c, new b0(b0Var3.f46328a, b0Var3.f46331d, b0Var3.f46329b));
            if (!gVarB2.f28815e) {
                gVarB2.f28815e = true;
                aVar.f28785b.g(aVar.f28787d.f46328a, this.f28821b);
                this.f28821b.d(aVar.f28787d.f46329b);
                Math.max(0L, f0.V(0L) + f0.V(this.f28821b.f57232e));
                this.f28823d.getClass();
            }
        }
        if (!gVarB.f28815e) {
            gVarB.f28815e = true;
            this.f28823d.getClass();
        }
        if (gVarB.f28811a.equals(this.f28825f) && !gVarB.f28816f) {
            gVarB.f28816f = true;
            this.f28823d.l(aVar, gVarB.f28811a);
        }
    }
}
