package b6;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.c1;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import com.tbruyelle.rxpermissions3.BuildConfig;
import h1.l2;
import h1.s0;
import h1.t7;
import i1.a0;
import i1.x;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.u;
import l1.b1;
import o3.w;
import oz.q;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f3936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f3939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3940f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3941t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k1 k1Var, e eVar, Context context, Class cls, b1 b1Var, f fVar, Bundle bundle, int i11) {
        super(1);
        this.f3938d = k1Var;
        this.f3939e = eVar;
        this.f3940f = context;
        this.f3941t = cls;
        this.f3936b = b1Var;
        this.H = fVar;
        this.K = bundle;
        this.f3937c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Long l9;
        long jLongValue;
        switch (this.f3935a) {
            case 0:
                f fVar = (f) this.H;
                u uVar = new u();
                k1 k1Var = (k1) this.f3938d;
                e eVar = (e) this.f3939e;
                k0 k0VarC = k1Var.C(eVar.a().getId());
                if (k0VarC == null) {
                    c1 c1VarJ = k1Var.J();
                    ((Context) this.f3940f).getClassLoader();
                    k0VarC = c1VarJ.a(((Class) this.f3941t).getName());
                    Bundle bundle = (Bundle) this.K;
                    k0VarC.setInitialSavedState((j0) fVar.f3944a.getValue());
                    k0VarC.setArguments(bundle);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(k1Var);
                    aVar.f1905p = true;
                    aVar.b(eVar.a(), k0VarC, String.valueOf(this.f3937c));
                    if (k1Var.P()) {
                        uVar.f38357a = true;
                        k0VarC.getLifecycle().addObserver(new b(uVar, k0VarC));
                        if (aVar.f1897g) {
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                        aVar.f1898h = false;
                        aVar.f1609r.A(aVar, true);
                    } else {
                        aVar.j();
                    }
                }
                k1Var.S(eVar.a());
                ((fz.c) this.f3936b.getValue()).invoke(k0VarC);
                return new c(k1Var, k0VarC, fVar, uVar);
            default:
                w wVar = (w) obj;
                j3.h hVar = wVar.f44704a;
                String str = hVar.f35700b;
                String str2 = hVar.f35700b;
                int length = str.length();
                String str3 = ((a0) this.f3938d).f33969c;
                if (length <= str3.length()) {
                    for (int i11 = 0; i11 < str2.length(); i11++) {
                        if (Character.isDigit(str2.charAt(i11))) {
                        }
                    }
                    ((b1) this.K).setValue(wVar);
                    String string = q.i1(str2).toString();
                    int length2 = string.length();
                    fz.c cVar = this.f3939e;
                    String str4 = BuildConfig.VERSION_NAME;
                    Long lValueOf = null;
                    b1 b1Var = this.f3936b;
                    if (length2 != 0 && string.length() >= str3.length()) {
                        i1.w wVarJ = ((x) this.f3940f).j(string, str3);
                        l2 l2Var = (l2) this.f3941t;
                        Locale locale = (Locale) this.H;
                        lz.g gVar = l2Var.f30578a;
                        if (wVarJ == null) {
                            String str5 = l2Var.f30582e;
                            String upperCase = l2Var.f30580c.f33967a.toUpperCase(Locale.ROOT);
                            m.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            str4 = String.format(str5, Arrays.copyOf(new Object[]{upperCase}, 1));
                        } else {
                            int i12 = wVarJ.f34084a;
                            long j11 = wVarJ.f34087d;
                            if (gVar.b(i12)) {
                                t7 t7Var = l2Var.f30579b;
                                if (t7Var.b(i12) && t7Var.a(j11)) {
                                    int i13 = this.f3937c;
                                    if (i13 == 1) {
                                        Long l11 = l2Var.f30587j;
                                        if (j11 >= (l11 != null ? l11.longValue() : Long.MAX_VALUE)) {
                                            str4 = l2Var.f30585h;
                                        } else if (i13 == 2) {
                                            l9 = l2Var.f30586i;
                                            if (l9 != null) {
                                                jLongValue = l9.longValue();
                                            } else {
                                                jLongValue = Long.MIN_VALUE;
                                            }
                                            if (j11 < jLongValue) {
                                                str4 = l2Var.f30585h;
                                            }
                                        }
                                    } else if (i13 == 2) {
                                        l9 = l2Var.f30586i;
                                        if (l9 != null) {
                                            jLongValue = l9.longValue();
                                        } else {
                                            jLongValue = Long.MIN_VALUE;
                                        }
                                        if (j11 < jLongValue) {
                                            str4 = l2Var.f30585h;
                                        }
                                    }
                                } else {
                                    str4 = String.format(l2Var.f30584g, Arrays.copyOf(new Object[]{l2Var.f30581d.a(Long.valueOf(j11), locale, false)}, 1));
                                }
                            } else {
                                str4 = String.format(l2Var.f30583f, Arrays.copyOf(new Object[]{s0.a(gVar.f40532a, 7), s0.a(gVar.f40533b, 7)}, 2));
                            }
                        }
                        b1Var.setValue(str4);
                        if (((CharSequence) b1Var.getValue()).length() == 0 && wVarJ != null) {
                            lValueOf = Long.valueOf(wVarJ.f34087d);
                        }
                        cVar.invoke(lValueOf);
                    } else {
                        b1Var.setValue(BuildConfig.VERSION_NAME);
                        cVar.invoke(null);
                    }
                }
                return b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0 a0Var, b1 b1Var, fz.c cVar, x xVar, l2 l2Var, int i11, Locale locale, b1 b1Var2) {
        super(1);
        this.f3938d = a0Var;
        this.f3936b = b1Var;
        this.f3939e = cVar;
        this.f3940f = xVar;
        this.f3941t = l2Var;
        this.f3937c = i11;
        this.H = locale;
        this.K = b1Var2;
    }
}
