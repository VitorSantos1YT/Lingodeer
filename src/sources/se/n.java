package se;

import android.adservices.measurement.MeasurementManager;
import android.view.autofill.AutofillManager;
import com.facebook.login.widget.LoginButton;
import fr.p3;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.e0;
import lf.h0;
import lf.j1;
import lf.y0;
import org.json.JSONException;
import re.c0;
import re.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements lf.u, ws.a, b7.g, i.b, tx.c, x7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51612a;

    public /* synthetic */ n(int i11) {
        this.f51612a = i11;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager e(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return AutofillManager.class;
    }

    public Constructor a() {
        switch (this.f51612a) {
            case 22:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(x7.m.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(x7.m.class).getConstructor(null);
        }
    }

    @Override // b7.g
    public void accept(Object obj) {
        switch (this.f51612a) {
            case 15:
                ((ExecutorService) obj).shutdown();
                break;
            default:
                ((Throwable) obj).printStackTrace();
                break;
        }
    }

    @Override // x7.p
    public x7.m[] c() {
        return new x7.m[]{new y7.a()};
    }

    @Override // i.b
    public void f(Object obj) {
        int i11 = LoginButton.f7721d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lf.u
    public void h(boolean z11) {
        HashSet hashSetF;
        Object[] objArr = 0;
        switch (this.f51612a) {
            case 0:
                if (z11) {
                    cf.t tVar = cf.t.f6985a;
                    if (!qf.a.b(cf.t.class)) {
                        try {
                            if (ef.k.c()) {
                                cf.t.f6989e.set(true);
                                cf.t.d();
                            } else {
                                cf.r.l();
                            }
                        } catch (Throwable th2) {
                            qf.a.a(cf.t.class, th2);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (z11) {
                    df.i iVar = df.i.f23411a;
                    if (!qf.a.b(df.i.class)) {
                        try {
                            if (!df.i.f23412b) {
                                df.i iVar2 = df.i.f23411a;
                                if (!qf.a.b(iVar2)) {
                                    try {
                                        e0 e0VarK = h0.k(re.s.b(), false);
                                        if (e0VarK != null) {
                                            iVar2.a(e0VarK.f40016u);
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        qf.a.a(iVar2, th3);
                                    }
                                }
                                df.i.f23412b = (df.i.f23413c.isEmpty() && df.i.f23414d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th4) {
                            qf.a.a(df.i.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (z11) {
                    df.f fVar = df.f.f23400a;
                    if (!qf.a.b(df.f.class)) {
                        try {
                            df.f.f23401b = true;
                            df.f.f23400a.a();
                        } catch (Throwable th5) {
                            qf.a.a(df.f.class, th5);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (z11 && !qf.a.b(df.d.class)) {
                    try {
                        df.d dVar = df.d.f23395a;
                        if (!qf.a.b(dVar)) {
                            try {
                                e0 e0VarK2 = h0.k(re.s.b(), false);
                                if (e0VarK2 != null) {
                                    df.d.f23397c = e0VarK2.f40012q;
                                    break;
                                }
                            } catch (Throwable th6) {
                                qf.a.a(dVar, th6);
                            }
                        }
                        if (df.d.f23397c != null) {
                            df.d.f23396b = true;
                        }
                    } catch (Throwable th7) {
                        qf.a.a(df.d.class, th7);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                if (z11) {
                    df.b bVar = df.b.f23389a;
                    if (!qf.a.b(df.b.class)) {
                        try {
                            df.b bVar2 = df.b.f23389a;
                            if (!qf.a.b(bVar2)) {
                                try {
                                    e0 e0VarK3 = h0.k(re.s.b(), false);
                                    if (e0VarK3 != null && (hashSetF = j1.f(e0VarK3.f40013r)) != null) {
                                        df.b.f23391c = hashSetF;
                                    }
                                } catch (Throwable th8) {
                                    qf.a.a(bVar2, th8);
                                }
                            }
                            HashSet hashSet = df.b.f23391c;
                            if (hashSet != null && !hashSet.isEmpty()) {
                                df.b.f23390b = true;
                            }
                        } catch (Throwable th9) {
                            qf.a.a(df.b.class, th9);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 5:
                if (z11) {
                    df.g gVar = df.g.f23404a;
                    if (!qf.a.b(df.g.class)) {
                        try {
                            df.g.f23404a.a();
                            if (!df.g.f23406c.isEmpty()) {
                                df.g.f23405b = true;
                            }
                        } catch (Throwable th10) {
                            qf.a.a(df.g.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
                if (z11) {
                    df.h hVar = df.h.f23407a;
                    if (!qf.a.b(df.h.class)) {
                        try {
                            df.h.f23407a.a();
                            if (df.h.f23409c.isEmpty() && df.h.f23410d.isEmpty()) {
                                df.h.f23408b = false;
                            } else {
                                df.h.f23408b = true;
                            }
                        } catch (Throwable th11) {
                            qf.a.a(df.h.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (z11) {
                    try {
                        re.y yVar = new re.y(null, re.s.b().concat("/cloudbridge_settings"), null, c0.GET, new ue.e(objArr == true ? 1 : 0));
                        p3 p3Var = y0.f40132d;
                        p3.s(d0.APP_EVENTS, "ue.f", " \n\nCreating Graph Request: \n=============\n%s\n\n ", yVar);
                        yVar.d();
                    } catch (JSONException e8) {
                        p3 p3Var2 = y0.f40132d;
                        p3.s(d0.APP_EVENTS, "ue.f", " \n\nGraph Request Exception: \n=============\n%s\n\n ", cf.x.O(e8));
                        return;
                    }
                }
                break;
            case 8:
                if (z11) {
                    ze.a aVar = ze.a.f59209a;
                    if (!qf.a.b(ze.a.class)) {
                        try {
                            ze.a.f59210b = true;
                            ze.a.f59211c = new ye.a(re.s.a());
                            ze.a.f59212d = "https://www." + re.s.f49217r + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th12) {
                            qf.a.a(ze.a.class, th12);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 9:
                if (z11) {
                    af.b.a();
                }
                break;
            case 10:
                if (z11) {
                    AtomicBoolean atomicBoolean = bf.b.f4137a;
                    if (!qf.a.b(bf.b.class)) {
                        try {
                            bf.b.f4137a.set(true);
                        } catch (Throwable th13) {
                            qf.a.a(bf.b.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 11:
                if (z11) {
                    hf.b bVar3 = hf.b.f32196a;
                    if (!qf.a.b(hf.b.class)) {
                        try {
                            hf.b.f32197b = true;
                            hf.b.f32196a.b();
                        } catch (Throwable th14) {
                            qf.a.a(hf.b.class, th14);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z11) {
                    ff.g gVar2 = ff.g.f27245a;
                    if (!qf.a.b(ff.g.class)) {
                        try {
                            try {
                                re.s.d().execute(new cf.c(5));
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Throwable th15) {
                            qf.a.a(ff.g.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            default:
                if (z11) {
                    xe.b bVar4 = xe.b.f56018a;
                    if (!qf.a.b(xe.b.class)) {
                        try {
                            xe.b.f56019b = true;
                            xe.b.f56018a.a();
                        } catch (Throwable th16) {
                            qf.a.a(xe.b.class, th16);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
