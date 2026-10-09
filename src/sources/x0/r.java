package x0;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.e1;
import j0.e2;
import l1.t;
import l1.x1;
import pr.y;
import qy.b0;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f55620a = new r();

    public static void a(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            a5.b.l(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static void d(e0.e eVar, Context context, v0.h hVar) {
        if (context == null) {
            return;
        }
        int i11 = hVar.f53464c;
        TextClassification textClassification = hVar.f53463b;
        if (i11 < 0) {
            p pVar = new p(textClassification, 0);
            Drawable icon = textClassification.getIcon();
            e0.e.b(eVar, pVar, icon != null ? new t1.d(new e1(icon, 8), true, -1123224187) : null, new pv.c(22, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i11);
            e0.e.b(eVar, new p(remoteAction, 1), ((i11 == 0) || remoteAction.shouldShowIcon()) ? new t1.d(new q(remoteAction), true, -1261173016) : null, new u(remoteAction, 28), 6);
        }
    }

    public final void b(Drawable drawable, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(257732500);
        int i12 = (sVar.h(drawable) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.r rVarN = e2.n(z1.o.f58481a, e0.f.f24655j);
            boolean zH = sVar.h(drawable);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new s0.a(drawable, 24);
                sVar.o0(objQ);
            }
            j0.o.a(d2.h.d(rVarN, (fz.c) objQ), sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 18, drawable);
        }
    }

    public final void c(final Icon icon, l1.n nVar, final int i11) {
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2116504409);
        int i12 = (sVar.h(icon) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zF = sVar.f(icon) | sVar.f(context);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = icon.loadDrawable(context);
                sVar.o0(objQ);
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                eVar = new fz.e(this, icon, i11, i13) { // from class: x0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f55614a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f55615b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Icon f55616c;

                    {
                        this.f55614a = i13;
                        this.f55615b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f55614a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                this.f55615b.c(this.f55616c, nVar2, t.M(49));
                                break;
                            default:
                                this.f55615b.c(this.f55616c, nVar2, t.M(49));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
            } else {
                b(drawable, sVar, 48);
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i14 = 1;
            eVar = new fz.e(this, icon, i11, i14) { // from class: x0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f55614a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f55615b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Icon f55616c;

                {
                    this.f55614a = i14;
                    this.f55615b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f55614a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f55615b.c(this.f55616c, nVar2, t.M(49));
                            break;
                        default:
                            this.f55615b.c(this.f55616c, nVar2, t.M(49));
                            break;
                    }
                    return b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
