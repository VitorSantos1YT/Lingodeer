package com.android.billingclient.api;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import o20.t0;
import retrofit2.adapter.rxjava3.HttpException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class k0 implements tx.c, q.u, qx.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7547b;

    public /* synthetic */ k0(Object obj) {
        this.f7547b = obj;
    }

    public void a(int i11) {
        b7.a.j(!this.f7546a);
        ((SparseBooleanArray) this.f7547b).append(i11, true);
    }

    @Override // tx.c
    public void accept(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        PdGrammarActivity pdGrammarActivity = (PdGrammarActivity) this.f7547b;
        ArrayList arrayList = pdGrammarActivity.S;
        arrayList.clear();
        arrayList.addAll(it);
        ih.b bVar = pdGrammarActivity.Q;
        vy.d dVar = null;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        bVar.notifyDataSetChanged();
        if (arrayList.isEmpty()) {
            ((ConstraintLayout) ((hj.j0) pdGrammarActivity.j()).f32740d.f32524c).setVisibility(0);
            ((TextView) ((hj.j0) pdGrammarActivity.j()).f32740d.f32525d).setVisibility(0);
            ((hj.j0) pdGrammarActivity.j()).f32743g.setText("0/0");
        } else {
            ((ConstraintLayout) ((hj.j0) pdGrammarActivity.j()).f32740d.f32524c).setVisibility(8);
            ((hj.j0) pdGrammarActivity.j()).f32743g.setText((((hj.j0) pdGrammarActivity.j()).f32745i.getCurrentItem() + 1) + "/" + arrayList.size());
        }
        if (this.f7546a) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity), null, null, new hh.l(pdGrammarActivity, dVar, 2), 3);
        }
    }

    public y6.n b() {
        b7.a.j(!this.f7546a);
        this.f7546a = true;
        return new y6.n((SparseBooleanArray) this.f7547b);
    }

    @Override // qx.k
    public void c(rx.b bVar) {
        ((qx.k) this.f7547b).c(bVar);
    }

    @Override // q.u
    public void d(q.l lVar, boolean z11) {
        androidx.appcompat.widget.c cVar;
        l.h0 h0Var = (l.h0) this.f7547b;
        if (this.f7546a) {
            return;
        }
        this.f7546a = true;
        ActionMenuView actionMenuView = h0Var.f38983a.f48654a.f1028a;
        if (actionMenuView != null && (cVar = actionMenuView.V) != null) {
            cVar.b();
            r.e eVar = cVar.W;
            if (eVar != null && eVar.b()) {
                eVar.f47318i.dismiss();
            }
        }
        h0Var.f38984b.onPanelClosed(108, lVar);
        this.f7546a = false;
    }

    public boolean e() {
        return this.f7546a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean f(CharSequence charSequence, int i11) {
        if (charSequence == null || i11 < 0 || charSequence.length() - i11 < 0) {
            throw new IllegalArgumentException();
        }
        x4.e eVar = (x4.e) this.f7547b;
        if (eVar == null) {
            return e();
        }
        eVar.getClass();
        char c11 = 0;
        c11 = 2;
        for (int i12 = 0; i12 < i11 && c11 == 2; i12++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i12));
            k0 k0Var = x4.f.f55778a;
            if (directionality == 0) {
                c11 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c11 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c11 = 2;
                        continue;
                }
            }
        }
        if (c11 == 0) {
            return true;
        }
        if (c11 != 1) {
            return e();
        }
        return false;
    }

    public void g() {
        this.f7546a = false;
    }

    public void h(byte b3) {
        ((c0) this.f7547b).j(String.valueOf(b3));
    }

    public void i(char c11) {
        c0 c0Var = (c0) this.f7547b;
        c0Var.c(c0Var.f7470b, 1);
        char[] cArr = (char[]) c0Var.f7471c;
        int i11 = c0Var.f7470b;
        c0Var.f7470b = i11 + 1;
        cArr[i11] = c11;
    }

    public void j(int i11) {
        ((c0) this.f7547b).j(String.valueOf(i11));
    }

    public void k(long j11) {
        ((c0) this.f7547b).j(String.valueOf(j11));
    }

    public void l(String v11) {
        kotlin.jvm.internal.m.f(v11, "v");
        ((c0) this.f7547b).j(v11);
    }

    public void m(short s3) {
        ((c0) this.f7547b).j(String.valueOf(s3));
    }

    public void n(String value) {
        byte b3;
        kotlin.jvm.internal.m.f(value, "value");
        c0 c0Var = (c0) this.f7547b;
        c0Var.c(c0Var.f7470b, value.length() + 2);
        char[] cArr = (char[]) c0Var.f7471c;
        int i11 = c0Var.f7470b;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        int i14 = i12;
        while (i14 < i13) {
            char c11 = cArr[i14];
            byte[] bArr = i00.z.f33963b;
            if (c11 < bArr.length && bArr[c11] != 0) {
                int length2 = value.length();
                for (int i15 = i14 - i12; i15 < length2; i15++) {
                    c0Var.c(i14, 2);
                    char cCharAt = value.charAt(i15);
                    byte[] bArr2 = i00.z.f33963b;
                    if (cCharAt >= bArr2.length || (b3 = bArr2[cCharAt]) == 0) {
                        int i16 = i14 + 1;
                        ((char[]) c0Var.f7471c)[i14] = cCharAt;
                        i14 = i16;
                    } else if (b3 == 1) {
                        String str = i00.z.f33962a[cCharAt];
                        kotlin.jvm.internal.m.c(str);
                        c0Var.c(i14, str.length());
                        str.getChars(0, str.length(), (char[]) c0Var.f7471c, i14);
                        int length3 = str.length() + i14;
                        c0Var.f7470b = length3;
                        i14 = length3;
                    } else {
                        char[] cArr2 = (char[]) c0Var.f7471c;
                        cArr2[i14] = '\\';
                        cArr2[i14 + 1] = (char) b3;
                        i14 += 2;
                        c0Var.f7470b = i14;
                    }
                }
                c0Var.c(i14, 1);
                ((char[]) c0Var.f7471c)[i14] = '\"';
                c0Var.f7470b = i14 + 1;
                return;
            }
            i14++;
        }
        cArr[i13] = '\"';
        c0Var.f7470b = i13 + 1;
    }

    public synchronized void o(vd.b0 b0Var, boolean z11) {
        try {
            if (this.f7546a || z11) {
                ((Handler) this.f7547b).obtainMessage(1, b0Var).sendToTarget();
            } else {
                this.f7546a = true;
                b0Var.b();
                this.f7546a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // qx.k
    public void onComplete() {
        if (this.f7546a) {
            return;
        }
        ((qx.k) this.f7547b).onComplete();
    }

    @Override // qx.k
    public void onError(Throwable th2) {
        if (!this.f7546a) {
            ((qx.k) this.f7547b).onError(th2);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th2);
        qx.p.u(assertionError);
    }

    @Override // qx.k
    public void onNext(Object obj) {
        t0 t0Var = (t0) obj;
        qx.k kVar = (qx.k) this.f7547b;
        if (t0Var.f44598a.R) {
            kVar.onNext(t0Var.f44599b);
            return;
        }
        this.f7546a = true;
        HttpException httpException = new HttpException(t0Var);
        try {
            kVar.onError(httpException);
        } catch (Throwable th2) {
            ef.e.E(th2);
            qx.p.u(new CompositeException(httpException, th2));
        }
    }

    @Override // q.u
    public boolean q(q.l lVar) {
        ((l.h0) this.f7547b).f38984b.onMenuOpened(108, lVar);
        return true;
    }

    public void s(zzji zzjiVar) {
        if (this.f7546a) {
            int i11 = zzc.f12272a;
            return;
        }
        try {
            ((Transport) this.f7547b).a(Event.g(zzjiVar));
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    public k0(int i11) {
        switch (i11) {
            case 9:
                this.f7547b = new SparseBooleanArray();
                break;
            default:
                this.f7547b = new Handler(Looper.getMainLooper(), new uv.h(1));
                break;
        }
    }

    public k0(c0 c0Var) {
        this.f7547b = c0Var;
        this.f7546a = true;
    }

    public k0(x4.e eVar, boolean z11) {
        this(eVar);
        this.f7546a = z11;
    }

    public void p() {
    }

    public void r() {
    }
}
