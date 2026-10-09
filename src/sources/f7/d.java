package f7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f26677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f26678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f26679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y6.d f26680d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26682f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z6.b f26684h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26683g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26681e = 0;

    public d(Context context, Looper looper, g0 g0Var) {
        this.f26677a = Suppliers.a(new c(context, 0));
        this.f26679c = g0Var;
        this.f26678b = new Handler(looper);
    }

    public final void a() {
        int i11 = this.f26681e;
        if (i11 == 1 || i11 == 0 || this.f26684h == null) {
            return;
        }
        z6.c.a((AudioManager) this.f26677a.get(), this.f26684h);
    }

    public final void b(int i11) {
        g0 g0Var = this.f26679c;
        if (g0Var != null) {
            b7.a0 a0Var = g0Var.H;
            a0Var.getClass();
            b7.z zVarB = b7.a0.b();
            zVarB.f4046a = a0Var.f3950a.obtainMessage(33, i11, 0);
            zVarB.b();
        }
    }

    public final void c(int i11) {
        if (this.f26681e == i11) {
            return;
        }
        this.f26681e = i11;
        float f5 = i11 == 4 ? 0.2f : 1.0f;
        if (this.f26683g == f5) {
            return;
        }
        this.f26683g = f5;
        g0 g0Var = this.f26679c;
        if (g0Var != null) {
            g0Var.H.e(34);
        }
    }

    public final int d(int i11, boolean z11) {
        int i12;
        com.android.billingclient.api.c0 c0Var;
        if (i11 == 1 || (i12 = this.f26682f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z11) {
            int i13 = this.f26681e;
            if (i13 == 1) {
                return -1;
            }
            if (i13 == 3) {
                return 0;
            }
        } else if (this.f26681e != 2) {
            z6.b bVar = this.f26684h;
            if (bVar == null) {
                if (bVar == null) {
                    c0Var = new com.android.billingclient.api.c0((char) 0, 15);
                    c0Var.f7471c = y6.d.f57180b;
                    c0Var.f7470b = i12;
                } else {
                    com.android.billingclient.api.c0 c0Var2 = new com.android.billingclient.api.c0((char) 0, 15);
                    c0Var2.f7470b = bVar.f58928a;
                    c0Var2.f7471c = bVar.f58931d;
                    c0Var = c0Var2;
                }
                y6.d dVar = this.f26680d;
                dVar.getClass();
                c0Var.f7471c = dVar;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: f7.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i14) {
                        d dVar2 = this.f26663a;
                        dVar2.getClass();
                        if (i14 == -3 || i14 == -2) {
                            if (i14 != -2) {
                                dVar2.c(4);
                                return;
                            } else {
                                dVar2.b(0);
                                dVar2.c(3);
                                return;
                            }
                        }
                        if (i14 == -1) {
                            dVar2.b(-1);
                            dVar2.a();
                            dVar2.c(1);
                        } else if (i14 != 1) {
                            defpackage.e.y(i14, "Unknown focus change type: ");
                        } else {
                            dVar2.c(2);
                            dVar2.b(1);
                        }
                    }
                };
                Handler handler = this.f26678b;
                handler.getClass();
                this.f26684h = new z6.b(c0Var.f7470b, onAudioFocusChangeListener, handler, (y6.d) c0Var.f7471c);
            }
            if (z6.c.n((AudioManager) this.f26677a.get(), this.f26684h) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
