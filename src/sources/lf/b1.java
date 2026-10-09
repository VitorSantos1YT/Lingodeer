package lf;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet f39970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39971b;

    public /* synthetic */ b1(int i11) {
        this.f39971b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:20:0x0027, B:22:0x002b, B:24:0x0031, B:25:0x0033, B:27:0x0037, B:29:0x0045, B:11:0x0010, B:19:0x0025, B:18:0x0022, B:15:0x001c), top: B:36:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void a(boolean z11) {
        c1 c1Var;
        TreeSet treeSetG;
        if (z11) {
            c1Var = c1.f39979a;
            treeSetG = null;
            if (!qf.a.b(c1.class)) {
                treeSetG = c1Var.g(this);
            }
            this.f39970a = treeSetG;
        } else {
            try {
                TreeSet treeSet = this.f39970a;
                if (treeSet == null || treeSet.isEmpty()) {
                    c1Var = c1.f39979a;
                    treeSetG = null;
                    if (!qf.a.b(c1.class)) {
                        try {
                            treeSetG = c1Var.g(this);
                        } catch (Throwable th2) {
                            qf.a.a(c1.class, th2);
                        }
                    }
                    this.f39970a = treeSetG;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        TreeSet treeSet2 = this.f39970a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            switch (this.f39971b) {
                case 2:
                    if (re.s.a().getApplicationInfo().targetSdkVersion >= 30) {
                        qf.a.b(c1.class);
                    }
                    break;
                default:
                    break;
            }
            throw th3;
        }
    }

    public final String b() {
        switch (this.f39971b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return "com.facebook.katana";
            case 3:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public final void c() {
    }
}
