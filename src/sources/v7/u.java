package v7;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
import b7.f0;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f53681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f53682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53684d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53687g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53690j;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53693n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53685e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53686f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53688h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f53689i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f53691k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b7.y f53692l = b7.y.f4045a;

    public u(Context context, j jVar, long j11) {
        this.f53681a = jVar;
        this.f53683c = j11;
        this.f53682b = new y(context);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long j11, long j12, long j13, long j14, boolean z11, boolean z12, i9.f fVar) {
        long j15;
        long j16;
        boolean z13;
        int i11;
        long j17;
        int i12;
        int i13;
        long j18;
        long j19;
        fVar.f34275a = -9223372036854775807L;
        fVar.f34276b = -9223372036854775807L;
        if (this.f53684d && this.f53686f == -9223372036854775807L) {
            this.f53686f = j12;
        }
        int i14 = 0;
        if (this.f53688h != j11) {
            y yVar = this.f53682b;
            j15 = -9223372036854775807L;
            long j21 = yVar.f53717n;
            if (j21 != -1) {
                yVar.f53719p = j21;
                yVar.f53720q = yVar.f53718o;
            }
            yVar.m++;
            e eVar = yVar.f53705a;
            long j22 = j11 * 1000;
            eVar.f53604a.b(j22);
            if (eVar.f53604a.a()) {
                eVar.f53606c = false;
                j16 = 0;
            } else {
                j16 = 0;
                if (eVar.f53607d != -9223372036854775807L) {
                    if (eVar.f53606c) {
                        d dVar = eVar.f53605b;
                        long j23 = dVar.f53599d;
                        if (j23 == 0 ? false : dVar.f53602g[(int) ((j23 - 1) % 15)]) {
                            eVar.f53605b.c();
                            eVar.f53605b.b(eVar.f53607d);
                        }
                    } else {
                        eVar.f53605b.c();
                        eVar.f53605b.b(eVar.f53607d);
                    }
                    eVar.f53606c = true;
                    eVar.f53605b.b(j22);
                }
            }
            if (eVar.f53606c && eVar.f53605b.a()) {
                d dVar2 = eVar.f53604a;
                eVar.f53604a = eVar.f53605b;
                eVar.f53605b = dVar2;
                eVar.f53606c = false;
            }
            eVar.f53607d = j22;
            eVar.f53608e = eVar.f53604a.a() ? 0 : eVar.f53608e + 1;
            yVar.c();
            this.f53688h = j11;
        } else {
            j15 = -9223372036854775807L;
            j16 = 0;
        }
        long jK = (long) ((j11 - j12) / ((double) this.f53691k));
        if (this.f53684d) {
            this.f53692l.getClass();
            jK -= f0.K(SystemClock.elapsedRealtime()) - j13;
        }
        long j24 = jK;
        fVar.f34275a = j24;
        if (!z11 || z12) {
            if (this.m) {
                if (this.f53689i == j15 || this.f53690j) {
                    int i15 = this.f53685e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 != 3) {
                                    throw new IllegalStateException();
                                }
                                this.f53692l.getClass();
                                long jK2 = f0.K(SystemClock.elapsedRealtime()) - this.f53687g;
                                if (this.f53684d) {
                                    long j25 = this.f53686f;
                                    if (j25 == j15 || j25 == j12 || j24 >= -30000 || jK2 <= 100000) {
                                    }
                                }
                                z13 = false;
                            } else if (j12 < j14) {
                                z13 = false;
                            }
                        }
                        z13 = true;
                    } else {
                        z13 = this.f53684d;
                    }
                } else {
                    z13 = false;
                }
                if (z13) {
                    return 0;
                }
                if (!this.f53684d || j12 == this.f53686f) {
                    return 5;
                }
                this.f53692l.getClass();
                long jNanoTime = System.nanoTime();
                y yVar2 = this.f53682b;
                long j26 = (fVar.f34275a * 1000) + jNanoTime;
                if (yVar2.f53719p == r11 || !yVar2.f53705a.f53604a.a()) {
                    i11 = 3;
                    j17 = -30000;
                    i12 = 2;
                    i13 = 1;
                } else {
                    e eVar2 = yVar2.f53705a;
                    if (eVar2.f53604a.a()) {
                        d dVar3 = eVar2.f53604a;
                        i11 = 3;
                        j17 = -30000;
                        long j27 = dVar3.f53600e;
                        j19 = j27 == j16 ? j16 : dVar3.f53601f / j27;
                    } else {
                        i11 = 3;
                        j17 = -30000;
                        j19 = j15;
                    }
                    i12 = 2;
                    i13 = 1;
                    long j28 = yVar2.f53720q + ((long) (((yVar2.m - yVar2.f53719p) * j19) / yVar2.f53713i));
                    if (Math.abs(j26 - j28) <= 20000000) {
                        j26 = j28;
                    } else {
                        yVar2.m = j16;
                        yVar2.f53719p = -1L;
                        yVar2.f53717n = -1L;
                    }
                }
                yVar2.f53717n = yVar2.m;
                yVar2.f53718o = j26;
                x xVar = yVar2.f53707c;
                if (xVar != null && yVar2.f53715k != j15) {
                    long j29 = xVar.f53701a;
                    if (j29 != j15) {
                        long j30 = yVar2.f53715k;
                        long j31 = (((j26 - j29) / j30) * j30) + j29;
                        if (j26 <= j31) {
                            j18 = j31 - j30;
                        } else {
                            j18 = j31;
                            j31 = j30 + j31;
                        }
                        if (j31 - j26 >= j26 - j18) {
                            j31 = j18;
                        }
                        j26 = j31 - yVar2.f53716l;
                    }
                }
                fVar.f34276b = j26;
                long j32 = (j26 - jNanoTime) / 1000;
                fVar.f34275a = j32;
                boolean z14 = (this.f53689i == j15 || this.f53690j) ? 0 : i13;
                if (this.f53681a.K0(j32, j12, z12, z14)) {
                    return 4;
                }
                long j33 = fVar.f34275a;
                if (j33 < j17 && !z12) {
                    i14 = i13;
                }
                if (i14 != 0) {
                    return z14 != 0 ? i11 : i12;
                }
                if (j33 > 50000) {
                    return 5;
                }
                return i13;
            }
            this.f53693n = true;
            if (this.f53681a.K0(j24, j12, z12, true)) {
                return 4;
            }
            if (!this.f53684d || fVar.f34275a >= 30000) {
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z11) {
        if (z11 && (this.f53685e == 3 || (!this.m && this.f53693n))) {
            this.f53689i = -9223372036854775807L;
            return true;
        }
        if (this.f53689i == -9223372036854775807L) {
            return false;
        }
        this.f53692l.getClass();
        if (SystemClock.elapsedRealtime() < this.f53689i) {
            return true;
        }
        this.f53689i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z11) {
        long jElapsedRealtime;
        this.f53690j = z11;
        long j11 = this.f53683c;
        if (j11 > 0) {
            this.f53692l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j11;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f53689i = jElapsedRealtime;
    }

    public final void d() {
        this.f53684d = true;
        this.f53692l.getClass();
        this.f53687g = f0.K(SystemClock.elapsedRealtime());
        y yVar = this.f53682b;
        yVar.f53708d = true;
        yVar.m = 0L;
        yVar.f53719p = -1L;
        yVar.f53717n = -1L;
        w wVar = yVar.f53706b;
        if (wVar != null) {
            DisplayManager displayManager = wVar.f53698a;
            x xVar = yVar.f53707c;
            xVar.getClass();
            xVar.f53702b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(wVar, f0.m(null));
            y.a(wVar.f53699b, displayManager.getDisplay(0));
        }
        yVar.d(false);
    }

    public final void e() {
        this.f53684d = false;
        this.f53689i = -9223372036854775807L;
        y yVar = this.f53682b;
        yVar.f53708d = false;
        w wVar = yVar.f53706b;
        if (wVar != null) {
            wVar.f53698a.unregisterDisplayListener(wVar);
            x xVar = yVar.f53707c;
            xVar.getClass();
            xVar.f53702b.sendEmptyMessage(3);
        }
        yVar.b();
    }

    public final void f(int i11) {
        if (i11 == 0) {
            this.f53685e = 1;
        } else if (i11 == 1) {
            this.f53685e = 0;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException();
            }
            this.f53685e = Math.min(this.f53685e, 2);
        }
    }

    public final void g(float f5) {
        y yVar = this.f53682b;
        yVar.f53710f = f5;
        e eVar = yVar.f53705a;
        eVar.f53604a.c();
        eVar.f53605b.c();
        eVar.f53606c = false;
        eVar.f53607d = -9223372036854775807L;
        eVar.f53608e = 0;
        yVar.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.f53693n = false;
        y yVar = this.f53682b;
        if (yVar.f53709e != surface) {
            yVar.b();
            yVar.f53709e = surface;
            yVar.d(true);
        }
        this.f53685e = Math.min(this.f53685e, 1);
    }

    public final void i(float f5) {
        b7.a.d(f5 > CropImageView.DEFAULT_ASPECT_RATIO);
        if (f5 == this.f53691k) {
            return;
        }
        this.f53691k = f5;
        y yVar = this.f53682b;
        yVar.f53713i = f5;
        yVar.m = 0L;
        yVar.f53719p = -1L;
        yVar.f53717n = -1L;
        yVar.d(false);
    }
}
